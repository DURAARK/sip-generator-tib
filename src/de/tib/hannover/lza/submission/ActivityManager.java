package de.tib.hannover.lza.submission;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import de.tib.hannover.lza.submission.model.ConfigurationData;
import de.tib.hannover.lza.submission.util.LzaUtil;

/**
 * @author Founaboui Haman (c) TIB Hannover
 */
@Component
@Scope("prototype")
public class ActivityManager {

	private static Logger LOG = LoggerFactory.getLogger(ActivityManager.class);

	@Autowired
	private IeCreation ieCreation;

	
	@Autowired
	private SipStatusChecker sipStatusChecker;
	
	public static String outputFolderPath;

	@Autowired
	ConfigurationData configurationData;

	/**
	 * Makes a job defined through the given string. Valid value are:
	 * <b>fullflow</b>: A full flow is done<br/>
	 * <b>iecreation</b>: Only IE (intellectual entities) will be created<br/>
	 * <b>deposit</b>: Only a deposit is done. This supposed that the IE were
	 * created before.<br/>
	 * <b>statuscheck</b>: Only a status check is done.<br/>
	 * 
	 * @param taskName
	 *            - one the above string
	 */
	public String make(String taskName, String userName, String password,
			String institution, String producerAgent, Integer materialFlowId,
			String depositSetId, String fulltextFolder, String ingestFolder,
			String submissionType, Boolean isTest) {
//		 org.apache.log4j.helpers.LogLog.setQuietMode(false);
		StringBuffer returnValue = new StringBuffer("");
		try {
			if (checkJobValidity(taskName)) {
//				The Next Line(s) is not necessary for SIP Generator
				if (taskName.equals("fullflow")) {
				
				} else if (taskName.equals("iecreation")) {
					returnValue.append(doIeCreationTask(fulltextFolder, ingestFolder, submissionType));
//					The Next Line(s) is not necessary for SIP Generator
				} else if (taskName.equals("deposit")) {
//					The Next Line(s) is not necessary for SIP Generator
				} else if (taskName.equals("statuscheck")) {
					
				}

			} else {
//				LOG.warn("The job name + [" + taskName + "] is not valid.");
				returnValue.append(MessagesCodes.WARN_INVALID_JOBNAME + "\n");
			}
		} catch (BeansException e) {
//			LOG.error("ERROR", e);
			returnValue.append(MessagesCodes.BEAN_EXPCEPTION + "\n");
			return returnValue.toString();
		} catch (Exception e) {
//			LOG.error("ERROR", e);
			returnValue.append(MessagesCodes.GENERAL_EXPCEPTION + "\n");
			return returnValue.toString();
		}
		//if (LOG.isDebugEnabled())
		//	LOG.debug("The value return: [" + returnValue + "]");
		System.out.println(returnValue);
		System.out.println("-------------------------------------------------------");
		return returnValue.toString();
		
	}

	/**
	 * @param fulltextFolder
	 * @param ingestFolder
	 * @param returnValue
	 * @param sdf
	 */
	private String doIeCreationTask(String fulltextFolder, String ingestFolder, String submissionType) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		StringBuffer returnValue = new StringBuffer();
//		LOG.debug("Starting IE creation job, please wait...");
//		LOG.info("Erstellung der IEs gestartet. Datum " + sdf.format(new Date()));
		String ieCreationResult = null;
		
		File folder = new File(fulltextFolder);
		File[] listOfFiles = folder.listFiles();

				
		
