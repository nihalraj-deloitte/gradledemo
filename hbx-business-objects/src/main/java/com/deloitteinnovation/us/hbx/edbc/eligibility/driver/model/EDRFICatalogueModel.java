//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:26 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class EDRFICatalogueModel {

	private int EDRFICatalogueId;

	public int getEDRFICatalogueId() {
		return EDRFICatalogueId;
	}

	public void setEDRFICatalogueId(int value) {
		EDRFICatalogueId = value;
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

	private String DCColumn = "";

	public String getDCColumn() {
		return DCColumn;
	}

	public void setDCColumn(String value) {
		DCColumn = value;
	}

	private String DcTable = "";

	public String getDcTable() {
		return DcTable;
	}

	public void setDcTable(String value) {
		DcTable = value;
	}

	private String DCVerificationColumn = "";

	public String getDCVerificationColumn() {
		return DCVerificationColumn;
	}

	public void setDCVerificationColumn(String value) {
		DCVerificationColumn = value;
	}

	private Integer DueDays;

	public Integer getDueDays() {
		return DueDays;
	}

	public void setDueDays(Integer value) {
		DueDays = value;
	}

	private String IsActive = "";

	public String getIsActive() {
		return IsActive;
	}

	public void setIsActive(String value) {
		IsActive = value;
	}

	private String IsCertifiable = "";

	public String getIsCertifiable() {
		return IsCertifiable;
	}

	public void setIsCertifiable(String value) {
		IsCertifiable = value;
	}

	private String IsToCheckPreviousEDM = "";

	public String getIsToCheckPreviousEDM() {
		return IsToCheckPreviousEDM;
	}

	public void setIsToCheckPreviousEDM(String value) {
		IsToCheckPreviousEDM = value;
	}

	private String ParentColumn = "";

	public String getParentColumn() {
		return ParentColumn;
	}

	public void setParentColumn(String value) {
		ParentColumn = value;
	}

	private String ParentTable = "";

	public String getParentTable() {
		return ParentTable;
	}

	public void setParentTable(String value) {
		ParentTable = value;
	}

	private String ProgramCode = "";

	public String getProgramCode() {
		return ProgramCode;
	}

	public void setProgramCode(String value) {
		ProgramCode = value;
	}

	private String RFIDenialCode = "";

	public String getRFIDenialCode() {
		return RFIDenialCode;
	}

	public void setRFIDenialCode(String value) {
		RFIDenialCode = value;
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

	private String VCLCategory = "";

	public String getVCLCategory() {
		return VCLCategory;
	}

	public void setVCLCategory(String value) {
		VCLCategory = value;
	}

	private String VCLGroupType = "";

	public String getVCLGroupType() {
		return VCLGroupType;
	}

	public void setVCLGroupType(String value) {
		VCLGroupType = value;
	}

	private String VCLSubCategory = "";

	public String getVCLSubCategory() {
		return VCLSubCategory;
	}

	public void setVCLSubCategory(String value) {
		VCLSubCategory = value;
	}

	private String VCLTypeCode = "";

	public String getVCLTypeCode() {
		return VCLTypeCode;
	}

	public void setVCLTypeCode(String value) {
		VCLTypeCode = value;
	}

	private String VrfRefTable = "";

	public String getVrfRefTable() {
		return VrfRefTable;
	}

	public void setVrfRefTable(String value) {
		VrfRefTable = value;
	}

}
