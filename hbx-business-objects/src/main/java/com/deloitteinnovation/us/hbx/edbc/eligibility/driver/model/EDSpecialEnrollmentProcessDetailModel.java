//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:26 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class EDSpecialEnrollmentProcessDetailModel {

	private int EDSpecialEnrollmentProcessDetailsId;

	public int getEDSpecialEnrollmentProcessDetailsId() {
		return EDSpecialEnrollmentProcessDetailsId;
	}

	public void setEDSpecialEnrollmentProcessDetailsId(int value) {
		EDSpecialEnrollmentProcessDetailsId = value;
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

	private String EmployeeEnrollmentStatus = "";

	public String getEmployeeEnrollmentStatus() {
		return EmployeeEnrollmentStatus;
	}

	public void setEmployeeEnrollmentStatus(String value) {
		EmployeeEnrollmentStatus = value;
	}

	private String ErrorDetails = "";

	public String getErrorDetails() {
		return ErrorDetails;
	}

	public void setErrorDetails(String value) {
		ErrorDetails = value;
	}

	private String IndividualEnrollmentStatus = "";

	public String getIndividualEnrollmentStatus() {
		return IndividualEnrollmentStatus;
	}

	public void setIndividualEnrollmentStatus(String value) {
		IndividualEnrollmentStatus = value;
	}

	private String IsDelete = "";

	public String getIsDelete() {
		return IsDelete;
	}

	public void setIsDelete(String value) {
		IsDelete = value;
	}

	private String LastProcess = "";

	public String getLastProcess() {
		return LastProcess;
	}

	public void setLastProcess(String value) {
		LastProcess = value;
	}

	private String MessageText = "";

	public String getMessageText() {
		return MessageText;
	}

	public void setMessageText(String value) {
		MessageText = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	 private LocalDateTime RunDate;

	public LocalDateTime getRunDate() {
		return RunDate;
	}

	public void setRunDate(LocalDateTime value) {
		RunDate = value;
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

}
