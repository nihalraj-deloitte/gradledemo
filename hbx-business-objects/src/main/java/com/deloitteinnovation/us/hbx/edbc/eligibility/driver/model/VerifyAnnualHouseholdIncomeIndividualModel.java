//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:25 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

public class VerifyAnnualHouseholdIncomeIndividualModel {
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

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
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

	private Long VerifyAnnualHouseholdIncomeIndividualId;

	public Long getVerifyAnnualHouseholdIncomeIndividualId() {
		return VerifyAnnualHouseholdIncomeIndividualId;
	}

	public void setVerifyAnnualHouseholdIncomeIndividualId(Long value) {
		VerifyAnnualHouseholdIncomeIndividualId = value;
	}

}
