//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:28 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class OutOfStateBenefitModel {

	private int OutOfStateBenefitId;

	public int getOutOfStateBenefitId() {
		return OutOfStateBenefitId;
	}

	public void setOutOfStateBenefitId(int value) {
		OutOfStateBenefitId = value;
	}

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
	}

	private LocalDateTime BenefitFromDate;

	public LocalDateTime getBenefitFromDate() {
		return BenefitFromDate;
	}

	public void setBenefitFromDate(LocalDateTime value) {
		BenefitFromDate = value;
	}

	private LocalDateTime BenefitToDate;

	public LocalDateTime getBenefitToDate() {
		return BenefitToDate;
	}

	public void setBenefitToDate(LocalDateTime value) {
		BenefitToDate = value;
	}

	private String CountyCode = "";

	public String getCountyCode() {
		return CountyCode;
	}

	public void setCountyCode(String value) {
		CountyCode = value;
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

	private String ProgramCode = "";

	public String getProgramCode() {
		return ProgramCode;
	}

	public void setProgramCode(String value) {
		ProgramCode = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private String StateCode = "";

	public String getStateCode() {
		return StateCode;
	}

	public void setStateCode(String value) {
		StateCode = value;
	}

	private Double TANFAmount;

	public Double getTANFAmount() {
		return TANFAmount;
	}

	public void setTANFAmount(Double value) {
		TANFAmount = value;
	}

	private String TANFVerificationCode = "";

	public String getTANFVerificationCode() {
		return TANFVerificationCode;
	}

	public void setTANFVerificationCode(String value) {
		TANFVerificationCode = value;
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
