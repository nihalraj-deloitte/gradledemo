package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.LocalDateTimeAdapter;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.OffsetDateTimeAdapter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Case", namespace = "urn:Case")
@XmlAccessorType(XmlAccessType.FIELD)
public class Case {

    @XmlElement(name = "AdverseActionMonth")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime adverseActionMonthField;

    @XmlElement(name = "AnnualEarnedIncomeTaxExempt")
    private BigDecimal annualEarnedIncomeTaxExemptField;

    @XmlElement(name = "AnnualUnearnedIncomeTaxExempt")
    private BigDecimal annualUnearnedIncomeTaxExemptField;

    @XmlElement(name = "ApplicationDate")
    @XmlJavaTypeAdapter(OffsetDateTimeAdapter.class)
    private LocalDateTime applicationDateField;


    @XmlElement(name = "CaseMode")
    private String caseModeField;

    @XmlElement(name = "CutOffDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime cutOffDateField;

    @XmlElement(name = "EDBCRunDate")
    @XmlJavaTypeAdapter(OffsetDateTimeAdapter.class)
    private LocalDateTime eDBCRunDateField;

    @XmlElement(name = "HasOptedOut")
    private Boolean hasOptedOutField;

    @XmlElement(name = "IncomeReasonableCompatibilityPcLimit")
    private BigDecimal incomeReasonableCompatibilityPcLimitField;

    @XmlElement(name = "IndividualCount")
    private BigDecimal individualCountField;


    @XmlElement(name = "IsCaseWithdrawn")
    private Boolean isCaseWithdrawnField;


    @XmlElement(name = "IsHOHDeceased")
    private Boolean isHOHDeceasedField;

    @XmlElement(name = "IsInactiveAPTC")
    private Boolean isInactiveAPTCField;

    @XmlElement(name = "IsRetainNxtMonthEDG")
    private Boolean isRetainNxtMonthEDGField;


    @XmlElement(name = "IsSupervisorOverride")
    private Boolean isSupervisorOverrideField;

    @XmlElement(name = "PaymentBeginDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime paymentBeginDateField;

    @XmlElement(name = "PremiumThresholdEDGIncome")
    private BigDecimal premiumThresholdEDGIncomeField;

    @XmlElement(name = "QHPEnrollmentCutoffDay")
    private Long qHPEnrollmentCutoffDayField;

    @XmlElement(name = "R5_NonMAGIStartDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime r5_NonMAGIStartDateField;


    @XmlElement(name = "RecertReviewDueDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime recertReviewDueDateField;

    @XmlElement(name = "ReinstatementDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime reinstatementDateField;

    @XmlElement(name = "ReviewStatusCode")
    private String reviewStatusCodeField;

    private BigDecimal spendDown_BudgetLimitField;

    @XmlElement(name = "SpendDown_Limit_EdgSize_1")
    private BigDecimal spendDown_Limit_EdgSize_1Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_2")
    private BigDecimal spendDown_Limit_EdgSize_2Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_3")
    private BigDecimal spendDown_Limit_EdgSize_3Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_4")
    private BigDecimal spendDown_Limit_EdgSize_4Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_5")
    private BigDecimal spendDown_Limit_EdgSize_5Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_6")
    private BigDecimal spendDown_Limit_EdgSize_6Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_7")
    private BigDecimal spendDown_Limit_EdgSize_7Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_8")
    private BigDecimal spendDown_Limit_EdgSize_8Field;

    @XmlElement(name = "SpendDown_Limit_EdgSize_PerIndividual")
    private BigDecimal spendDown_Limit_EdgSize_PerIndividualField;

    @XmlElement(name = "WithdrawalReasonCode")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime withdrawalClosureDateField;

    @XmlElement(name = "WithdrawalReasonCode")
    private String withdrawalReasonCodeField;

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "eDGGroup")
    private List<EDGGroup> eDGGroupField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "emergencyMedicaid")
    private List<EmergencyMedicaid> emergencyMedicaidField = new ArrayList<>();


    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "fMALimit")
    private List<FMALimit> fMALimitField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "fPLTypeOfAssistance")
    private List<FPLTypeOfAssistance> fPLTypeOfAssistanceField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "individual")
    private List<Individual> individualField = new ArrayList<>();

