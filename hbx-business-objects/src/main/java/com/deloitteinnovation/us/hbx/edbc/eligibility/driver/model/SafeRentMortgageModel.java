//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:28 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class SafeRentMortgageModel {

	private int SafeRentMortgageId;

	public int getSafeRentMortgageId() {
		return SafeRentMortgageId;
	}

	public void setSafeRentMortgageId(int value) {
		SafeRentMortgageId = value;
	}

	private Long CaseNumber;

	public Long getCaseNumber() {
		return CaseNumber;
	}

	public void setCaseNumber(Long value) {
		CaseNumber = value;
	}

	private Double Amount;

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double value) {
		Amount = value;
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

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
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

	private String Verification = "";

	public String getVerification() {
		return Verification;
	}

	public void setVerification(String value) {
		Verification = value;
	}

}
