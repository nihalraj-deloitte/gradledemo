//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:25 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



public class VerifyAnnualHouseholdIncomeModel {
	 private LocalDateTime CreateDate;

	public LocalDateTime getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(LocalDateTime value) {
		CreateDate = value;
	}

	private String CreateUserId = "";

	public String getCreateUserId() {
		return CreateUserId;
	}

	public void setCreateUserId(String value) {
		CreateUserId = value;
	}

	private double HouseholdIncomeAmount;

	public double getHouseholdIncomeAmount() {
		return HouseholdIncomeAmount;
	}

	public void setHouseholdIncomeAmount(double value) {
		HouseholdIncomeAmount = value;
	}

	private String IsErrorMessage = "";

	public String getIsErrorMessage() {
		return IsErrorMessage;
	}

	public void setIsErrorMessage(String value) {
		IsErrorMessage = value;
	}

	private String IsIRSResponse = "";

	public String getIsIRSResponse() {
		return IsIRSResponse;
	}

	public void setIsIRSResponse(String value) {
		IsIRSResponse = value;
	}

	private String KeyIdentifier = "";

	public String getKeyIdentifier() {
		return KeyIdentifier;
	}

	public void setKeyIdentifier(String value) {
		KeyIdentifier = value;
	}

	private String KeyValue = "";

	public String getKeyValue() {
		return KeyValue;
	}

	public void setKeyValue(String value) {
		KeyValue = value;
	}

	private String SourceSystem = "";

	public String getSourceSystem() {
		return SourceSystem;
	}

	public void setSourceSystem(String value) {
		SourceSystem = value;
	}

	 private LocalDateTime UpdateDate;

	public LocalDateTime getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(LocalDateTime value) {
		UpdateDate = value;
	}

	private String UpdateUserId = "";

	public String getUpdateUserId() {
		return UpdateUserId;
	}

	public void setUpdateUserId(String value) {
		UpdateUserId = value;
	}

	private int VerifyAnnualHouseholdIncomeId;

	public int getVerifyAnnualHouseholdIncomeId() {
		return VerifyAnnualHouseholdIncomeId;
	}

	public void setVerifyAnnualHouseholdIncomeId(int value) {
		VerifyAnnualHouseholdIncomeId = value;
	}

}
