package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.LocalDateTimeAdapter;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.OffsetDateTimeAdapter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EDGGroup {

    @XmlElement(name = "NonMagiAssessed")
    private Boolean nonMagiAssessedField;

    @XmlElement(name = "IsCategorical")
    private Boolean IsCategoricalField;

    @XmlElement(name = "AffordabilityTestResultCode")
    private String affordabilityTestResultCodeField;

    @XmlElement(name = "APTCResultCode")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime applicationDateField;

    @XmlElement(name = "APTCResultCode")
    private String aPTCResultCodeField;

    @XmlElement(name = "CategoryIndicator")
    private String categoryIndicatorField;


    @XmlElement(name = "CertifiedGroupAdultCount")
    private Long certifiedGroupAdultCountField;

    @XmlElement(name = "CertifiedGroupChildCount")
    private Long certifiedGroupChildCountField;

    @XmlElement(name = "CertifiedGroupSize")
    private Long certifiedGroupSizeField;

    @XmlElement(name = "CreatedForDeceasedIndividual")
    private Boolean createdForDeceasedIndividualField;


    @XmlElement(name = "CreatedForIndividualId")
    private Long createdForIndividualIdField;

    @XmlElement(name = "CSRCategoryCode")
    private String cSRCategoryCodeField;

    public List<CSRTier> getCsrTiers() {
        return csrTiers;
    }

    public void setCsrTiers(List<CSRTier> csrTiers) {
        this.csrTiers = csrTiers;
    }

    private List<CSRTier> csrTiers = new ArrayList<>();


    @XmlElement(name = "EDBCRunDate")
    @XmlJavaTypeAdapter(OffsetDateTimeAdapter.class)
    private LocalDateTime eDBCRunDateField;

    @XmlElement(name = "EDGEligibilityResultCode")
    private String eDGEligibilityResultCodeField;

    @XmlElement(name = "EDGSize")
    private Long eDGSizeField;

    @XmlElement(name = "EdgSuspensionIndicator")
    private String edgSuspensionIndicatorField;

    @XmlElement(name = "EDGTraceId")
    private Long eDGTraceIdField;

    @XmlElement(name = "EDM")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime eDMField;

    @XmlElement(name = "EDMEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime eDMEndDateField;

    @XmlElement(name = "EligibilityBeginDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime eligibilityBeginDateField;

    @XmlElement(name = "EstimatedEligibilityEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime estimatedEligibilityEndDateField;

    @XmlElement(name = "FamilyBudgetSize")
    private Long familyBudgetSizeField;

    @XmlElement(name = "FederalGroupReasonableCompatible")
    private String federalGroupReasonableCompatibleField;

    @XmlElement(name = "FedErrorCode")
    private String fedErrorCodeField;

    @XmlElement(name = "FilerType")
    private String filerTypeField;

    @XmlElement(name = "FinancialEligibilityResultCode")
    private String financialEligibilityResultCodeField;

    @XmlElement(name = "FPLAmountWithDisregard")
    private BigDecimal fPLAmountWithDisregardField;

    @XmlElement(name = "FPLAmountWithoutDisregard")
    private BigDecimal fPLAmountWithoutDisregardField;

    @XmlElement(name = "FPLLimitAmount")
    private BigDecimal fPLLimitAmountField;

    @XmlElement(name = "FPLPercentageWithDisregard")
    private String fPLPercentageWithDisregardField;

    @XmlElement(name = "HouseholdExpenseAmount")
    private BigDecimal householdExpenseAmountField;

    @XmlElement(name = "HouseholdIncomeAmount")
    private BigDecimal householdIncomeAmountField;

    @XmlElement(name = "IsAdverseActionAllowed")
    private Boolean isAdverseActionAllowedField;

    @XmlElement(name = "IsAlienEMA")
    private Boolean isAlienEMAField;

    @XmlElement(name = "IsAllIneligible")
    private Boolean isAllIneligibleField;

    @XmlElement(name = "IsCEEligible")
    private Boolean isCEEligibleField;

    @XmlElement(name = "IsDeceasedClosure")
    private Boolean isDeceasedClosureField;

    @XmlElement(name = "IsDeceasedDenialEDG")
    private Boolean isDeceasedDenialEDGField;

    @XmlElement(name = "IsDifferentFederalIds")
    private Boolean isDifferentFederalIdsField;

    @XmlElement(name = "IsDummyGroupCreated")
    private Boolean isDummyGroupCreatedField;

    @XmlElement(name = "IsEDGOverride")
    private Boolean isEDGOverrideField;

    @XmlElement(name = "IsEDMInEMAExtPeriod")
    private Boolean isEDMInEMAExtPeriodField;

    @XmlElement(name = "IsExit")
    private Boolean isExitField;

    @XmlElement(name = "IsFederalAmountExist")
    private Boolean isFederalAmountExistField;

    @XmlElement(name = "IsFinancialEligibilityTestRequired")
    private Boolean isFinancialEligibilityTestRequiredField;

    @XmlElement(name = "IsGroupIncomeBelow100FPL")
    private Boolean isGroupIncomeBelow100FPLField;

    @XmlElement(name = "IsIncomeDisregardConsidered")
    private Boolean isIncomeDisregardConsideredField;

    @XmlElement(name = "IsIncomeTestRequired")
    private Boolean isIncomeTestRequiredField;

    @XmlElement(name = "IsInvalid")
    private Boolean isInvalidField;

    @XmlElement(name = "IsPotentiallySSIEligible")
    private Boolean isPotentiallySSIEligibleField;

    @XmlElement(name = "IsSelfAttestedIncomeConsidered")
    private Boolean isSelfAttestedIncomeConsideredField;

    @XmlElement(name = "IsStateAmountExist")
    private Boolean isStateAmountExistField;

    @XmlElement(name = "IsUCase")
    private Boolean isUCaseField;

    @XmlElement(name = "IsValidErrorCode")
    private Boolean isValidErrorCodeField;

    @XmlElement(name = "IsVCIAmountExist")
    private Boolean isVCIAmountExistField;

    @XmlElement(name = "JointFederalIncomeAmount")
    private BigDecimal jointFederalIncomeAmountField;

    @XmlElement(name = "JointSelfAttestedIncomeCalculated")
    private BigDecimal jointSelfAttestedIncomeCalculatedField;

    @XmlElement(name = "SbeHCEApprovalReason")
    private String SbeHCEApprovalReasonField;

    @XmlElement(name = "MagiStandardDeduction")
    private BigDecimal magiStandardDeductionField;

    @XmlElement(name = "MECEligibilityResultCode")
    private String mECEligibilityResultCodeField;


    @XmlElement(name = "NoAPTCReconcile")
    private Boolean noAPTCReconcileField;

    @XmlElement(name = "NonFinancialEligibilityResultCode")
    private String nonFinancialEligibilityResultCodeField;

    @XmlElement(name = "PaymentBeginDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime paymentBeginDateField;

    @XmlElement(name = "PriorMedicaidCode")
    private String priorMedicaidCodeField;

    @XmlElement(name = "ProgramActivityType")
    private String programActivityTypeField;

    @XmlElement(name = "ProgramCode")
    private String programCodeField;

    @XmlElement(name = "ProgramMode")
    private String programModeField;

    @XmlElement(name = "ProgramRequestDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime programRequestDateField;

    @XmlElement(name = "ProgramRescindDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime programRescindDateField;

    @XmlElement(name = "ProgramStatus")
    private String programStatusField;

    @XmlElement(name = "R5_IsSpenddownEdg")
    private Boolean r5_IsSpenddownEdgField;

    @XmlElement(name = "SelfAttestedIncomeExist")
    private Boolean selfAttestedIncomeExistField;

    @XmlElement(name = "SpecialTriggerCode")
    private String specialTriggerCodeField;

    @XmlElement(name = "SwicaErrorCode")
    private String swicaErrorCodeField;

    @XmlElement(name = "TaxGroupId")
    private Long taxGroupIdField;

    @XmlElement(name = "TOAPriorityNumber")
    private Long tOAPriorityNumberField;

    @XmlElement(name = "TypeOfAssistance")
    private String typeOfAssistanceField;

    @XmlElement(name = "VCIErrorCode")
    private String vCIErrorCodeField;

    @XmlElement(name = "VerificationResultCode")
    private String verificationResultCodeField;


    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "cascadeNoticeReason")
    private List<CascadeNoticeReason> cascadeNoticeReasonField = new ArrayList<>();

    @XmlElement(name = "case")
    private Case caseField;

    @XmlElement(name = "edgBudget")
    private EDGBudget edgBudgetField;

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "eDGIndividual")
    private List<EDGIndividual> eDGIndividualField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "familySizeFMALimit")
    private List<FamilySizeFPLLimit> familySizeFMALimitField = new ArrayList<>();

    @XmlElement(name = "fMALimit")
    private FMALimit fMALimitField;

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "notice")
    private List<Notice> noticeField = new ArrayList<>();

    @XmlElement(name = "recertification")
    private Recertification recertificationField;

    @XmlElement(name = "referenceTable")
    private ReferenceTable referenceTableField;

    private String idField;

    private String hrefField;

    @XmlElement(name = "AdditionalCertifiedGroupSize")
    private Integer additionalCertifiedGroupSizeField;

    @XmlElement(name = "AFDC_Limit")
    private BigDecimal aFDC_LimitField;

    @XmlElement(name = "DeemedTMA")
    private Boolean deemedTMAField;

    @XmlElement(name = "FPL_100_Percent")
    private BigDecimal fPL_100_PercentField;

    @XmlElement(name = "FPL_133_Percent")
    private BigDecimal fPL_133_PercentField;

    @XmlElement(name = "FPL_150_Percent")
    private BigDecimal fPL_150_PercentField;

    @XmlElement(name = "FPL_185_Percent")
    private BigDecimal fPL_185_PercentField;

    @XmlElement(name = "FPL_200_Percent")
    private BigDecimal fPL_200_PercentField;

    @XmlElement(name = "FPL_250_Percent")
    private BigDecimal fPL_250_PercentField;

    @XmlElement(name = "FPL_300_Percent")
    private BigDecimal fPL_300_PercentField;

    @XmlElement(name = "FPL_400_Percent")
    private BigDecimal fPL_400_PercentField;

    @XmlElement(name = "Household_Income_ADFF")
    private BigDecimal household_Income_ADFFField;

    @XmlElement(name = "Household_Income_ADLT")
    private BigDecimal household_Income_ADLTField;

    @XmlElement(name = "Household_Income_ADPR")
    private BigDecimal household_Income_ADPRField;

    @XmlElement(name = "Household_Income_APTC")
    private BigDecimal household_Income_APTCField;

    @XmlElement(name = "Household_Income_CHEX")
    private BigDecimal household_Income_CHEXField;

    @XmlElement(name = "Household_Income_CHIP")
    private BigDecimal household_Income_CHIPField;

    @XmlElement(name = "Household_Income_CHL1")
    private BigDecimal household_Income_CHL1Field;

    @XmlElement(name = "Household_Income_CHL2")
    private BigDecimal household_Income_CHL2Field;

    @XmlElement(name = "Household_Income_CHL3")
    private BigDecimal household_Income_CHL3Field;

    @XmlElement(name = "Household_Income_CHL4")
    private BigDecimal household_Income_CHL4Field;

    @XmlElement(name = "Household_Income_FFS1")
    private BigDecimal household_Income_FFS1Field;

    @XmlElement(name = "Household_Income_PACA")
    private BigDecimal household_Income_PACAField;

    @XmlElement(name = "Household_Income_PREG")
    private BigDecimal household_Income_PREGField;

    @XmlElement(name = "Household_Income_TMAE")
    private BigDecimal household_Income_TMAEField;

    @XmlElement(name = "Household_Income_TMAS")
    private BigDecimal household_Income_TMASField;

    @XmlElement(name = "Household_Income_TMCE")
    private BigDecimal household_Income_TMCEField;

    @XmlElement(name = "Household_Income_TMCS")
    private BigDecimal household_Income_TMCSField;

    @XmlElement(name = "HouseholdEarnedIncomeAmount")
    private BigDecimal householdEarnedIncomeAmountField;

    @XmlElement(name = "HouseholdSpousalSupportIncomeAmount")
    private BigDecimal householdSpousalSupportIncomeAmountField;

    @XmlElement(name = "IsAlienAPTC")
    private Boolean isAlienAPTCField;

    @XmlElement(name = "IsAlienEMAGiven")
    private Boolean isAlienEMAGivenField;

    @XmlElement(name = "IsDeemedBenefit")
    private Boolean isDeemedBenefitField;

    @XmlElement(name = "IsEdgToBeRetainedAndApprove")
    private Boolean isEdgToBeRetainedAndApproveField;

    @XmlElement(name = "IsFederalIncomeExist")
    private Boolean isFederalIncomeExistField;

    @XmlElement(name = "IsManuallyCreatingEDG")
    private Boolean isManuallyCreatingEDGField;

    @XmlElement(name = "IsNew")
    private Boolean isNewField;

    @XmlElement(name = "IsNonFinancialEligibilityTestRequired")
    private Boolean isNonFinancialEligibilityTestRequiredField;

    @XmlElement(name = "IsStateIncomeExist")
    private Boolean isStateIncomeExistField;

    @XmlElement(name = "IsToTemporaryRetainEdg")
    private Boolean isToTemporaryRetainEdgField;

    @XmlElement(name = "Perform_1000_1100")
    private Boolean perform_1000_1100Field;

    @XmlElement(name = "Perform_1000_1300")
    private Boolean perform_1000_1300Field;

    @XmlElement(name = "Perform_2000_002")
    private Boolean perform_2000_002Field;

    @XmlElement(name = "Perform_32_37_119_Alien_Check")
    private Boolean perform_32_37_119_Alien_CheckField;

    @XmlElement(name = "Perform_5000_050_2_1")
    private Boolean perform_5000_050_2_1Field;

    @XmlElement(name = "Perform_5000_050_2_1a")
    private Boolean perform_5000_050_2_1aField;

    @XmlElement(name = "Perform_5000_050_2_2")
    private Boolean perform_5000_050_2_2Field;

    @XmlElement(name = "Perform_5000_050_2_3")
    private Boolean perform_5000_050_2_3Field;

    @XmlElement(name = "Perform_5000_051")
    private Boolean perform_5000_051Field;

    @XmlElement(name = "Perform_5000_052")
    private Boolean perform_5000_052Field;

    @XmlElement(name = "Perform_APTC_Check_For_Dependent")
    private Boolean perform_APTC_Check_For_DependentField;

    @XmlElement(name = "Perform_APTC_Check_For_Filer")
    private Boolean perform_APTC_Check_For_FilerField;

    @XmlElement(name = "Perform_Five_Year_Bar_Check")
    private Boolean perform_Five_Year_Bar_CheckField;

    @XmlElement(name = "Perform_VLP_QNC_Check")
    private Boolean perform_VLP_QNC_CheckField;

    @XmlElement(name = "PerformEDGExit")
    private Boolean performEDGExitField;

    @XmlElement(name = "V_certifiedGrpExists_5000_005")
    private Boolean v_certifiedGrpExists_5000_005Field;

    private Boolean isEarnedIncomePresent;

    public Boolean getIsEarnedIncomePresent() {
        return isEarnedIncomePresent;
    }

    public void setIsEarnedIncomePresent(Boolean earnedIncomePresent) {
        isEarnedIncomePresent = earnedIncomePresent;
    }

    /**
     *
     */
    public String getAffordabilityTestResultCode() {
        return affordabilityTestResultCodeField;
    }

    public void setAffordabilityTestResultCode(String value) {
        affordabilityTestResultCodeField = value;
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
    public String getAPTCResultCode() {
        return aPTCResultCodeField;
    }

    public void setAPTCResultCode(String value) {
        aPTCResultCodeField = value;
    }

    /**
     *
     */
    public String getCategoryIndicator() {
        return categoryIndicatorField;
    }

    public void setCategoryIndicator(String value) {
        categoryIndicatorField = value;
    }

    /**
     *
     */
    public Long getCertifiedGroupAdultCount() {
        return certifiedGroupAdultCountField;
    }

    public void setCertifiedGroupAdultCount(Long value) {
        certifiedGroupAdultCountField = value;
    }

    /**
     *
     */
    public Long getCertifiedGroupChildCount() {
        return certifiedGroupChildCountField;
    }

    public void setCertifiedGroupChildCount(Long value) {
        certifiedGroupChildCountField = value;
    }

    /**
     *
     */
    public Long getCertifiedGroupSize() {
        return certifiedGroupSizeField;
    }

    public void setCertifiedGroupSize(Long value) {
        certifiedGroupSizeField = value;
    }

    /**
     *
     */
    public Boolean getCreatedForDeceasedIndividual() {
        return createdForDeceasedIndividualField;
    }

    public void setCreatedForDeceasedIndividual(Boolean value) {
        createdForDeceasedIndividualField = value;
    }

    /**
     *
     */
    public Long getCreatedForIndividualId() {
        return createdForIndividualIdField;
    }

    public void setCreatedForIndividualId(Long value) {
        createdForIndividualIdField = value;
    }

    /**
     *
     */
    public String getCSRCategoryCode() {
        return cSRCategoryCodeField;
    }

    public void setCSRCategoryCode(String value) {
        cSRCategoryCodeField = value;
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
    public String getEDGEligibilityResultCode() {
        return eDGEligibilityResultCodeField;
    }

    public void setEDGEligibilityResultCode(String value) {
        eDGEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public Long getEDGSize() {
        return eDGSizeField;
    }

    public void setEDGSize(Long value) {
        eDGSizeField = value;
    }

    /**
     *
     */
    public String getEdgSuspensionIndicator() {
        return edgSuspensionIndicatorField;
    }

    public void setEdgSuspensionIndicator(String value) {
        edgSuspensionIndicatorField = value;
    }

    /**
     *
     */
    public Long getEDGTraceId() {
        return eDGTraceIdField;
    }

    public void setEDGTraceId(Long value) {
        eDGTraceIdField = value;
    }

    /**
     *
     */
    public LocalDateTime getEDM() {
        return eDMField;
    }

    public void setEDM(LocalDateTime value) {
        eDMField = value;
    }

    /**
     *
     */
    public LocalDateTime getEDMEndDate() {
        return eDMEndDateField;
    }

    public void setEDMEndDate(LocalDateTime value) {
        eDMEndDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getEligibilityBeginDate() {
        return eligibilityBeginDateField;
    }

    public void setEligibilityBeginDate(LocalDateTime value) {
        eligibilityBeginDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getEstimatedEligibilityEndDate() {
        return estimatedEligibilityEndDateField;
    }

    public void setEstimatedEligibilityEndDate(LocalDateTime value) {
        estimatedEligibilityEndDateField = value;
    }

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
    public String getFederalGroupReasonableCompatible() {
        return federalGroupReasonableCompatibleField;
    }

    public void setFederalGroupReasonableCompatible(String value) {
        federalGroupReasonableCompatibleField = value;
    }

    /**
     *
     */
    public String getFedErrorCode() {
        return fedErrorCodeField;
    }

    public void setFedErrorCode(String value) {
        fedErrorCodeField = value;
    }

    /**
     *
     */
    public String getFilerType() {
        return filerTypeField;
    }

    public void setFilerType(String value) {
        filerTypeField = value;
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
    public BigDecimal getFPLAmountWithDisregard() {
        return fPLAmountWithDisregardField;
    }

    public void setFPLAmountWithDisregard(BigDecimal value) {
        fPLAmountWithDisregardField = value;
    }

    /**
     *
     */
    public BigDecimal getFPLAmountWithoutDisregard() {
        return fPLAmountWithoutDisregardField;
    }

    public void setFPLAmountWithoutDisregard(BigDecimal value) {
        fPLAmountWithoutDisregardField = value;
    }

    /**
     *
     */
    public BigDecimal getFPLLimitAmount() {
        return fPLLimitAmountField;
    }

    public void setFPLLimitAmount(BigDecimal value) {
        fPLLimitAmountField = value;
    }

    /**
     *
     */
    public String getFPLPercentageWithDisregard() {
        return fPLPercentageWithDisregardField;
    }

    public void setFPLPercentageWithDisregard(String value) {
        fPLPercentageWithDisregardField = value;
    }

    /**
     *
     */
    public BigDecimal getHouseholdExpenseAmount() {
        return householdExpenseAmountField;
    }

    public void setHouseholdExpenseAmount(BigDecimal value) {
        householdExpenseAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getHouseholdIncomeAmount() {
        return householdIncomeAmountField;
    }

    public void setHouseholdIncomeAmount(BigDecimal value) {
        householdIncomeAmountField = value;
    }

    /**
     *
     */
    public Boolean getIsAdverseActionAllowed() {
        return isAdverseActionAllowedField;
    }

    public void setIsAdverseActionAllowed(Boolean value) {
        isAdverseActionAllowedField = value;
    }

    /**
     *
     */
    public Boolean getIsAlienEMA() {
        return isAlienEMAField;
    }

    public void setIsAlienEMA(Boolean value) {
        isAlienEMAField = value;
    }

    /**
     *
     */
    public Boolean getIsAllIneligible() {
        return isAllIneligibleField;
    }

    public void setIsAllIneligible(Boolean value) {
        isAllIneligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsCEEligible() {
        return isCEEligibleField;
    }

    public void setIsCEEligible(Boolean value) {
        isCEEligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsDeceasedClosure() {
        return isDeceasedClosureField;
    }

    public void setIsDeceasedClosure(Boolean value) {
        isDeceasedClosureField = value;
    }

    /**
     *
     */
    public Boolean getIsDeceasedDenialEDG() {
        return isDeceasedDenialEDGField;
    }

    public void setIsDeceasedDenialEDG(Boolean value) {
        isDeceasedDenialEDGField = value;
    }

    /**
     *
     */
    public Boolean getIsDifferentFederalIds() {
        return isDifferentFederalIdsField;
    }

    public void setIsDifferentFederalIds(Boolean value) {
        isDifferentFederalIdsField = value;
    }

    /**
     *
     */

    public Boolean getIsDummyGroupCreated() {
        return isDummyGroupCreatedField;
    }

    public void setIsDummyGroupCreated(Boolean value) {
        isDummyGroupCreatedField = value;
    }

    /**
     *
     */
    public Boolean getIsEDGOverride() {
        return isEDGOverrideField;
    }

    public void setIsEDGOverride(Boolean value) {
        isEDGOverrideField = value;
    }

    /**
     *
     */
    public Boolean getIsEDMInEMAExtPeriod() {
        return isEDMInEMAExtPeriodField;
    }

    public void setIsEDMInEMAExtPeriod(Boolean value) {
        isEDMInEMAExtPeriodField = value;
    }

    /**
     *
     */
    public Boolean getIsExit() {
        return isExitField;
    }

    public void setIsExit(Boolean value) {
        isExitField = value;
    }

    /**
     *
     */
    public Boolean getIsFederalAmountExist() {
        return isFederalAmountExistField;
    }

    public void setIsFederalAmountExist(Boolean value) {
        isFederalAmountExistField = value;
    }

    /**
     *
     */
    public Boolean getIsFinancialEligibilityTestRequired() {
        return isFinancialEligibilityTestRequiredField;
    }

    public void setIsFinancialEligibilityTestRequired(Boolean value) {
        isFinancialEligibilityTestRequiredField = value;
    }

    /**
     *
     */
    public Boolean getIsGroupIncomeBelow100FPL() {
        return isGroupIncomeBelow100FPLField;
    }

    public void setIsGroupIncomeBelow100FPL(Boolean value) {
        isGroupIncomeBelow100FPLField = value;
    }

    /**
     *
     */
    public Boolean getIsIncomeDisregardConsidered() {
        return isIncomeDisregardConsideredField;
    }

    public void setIsIncomeDisregardConsidered(Boolean value) {
        isIncomeDisregardConsideredField = value;
    }

    /**
     *
     */
    public Boolean getIsIncomeTestRequired() {
        return isIncomeTestRequiredField;
    }

    public void setIsIncomeTestRequired(Boolean value) {
        isIncomeTestRequiredField = value;
    }

    /**
     *
     */
    public Boolean getIsInvalid() {
        return isInvalidField;
    }

    public void setIsInvalid(Boolean value) {
        isInvalidField = value;
    }

    /**
     *
     */

    public Boolean getIsPotentiallySSIEligible() {
        return isPotentiallySSIEligibleField;
    }

    public void setIsPotentiallySSIEligible(Boolean value) {
        isPotentiallySSIEligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsSelfAttestedIncomeConsidered() {
        return isSelfAttestedIncomeConsideredField;
    }

    public void setIsSelfAttestedIncomeConsidered(Boolean value) {
        isSelfAttestedIncomeConsideredField = value;
    }

    /**
     *
     */
    public Boolean getIsStateAmountExist() {
        return isStateAmountExistField;
    }

    public void setIsStateAmountExist(Boolean value) {
        isStateAmountExistField = value;
    }

    /**
     *
     */

    public Boolean getIsUCase() {
        return isUCaseField;
    }

    public void setIsUCase(Boolean value) {
        isUCaseField = value;
    }

    /**
     *
     */
    public Boolean getIsValidErrorCode() {
        return isValidErrorCodeField;
    }

    public void setIsValidErrorCode(Boolean value) {
        isValidErrorCodeField = value;
    }

    /**
     *
     */
    public Boolean getIsVCIAmountExist() {
        return isVCIAmountExistField;
    }

    public void setIsVCIAmountExist(Boolean value) {
        isVCIAmountExistField = value;
    }

    /**
     *
     */
    public BigDecimal getJointFederalIncomeAmount() {
        return jointFederalIncomeAmountField;
    }

    public void setJointFederalIncomeAmount(BigDecimal value) {
        jointFederalIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getJointSelfAttestedIncomeCalculated() {
        return jointSelfAttestedIncomeCalculatedField;
    }

    public void setJointSelfAttestedIncomeCalculated(BigDecimal value) {
        jointSelfAttestedIncomeCalculatedField = value;
    }

    /**
     *
     */
    public String getSbeHCEApprovalReason() {
        return SbeHCEApprovalReasonField;
    }

    public void setSbeHCEApprovalReason(String value) {
        SbeHCEApprovalReasonField = value;
    }

    /**
     *
     */

    public BigDecimal getMagiStandardDeduction() {
        return magiStandardDeductionField;
    }

    public void setMagiStandardDeduction(BigDecimal value) {
        magiStandardDeductionField = value;
    }

    /**
     *
     */
    public String getMECEligibilityResultCode() {
        return mECEligibilityResultCodeField;
    }

    public void setMECEligibilityResultCode(String value) {
        mECEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public Boolean getNoAPTCReconcile() {
        return noAPTCReconcileField;
    }

    public void setNoAPTCReconcile(Boolean value) {
        noAPTCReconcileField = value;
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
    public LocalDateTime getPaymentBeginDate() {
        return paymentBeginDateField;
    }

    public void setPaymentBeginDate(LocalDateTime value) {
        paymentBeginDateField = value;
    }

    /**
     *
     */
    public String getPriorMedicaidCode() {
        return priorMedicaidCodeField;
    }

    public void setPriorMedicaidCode(String value) {
        priorMedicaidCodeField = value;
    }

    /**
     *
     */
    public String getProgramActivityType() {
        return programActivityTypeField;
    }

    public void setProgramActivityType(String value) {
        programActivityTypeField = value;
    }

    /**
     *
     */
    public String getProgramCode() {
        return programCodeField;
    }

    public void setProgramCode(String value) {
        programCodeField = value;
    }

    /**
     *
     */
    public String getProgramMode() {
        return programModeField;
    }

    public void setProgramMode(String value) {
        programModeField = value;
    }

    /**
     *
     */
    public LocalDateTime getProgramRequestDate() {
        return programRequestDateField;
    }

    public void setProgramRequestDate(LocalDateTime value) {
        programRequestDateField = value;
    }

    /**
     *
     */
    public String getProgramStatus() {
        return programStatusField;
    }

    public void setProgramStatus(String value) {
        programStatusField = value;
    }

    /**
     *
     */
    public Boolean getR5_IsSpenddownEdg() {
        return r5_IsSpenddownEdgField;
    }

    public void setR5_IsSpenddownEdg(Boolean value) {
        r5_IsSpenddownEdgField = value;
    }

    /**
     *
     */
    public Boolean getSelfAttestedIncomeExist() {
        return selfAttestedIncomeExistField;
    }

    public void setSelfAttestedIncomeExist(Boolean value) {
        selfAttestedIncomeExistField = value;
    }

    /**
     *
     */
    public String getSpecialTriggerCode() {
        return specialTriggerCodeField;
    }

    public void setSpecialTriggerCode(String value) {
        specialTriggerCodeField = value;
    }

    /**
     *
     */
    public String getSwicaErrorCode() {
        return swicaErrorCodeField;
    }

    public void setSwicaErrorCode(String value) {
        swicaErrorCodeField = value;
    }

    /**
     *
     */
    public Long getTaxGroupId() {
        return taxGroupIdField;
    }

    public void setTaxGroupId(Long value) {
        taxGroupIdField = value;
    }

    /**
     *
     */
    public Long getTOAPriorityNumber() {
        return tOAPriorityNumberField;
    }

    public void setTOAPriorityNumber(Long value) {
        tOAPriorityNumberField = value;
    }

    /**
     *
     */
    public String getTypeOfAssistance() {
        return typeOfAssistanceField;
    }

    public void setTypeOfAssistance(String value) {
        typeOfAssistanceField = value;
    }

    /**
     *
     */
    public String getVCIErrorCode() {
        return vCIErrorCodeField;
    }

    public void setVCIErrorCode(String value) {
        vCIErrorCodeField = value;
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
    public List<CascadeNoticeReason> getcascadeNoticeReason() {
        return cascadeNoticeReasonField;
    }

    public void setcascadeNoticeReason(List<CascadeNoticeReason> value) {
        cascadeNoticeReasonField = value;
    }

    /**
     *
     */
    public final Case getCase() {
        return caseField;
    }

    public final void setCase(Case value) {
        caseField = value;
    }

    /**
     *
     */
    public EDGBudget getedgBudget() {
        return edgBudgetField;
    }

    public void setedgBudget(EDGBudget value) {
        edgBudgetField = value;
    }

    /**
     *
     */
    public List<EDGIndividual> geteDGIndividual() {
        return eDGIndividualField;
    }

    public void seteDGIndividual(List<EDGIndividual> value) {
        eDGIndividualField = value;
    }

    /**
     *
     */
    public List<FamilySizeFPLLimit> getfamilySizeFMALimit() {
        return familySizeFMALimitField;
    }

    public void setfamilySizeFMALimit(List<FamilySizeFPLLimit> value) {
        familySizeFMALimitField = value;
    }

    /**
     *
     */
    public FMALimit getfMALimit() {
        return fMALimitField;
    }

    public void setfMALimit(FMALimit value) {
        fMALimitField = value;
    }

    /**
     *
     */
    public List<Notice> getnotice() {
        return noticeField;
    }

    public void setnotice(List<Notice> value) {
        noticeField = value;
    }

    /**
     *
     */
    public Recertification getrecertification() {
        return recertificationField;
    }

    public void setrecertification(Recertification value) {
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

    public Integer getAdditionalCertifiedGroupSize() {
        return additionalCertifiedGroupSizeField;
    }

    public void setAdditionalCertifiedGroupSize(Integer additionalCertifiedGroupSizeField) {
        this.additionalCertifiedGroupSizeField = additionalCertifiedGroupSizeField;
    }

    public BigDecimal getAFDC_Limit() {
        return aFDC_LimitField;
    }

    public void setAFDC_Limit(BigDecimal aFDC_LimitField) {
        this.aFDC_LimitField = aFDC_LimitField;
    }


    public Boolean getDeemedTMA() {
        return deemedTMAField;
    }

    public void setDeemedTMA(Boolean deemedTMAField) {
        this.deemedTMAField = deemedTMAField;
    }

    public BigDecimal getFPL_100_Percent() {
        return fPL_100_PercentField;
    }

    public void setFPL_100_Percent(BigDecimal fPL_100_PercentField) {
        this.fPL_100_PercentField = fPL_100_PercentField;
    }

    public BigDecimal getFPL_133_Percent() {
        return fPL_133_PercentField;
    }

    public void setFPL_133_Percent(BigDecimal fPL_133_PercentField) {
        this.fPL_133_PercentField = fPL_133_PercentField;
    }

    public BigDecimal getFPL_150_Percent() {
        return fPL_150_PercentField;
    }

    public void setFPL_150_Percent(BigDecimal fPL_150_PercentField) {
        this.fPL_150_PercentField = fPL_150_PercentField;
    }

    public BigDecimal getFPL_185_Percent() {
        return fPL_185_PercentField;
    }

    public void setFPL_185_Percent(BigDecimal fPL_185_PercentField) {
        this.fPL_185_PercentField = fPL_185_PercentField;
    }

    public BigDecimal getFPL_200_Percent() {
        return fPL_200_PercentField;
    }

    public void setFPL_200_Percent(BigDecimal fPL_200_PercentField) {
        this.fPL_200_PercentField = fPL_200_PercentField;
    }

    public BigDecimal getFPL_250_Percent() {
        return fPL_250_PercentField;
    }

    public void setFPL_250_Percent(BigDecimal fPL_250_PercentField) {
        this.fPL_250_PercentField = fPL_250_PercentField;
    }

    public BigDecimal getFPL_300_Percent() {
        return fPL_300_PercentField;
    }

    public void setFPL_300_Percent(BigDecimal fPL_300_PercentField) {
        this.fPL_300_PercentField = fPL_300_PercentField;
    }

    public BigDecimal getFPL_400_Percent() {
        return fPL_400_PercentField;
    }

    public void setFPL_400_Percent(BigDecimal fPL_400_PercentField) {
        this.fPL_400_PercentField = fPL_400_PercentField;
    }

    public BigDecimal getHousehold_Income_ADFF() {
        return household_Income_ADFFField;
    }

    public void setHousehold_Income_ADFF(BigDecimal household_Income_ADFFField) {
        this.household_Income_ADFFField = household_Income_ADFFField;
    }

    public BigDecimal getHousehold_Income_ADLT() {
        return household_Income_ADLTField;
    }

    public void setHousehold_Income_ADLT(BigDecimal household_Income_ADLTField) {
        this.household_Income_ADLTField = household_Income_ADLTField;
    }

    public BigDecimal getHousehold_Income_ADPR() {
        return household_Income_ADPRField;
    }

    public void setHousehold_Income_ADPR(BigDecimal household_Income_ADPRField) {
        this.household_Income_ADPRField = household_Income_ADPRField;
    }

    public BigDecimal getHousehold_Income_APTC() {
        return household_Income_APTCField;
    }

    public void setHousehold_Income_APTC(BigDecimal household_Income_APTCField) {
        this.household_Income_APTCField = household_Income_APTCField;
    }

    public BigDecimal getHousehold_Income_CHEX() {
        return household_Income_CHEXField;
    }

    public void setHousehold_Income_CHEX(BigDecimal household_Income_CHEXField) {
        this.household_Income_CHEXField = household_Income_CHEXField;
    }

    public BigDecimal getHousehold_Income_CHIP() {
        return household_Income_CHIPField;
    }

    public void setHousehold_Income_CHIP(BigDecimal household_Income_CHIPField) {
        this.household_Income_CHIPField = household_Income_CHIPField;
    }

    public BigDecimal getHousehold_Income_CHL1() {
        return household_Income_CHL1Field;
    }

    public void setHousehold_Income_CHL1(BigDecimal household_Income_CHL1Field) {
        this.household_Income_CHL1Field = household_Income_CHL1Field;
    }

    public BigDecimal getHousehold_Income_CHL2() {
        return household_Income_CHL2Field;
    }

    public void setHousehold_Income_CHL2(BigDecimal household_Income_CHL2Field) {
        this.household_Income_CHL2Field = household_Income_CHL2Field;
    }

    public BigDecimal getHousehold_Income_CHL3() {
        return household_Income_CHL3Field;
    }

    public void setHousehold_Income_CHL3(BigDecimal household_Income_CHL3Field) {
        this.household_Income_CHL3Field = household_Income_CHL3Field;
    }

    public BigDecimal getHousehold_Income_CHL4() {
        return household_Income_CHL4Field;
    }

    public void setHousehold_Income_CHL4(BigDecimal household_Income_CHL4Field) {
        this.household_Income_CHL4Field = household_Income_CHL4Field;
    }

    public BigDecimal getHousehold_Income_FFS1() {
        return household_Income_FFS1Field;
    }

    public void setHousehold_Income_FFS1(BigDecimal household_Income_FFS1Field) {
        this.household_Income_FFS1Field = household_Income_FFS1Field;
    }

    public BigDecimal getHousehold_Income_PACA() {
        return household_Income_PACAField;
    }

    public void setHousehold_Income_PACA(BigDecimal household_Income_PACAField) {
        this.household_Income_PACAField = household_Income_PACAField;
    }

    public BigDecimal getHousehold_Income_PREG() {
        return household_Income_PREGField;
    }

    public void setHousehold_Income_PREG(BigDecimal household_Income_PREGField) {
        this.household_Income_PREGField = household_Income_PREGField;
    }

    public BigDecimal getHousehold_Income_TMAE() {
        return household_Income_TMAEField;
    }

    public void setHousehold_Income_TMAE(BigDecimal household_Income_TMAEField) {
        this.household_Income_TMAEField = household_Income_TMAEField;
    }

    public BigDecimal getHousehold_Income_TMAS() {
        return household_Income_TMASField;
    }

    public void setHousehold_Income_TMAS(BigDecimal household_Income_TMASField) {
        this.household_Income_TMASField = household_Income_TMASField;
    }

    public BigDecimal getHousehold_Income_TMCE() {
        return household_Income_TMCEField;
    }

    public void setHousehold_Income_TMCE(BigDecimal household_Income_TMCEField) {
        this.household_Income_TMCEField = household_Income_TMCEField;
    }

    public BigDecimal getHousehold_Income_TMCS() {
        return household_Income_TMCSField;
    }

    public void setHousehold_Income_TMCS(BigDecimal household_Income_TMCSField) {
        this.household_Income_TMCSField = household_Income_TMCSField;
    }

    public BigDecimal getHouseholdEarnedIncomeAmount() {
        return householdEarnedIncomeAmountField;
    }

    public void setHouseholdEarnedIncomeAmount(BigDecimal householdEarnedIncomeAmountField) {
        this.householdEarnedIncomeAmountField = householdEarnedIncomeAmountField;
    }

    public BigDecimal getHouseholdSpousalSupportIncomeAmount() {
        return householdSpousalSupportIncomeAmountField;
    }

    public void setHouseholdSpousalSupportIncomeAmount(BigDecimal householdSpousalSupportIncomeAmountField) {
        this.householdSpousalSupportIncomeAmountField = householdSpousalSupportIncomeAmountField;
    }

    public Boolean getIsAlienAPTC() {
        return isAlienAPTCField;
    }

    public void setIsAlienAPTC(Boolean isAlienAPTCField) {
        this.isAlienAPTCField = isAlienAPTCField;
    }

    public Boolean getIsAlienEMAGiven() {
        return isAlienEMAGivenField;
    }

    public void setIsAlienEMAGiven(Boolean isAlienEMAGivenField) {
        this.isAlienEMAGivenField = isAlienEMAGivenField;
    }

    public Boolean getIsDeemedBenefit() {
        return isDeemedBenefitField;
    }

    public void setIsDeemedBenefit(Boolean isDeemedBenefitField) {
        this.isDeemedBenefitField = isDeemedBenefitField;
    }

    public Boolean getIsEdgToBeRetainedAndApprove() {
        return isEdgToBeRetainedAndApproveField;
    }

    public void setIsEdgToBeRetainedAndApprove(Boolean isEdgToBeRetainedAndApproveField) {
        this.isEdgToBeRetainedAndApproveField = isEdgToBeRetainedAndApproveField;
    }

    public Boolean getIsFederalIncomeExist() {
        return isFederalIncomeExistField;
    }

    public void setIsFederalIncomeExist(Boolean isFederalIncomeExistField) {
        this.isFederalIncomeExistField = isFederalIncomeExistField;
    }

    public Boolean getIsManuallyCreatingEDG() {
        return isManuallyCreatingEDGField;
    }

    public void setIsManuallyCreatingEDG(Boolean isManuallyCreatingEDGField) {
        this.isManuallyCreatingEDGField = isManuallyCreatingEDGField;
    }

    public Boolean getIsNew() {
        return isNewField;
    }

    public void setIsNew(Boolean isNewField) {
        this.isNewField = isNewField;
    }

    public Boolean getIsNonFinancialEligibilityTestRequired() {
        return isNonFinancialEligibilityTestRequiredField;
    }

    public void setIsNonFinancialEligibilityTestRequired(Boolean isNonFinancialEligibilityTestRequiredField) {
        this.isNonFinancialEligibilityTestRequiredField = isNonFinancialEligibilityTestRequiredField;
    }

    public Boolean getIsStateIncomeExist() {
        return isStateIncomeExistField;
    }

    public void setIsStateIncomeExist(Boolean isStateIncomeExistField) {
        this.isStateIncomeExistField = isStateIncomeExistField;
    }

    public Boolean getIsToTemporaryRetainEdg() {
        return isToTemporaryRetainEdgField;
    }

    public void setIsToTemporaryRetainEdg(Boolean isToTemporaryRetainEdgField) {
        this.isToTemporaryRetainEdgField = isToTemporaryRetainEdgField;
    }

    public Boolean getPerform_1000_1100() {
        return perform_1000_1100Field;
    }

    public void setPerform_1000_1100(Boolean perform_1000_1100Field) {
        this.perform_1000_1100Field = perform_1000_1100Field;
    }

    public Boolean getPerform_1000_1300() {
        return perform_1000_1300Field;
    }

    public void setPerform_1000_1300(Boolean perform_1000_1300Field) {
        this.perform_1000_1300Field = perform_1000_1300Field;
    }

    public Boolean getPerform_2000_002() {
        return perform_2000_002Field;
    }

    public void setPerform_2000_002(Boolean perform_2000_002Field) {
        this.perform_2000_002Field = perform_2000_002Field;
    }

    public Boolean getPerform_32_37_119_Alien_Check() {
        return perform_32_37_119_Alien_CheckField;
    }

    public void setPerform_32_37_119_Alien_Check(Boolean perform_32_37_119_Alien_CheckField) {
        this.perform_32_37_119_Alien_CheckField = perform_32_37_119_Alien_CheckField;
    }

    public Boolean getPerform_5000_050_2_1() {
        return perform_5000_050_2_1Field;
    }

    public void setPerform_5000_050_2_1(Boolean perform_5000_050_2_1Field) {
        this.perform_5000_050_2_1Field = perform_5000_050_2_1Field;
    }

    public Boolean getPerform_5000_050_2_1a() {
        return perform_5000_050_2_1aField;
    }

    public void setPerform_5000_050_2_1a(Boolean perform_5000_050_2_1aField) {
        this.perform_5000_050_2_1aField = perform_5000_050_2_1aField;
    }

    public Boolean getPerform_5000_050_2_2() {
        return perform_5000_050_2_2Field;
    }

    public void setPerform_5000_050_2_2(Boolean perform_5000_050_2_2Field) {
        this.perform_5000_050_2_2Field = perform_5000_050_2_2Field;
    }

    public Boolean getPerform_5000_050_2_3() {
        return perform_5000_050_2_3Field;
    }

    public void setPerform_5000_050_2_3(Boolean perform_5000_050_2_3Field) {
        this.perform_5000_050_2_3Field = perform_5000_050_2_3Field;
    }


    public Boolean getPerform_5000_051() {
        return perform_5000_051Field;
    }

    public void setPerform_5000_051(Boolean perform_5000_051Field) {
        this.perform_5000_051Field = perform_5000_051Field;
    }

    public Boolean getPerform_5000_052() {
        return perform_5000_052Field;
    }

    public void setPerform_5000_052(Boolean perform_5000_052Field) {
        this.perform_5000_052Field = perform_5000_052Field;
    }

    public Boolean getPerform_APTC_Check_For_Dependent() {
        return perform_APTC_Check_For_DependentField;
    }

    public void setPerform_APTC_Check_For_Dependent(Boolean perform_APTC_Check_For_DependentField) {
        this.perform_APTC_Check_For_DependentField = perform_APTC_Check_For_DependentField;
    }

    public Boolean getPerform_APTC_Check_For_Filer() {
        return perform_APTC_Check_For_FilerField;
    }

    public void setPerform_APTC_Check_For_Filer(Boolean perform_APTC_Check_For_FilerField) {
        this.perform_APTC_Check_For_FilerField = perform_APTC_Check_For_FilerField;
    }

    public Boolean getPerform_Five_Year_Bar_Check() {
        return perform_Five_Year_Bar_CheckField;
    }

    public void setPerform_Five_Year_Bar_Check(Boolean perform_Five_Year_Bar_CheckField) {
        this.perform_Five_Year_Bar_CheckField = perform_Five_Year_Bar_CheckField;
    }

    public Boolean getPerform_VLP_QNC_Check() {
        return perform_VLP_QNC_CheckField;
    }

    public void setPerform_VLP_QNC_Check(Boolean perform_VLP_QNC_CheckField) {
        this.perform_VLP_QNC_CheckField = perform_VLP_QNC_CheckField;
    }

    public Boolean getPerformEDGExit() {
        return performEDGExitField;
    }

    public void setPerformEDGExit(Boolean performEDGExitField) {
        this.performEDGExitField = performEDGExitField;
    }

    public Boolean getV_certifiedGrpExists_5000_005() {
        return v_certifiedGrpExists_5000_005Field;
    }

    public void setV_certifiedGrpExists_5000_005(Boolean v_certifiedGrpExists_5000_005Field) {
        this.v_certifiedGrpExists_5000_005Field = v_certifiedGrpExists_5000_005Field;
    }

    /**
     *
     */
    public Boolean getNonMagiAssessed() {
        return nonMagiAssessedField;
    }

    public void setNonMagiAssessed(Boolean value) {
        nonMagiAssessedField = value;
    }

    public Boolean getIsCategorical() {
        return IsCategoricalField;
    }

    public void setIsCategorical(Boolean value) {
        IsCategoricalField = value;
    }

}