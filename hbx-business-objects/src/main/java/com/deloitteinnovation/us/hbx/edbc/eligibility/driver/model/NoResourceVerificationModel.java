//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:28 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class NoResourceVerificationModel {

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
	}

	private int NoResourceVerificationId;

	public int getNoResourceVerificationId() {
		return NoResourceVerificationId;
	}

	public void setNoResourceVerificationId(int value) {
		NoResourceVerificationId = value;
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

	private String NMVerificationCode = "";

	public String getNMVerificationCode() {
		return NMVerificationCode;
	}

	public void setNMVerificationCode(String value) {
		NMVerificationCode = value;
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

	private String VerificationCode = "";

	public String getVerificationCode() {
		return VerificationCode;
	}

	public void setVerificationCode(String value) {
		VerificationCode = value;
	}

	private LocalDateTime VerifiedOnDate;

	public LocalDateTime getVerifiedOnDate() {
		return VerifiedOnDate;
	}

	public void setVerifiedOnDate(LocalDateTime value) {
		VerifiedOnDate = value;
	}

}
