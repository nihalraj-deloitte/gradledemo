//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:26 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class EDBCLastAuthInfoModel {

	private Long CaseNumber;

	public Long getCaseNumber() {
		return CaseNumber;
	}

	public void setCaseNumber(Long value) {
		CaseNumber = value;
	}

	private int EdgtraceId;

	public int getEdgtraceId() {
		return EdgtraceId;
	}

	public void setEdgtraceId(int value) {
		EdgtraceId = value;
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

	private Integer EdgtraceId_A;

	public Integer getEdgtraceId_A() {
		return EdgtraceId_A;
	}

	public void setEdgtraceId_A(Integer value) {
		EdgtraceId_A = value;
	}

	private Integer EdgtraceId_B;

	public Integer getEdgtraceId_B() {
		return EdgtraceId_B;
	}

	public void setEdgtraceId_B(Integer value) {
		EdgtraceId_B = value;
	}

	private Integer EdgtraceId_R;

	public Integer getEdgtraceId_R() {
		return EdgtraceId_R;
	}

	public void setEdgtraceId_R(Integer value) {
		EdgtraceId_R = value;
	}

	private byte[] RowversionStamp;

	public byte[] getRowversionStamp() {
		return RowversionStamp;
	}

	public void setRowversionStamp(byte[] value) {
		RowversionStamp = value;
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
