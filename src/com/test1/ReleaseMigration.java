package com.test1;

public class ReleaseMigration {
	private int releaseNum;
	private String releasePlatform;
	private String targetPlatform;
	private String targetApplication;
	private String releaseApplication;
	private String sourceContact;
	private String targetContact;
	private String createdDate;
	private String modifiedDate;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public ReleaseMigration() {

	}

	public ReleaseMigration(int releaseNum, String releasePlatform, String targetPlatform, String releaseApplication,
			String sourceContact, String targetContact, String createdDate, String modifiedDate, int errorCode,
			String errorSeverity, String entityState) {
		super();
		this.releaseNum = releaseNum;
		this.releasePlatform = releasePlatform;
		this.targetPlatform = targetPlatform;
		this.targetApplication = targetApplication;
		this.releaseApplication = releaseApplication;
		this.sourceContact = sourceContact;
		this.targetContact = targetContact;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.entityState = entityState;
	}

	public int getReleaseNum() {
		return releaseNum;
	}

	public void setReleaseNum(int releaseNum) {
		this.releaseNum = releaseNum;
	}

	public String getReleasePlatform() {
		return releasePlatform;
	}

	public void setReleasePlatform(String releasePlatform) {
		this.releasePlatform = releasePlatform;
	}

	public String getTargetPlatform() {
		return targetPlatform;
	}

	public void setTargetPlatform(String targetPlatform) {
		this.targetPlatform = targetPlatform;
	}
	public String getTargetApplication() {
		return targetApplication;
	}
	public void setTargetApplication() {
		this.targetApplication = targetApplication;
	}

	public String getReleaseApplication() {
		return releaseApplication;
	}

	public void setReleaseApplication(String releaseApplication) {
		this.releaseApplication = releaseApplication;
	}

	public String getSourceContact() {
		return sourceContact;
	}

	public void setSourceContact(String sourceContact) {
		this.sourceContact = sourceContact;
	}

	public String getTargetContact() {
		return targetContact;
	}

	public void setTargetContact(String targetContact) {
		this.targetContact = targetContact;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
