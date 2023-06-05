package com.deloitteinnovation.us.hbx.edbc.eligibility.maxaptcamount.businessrules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Household {

    private Integer lowerTier;
    private Integer higherTier;
    private Integer householdSize;
    private BigDecimal initialFPL;
    private BigDecimal finalFPL;
    private BigDecimal familyIncomeThreshold;
    private BigDecimal maximumAnnualPremium;
    private BigDecimal annualTaxCredit;
    private BigDecimal monthlyTaxCredit;
    private BigDecimal annualGrosssIncome;
    private BigDecimal secondLowestSiverPlanAmount;
    private Boolean premiumTaxEligibility;
    private List<FPLLimit> fPLLimit = new ArrayList<>();

    public Integer getLowerTier() {
        return lowerTier;
    }

    public void setLowerTier(Integer lowerTier) {
        this.lowerTier = lowerTier;
    }

    public Integer getHigherTier() {
        return higherTier;
    }

    public void setHigherTier(Integer higherTier) {
        this.higherTier = higherTier;
    }

    public Integer getHouseholdSize() {
        return householdSize;
    }

    public void setHouseholdSize(Integer householdSize) {
        this.householdSize = householdSize;
    }

    public BigDecimal getInitialFPL() {
        return initialFPL;
    }

    public void setInitialFPL(BigDecimal initialFPL) {
        this.initialFPL = initialFPL;
    }

    public BigDecimal getFinalFPL() {
        return finalFPL;
    }

    public void setFinalFPL(BigDecimal finalFPL) {
        this.finalFPL = finalFPL;
    }

    public BigDecimal getFamilyIncomeThreshold() {
        return familyIncomeThreshold;
    }

    public void setFamilyIncomeThreshold(BigDecimal familyIncomeThreshold) {
        this.familyIncomeThreshold = familyIncomeThreshold;
    }

    public BigDecimal getMaximumAnnualPremium() {
        return maximumAnnualPremium;
    }

    public void setMaximumAnnualPremium(BigDecimal maximumAnnualPremium) {
        this.maximumAnnualPremium = maximumAnnualPremium;
    }

    public BigDecimal getAnnualTaxCredit() {
        return annualTaxCredit;
    }

    public void setAnnualTaxCredit(BigDecimal annualTaxCredit) {
        this.annualTaxCredit = annualTaxCredit;
    }

    public BigDecimal getMonthlyTaxCredit() {
        return monthlyTaxCredit;
    }

    public void setMonthlyTaxCredit(BigDecimal monthlyTaxCredit) {
        this.monthlyTaxCredit = monthlyTaxCredit;
    }

    public BigDecimal getAnnualGrosssIncome() {
        return annualGrosssIncome;
    }

    public void setAnnualGrosssIncome(BigDecimal annualGrosssIncome) {
        this.annualGrosssIncome = annualGrosssIncome;
    }

    public BigDecimal getSecondLowestSiverPlanAmount() {
        return secondLowestSiverPlanAmount;
    }

    public void setSecondLowestSiverPlanAmount(BigDecimal secondLowestSiverPlanAmount) {
        this.secondLowestSiverPlanAmount = secondLowestSiverPlanAmount;
    }

    public List<FPLLimit> getfPLLimit() {
        return fPLLimit;
    }

    public void setfPLLimit(List<FPLLimit> fPLLimit) {
        this.fPLLimit = fPLLimit;
    }

    public Boolean getPremiumTaxEligibility() {
        return premiumTaxEligibility;
    }

    public void setPremiumTaxEligibility(Boolean premiumTaxEligibility) {
        this.premiumTaxEligibility = premiumTaxEligibility;
    }


}