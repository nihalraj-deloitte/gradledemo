//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:27 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class EligibilityToaCascadeModel {

	private Long CaseNumber;

	public Long getCaseNumber() {
		return CaseNumber;
	}

	public void setCaseNumber(Long value) {
		CaseNumber = value;
	}

	private int EdgTraceId;

	public int getEdgTraceId() {
		return EdgTraceId;
	}

	public void setEdgTraceId(int value) {
		EdgTraceId = value;
	}

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
	}

	private String PossibleToaCode = "";

	public String getPossibleToaCode() {
		return PossibleToaCode;
	}

	public void setPossibleToaCode(String value) {
		PossibleToaCode = value;
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

	private LocalDateTime EligibilityDeterminationMonth;

	public LocalDateTime getEligibilityDeterminationMonth() {
		return EligibilityDeterminationMonth;
	}

	public void setEligibilityDeterminationMonth(LocalDateTime value) {
		EligibilityDeterminationMonth = value;
	}

	private String IsCascadeAllowed = "";

	public String getIsCascadeAllowed() {
		return IsCascadeAllowed;
	}

	public void setIsCascadeAllowed(String value) {
		IsCascadeAllowed = value;
	}

	private String PossibleToaYN = "";

	public String getPossibleToaYN() {
		return PossibleToaYN;
	}

	public void setPossibleToaYN(String value) {
		PossibleToaYN = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private int TransactionId;

	public int getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(int value) {
		TransactionId = value;
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
