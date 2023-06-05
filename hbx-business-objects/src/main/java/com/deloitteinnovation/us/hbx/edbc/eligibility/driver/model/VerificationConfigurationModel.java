package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.util.ArrayList;
import java.util.List;

public class VerificationConfigurationModel {
	private String name;
	private String propertyName;
	private String failReason;
	private String isActive;
	private List<String> validProgram = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	

	public List<String> getValidProgram() {
		return validProgram;
	}

	public void setValidProgram(List<String> validProgram) {
		this.validProgram = validProgram;
	}

}