    @XmlElement(name = "mAGIStandardDeductionField")
    private MAGIStandardDeduction mAGIStandardDeductionField;


    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "r5_PayDetail")
    private List<R5_PayDetail> r5_PayDetailField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "recertification")
    private List<Recertification> recertificationField = new ArrayList<>();

    @XmlElement(name = "referenceTable")
    private ReferenceTable referenceTableField;

    @XmlElement(name = "Id")
    private String idField;

    @XmlElement(name = "Href")
    private String hrefField;

    @XmlElement(name = "HasUnbornChild")
    private Boolean hasUnbornChildField;

    @XmlElement(name = "R5_TempEdgTraceIdIndex")
    private Integer r5_TempEdgTraceIdIndexField;

    @XmlElement(name = "constants")
    private Constants constants;

    @XmlElement(name = "ToEvaluateMAGI")
    private boolean ToEvaluateMAGI;

    private List<CSRTier> CSRTierReference = new ArrayList<CSRTier>();

    public List<CSRTier> getCSRTierReference() {
        return CSRTierReference;
    }

    public void setCSRTierReference(List<CSRTier> cSRTierReference) {
        CSRTierReference = cSRTierReference;
    }


    private Boolean compareAllIncome;

    public Boolean getCompareAllIncome() {
        return compareAllIncome;
    }

    public void setCompareAllIncome(Boolean compareAllIncome) {
        this.compareAllIncome = compareAllIncome;
    }

    /**
     *
     */
    public LocalDateTime getAdverseActionMonth() {
        return adverseActionMonthField;
    }

    public void setAdverseActionMonth(LocalDateTime value) {
        adverseActionMonthField = value;
    }

    /**
     *
     */
    public BigDecimal getAnnualEarnedIncomeTaxExempt() {
        return annualEarnedIncomeTaxExemptField;
    }

    public void setAnnualEarnedIncomeTaxExempt(BigDecimal value) {
        annualEarnedIncomeTaxExemptField = value;
    }

    /**
     *
     */
    public BigDecimal getAnnualUnearnedIncomeTaxExempt() {
        return annualUnearnedIncomeTaxExemptField;
    }

    public void setAnnualUnearnedIncomeTaxExempt(BigDecimal value) {
        annualUnearnedIncomeTaxExemptField = value;
    }

    /**
     *
     */
    public LocalDateTime getApplicationDate() {
        return applicationDateField;
    }

    public void setApplicationDate(LocalDateTime value) {
        applicationDateField = value;
    }


    /**
     *
     */
    public String getCaseMode() {
        return caseModeField;
    }

    public void setCaseMode(String value) {
        caseModeField = value;
    }

    /**
     *
     */
    public LocalDateTime getCutOffDate() {
        return cutOffDateField;
    }

    public void setCutOffDate(LocalDateTime value) {
        cutOffDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getEDBCRunDate() {
        return eDBCRunDateField;
    }

    public void setEDBCRunDate(LocalDateTime value) {
        eDBCRunDateField = value;
    }

    /**
     *
     */
    public Boolean getHasOptedOut() {
        return hasOptedOutField;
    }

    public void setHasOptedOut(Boolean value) {
        hasOptedOutField = value;
    }

    /**
     *
     */
    public BigDecimal getIncomeReasonableCompatibilityPcLimit() {
        return incomeReasonableCompatibilityPcLimitField;
    }

    public void setIncomeReasonableCompatibilityPcLimit(BigDecimal value) {
        incomeReasonableCompatibilityPcLimitField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualCount() {
        return individualCountField;
    }

    public void setIndividualCount(BigDecimal value) {
        individualCountField = value;
    }

    /**
     *
     */

    /**
     *
     */
    public Boolean getIsCaseWithdrawn() {
        return isCaseWithdrawnField;
    }

    public void setIsCaseWithdrawn(Boolean value) {
        isCaseWithdrawnField = value;
    }

    /**
     *
     */

    /**
     *
     */

    /**
     *
     */
    public Boolean getIsHOHDeceased() {
        return isHOHDeceasedField;
    }

    public void setIsHOHDeceased(Boolean value) {
        isHOHDeceasedField = value;
    }

    /**
     *
     */
    public Boolean getIsInactiveAPTC() {
        return isInactiveAPTCField;
    }

    public void setIsInactiveAPTC(Boolean value) {
        isInactiveAPTCField = value;
    }

    /**
     *
     */
    public Boolean getIsRetainNxtMonthEDG() {
        return isRetainNxtMonthEDGField;
    }

    public void setIsRetainNxtMonthEDG(Boolean value) {
        isRetainNxtMonthEDGField = value;
    }

    /**
     *
     */


    /**
     *
     */
    public Boolean getIsSupervisorOverride() {
        return isSupervisorOverrideField;
    }

    public void setIsSupervisorOverride(Boolean value) {
        isSupervisorOverrideField = value;
    }

    /**
     *
     */
    public LocalDateTime getPaymentBeginDate() {
        return paymentBeginDateField;
    }

    public void setPaymentBeginDate(LocalDateTime value) {
        paymentBeginDateField = value;
    }

    /**
     *
     */
    public BigDecimal getPremiumThresholdEDGIncome() {
        return premiumThresholdEDGIncomeField;
    }

    public void setPremiumThresholdEDGIncome(BigDecimal value) {
        premiumThresholdEDGIncomeField = value;
    }

    /**
     *
     */
    public Long getQHPEnrollmentCutoffDay() {
        return qHPEnrollmentCutoffDayField;
    }

    public void setQHPEnrollmentCutoffDay(Long value) {
        qHPEnrollmentCutoffDayField = value;
    }

    /**
     *
     */
    public LocalDateTime getR5_NonMAGIStartDate() {
        return r5_NonMAGIStartDateField;
    }

    public void setR5_NonMAGIStartDate(LocalDateTime value) {
        r5_NonMAGIStartDateField = value;
    }


    /**
     *
     */
    public LocalDateTime getRecertReviewDueDate() {
        return recertReviewDueDateField;
    }

    public void setRecertReviewDueDate(LocalDateTime value) {
        recertReviewDueDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getReinstatementDate() {
        return reinstatementDateField;
    }

    public void setReinstatementDate(LocalDateTime value) {
        reinstatementDateField = value;
    }

    /**
     *
     */
    public String getReviewStatusCode() {
        return reviewStatusCodeField;
    }

    public void setReviewStatusCode(String value) {
        reviewStatusCodeField = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_BudgetLimit() {
        return spendDown_BudgetLimitField;
    }

    public void setSpendDown_BudgetLimit(BigDecimal value) {
        spendDown_BudgetLimitField = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_1() {
        return spendDown_Limit_EdgSize_1Field;
    }

    public void setSpendDown_Limit_EdgSize_1(BigDecimal value) {
        spendDown_Limit_EdgSize_1Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_2() {
        return spendDown_Limit_EdgSize_2Field;
    }

    public void setSpendDown_Limit_EdgSize_2(BigDecimal value) {
        spendDown_Limit_EdgSize_2Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_3() {
        return spendDown_Limit_EdgSize_3Field;
    }

    public void setSpendDown_Limit_EdgSize_3(BigDecimal value) {
        spendDown_Limit_EdgSize_3Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_4() {
        return spendDown_Limit_EdgSize_4Field;
    }

    public void setSpendDown_Limit_EdgSize_4(BigDecimal value) {
        spendDown_Limit_EdgSize_4Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_5() {
        return spendDown_Limit_EdgSize_5Field;
    }

    public void setSpendDown_Limit_EdgSize_5(BigDecimal value) {
        spendDown_Limit_EdgSize_5Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_6() {
        return spendDown_Limit_EdgSize_6Field;
    }

    public void setSpendDown_Limit_EdgSize_6(BigDecimal value) {
        spendDown_Limit_EdgSize_6Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_7() {
        return spendDown_Limit_EdgSize_7Field;
    }

    public void setSpendDown_Limit_EdgSize_7(BigDecimal value) {
        spendDown_Limit_EdgSize_7Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_8() {
        return spendDown_Limit_EdgSize_8Field;
    }

    public void setSpendDown_Limit_EdgSize_8(BigDecimal value) {
        spendDown_Limit_EdgSize_8Field = value;
    }

    /**
     *
     */
    public BigDecimal getSpendDown_Limit_EdgSize_PerIndividual() {
        return spendDown_Limit_EdgSize_PerIndividualField;
    }

    public void setSpendDown_Limit_EdgSize_PerIndividual(BigDecimal value) {
        spendDown_Limit_EdgSize_PerIndividualField = value;
    }

    /**
     *
     */
    public LocalDateTime getWithdrawalClosureDate() {
        return withdrawalClosureDateField;
    }

    public void setWithdrawalClosureDate(LocalDateTime value) {
        withdrawalClosureDateField = value;
    }

    /**
     *
     */
    public String getWithdrawalReasonCode() {
        return withdrawalReasonCodeField;
    }

    public void setWithdrawalReasonCode(String value) {
        withdrawalReasonCodeField = value;
    }

    /**
     *
     */
    public List<EDGGroup> geteDGGroup() {
        return eDGGroupField;
    }

    public void seteDGGroup(List<EDGGroup> value) {
        eDGGroupField = value;
    }

    /**
     *
     */
    public List<EmergencyMedicaid> getemergencyMedicaid() {
        return emergencyMedicaidField;
    }

    public void setemergencyMedicaid(List<EmergencyMedicaid> value) {
        emergencyMedicaidField = value;
    }

    /**
     *
     */

    public List<FMALimit> getfMALimit() {
        return fMALimitField;
    }

    public void setfMALimit(List<FMALimit> value) {
        fMALimitField = value;
    }

    /**
     *
     */
    public List<FPLTypeOfAssistance> getfPLTypeOfAssistance() {
        return fPLTypeOfAssistanceField;
    }

    public void setfPLTypeOfAssistance(List<FPLTypeOfAssistance> value) {
        fPLTypeOfAssistanceField = value;
    }

    /**
     *
     */
    public List<Individual> getindividual() {
        return individualField;
    }

    public void setindividual(List<Individual> value) {
        individualField = value;
    }

    /**
     *
     */
    public MAGIStandardDeduction getmAGIStandardDeduction() {
        return mAGIStandardDeductionField;
    }

    public void setmAGIStandardDeduction(MAGIStandardDeduction value) {
        mAGIStandardDeductionField = value;
    }

    /**
     *
     */

    public List<R5_PayDetail> getr5_PayDetail() {
        return r5_PayDetailField;
    }

    public void setr5_PayDetail(List<R5_PayDetail> value) {
        r5_PayDetailField = value;
    }

    /**
     *
     */
    public List<Recertification> getrecertification() {
        return recertificationField;
    }

    public void setrecertification(List<Recertification> value) {
        recertificationField = value;
    }

    /**
     *
     */
    public ReferenceTable getreferenceTable() {
        return referenceTableField;
    }

    public void setreferenceTable(ReferenceTable value) {
        referenceTableField = value;
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

    public Boolean getHasUnbornChild() {
        return hasUnbornChildField;
    }

    public void setHasUnbornChild(Boolean hasUnbornChildField) {
        this.hasUnbornChildField = hasUnbornChildField;
    }

    public Integer getR5_TempEdgTraceIdIndex() {
        return r5_TempEdgTraceIdIndexField;
    }

    public void setR5_TempEdgTraceIdIndex(Integer r5_TempEdgTraceIdIndexField) {
        this.r5_TempEdgTraceIdIndexField = r5_TempEdgTraceIdIndexField;
    }


    public Constants getConstants() {
        return constants;
    }

    public void setConstants(Constants constants) {
        this.constants = constants;
    }

    public boolean getToEvaluateMAGI() {
        return ToEvaluateMAGI;
    }

    public void setToEvaluateMAGI(boolean ToEvaluateMAGI) {
        this.ToEvaluateMAGI = ToEvaluateMAGI;
    }

    private boolean stateCheckFFC;

    public boolean getStateCheckFFC() {
        return stateCheckFFC;
    }

    public void setStateCheckFFC(boolean stateCheckFFC) {
        this.stateCheckFFC = stateCheckFFC;
    }

    private String currentStateCode;

    public String getCurrentStateCode() {
        return currentStateCode;
    }

    public void setCurrentStateCode(String currentStateCode) {
        this.currentStateCode = currentStateCode;
    }
}