//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:27 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class LivingArrangementProviderTableModel {

	private int LivingArrangementProviderId;

	public int getLivingArrangementProviderId() {
		return LivingArrangementProviderId;
	}

	public void setLivingArrangementProviderId(int value) {
		LivingArrangementProviderId = value;
	}

	private int IndividualLivingArrangementId;

	public int getIndividualLivingArrangementId() {
		return IndividualLivingArrangementId;
	}

	public void setIndividualLivingArrangementId(int value) {
		IndividualLivingArrangementId = value;
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

	 private LocalDateTime FromDate;

	public LocalDateTime getFromDate() {
		return FromDate;
	}

	public void setFromDate(LocalDateTime value) {
		FromDate = value;
	}

	private String HasFiftyPercentMeals = "";

	public String getHasFiftyPercentMeals() {
		return HasFiftyPercentMeals;
	}

	public void setHasFiftyPercentMeals(String value) {
		HasFiftyPercentMeals = value;
	}

	private String IsIneligibleFacility = "";

	public String getIsIneligibleFacility() {
		return IsIneligibleFacility;
	}

	public void setIsIneligibleFacility(String value) {
		IsIneligibleFacility = value;
	}

	private String IsMedicaidProvider = "";

	public String getIsMedicaidProvider() {
		return IsMedicaidProvider;
	}

	public void setIsMedicaidProvider(String value) {
		IsMedicaidProvider = value;
	}

	 private LocalDateTime PCHContactDate;

	public LocalDateTime getPCHContactDate() {
		return PCHContactDate;
	}

	public void setPCHContactDate(LocalDateTime value) {
		PCHContactDate = value;
	}

	private String ProviderId = "";

	public String getProviderId() {
		return ProviderId;
	}

	public void setProviderId(String value) {
		ProviderId = value;
	}

	private String ProviderName = "";

	public String getProviderName() {
		return ProviderName;
	}

	public void setProviderName(String value) {
		ProviderName = value;
	}

	private String ProviderType = "";

	public String getProviderType() {
		return ProviderType;
	}

	public void setProviderType(String value) {
		ProviderType = value;
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
