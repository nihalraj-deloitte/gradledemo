package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CascadeNoticeReason {

    @XmlElement(name = "FamilyBudgetSize")
    private Long familyBudgetSizeField;

    @XmlElement(name = "FinancialEligibilityResultCode")
    private String financialEligibilityResultCodeField;

    @XmlElement(name = "FPLIncomeAmount")
    private BigDecimal fPLIncomeAmountField;

    @XmlElement(name = "FPLPercentage")
    private String fPLPercentageField;

    @XmlElement(name = "GroupNoticeReason")
    private String groupNoticeReasonField;

    @XmlElement(name = "MagiFmaIncomeLimit")
    private BigDecimal magiFmaIncomeLimitField;

    @XmlElement(name = "NonFinancialEligibilityResultCode")
    private String nonFinancialEligibilityResultCodeField;

    @XmlElement(name = "NoticeReason")
    private String noticeReasonField;

    @XmlElement(name = "tOA")
    private String tOAField;

    @XmlElement(name = "eDGGroup")
    private EDGGroup eDGGroupField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public Long getFamilyBudgetSize() {
        return familyBudgetSizeField;
    }

    public void setFamilyBudgetSize(Long value) {
        familyBudgetSizeField = value;
    }

    /**
     *
     */
    public String getFinancialEligibilityResultCode() {
        return financialEligibilityResultCodeField;
    }

    public void setFinancialEligibilityResultCode(String value) {
        financialEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public BigDecimal getFPLIncomeAmount() {
        return fPLIncomeAmountField;
    }

    public void setFPLIncomeAmount(BigDecimal value) {
        fPLIncomeAmountField = value;
    }

    /**
     *
     */
    public String getFPLPercentage() {
        return fPLPercentageField;
    }

    public void setFPLPercentage(String value) {
        fPLPercentageField = value;
    }

    /**
     *
     */
    public String getGroupNoticeReason() {
        return groupNoticeReasonField;
    }

    public void setGroupNoticeReason(String value) {
        groupNoticeReasonField = value;
    }

    /**
     *
     */
    public BigDecimal getMagiFmaIncomeLimit() {
        return magiFmaIncomeLimitField;
    }

    public void setMagiFmaIncomeLimit(BigDecimal value) {
        magiFmaIncomeLimitField = value;
    }

    /**
     *
     */
    public String getNonFinancialEligibilityResultCode() {
        return nonFinancialEligibilityResultCodeField;
    }

    public void setNonFinancialEligibilityResultCode(String value) {
        nonFinancialEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public String getNoticeReason() {
        return noticeReasonField;
    }

    public void setNoticeReason(String value) {
        noticeReasonField = value;
    }

    /**
     *
     */
    public String getTOA() {
        return tOAField;
    }

    public void setTOA(String value) {
        tOAField = value;
    }

    /**
     *
     */
    public EDGGroup geteDGGroup() {
        return eDGGroupField;
    }

    public void seteDGGroup(EDGGroup value) {
        eDGGroupField = value;
    }

    /**
     *
     */
    public String getid() {
        return idField;
    }

    public void setid(String value) {
        idField = value;
    }

    /**
     *
     */
    public String gethref() {
        return hrefField;
    }

    public void sethref(String value) {
        hrefField = value;
    }

}