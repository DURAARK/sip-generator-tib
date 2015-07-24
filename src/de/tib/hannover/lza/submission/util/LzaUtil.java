package de.tib.hannover.lza.submission.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.tib.hannover.lza.submission.MessagesCodes;

/**
 * @author Founaboui Haman (c) TIB Hannover
 */
public class LzaUtil {

	private static Logger LOG = LoggerFactory.getLogger(LzaUtil.class);

	/**
	 * List all directories in the given directory
	 * 
	 * @param rootDirectoryName
	 * @return
	 */
	public static List<File> listAllDirectoriesInDirectoryAsFile(
			String rootDirectoryName) {
		List<File> dirs = new ArrayList<File>();
		File rootDirectory = new File(rootDirectoryName);

		File listDir[] = rootDirectory.listFiles();
		for (File file : listDir) {
			if (file.isDirectory()) {
				dirs.add(file);
//				System.out.println(file.toString());
			}
		}

		return dirs;
	}
	public static List<File> listAllPPNInDirectoryAsFile(
			String rootDirectoryName) {
		List<File> dirs = new ArrayList<File>();
		File rootDirectory = new File(rootDirectoryName);

		File listDir[] = rootDirectory.listFiles();
		for (File file : listDir) {
			if (file.isDirectory()) {
				try {
					if(Character.isDigit(file.getName().charAt(0)) && Character.isDigit(file.getName().charAt(1)) && Character.isDigit(file.getName().charAt(2))){
						dirs.add(file);
						System.out.println(file.toString());
					}
					
				} catch (Exception e) {
					//LOG.error("Error", e);
					
				}
				
			}
		}

		return dirs;
	}
	public static List<File> listAllEkiInDirectoryAsFile(
			String rootDirectoryName) {
		List<File> dirs = new ArrayList<File>();
		File rootDirectory = new File(rootDirectoryName);

		File listDir[] = rootDirectory.listFiles();
		for (File file : listDir) {
			if (file.isDirectory()) {
				try {
					if(Character.isAlphabetic(file.getName().charAt(0)) && Character.isAlphabetic(file.getName().charAt(1)) && Character.isAlphabetic(file.getName().charAt(2))){
						dirs.add(file);
						System.out.println(file.toString());
						
					}
					
				} catch (Exception e) {
					//LOG.error("Error", e);
					
				}
				
			}
		}

		return dirs;
	}

	/**
	 * List all directories in the given directory
	 * 
	 * @param rootDirectoryName
	 * @return
	 */
	public static List<String> listAllDirectoriesInDirectoryAsString(
			String rootDirectoryName) {
		List<String> dirs = new ArrayList<String>();
		File rootDirectory = new File(rootDirectoryName);

		File listDir[] = rootDirectory.listFiles();
		for (File file : listDir) {
			if (file.isDirectory()) {
				dirs.add(file.getName());
			}
		}

		return dirs;
	}

