package com.test1;

public class ReleaseManagement {
	private int releaseNum;
	private String team;
	private int affectedApplications;
	private String applicationName;
	private String manager;
	private int impactedCountries;
	private String countryNames;
	private boolean controlsMet;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public ReleaseManagement() {

	}

	public ReleaseManagement(int releaseNum, String team, int affectedApplications, String applicationName,
			String manager, int impactedCountries, String countryNames, boolean controlsMet, int errorCode,
			String errorSeverity, String entityState) {
		super();
		this.releaseNum = releaseNum;
		this.team = team;
		this.affectedApplications = affectedApplications;
		this.applicationName = applicationName;
		this.manager = manager;
		this.impactedCountries = impactedCountries;
		this.countryNames = countryNames;
		this.controlsMet = controlsMet;
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAffectedApplications() {
		return affectedApplications;
	}

	public void setAffectedApplications(int affectedApplications) {
		this.affectedApplications = affectedApplications;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getImpactedCountries() {
		return impactedCountries;
	}

	public void setImpactedCountries(int impactedCountries) {
		this.impactedCountries = impactedCountries;
	}

	public String getCountryNames() {
		return countryNames;
	}

	public void setCountryNames(String countryNames) {
		this.countryNames = countryNames;
	}

	public boolean isControlsMet() {
		return controlsMet;
	}

	public void setControlsMet(boolean controlsMet) {
		this.controlsMet = controlsMet;
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
