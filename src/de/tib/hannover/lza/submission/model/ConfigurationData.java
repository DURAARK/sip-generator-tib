package de.tib.hannover.lza.submission.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * @author Founaboui Haman
 * (c) TIB Hannover 
 */
@Component
public class ConfigurationData implements Serializable{
	
	private static final long serialVersionUID = -4182707427923122865L;
	
	private Boolean quietMode;
	private String checkedStatusFile;
	private String producerAgent;
	private String deploymentSystem;
	private String adapterUrl;
	private String fileName4sip;
	private String uploadFolder;
	private String ingestFolder;
	private String depositWsdlUrl;
	private String pdsUrl;
	private String producerWsdlUrl;
	private String sipStatusWsdlUrl;
	private String appVersion;

	/**
	 * @return the depositWsdlUrl
	 */
	public String getDepositWsdlUrl() {
		return depositWsdlUrl;
	}
	/**
	 * @param depositWsdlUrl the depositWsdlUrl to set
	 */
	public void setDepositWsdlUrl(String depositWsdlUrl) {
		this.depositWsdlUrl = depositWsdlUrl;
	}
	/**
	 * @return the pdsUrl
	 */
	public String getPdsUrl() {
		return pdsUrl;
	}
	/**
	 * @param pdsUrl the pdsUrl to set
	 */
	public void setPdsUrl(String pdsUrl) {
		this.pdsUrl = pdsUrl;
	}
	/**
	 * @return the producerWsdlUrl
	 */
	public String getProducerWsdlUrl() {
		return producerWsdlUrl;
	}
	/**
	 * @param producerWsdlUrl the producerWsdlUrl to set
	 */
	public void setProducerWsdlUrl(String producerWsdlUrl) {
		this.producerWsdlUrl = producerWsdlUrl;
	}
	/**
	 * @return the sipStatusWsdlUrl
	 */
	public String getSipStatusWsdlUrl() {
		return sipStatusWsdlUrl;
	}
	/**
	 * @param sipStatusWsdlUrl the sipStatusWsdlUrl to set
	 */
	public void setSipStatusWsdlUrl(String sipStatusWsdlUrl) {
		this.sipStatusWsdlUrl = sipStatusWsdlUrl;
	}
	
	/**
	 * @return the quietMode
	 */
	public Boolean getQuietMode() {
		return quietMode;
	}
	/**
	 * @param quietMode the quietMode to set
	 */
	public void setQuietMode(Boolean quietMode) {
		this.quietMode = quietMode;
	}
	/**
	 * @return the checkedStatusFile
	 */
	public String getCheckedStatusFile() {
		return checkedStatusFile;
	}
	/**
	 * @param checkedStatusFile the checkedStatusFile to set
	 */
	public void setCheckedStatusFile(String checkedStatusFile) {
		this.checkedStatusFile = checkedStatusFile;
	}
	/**
	 * @return the producerAgent
	 */
	public String getProducerAgent() {
		return producerAgent;
	}
	/**
	 * @param producerAgent the producerAgent to set
	 */
	public void setProducerAgent(String producerAgent) {
		this.producerAgent = producerAgent;
	}
	/**
	 * @return the adapterUrl
	 */
	public String getAdapterUrl() {
		return adapterUrl;
	}
	/**
	 * @param adapterUrl the adapterUrl to set
	 */
	public void setAdapterUrl(String adapterUrl) {
		this.adapterUrl = adapterUrl;
	}
	/**
	 * @return the fileName4sip
	 */
	public String getFileName4sip() {
		return fileName4sip;
	}
	/**
	 * @param fileName4sip the fileName4sip to set
	 */
	public void setFileName4sip(String fileName4sip) {
		this.fileName4sip = fileName4sip;
	}
	/**
	 * @return the uploadFolder
	 */
	public String getUploadFolder() {
		return uploadFolder;
	}
	/**
	 * @param uploadFolder the uploadFolder to set
	 */
	public void setUploadFolder(String uploadFolder) {
		this.uploadFolder = uploadFolder;
	}
	/**
	 * @return the ingestFolder
	 */
	public String getIngestFolder() {
		return ingestFolder;
	}
	/**
	 * @param ingestFolder the ingestFolder to set
	 */
	public void setIngestFolder(String ingestFolder) {
		this.ingestFolder = ingestFolder;
	}
	
	/**
	 * @return the deploymentSystem
	 */
	public String getDeploymentSystem() {
		return deploymentSystem;
	}
	/**
	 * @param deploymentSystem the deploymentSystem to set
	 */
	public void setDeploymentSystem(String deploymentSystem) {
		this.deploymentSystem = deploymentSystem;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	
}
