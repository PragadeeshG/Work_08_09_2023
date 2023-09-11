package com.test1;

public class ReleaseSupportInfo {
	private int releaseNum;
	private String supportTeamName;
	private String releaseDate;
	private boolean personAvailable;
	private String createdDate;
	private String modifiedDate;
	private String createdBy;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public ReleaseSupportInfo() {

	}

	public ReleaseSupportInfo(int releaseNum, String supportTeamName, String releaseDate, boolean personAvailable,
			String createdDate, String modifiedDate, String createdBy, int errorCode, String errorSeverity,
			String entityState) {
		super();
		this.releaseNum = releaseNum;
		this.supportTeamName = supportTeamName;
		this.releaseDate = releaseDate;
		this.personAvailable = personAvailable;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.createdBy = createdBy;
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

	public String getSupportTeamName() {
		return supportTeamName;
	}

	public void setSupportTeamName(String supportTeamName) {
		this.supportTeamName = supportTeamName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isPersonAvailable() {
		return personAvailable;
	}

	public void setPersonAvailable(boolean personAvailable) {
		this.personAvailable = personAvailable;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
