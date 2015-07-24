package de.tib.hannover.lza.submission;

import gov.loc.mets.FileType;
import gov.loc.mets.MetsDocument;
import gov.loc.mets.MetsType.FileSec.FileGrp;

import java.io.File;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang3.StringUtils;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.exlibris.core.sdk.consts.Enum;
import com.exlibris.core.sdk.formatting.DublinCore;
import com.exlibris.core.sdk.utils.FileUtil;
import com.exlibris.digitool.common.dnx.DnxDocument;
import com.exlibris.digitool.common.dnx.DnxDocumentFactory;
import com.exlibris.digitool.common.dnx.DnxDocumentHelper;
import com.exlibris.dps.sdk.deposit.IEParser;
import com.exlibris.dps.sdk.deposit.IEParserFactory;

import de.tib.hannover.lza.submission.util.LzaUtil;

public class IeCreation {
	// to set quietMode

	String preIngestModifiedMaster = "PRE_INGEST_MODIFIED_MASTER";
	String preservationMaster = "PRESERVATION_MASTER";
	String derivativeCopy = "DERIVATIVE_COPY";

	private static Logger LOG = LoggerFactory.getLogger(IeCreation.class);

	/**
	 * creates SIP directory with streams and content directory for data with
	 * EKI-Number
	 *
	 * @param uploadFolder
	 *            - The directory that contains the original full text (These
	 *            are the files that had been uploaded)
	 * @param ingestFolder
	 *            - The directory where the created SIPs are
	 * @return
	 */
	@SuppressWarnings("static-access")
	public String ekiCreate(String uploadFolder, String ingestFolder, String url) {
		long start = new Date().getTime();
		ActivityManager acManager = new ActivityManager();

		String result = "";
		boolean modifiedMaster;
		boolean derivative_Copy;

		LOG.debug("Creation of ie, please wait...");

		// prepare the directory
		String prepareResult = LzaUtil.checkIfDirectoryAreEkiNamed(uploadFolder);

		if (prepareResult.equals(MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOEKI)) {
			result = prepareResult;
		} else {

			List<File> dirList = LzaUtil.listAllDirectoriesInDirectoryAsFile(uploadFolder);
			if (dirList == null || dirList.isEmpty()) {
				LOG.debug("The directory does not contain directories.");
				result = MessagesCodes.IE_NO_DIRECTORIES_IN_DIRECTORY;
			} else {

				// ppn or eki
				for (File ekiDirectory : dirList) {
					modifiedMaster = false;
					derivative_Copy = false;
					String filePathBuildm = null;
					String filePathE57 = null;
					String filePathifcm = null;
					generated_buildm.Buildm buildm = null;

					XmlObject ifcmXml = null;

					boolean buidmFileExsistingerror = false;

					XmlObject e57Xml = null;
					XmlObject buidmXml = null;

					try {

						/* the ie1 path: ei1.xml will be saved here */
						String iefullFileName = ingestFolder + File.separator + ekiDirectory.getName() + File.separator + "content" + File.separator + "ie1.xml";
						/*
						 * the streams path: the pdfs or images will be saved
						 * here
						 */
						String streamsFolder = ingestFolder + File.separator + ekiDirectory.getName() + File.separator + "content" + File.separator + "streams";

						// if(LOG.isInfoEnabled())
						// LOG.info("The streams folder: " + streamsFolder);

						File streamsDir = new File(streamsFolder);
						if (!streamsDir.exists())
							streamsDir.mkdirs();

						// create parser
						IEParser ie = null;

						try {
							ie = IEParserFactory.create();
						} catch (Exception e) {
							// LOG.error("ERROR", e);
						}

						// files we are depositing

						// files in the original ppn folder
						String originalStreamsFolder = ekiDirectory.getAbsolutePath();
						// if(LOG.isInfoEnabled())
						// LOG.info("Original streams folder: " +
						// originalStreamsFolder);

						File[] streamsFiles = new File(originalStreamsFolder).listFiles();

						boolean masterMissing = true;

						// save them to the streams directory
						for (File streamsFile : streamsFiles) {

							// if(LOG.isInfoEnabled())
							// LOG.info("The streams file name: "
							// +streamsFile.getAbsolutePath());

							if (streamsFile.getName().equals("MODIFIED_MASTER") || streamsFile.getName().equals("modified_master")) {

								LzaUtil.copyFolder(streamsFile, new File(streamsFolder + File.separator + preIngestModifiedMaster));
								modifiedMaster = true;

							}
							if (streamsFile.getName().equals("DERIVATIVE_COPY") || streamsFile.getName().equals("derivative_copy")) {
								LzaUtil.copyFolder(streamsFile, new File(streamsFolder + File.separator + streamsFile.getName()));
								derivative_Copy = true;

							}
							if (streamsFile.getName().equals("MASTER") || streamsFile.getName().equals("master")) {
								LzaUtil.copyFolder(streamsFile, new File(streamsFolder + File.separator + streamsFile.getName()));
								String files[] = streamsFile.list();
								if (files.length == 0) {
									System.out.println("Master file is missing at " + streamsFile);
									System.exit(0);
								}

							}
							if (streamsFile.getName().equals("SOURCEMD") || streamsFile.getName().equals("sourcemd")) {
								List<File> sourceMdListe;
								sourceMdListe = (listFilesForFolder(streamsFile));
								// System.out.println(sourceMdListe.size());
								for (int i = 0; i < sourceMdListe.size(); i++) {
									File file = sourceMdListe.get(i);
									// System.out.println(file.getName());
									if (file.getName().contains("buildm")) {
										filePathBuildm = file.getAbsolutePath().toString();
										try {

											File buildmfile = new File(file.getAbsolutePath().toString());
//											try {
												buidmXml = XmlObject.Factory.parse(buildmfile);
//											} catch (Exception e) {
////												buidmFileExsistingerror = true;
//
//											}

											// System.out.println(file.getAbsolutePath().toString());
											JAXBContext jaxbContext = JAXBContext.newInstance(generated_buildm.Buildm.class);
											Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
											buildm = (generated_buildm.Buildm) jaxbUnmarshaller.unmarshal(buildmfile);
											// buidmFileExsisting =true;
											ie.setIeSourceMd(gov.loc.mets.MdSecType.MdWrap.MDTYPE.OTHER, buidmXml);
											DnxDocument modsDnx1 = ie.getIeDnx();
											ie.setIeDnx(modsDnx1);

											//

										} catch (JAXBException e) {
											buidmFileExsistingerror = true;
											e.printStackTrace();
										}
									}
									if (file.getName().contains("e57m")) {
										filePathE57 = file.getAbsolutePath().toString();
										// try {
										//
										File e57mfile = new File(file.getAbsolutePath().toString());
										 e57Xml = XmlObject.Factory.parse(e57mfile);
										// e57FileExsisting = true;
										ie.setIeSourceMd(gov.loc.mets.MdSecType.MdWrap.MDTYPE.OTHER, e57Xml);

										DnxDocument modsDnx21 = ie.getIeDnx();
										ie.setIeDnx(modsDnx21);

									}
									if (file.getName().contains("ifcm")) {
										filePathifcm = file.getAbsolutePath().toString();
										// try {
										//
										File ifcmfile = new File(file.getAbsolutePath().toString());

										ifcmXml = XmlObject.Factory.parse(ifcmfile);
										// ifmFileExsisting = true;
										ie.setIeSourceMd(gov.loc.mets.MdSecType.MdWrap.MDTYPE.OTHER, ifcmXml);
										//
									}

								}
								// System.out.println(filePathBuildm);
								// System.out.println(filePathE57);
								// System.out.println(filePathifcm);

							}

							// LzaUtil.copyFolder(streamsFile, new
							// File(streamsFolder + File.separator +
							// streamsFile.getName()));

						}

						// i changed it from the above to the bellow to take
						// into consideration the files in sub directories.
						@SuppressWarnings("unchecked")
						Collection<File> files = FileUtils.listFiles(streamsDir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);

						// add ie dc
						if (ie != null) {
							DublinCore dc = ie.getDublinCoreParser();
							// retrieve the identifier eki number
							String ekiNumber = null;
							ekiNumber = LzaUtil.getEki(ekiDirectory.getName(), 6);
							// if(LOG.isDebugEnabled())
							// LOG.debug("The PPN or EKI number: " + ekiNumber);

							// List<String> identifierList =
							// buildm.getDigitalObject().get(0).getIdentifier();
							// String identifier =
							// identifierList.get(0).toString();
							//

							String identifier;
							String creator;
							String date;
							String isPartOf;
							String hasPart;
							String description;
							String title;
							if (buildm == null) {
								if (buidmFileExsistingerror == true) {
									identifier = "not available because the buildm.xml is not possible to parse against xsd";
									creator = "not available because the buildm.xml is not possible to parse against xsd";
									title = "not available because the buildm.xml is not possible to parse against xsd";
									date = "not available because the buildm.xml is not possible to parse against xsd";
									isPartOf = "not available because the buildm.xml is not possible to parse against xsd";
									hasPart = "not available because the buildm.xml is not possible to parse against xsd";
									description = "not available because the buildm.xml is not possible to parse against xsd";
									buidmFileExsistingerror = false;
								} else {
									identifier = "not available because the buildm.xml does not exist";
									creator = "not available because the buildm.xml does not exist";
									title = "not available because the buildm.xml does not exist";
									date = "not available because the buildm.xml does not exist";
									isPartOf = "not available because the buildm.xml does not exist";
									hasPart = "not available because the buildm.xml does not exist";
									description = "not available because the buildm.xml does not exist";
								}

							} else {
								identifier = buildm.getDigitalObject().getIdentifier();
								creator = buildm.getDigitalObject().getCreator();
								title = buildm.getDigitalObject().getName();
								date = buildm.getDigitalObject().getDateCreated().toString();
								isPartOf = buildm.getDigitalObject().getIsPartOf();
								hasPart = buildm.getDigitalObject().getHasPart();
								description = buildm.getDigitalObject().getDescription();
							}

							// String creator = "test";
							// String title = "test";
							// String date = "test";
							// String isPartOf = "test";
							// String hasPart = "test";
							// String description = "test";

							if (identifier != null && StringUtils.isNotEmpty(identifier))
								dc.addElement("dc:Identifier", identifier);

							if (creator != null && StringUtils.isNotEmpty(creator))
								dc.addElement("dc:creator", creator);

							if (title != null && StringUtils.isNotEmpty(title))
								dc.addElement("dc:title", title);

							if (date != null && StringUtils.isNotEmpty(date))
								dc.addElement("dc:date", date);

							if (isPartOf != null && StringUtils.isNotEmpty(isPartOf))
								dc.addElement("dcterms:isPartOf", isPartOf);

							if (hasPart != null && StringUtils.isNotEmpty(hasPart))
								dc.addElement("dcterms:hasPart", hasPart);

							if (description != null && StringUtils.isNotEmpty(description))
								dc.addElement("dc:description", description);

							WriteXMLFile xml = new WriteXMLFile();
							xml.main(ingestFolder + "/" + ekiNumber + "/dc.xml", identifier, creator, title, date, isPartOf, hasPart, description);

							ie.setIEDublinCore(dc);
							List<FileGrp> fGrpList = new ArrayList<FileGrp>();

							// add fileGrp

							FileGrp fGrpMaster = ie.addNewFileGrp(Enum.UsageType.VIEW, preservationMaster);

							FileGrp fGrpDerivativeCopy = null;
							FileGrp fGrpPreModifiedMaster = null;

							// add dnx - A new DNX is constructed and added on
							// the file group level
							DnxDocument dnxDocumentfGrpMaster = ie.getFileGrpDnx(fGrpMaster.getID());
							DnxDocumentHelper documentHelperfGrpMaster = new DnxDocumentHelper(dnxDocumentfGrpMaster);
							documentHelperfGrpMaster.getGeneralRepCharacteristics().setRevisionNumber("1");
							documentHelperfGrpMaster.getGeneralRepCharacteristics().setLabel(title);
							ie.setFileGrpDnx(documentHelperfGrpMaster.getDocument(), fGrpMaster.getID());
							fGrpList.add(fGrpMaster);

							if (modifiedMaster == true) {
								fGrpPreModifiedMaster = ie.addNewFileGrp(Enum.UsageType.VIEW, preIngestModifiedMaster);

								DnxDocument dnxDocumentfGrpPreModifiedMaster = ie.getFileGrpDnx(fGrpPreModifiedMaster.getID());
								DnxDocumentHelper documentHelperfGrpPreModifiedMaster = new DnxDocumentHelper(dnxDocumentfGrpPreModifiedMaster);
								documentHelperfGrpPreModifiedMaster.getGeneralRepCharacteristics().setRevisionNumber("1");
								documentHelperfGrpPreModifiedMaster.getGeneralRepCharacteristics().setLabel(title);

								ie.setFileGrpDnx(documentHelperfGrpPreModifiedMaster.getDocument(), fGrpPreModifiedMaster.getID());
								fGrpList.add(fGrpPreModifiedMaster);

							}

							ArrayList<File> myFileList = new ArrayList<File>(files);
							int nummberofReps = 0;
							for (int i = 0; i < myFileList.size(); i++) {
								File file = myFileList.get(i);

								if (file.toString().contains("REP_")) {
									nummberofReps++;

								}

							}
							// System.out.println("Number of Reps"+nummberofReps);
							if (nummberofReps == 0) {
								if (derivative_Copy == true) {

									fGrpDerivativeCopy = ie.addNewFileGrp(Enum.UsageType.VIEW, derivativeCopy);
									DnxDocument dnxDocumentfGrpDerivativeCopy = ie.getFileGrpDnx(fGrpDerivativeCopy.getID());
									DnxDocumentHelper documentHelperfGrpDerivativeCopy = new DnxDocumentHelper(dnxDocumentfGrpDerivativeCopy);
									documentHelperfGrpDerivativeCopy.getGeneralRepCharacteristics().setRevisionNumber("1");
									documentHelperfGrpDerivativeCopy.getGeneralRepCharacteristics().setLabel(title);

									ie.setFileGrpDnx(documentHelperfGrpDerivativeCopy.getDocument(), fGrpDerivativeCopy.getID());
									fGrpList.add(fGrpDerivativeCopy);

								}

							}

							FileNameMap fileNameMap = URLConnection.getFileNameMap();

							// Making Collection to ArrayList for Sorting
							// Reasons

							Collections.sort(myFileList);

							for (int i = 0; i < myFileList.size(); i++) {

								File file = myFileList.get(i);
								if (file.length() > 0 && file.isFile()) { // &&
																			// file.isFile(),
																			// this
																			// part
																			// was
																			// inserting
																			// by
																			// me
									// add file and dnx metadata on file
									String mimeType = "application/pdf";
									String canolicalPath = file.getCanonicalPath();

									FileType fileType = null;
									if (canolicalPath.contains(File.separator + "MASTER") | canolicalPath.contains(File.separator + "master")) {

										// file://Relative Path:
										// fileType = ie.addNewFile(fGrpMaster,
										// mimeType,"file:/"+canolicalPath.replace(streamsFolder,
										// ""), "test file ");

										// file://canolicalPath
										// fileType = ie.addNewFile(fGrpMaster,
										// mimeType,"file:/"+canolicalPath,
										// "test file ");

										// Relative Path:
										// fileType = ie.addNewFile(fGrpMaster,
										// mimeType,canolicalPath.replace(streamsFolder,
										// ""), "test file ");

										// canolicalPath:
										// fileType = ie.addNewFile(fGrpMaster,
										// mimeType,canolicalPath,
										// "test file ");
										// System.out.println(canolicalPath);

										// ParamterPath TIB internal
										ArrayList<String> data = new ArrayList<String>(Arrays.asList((file.getAbsolutePath().split("output"))));
										String tibPath = data.get(data.size() - 1);
										String sep = File.separator;
										String tibPath1 = acManager.outputFolderPath + tibPath;
										// String tibPath1 = tibPath;
										// System.out.println(tibPath1);
										// System.out.println(tibPath1);
										fileType = ie.addNewFile(fGrpMaster, mimeType, tibPath1, "test file ");

									}
									if (canolicalPath.contains("_MASTER") | canolicalPath.contains("_master")) {

									

										// ParamterPath TIB internal
										ArrayList<String> data = new ArrayList<String>(Arrays.asList((file.getAbsolutePath().split("output"))));
										String tibPath = data.get(data.size() - 1);
										String sep = File.separator;
										String tibPath1 = acManager.outputFolderPath + tibPath;
										// String tibPath1 = tibPath;
										// System.out.println(tibPath1);
										fileType = ie.addNewFile(fGrpPreModifiedMaster, mimeType, tibPath1, "test file ");

									}
									if (nummberofReps > 0) {
										nummberofReps--;
										if (derivative_Copy == true) {

											fGrpDerivativeCopy = ie.addNewFileGrp(Enum.UsageType.VIEW, derivativeCopy);
											DnxDocument dnxDocumentfGrpDerivativeCopy = ie.getFileGrpDnx(fGrpDerivativeCopy.getID());
											DnxDocumentHelper documentHelperfGrpDerivativeCopy = new DnxDocumentHelper(dnxDocumentfGrpDerivativeCopy);
											documentHelperfGrpDerivativeCopy.getGeneralRepCharacteristics().setRevisionNumber("1");
											documentHelperfGrpDerivativeCopy.getGeneralRepCharacteristics().setLabel(title);

											ie.setFileGrpDnx(documentHelperfGrpDerivativeCopy.getDocument(), fGrpDerivativeCopy.getID());
											fGrpList.add(fGrpDerivativeCopy);

										}

										if (canolicalPath.contains("_COPY") | canolicalPath.contains("_copy")) {

										

											// ParamterPath TIB internal
											ArrayList<String> data = new ArrayList<String>(Arrays.asList((file.getAbsolutePath().split("output"))));
											String tibPath = data.get(data.size() - 1);
											String sep = File.separator;
											// System.out.println("outputFolderPath"+
											// acManager.outputFolderPath);
											String tibPath1 = tibPath;
											// System.out.println(tibPath1);
											fileType = ie.addNewFile(fGrpDerivativeCopy, mimeType, tibPath1, "test file ");

										}
									} else {
										if (canolicalPath.contains("_COPY") | canolicalPath.contains("_copy")) {

											

											// ParamterPath TIB internal
											ArrayList<String> data = new ArrayList<String>(Arrays.asList((file.getAbsolutePath().split("output"))));
											String tibPath = data.get(data.size() - 1);
											String sep = File.separator;
											String tibPath1 = acManager.outputFolderPath + tibPath;
											// String tibPath1 = tibPath;
											// System.out.println(tibPath1);
											fileType = ie.addNewFile(fGrpDerivativeCopy, mimeType, tibPath1, "test file ");
										}

									}

									// if(LOG.isDebugEnabled())
									// LOG.debug("The mimetype: " + mimeType);

									// add dnx - A new DNX is constructed and
									// added on the file
									// level
									DnxDocument dnx = ie.getFileDnx(fileType.getID());
									DnxDocumentHelper fileDocumentHelper = new DnxDocumentHelper(dnx);
									fileDocumentHelper.getGeneralFileCharacteristics().setNote(title + " : " + mimeType);
									fileDocumentHelper.getGeneralFileCharacteristics().setLabel(title);
									// if(LOG.isDebugEnabled())
									// LOG.debug("getAbsolutePath after add: " +
									// file.getAbsolutePath());

									// Relative Path:
									// fileDocumentHelper.getGeneralFileCharacteristics().setFileOriginalPath(file.getCanonicalPath().replace(streamsFolder,
									// ""));

									// canolicalPath :
									// fileDocumentHelper.getGeneralFileCharacteristics().setFileOriginalPath(file.getAbsolutePath());

									// ParamterPath TIB internal
									ArrayList<String> data = new ArrayList<String>(Arrays.asList((file.getAbsolutePath().split("output"))));
									String tibPath = data.get(data.size() - 1);
									String sep = File.separator;
									String tibPath1 = acManager.outputFolderPath + tibPath;
									// String tibPath1 = tibPath;
									fileDocumentHelper.getGeneralFileCharacteristics().setFileOriginalPath(tibPath1);

									ie.setFileDnx(fileDocumentHelper.getDocument(), fileType.getID());

								}
							}

							// CMS mit dem anderen dh geht es steht dann aber an
							// der falschen stelle...
							DnxDocument ieDnx = DnxDocumentFactory.getInstance().createDnxDocument();
							DnxDocumentHelper ieDnxHelper = new DnxDocumentHelper(ieDnx);
							// update DNX

							// com.exlibris.digitool.common.dnx.DnxDocumentHelper.CMS
							// cms = ieDnxHelper.new CMS();
							//
							// cms.setSystem("TIB");
							// cms.setRecordId(ekiNumber);
							// cms.setMId("");
							// ieDnxHelper.setCMS(cms);
							// ie.setIeDnx(ieDnxHelper.getDocument()); //insert
							// newly created DNX to IE

							DnxDocument ieDnx1 = DnxDocumentFactory.getInstance().createDnxDocument();
							DnxDocumentHelper ieDnxHelper1 = new DnxDocumentHelper(ieDnx1);
							// update DNX

							

							DnxDocument modsDnx2 = ie.getIeDnx();

							ie.setIeDnx(modsDnx2);

							
							// if(LOG.isInfoEnabled())
							// LOG.info("The streams folder, before checkum: " +
							// streamsFolder);

							// file://Relative Path:
							// ie.generateChecksum(streamsFolder,
							// Enum.FixityType.MD5.toString());

							// file://canolicalPath
							// ie.generateChecksum("",
							// Enum.FixityType.MD5.toString());

							// Relative Path:/
							// System.out.println("streamfolder:"+streamsFolder.toString());

							// ie.generateChecksum(streamsFolder,
							// Enum.FixityType.MD5.toString());

							// System.out.println(streamsFolder);

							// ie.generateChecksum("",
							// Enum.FixityType.MD5.toString());

							// default Structural Map
							// for (FileGrp fgrp : fGrpList) {
							// ie.generateStructMap(fgrp, null, fgrp.getID());
							// }
							// example for adding a logical Struct Map.
							MetsDocument metsDoc = MetsDocument.Factory.parse(ie.toXML());
							// Mets mets = metsDoc.getMets();
							// for (FileGrp fgrp : fGrpList) {
							// StructMapType sm = mets.addNewStructMap();
							// sm.setID(fgrp.getID() + "-" + 2);
							// sm.setTYPE("PHYSICAL");
							// DivType div1 = sm.addNewDiv();
							// div1.setLABEL("ActivityManager Struct Map");
							// DivType div2 = div1.addNewDiv();
							// div2.setLABEL("Table of Contents");
							// DivType div3 = div2.addNewDiv();
							// div3.setLABEL("Chapter 1");
							// FileType file[] = fgrp.getFileArray();
							// for (int i = 0; i < file.length; i++) {
							// DivType div = div3.addNewDiv(); // new div
							// structure
							// div.setLABEL("Page " + i);
							// div.setTYPE("FILE");
							// div.addNewFptr().setFILEID(file[i].getID());
							// }
							// }
							// insert IE created in content directory
							File ieXML = new File(iefullFileName);
							XmlOptions xmlOptions = new XmlOptions();
							xmlOptions.setSavePrettyPrint();
							FileUtil.writeFile(ieXML, metsDoc.xmlText(xmlOptions));

							result = MessagesCodes.IE_SUCCESS_IECREATION;
						}

					} catch (Exception e) {
						// LOG.error("ERROR", e);
						result = MessagesCodes.IE_ERROR_IECREATION;
					}
				}
			}
		}
		long runningTime = new Date().getTime() - start;
		System.out.println("-------------------------------------------------------");
		System.out.println("Done in " + runningTime / 1000 + " sec's");
		System.out.println("-------------------------------------------------------");

		return result;

	}

	public ArrayList<File> listFilesForFolder(final File folder) {
		ArrayList<File> sourceMdListe = new ArrayList<File>();
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				System.out.println(fileEntry.getName());
				sourceMdListe.add(fileEntry);
			}
		}
		return sourceMdListe;
	}

}