		if(submissionType.equals("eki")) {
			if(listOfFiles.length > 0){
		    	LzaUtil.createFolderStructure(fulltextFolder);
//		    	LOG.info(listOfFiles.length + " Files were pressed into folder structure");
		}
			IeCreation ieCreation = new IeCreation();
			ieCreationResult = ieCreation.ekiCreate(fulltextFolder, ingestFolder, "http://myapp.develop.lza.tib.eu/rosettaproxy/tibSru.xml?operation=searchRetrieve&recordPacking=xml&recordSchema=pica&institution=tib&version=1.1&maximumRecords=1&startRecord=1&query=identifier=");
		} 
//		LOG.info("IE creation result: " + ieCreationResult);
		if (null != ieCreationResult && ieCreationResult.equals(MessagesCodes.IE_SUCCESS_IECREATION)) {
			LOG.debug("The creation of ie was successful!");
			returnValue.append(MessagesCodes.IE_SUCCESS_IECREATION + "\n");
			LOG.info("Erstellung der IEs erfolgreich beendet. Datum " + sdf.format(new Date()));
			return returnValue.toString();
		} else if (null != ieCreationResult && ieCreationResult.equals(MessagesCodes.IE_FAILED_DIRECTORY_PREPARATION)) {
//			LOG.error(MessagesCodes.IE_FAILED_DIRECTORY_PREPARATION);
			returnValue.append(MessagesCodes.IE_FAILED_DIRECTORY_PREPARATION + "\n");
			LOG.info("Submission beendet wegen Fehler bei Erstellung der IEs. Datum " + sdf.format(new Date()));
			return returnValue.toString();
		} else if (null != ieCreationResult && ieCreationResult.equals(MessagesCodes.IE_FAILED_DIRECTORY_CONTAINS_DIRECTORIES)) {
//			LOG.error(MessagesCodes.IE_FAILED_DIRECTORY_CONTAINS_DIRECTORIES);
			returnValue.append(MessagesCodes.IE_FAILED_DIRECTORY_CONTAINS_DIRECTORIES + "\n");
			LOG.info("Submission beendet wegen Fehler bei Erstellung der IEs. Datum " + sdf.format(new Date()));
			return returnValue.toString();
		} else if (null != ieCreationResult && ieCreationResult.equals(MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOT8DIGITSBEGIN)) {
//			LOG.error(MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOT8DIGITSBEGIN);
			returnValue.append(MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOT8DIGITSBEGIN	+ "\n");
			LOG.info("Submission beendet wegen Fehler bei Erstellung der IEs. Datum " + sdf.format(new Date()));
			return returnValue.toString();
		} else if (null != ieCreationResult && ieCreationResult.equals(MessagesCodes.IE_NO_DIRECTORIES_IN_DIRECTORY)) {
//			LOG.error(MessagesCodes.IE_NO_DIRECTORIES_IN_DIRECTORY);
			returnValue.append(MessagesCodes.IE_NO_DIRECTORIES_IN_DIRECTORY + "\n");
			LOG.info("Submission beendet wegen Fehler bei Erstellung der IEs. Datum " + sdf.format(new Date()));
			return returnValue.toString();
		} else {
			LOG.error("There was something wrong! The programm will exit.");
			returnValue.append(MessagesCodes.IE_ERROR_IECREATION + "\n");
			LOG.info("Submission beendet wegen Fehler bei Erstellung der IEs. Datum " + sdf.format(new Date()));
			return returnValue.toString();
		}
	}

	/**
	 * checks if the given string is a valid one
	 * 
	 * @param whichJob
	 *            - valid value are all, iecreation, deposit, statuscheck
	 * @return true if is valid otherwise false
	 * @throws Exception
	 */
	private static Boolean checkJobValidity(String whichJob) throws Exception {
		Boolean isOK = Boolean.FALSE;
		if (whichJob != null && !whichJob.equals("")) {
			if (whichJob.equals("fullflow") || whichJob.equals("iecreation")
					|| whichJob.equals("deposit")
					|| whichJob.equals("statuscheck"))
				isOK = Boolean.TRUE;
		} else {
			throw new Exception("Sie müssen ein der folgenden Werte eingeben: all, iecreation, deposit oder statuscheck");
		}

		return isOK;
	}

	public static void main(String[] args) {
		
		String fulltextFolder = args[0];
		if(fulltextFolder.contains("-h"))
		{
			System.out.println(" ----------------->Assistance<------------------");
			
			System.out.println("!!!!!!Launch the program as follows !!!!!!:");
			System.out.println(" ");
			System.out.println("Java SPACE -jar SPACE SIP_Generator SPACE path of input directory SPACE path of output directory SPACE Rosetta subDirectoryName");
			System.out.println(" ");
			System.out.println("Example:");
			System.out.println(" ");
			System.out.println("JAVA -jar SIP _Generator.jar D:\\input D:\\output /exlibris1/transfer/tib_extern_deposit_duraark");
			return;
		}
		
		String ingest= args[1];
		outputFolderPath  = args[2];
					
		boolean error = false;
		if (!new File(ingest).exists())
		{
			error = true;
		   try {
			throw new FileNotFoundException("Error!!!! Please Check the input directory!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		if (!new File(fulltextFolder).exists())
		{
			error = true;
        		   try {
        			throw new FileNotFoundException("Error!!!! Please Check the ouput directory!");
        		} catch (FileNotFoundException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
		}
		
		if(error == true)
		{
			System.out.println(" ----------------->Assistance<------------------");
			System.out.println("!!!!!!Launch the program as follows !!!!!!:");
			System.out.println(" ");
			System.out.println("Java SPACE -jar SPACE SIP_Generator SPACE path of input directory SPACE path of output directory SPACE Rosetta subDirectoryName");
			System.out.println(" ");
			System.out.println("Example:");
			System.out.println(" ");
			System.out.println("JAVA -jar SIP _Generator.jar D:\\input D:\\output /exlibris1/transfer/tib_extern_deposit_duraark");
			
		}
		else{
			ActivityManager ac = new ActivityManager();
			String sep = File.separator;
//			 taskName,  userName,  password,	 institution,  producerAgent,  materialFlowId depositSetId,  fulltextFolder,  ingestFolder,	 submissionType,  isTest) {
//			The "eki" parameter is used because the method uses a function from a previous project which provides all functionality which are needed
			ac.make("iecreation", "test", "1", "TIB", "35714707", 641084, "1", fulltextFolder, ingest,"eki", false);
		
		}
			
		}

	
}
