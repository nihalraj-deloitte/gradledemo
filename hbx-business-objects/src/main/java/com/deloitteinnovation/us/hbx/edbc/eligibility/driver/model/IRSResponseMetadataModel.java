//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:52 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



public class IRSResponseMetadataModel {
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

	private int IRSResponseMetadataId;

	public int getIRSResponseMetadataId() {
		return IRSResponseMetadataId;
	}

	public void setIRSResponseMetadataId(int value) {
		IRSResponseMetadataId = value;
	}

	private int IRSResponseVerificationDetailId;

	public int getIRSResponseVerificationDetailId() {
		return IRSResponseVerificationDetailId;
	}

	public void setIRSResponseVerificationDetailId(int value) {
		IRSResponseVerificationDetailId = value;
	}

	private String ResponseCode = "";

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String value) {
		ResponseCode = value;
	}

	private String ResponseDescriptionText = "";

	public String getResponseDescriptionText() {
		return ResponseDescriptionText;
	}

	public void setResponseDescriptionText(String value) {
		ResponseDescriptionText = value;
	}

	private String TDSResponseDescriptionText = "";

	public String getTDSResponseDescriptionText() {
		return TDSResponseDescriptionText;
	}

	public void setTDSResponseDescriptionText(String value) {
		TDSResponseDescriptionText = value;
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
