package de.tib.hannover.lza.submission.model;

import java.io.Serializable;

/**
 * @author Founaboui Haman
 * (c) TIB Hannover 
 */
public class Directory implements Serializable{	
	private static final long serialVersionUID = 1L;
	private String fileName;
	private String description;

	
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	public String toString() {
		return description;
	}
}
