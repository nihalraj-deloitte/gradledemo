//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:28 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class MedicallyFrailModel {

	private int MedicallyFrailId;

	public int getMedicallyFrailId() {
		return MedicallyFrailId;
	}

	public void setMedicallyFrailId(int value) {
		MedicallyFrailId = value;
	}

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
	}

	private LocalDateTime AssessmentDate;

	public LocalDateTime getAssessmentDate() {
		return AssessmentDate;
	}

	public void setAssessmentDate(LocalDateTime value) {
		AssessmentDate = value;
	}

	private LocalDateTime BeginDate;

	public LocalDateTime getBeginDate() {
		return BeginDate;
	}

	public void setBeginDate(LocalDateTime value) {
		BeginDate = value;
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

	private LocalDateTime EndDate;

	public LocalDateTime getEndDate() {
		return EndDate;
	}

	public void setEndDate(LocalDateTime value) {
		EndDate = value;
	}

	private String IsMedicallyFrail = "";

	public String getIsMedicallyFrail() {
		return IsMedicallyFrail;
	}

	public void setIsMedicallyFrail(String value) {
		IsMedicallyFrail = value;
	}

	private String MedicallyFrailReason = "";

	public String getMedicallyFrailReason() {
		return MedicallyFrailReason;
	}

	public void setMedicallyFrailReason(String value) {
		MedicallyFrailReason = value;
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

	private String VerificationSource = "";

	public String getVerificationSource() {
		return VerificationSource;
	}

	public void setVerificationSource(String value) {
		VerificationSource = value;
	}

}
