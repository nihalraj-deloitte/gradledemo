//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:50 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class IndividualCascadeNoticeReason {
    private Long individualId;

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long value) {
        individualId = value;
    }

    private String TypeOfAssistanceCode = "";

    public String getTypeOfAssistanceCode() {
        return TypeOfAssistanceCode;
    }

    public void setTypeOfAssistanceCode(String value) {
        TypeOfAssistanceCode = value;
    }

    private String IndividualNoticeReason = "";

    public String getIndividualNoticeReason() {
        return IndividualNoticeReason;
    }

    public void setIndividualNoticeReason(String value) {
        IndividualNoticeReason = value;
    }

    private String GroupNoticeReason = "";

    public String getGroupNoticeReason() {
        return GroupNoticeReason;
    }

    public void setGroupNoticeReason(String value) {
        GroupNoticeReason = value;
    }

    private String NonFinancialEligibilityResultCode = "";

    public String getNonFinancialEligibilityResultCode() {
        return NonFinancialEligibilityResultCode;
    }

    public void setNonFinancialEligibilityResultCode(String value) {
        NonFinancialEligibilityResultCode = value;
    }

    private String ResourceEligibilityResultCode = "";

    public String getResourceEligibilityResultCode() {
        return ResourceEligibilityResultCode;
    }

    public void setResourceEligibilityResultCode(String value) {
        ResourceEligibilityResultCode = value;
    }

    private String FinancialEligibilityResultCode = "";

    public String getFinancialEligibilityResultCode() {
        return FinancialEligibilityResultCode;
    }

    public void setFinancialEligibilityResultCode(String value) {
        FinancialEligibilityResultCode = value;
    }

    private int IncomeLimit;

    public int getIncomeLimit() {
        return IncomeLimit;
    }

    public void setIncomeLimit(int value) {
        IncomeLimit = value;
    }

    private int FPLIncomeAmount;

    public int getFPLIncomeAmount() {
        return FPLIncomeAmount;
    }

    public void setFPLIncomeAmount(int value) {
        FPLIncomeAmount = value;
    }

    private int ResourceLimit;

    public int getResourceLimit() {
        return ResourceLimit;
    }

    public void setResourceLimit(int value) {
        ResourceLimit = value;
    }

    private int TotalResourceAmount;

    public int getTotalResourceAmount() {
        return TotalResourceAmount;
    }

    public void setTotalResourceAmount(int value) {
        TotalResourceAmount = value;
    }

    private LocalDateTime PaymentBeginDate;

    public LocalDateTime getPaymentBeginDate() {
        return PaymentBeginDate;
    }

    public void setPaymentBeginDate(LocalDateTime value) {
        PaymentBeginDate = value;
    }

    private String ResourceBudgetType = "";

    public String getResourceBudgetType() {
        return ResourceBudgetType;
    }

    public void setResourceBudgetType(String value) {
        ResourceBudgetType = value;
    }

    private List<IndividualCascadeEDGResource> individualCascadeEDGResource = new ArrayList<>();

    public List<IndividualCascadeEDGResource> getindividualCascadeEDGResource() {
        return individualCascadeEDGResource;
    }

    public void setindividualCascadeEDGResource(List<IndividualCascadeEDGResource> value) {
        individualCascadeEDGResource = value;
    }

}
