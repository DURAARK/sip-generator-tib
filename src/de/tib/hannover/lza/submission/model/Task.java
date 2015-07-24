package de.tib.hannover.lza.submission.model;

import java.io.Serializable;

/**
 * @author Founaboui Haman
 * (c) TIB Hannover 
 */
public class Task implements Serializable{	
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return description;
	}
	
}
