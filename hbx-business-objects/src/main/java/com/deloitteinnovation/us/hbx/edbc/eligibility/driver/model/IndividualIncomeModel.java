//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:51 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

public class IndividualIncomeModel {
	private double AnnualAPTCIncome;

	public double getAnnualAPTCIncome() {
		return AnnualAPTCIncome;
	}

	public void setAnnualAPTCIncome(double value) {
		AnnualAPTCIncome = value;
	}

	private Long CaseNumber;

	public Long getCaseNumber() {
		return CaseNumber;
	}

	public void setCaseNumber(Long value) {
		CaseNumber = value;
	}

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

	private String CurrentIncomeCompatibilityResult = "";

	public String getCurrentIncomeCompatibilityResult() {
		return CurrentIncomeCompatibilityResult;
	}

	public void setCurrentIncomeCompatibilityResult(String value) {
		CurrentIncomeCompatibilityResult = value;
	}

	private String CurrentIncomeReferenceValue = "";

	public String getCurrentIncomeReferenceValue() {
		return CurrentIncomeReferenceValue;
	}

	public void setCurrentIncomeReferenceValue(String value) {
		CurrentIncomeReferenceValue = value;
	}

	private int EdgTraceId;

	public int getEdgTraceId() {
		return EdgTraceId;
	}

	public void setEdgTraceId(int value) {
		EdgTraceId = value;
	}

	private String FederalCompatibilityResult = "";

	public String getFederalCompatibilityResult() {
		return FederalCompatibilityResult;
	}

	public void setFederalCompatibilityResult(String value) {
		FederalCompatibilityResult = value;
	}

	private String FederalHubStatus = "";

	public String getFederalHubStatus() {
		return FederalHubStatus;
	}

	public void setFederalHubStatus(String value) {
		FederalHubStatus = value;
	}

	private String FedReferenceValue = "";

	public String getFedReferenceValue() {
		return FedReferenceValue;
	}

	public void setFedReferenceValue(String value) {
		FedReferenceValue = value;
	}

	private double GrossEarnedIncome;

	public double getGrossEarnedIncome() {
		return GrossEarnedIncome;
	}

	public void setGrossEarnedIncome(double value) {
		GrossEarnedIncome = value;
	}

	private double GrossEmploymentIncome;

	public double getGrossEmploymentIncome() {
		return GrossEmploymentIncome;
	}

	public void setGrossEmploymentIncome(double value) {
		GrossEmploymentIncome = value;
	}

	private double GrossOtherIncome;

	public double getGrossOtherIncome() {
		return GrossOtherIncome;
	}

	public void setGrossOtherIncome(double value) {
		GrossOtherIncome = value;
	}

	private double GrossSelfEmploymentIncome;

	public double getGrossSelfEmploymentIncome() {
		return GrossSelfEmploymentIncome;
	}

	public void setGrossSelfEmploymentIncome(double value) {
		GrossSelfEmploymentIncome = value;
	}

	private double GrossUnearnedIncome;

	public double getGrossUnearnedIncome() {
		return GrossUnearnedIncome;
	}

	public void setGrossUnearnedIncome(double value) {
		GrossUnearnedIncome = value;
	}

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
	}

	private String IsActualIncome = "";

	public String getIsActualIncome() {
		return IsActualIncome;
	}

	public void setIsActualIncome(String value) {
		IsActualIncome = value;
	}

	private String IsSimplifiedIncome = "";

	public String getIsSimplifiedIncome() {
		return IsSimplifiedIncome;
	}

	public void setIsSimplifiedIncome(String value) {
		IsSimplifiedIncome = value;
	}

	private double NetCountableIncome;

	public double getNetCountableIncome() {
		return NetCountableIncome;
	}

	public void setNetCountableIncome(double value) {
		NetCountableIncome = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private double SelfAttestedIncome;

	public double getSelfAttestedIncome() {
		return SelfAttestedIncome;
	}

	public void setSelfAttestedIncome(double value) {
		SelfAttestedIncome = value;
	}

	private String StateHubStatus = "";

	public String getStateHubStatus() {
		return StateHubStatus;
	}

	public void setStateHubStatus(String value) {
		StateHubStatus = value;
	}

	private String SwicaCompatibilityResult = "";

	public String getSwicaCompatibilityResult() {
		return SwicaCompatibilityResult;
	}

	public void setSwicaCompatibilityResult(String value) {
		SwicaCompatibilityResult = value;
	}

	private String SwicaReferenceValue = "";

	public String getSwicaReferenceValue() {
		return SwicaReferenceValue;
	}

	public void setSwicaReferenceValue(String value) {
		SwicaReferenceValue = value;
	}

	private double TotalGrossExpenses;

	public double getTotalGrossExpenses() {
		return TotalGrossExpenses;
	}

	public void setTotalGrossExpenses(double value) {
		TotalGrossExpenses = value;
	}

	private double TotalGrossIncome;

	public double getTotalGrossIncome() {
		return TotalGrossIncome;
	}

	public void setTotalGrossIncome(double value) {
		TotalGrossIncome = value;
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

}
