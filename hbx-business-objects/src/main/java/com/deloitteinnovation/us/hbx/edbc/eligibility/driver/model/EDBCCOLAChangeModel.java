//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:26 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class EDBCCOLAChangeModel {

	private int EDBCCOLAChangeId;

	public int getEDBCCOLAChangeId() {
		return EDBCCOLAChangeId;
	}

	public void setEDBCCOLAChangeId(int value) {
		EDBCCOLAChangeId = value;
	}

	private Long CaseNumber;

	public Long getCaseNumber() {
		return CaseNumber;
	}

	public void setCaseNumber(Long value) {
		CaseNumber = value;
	}

	private int ColaMonth;

	public int getColaMonth() {
		return ColaMonth;
	}

	public void setColaMonth(int value) {
		ColaMonth = value;
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

	 private LocalDateTime EdbcRunDate;

	public LocalDateTime getEdbcRunDate() {
		return EdbcRunDate;
	}

	public void setEdbcRunDate(LocalDateTime value) {
		EdbcRunDate = value;
	}

	private int EdgNumber;

	public int getEdgNumber() {
		return EdgNumber;
	}

	public void setEdgNumber(int value) {
		EdgNumber = value;
	}

	private Integer EdgTraceId;

	public Integer getEdgTraceId() {
		return EdgTraceId;
	}

	public void setEdgTraceId(Integer value) {
		EdgTraceId = value;
	}

	private String HasEdNoticeSet = "";

	public String getHasEdNoticeSet() {
		return HasEdNoticeSet;
	}

	public void setHasEdNoticeSet(String value) {
		HasEdNoticeSet = value;
	}

	private String IsDiNoticeTriggered = "";

	public String getIsDiNoticeTriggered() {
		return IsDiNoticeTriggered;
	}

	public void setIsDiNoticeTriggered(String value) {
		IsDiNoticeTriggered = value;
	}

	private String NoticeReason = "";

	public String getNoticeReason() {
		return NoticeReason;
	}

	public void setNoticeReason(String value) {
		NoticeReason = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private String TriggerCode = "";

	public String getTriggerCode() {
		return TriggerCode;
	}

	public void setTriggerCode(String value) {
		TriggerCode = value;
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
