//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:28 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class TMAEmploymentEndDetailModel {

	private int TMAIncomeReportingId;

	public int getTMAIncomeReportingId() {
		return TMAIncomeReportingId;
	}

	public void setTMAIncomeReportingId(int value) {
		TMAIncomeReportingId = value;
	}

	private int TMAEmploymentEndDetailId;

	public int getTMAEmploymentEndDetailId() {
		return TMAEmploymentEndDetailId;
	}

	public void setTMAEmploymentEndDetailId(int value) {
		TMAEmploymentEndDetailId = value;
	}

	private Long IndividualId;

	public Long getIndividualId() {
		return IndividualId;
	}

	public void setIndividualId(Long value) {
		IndividualId = value;
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

	private String EmployerName = "";

	public String getEmployerName() {
		return EmployerName;
	}

	public void setEmployerName(String value) {
		EmployerName = value;
	}

	private String EmploymentEndReason = "";

	public String getEmploymentEndReason() {
		return EmploymentEndReason;
	}

	public void setEmploymentEndReason(String value) {
		EmploymentEndReason = value;
	}

	private String JobQuitGoodCause = "";

	public String getJobQuitGoodCause() {
		return JobQuitGoodCause;
	}

	public void setJobQuitGoodCause(String value) {
		JobQuitGoodCause = value;
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

}