	/**
	 * copies a file from input to output
	 * 
	 * @param input
	 *            - the file to be copied
	 * @param output
	 *            - the destination file
	 * @throws IOException
	 */
	public static void copyFile(String input, String output) throws IOException {
		// Open the file to be copied
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(input)));
		// And the one where to copy it to
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(output)));

		String line = null;
		while ((line = in.readLine()) != null) {

			out.write(line);
			out.newLine();
		}

		// close the streams

		in.close();
		out.close();
	}

	/**
	 * deletes a file or an empty directory
	 * 
	 * @param fileName
	 * @return
	 */
	public static boolean delete(String fileName) {
		boolean success = false;
		File file = new File(fileName);
		if (!file.exists())
			throw new IllegalArgumentException(
					"Deletion failed: no such file or directory: " + fileName);

		if (!file.canWrite())
			throw new IllegalArgumentException(
					"Deletion failed: file is write protected: " + fileName);

		// If it is a directory, make sure it is empty
		if (file.isDirectory()) {
			String[] files = file.list();
			if (files.length > 0)
				throw new IllegalArgumentException(
						"File is a directory. Deletion of non empty directory failed: "
								+ fileName);
		}

		// Attempt to delete it
		success = file.delete();

		if (!success)
			throw new IllegalArgumentException("Deletion failed");

		return success;
	}

	/**
	 * returns the ppn number from the directory name
	 * 
	 * @param directoryName
	 *            - the directory name
	 * @param ppnLength
	 *            - the PPN length, default is 10
	 * @return - the ppn number
	 * @throws Exception
	 */
	public static String getPpn(String directoryName, int ppnLength)
			throws Exception {
		if (ppnLength < 9)
			ppnLength = 9;
		if (directoryName != null && !directoryName.equals("")) {
			if (directoryName.length() < ppnLength)
				throw new Exception("The given directory name is not long enough. It must be at least 9 characters long (this is the minum length of an PPN number).");
			else
				return directoryName.substring(0, ppnLength);
		} else {
			throw new Exception("The directory name may not be null or empty.");
		}
	}

	/**
	 * returns the eki number from the directory name
	 * 
	 * @param directoryName - the directory name
	 * @param ekiLength - the ppn length, default is 13
	 * @return - the eki number
	 * @throws Exception
	 */
	public static String getEki(String directoryName, int ekiLength) throws Exception {		
		if (directoryName != null && !directoryName.equals("")) {
			if (directoryName.length() < ekiLength)
				throw new Exception("The given directory name is not long enough. It must be at least 12 characters long (this is the minum length of an EKI number).");
			else
				return directoryName;
		} else {
			throw new Exception("The directory name may not be null or empty.");
		}
	}
	
	/**
	 * prepares a directory for ie creation
	 * 
	 * @param directory
	 * @throws Exception
	 */
	public static void createFolderStructure(String directory) {
//		org.apache.log4j.helpers.LogLog.setQuietMode(false);
		File rootDirectory = new File(directory);
		String[] fileNames = rootDirectory.list();
		String result = "";
		Set<String> ppns = new HashSet<String>();

		// make a list for directory based on PPN numbers
		for (String str : fileNames) {
			String newStr;
				
				try {
					newStr = (LzaUtil.retrievePPNPart(str));
					if (!ppns.contains(newStr)) {
						//LOG.debug("File name: " + newStr);
						ppns.add(newStr);
					}
					}
				catch (Exception e) {
//					LOG.error("ERROR-createFolderStructure " + e.getMessage());
					
				}
			

		}

		// create the directories based on the previous list
		for (String str : ppns) {
			File dirPpn = new File(directory + File.separator
					+ str.toUpperCase());
			if (!dirPpn.exists())
				dirPpn.mkdir();
			File masterFile = new File(directory+  File.separator
					+ str.toUpperCase()+ File.separator +"MASTER");
			if (!masterFile.exists())
				masterFile.mkdir();
		}

		// copy the files into the created directories
		for (String str : fileNames) {
			File strFile = new File(directory + File.separator + str);
			if (!strFile.isDirectory()) {
				String input = directory + File.separator + str;
				
				
				
				String filename = null;
				int dotIndex=str.lastIndexOf('.');
				if(dotIndex>=0) { // to prevent exception if there is no dot
					filename=str.substring(0,dotIndex);
				}
				
				
				
				String output = directory + File.separator
						+ filename + File.separator +"MASTER"+ File.separator + str;
				

				try {
					copyFile(new File(input), new File(output));
					delete(input);
				} catch (IOException e) {
//					LOG.error("ERROR-createFolderStructure " + e.getMessage());
				}
			} else {
				
			}

		}
		
	}

	/**
	 * prepares a directory for ie creation
	 * 
	 * @param directory
	 * @throws Exception
	 */
	public static String prepareDirectoriesWithPpnNumber(String directory) {
//		org.apache.log4j.helpers.LogLog.setQuietMode(false);
		File rootDirectory = new File(directory);
		String[] fileNames = rootDirectory.list();
		String result = "";
		Set<String> ppns = new HashSet<String>();

		// make a list for directory based on PPN numbers
		for (String str : fileNames) {
			String newStr;

			if (starsWith8Digits(str) && str.length() >= 8) { // PPN can have only a length of 8
				try {
					newStr = (LzaUtil.retrievePPNPart(str)).substring(0, 9);
					if (!ppns.contains(newStr)) {
//						LOG.debug("File name: " + newStr);
						ppns.add(newStr);
					}
					result = MessagesCodes.IE_SUCCEEDED_DIRECTORY_PREPARATION;
				} catch (Exception e) {
//					LOG.error("ERROR-DIRECTORY-PREPARATION: " + e.getMessage());
					result = MessagesCodes.IE_FAILED_DIRECTORY_PREPARATION;
				}
			} else {
				result = MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOT8DIGITSBEGIN;
				LOG.debug(MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOT8DIGITSBEGIN);

			}

		}

		// create the directories based on the previous list
		for (String str : ppns) {
			File dirPpn = new File(directory + File.separator
					+ str.toUpperCase());
			if (!dirPpn.exists())
				dirPpn.mkdir();
			
		}

		// copy the files into the created directories
		for (String str : fileNames) {
			File strFile = new File(directory + File.separator + str);
			if (!strFile.isDirectory()) {
				String input = directory + File.separator + str;
				String output = directory + File.separator
						+ str.substring(0, 9) + File.separator + str;

				try {
					copyFile(new File(input), new File(output));
					delete(input);
				} catch (IOException e) {
//					LOG.debug(e.getMessage());
				}
			} else {
//				LOG.debug(MessagesCodes.IE_FAILED_DIRECTORY_CONTAINS_DIRECTORIES);
				return MessagesCodes.IE_FAILED_DIRECTORY_CONTAINS_DIRECTORIES;
			}

		}
		return result;
	}

	/**
	 * prepares a directory for ie creation
	 * 
	 * @param directory
	 * @throws Exception
	 */
	public static String checkIfDirectoryAreEkiNamed(String directory) {
		File rootDirectory = new File(directory);
		String result = "";
		String[] subDirectories = rootDirectory.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});

		// make a list for directory based on EKI numbers
		for (String str : subDirectories) {
//			LOG.info("Directory: " + str);
			if (isEkiIdentifier(str, "[a-zA-Z]{3}") && str.length() >= 11) {
				result = MessagesCodes.IE_SUCCEEDED_DIRECTORY_CHECK;
			} else {
				//result = MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOEKI;
//				LOG.debug(MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOEKI);
			}
		}
		return result;
	}

	/**
	 * prepares a directory for ie creation
	 * 
	 * @param directory
	 * @throws Exception
	 */
	public static String checkIfDirectoryArePpnNamed(String directory) {
		File rootDirectory = new File(directory);
		String result = "";
		String[] subDirectories = rootDirectory.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});

		// make a list for directory based on EKI numbers
		for (String str : subDirectories) {
//			LOG.info("Directory: " + str);
			if (isPpnIdentifier(str, "[0-9]{8}") && str.length() == 9) {
				result = MessagesCodes.IE_SUCCEEDED_DIRECTORY_CHECK;
			} else {
				result = MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOPPN;
//				LOG.debug(MessagesCodes.IE_FAILED_DIRECTORY_SHORT_NOPPN);
			}
		}
		return result;
	}

	
	/**
	 * Loads a properties file in the startup directory
	 * 
	 * @param propertyName
	 * @return
	 * @throws Exception
	 */
	public static Properties loadProperties(String propertyName)
			throws Exception {
		Properties props = new Properties();
		File file = new File(propertyName);
		FileInputStream fis = null;
		if (file.exists()) {
			fis = new FileInputStream(file);
			props.load(fis);
		} else {
			props = null;
		}
		return props;
	}

	public static void copyFile(File sourceFile, File destFile)
			throws IOException {
		if (!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel source = null;
		FileChannel destination = null;

		try {
			source = new FileInputStream(sourceFile).getChannel();
			destination = new FileOutputStream(destFile).getChannel();

			// previous code: destination.transferFrom(source, 0,
			// source.size());
			// to avoid infinite loops, should be:
			long count = 0;
			long size = source.size();
			while ((count += destination.transferFrom(source, count, size
					- count)) < size)
				;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (source != null) {
				source.close();
			}
			if (destination != null) {
				destination.close();
			}
		}
	}

	public static void copyFolder(File src, File dest) throws IOException {

		if (src.isDirectory()) {

			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
//				LOG.debug("Directory copied from " + src + "  to " + dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				if(!srcFile.getName().equals("dc.xml"))
					copyFolder(srcFile, destFile);
			}

		} else {
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
//			LOG.debug("File copied from " + src + " to " + dest);
		}
	}

	/**
	 * In case we have pdf files
	 * 
	 * @param name
	 * @return
	 */
	public static String retrievePPNPart(String name) throws Exception {
		String returnValue = "";
		System.out.println(name.toLowerCase());
		if ((name.toLowerCase()).endsWith(".pdf")) {
			final int lastPeriodPosition = name.lastIndexOf('.', name.length());
			if (lastPeriodPosition == -1) {
				returnValue = name;
			} else {
				returnValue = name.substring(0, lastPeriodPosition);
			}
		} else if (name.toLowerCase().endsWith(".zip")) {
			final int lastUnderscorePosition = name.lastIndexOf("__",
					name.length());
			if (lastUnderscorePosition == -1) {
				returnValue = name;
			} else {
				returnValue = name.substring(0, lastUnderscorePosition);
			}
		} else {
			throw new Exception("");
		}
		return returnValue;
	}

	public static int lastIndexOf(char ch, String str) {
		if (str.charAt(str.length() - 1) == ch) {
			return str.length() - 1;
		}
		if (str.length() <= 1) {
			return -1;
		}
		return lastIndexOf(ch, str.substring(0, str.length() - 1));
	}

	private static boolean starsWith8Digits(String str) {
		Pattern pattern = Pattern.compile("^((\\d{8}+.*))");
		Matcher matcher = pattern.matcher(str);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		System.out.println("is ppn? "
				+ isPpnIdentifier("104216121", "[0-9]{8}"));
		System.out.println("PPN: " + "1042161216".substring(0, 9));


	}

	/**
	 * checks if an identifier is an EKI (first identification number)
	 * 
	 * @param identifier
	 *            - the identifier to check
	 * @param pattern
	 *            - the pattern (does the string starts with 3 letters: ie. GBV,
	 *            ZDB or whatever)
	 * @return a boolean
	 */
	public static boolean isEkiIdentifier(String identifier, String pattern) {
		Pattern p = Pattern.compile(pattern);
		// Create a matcher with an input string
		Matcher m = p.matcher(identifier);
		boolean toReturn = false;
		while (m.find()) {
			if (m.start() == 0 && identifier.length() >= 11) {
				toReturn = true;
			}
		}
		return toReturn;

	}
	
	/**
	 * checks if an identifier is a PPN (Pica ProduktionsNummer)
	 * 
	 * @param identifier - the identifier to check
	 * @param pattern - the pattern (starts with 9 letters)
	 * @return a boolean
	 */
	public static boolean isPpnIdentifier(String identifier, String pattern) {
		Pattern p = Pattern.compile(pattern);
		// Create a matcher with an input string
		Matcher m = p.matcher(identifier);
		boolean toReturn = false;
		while (m.find()) {
			if (m.start() == 0 && identifier.length() == 9) {
				toReturn = true;
			}
		}
		return toReturn;

	}

}
