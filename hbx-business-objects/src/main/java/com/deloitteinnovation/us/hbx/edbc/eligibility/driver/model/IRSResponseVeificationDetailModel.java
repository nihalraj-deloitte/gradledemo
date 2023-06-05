//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:52 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

public class IRSResponseVeificationDetailModel {
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

	private int IRSResponseVerificationDetailId;

	public int getIRSResponseVerificationDetailId() {
		return IRSResponseVerificationDetailId;
	}

	public void setIRSResponseVerificationDetailId(int value) {
		IRSResponseVerificationDetailId = value;
	}

	private String PrimaryTaxFiler = "";

	public String getPrimaryTaxFiler() {
		return PrimaryTaxFiler;
	}

	public void setPrimaryTaxFiler(String value) {
		PrimaryTaxFiler = value;
	}

	private String SpouseTaxFiler = "";

	public String getSpouseTaxFiler() {
		return SpouseTaxFiler;
	}

	public void setSpouseTaxFiler(String value) {
		SpouseTaxFiler = value;
	}

	private double TaxReturnAGIAmount;

	public double getTaxReturnAGIAmount() {
		return TaxReturnAGIAmount;
	}

	public void setTaxReturnAGIAmount(double value) {
		TaxReturnAGIAmount = value;
	}

	private String TaxReturnFilingstatusCode = "";

	public String getTaxReturnFilingstatusCode() {
		return TaxReturnFilingstatusCode;
	}

	public void setTaxReturnFilingstatusCode(String value) {
		TaxReturnFilingstatusCode = value;
	}

	private double TaxReturnMAGIAmount;

	public double getTaxReturnMAGIAmount() {
		return TaxReturnMAGIAmount;
	}

	public void setTaxReturnMAGIAmount(double value) {
		TaxReturnMAGIAmount = value;
	}

	private double TaxReturnTaxableSocialSecurityBenefitsAmount;

	public double getTaxReturnTaxableSocialSecurityBenefitsAmount() {
		return TaxReturnTaxableSocialSecurityBenefitsAmount;
	}

	public void setTaxReturnTaxableSocialSecurityBenefitsAmount(double value) {
		TaxReturnTaxableSocialSecurityBenefitsAmount = value;
	}

	private double TaxReturnTotalExemptionsQuantity;

	public double getTaxReturnTotalExemptionsQuantity() {
		return TaxReturnTotalExemptionsQuantity;
	}

	public void setTaxReturnTotalExemptionsQuantity(double value) {
		TaxReturnTotalExemptionsQuantity = value;
	}

	private String TaxReturnYear = "";

	public String getTaxReturnYear() {
		return TaxReturnYear;
	}

	public void setTaxReturnYear(String value) {
		TaxReturnYear = value;
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

	private String VerificationDetailType = "";

	public String getVerificationDetailType() {
		return VerificationDetailType;
	}

	public void setVerificationDetailType(String value) {
		VerificationDetailType = value;
	}

	private int VerifyAnnualHouseholdIncomeId;

	public int getVerifyAnnualHouseholdIncomeId() {
		return VerifyAnnualHouseholdIncomeId;
	}

	public void setVerifyAnnualHouseholdIncomeId(int value) {
		VerifyAnnualHouseholdIncomeId = value;
	}

}
