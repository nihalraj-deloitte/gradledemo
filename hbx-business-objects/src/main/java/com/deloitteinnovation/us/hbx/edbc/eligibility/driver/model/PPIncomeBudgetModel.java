//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:28 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class PPIncomeBudgetModel {

	private int PPIncomeBudgetId;

	public int getPPIncomeBudgetId() {
		return PPIncomeBudgetId;
	}

	public void setPPIncomeBudgetId(int value) {
		PPIncomeBudgetId = value;
	}

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
	}

	private int PPIncomeDetailId;

	public int getPPIncomeDetailId() {
		return PPIncomeDetailId;
	}

	public void setPPIncomeDetailId(int value) {
		PPIncomeDetailId = value;
	}

	private LocalDateTime BudgetBeginDate;

	public LocalDateTime getBudgetBeginDate() {
		return BudgetBeginDate;
	}

	public void setBudgetBeginDate(LocalDateTime value) {
		BudgetBeginDate = value;
	}

	private LocalDateTime BudgetEndDate;

	public LocalDateTime getBudgetEndDate() {
		return BudgetEndDate;
	}

	public void setBudgetEndDate(LocalDateTime value) {
		BudgetEndDate = value;
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

	private String IsActive = "";

	public String getIsActive() {
		return IsActive;
	}

	public void setIsActive(String value) {
		IsActive = value;
	}

	private Double PPBudgetAmount;

	public Double getPPBudgetAmount() {
		return PPBudgetAmount;
	}

	public void setPPBudgetAmount(Double value) {
		PPBudgetAmount = value;
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
