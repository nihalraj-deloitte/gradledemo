package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.LocalDateTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class NonFinData {

    @XmlElement(name = "EffectiveBeginDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime effectiveBeginDateField;

    @XmlElement(name = "EffectiveEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime effectiveEndDateField;

    @XmlElement(name = "IncomeCategory")
    private String incomeCategoryField;

    @XmlElement(name = "IsCascaded")
    private String isCascadedField;

    @XmlElement(name = "IsCertifiable")
    private Boolean isCertifiableField;

    @XmlElement(name = "IsCurrentIncomeFPL")
    private Boolean isCurrentIncomeFPLField;

    @XmlElement(name = "IsCurrentIncomeResonableCompatible")
    private Boolean isCurrentIncomeResonableCompatibleField;

    @XmlElement(name = "IsDoNotApplySuppRecoup")
    private Boolean isDoNotApplySuppRecoupField;

    @XmlElement(name = "IsDoNotFail")
    private Boolean isDoNotFailField;

    @XmlElement(name = "IsDoNotPerformEffectiveDatesCheck")
    private Boolean isDoNotPerformEffectiveDatesCheckField;

    @XmlElement(name = "IsFederalIncomeFPL")
    private Boolean isFederalIncomeFPLField;

    @XmlElement(name = "IsFederalResonableCompatible")
    private Boolean isFederalResonableCompatibleField;

    @XmlElement(name = "IsNoIncomeVerificationRequired")
    private Boolean isNoIncomeVerificationRequiredField;

    @XmlElement(name = "IsSsnApplied")
    private String isSsnAppliedField;

    @XmlElement(name = "IsSsnGoodCauseReason")
    private String isSsnGoodCauseReasonField;

    @XmlElement(name = "IsStateReasonableCompatible")
    private Boolean isStateReasonableCompatibleField;

    @XmlElement(name = "IsTechnicalException")
    private Boolean isTechnicalExceptionField;

    @XmlElement(name = "IsTimely")
    private Boolean isTimelyField;

    @XmlElement(name = "IsVerified")
    private Boolean isVerifiedField;

    @XmlElement(name = "NonFinancialDataType")
    private String nonFinancialDataTypeField;

    @XmlElement(name = "NonFinancialDetailRef")
    private String nonFinancialDetailRefField;

    @XmlElement(name = "NonFinancialIndividualId")
    private Long nonFinancialIndividualIdField;

    @XmlElement(name = "NonFinancialReportDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime nonFinancialReportDateField;

    @XmlElement(name = "NonFinancialVerificationReceivedDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime nonFinancialVerificationReceivedDateField;

    @XmlElement(name = "RelatedIndividualId")
    private Long relatedIndividualIdField;

    @XmlElement(name = "TempDoNotPendGroup")
    private Boolean tempDoNotPendGroupField;

    @XmlElement(name = "VCLCode")
    private String vCLCodeField;

    @XmlElement(name = "VCLRiskLevel")
    private String vCLRiskLevelField;

    @XmlElement(name = "VCLWithinDueDate")
    private String vCLWithinDueDateField;

    @XmlElement(name = "VerificationResultCode")
    private String verificationResultCodeField;

    @XmlElement(name = "individual")
    private Individual individualField;

    private String idField;

    private String hrefField;

    @XmlElement(name = "Exists_6000_775_1")
    private Boolean exists_6000_775_1Field;

    @XmlElement(name = "Exists_6000_775_2")
    private Boolean exists_6000_775_2Field;

    @XmlElement(name = "Perform_6000_775")
    private Boolean perform_6000_775Field;

    /**
     *
     */
    public LocalDateTime getEffectiveBeginDate() {
        return effectiveBeginDateField;
    }

    public void setEffectiveBeginDate(LocalDateTime value) {
        effectiveBeginDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getEffectiveEndDate() {
        return effectiveEndDateField;
    }

    public void setEffectiveEndDate(LocalDateTime value) {
        effectiveEndDateField = value;
    }

    /**
     *
     */
    public String getIncomeCategory() {
        return incomeCategoryField;
    }

    public void setIncomeCategory(String value) {
        incomeCategoryField = value;
    }

    /**
     *
     */
    public String getIsCascaded() {
        return isCascadedField;
    }

    public void setIsCascaded(String value) {
        isCascadedField = value;
    }

    /**
     *
     */
    public Boolean getIsCertifiable() {
        return isCertifiableField;
    }

    public void setIsCertifiable(Boolean value) {
        isCertifiableField = value;
    }

    /**
     *
     */
    public Boolean getIsCurrentIncomeFPL() {
        return isCurrentIncomeFPLField;
    }

    public void setIsCurrentIncomeFPL(Boolean value) {
        isCurrentIncomeFPLField = value;
    }

    /**
     *
     */
    public Boolean getIsCurrentIncomeResonableCompatible() {
        return isCurrentIncomeResonableCompatibleField;
    }

    public void setIsCurrentIncomeResonableCompatible(Boolean value) {
        isCurrentIncomeResonableCompatibleField = value;
    }

    /**
     *
     */
    public Boolean getIsDoNotApplySuppRecoup() {
        return isDoNotApplySuppRecoupField;
    }

    public void setIsDoNotApplySuppRecoup(Boolean value) {
        isDoNotApplySuppRecoupField = value;
    }

    /**
     *
     */
    public Boolean getIsDoNotFail() {
        return isDoNotFailField;
    }

    public void setIsDoNotFail(Boolean value) {
        isDoNotFailField = value;
    }

    /**
     *
     */
    public Boolean getIsDoNotPerformEffectiveDatesCheck() {
        return isDoNotPerformEffectiveDatesCheckField;
    }

    public void setIsDoNotPerformEffectiveDatesCheck(Boolean value) {
        isDoNotPerformEffectiveDatesCheckField = value;
    }

    /**
     *
     */
    public Boolean getIsFederalIncomeFPL() {
        return isFederalIncomeFPLField;
    }

    public void setIsFederalIncomeFPL(Boolean value) {
        isFederalIncomeFPLField = value;
    }

    /**
     *
     */
    public Boolean getIsFederalResonableCompatible() {
        return isFederalResonableCompatibleField;
    }

    public void setIsFederalResonableCompatible(Boolean value) {
        isFederalResonableCompatibleField = value;
    }

    /**
     *
     */
    public Boolean getIsNoIncomeVerificationRequired() {
        return isNoIncomeVerificationRequiredField;
    }

    public void setIsNoIncomeVerificationRequired(Boolean value) {
        isNoIncomeVerificationRequiredField = value;
    }

    /**
     *
     */
    public String getIsSsnApplied() {
        return isSsnAppliedField;
    }

    public void setIsSsnApplied(String value) {
        isSsnAppliedField = value;
    }

    /**
     *
     */
    public String getIsSsnGoodCauseReason() {
        return isSsnGoodCauseReasonField;
    }

    public void setIsSsnGoodCauseReason(String value) {
        isSsnGoodCauseReasonField = value;
    }

    /**
     *
     */
    public Boolean getIsStateReasonableCompatible() {
        return isStateReasonableCompatibleField;
    }

    public void setIsStateReasonableCompatible(Boolean value) {
        isStateReasonableCompatibleField = value;
    }

    /**
     *
     */
    public Boolean getIsTechnicalException() {
        return isTechnicalExceptionField;
    }

    public void setIsTechnicalException(Boolean value) {
        isTechnicalExceptionField = value;
    }

    /**
     *
     */
    public Boolean getIsTimely() {
        return isTimelyField;
    }

    public void setIsTimely(Boolean value) {
        isTimelyField = value;
    }

    /**
     *
     */
    public Boolean getIsVerified() {
        return isVerifiedField;
    }

    public void setIsVerified(Boolean value) {
        isVerifiedField = value;
    }

    /**
     *
     */
    public String getNonFinancialDataType() {
        return nonFinancialDataTypeField;
    }

    public void setNonFinancialDataType(String value) {
        nonFinancialDataTypeField = value;
    }

    /**
     *
     */
    public String getNonFinancialDetailRef() {
        return nonFinancialDetailRefField;
    }

    public void setNonFinancialDetailRef(String value) {
        nonFinancialDetailRefField = value;
    }

    /**
     *
     */
    public Long getNonFinancialIndividualId() {
        return nonFinancialIndividualIdField;
    }

    public void setNonFinancialIndividualId(Long value) {
        nonFinancialIndividualIdField = value;
    }

    /**
     *
     */
    public LocalDateTime getNonFinancialReportDate() {
        return nonFinancialReportDateField;
    }

    public void setNonFinancialReportDate(LocalDateTime value) {
        nonFinancialReportDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getNonFinancialVerificationReceivedDate() {
        return nonFinancialVerificationReceivedDateField;
    }

    public void setNonFinancialVerificationReceivedDate(LocalDateTime value) {
        nonFinancialVerificationReceivedDateField = value;
    }

    /**
     *
     */
    public Long getRelatedIndividualId() {
        return relatedIndividualIdField;
    }

    public void setRelatedIndividualId(Long value) {
        relatedIndividualIdField = value;
    }

    /**
     *
     */
    public Boolean getTempDoNotPendGroup() {
        return tempDoNotPendGroupField;
    }

    public void setTempDoNotPendGroup(Boolean value) {
        tempDoNotPendGroupField = value;
    }

    /**
     *
     */
    public String getVCLCode() {
        return vCLCodeField;
    }

    public void setVCLCode(String value) {
        vCLCodeField = value;
    }

    /**
     *
     */
    public String getVCLRiskLevel() {
        return vCLRiskLevelField;
    }

    public void setVCLRiskLevel(String value) {
        vCLRiskLevelField = value;
    }

    /**
     *
     */
    public String getVCLWithinDueDate() {
        return vCLWithinDueDateField;
    }

    public void setVCLWithinDueDate(String value) {
        vCLWithinDueDateField = value;
    }

    /**
     *
     */
    public String getVerificationResultCode() {
        return verificationResultCodeField;
    }

    public void setVerificationResultCode(String value) {
        verificationResultCodeField = value;
    }

    /**
     *
     */
    public Individual getindividual() {
        return individualField;
    }

    public void setindividual(Individual value) {
        individualField = value;
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

    public Boolean getExists_6000_775_1() {
        return exists_6000_775_1Field;
    }

    public void setExists_6000_775_1(Boolean exists_6000_775_1Field) {
        this.exists_6000_775_1Field = exists_6000_775_1Field;
    }

    public Boolean getExists_6000_775_2() {
        return exists_6000_775_2Field;
    }

    public void setExists_6000_775_2(Boolean exists_6000_775_2Field) {
        this.exists_6000_775_2Field = exists_6000_775_2Field;
    }

    public Boolean getPerform_6000_775() {
        return perform_6000_775Field;
    }

    public void setPerform_6000_775(Boolean perform_6000_775Field) {
        this.perform_6000_775Field = perform_6000_775Field;
    }

}