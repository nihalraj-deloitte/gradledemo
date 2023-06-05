package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class EDGBudget {

    @XmlElement(name = "FederalGroupIncomeAmount")
    private BigDecimal federalGroupIncomeAmountField;

    @XmlElement(name = "FederalIncomeLimit")
    private BigDecimal federalIncomeLimitField;

    @XmlElement(name = "FMATestResultCode")
    private String fMATestResultCodeField;

    @XmlElement(name = "GrossEarnedIncomeAmount")
    private BigDecimal grossEarnedIncomeAmountField;

    @XmlElement(name = "GrossOtherIncomeAmount")
    private BigDecimal grossOtherIncomeAmountField;

    @XmlElement(name = "GrossSelfEmployedIncome")
    private BigDecimal grossEmploymentIncomeAmountField;

    @XmlElement(name = "GrossSelfEmployedIncome")
    private BigDecimal grossSelfEmployedIncomeField;

    @XmlElement(name = "GrossUnEarnedIncomeAmount")
    private BigDecimal grossUnEarnedIncomeAmountField;

    @XmlElement(name = "GroupAGI")
    private BigDecimal groupAGIField;

    @XmlElement(name = "GroupAnnualAPTCIncome")
    private BigDecimal groupAnnualAPTCIncomeField;

    @XmlElement(name = "GroupMAGI")
    private BigDecimal groupMAGIField;

    @XmlElement(name = "GroupMAGI_With_0_Percent_Deduction")
    private BigDecimal groupMAGI_With_0_Percent_DeductionField;

    @XmlElement(name = "GroupMAGI_With_5_Percent_Deduction")
    private BigDecimal groupMAGI_With_5_Percent_DeductionField;

    @XmlElement(name = "GroupTotalCountableIncomeAmount")
    private BigDecimal groupTotalCountableIncomeAmountField;

    @XmlElement(name = "GroupTotalExpenses")
    private BigDecimal groupTotalExpensesField;

    @XmlElement(name = "IncomePercent")
    private BigDecimal incomePercentField;

    @XmlElement(name = "IsFederalIncomeLessThanFPL")
    private String isFederalIncomeLessThanFPLField;

    @XmlElement(name = "IsStateIncomeLessThanFPL")
    private String isStateIncomeLessThanFPLField;

    @XmlElement(name = "IsVCIIncomeLessThanFPL")
    private String isVCIIncomeLessThanFPLField;

    @XmlElement(name = "MAGIInclusionIncome")
    private BigDecimal mAGIInclusionIncomeField;

    @XmlElement(name = "SelfAttestedCalculated")
    private BigDecimal selfAttestedCalculatedField;

    @XmlElement(name = "SelfAttestedEarnedIncome")
    private BigDecimal selfAttestedEarnedIncomeField;

    @XmlElement(name = "SelfAttestedGrossIncome")
    private BigDecimal selfAttestedGrossIncomeField;

    @XmlElement(name = "SelfAttestedOtherIncome")
    private BigDecimal selfAttestedOtherIncomeField;

    @XmlElement(name = "SelfAttestedSelfEmploymentIncome")
    private BigDecimal selfAttestedSelfEmploymentIncomeField;

    @XmlElement(name = "SelfAttestedUnearnedIncome")
    private BigDecimal selfAttestedUnearnedIncomeField;

    @XmlElement(name = "SpendDownAmount")
    private BigDecimal spendDownAmountField;

    @XmlElement(name = "StandardDeductionAmount")
    private BigDecimal standardDeductionAmountField;

    @XmlElement(name = "StateGroupIncomeAmount")
    private BigDecimal stateGroupIncomeAmountField;

    @XmlElement(name = "VCIGroupIncomeAmount")
    private BigDecimal vCIGroupIncomeAmountField;

    @XmlElement(name = "eDGGroup")
    private EDGGroup eDGGroupField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public BigDecimal getFederalGroupIncomeAmount() {
        return federalGroupIncomeAmountField;
    }

    public void setFederalGroupIncomeAmount(BigDecimal value) {
        federalGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getFederalIncomeLimit() {
        return federalIncomeLimitField;
    }

    public void setFederalIncomeLimit(BigDecimal value) {
        federalIncomeLimitField = value;
    }

    /**
     *
     */
    public String getFMATestResultCode() {
        return fMATestResultCodeField;
    }

    public void setFMATestResultCode(String value) {
        fMATestResultCodeField = value;
    }

    /**
     *
     */
    public BigDecimal getGrossEarnedIncomeAmount() {
        return grossEarnedIncomeAmountField;
    }

    public void setGrossEarnedIncomeAmount(BigDecimal value) {
        grossEarnedIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getGrossEmploymentIncomeAmount() {
        return grossEmploymentIncomeAmountField;
    }

    public void setGrossEmploymentIncomeAmount(BigDecimal value) {
        grossEmploymentIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getGrossOtherIncomeAmount() {
        return grossOtherIncomeAmountField;
    }

    public void setGrossOtherIncomeAmount(BigDecimal value) {
        grossOtherIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getGrossSelfEmployedIncome() {
        return grossSelfEmployedIncomeField;
    }

    public void setGrossSelfEmployedIncome(BigDecimal value) {
        grossSelfEmployedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getGrossUnEarnedIncomeAmount() {
        return grossUnEarnedIncomeAmountField;
    }

    public void setGrossUnEarnedIncomeAmount(BigDecimal value) {
        grossUnEarnedIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getGroupAGI() {
        return groupAGIField;
    }

    public void setGroupAGI(BigDecimal value) {
        groupAGIField = value;
    }

    /**
     *
     */
    public BigDecimal getGroupAnnualAPTCIncome() {
        return groupAnnualAPTCIncomeField;
    }

    public void setGroupAnnualAPTCIncome(BigDecimal value) {
        groupAnnualAPTCIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getGroupMAGI() {
        return groupMAGIField;
    }

    public void setGroupMAGI(BigDecimal value) {
        groupMAGIField = value;
    }

    /**
     *
     */
    public BigDecimal getGroupMAGI_With_0_Percent_Deduction() {
        return groupMAGI_With_0_Percent_DeductionField;
    }

    public void setGroupMAGI_With_0_Percent_Deduction(BigDecimal value) {
        groupMAGI_With_0_Percent_DeductionField = value;
    }

    /**
     *
     */
    public BigDecimal getGroupMAGI_With_5_Percent_Deduction() {
        return groupMAGI_With_5_Percent_DeductionField;
    }

    public void setGroupMAGI_With_5_Percent_Deduction(BigDecimal value) {
        groupMAGI_With_5_Percent_DeductionField = value;
    }

    /**
     *
     */
    public BigDecimal getGroupTotalCountableIncomeAmount() {
        return groupTotalCountableIncomeAmountField;
    }

    public void setGroupTotalCountableIncomeAmount(BigDecimal value) {
        groupTotalCountableIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getGroupTotalExpenses() {
        return groupTotalExpensesField;
    }

    public void setGroupTotalExpenses(BigDecimal value) {
        groupTotalExpensesField = value;
    }

    /**
     *
     */
    public BigDecimal getIncomePercent() {
        return incomePercentField;
    }

    public void setIncomePercent(BigDecimal value) {
        incomePercentField = value;
    }

    /**
     *
     */
    public String getIsFederalIncomeLessThanFPL() {
        return isFederalIncomeLessThanFPLField;
    }

    public void setIsFederalIncomeLessThanFPL(String value) {
        isFederalIncomeLessThanFPLField = value;
    }

    /**
     *
     */
    public String getIsStateIncomeLessThanFPL() {
        return isStateIncomeLessThanFPLField;
    }

    public void setIsStateIncomeLessThanFPL(String value) {
        isStateIncomeLessThanFPLField = value;
    }

    /**
     *
     */
    public String getIsVCIIncomeLessThanFPL() {
        return isVCIIncomeLessThanFPLField;
    }

    public void setIsVCIIncomeLessThanFPL(String value) {
        isVCIIncomeLessThanFPLField = value;
    }

    /**
     *
     */
    public BigDecimal getMAGIInclusionIncome() {
        return mAGIInclusionIncomeField;
    }

    public void setMAGIInclusionIncome(BigDecimal value) {
        mAGIInclusionIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getSelfAttestedCalculated() {
        return selfAttestedCalculatedField;
    }

    public void setSelfAttestedCalculated(BigDecimal value) {
        selfAttestedCalculatedField = value;
    }

    /**
     *
     */
    public BigDecimal getSelfAttestedEarnedIncome() {
        return selfAttestedEarnedIncomeField;
    }

    public void setSelfAttestedEarnedIncome(BigDecimal value) {
        selfAttestedEarnedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getSelfAttestedGrossIncome() {
        return selfAttestedGrossIncomeField;
    }

    public void setSelfAttestedGrossIncome(BigDecimal value) {
        selfAttestedGrossIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getSelfAttestedOtherIncome() {
        return selfAttestedOtherIncomeField;
    }

    public void setSelfAttestedOtherIncome(BigDecimal value) {
        selfAttestedOtherIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getSelfAttestedSelfEmploymentIncome() {
        return selfAttestedSelfEmploymentIncomeField;
    }

    public void setSelfAttestedSelfEmploymentIncome(BigDecimal value) {
        selfAttestedSelfEmploymentIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getSelfAttestedUnearnedIncome() {
        return selfAttestedUnearnedIncomeField;
    }

    public void setSelfAttestedUnearnedIncome(BigDecimal value) {
        selfAttestedUnearnedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDownAmount() {
        return spendDownAmountField;
    }

    public void setSpendDownAmount(BigDecimal value) {
        spendDownAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getStandardDeductionAmount() {
        return standardDeductionAmountField;
    }

    public void setStandardDeductionAmount(BigDecimal value) {
        standardDeductionAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getStateGroupIncomeAmount() {
        return stateGroupIncomeAmountField;
    }

    public void setStateGroupIncomeAmount(BigDecimal value) {
        stateGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getVCIGroupIncomeAmount() {
        return vCIGroupIncomeAmountField;
    }

    public void setVCIGroupIncomeAmount(BigDecimal value) {
        vCIGroupIncomeAmountField = value;
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