//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:49 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



public class HouseholdIncomeModel {
	private double AdjustedGrossIncomeAmount;

	public double getAdjustedGrossIncomeAmount() {
		return AdjustedGrossIncomeAmount;
	}

	public void setAdjustedGrossIncomeAmount(double value) {
		AdjustedGrossIncomeAmount = value;
	}

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

	private double EdgGroupSize;

	public double getEdgGroupSize() {
		return EdgGroupSize;
	}

	public void setEdgGroupSize(double value) {
		EdgGroupSize = value;
	}

	private int EdgTraceId;

	public int getEdgTraceId() {
		return EdgTraceId;
	}

	public void setEdgTraceId(int value) {
		EdgTraceId = value;
	}

	private double ExpenseAmount;

	public double getExpenseAmount() {
		return ExpenseAmount;
	}

	public void setExpenseAmount(double value) {
		ExpenseAmount = value;
	}

	private int FamilyBudgetSize;

	public int getFamilyBudgetSize() {
		return FamilyBudgetSize;
	}

	public void setFamilyBudgetSize(int value) {
		FamilyBudgetSize = value;
	}

	private String FederalCompatibilityResult = "";

	public String getFederalCompatibilityResult() {
		return FederalCompatibilityResult;
	}

	public void setFederalCompatibilityResult(String value) {
		FederalCompatibilityResult = value;
	}

	private String FedReferenceValue = "";

	public String getFedReferenceValue() {
		return FedReferenceValue;
	}

	public void setFedReferenceValue(String value) {
		FedReferenceValue = value;
	}

	private String FMAIncomeResultCode = "";

	public String getFMAIncomeResultCode() {
		return FMAIncomeResultCode;
	}

	public void setFMAIncomeResultCode(String value) {
		FMAIncomeResultCode = value;
	}

	private String FPLPercentage = "";

	public String getFPLPercentage() {
		return FPLPercentage;
	}

	public void setFPLPercentage(String value) {
		FPLPercentage = value;
	}

	private double GrossEarnedIncome;

	public double getGrossEarnedIncome() {
		return GrossEarnedIncome;
	}

	public void setGrossEarnedIncome(double value) {
		GrossEarnedIncome = value;
	}

	private double GrossUnearnedIncome;

	public double getGrossUnearnedIncome() {
		return GrossUnearnedIncome;
	}

	public void setGrossUnearnedIncome(double value) {
		GrossUnearnedIncome = value;
	}

	private double IncomePercentage;

	public double getIncomePercentage() {
		return IncomePercentage;
	}

	public void setIncomePercentage(double value) {
		IncomePercentage = value;
	}

	private String IsActualIncome = "";

	public String getIsActualIncome() {
		return IsActualIncome;
	}

	public void setIsActualIncome(String value) {
		IsActualIncome = value;
	}

	private String IsCurrentIncomeBelowFPL = "";

	public String getIsCurrentIncomeBelowFPL() {
		return IsCurrentIncomeBelowFPL;
	}

	public void setIsCurrentIncomeBelowFPL(String value) {
		IsCurrentIncomeBelowFPL = value;
	}

	private String IsFederalIncomeBelowFPL = "";

	public String getIsFederalIncomeBelowFPL() {
		return IsFederalIncomeBelowFPL;
	}

	public void setIsFederalIncomeBelowFPL(String value) {
		IsFederalIncomeBelowFPL = value;
	}

	private String IsIncomeDisregardConsidered = "";

	public String getIsIncomeDisregardConsidered() {
		return IsIncomeDisregardConsidered;
	}

	public void setIsIncomeDisregardConsidered(String value) {
		IsIncomeDisregardConsidered = value;
	}

	private String IsSimplifiedIncome = "";

	public String getIsSimplifiedIncome() {
		return IsSimplifiedIncome;
	}

	public void setIsSimplifiedIncome(String value) {
		IsSimplifiedIncome = value;
	}

	private String IsSwicaIncomeBelowFPL = "";

	public String getIsSwicaIncomeBelowFPL() {
		return IsSwicaIncomeBelowFPL;
	}

	public void setIsSwicaIncomeBelowFPL(String value) {
		IsSwicaIncomeBelowFPL = value;
	}

	private double MagiFmaIncomeLimitAmount;

	public double getMagiFmaIncomeLimitAmount() {
		return MagiFmaIncomeLimitAmount;
	}

	public void setMagiFmaIncomeLimitAmount(double value) {
		MagiFmaIncomeLimitAmount = value;
	}

	private double MAGINetCountableIncomeAmount;

	public double getMAGINetCountableIncomeAmount() {
		return MAGINetCountableIncomeAmount;
	}

	public void setMAGINetCountableIncomeAmount(double value) {
		MAGINetCountableIncomeAmount = value;
	}

	private double MagiPercentageUsed;

	public double getMagiPercentageUsed() {
		return MagiPercentageUsed;
	}

	public void setMagiPercentageUsed(double value) {
		MagiPercentageUsed = value;
	}

	private double MagiStandardDeduction;

	public double getMagiStandardDeduction() {
		return MagiStandardDeduction;
	}

	public void setMagiStandardDeduction(double value) {
		MagiStandardDeduction = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private double SpendDownAmount;

	public double getSpendDownAmount() {
		return SpendDownAmount;
	}

	public void setSpendDownAmount(double value) {
		SpendDownAmount = value;
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
