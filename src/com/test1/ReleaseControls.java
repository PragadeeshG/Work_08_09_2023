package com.test1;

public class ReleaseControls {
	private int releaseNum;
	private int controlsCount;
	private String controlName;
	private boolean evidenceAttached;
	private String evidenceName;
	private String controlExecutedDate;
	private int errorCode;
	private String errorSeverity;
	private String entityState;
	private String createdDate;

	public ReleaseControls() {

	}

	public ReleaseControls(int releaseNum, int controlsCount, String controlName, boolean evidenceAttached,
			String evidenceName, String controlExecutedDate, int errorCode, String errorSeverity, String entityState,
			String createdDate) {
		super();
		this.releaseNum = releaseNum;
		this.controlsCount = controlsCount;
		this.controlName = controlName;
		this.evidenceAttached = evidenceAttached;
		this.evidenceName = evidenceName;
		this.controlExecutedDate = controlExecutedDate;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.entityState = entityState;
		this.createdDate = createdDate;
	}

	public int getReleaseNum() {
		return releaseNum;
	}

	public void setReleaseNum(int releaseNum) {
		this.releaseNum = releaseNum;
	}

	public int getControlsCount() {
		return controlsCount;
	}

	public void setControlsCount(int controlsCount) {
		this.controlsCount = controlsCount;
	}

	public String getControlName() {
		return controlName;
	}

	public void setControlName(String controlName) {
		this.controlName = controlName;
	}

	public boolean isEvidenceAttached() {
		return evidenceAttached;
	}

	public void setEvidenceAttached(boolean evidenceAttached) {
		this.evidenceAttached = evidenceAttached;
	}

	public String getEvidenceName() {
		return evidenceName;
	}

	public void setEvidenceName(String evidenceName) {
		this.evidenceName = evidenceName;
	}

	public String getControlExecutedDate() {
		return controlExecutedDate;
	}

	public void setControlExecutedDate(String controlExecutedDate) {
		this.controlExecutedDate = controlExecutedDate;
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

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
