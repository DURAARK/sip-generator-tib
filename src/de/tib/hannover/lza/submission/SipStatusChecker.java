package de.tib.hannover.lza.submission;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.WebServiceTemplate;

import de.tib.hannover.lza.submission.model.ConfigurationData;

/**
 * This class is to test the status of an ingested SIP
 * @author Founaboui Haman
 * (c) TIB Hannover 
 */
public class SipStatusChecker {
	
	@Autowired
	private WebServiceTemplate sipwsServiceTemplate;
	
	@Autowired
	private ConfigurationData configurationData;
	
	private static Logger LOG = LoggerFactory.getLogger(SipStatusChecker.class);

	// to set quietMode
	private String isQuietMode;
	
	
//	/**
//	 * @return the fileName4sip
//	 */
//	public String getFileName4sip() {
//		return fileName4sip;
//	}
//
//
//	/**
//	 * @param fileName4sip the fileName4sip to set
//	 */
//	public void setFileName4sip(String fileName4sip) {
//		this.fileName4sip = fileName4sip;
//	}
//
//	private String fileName4sip;

	
	/**
	 * @return the isQuietMode
	 */
	public String getIsQuietMode() {
		return isQuietMode;
	}

	/**
	 * @param isQuietMode the isQuietMode to set
	 */
	public void setIsQuietMode(String isQuietMode) {
		this.isQuietMode = isQuietMode;
	}
	
	/**
	 * Return true if all characters are numeric.	
	 * @param s  operate on this String	
	 * @return true if all characters are numeric
	 */
	static public boolean isDigits(String s) {
		if (null == s || s.equals(""))
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
