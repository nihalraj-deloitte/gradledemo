package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.LocalDateTimeAdapter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*isperform_ESI_MEC_Check
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EDGIndividual {

    @XmlElement(name = "AlienTypeCode")
    private String alienTypeCodeField;

    @XmlElement(name = "AlienVCLCode")
    private String alienVCLCodeField;

    @XmlElement(name = "Check_Filer_Relationship")
    private Boolean check_Filer_RelationshipField;

    @XmlElement(name = "Check_NF_Relationship")
    private Boolean check_NF_RelationshipField;

    @XmlElement(name = "ConversionRecipientCode")
    private String conversionRecipientCodeField;

    @XmlElement(name = "DisregardIndividual")
    private Boolean disregardIndividualField;

    @XmlElement(name = "EDGEligibilityResultCode")
    private String eDGEligibilityResultCodeField;

    @XmlElement(name = "EDGTraceId")
    private Long eDGTraceIdField;

    @XmlElement(name = "EmergencyMedicaidId")
    private Long emergencyMedicaidIdField;

    @XmlElement(name = "FederalReasonableCompatible")
    private String federalReasonableCompatibleField;

    @XmlElement(name = "FedErrorCode")
    private String fedErrorCodeField;

    @XmlElement(name = "FinancialEligibilityResultCode")
    private String financialEligibilityResultCodeField;

    @XmlElement(name = "GrossEarnIncomeAmount")
    private BigDecimal grossEarnIncomeAmountField;

    @XmlElement(name = "GrossEmploymentIncomeAmount")
    private BigDecimal grossEmploymentIncomeAmountField;

    @XmlElement(name = "GrossUnEarnedIncomeAmount")
    private BigDecimal grossUnEarnedIncomeAmountField;

    @XmlElement(name = "GroupIndicator")
    private String groupIndicatorField;

    @XmlElement(name = "HasMEC")
    private Boolean hasMECField;

    @XmlElement(name = "InclusionMAGIIncome")
    private BigDecimal inclusionMAGIIncomeField;

    @XmlElement(name = "IndividualAge")
    private Long individualAgeField;

    @XmlElement(name = "IndividualAnnualAPTCIncome")
    private BigDecimal individualAnnualAPTCIncomeField;

    @XmlElement(name = "IndividualFederalGroupIncomeAmount")
    private BigDecimal individualFederalGroupIncomeAmountField;

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlElement(name = "IndividualIncomeAmount")
    private BigDecimal individualIncomeAmountField;

    @XmlElement(name = "IndividualSelfAttestedCalculated")
    private BigDecimal individualSelfAttestedCalculatedField;

    @XmlElement(name = "IndividualSelfAttestedEarnedIncome")
    private BigDecimal individualSelfAttestedEarnedIncomeField;

    @XmlElement(name = "IndividualSelfAttestedGrossIncome")
    private BigDecimal individualSelfAttestedGrossIncomeField;

    @XmlElement(name = "IndividualSelfAttestedOtherIncome")
    private BigDecimal individualSelfAttestedOtherIncomeField;

    @XmlElement(name = "IndividualSelfAttestedSelfEmploymentIncome")
    private BigDecimal individualSelfAttestedSelfEmploymentIncomeField;

    @XmlElement(name = "IndividualSelfAttestedUnearnedIncome")
    private BigDecimal individualSelfAttestedUnearnedIncomeField;

    @XmlElement(name = "IndividualSelfAttestedUnemploymentIncome")
    private BigDecimal individualSelfAttestedUnemploymentIncomeField;

    @XmlElement(name = "IndividualStateGroupIncomeAmount")
    private BigDecimal individualStateGroupIncomeAmountField;

    @XmlElement(name = "IndividualTotalCntbtIncome")
    private BigDecimal individualTotalCntbtIncomeField;

    @XmlElement(name = "IndividualVCIGroupIncomeAmount")
    private BigDecimal individualVCIGroupIncomeAmountField;

    @XmlElement(name = "IsAIAN")
    private Boolean isAIANField;

    @XmlElement(name = "IsCatastrophicPlanEligible")
    private Boolean isCatastrophicPlanEligibleField;

    @XmlElement(name = "IsConsiderDeductions")
    private Boolean isConsiderDeductionsField;

    @XmlElement(name = "IsConsiderNeeds")
    private Boolean isConsiderNeedsField;

    @XmlElement(name = "IsConsiderResource")
    private Boolean isConsiderResourceField;

    @XmlElement(name = "IsDisqualify")
    private String isDisqualifyField;

    @XmlElement(name = "IsIncomeConsidered")
    private Boolean isIncomeConsideredField;

    @XmlElement(name = "IsMedicallyFrail")
    private Boolean isMedicallyFrailField;

    @XmlElement(name = "IsMotherMACheckRequired")
    private Boolean isMotherMACheckRequiredField;

    @XmlElement(name = "IsNewBorn")
    private Boolean isNewBornField;

    @XmlElement(name = "IsPreviousPREGEligible")
    private Boolean isPreviousPREGEligibleField;

    @XmlElement(name = "IsQHPEligible")
    private Boolean isQHPEligibleField;

    @XmlElement(name = "IsRebuild")
    private Boolean isRebuildField;

    @XmlElement(name = "IsRelatedToOtherIndividual")
    private Boolean isRelatedToOtherIndividualField;

    @XmlElement(name = "IsRequiredToFileTaxes")
    private Boolean isRequiredToFileTaxesField;

    @XmlElement(name = "IsSelfAttestedIncomeConsidered")
    private Boolean isSelfAttestedIncomeConsideredField;

    @XmlElement(name = "IsTarget")
    private Boolean isTargetField;

    @XmlElement(name = "IsUSCitizen")
    private Boolean isUSCitizenField;

    @XmlElement(name = "JointSelfAttestedIncomeCalculated")
    private BigDecimal jointSelfAttestedIncomeCalculatedField;

    @XmlElement(name = "OtherSystemBenefit")
    private String OtherSystemBenefitField;

    @XmlElement(name = "LPRResult")
    private String lPRResultField;

    @XmlElement(name = "MAGroupIndicator")
    private String mAGroupIndicatorField;

    @XmlElement(name = "MECEligibilityResultCode")
    private String mECEligibilityResultCodeField;

    @XmlElement(name = "MedicalFrailReason")
    private String medicalFrailReasonField;

    @XmlElement(name = "MotherMABenefit")
    private String motherMABenefitField;

    @XmlElement(name = "NonFinancialEligibilityResultCode")
    private String nonFinancialEligibilityResultCodeField;

    @XmlElement(name = "OtherIncomeAmount")
    private BigDecimal otherIncomeAmountField;

    @XmlElement(name = "PartStatusCode")
    private String partStatusCodeField;

    @XmlElement(name = "Perform_APTC_32_37_119_Alien_Check")
    private Boolean perform_APTC_32_37_119_Alien_CheckField;

    @XmlElement(name = "Perform_APTC_VLP_QNC_Check")
    private Boolean perform_APTC_VLP_QNC_CheckField;

    @XmlElement(name = "PriorMedCode")
    private String priorMedCodeField;

    @XmlElement(name = "RelationshipWithTargetIndividual")
    private String relationshipWithTargetIndividualField;

    @XmlElement(name = "SelfEmploymentIncome")
    private BigDecimal selfEmploymentIncomeField;

    @XmlElement(name = "SpouseIndividualId")
    private Long spouseIndividualIdField;

    @XmlElement(name = "StateReasonableCompatible")
    private String stateReasonableCompatibleField;

    @XmlElement(name = "SwicaErrorCode")
    private String swicaErrorCodeField;

    @XmlElement(name = "TaxFilerStatusCode")
    private String taxFilerStatusCodeField;

    @XmlElement(name = "TaxPayerIndividualId")
    private Long taxPayerIndividualIdField;

    @XmlElement(name = "TotalGrossExpenses")
    private BigDecimal totalGrossExpensesField;

    @XmlElement(name = "UnbornChildCount")
    private Long unbornChildCountField;

    @XmlElement(name = "V_taxDependent_1000_110")
    private Boolean v_taxDependent_1000_110Field;

    @XmlElement(name = "VCIErrorCode")
    private String vCIErrorCodeField;

    @XmlElement(name = "VCIReasonableCompatible")
    private String vCIReasonableCompatibleField;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @XmlElement(name = "VCLDueDate")
    private LocalDateTime vCLDueDateField;

    @XmlElement(name = "VerificationResultCode")
    private String verificationResultCodeField;

    @XmlElement(name = "eDGGroup")
    private EDGGroup eDGGroupField;

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "eDGIndividualExpenses")
    private List<EDGIndividualExpenses> eDGIndividualExpensesField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "income")
    private List<Income> incomeField = new ArrayList<>();

    @XmlElement(name = "individual")
    private Individual individualField;

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "notice")
    private List<Notice> noticeField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "r5_PayDetail")
    private List<R5_PayDetail> r5_PayDetailField = new ArrayList<>();

    private String idField;

    private String hrefField;

    @XmlElement(name = "Perform_2000_381")
    private Boolean perform_2000_381Field;

    @XmlElement(name = "Perform_3000_005_2B")
    private Boolean perform_3000_005_2BField;

    @XmlElement(name = "Perform_3000_005_2D")
    private Boolean perform_3000_005_2DField;

    @XmlElement(name = "Perform_3000_005_2E")
    private Boolean perform_3000_005_2EField;

    @XmlElement(name = "Perform_3000_005_3A")
    private Boolean perform_3000_005_3AField;

    @XmlElement(name = "Perform_3000_006_1B")
    private Boolean perform_3000_006_1BField;

    @XmlElement(name = "Perform_3000_010")
    private Boolean perform_3000_010Field;

    @XmlElement(name = "Perform_32_37_119_Alien_Check")
    private Boolean perform_32_37_119_Alien_CheckField;

    @XmlElement(name = "Perform_Alien_Check")
    private Boolean perform_Alien_CheckField;

    @XmlElement(name = "Perform_Alien_Check_For_APTC")
    private Boolean perform_Alien_Check_For_APTCField;

    @XmlElement(name = "Perform_CHEX_attendingSchool_Check")
    private Boolean perform_CHEX_attendingSchool_CheckField;

    @XmlElement(name = "Perform_Citizenship_Check")
    private Boolean perform_Citizenship_CheckField;

    @XmlElement(name = "Perform_Entitled_Benefit_Check")
    private Boolean perform_Entitled_Benefit_CheckField;

    @XmlElement(name = "Perform_Five_Year_Bar_Checkperform_ESI_MEC_Check")
    private Boolean perform_Five_Year_Bar_Checkperform_ESI_MEC_CheckField;

    @XmlElement(name = "Perform_FosterCare_AdoptionAssistance_Check")
    private Boolean perform_FosterCare_AdoptionAssistance_CheckField;

    @XmlElement(name = "Perform_Insurance_Check")
    private Boolean perform_Insurance_CheckField;

    @XmlElement(name = "Perform_MEC_Check")
    private Boolean perform_MEC_CheckField;

    @XmlElement(name = "Perform_ESI_MEC_Check")
    private Boolean perform_ESI_MEC_CheckField;

    @XmlElement(name = "Perform_NewBorn_Check")
    private Boolean perform_NewBorn_CheckField;

    @XmlElement(name = "Perform_OutOfState_Benefits_Check")
    private Boolean perform_OutOfState_Benefits_CheckField;

    @XmlElement(name = "Perform_Pregnancy_Check")
    private Boolean perform_Pregnancy_CheckField;

    @XmlElement(name = "Perform_QHP_Ineligibile_Check")
    private Boolean perform_QHP_Ineligibile_CheckField;

    @XmlElement(name = "Perform_Residency_Check")
    private Boolean perform_Residency_CheckField;

    @XmlElement(name = "Perform_SSN_Check")
    private Boolean perform_SSN_CheckField;

    @XmlElement(name = "Perform_VCI_RC")
    private Boolean perform_VCI_RCField;

    @XmlElement(name = "Perform_VLP_QNC_Check")
    private Boolean perform_VLP_QNC_CheckField;

    @XmlElement(name = "PerformFilingJointly")
    private Boolean performFilingJointlyField;

    @XmlElement(name = "V_childOfTarget_1000_150")
    private Boolean v_childOfTarget_1000_150Field;

    @XmlElement(name = "V_isDepChildOfTarget_1000_140")
    private Boolean v_isDepChildOfTarget_1000_140Field;

    @XmlElement(name = "V_isSpouseOfTarget_1000_140")
    private Boolean v_isSpouseOfTarget_1000_140Field;

    @XmlElement(name = "V_isTargetTaxDependent_1000_140")
    private Boolean v_isTargetTaxDependent_1000_140Field;

    @XmlElement(name = "V_isTaxDepOfTarget_1000_140")
    private Boolean v_isTaxDepOfTarget_1000_140Field;

    @XmlElement(name = "V_parentOfTarget_1000_150")
    private Boolean v_parentOfTarget_1000_150Field;

    @XmlElement(name = "V_siblingOfTarget_1000_150")
    private Boolean v_siblingOfTarget_1000_150Field;

    @XmlElement(name = "V_SpouseOfTarget_1000_150")
    private Boolean v_SpouseOfTarget_1000_150Field;

    @XmlElement(name = "V_taxDepOfTaxPayer_1000_140")
    private Boolean v_taxDepOfTaxPayer_1000_140Field;

    @XmlElement(name = "Perform_Five_Year_Bar_Check")
    private Boolean perform_Five_Year_Bar_CheckField;

    /**
     *
     */
    public String getAlienTypeCode() {
        return alienTypeCodeField;
    }

    public void setAlienTypeCode(String value) {
        alienTypeCodeField = value;
    }

    /**
     *
     */
    public String getAlienVCLCode() {
        return alienVCLCodeField;
    }

    public void setAlienVCLCode(String value) {
        alienVCLCodeField = value;
    }

    /**
     *
     */
    public Boolean getCheck_Filer_Relationship() {
        return check_Filer_RelationshipField;
    }

    public void setCheck_Filer_Relationship(Boolean value) {
        check_Filer_RelationshipField = value;
    }

    /**
     *
     */
    public Boolean getCheck_NF_Relationship() {
        return check_NF_RelationshipField;
    }

    public void setCheck_NF_Relationship(Boolean value) {
        check_NF_RelationshipField = value;
    }

    /**
     *
     */
    public String getConversionRecipientCode() {
        return conversionRecipientCodeField;
    }

    public void setConversionRecipientCode(String value) {
        conversionRecipientCodeField = value;
    }

    /**
     *
     */

    public Boolean getDisregardIndividual() {
        return disregardIndividualField;
    }

    public void setDisregardIndividual(Boolean value) {
        disregardIndividualField = value;
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
    public Long getEDGTraceId() {
        return eDGTraceIdField;
    }

    public void setEDGTraceId(Long value) {
        eDGTraceIdField = value;
    }

    /**
     *
     */
    public Long getEmergencyMedicaidId() {
        return emergencyMedicaidIdField;
    }

    public void setEmergencyMedicaidId(Long value) {
        emergencyMedicaidIdField = value;
    }

    /**
     *
     */
    public String getFederalReasonableCompatible() {
        return federalReasonableCompatibleField;
    }

    public void setFederalReasonableCompatible(String value) {
        federalReasonableCompatibleField = value;
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
    public String getFinancialEligibilityResultCode() {
        return financialEligibilityResultCodeField;
    }

    public void setFinancialEligibilityResultCode(String value) {
        financialEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public BigDecimal getGrossEarnIncomeAmount() {
        return grossEarnIncomeAmountField;
    }

    public void setGrossEarnIncomeAmount(BigDecimal value) {
        grossEarnIncomeAmountField = value;
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
    public BigDecimal getGrossUnEarnedIncomeAmount() {
        return grossUnEarnedIncomeAmountField;
    }

    public void setGrossUnEarnedIncomeAmount(BigDecimal value) {
        grossUnEarnedIncomeAmountField = value;
    }

    /**
     *
     */
    public String getGroupIndicator() {
        return groupIndicatorField;
    }

    public void setGroupIndicator(String value) {
        groupIndicatorField = value;
    }

    /**
     *
     */
    public Boolean getHasMEC() {
        return hasMECField;
    }

    public void setHasMEC(Boolean value) {
        hasMECField = value;
    }

    /**
     *
     */
    public BigDecimal getInclusionMAGIIncome() {
        return inclusionMAGIIncomeField;
    }

    public void setInclusionMAGIIncome(BigDecimal value) {
        inclusionMAGIIncomeField = value;
    }

    /**
     *
     */
    public Long getIndividualAge() {
        return individualAgeField;
    }

    public void setIndividualAge(Long value) {
        individualAgeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualAnnualAPTCIncome() {
        return individualAnnualAPTCIncomeField;
    }

    public void setIndividualAnnualAPTCIncome(BigDecimal value) {
        individualAnnualAPTCIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualFederalGroupIncomeAmount() {
        return individualFederalGroupIncomeAmountField;
    }

    public void setIndividualFederalGroupIncomeAmount(BigDecimal value) {
        individualFederalGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public Long getIndividualId() {
        return individualIdField;
    }

    public void setIndividualId(Long value) {
        individualIdField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualIncomeAmount() {
        return individualIncomeAmountField;
    }

    public void setIndividualIncomeAmount(BigDecimal value) {
        individualIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualSelfAttestedCalculated() {
        return individualSelfAttestedCalculatedField;
    }

    public void setIndividualSelfAttestedCalculated(BigDecimal value) {
        individualSelfAttestedCalculatedField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualSelfAttestedEarnedIncome() {
        return individualSelfAttestedEarnedIncomeField;
    }

    public void setIndividualSelfAttestedEarnedIncome(BigDecimal value) {
        individualSelfAttestedEarnedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualSelfAttestedGrossIncome() {
        return individualSelfAttestedGrossIncomeField;
    }

    public void setIndividualSelfAttestedGrossIncome(BigDecimal value) {
        individualSelfAttestedGrossIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualSelfAttestedOtherIncome() {
        return individualSelfAttestedOtherIncomeField;
    }

    public void setIndividualSelfAttestedOtherIncome(BigDecimal value) {
        individualSelfAttestedOtherIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualSelfAttestedSelfEmploymentIncome() {
        return individualSelfAttestedSelfEmploymentIncomeField;
    }

    public void setIndividualSelfAttestedSelfEmploymentIncome(BigDecimal value) {
        individualSelfAttestedSelfEmploymentIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualSelfAttestedUnearnedIncome() {
        return individualSelfAttestedUnearnedIncomeField;
    }

    public void setIndividualSelfAttestedUnearnedIncome(BigDecimal value) {
        individualSelfAttestedUnearnedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualSelfAttestedUnemploymentIncome() {
        return individualSelfAttestedUnemploymentIncomeField;
    }

    public void setIndividualSelfAttestedUnemploymentIncome(BigDecimal value) {
        individualSelfAttestedUnemploymentIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualStateGroupIncomeAmount() {
        return individualStateGroupIncomeAmountField;
    }

    public void setIndividualStateGroupIncomeAmount(BigDecimal value) {
        individualStateGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualTotalCntbtIncome() {
        return individualTotalCntbtIncomeField;
    }

    public void setIndividualTotalCntbtIncome(BigDecimal value) {
        individualTotalCntbtIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getIndividualVCIGroupIncomeAmount() {
        return individualVCIGroupIncomeAmountField;
    }

    public void setIndividualVCIGroupIncomeAmount(BigDecimal value) {
        individualVCIGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public Boolean getIsAIAN() {
        return isAIANField;
    }

    public void setIsAIAN(Boolean value) {
        isAIANField = value;
    }

    /**
     *
     */
    public Boolean getIsCatastrophicPlanEligible() {
        return isCatastrophicPlanEligibleField;
    }

    public void setIsCatastrophicPlanEligible(Boolean value) {
        isCatastrophicPlanEligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsConsiderDeductions() {
        return isConsiderDeductionsField;
    }

    public void setIsConsiderDeductions(Boolean value) {
        isConsiderDeductionsField = value;
    }

    /**
     *
     */
    public Boolean getIsConsiderNeeds() {
        return isConsiderNeedsField;
    }

    public void setIsConsiderNeeds(Boolean value) {
        isConsiderNeedsField = value;
    }

    /**
     *
     */
    public Boolean getIsConsiderResource() {
        return isConsiderResourceField;
    }

    public void setIsConsiderResource(Boolean value) {
        isConsiderResourceField = value;
    }

    /**
     *
     */
    public String getIsDisqualify() {
        return isDisqualifyField;
    }

    public void setIsDisqualify(String value) {
        isDisqualifyField = value;
    }

    /**
     *
     */
    public Boolean getIsIncomeConsidered() {
        return isIncomeConsideredField;
    }

    public void setIsIncomeConsidered(Boolean value) {
        isIncomeConsideredField = value;
    }

    /**
     *
     */
    public Boolean getIsMedicallyFrail() {
        return isMedicallyFrailField;
    }

    public void setIsMedicallyFrail(Boolean value) {
        isMedicallyFrailField = value;
    }

    /**
     *
     */
    public Boolean getIsMotherMACheckRequired() {
        return isMotherMACheckRequiredField;
    }

    public void setIsMotherMACheckRequired(Boolean value) {
        isMotherMACheckRequiredField = value;
    }

    /**
     *
     */
    public Boolean getIsNewBorn() {
        return isNewBornField;
    }

    public void setIsNewBorn(Boolean value) {
        isNewBornField = value;
    }

    /**
     *
     */
    public Boolean getIsPreviousPREGEligible() {
        return isPreviousPREGEligibleField;
    }

    public void setIsPreviousPREGEligible(Boolean value) {
        isPreviousPREGEligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsQHPEligible() {
        return isQHPEligibleField;
    }

    public void setIsQHPEligible(Boolean value) {
        isQHPEligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsRebuild() {
        return isRebuildField;
    }

    public void setIsRebuild(Boolean value) {
        isRebuildField = value;
    }

    /**
     *
     */
    public Boolean getIsRelatedToOtherIndividual() {
        return isRelatedToOtherIndividualField;
    }

    public void setIsRelatedToOtherIndividual(Boolean value) {
        isRelatedToOtherIndividualField = value;
    }

    /**
     *
     */
    public Boolean getIsRequiredToFileTaxes() {
        return isRequiredToFileTaxesField;
    }

    public void setIsRequiredToFileTaxes(Boolean value) {
        isRequiredToFileTaxesField = value;
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
    public Boolean getIsTarget() {
        return isTargetField;
    }

    public void setIsTarget(Boolean value) {
        isTargetField = value;
    }

    /**
     *
     */
    public Boolean getIsUSCitizen() {
        return isUSCitizenField;
    }

    public void setIsUSCitizen(Boolean value) {
        isUSCitizenField = value;
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
    public String getOtherSystemBenefit() {
        return OtherSystemBenefitField;
    }

    public void setOtherSystemBenefit(String value) {
        OtherSystemBenefitField = value;
    }

    /**
     *
     */
    public String getLPRResult() {
        return lPRResultField;
    }

    public void setLPRResult(String value) {
        lPRResultField = value;
    }

    /**
     *
     */
    public String getMAGroupIndicator() {
        return mAGroupIndicatorField;
    }

    public void setMAGroupIndicator(String value) {
        mAGroupIndicatorField = value;
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
    public String getMedicalFrailReason() {
        return medicalFrailReasonField;
    }

    public void setMedicalFrailReason(String value) {
        medicalFrailReasonField = value;
    }

    /**
     *
     */
    public String getMotherMABenefit() {
        return motherMABenefitField;
    }

    public void setMotherMABenefit(String value) {
        motherMABenefitField = value;
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
    public BigDecimal getOtherIncomeAmount() {
        return otherIncomeAmountField;
    }

    public void setOtherIncomeAmount(BigDecimal value) {
        otherIncomeAmountField = value;
    }

    /**
     *
     */
    public String getPartStatusCode() {
        return partStatusCodeField;
    }

    public void setPartStatusCode(String value) {
        partStatusCodeField = value;
    }

    /**
     *
     */
    public Boolean getperform_APTC_32_37_119_Alien_Check() {
        return perform_APTC_32_37_119_Alien_CheckField;
    }

    public void setperform_APTC_32_37_119_Alien_Check(Boolean value) {
        perform_APTC_32_37_119_Alien_CheckField = value;
    }

    /**
     *
     */
    public Boolean getperform_APTC_VLP_QNC_Check() {
        return perform_APTC_VLP_QNC_CheckField;
    }

    public void setperform_APTC_VLP_QNC_Check(Boolean value) {
        perform_APTC_VLP_QNC_CheckField = value;
    }

    /**
     *
     */
    public String getPriorMedCode() {
        return priorMedCodeField;
    }

    public void setPriorMedCode(String value) {
        priorMedCodeField = value;
    }

    /**
     *
     */
    public String getRelationshipWithTargetIndividual() {
        return relationshipWithTargetIndividualField;
    }

    public void setRelationshipWithTargetIndividual(String value) {
        relationshipWithTargetIndividualField = value;
    }

    /**
     *
     */
    public BigDecimal getSelfEmploymentIncome() {
        return selfEmploymentIncomeField;
    }

    public void setSelfEmploymentIncome(BigDecimal value) {
        selfEmploymentIncomeField = value;
    }

    /**
     *
     */
    public Long getSpouseIndividualId() {
        return spouseIndividualIdField;
    }

    public void setSpouseIndividualId(Long value) {
        spouseIndividualIdField = value;
    }

    /**
     *
     */
    public String getStateReasonableCompatible() {
        return stateReasonableCompatibleField;
    }

    public void setStateReasonableCompatible(String value) {
        stateReasonableCompatibleField = value;
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
    public String getTaxFilerStatusCode() {
        return taxFilerStatusCodeField;
    }

    public void setTaxFilerStatusCode(String value) {
        taxFilerStatusCodeField = value;
    }

    /**
     *
     */
    public Long getTaxPayerIndividualId() {
        return taxPayerIndividualIdField;
    }

    public void setTaxPayerIndividualId(Long value) {
        taxPayerIndividualIdField = value;
    }

    /**
     *
     */
    public BigDecimal getTotalGrossExpenses() {
        return totalGrossExpensesField;
    }

    public void setTotalGrossExpenses(BigDecimal value) {
        totalGrossExpensesField = value;
    }

    /**
     *
     */
    public Long getUnbornChildCount() {
        return unbornChildCountField;
    }

    public void setUnbornChildCount(Long value) {
        unbornChildCountField = value;
    }

    /**
     *
     */
    public Boolean getv_taxDependent_1000_110() {
        return v_taxDependent_1000_110Field;
    }

    public void setv_taxDependent_1000_110(Boolean value) {
        v_taxDependent_1000_110Field = value;
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
    public String getVCIReasonableCompatible() {
        return vCIReasonableCompatibleField;
    }

    public void setVCIReasonableCompatible(String value) {
        vCIReasonableCompatibleField = value;
    }

    /**
     *
     */
    public LocalDateTime getVCLDueDate() {
        return vCLDueDateField;
    }

    public void setVCLDueDate(LocalDateTime value) {
        vCLDueDateField = value;
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
    public EDGGroup geteDGGroup() {
        return eDGGroupField;
    }

    public void seteDGGroup(EDGGroup value) {
        eDGGroupField = value;
    }

    /**
     *
     */
    public List<EDGIndividualExpenses> geteDGIndividualExpenses() {
        return eDGIndividualExpensesField;
    }

    public void seteDGIndividualExpenses(List<EDGIndividualExpenses> value) {
        eDGIndividualExpensesField = value;
    }

    /**
     *
     */
    public List<Income> getincome() {
        return incomeField;
    }

    public void setincome(List<Income> value) {
        incomeField = value;
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
    public List<Notice> getnotice() {
        return noticeField;
    }

    public void setnotice(List<Notice> value) {
        noticeField = value;
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

    public Boolean getPerform_2000_381() {
        return perform_2000_381Field;
    }

    public void setPerform_2000_381(Boolean perform_2000_381Field) {
        this.perform_2000_381Field = perform_2000_381Field;
    }

    public Boolean getPerform_3000_005_2B() {
        return perform_3000_005_2BField;
    }

    public void setPerform_3000_005_2B(Boolean perform_3000_005_2BField) {
        this.perform_3000_005_2BField = perform_3000_005_2BField;
    }

    public Boolean getPerform_3000_005_2D() {
        return perform_3000_005_2DField;
    }

    public void setPerform_3000_005_2D(Boolean perform_3000_005_2DField) {
        this.perform_3000_005_2DField = perform_3000_005_2DField;
    }

    public Boolean getPerform_3000_005_2E() {
        return perform_3000_005_2EField;
    }

    public void setPerform_3000_005_2E(Boolean perform_3000_005_2EField) {
        this.perform_3000_005_2EField = perform_3000_005_2EField;
    }

    public Boolean getPerform_3000_005_3A() {
        return perform_3000_005_3AField;
    }

    public void setPerform_3000_005_3A(Boolean perform_3000_005_3AField) {
        this.perform_3000_005_3AField = perform_3000_005_3AField;
    }

    public Boolean getPerform_3000_006_1B() {
        return perform_3000_006_1BField;
    }

    public void setPerform_3000_006_1B(Boolean perform_3000_006_1BField) {
        this.perform_3000_006_1BField = perform_3000_006_1BField;
    }

    public Boolean getPerform_3000_010() {
        return perform_3000_010Field;
    }

    public void setPerform_3000_010(Boolean perform_3000_010Field) {
        this.perform_3000_010Field = perform_3000_010Field;
    }

    public Boolean getPerform_32_37_119_Alien_Check() {
        return perform_32_37_119_Alien_CheckField;
    }

    public void setPerform_32_37_119_Alien_Check(Boolean perform_32_37_119_Alien_CheckField) {
        this.perform_32_37_119_Alien_CheckField = perform_32_37_119_Alien_CheckField;
    }

    public Boolean getPerform_Alien_Check() {
        return perform_Alien_CheckField;
    }

    public void setPerform_Alien_Check(Boolean perform_Alien_CheckField) {
        this.perform_Alien_CheckField = perform_Alien_CheckField;
    }

    public Boolean getPerform_Alien_Check_For_APTC() {
        return perform_Alien_Check_For_APTCField;
    }

    public void setPerform_Alien_Check_For_APTC(Boolean perform_Alien_Check_For_APTCField) {
        this.perform_Alien_Check_For_APTCField = perform_Alien_Check_For_APTCField;
    }

    public Boolean getPerform_CHEX_attendingSchool_Check() {
        return perform_CHEX_attendingSchool_CheckField;
    }

    public void setPerform_CHEX_attendingSchool_Check(Boolean perform_CHEX_attendingSchool_CheckField) {
        this.perform_CHEX_attendingSchool_CheckField = perform_CHEX_attendingSchool_CheckField;
    }

    public Boolean getPerform_Citizenship_Check() {
        return perform_Citizenship_CheckField;
    }

    public void setPerform_Citizenship_Check(Boolean perform_Citizenship_CheckField) {
        this.perform_Citizenship_CheckField = perform_Citizenship_CheckField;
    }

    public Boolean getPerform_Entitled_Benefit_Check() {
        return perform_Entitled_Benefit_CheckField;
    }

    public void setPerform_Entitled_Benefit_Check(Boolean perform_Entitled_Benefit_CheckField) {
        this.perform_Entitled_Benefit_CheckField = perform_Entitled_Benefit_CheckField;
    }

    public Boolean getPerform_Five_Year_Bar_Checkperform_ESI_MEC_Check() {
        return perform_Five_Year_Bar_Checkperform_ESI_MEC_CheckField;
    }

    public void setPerform_Five_Year_Bar_Checkperform_ESI_MEC_Check(
            Boolean perform_Five_Year_Bar_Checkperform_ESI_MEC_CheckField) {
        this.perform_Five_Year_Bar_Checkperform_ESI_MEC_CheckField = perform_Five_Year_Bar_Checkperform_ESI_MEC_CheckField;
    }

    public Boolean getPerform_FosterCare_AdoptionAssistance_Check() {
        return perform_FosterCare_AdoptionAssistance_CheckField;
    }

    public void setPerform_FosterCare_AdoptionAssistance_Check(
            Boolean perform_FosterCare_AdoptionAssistance_CheckField) {
        this.perform_FosterCare_AdoptionAssistance_CheckField = perform_FosterCare_AdoptionAssistance_CheckField;
    }

    public Boolean getPerform_Insurance_Check() {
        return perform_Insurance_CheckField;
    }

    public void setPerform_Insurance_Check(Boolean perform_Insurance_CheckField) {
        this.perform_Insurance_CheckField = perform_Insurance_CheckField;
    }

    public Boolean getPerform_MEC_Check() {
        return perform_MEC_CheckField;
    }

    public void setPerform_MEC_Check(Boolean perform_MEC_CheckField) {
        this.perform_MEC_CheckField = perform_MEC_CheckField;
    }

    public Boolean getPerform_NewBorn_Check() {
        return perform_NewBorn_CheckField;
    }

    public void setPerform_NewBorn_Check(Boolean perform_NewBorn_CheckField) {
        this.perform_NewBorn_CheckField = perform_NewBorn_CheckField;
    }

    public Boolean getPerform_OutOfState_Benefits_Check() {
        return perform_OutOfState_Benefits_CheckField;
    }

    public void setPerform_OutOfState_Benefits_Check(Boolean perform_OutOfState_Benefits_CheckField) {
        this.perform_OutOfState_Benefits_CheckField = perform_OutOfState_Benefits_CheckField;
    }

    public Boolean getPerform_Pregnancy_Check() {
        return perform_Pregnancy_CheckField;
    }

    public void setPerform_Pregnancy_Check(Boolean perform_Pregnancy_CheckField) {
        this.perform_Pregnancy_CheckField = perform_Pregnancy_CheckField;
    }

    public Boolean getPerform_QHP_Ineligibile_Check() {
        return perform_QHP_Ineligibile_CheckField;
    }

    public void setPerform_QHP_Ineligibile_Check(Boolean perform_QHP_Ineligibile_CheckField) {
        this.perform_QHP_Ineligibile_CheckField = perform_QHP_Ineligibile_CheckField;
    }

    public Boolean getPerform_Residency_Check() {
        return perform_Residency_CheckField;
    }

    public void setPerform_Residency_Check(Boolean perform_Residency_CheckField) {
        this.perform_Residency_CheckField = perform_Residency_CheckField;
    }

    public Boolean getPerform_SSN_Check() {
        return perform_SSN_CheckField;
    }

    public void setPerform_SSN_Check(Boolean perform_SSN_CheckField) {
        this.perform_SSN_CheckField = perform_SSN_CheckField;
    }

    public Boolean getPerform_VCI_RC() {
        return perform_VCI_RCField;
    }

    public void setPerform_VCI_RC(Boolean perform_VCI_RCField) {
        this.perform_VCI_RCField = perform_VCI_RCField;
    }

    public Boolean getPerform_VLP_QNC_Check() {
        return perform_VLP_QNC_CheckField;
    }

    public void setPerform_VLP_QNC_Check(Boolean perform_VLP_QNC_CheckField) {
        this.perform_VLP_QNC_CheckField = perform_VLP_QNC_CheckField;
    }

    public Boolean getPerformFilingJointly() {
        return performFilingJointlyField;
    }

    public void setPerformFilingJointly(Boolean performFilingJointlyField) {
        this.performFilingJointlyField = performFilingJointlyField;
    }

    public Boolean getV_childOfTarget_1000_150() {
        return v_childOfTarget_1000_150Field;
    }

    public void setV_childOfTarget_1000_150(Boolean v_childOfTarget_1000_150Field) {
        this.v_childOfTarget_1000_150Field = v_childOfTarget_1000_150Field;
    }

    public Boolean getV_isDepChildOfTarget_1000_140() {
        return v_isDepChildOfTarget_1000_140Field;
    }

    public void setV_isDepChildOfTarget_1000_140(Boolean v_isDepChildOfTarget_1000_140Field) {
        this.v_isDepChildOfTarget_1000_140Field = v_isDepChildOfTarget_1000_140Field;
    }

    public Boolean getV_isSpouseOfTarget_1000_140() {
        return v_isSpouseOfTarget_1000_140Field;
    }

    public void setV_isSpouseOfTarget_1000_140(Boolean v_isSpouseOfTarget_1000_140Field) {
        this.v_isSpouseOfTarget_1000_140Field = v_isSpouseOfTarget_1000_140Field;
    }

    public Boolean getV_isTargetTaxDependent_1000_140() {
        return v_isTargetTaxDependent_1000_140Field;
    }

    public void setV_isTargetTaxDependent_1000_140(Boolean v_isTargetTaxDependent_1000_140Field) {
        this.v_isTargetTaxDependent_1000_140Field = v_isTargetTaxDependent_1000_140Field;
    }

    public Boolean getV_isTaxDepOfTarget_1000_140() {
        return v_isTaxDepOfTarget_1000_140Field;
    }

    public void setV_isTaxDepOfTarget_1000_140(Boolean v_isTaxDepOfTarget_1000_140Field) {
        this.v_isTaxDepOfTarget_1000_140Field = v_isTaxDepOfTarget_1000_140Field;
    }

    public Boolean getV_parentOfTarget_1000_150() {
        return v_parentOfTarget_1000_150Field;
    }

    public void setV_parentOfTarget_1000_150(Boolean v_parentOfTarget_1000_150Field) {
        this.v_parentOfTarget_1000_150Field = v_parentOfTarget_1000_150Field;
    }

    public Boolean getV_siblingOfTarget_1000_150() {
        return v_siblingOfTarget_1000_150Field;
    }

    public void setV_siblingOfTarget_1000_150(Boolean v_siblingOfTarget_1000_150Field) {
        this.v_siblingOfTarget_1000_150Field = v_siblingOfTarget_1000_150Field;
    }

    public Boolean getV_SpouseOfTarget_1000_150() {
        return v_SpouseOfTarget_1000_150Field;
    }

    public void setV_SpouseOfTarget_1000_150(Boolean v_SpouseOfTarget_1000_150Field) {
        this.v_SpouseOfTarget_1000_150Field = v_SpouseOfTarget_1000_150Field;
    }

    public Boolean getV_taxDepOfTaxPayer_1000_140() {
        return v_taxDepOfTaxPayer_1000_140Field;
    }

    public void setV_taxDepOfTaxPayer_1000_140(Boolean v_taxDepOfTaxPayer_1000_140Field) {
        this.v_taxDepOfTaxPayer_1000_140Field = v_taxDepOfTaxPayer_1000_140Field;
    }

    public Boolean getPerform_ESI_MEC_Check() {
        return perform_ESI_MEC_CheckField;
    }

    public void setPerform_ESI_MEC_Check(Boolean perform_ESI_MEC_CheckField) {
        this.perform_ESI_MEC_CheckField = perform_ESI_MEC_CheckField;
    }

    public Boolean getPerform_Five_Year_Bar_Check() {
        return perform_Five_Year_Bar_CheckField;
    }

    public void setPerform_Five_Year_Bar_Check(Boolean perform_Five_Year_Bar_CheckField) {
        this.perform_Five_Year_Bar_CheckField = perform_Five_Year_Bar_CheckField;
    }

}