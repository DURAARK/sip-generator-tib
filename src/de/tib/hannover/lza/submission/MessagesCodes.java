package de.tib.hannover.lza.submission;

/**
 * @author Founaboui Haman
 * (c) TIB Hannover 
 */
public interface MessagesCodes {
	
	final static String SUCCESS_DEPOSIT = "SUCCESS_DEPOSIT";
	final static String SUCCESS_FULL = "SUCCESS_FULL";
	
	final static String SUCCESS_DEPOSITTEST = "SUCCESS_DEPOSITTEST";
	final static String SUCCESS_SIPTEST = "SUCCESS_SIPTEST";
	static final String SUCCESS_FULL_TEST = "SUCCESS_FULL_TEST";
	
	final static String WARN_INVALID_JOBNAME = "WARN_INVALID_JOBNAME";
	
	
	
	final static String ERROR_FULL = "ERROR_FULL";
	final static String ERROR_EXCEPTION = "ERROR_EXCEPTION";
	static final String BEAN_EXPCEPTION = "BEAN_EXPCEPTION";
	static final String GENERAL_EXPCEPTION = "ERROR: GENERAL_EXPCEPTION";
	static final String ERROR_SIPSTATUS_TEST = "ERROR_SIPSTATUS_TEST";
	static final String SUCCESS_WITH_STATUSTEST_ERROR = "SUCCESS_WITH_STATUSTEST_ERROR";
	
	static final String CONNECTION_FAIL = "ERROR: CONNECTION_FAIL";
	static final String SUCCESS_UPLOAD = "SUCCESS_UPLOAD";
	static final String ERROR_SCP = "ERROR_SCP";
	static final String SUCCESS_ZIP = "SUCCESS_ZIP";
	static final String ERROR_ZIP = "ERROR_ZIP";	
	
	final static String ERROR_IEFULL = "ERROR_IEFULL";
	static final String IE_ERROR_IECREATION = "IE_ERROR_IECREATION";	
	final static String IE_SUCCESS_IECREATION = "IE_SUCCESS_IECREATION";
	static final String IE_SUCCEEDED_DIRECTORY_PREPARATION = "Succeeded directory preparation";
	static final String IE_FAILED_DIRECTORY_PREPARATION = "Directory preparation failed due to unknown error";
	static final String IE_FAILED_DIRECTORY_SHORT_NOT8DIGITSBEGIN = "string is too short and does not begin with 8 digits";
	static final String IE_NO_DIRECTORIES_IN_DIRECTORY = "The directory does not contain directories";
	static final String IE_FAILED_DIRECTORY_CONTAINS_DIRECTORIES = "The given directory contains other directory. Perharps you already prepared the directory. Next you can do a deposit.";
	static final CharSequence DEPOSIT_NOT_SUCCEEDED = "ERROR: Deposit was not successful";
	static final String IE_FAILED_DIRECTORY_SHORT_NOEKI = "The directory name is too short or too long and is not a valid EKI number";
	static final String IE_SUCCEEDED_DIRECTORY_CHECK = "Succeeded directory check";
	static final String IE_FAILED_DIRECTORY_SHORT_NOPPN = "The directory name is too short or too long and is not a valid PPN number";
		
}
