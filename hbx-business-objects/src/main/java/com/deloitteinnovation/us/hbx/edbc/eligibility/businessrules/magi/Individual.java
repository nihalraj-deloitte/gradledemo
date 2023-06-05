package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.LocalDateTimeAdapter;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.OffsetDateTimeAdapter;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.WSLongAdapter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Individual {

    @XmlElement(name = "AIANVCLDueDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime aIANVCLDueDateField;

    @XmlElement(name = "AlienTypeCode")
    private String alienTypeCodeField;

    @XmlElement(name = "ApplicantType")
    private String applicantTypeField;

    @XmlElement(name = "AuthorizeProgramList")
    private String authorizeProgramListField;

    @XmlElement(name = "AuthorizeTOAList")
    private String authorizeTOAListField;

    @XmlElement(name = "ConversionDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime conversionDateField;

    @XmlElement(name = "ConversionRecipientCode")
    private String conversionRecipientCodeField;

    @XmlElement(name = "DateOfBirth")
    @XmlJavaTypeAdapter(OffsetDateTimeAdapter.class)
    private LocalDateTime dateOfBirthField;

    @XmlElement(name = "DateOfDeath")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime dateOfDeathField;

    @XmlElement(name = "isFullTimeStudent")
    private String isFullTimeStudent;

    @XmlElement(name = "IsSMA")
    private Boolean IsSMAField;

    @XmlElement(name = "EDGTraceId")
    private Long eDGTraceIdField;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime eMACoverageThroughDateField;

    @XmlElement(name = "EmergencyBeginDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime emergencyBeginDateField;

    @XmlElement(name = "EmergencyMedicaidId")
    private Long emergencyMedicaidIdField;

    @XmlElement(name = "EmployerHealthCoverageType")
    private String employerHealthCoverageTypeField;

    @XmlElement(name = "ErrorCode")
    private String errorCodeField;

    @XmlElement(name = "ErrorMessagePresent")
    private Boolean errorMessagePresentField;

    @XmlElement(name = "IsMADeniedPast90Days")
    private Boolean isMADeniedPast90DaysField;


    @XmlElement(name = "ESILowestCostSilverPlan")
    private BigDecimal eSILowestCostSilverPlanField;

    @XmlElement(name = "EvaluateSpendDown")
    private Boolean evaluateSpendDownField;

    @XmlElement(name = "FederalErrorCode")
    private String federalErrorCodeField;

    @XmlElement(name = "FiveYearBarApplyIndicator")
    private String fiveYearBarApplyIndicatorField;

    @XmlElement(name = "FiveYearBarMetIndicator")
    private String fiveYearBarMetIndicatorField;

    @XmlElement(name = "HadPACAEligibility3MonthsPrior")
    private Boolean hadPACAEligibility3MonthsPriorField;

    @XmlElement(name = "HasCitizenStatus")
    private Boolean hasCitizenStatusField;

    @XmlElement(name = "HasEmergencyMedicalCondition")
    private Boolean hasEmergencyMedicalConditionField;

    @XmlElement(name = "HasExemptionCertificate")
    private Boolean hasExemptionCertificateField;

    @XmlElement(name = "HasIncomeBeenExempted")
    private Boolean hasIncomeBeenExemptedField;

    @XmlElement(name = "HasLawfulPresenceVerification")
    private String hasLawfulPresenceVerificationField;

    @XmlElement(name = "HasMEC")
    private String hasMECField;

    @XmlElement(name = "HasMedicare")
    private Boolean hasMedicareField;

    @XmlElement(name = "HasMet5YearBan")
    private Boolean hasMet5YearBanField;

    @XmlElement(name = "HasMet5YearBanAvailable")
    private Boolean hasMet5YearBanAvailableField;

    @XmlElement(name = "HasPendingFamilyMedicalBills")
    private Boolean hasPendingFamilyMedicalBillsField;

    @XmlElement(name = "HasReasonToDoubt")
    private Boolean hasReasonToDoubtField;

    @XmlElement(name = "HasSelfAttestedMet5Year")
    private Boolean hasSelfAttestedMet5YearField;

    @XmlElement(name = "HasSelfAttestedMet5YearAvailable")
    private Boolean hasSelfAttestedMet5YearAvailableField;

    @XmlElement(name = "HasSSN")
    private Boolean hasSSNField;

    @XmlElement(name = "HasVWPenalty")
    private Boolean hasVWPenaltyField;

    @XmlElement(name = "HasWrittenMedicalStatement")
    private Boolean hasWrittenMedicalStatementField;

    @XmlElement(name = "HBE002Flag")
    private Boolean hBE002FlagField;

    @XmlElement(name = "IncarcerationEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime incarcerationEndDateField;

    @XmlElement(name = "IndividualAge")
    private Long individualAgeField;

    @XmlID
    @XmlElement(name = "IndividualId")
    @XmlJavaTypeAdapter(WSLongAdapter.class)
    private Long individualIdField;

    @XmlElement(name = "IndividualIncomeAmount")
    private BigDecimal individualIncomeAmountField;

    @XmlElement(name = "IndivSuspensionIndicator")
    private String indivSuspensionIndicatorField;

    @XmlElement(name = "IsAcceptableAIAN")
    private Boolean isAcceptableAIANField;

    @XmlElement(name = "IsActiveInOtherSystem")
    private Boolean isActiveInOtherSystemField;

    @XmlElement(name = "IsActiveInOtherEDG")
    private Boolean isActiveInOtherEDGField;

    @XmlElement(name = "IsActiveOnAnotherCase")
    private Boolean isActiveOnAnotherCaseField;

    @XmlElement(name = "IsADBH")
    private Boolean isADBHField;

    @XmlElement(name = "IsADFF")
    private Boolean isADFFField;

    @XmlElement(name = "IsADLT")
    private Boolean isADLTField;

    @XmlElement(name = "IsADPR")
    private Boolean isADPRField;

    @XmlElement(name = "IsAIAN")
    private Boolean isAIANField;

    @XmlElement(name = "IsAlienStatus")
    private Boolean isAlienStatusField;

    @XmlElement(name = "IsAppliedFor")
    private Boolean isAppliedForField;

    @XmlElement(name = "IsApprovedForSpendDown")
    private Boolean isApprovedForSpendDownField;

    @XmlElement(name = "IsAPTC")
    private Boolean isAPTCField;

    @XmlElement(name = "IsAttendingSchool")
    private Boolean isAttendingSchoolField;

    @XmlElement(name = "IsAuthorizedEdmPresent")
    private Boolean isAuthorizedEdmPresentField;

    @XmlElement(name = "IsBlindDisabled")
    private Boolean isBlindDisabledField;

    @XmlElement(name = "IsCEEligibleAfterRecert")
    private Boolean isCEEligibleAfterRecertField;

    @XmlElement(name = "IsCEEligibleOnAnotherCase")
    private Boolean isCEEligibleOnAnotherCaseField;

    @XmlElement(name = "IsCHEX")
    private Boolean isCHEXField;

    @XmlElement(name = "IsChild")
    private Boolean isChildField;

    @XmlElement(name = "IsCHIP")
    private Boolean isCHIPField;

    @XmlElement(name = "IsCHL1")
    private Boolean isCHL1Field;

    @XmlElement(name = "IsCHL2")
    private Boolean isCHL2Field;

    @XmlElement(name = "IsCHL3")
    private Boolean isCHL3Field;

    @XmlElement(name = "IsCHL4")
    private Boolean isCHL4Field;

    @XmlElement(name = "IsCONV")
    private Boolean isCONVField;

    @XmlElement(name = "IsConditionallyEnrolled")
    private Boolean isConditionallyEnrolled;

    @XmlElement(name = "IsConversionChild")
    private Boolean isConversionChildField;

    @XmlElement(name = "IsCurrentCoverageRecordExist")
    private Boolean isCurrentCoverageRecordExistField;

    @XmlElement(name = "IsDeceased")
    private Boolean isDeceasedField;

    @XmlElement(name = "IsDeterminedUsingTrustedDataSource")
    private Boolean isDeterminedUsingTrustedDataSourceField;

    @XmlElement(name = "IsEDMInEMAExtPeriod")
    private Boolean isEDMInEMAExtPeriodField;

    @XmlElement(name = "IsEligibilityIndividualBenefitExist")
    private Boolean isEligibilityIndividualBenefitExistField;

    @XmlElement(name = "IsEligibleForDJJM")
    private Boolean isEligibleForDJJMField;

    @XmlElement(name = "IsEligibleForFosterCare")
    private Boolean isEligibleForFosterCareField;

    @XmlElement(name = "IsEligibleForPregNMAGIInPriorMonth")
    private Boolean isEligibleForPregNMAGIInPriorMonthField;

    @XmlElement(name = "IsEligibleForSubsidizedAdoption")
    private Boolean isEligibleForSubsidizedAdoptionField;

    @XmlElement(name = "IsEMAExtensionRequested")
    private Boolean isEMAExtensionRequestedField;

    @XmlElement(name = "IsEmployerPlanAffordable")
    private Boolean isEmployerPlanAffordableField;

    @XmlElement(name = "IsExtensionPending")
    private Boolean isExtensionPendingField;

    @XmlElement(name = "IsExternalPolicyHolder")
    private Boolean isExternalPolicyHolderField;

    @XmlElement(name = "IsFederalIncomeExist")
    private Boolean isFederalIncomeExistField;

    @XmlElement(name = "IsFederalServerDown")
    private Boolean isFederalServerDownField;

    @XmlElement(name = "IsFFCC")
    private Boolean isFFCCField;

    private Boolean isFFOSField;

    @XmlElement(name = "IsFFS1")
    private Boolean isFFS1Field;

    @XmlElement(name = "IsFiler")
    private Boolean isFilerField;

    @XmlElement(name = "IsFilingJointly")
    private Boolean isFilingJointlyField;

    @XmlElement(name = "IsFilingSeparately")
    private Boolean isFilingSeparatelyField;

    @XmlElement(name = "IsG845Mailed")
    private Boolean isG845MailedField;

    @XmlElement(name = "IsHeadOfHousehold")
    private Boolean isHeadOfHouseholdField;

    @XmlElement(name = "IsIncarcerated")
    private Boolean isIncarceratedField;

    @XmlElement(name = "IsIncomeReportedIn10thMonth")
    private Boolean isIncomeReportedIn10thMonthField;

    @XmlElement(name = "IsIncomeReportedIn4thMonth")
    private Boolean isIncomeReportedIn4thMonthField;

    @XmlElement(name = "IsIncomeReportedIn7thMonth")
    private Boolean isIncomeReportedIn7thMonthField;

    @XmlElement(name = "IsIndivQHPEnrolled")
    private Boolean isIndivQHPEnrolledField;

    @XmlElement(name = "IsInFilerGroup")
    private Boolean isInFilerGroupField;

    @XmlElement(name = "IsInNonFilerGroup")
    private Boolean isInNonFilerGroupField;

    @XmlElement(name = "IsInP2Facility")
    private Boolean isInP2FacilityField;

    @XmlElement(name = "IsIntendToReside")
    private Boolean isIntendToResideField;

    @XmlElement(name = "IsSbeHRct")
    private Boolean isSbeHRctField;

    @XmlElement(name = "IsMAApprovedInPreviousMonth")
    private Boolean isMAApprovedInPreviousMonthField;

    @XmlElement(name = "IsManuallyCreatingEDG")
    private Boolean isManuallyCreatingEDGField;

    @XmlElement(name = "IsMAPresentForFutureMonths")
    private Boolean isMAPresentForFutureMonthsField;

    @XmlElement(name = "IsMECEligibleADLT")
    private Boolean isMECEligibleADLTField;

    @XmlElement(name = "IsMECEligibleAPTC")
    private Boolean isMECEligibleAPTCField;

    @XmlElement(name = "IsMECEligibleCHEX")
    private Boolean isMECEligibleCHEXField;

    @XmlElement(name = "IsMECEligibleCHL3")
    private Boolean isMECEligibleCHL3;

    @XmlElement(name = "IsMECEligibleKCHIP")
    private Boolean isMECEligibleKCHIPField;

    @XmlElement(name = "IsMECEligibleMedicaid")
    private Boolean isMECEligibleMedicaidField;

    @XmlElement(name = "IsMedicallyFrail")
    private Boolean isMedicallyFrailField;

    @XmlElement(name = "isMedicareNonEsiMec")
    private Boolean isMedicareNonEsiMecField;

    @XmlElement(name = "IsMotherMACheckRequired")
    private Boolean isMotherMACheckRequiredField;

    @XmlElement(name = "IsNCPDataPresent")
    private Boolean isNCPDataPresentField;

    @XmlElement(name = "IsNewBorn")
    private Boolean isNewBornField;

    @XmlElement(name = "IsNMME")
    private Boolean isNMMEField;

    @XmlElement(name = "IsNoIncomeVrfRecordPresent")
    private Boolean isNoIncomeVrfRecordPresentField;

    @XmlElement(name = "IsNonPaymentDenialExists")
    private Boolean isNonPaymentDenialExistsField;

    @XmlElement(name = "IsOngoingTMXE")
    private Boolean isOngoingTMXEField;

    @XmlElement(name = "IsOngoingTMXS")
    private Boolean isOngoingTMXSField;

    @XmlElement(name = "IsPACA")
    private Boolean isPACAField;

    @XmlElement(name = "IsPartOfGroup")
    private Boolean isPartOfGroupField;

    @XmlElement(name = "IsPastSixMonthsEnrollmentIneligible")
    private Boolean isPastSixMonthsEnrollmentIneligibleField;

    @XmlElement(name = "IsPastSixMonthsSuspensionIneligible")
    private Boolean isPastSixMonthsSuspensionIneligibleField;

    @XmlElement(name = "IsPotentialCoverageRecordExist")
    private Boolean isPotentialCoverageRecordExistField;

    @XmlElement(name = "IsPotentiallySSIEligible")
    private Boolean isPotentiallySSIEligibleField;

    @XmlElement(name = "IsPREG")
    private Boolean isPREGField;

    @XmlElement(name = "IsPregnant")
    private Boolean isPregnantField;

    @XmlElement(name = "IsPreviouslyADPREligible")
    private Boolean isPreviouslyADPREligibleField;

    @XmlElement(name = "IsPreviouslyMAEligible")
    private Boolean isPreviouslyMAEligibleField;

    @XmlElement(name = "IsPreviouslyPregnantEligible")
    private Boolean isPreviouslyPregnantEligibleField;

    @XmlElement(name = "IsQHPEligible")
    private Boolean isQHPEligibleField;

    @XmlElement(name = "IsRebuild")
    private Boolean isRebuildField;

    @XmlElement(name = "IsReceivingADLT_ADPR")
    private Boolean isReceivingADLT_ADPRField;

    @XmlElement(name = "IsReceivingAdoptionAssistance")
    private Boolean isReceivingAdoptionAssistanceField;

    @XmlElement(name = "IsReceivingCHIPInOtherSystem")
    private Boolean isReceivingCHIPInOtherSystemField;

    @XmlElement(name = "IsReceivingFFCC")
    private Boolean isReceivingFFCCField;

    @XmlElement(name = "IsReceivingFFCCOutOfState")
    private Boolean isReceivingFFCCOutOfStateField;

    @XmlElement(name = "IsReceivingFosterCare")
    private Boolean isReceivingFosterCareField;

    @XmlElement(name = "IsReceivingMedicareOrLTC")
    private Boolean isReceivingMedicareOrLTCField;

    @XmlElement(name = "IsReceivingOnlyMedicareInOtherSystem")
    private Boolean isReceivingOnlyMedicareInOtherSystemField;

    @XmlElement(name = "IsReceivingOutOfStateBenefits")
    private Boolean isReceivingOutOfStateBenefitsField;

    @XmlElement(name = "IsReceivingSCBenefits")
    private Boolean isReceivingSCBenefitsField;

    @XmlElement(name = "IsReceivingSSI")
    private Boolean isReceivingSSIField;

    @XmlElement(name = "IsReceivingSSIFromOtherSystem")
    private Boolean isReceivingSSIFromOtherSystemField;

    @XmlElement(name = "IsReceivingSSIFromSDX")
    private Boolean isReceivingSSIFromSDXField;

    @XmlElement(name = "IsReceivingStateSuppliment")
    private Boolean isReceivingStateSupplimentField;

    @XmlElement(name = "IsRelatedToOtherIndividual")
    private Boolean isRelatedToOtherIndividualField;

    @XmlElement(name = "IsRequiredToFileTaxes")
    private Boolean isRequiredToFileTaxesField;

    @XmlElement(name = "IsResident")
    private Boolean isResidentField;

    @XmlElement(name = "IsSpendDown")
    private Boolean isSpendDownField;

    @XmlElement(name = "IsSpendownMagiEligible")
    private Boolean isSpendownMagiEligibleField;

    @XmlElement(name = "IsSSIRecipient")
    private Boolean isSSIRecipientField;

    @XmlElement(name = "IsSuspended")
    private Boolean isSuspendedField;

    @XmlElement(name = "IsSwicaIncomeExist")
    private Boolean isSwicaIncomeExistField;

    @XmlElement(name = "IsSwicaServerDown")
    private Boolean isSwicaServerDownField;

    @XmlElement(name = "IsTaxDependent")
    private Boolean isTaxDependentField;

    @XmlElement(name = "IsTaxFiler")
    private Boolean isTaxFilerField;

    @XmlElement(name = "IsTaxFilingInformationAvailable")
    private Boolean isTaxFilingInformationAvailableField;

    @XmlElement(name = "IsTaxGroupIdSetForDependent")
    private Boolean isTaxGroupIdSetForDependentField;

    @XmlElement(name = "IsTaxGroupIdSetForSpouse")
    private Boolean isTaxGroupIdSetForSpouseField;

    @XmlElement(name = "IsTaxPayed")
    private Boolean isTaxPayedField;

    @XmlElement(name = "IsTMAE")
    private Boolean isTMAEField;

    @XmlElement(name = "IsTMAS")
    private Boolean isTMASField;

    @XmlElement(name = "IsTMCE")
    private Boolean isTMCEField;

    @XmlElement(name = "IsTMCS")
    private Boolean isTMCSField;

    @XmlElement(name = "IsToRunSpendownMagi")
    private Boolean isToRunSpendownMagiField;

    @XmlElement(name = "IsTP45")
    private Boolean isTP45Field;

    @XmlElement(name = "IsUSCitizen")
    private Boolean isUSCitizenField;

    @XmlElement(name = "IsVCIIncomeExist")
    private Boolean isVCIIncomeExistField;

    @XmlElement(name = "IsVCLExist")
    private Boolean isVCLExistField;

    @XmlElement(name = "IsWaiverWaitList")
    private String isWaiverWaitListField;

    @XmlElement(name = "IsWillingToApplyEntitledBenefit")
    private Boolean isWillingToApplyEntitledBenefitField;

    @XmlElement(name = "OtherSystemBenefit")
    private String OtherSystemBenefitField;

    @XmlElement(name = "LawfulPresenceVerified")
    private String lawfulPresenceVerifiedField;

    @XmlElement(name = "LevelOfCareType")
    private String levelOfCareTypeField;

    @XmlElement(name = "LoseMECGoodCauseReason")
    private String loseMECGoodCauseReasonField;

    @XmlElement(name = "LPR")
    private String lPRField;

    @XmlElement(name = "MotherMABenefit")
    private String motherMABenefitField;

    @XmlElement(name = "OngoingTOAPriorityNumber")
    private Long ongoingTOAPriorityNumberField;

    @XmlElement(name = "OngoingTypeOfAssistance")
    private String ongoingTypeOfAssistanceField;

    @XmlElement(name = "Perform_OtherSystem")
    private Boolean perform_OtherSystemField;

    @XmlElement(name = "PregnancyPostPartumEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime pregnancyPostPartumEndDateField;

    @XmlElement(name = "PremiumLowestSilverPlan")
    private BigDecimal premiumLowestSilverPlanField;

    @XmlElement(name = "PreviousEarnedIncome")
    private BigDecimal previousEarnedIncomeField;

    @XmlElement(name = "PreviousSpousalSupportIncome")
    private BigDecimal previousSpousalSupportIncomeField;

    @XmlElement(name = "PriorMedCode")
    private String priorMedCodeField;

    @XmlElement(name = "ProgramRequestDate")
    @XmlJavaTypeAdapter(OffsetDateTimeAdapter.class)
    private LocalDateTime programRequestDateField;

    @XmlElement(name = "QualifiedNonCitizenIndicator")
    private String qualifiedNonCitizenIndicatorField;

    @XmlElement(name = "R5_FedId")
    private String r5_FedIdField;

    @XmlElement(name = "R5_GrossEarnIncomeAmount")
    private BigDecimal r5_GrossEarnIncomeAmountField;

    @XmlElement(name = "R5_GrossUnEarnedIncomeAmount")
    private BigDecimal r5_GrossUnEarnedIncomeAmountField;

    @XmlElement(name = "R5_InclusionMAGIIncome")
    private BigDecimal r5_InclusionMAGIIncomeField;

    @XmlElement(name = "R5_IndividualAnnualAPTCIncome")
    private BigDecimal r5_IndividualAnnualAPTCIncomeField;

    @XmlElement(name = "R5_IndividualFederalGroupIncomeAmount")
    private BigDecimal r5_IndividualFederalGroupIncomeAmountField;

    @XmlElement(name = "R5_IndividualSelfAttestedEarnedIncome")
    private BigDecimal r5_IndividualSelfAttestedEarnedIncomeField;

    @XmlElement(name = "R5_IndividualSelfAttestedGrossIncome")
    private BigDecimal r5_IndividualSelfAttestedGrossIncomeField;

    @XmlElement(name = "R5_IndividualSelfAttestedOtherIncome")
    private BigDecimal r5_IndividualSelfAttestedOtherIncomeField;

    @XmlElement(name = "R5_IndividualSelfAttestedSelfEmploymentIncome")
    private BigDecimal r5_IndividualSelfAttestedSelfEmploymentIncomeField;

    @XmlElement(name = "R5_IndividualSelfAttestedUnearnedIncome")
    private BigDecimal r5_IndividualSelfAttestedUnearnedIncomeField;

    @XmlElement(name = "R5_IndividualSelfAttestedUnemploymentIncome")
    private BigDecimal r5_IndividualSelfAttestedUnemploymentIncomeField;

    @XmlElement(name = "R5_IndividualStateGroupIncomeAmount")
    private BigDecimal r5_IndividualStateGroupIncomeAmountField;

    @XmlElement(name = "R5_IndividualTotalCntbtIncome")
    private BigDecimal r5_IndividualTotalCntbtIncomeField;

    @XmlElement(name = "R5_IndividualVCIGroupIncomeAmount")
    private BigDecimal r5_IndividualVCIGroupIncomeAmountField;

    @XmlElement(name = "R5_IsIndividualInactiveInCase")
    private String r5_IsIndividualInactiveInCaseField;

    @XmlElement(name = "R5_IsNMAGIEligible")
    private Boolean r5_IsNMAGIEligibleField;

    @XmlElement(name = "R5_JointSelfAttestedIncomeCalculated")
    private BigDecimal r5_JointSelfAttestedIncomeCalculatedField;

    @XmlElement(name = "R5_OtherIncomeAmount")
    private BigDecimal r5_OtherIncomeAmountField;

    @XmlElement(name = "R5_PolicyReferenceDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime r5_PolicyReferenceDateField;

    @XmlElement(name = "R5_SelfEmploymentIncome")
    private BigDecimal r5_SelfEmploymentIncomeField;

    @XmlElement(name = "R5_StateUnemploymentIncome")
    private BigDecimal r5_StateUnemploymentIncomeField;

    @XmlElement(name = "R5_StateUnemploymentRecordPresent")
    private Boolean r5_StateUnemploymentRecordPresentField;

    @XmlElement(name = "R5_StateWagesIncome")
    private BigDecimal r5_StateWagesIncomeField;

    @XmlElement(name = "R5_StateWagesRecordPresent")
    private Boolean r5_StateWagesRecordPresentField;

    @XmlElement(name = "R5_SwicaId")
    private String r5_SwicaIdField;

    @XmlElement(name = "R5_VerifyCurrentIncomeId")
    private String r5_VerifyCurrentIncomeIdField;


    @XmlElement(name = "SelfAttestedLowestCostSilverPlan")
    private BigDecimal selfAttestedLowestCostSilverPlanField;

    @XmlElement(name = "SSNGoodCauseReason")
    private String sSNGoodCauseReasonField;

    @XmlElement(name = "SSNNumber")
    private Long sSNNumberField;

    @XmlElement(name = "SuspensionMaxDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime suspensionMaxDateField;

    @XmlElement(name = "SuspensionMinDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime suspensionMinDateField;

    @XmlElement(name = "SwicaErrorCode")
    private String swicaErrorCodeField;

    @XmlElement(name = "TaxFilerStatusCode")
    private String taxFilerStatusCodeField;

    @XmlElement(name = "TaxGroupId")
    private Long taxGroupIdField;

    @XmlElement(name = "TaxPayerIndividualId")
    private Long taxPayerIndividualIdField;

    @XmlElement(name = "TMAStartMonth")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime tMAStartMonthField;

    @XmlElement(name = "TotalGrossExpenses")
    private BigDecimal totalGrossExpensesField;

    @XmlElement(name = "UnbornChildCount")
    private Long unbornChildCountField;

    @XmlElement(name = "VCIErrorCode")
    private String vCIErrorCodeField;

    @XmlElement(name = "VCLVerifiedWithinDueDate")
    private Boolean vCLVerifiedWithinDueDateField;

    @XmlElement(name = "WasReceivingEMAFor2Months")
    private Boolean wasReceivingEMAFor2MonthsField;

    @XmlElement(name = "case")
    private Case caseField;

    @XmlElement(name = "IsCategorical")
    private Boolean isCategoricalField;

    @XmlElement(name = "StateBenefitType")
    private String stateBenefitTypeField;

    @XmlElement(name = "StartDate")
    private LocalDateTime startDateField;

    @XmlElement(name = "EndDate")
    private LocalDateTime endDateField;


    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "children")
    @XmlIDREF
    private List<Individual> childrenField = new ArrayList<>();

    @XmlElement(name = "eDGIndividual")
    private EDGIndividual eDGIndividualField;

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "eDGIndividualExpenses")
    private List<EDGIndividualExpenses> eDGIndividualExpensesField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "employerIndividual")
    private List<EmployerIndividual> employerIndividualField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "income")
    private List<Income> incomeField = new ArrayList<>();

    @XmlElement(name = "individual")
    @XmlIDREF
    private Individual individualField;

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "individualNCPList")
    private List<IndividualNCPList> individualNCPListField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "insurancePolicy")
    private List<InsurancePolicy> insurancePolicyField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "livingTogetherPartner")
    @XmlIDREF
    private List<Individual> livingTogetherPartnerField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "midMonthEligibility")
    private List<MidMonthEligibility> midMonthEligibilityField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "nonCustodialParent")
    @XmlIDREF
    private List<Individual> nonCustodialParentField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "nonEsiMecResponse")
    private List<NonEsiMecResponse> nonEsiMecResponseField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "parents")
    @XmlIDREF
    private List<Individual> parentsField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "Persons")
    @XmlIDREF
    private List<Individual> personsField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "relationships")
    private List<RelationShip> relationshipsField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "siblings")
    @XmlIDREF
    private List<Individual> siblingsField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "spouse")
    @XmlIDREF
    private List<Individual> spouseField = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "validCareTaker")
    @XmlIDREF
    private List<Individual> validCareTakerField = new ArrayList<>();

    private String idField;

    private String hrefField;

    @XmlElement(name = "Indv_SpendDown_Benefit")
    private String indv_SpendDown_BenefitField;

    @XmlElement(name = "IsAPTCFailed")
    private Boolean isAPTCFailedField;

    @XmlElement(name = "IsEligibleForPACA")
    private Boolean isEligibleForPACAField;

    @XmlElement(name = "IsEMCExtended")
    private Boolean isEMCExtendedField;

    @XmlElement(name = "IsHistoricMAEligible")
    private Boolean isHistoricMAEligibleField;

    @XmlElement(name = "IsMAEligible")
    private Boolean isMAEligibleField;

    @XmlElement(name = "IsParentCaretaker")
    private Boolean isParentCaretakerField;

    @XmlElement(name = "IsParentTMAEligible")
    private Boolean isParentTMAEligibleField;

    @XmlElement(name = "IsReceivingMedicare")
    private Boolean isReceivingMedicareField;

    @XmlElement(name = "IsStoppedRequestingAid")
    private Boolean isStoppedRequestingAidField;

    @XmlElement(name = "IsTMADeemed_ADLT")
    private Boolean isTMADeemed_ADLTField;

    @XmlElement(name = "IsTMADeemed_Child")
    private Boolean isTMADeemed_ChildField;

    @XmlElement(name = "IsToApplyQNCCheck")
    private Boolean isToApplyQNCCheckField;

    @XmlElement(name = "Perform_1000_002_1")
    private Boolean perform_1000_002_1Field;

    @XmlElement(name = "Perform_1000_110_7")
    private Boolean perform_1000_110_7Field;

    @XmlElement(name = "Perform_1000_2_3")
    private Boolean perform_1000_2_3Field;

    @XmlElement(name = "Perform_SDX")
    private Boolean perform_SDXField;

    @XmlElement(name = "PerformDeceasedClosure")
    private Boolean performDeceasedClosureField;

    @XmlElement(name = "PerformNormalClosure")
    private Boolean performNormalClosureField;

    @XmlElement(name = "TMAParentCaretakerId")
    private Integer tMAParentCaretakerIdField;

    @XmlElement(name = "V_both_parents_Filing_Jointly")
    private Boolean v_both_parents_Filing_JointlyField;

    @XmlElement(name = "V_both_parents_Married")
    private Boolean v_both_parents_MarriedField;

    @XmlElement(name = "V_both_parents_Present")
    private Boolean v_both_parents_PresentField;

    @XmlElement(name = "V_careTakerOfChild_1000_120")
    private Boolean v_careTakerOfChild_1000_120Field;

    @XmlElement(name = "V_ChildOfFiler_1000_110")
    private Boolean v_ChildOfFiler_1000_110Field;

    @XmlElement(name = "V_parentOfChild_1000_120")
    private Boolean v_parentOfChild_1000_120Field;

    @XmlElement(name = "V_parentOfChild_1000_120")
    private Boolean v_single_parent_PresentField;

    @XmlElement(name = "V_SpouseOfFiler_1000_110")
    private Boolean v_SpouseOfFiler_1000_110Field;

    @XmlElement(name = "V_taxDependent_1000_110")
    private Boolean v_taxDependent_1000_110Field;

    @XmlElement(name = "V_taxDepOfNonCustodialPar_1000_110")
    private Boolean v_taxDepOfNonCustodialPar_1000_110Field;

    @XmlElement(name="taxFilingComplianceInd")
    private Boolean isTaxCompliant;

    private List<Verification> verifications = new ArrayList<>();

    private Boolean isEarnedIncomePresent;

    public Boolean getIsEarnedIncomePresent() {
        return isEarnedIncomePresent;
    }

    public void setIsEarnedIncomePresent(Boolean earnedIncomePresent) {
        isEarnedIncomePresent = earnedIncomePresent;
    }

    public List<Verification> getVerifications() {
        return verifications;
    }

    public void setVerifications(List<Verification> verifications) {
        this.verifications = verifications;
    }

    /**
     *
     */
    public LocalDateTime getAIANVCLDueDate() {
        return aIANVCLDueDateField;
    }

    public void setAIANVCLDueDate(LocalDateTime value) {
        aIANVCLDueDateField = value;
    }

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
    public String getApplicantType() {
        return applicantTypeField;
    }

    public void setApplicantType(String value) {
        applicantTypeField = value;
    }

    /**
     *
     */
    public String getAuthorizeProgramList() {
        return authorizeProgramListField;
    }

    public void setAuthorizeProgramList(String value) {
        authorizeProgramListField = value;
    }

    /**
     *
     */
    public String getAuthorizeTOAList() {
        return authorizeTOAListField;
    }

    public void setAuthorizeTOAList(String value) {
        authorizeTOAListField = value;
    }

    /**
     *
     */
    public LocalDateTime getConversionDate() {
        return conversionDateField;
    }

    public void setConversionDate(LocalDateTime value) {
        conversionDateField = value;
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
    public LocalDateTime getDateOfBirth() {
        return dateOfBirthField;
    }

    public void setDateOfBirth(LocalDateTime value) {
        dateOfBirthField = value;
    }

    /**
     *
     */
    public LocalDateTime getDateOfDeath() {
        return dateOfDeathField;
    }

    public void setDateOfDeath(LocalDateTime value) {
        dateOfDeathField = value;
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
    public LocalDateTime getEMACoverageThroughDate() {
        return eMACoverageThroughDateField;
    }

    public void setEMACoverageThroughDate(LocalDateTime value) {
        eMACoverageThroughDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getEmergencyBeginDate() {
        return emergencyBeginDateField;
    }

    public void setEmergencyBeginDate(LocalDateTime value) {
        emergencyBeginDateField = value;
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
    public String getEmployerHealthCoverageType() {
        return employerHealthCoverageTypeField;
    }

    public void setEmployerHealthCoverageType(String value) {
        employerHealthCoverageTypeField = value;
    }

    /**
     *
     */
    public String getErrorCode() {
        return errorCodeField;
    }

    public void setErrorCode(String value) {
        errorCodeField = value;
    }

    /**
     *
     */
    public Boolean getErrorMessagePresent() {
        return errorMessagePresentField;
    }

    public void setErrorMessagePresent(Boolean value) {
        errorMessagePresentField = value;
    }

    /**
     *
     */
    public Boolean getIsMADeniedPast90Days() {
        return isMADeniedPast90DaysField;
    }

    public void setIsMADeniedPast90Days(Boolean value) {
        isMADeniedPast90DaysField = value;
    }

    /**
     *
     */
    public BigDecimal getESILowestCostSilverPlan() {
        return eSILowestCostSilverPlanField;
    }

    public void setESILowestCostSilverPlan(BigDecimal value) {
        eSILowestCostSilverPlanField = value;
    }

    /**
     *
     */
    public Boolean getEvaluateSpendDown() {
        return evaluateSpendDownField;
    }

    public void setEvaluateSpendDown(Boolean value) {
        evaluateSpendDownField = value;
    }

    /**
     *
     */
    public String getFederalErrorCode() {
        return federalErrorCodeField;
    }

    public void setFederalErrorCode(String value) {
        federalErrorCodeField = value;
    }

    /**
     *
     */
    public String getFiveYearBarApplyIndicator() {
        return fiveYearBarApplyIndicatorField;
    }

    public void setFiveYearBarApplyIndicator(String value) {
        fiveYearBarApplyIndicatorField = value;
    }

    /**
     *
     */
    public String getFiveYearBarMetIndicator() {
        return fiveYearBarMetIndicatorField;
    }

    public void setFiveYearBarMetIndicator(String value) {
        fiveYearBarMetIndicatorField = value;
    }

    /**
     *
     */
    public Boolean getHadPACAEligibility3MonthsPrior() {
        return hadPACAEligibility3MonthsPriorField;
    }

    public void setHadPACAEligibility3MonthsPrior(Boolean value) {
        hadPACAEligibility3MonthsPriorField = value;
    }

    /**
     *
     */
    public Boolean getHasCitizenStatus() {
        return hasCitizenStatusField;
    }

    public void setHasCitizenStatus(Boolean value) {
        hasCitizenStatusField = value;
    }

    /**
     *
     */
    public Boolean getHasEmergencyMedicalCondition() {
        return hasEmergencyMedicalConditionField;
    }

    public void setHasEmergencyMedicalCondition(Boolean value) {
        hasEmergencyMedicalConditionField = value;
    }

    /**
     *
     */
    public Boolean getHasExemptionCertificate() {
        return hasExemptionCertificateField;
    }

    public void setHasExemptionCertificate(Boolean value) {
        hasExemptionCertificateField = value;
    }

    /**
     *
     */
    public Boolean getHasIncomeBeenExempted() {
        return hasIncomeBeenExemptedField;
    }

    public void setHasIncomeBeenExempted(Boolean value) {
        hasIncomeBeenExemptedField = value;
    }

    /**
     *
     */
    public String getHasLawfulPresenceVerification() {
        return hasLawfulPresenceVerificationField;
    }

    public void setHasLawfulPresenceVerification(String value) {
        hasLawfulPresenceVerificationField = value;
    }

    /**
     *
     */
    public String getHasMEC() {
        return hasMECField;
    }

    public void setHasMEC(String value) {
        hasMECField = value;
    }

    /**
     *
     */
    public Boolean getHasMedicare() {
        return hasMedicareField;
    }

    public void setHasMedicare(Boolean value) {
        hasMedicareField = value;
    }

    /**
     *
     */
    public Boolean getHasMet5YearBan() {
        return hasMet5YearBanField;
    }

    public void setHasMet5YearBan(Boolean value) {
        hasMet5YearBanField = value;
    }

    /**
     *
     */
    public Boolean getHasMet5YearBanAvailable() {
        return hasMet5YearBanAvailableField;
    }

    public void setHasMet5YearBanAvailable(Boolean value) {
        hasMet5YearBanAvailableField = value;
    }

    /**
     *
     */
    public Boolean getHasPendingFamilyMedicalBills() {
        return hasPendingFamilyMedicalBillsField;
    }

    public void setHasPendingFamilyMedicalBills(Boolean value) {
        hasPendingFamilyMedicalBillsField = value;
    }

    /**
     *
     */
    public Boolean getHasReasonToDoubt() {
        return hasReasonToDoubtField;
    }

    public void setHasReasonToDoubt(Boolean value) {
        hasReasonToDoubtField = value;
    }

    /**
     *
     */
    public Boolean getHasSelfAttestedMet5Year() {
        return hasSelfAttestedMet5YearField;
    }

    public void setHasSelfAttestedMet5Year(Boolean value) {
        hasSelfAttestedMet5YearField = value;
    }

    /**
     *
     */
    public Boolean getHasSelfAttestedMet5YearAvailable() {
        return hasSelfAttestedMet5YearAvailableField;
    }

    public void setHasSelfAttestedMet5YearAvailable(Boolean value) {
        hasSelfAttestedMet5YearAvailableField = value;
    }

    /**
     *
     */
    public Boolean getHasSSN() {
        return hasSSNField;
    }

    public void setHasSSN(Boolean value) {
        hasSSNField = value;
    }

    /**
     *
     */
    public Boolean getHasVWPenalty() {
        return hasVWPenaltyField;
    }

    public void setHasVWPenalty(Boolean value) {
        hasVWPenaltyField = value;
    }

    /**
     *
     */
    public Boolean getHasWrittenMedicalStatement() {
        return hasWrittenMedicalStatementField;
    }

    public void setHasWrittenMedicalStatement(Boolean value) {
        hasWrittenMedicalStatementField = value;
    }

    /**
     *
     */
    public Boolean getHBE002Flag() {
        return hBE002FlagField;
    }

    public void setHBE002Flag(Boolean value) {
        hBE002FlagField = value;
    }

    /**
     *
     */
    public LocalDateTime getIncarcerationEndDate() {
        return incarcerationEndDateField;
    }

    public void setIncarcerationEndDate(LocalDateTime value) {
        incarcerationEndDateField = value;
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
    public String getIndivSuspensionIndicator() {
        return indivSuspensionIndicatorField;
    }

    public void setIndivSuspensionIndicator(String value) {
        indivSuspensionIndicatorField = value;
    }

    /**
     *
     */
    public Boolean getIsAcceptableAIAN() {
        return isAcceptableAIANField;
    }

    public void setIsAcceptableAIAN(Boolean value) {
        isAcceptableAIANField = value;
    }

    /**
     *
     */
    public Boolean getIsActiveInOtherSystem() {
        return isActiveInOtherSystemField;
    }

    public void setIsActiveInOtherSystem(Boolean value) {
        isActiveInOtherSystemField = value;
    }

    /**
     *
     */
    public Boolean getIsActiveInOtherEDG() {
        return isActiveInOtherEDGField;
    }

    public void setIsActiveInOtherEDG(Boolean value) {
        isActiveInOtherEDGField = value;
    }

    /**
     *
     */
    public Boolean getIsActiveOnAnotherCase() {
        return isActiveOnAnotherCaseField;
    }

    public void setIsActiveOnAnotherCase(Boolean value) {
        isActiveOnAnotherCaseField = value;
    }

    /**
     *
     */
    public Boolean getIsADBH() {
        return isADBHField;
    }

    public void setIsADBH(Boolean value) {
        isADBHField = value;
    }

    /**
     *
     */
    public Boolean getIsADFF() {
        return isADFFField;
    }

    public void setIsADFF(Boolean value) {
        isADFFField = value;
    }

    /**
     *
     */
    public Boolean getIsADLT() {
        return isADLTField;
    }

    public void setIsADLT(Boolean value) {
        isADLTField = value;
    }

    /**
     *
     */
    public Boolean getIsADPR() {
        return isADPRField;
    }

    public void setIsADPR(Boolean value) {
        isADPRField = value;
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
    public Boolean getIsAlienStatus() {
        return isAlienStatusField;
    }

    public void setIsAlienStatus(Boolean value) {
        isAlienStatusField = value;
    }

    /**
     *
     */
    public Boolean getIsAppliedFor() {
        return isAppliedForField;
    }

    public void setIsAppliedFor(Boolean value) {
        isAppliedForField = value;
    }

    /**
     *
     */
    public Boolean getIsApprovedForSpendDown() {
        return isApprovedForSpendDownField;
    }

    public void setIsApprovedForSpendDown(Boolean value) {
        isApprovedForSpendDownField = value;
    }

    /**
     *
     */
    public Boolean getIsAPTC() {
        return isAPTCField;
    }

    public void setIsAPTC(Boolean value) {
        isAPTCField = value;
    }

    /**
     *
     */

    public Boolean getIsAttendingSchool() {
        return isAttendingSchoolField;
    }

    public void setIsAttendingSchool(Boolean value) {
        isAttendingSchoolField = value;
    }

    /**
     *
     */
    public Boolean getIsAuthorizedEdmPresent() {
        return isAuthorizedEdmPresentField;
    }

    public void setIsAuthorizedEdmPresent(Boolean value) {
        isAuthorizedEdmPresentField = value;
    }

    /**
     *
     */
    public Boolean getIsBlindDisabled() {
        return isBlindDisabledField;
    }

    public void setIsBlindDisabled(Boolean value) {
        isBlindDisabledField = value;
    }

    /**
     *
     */
    public Boolean getIsConditionallyEnrolled() {
        return isConditionallyEnrolled;
    }

    public void setIsConditionallyEnrolled(Boolean isConditionallyEnrolled) {
        this.isConditionallyEnrolled = isConditionallyEnrolled;
    }

    /**
     *
     */
    public Boolean getIsCEEligibleAfterRecert() {
        return isCEEligibleAfterRecertField;
    }

    public void setIsCEEligibleAfterRecert(Boolean value) {
        isCEEligibleAfterRecertField = value;
    }

    /**
     *
     */
    public Boolean getIsCEEligibleOnAnotherCase() {
        return isCEEligibleOnAnotherCaseField;
    }

    public void setIsCEEligibleOnAnotherCase(Boolean value) {
        isCEEligibleOnAnotherCaseField = value;
    }

    /**
     *
     */
    public Boolean getIsCHEX() {
        return isCHEXField;
    }

    public void setIsCHEX(Boolean value) {
        isCHEXField = value;
    }

    /**
     *
     */
    public Boolean getIsChild() {
        return isChildField;
    }

    public void setIsChild(Boolean value) {
        isChildField = value;
    }

    /**
     *
     */
    public Boolean getIsCHIP() {
        return isCHIPField;
    }

    public void setIsCHIP(Boolean value) {
        isCHIPField = value;
    }

    /**
     *
     */
    public Boolean getIsCHL1() {
        return isCHL1Field;
    }

    public void setIsCHL1(Boolean value) {
        isCHL1Field = value;
    }

    /**
     *
     */
    public Boolean getIsCHL2() {
        return isCHL2Field;
    }

    public void setIsCHL2(Boolean value) {
        isCHL2Field = value;
    }

    /**
     *
     */
    public Boolean getIsCHL3() {
        return isCHL3Field;
    }

    public void setIsCHL3(Boolean value) {
        isCHL3Field = value;
    }

    /**
     *
     */
    public Boolean getIsCHL4() {
        return isCHL4Field;
    }

    public void setIsCHL4(Boolean value) {
        isCHL4Field = value;
    }

    /**
     *
     */
    public Boolean getIsCONV() {
        return isCONVField;
    }

    public void setIsCONV(Boolean value) {
        isCONVField = value;
    }

    /**
     *
     */
    public Boolean getIsConversionChild() {
        return isConversionChildField;
    }

    public void setIsConversionChild(Boolean value) {
        isConversionChildField = value;
    }

    /**
     *
     */
    public Boolean getIsCurrentCoverageRecordExist() {
        return isCurrentCoverageRecordExistField;
    }

    public void setIsCurrentCoverageRecordExist(Boolean value) {
        isCurrentCoverageRecordExistField = value;
    }

    /**
     *
     */
    public Boolean getIsDeceased() {
        return isDeceasedField;
    }

    public void setIsDeceased(Boolean value) {
        isDeceasedField = value;
    }

    /**
     *
     */
    public Boolean getIsDeterminedUsingTrustedDataSource() {
        return isDeterminedUsingTrustedDataSourceField;
    }

    public void setIsDeterminedUsingTrustedDataSource(Boolean value) {
        isDeterminedUsingTrustedDataSourceField = value;
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
    public Boolean getIsEligibilityIndividualBenefitExist() {
        return isEligibilityIndividualBenefitExistField;
    }

    public void setIsEligibilityIndividualBenefitExist(Boolean value) {
        isEligibilityIndividualBenefitExistField = value;
    }

    /**
     *
     */
    public Boolean getIsEligibleForDJJM() {
        return isEligibleForDJJMField;
    }

    public void setIsEligibleForDJJM(Boolean value) {
        isEligibleForDJJMField = value;
    }

    /**
     *
     */
    public Boolean getIsEligibleForFosterCare() {
        return isEligibleForFosterCareField;
    }

    public void setIsEligibleForFosterCare(Boolean value) {
        isEligibleForFosterCareField = value;
    }

    /**
     *
     */
    public Boolean getIsEligibleForPregNMAGIInPriorMonth() {
        return isEligibleForPregNMAGIInPriorMonthField;
    }

    public void setIsEligibleForPregNMAGIInPriorMonth(Boolean value) {
        isEligibleForPregNMAGIInPriorMonthField = value;
    }

    /**
     *
     */
    public Boolean getIsEligibleForSubsidizedAdoption() {
        return isEligibleForSubsidizedAdoptionField;
    }

    public void setIsEligibleForSubsidizedAdoption(Boolean value) {
        isEligibleForSubsidizedAdoptionField = value;
    }

    /**
     *
     */
    public Boolean getIsEMAExtensionRequested() {
        return isEMAExtensionRequestedField;
    }

    public void setIsEMAExtensionRequested(Boolean value) {
        isEMAExtensionRequestedField = value;
    }

    /**
     *
     */
    public Boolean getIsEmployerPlanAffordable() {
        return isEmployerPlanAffordableField;
    }

    public void setIsEmployerPlanAffordable(Boolean value) {
        isEmployerPlanAffordableField = value;
    }

    /**
     *
     */
    public Boolean getIsExtensionPending() {
        return isExtensionPendingField;
    }

    public void setIsExtensionPending(Boolean value) {
        isExtensionPendingField = value;
    }

    /**
     *
     */
    public Boolean getIsExternalPolicyHolder() {
        return isExternalPolicyHolderField;
    }

    public void setIsExternalPolicyHolder(Boolean value) {
        isExternalPolicyHolderField = value;
    }

    /**
     *
     */
    public Boolean getIsFederalIncomeExist() {
        return isFederalIncomeExistField;
    }

    public void setIsFederalIncomeExist(Boolean value) {
        isFederalIncomeExistField = value;
    }

    /**
     *
     */
    public Boolean getIsFederalServerDown() {
        return isFederalServerDownField;
    }

    public void setIsFederalServerDown(Boolean value) {
        isFederalServerDownField = value;
    }

    /**
     *
     */
    public Boolean getIsFFCC() {
        return isFFCCField;
    }

    public void setIsFFCC(Boolean value) {
        isFFCCField = value;
    }

    /**
     *
     */
    public Boolean getIsFFOS() {
        return isFFOSField;
    }

    public void setIsFFOS(Boolean value) {
        isFFOSField = value;
    }

    /**
     *
     */
    public Boolean getIsFFS1() {
        return isFFS1Field;
    }

    public void setIsFFS1(Boolean value) {
        isFFS1Field = value;
    }

    /**
     *
     */
    public Boolean getIsFiler() {
        return isFilerField;
    }

    public void setIsFiler(Boolean value) {
        isFilerField = value;
    }

    /**
     *
     */
    public Boolean getIsFilingJointly() {
        return isFilingJointlyField;
    }

    public void setIsFilingJointly(Boolean value) {
        isFilingJointlyField = value;
    }

    /**
     *
     */
    public Boolean getIsFilingSeparately() {
        return isFilingSeparatelyField;
    }

    public void setIsFilingSeparately(Boolean value) {
        isFilingSeparatelyField = value;
    }

    /**
     *
     */
    public Boolean getIsG845Mailed() {
        return isG845MailedField;
    }

    public void setIsG845Mailed(Boolean value) {
        isG845MailedField = value;
    }

    /**
     *
     */
    public Boolean getIsHeadOfHousehold() {
        return isHeadOfHouseholdField;
    }

    public void setIsHeadOfHousehold(Boolean value) {
        isHeadOfHouseholdField = value;
    }

    /**
     *
     */
    public Boolean getIsIncarcerated() {
        return isIncarceratedField;
    }

    public void setIsIncarcerated(Boolean value) {
        isIncarceratedField = value;
    }

    /**
     *
     */
    public Boolean getIsIncomeReportedIn10thMonth() {
        return isIncomeReportedIn10thMonthField;
    }

    public void setIsIncomeReportedIn10thMonth(Boolean value) {
        isIncomeReportedIn10thMonthField = value;
    }

    /**
     *
     */
    public Boolean getIsIncomeReportedIn4thMonth() {
        return isIncomeReportedIn4thMonthField;
    }

    public void setIsIncomeReportedIn4thMonth(Boolean value) {
        isIncomeReportedIn4thMonthField = value;
    }

    /**
     *
     */
    public Boolean getIsIncomeReportedIn7thMonth() {
        return isIncomeReportedIn7thMonthField;
    }

    public void setIsIncomeReportedIn7thMonth(Boolean value) {
        isIncomeReportedIn7thMonthField = value;
    }

    /**
     *
     */
    public Boolean getIsIndivQHPEnrolled() {
        return isIndivQHPEnrolledField;
    }

    public void setIsIndivQHPEnrolled(Boolean value) {
        isIndivQHPEnrolledField = value;
    }

    /**
     *
     */
    public Boolean getIsInFilerGroup() {
        return isInFilerGroupField;
    }

    public void setIsInFilerGroup(Boolean value) {
        isInFilerGroupField = value;
    }

    /**
     *
     */
    public Boolean getIsInNonFilerGroup() {
        return isInNonFilerGroupField;
    }

    public void setIsInNonFilerGroup(Boolean value) {
        isInNonFilerGroupField = value;
    }

    /**
     *
     */
    public Boolean getIsInP2Facility() {
        return isInP2FacilityField;
    }

    public void setIsInP2Facility(Boolean value) {
        isInP2FacilityField = value;
    }

    /**
     *
     */
    public Boolean getIsIntendToReside() {
        return isIntendToResideField;
    }

    public void setIsIntendToReside(Boolean value) {
        isIntendToResideField = value;
    }

    /**
     *
     */
    public Boolean getIsSbeHRct() {
        return isSbeHRctField;
    }

    public void setIsSbeHRct(Boolean value) {
        isSbeHRctField = value;
    }

    /**
     *
     */

    public Boolean getIsMAApprovedInPreviousMonth() {
        return isMAApprovedInPreviousMonthField;
    }

    public void setIsMAApprovedInPreviousMonth(Boolean value) {
        isMAApprovedInPreviousMonthField = value;
    }

    /**
     *
     */
    public Boolean getIsManuallyCreatingEDG() {
        return isManuallyCreatingEDGField;
    }

    public void setIsManuallyCreatingEDG(Boolean value) {
        isManuallyCreatingEDGField = value;
    }

    /**
     *
     */
    public Boolean getIsMAPresentForFutureMonths() {
        return isMAPresentForFutureMonthsField;
    }

    public void setIsMAPresentForFutureMonths(Boolean value) {
        isMAPresentForFutureMonthsField = value;
    }

    /**
     *
     */
    public Boolean getIsMECEligibleADLT() {
        return isMECEligibleADLTField;
    }

    public void setIsMECEligibleADLT(Boolean value) {
        isMECEligibleADLTField = value;
    }

    /**
     *
     */
    public Boolean getIsMECEligibleAPTC() {
        return isMECEligibleAPTCField;
    }

    public void setIsMECEligibleAPTC(Boolean value) {
        isMECEligibleAPTCField = value;
    }

    /**
     *
     */
    public Boolean getIsMECEligibleCHEX() {
        return isMECEligibleCHEXField;
    }

    public void setIsMECEligibleCHEX(Boolean value) {
        isMECEligibleCHEXField = value;
    }

    /**
     *
     */
    public Boolean getIsMECEligibleKCHIP() {
        return isMECEligibleKCHIPField;
    }

    public void setIsMECEligibleKCHIP(Boolean value) {
        isMECEligibleKCHIPField = value;
    }

    /**
     *
     */
    public Boolean getIsMECEligibleMedicaid() {
        return isMECEligibleMedicaidField;
    }

    public void setIsMECEligibleMedicaid(Boolean value) {
        isMECEligibleMedicaidField = value;
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
    public Boolean getisMedicareNonEsiMec() {
        return isMedicareNonEsiMecField;
    }

    public void setisMedicareNonEsiMec(Boolean value) {
        isMedicareNonEsiMecField = value;
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
    public Boolean getIsNCPDataPresent() {
        return isNCPDataPresentField;
    }

    public void setIsNCPDataPresent(Boolean value) {
        isNCPDataPresentField = value;
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
    public Boolean getIsNMME() {
        return isNMMEField;
    }

    public void setIsNMME(Boolean value) {
        isNMMEField = value;
    }

    /**
     *
     */
    public Boolean getIsNoIncomeVrfRecordPresent() {
        return isNoIncomeVrfRecordPresentField;
    }

    public void setIsNoIncomeVrfRecordPresent(Boolean value) {
        isNoIncomeVrfRecordPresentField = value;
    }

    /**
     *
     */
    public Boolean getIsNonPaymentDenialExists() {
        return isNonPaymentDenialExistsField;
    }

    public void setIsNonPaymentDenialExists(Boolean value) {
        isNonPaymentDenialExistsField = value;
    }

    /**
     *
     */
    public Boolean getIsOngoingTMXE() {
        return isOngoingTMXEField;
    }

    public void setIsOngoingTMXE(Boolean value) {
        isOngoingTMXEField = value;
    }

    /**
     *
     */
    public Boolean getIsOngoingTMXS() {
        return isOngoingTMXSField;
    }

    public void setIsOngoingTMXS(Boolean value) {
        isOngoingTMXSField = value;
    }

    /**
     *
     */
    public Boolean getIsPACA() {
        return isPACAField;
    }

    public void setIsPACA(Boolean value) {
        isPACAField = value;
    }

    /**
     *
     */
    public Boolean getIsPartOfGroup() {
        return isPartOfGroupField;
    }

    public void setIsPartOfGroup(Boolean value) {
        isPartOfGroupField = value;
    }

    /**
     *
     */
    public Boolean getIsPastSixMonthsEnrollmentIneligible() {
        return isPastSixMonthsEnrollmentIneligibleField;
    }

    public void setIsPastSixMonthsEnrollmentIneligible(Boolean value) {
        isPastSixMonthsEnrollmentIneligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsPastSixMonthsSuspensionIneligible() {
        return isPastSixMonthsSuspensionIneligibleField;
    }

    public void setIsPastSixMonthsSuspensionIneligible(Boolean value) {
        isPastSixMonthsSuspensionIneligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsPotentialCoverageRecordExist() {
        return isPotentialCoverageRecordExistField;
    }

    public void setIsPotentialCoverageRecordExist(Boolean value) {
        isPotentialCoverageRecordExistField = value;
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
    public Boolean getIsPREG() {
        return isPREGField;
    }

    public void setIsPREG(Boolean value) {
        isPREGField = value;
    }

    /**
     *
     */


    public Boolean getIsPregnant() {
        return isPregnantField;
    }

    public void setIsPregnant(Boolean value) {
        isPregnantField = value;
    }

    /**
     *
     */

    public Boolean getIsPreviouslyADPREligible() {
        return isPreviouslyADPREligibleField;
    }

    public void setIsPreviouslyADPREligible(Boolean value) {
        isPreviouslyADPREligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsPreviouslyMAEligible() {
        return isPreviouslyMAEligibleField;
    }

    public void setIsPreviouslyMAEligible(Boolean value) {
        isPreviouslyMAEligibleField = value;
    }

    /**
     *
     */
    public Boolean getIsPreviouslyPregnantEligible() {
        return isPreviouslyPregnantEligibleField;
    }

    public void setIsPreviouslyPregnantEligible(Boolean value) {
        isPreviouslyPregnantEligibleField = value;
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
    public Boolean getIsReceivingADLT_ADPR() {
        return isReceivingADLT_ADPRField;
    }

    public void setIsReceivingADLT_ADPR(Boolean value) {
        isReceivingADLT_ADPRField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingAdoptionAssistance() {
        return isReceivingAdoptionAssistanceField;
    }

    public void setIsReceivingAdoptionAssistance(Boolean value) {
        isReceivingAdoptionAssistanceField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingCHIPInOtherSystem() {
        return isReceivingCHIPInOtherSystemField;
    }

    public void setIsReceivingCHIPInOtherSystem(Boolean value) {
        isReceivingCHIPInOtherSystemField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingFFCC() {
        return isReceivingFFCCField;
    }

    public void setIsReceivingFFCC(Boolean value) {
        isReceivingFFCCField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingFFCCOutOfState() {
        return isReceivingFFCCOutOfStateField;
    }

    public void setIsReceivingFFCCOutOfState(Boolean value) {
        isReceivingFFCCOutOfStateField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingFosterCare() {
        return isReceivingFosterCareField;
    }

    public void setIsReceivingFosterCare(Boolean value) {
        isReceivingFosterCareField = value;
    }

    /**
     *
     */

    public Boolean getIsReceivingMedicareOrLTC() {
        return isReceivingMedicareOrLTCField;
    }

    public void setIsReceivingMedicareOrLTC(Boolean value) {
        isReceivingMedicareOrLTCField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingOnlyMedicareInOtherSystem() {
        return isReceivingOnlyMedicareInOtherSystemField;
    }

    public void setIsReceivingOnlyMedicareInOtherSystem(Boolean value) {
        isReceivingOnlyMedicareInOtherSystemField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingOutOfStateBenefits() {
        return isReceivingOutOfStateBenefitsField;
    }

    public void setIsReceivingOutOfStateBenefits(Boolean value) {
        isReceivingOutOfStateBenefitsField = value;
    }

    /**
     *
     */

    public Boolean getIsReceivingSCBenefits() {
        return isReceivingSCBenefitsField;
    }

    public void setIsReceivingSCBenefits(Boolean value) {
        isReceivingSCBenefitsField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingSSI() {
        return isReceivingSSIField;
    }

    public void setIsReceivingSSI(Boolean value) {
        isReceivingSSIField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingSSIFromOtherSystem() {
        return isReceivingSSIFromOtherSystemField;
    }

    public void setIsReceivingSSIFromOtherSystem(Boolean value) {
        isReceivingSSIFromOtherSystemField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingSSIFromSDX() {
        return isReceivingSSIFromSDXField;
    }

    public void setIsReceivingSSIFromSDX(Boolean value) {
        isReceivingSSIFromSDXField = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingStateSuppliment() {
        return isReceivingStateSupplimentField;
    }

    public void setIsReceivingStateSuppliment(Boolean value) {
        isReceivingStateSupplimentField = value;
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
    public Boolean getIsResident() {
        return isResidentField;
    }

    public void setIsResident(Boolean value) {
        isResidentField = value;
    }

    /**
     *
     */
    public Boolean getIsSpendDown() {
        return isSpendDownField;
    }

    public void setIsSpendDown(Boolean value) {
        isSpendDownField = value;
    }

    /**
     *
     */
    public Boolean getIsSpendownMagiEligible() {
        return isSpendownMagiEligibleField;
    }

    public void setIsSpendownMagiEligible(Boolean value) {
        isSpendownMagiEligibleField = value;
    }

    /**
     *
     */

    public Boolean getIsSuspended() {
        return isSuspendedField;
    }

    public void setIsSuspended(Boolean value) {
        isSuspendedField = value;
    }

    /**
     *
     */
    public Boolean getIsSwicaIncomeExist() {
        return isSwicaIncomeExistField;
    }

    public void setIsSwicaIncomeExist(Boolean value) {
        isSwicaIncomeExistField = value;
    }

    /**
     *
     */
    public Boolean getIsSwicaServerDown() {
        return isSwicaServerDownField;
    }

    public void setIsSwicaServerDown(Boolean value) {
        isSwicaServerDownField = value;
    }

    /**
     *
     */
    public Boolean getIsTaxDependent() {
        return isTaxDependentField;
    }

    public void setIsTaxDependent(Boolean value) {
        isTaxDependentField = value;
    }

    /**
     *
     */
    public Boolean getIsTaxFiler() {
        return isTaxFilerField;
    }

    public void setIsTaxFiler(Boolean value) {
        isTaxFilerField = value;
    }

    /**
     *
     */
    public Boolean getIsTaxFilingInformationAvailable() {
        return isTaxFilingInformationAvailableField;
    }

    public void setIsTaxFilingInformationAvailable(Boolean value) {
        isTaxFilingInformationAvailableField = value;
    }

    /**
     *
     */
    public Boolean getIsTaxGroupIdSetForDependent() {
        return isTaxGroupIdSetForDependentField;
    }

    public void setIsTaxGroupIdSetForDependent(Boolean value) {
        isTaxGroupIdSetForDependentField = value;
    }

    /**
     *
     */
    public Boolean getIsTaxGroupIdSetForSpouse() {
        return isTaxGroupIdSetForSpouseField;
    }

    public void setIsTaxGroupIdSetForSpouse(Boolean value) {
        isTaxGroupIdSetForSpouseField = value;
    }

    /**
     *
     */
    public Boolean getIsTaxPayed() {
        return isTaxPayedField;
    }

    public void setIsTaxPayed(Boolean value) {
        isTaxPayedField = value;
    }

    /**
     *
     */
    public Boolean getIsTMAE() {
        return isTMAEField;
    }

    public void setIsTMAE(Boolean value) {
        isTMAEField = value;
    }

    /**
     *
     */
    public Boolean getIsTMAS() {
        return isTMASField;
    }

    public void setIsTMAS(Boolean value) {
        isTMASField = value;
    }

    /**
     *
     */
    public Boolean getIsTMCE() {
        return isTMCEField;
    }

    public void setIsTMCE(Boolean value) {
        isTMCEField = value;
    }

    /**
     *
     */
    public Boolean getIsTMCS() {
        return isTMCSField;
    }

    public void setIsTMCS(Boolean value) {
        isTMCSField = value;
    }

    /**
     *
     */

    public Boolean getIsToRunSpendownMagi() {
        return isToRunSpendownMagiField;
    }

    public void setIsToRunSpendownMagi(Boolean value) {
        isToRunSpendownMagiField = value;
    }

    public Boolean getIsTP45() {
        return isTP45Field;
    }

    public void setIsTP45(Boolean value) {
        isTP45Field = value;
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
    public Boolean getIsVCIIncomeExist() {
        return isVCIIncomeExistField;
    }

    public void setIsVCIIncomeExist(Boolean value) {
        isVCIIncomeExistField = value;
    }

    /**
     *
     */
    public Boolean getIsVCLExist() {
        return isVCLExistField;
    }

    public void setIsVCLExist(Boolean value) {
        isVCLExistField = value;
    }

    /**
     *
     */
    public String getIsWaiverWaitList() {
        return isWaiverWaitListField;
    }

    public void setIsWaiverWaitList(String value) {
        isWaiverWaitListField = value;
    }

    /**
     *
     */
    public Boolean getIsWillingToApplyEntitledBenefit() {
        return isWillingToApplyEntitledBenefitField;
    }

    public void setIsWillingToApplyEntitledBenefit(Boolean value) {
        isWillingToApplyEntitledBenefitField = value;
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

    public String getLawfulPresenceVerified() {
        return lawfulPresenceVerifiedField;
    }

    public void setLawfulPresenceVerified(String value) {
        lawfulPresenceVerifiedField = value;
    }

    /**
     *
     */
    public String getLevelOfCareType() {
        return levelOfCareTypeField;
    }

    public void setLevelOfCareType(String value) {
        levelOfCareTypeField = value;
    }

    /**
     *
     */
    public String getLoseMECGoodCauseReason() {
        return loseMECGoodCauseReasonField;
    }

    public void setLoseMECGoodCauseReason(String value) {
        loseMECGoodCauseReasonField = value;
    }

    /**
     *
     */
    public String getLPR() {
        return lPRField;
    }

    public void setLPR(String value) {
        lPRField = value;
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

    public Long getOngoingTOAPriorityNumber() {
        return ongoingTOAPriorityNumberField;
    }

    public void setOngoingTOAPriorityNumber(Long value) {
        ongoingTOAPriorityNumberField = value;
    }

    /**
     *
     */
    public String getOngoingTypeOfAssistance() {
        return ongoingTypeOfAssistanceField;
    }

    public void setOngoingTypeOfAssistance(String value) {
        ongoingTypeOfAssistanceField = value;
    }

    public Boolean getperform_OtherSystem() {
        return perform_OtherSystemField;
    }

    public void setperform_OtherSystem(Boolean value) {
        perform_OtherSystemField = value;
    }

    /**
     *
     */
    public LocalDateTime getPregnancyPostPartumEndDate() {
        return pregnancyPostPartumEndDateField;
    }

    public void setPregnancyPostPartumEndDate(LocalDateTime value) {
        pregnancyPostPartumEndDateField = value;
    }

    /**
     *
     */

    public BigDecimal getPremiumLowestSilverPlan() {
        return premiumLowestSilverPlanField;
    }

    public void setPremiumLowestSilverPlan(BigDecimal value) {
        premiumLowestSilverPlanField = value;
    }

    /**
     *
     */
    public BigDecimal getPreviousEarnedIncome() {
        return previousEarnedIncomeField;
    }

    public void setPreviousEarnedIncome(BigDecimal value) {
        previousEarnedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getPreviousSpousalSupportIncome() {
        return previousSpousalSupportIncomeField;
    }

    public void setPreviousSpousalSupportIncome(BigDecimal value) {
        previousSpousalSupportIncomeField = value;
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
    public LocalDateTime getProgramRequestDate() {
        return programRequestDateField;
    }

    public void setProgramRequestDate(LocalDateTime value) {
        programRequestDateField = value;
    }

    /**
     *
     */
    public String getQualifiedNonCitizenIndicator() {
        return qualifiedNonCitizenIndicatorField;
    }

    public void setQualifiedNonCitizenIndicator(String value) {
        qualifiedNonCitizenIndicatorField = value;
    }

    /**
     *
     */
    public String getR5_FedId() {
        return r5_FedIdField;
    }

    public void setR5_FedId(String value) {
        r5_FedIdField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_GrossEarnIncomeAmount() {
        return r5_GrossEarnIncomeAmountField;
    }

    public void setR5_GrossEarnIncomeAmount(BigDecimal value) {
        r5_GrossEarnIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_GrossUnEarnedIncomeAmount() {
        return r5_GrossUnEarnedIncomeAmountField;
    }

    public void setR5_GrossUnEarnedIncomeAmount(BigDecimal value) {
        r5_GrossUnEarnedIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_InclusionMAGIIncome() {
        return r5_InclusionMAGIIncomeField;
    }

    public void setR5_InclusionMAGIIncome(BigDecimal value) {
        r5_InclusionMAGIIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualAnnualAPTCIncome() {
        return r5_IndividualAnnualAPTCIncomeField;
    }

    public void setR5_IndividualAnnualAPTCIncome(BigDecimal value) {
        r5_IndividualAnnualAPTCIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualFederalGroupIncomeAmount() {
        return r5_IndividualFederalGroupIncomeAmountField;
    }

    public void setR5_IndividualFederalGroupIncomeAmount(BigDecimal value) {
        r5_IndividualFederalGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualSelfAttestedEarnedIncome() {
        return r5_IndividualSelfAttestedEarnedIncomeField;
    }

    public void setR5_IndividualSelfAttestedEarnedIncome(BigDecimal value) {
        r5_IndividualSelfAttestedEarnedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualSelfAttestedGrossIncome() {
        return r5_IndividualSelfAttestedGrossIncomeField;
    }

    public void setR5_IndividualSelfAttestedGrossIncome(BigDecimal value) {
        r5_IndividualSelfAttestedGrossIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualSelfAttestedOtherIncome() {
        return r5_IndividualSelfAttestedOtherIncomeField;
    }

    public void setR5_IndividualSelfAttestedOtherIncome(BigDecimal value) {
        r5_IndividualSelfAttestedOtherIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualSelfAttestedSelfEmploymentIncome() {
        return r5_IndividualSelfAttestedSelfEmploymentIncomeField;
    }

    public void setR5_IndividualSelfAttestedSelfEmploymentIncome(BigDecimal value) {
        r5_IndividualSelfAttestedSelfEmploymentIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualSelfAttestedUnearnedIncome() {
        return r5_IndividualSelfAttestedUnearnedIncomeField;
    }

    public void setR5_IndividualSelfAttestedUnearnedIncome(BigDecimal value) {
        r5_IndividualSelfAttestedUnearnedIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualSelfAttestedUnemploymentIncome() {
        return r5_IndividualSelfAttestedUnemploymentIncomeField;
    }

    public void setR5_IndividualSelfAttestedUnemploymentIncome(BigDecimal value) {
        r5_IndividualSelfAttestedUnemploymentIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualStateGroupIncomeAmount() {
        return r5_IndividualStateGroupIncomeAmountField;
    }

    public void setR5_IndividualStateGroupIncomeAmount(BigDecimal value) {
        r5_IndividualStateGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualTotalCntbtIncome() {
        return r5_IndividualTotalCntbtIncomeField;
    }

    public void setR5_IndividualTotalCntbtIncome(BigDecimal value) {
        r5_IndividualTotalCntbtIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IndividualVCIGroupIncomeAmount() {
        return r5_IndividualVCIGroupIncomeAmountField;
    }

    public void setR5_IndividualVCIGroupIncomeAmount(BigDecimal value) {
        r5_IndividualVCIGroupIncomeAmountField = value;
    }

    /**
     *
     */
    public String getR5_IsIndividualInactiveInCase() {
        return r5_IsIndividualInactiveInCaseField;
    }

    public void setR5_IsIndividualInactiveInCase(String value) {
        r5_IsIndividualInactiveInCaseField = value;
    }

    /**
     *
     */
    public Boolean getR5_IsNMAGIEligible() {
        return r5_IsNMAGIEligibleField;
    }

    public void setR5_IsNMAGIEligible(Boolean value) {
        r5_IsNMAGIEligibleField = value;
    }

    public BigDecimal getR5_JointSelfAttestedIncomeCalculated() {
        return r5_JointSelfAttestedIncomeCalculatedField;
    }

    public void setR5_JointSelfAttestedIncomeCalculated(BigDecimal value) {
        r5_JointSelfAttestedIncomeCalculatedField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_OtherIncomeAmount() {
        return r5_OtherIncomeAmountField;
    }

    public void setR5_OtherIncomeAmount(BigDecimal value) {
        r5_OtherIncomeAmountField = value;
    }

    /**
     *
     */
    public LocalDateTime getR5_PolicyReferenceDate() {
        return r5_PolicyReferenceDateField;
    }

    public void setR5_PolicyReferenceDate(LocalDateTime value) {
        r5_PolicyReferenceDateField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_SelfEmploymentIncome() {
        return r5_SelfEmploymentIncomeField;
    }

    public void setR5_SelfEmploymentIncome(BigDecimal value) {
        r5_SelfEmploymentIncomeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_StateUnemploymentIncome() {
        return r5_StateUnemploymentIncomeField;
    }

    public void setR5_StateUnemploymentIncome(BigDecimal value) {
        r5_StateUnemploymentIncomeField = value;
    }

    /**
     *
     */
    public Boolean getR5_StateUnemploymentRecordPresent() {
        return r5_StateUnemploymentRecordPresentField;
    }

    public void setR5_StateUnemploymentRecordPresent(Boolean value) {
        r5_StateUnemploymentRecordPresentField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_StateWagesIncome() {
        return r5_StateWagesIncomeField;
    }

    public void setR5_StateWagesIncome(BigDecimal value) {
        r5_StateWagesIncomeField = value;
    }

    /**
     *
     */
    public Boolean getR5_StateWagesRecordPresent() {
        return r5_StateWagesRecordPresentField;
    }

    public void setR5_StateWagesRecordPresent(Boolean value) {
        r5_StateWagesRecordPresentField = value;
    }

    /**
     *
     */
    public String getR5_SwicaId() {
        return r5_SwicaIdField;
    }

    public void setR5_SwicaId(String value) {
        r5_SwicaIdField = value;
    }

    /**
     *
     */

    public String getR5_VerifyCurrentIncomeId() {
        return r5_VerifyCurrentIncomeIdField;
    }

    public void setR5_VerifyCurrentIncomeId(String value) {
        r5_VerifyCurrentIncomeIdField = value;
    }


    /**
     *
     */
    public BigDecimal getSelfAttestedLowestCostSilverPlan() {
        return selfAttestedLowestCostSilverPlanField;
    }

    public void setSelfAttestedLowestCostSilverPlan(BigDecimal value) {
        selfAttestedLowestCostSilverPlanField = value;
    }

    /**
     *
     */
    public String getSSNGoodCauseReason() {
        return sSNGoodCauseReasonField;
    }

    public void setSSNGoodCauseReason(String value) {
        sSNGoodCauseReasonField = value;
    }

    /**
     *
     */
    public Long getSSNNumber() {
        return sSNNumberField;
    }

    public void setSSNNumber(Long value) {
        sSNNumberField = value;
    }

    /**
     *
     */
    public LocalDateTime getSuspensionMaxDate() {
        return suspensionMaxDateField;
    }

    public void setSuspensionMaxDate(LocalDateTime value) {
        suspensionMaxDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getSuspensionMinDate() {
        return suspensionMinDateField;
    }

    public void setSuspensionMinDate(LocalDateTime value) {
        suspensionMinDateField = value;
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
    public Long getTaxGroupId() {
        return taxGroupIdField;
    }

    public void setTaxGroupId(Long value) {
        taxGroupIdField = value;
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
    public LocalDateTime getTMAStartMonth() {
        return tMAStartMonthField;
    }

    public void setTMAStartMonth(LocalDateTime value) {
        tMAStartMonthField = value;
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
    public String getVCIErrorCode() {
        return vCIErrorCodeField;
    }

    public void setVCIErrorCode(String value) {
        vCIErrorCodeField = value;
    }

    /**
     *
     */
    public Boolean getVCLVerifiedWithinDueDate() {
        return vCLVerifiedWithinDueDateField;
    }

    public void setVCLVerifiedWithinDueDate(Boolean value) {
        vCLVerifiedWithinDueDateField = value;
    }

    /**
     *
     */
    public Boolean getWasReceivingEMAFor2Months() {
        return wasReceivingEMAFor2MonthsField;
    }

    public void setWasReceivingEMAFor2Months(Boolean value) {
        wasReceivingEMAFor2MonthsField = value;
    }

    public final Case getCase() {
        return caseField;
    }

    public final void setCase(Case value) {
        caseField = value;
    }

    /**
     *
     */
    public List<Individual> getchildren() {
        return childrenField;
    }

    public void setchildren(List<Individual> value) {
        childrenField = value;
    }

    /**
     *
     */
    public EDGIndividual geteDGIndividual() {
        return eDGIndividualField;
    }

    public void seteDGIndividual(EDGIndividual value) {
        eDGIndividualField = value;
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
    public List<EmployerIndividual> getemployerIndividual() {
        return employerIndividualField;
    }

    public void setemployerIndividual(List<EmployerIndividual> value) {
        employerIndividualField = value;
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
    public List<IndividualNCPList> getIndividualNCPList() {
        return individualNCPListField;
    }

    public void setIndividualNCPList(List<IndividualNCPList> value) {
        individualNCPListField = value;
    }

    /**
     *
     */
    public List<InsurancePolicy> getinsurancePolicy() {
        return insurancePolicyField;
    }

    public void setinsurancePolicy(List<InsurancePolicy> value) {
        insurancePolicyField = value;
    }

    /**
     *
     */
    public List<Individual> getlivingTogetherPartner() {
        return livingTogetherPartnerField;
    }

    public void setlivingTogetherPartner(List<Individual> value) {
        livingTogetherPartnerField = value;
    }

    /**
     *
     */
    public List<MidMonthEligibility> getmidMonthEligibility() {
        return midMonthEligibilityField;
    }

    public void setmidMonthEligibility(List<MidMonthEligibility> value) {
        midMonthEligibilityField = value;
    }

    /**
     *
     */
    public List<Individual> getnonCustodialParent() {
        return nonCustodialParentField;
    }

    public void setnonCustodialParent(List<Individual> value) {
        nonCustodialParentField = value;
    }

    /**
     *
     */
    public List<NonEsiMecResponse> getnonEsiMecResponse() {
        return nonEsiMecResponseField;
    }

    public void setnonEsiMecResponse(List<NonEsiMecResponse> value) {
        nonEsiMecResponseField = value;
    }

    /**
     *
     */
    public List<Individual> getparents() {
        return parentsField;
    }

    public void setparents(List<Individual> value) {
        parentsField = value;
    }

    /**
     *
     */
    public List<Individual> getpersons() {
        return personsField;
    }

    public void setpersons(List<Individual> value) {
        personsField = value;
    }

    /**
     *
     */
    public List<RelationShip> getrelationships() {
        return relationshipsField;
    }

    public void setrelationships(List<RelationShip> value) {
        relationshipsField = value;
    }

    /**
     *
     */
    public List<Individual> getsiblings() {
        return siblingsField;
    }

    public void setsiblings(List<Individual> value) {
        siblingsField = value;
    }

    /**
     *
     */
    public List<Individual> getspouse() {
        return spouseField;
    }

    public void setspouse(List<Individual> value) {
        spouseField = value;
    }

    /**
     *
     */
    public List<Individual> getvalidCareTaker() {
        return validCareTakerField;
    }

    public void setvalidCareTaker(List<Individual> value) {
        validCareTakerField = value;
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

    public String getIndv_SpendDown_Benefit() {
        return indv_SpendDown_BenefitField;
    }

    public void setIndv_SpendDown_Benefit(String indv_SpendDown_BenefitField) {
        this.indv_SpendDown_BenefitField = indv_SpendDown_BenefitField;
    }

    public Boolean getIsAPTCFailed() {
        return isAPTCFailedField;
    }

    public void setIsAPTCFailed(Boolean isAPTCFailedField) {
        this.isAPTCFailedField = isAPTCFailedField;
    }

    public Boolean getIsEligibleForPACA() {
        return isEligibleForPACAField;
    }

    public void setIsEligibleForPACA(Boolean isEligibleForPACAField) {
        this.isEligibleForPACAField = isEligibleForPACAField;
    }

    public Boolean getIsEMCExtended() {
        return isEMCExtendedField;
    }

    public void setIsEMCExtended(Boolean isEMCExtendedField) {
        this.isEMCExtendedField = isEMCExtendedField;
    }

    public Boolean getIsHistoricMAEligible() {
        return isHistoricMAEligibleField;
    }

    public void setIsHistoricMAEligible(Boolean isHistoricMAEligibleField) {
        this.isHistoricMAEligibleField = isHistoricMAEligibleField;
    }

    public Boolean getIsMAEligible() {
        return isMAEligibleField;
    }

    public void setIsMAEligible(Boolean isMAEligibleField) {
        this.isMAEligibleField = isMAEligibleField;
    }

    public Boolean getIsParentCaretaker() {
        return isParentCaretakerField;
    }

    public void setIsParentCaretaker(Boolean isParentCaretakerField) {
        this.isParentCaretakerField = isParentCaretakerField;
    }

    public Boolean getIsParentTMAEligible() {
        return isParentTMAEligibleField;
    }

    public void setIsParentTMAEligible(Boolean isParentTMAEligibleField) {
        this.isParentTMAEligibleField = isParentTMAEligibleField;
    }

    public Boolean getIsReceivingMedicare() {
        return isReceivingMedicareField;
    }

    public void setIsReceivingMedicare(Boolean isReceivingMedicareField) {
        this.isReceivingMedicareField = isReceivingMedicareField;
    }

    public Boolean getIsStoppedRequestingAid() {
        return isStoppedRequestingAidField;
    }

    public void setIsStoppedRequestingAid(Boolean isStoppedRequestingAidField) {
        this.isStoppedRequestingAidField = isStoppedRequestingAidField;
    }

    public Boolean getIsTMADeemed_ADLT() {
        return isTMADeemed_ADLTField;
    }

    public void setIsTMADeemed_ADLT(Boolean isTMADeemed_ADLTField) {
        this.isTMADeemed_ADLTField = isTMADeemed_ADLTField;
    }

    public Boolean getIsTMADeemed_Child() {
        return isTMADeemed_ChildField;
    }

    public void setIsTMADeemed_Child(Boolean isTMADeemed_ChildField) {
        this.isTMADeemed_ChildField = isTMADeemed_ChildField;
    }

    public Boolean getIsToApplyQNCCheck() {
        return isToApplyQNCCheckField;
    }

    public void setIsToApplyQNCCheck(Boolean isToApplyQNCCheckField) {
        this.isToApplyQNCCheckField = isToApplyQNCCheckField;
    }

    public Boolean getPerform_1000_002_1() {
        return perform_1000_002_1Field;
    }

    public void setPerform_1000_002_1(Boolean perform_1000_002_1Field) {
        this.perform_1000_002_1Field = perform_1000_002_1Field;
    }

    public Boolean getPerform_1000_110_7() {
        return perform_1000_110_7Field;
    }

    public void setPerform_1000_110_7(Boolean perform_1000_110_7Field) {
        this.perform_1000_110_7Field = perform_1000_110_7Field;
    }

    public Boolean getPerform_1000_2_3() {
        return perform_1000_2_3Field;
    }

    public void setPerform_1000_2_3(Boolean perform_1000_2_3Field) {
        this.perform_1000_2_3Field = perform_1000_2_3Field;
    }

    public Boolean getPerform_SDX() {
        return perform_SDXField;
    }

    public void setPerform_SDX(Boolean perform_SDXField) {
        this.perform_SDXField = perform_SDXField;
    }

    public Boolean getPerformDeceasedClosure() {
        return performDeceasedClosureField;
    }

    public void setPerformDeceasedClosure(Boolean performDeceasedClosureField) {
        this.performDeceasedClosureField = performDeceasedClosureField;
    }

    public Boolean getPerformNormalClosure() {
        return performNormalClosureField;
    }

    public void setPerformNormalClosure(Boolean performNormalClosureField) {
        this.performNormalClosureField = performNormalClosureField;
    }

    public Integer getTMAParentCaretakerId() {
        return tMAParentCaretakerIdField;
    }

    public void setTMAParentCaretakerId(Integer tMAParentCaretakerIdField) {
        this.tMAParentCaretakerIdField = tMAParentCaretakerIdField;
    }

    public Boolean getV_both_parents_Filing_Jointly() {
        return v_both_parents_Filing_JointlyField;
    }

    public void setV_both_parents_Filing_Jointly(Boolean v_both_parents_Filing_JointlyField) {
        this.v_both_parents_Filing_JointlyField = v_both_parents_Filing_JointlyField;
    }

    public Boolean getV_both_parents_Married() {
        return v_both_parents_MarriedField;
    }

    public void setV_both_parents_Married(Boolean v_both_parents_MarriedField) {
        this.v_both_parents_MarriedField = v_both_parents_MarriedField;
    }

    public Boolean getV_both_parents_Present() {
        return v_both_parents_PresentField;
    }

    public void setV_both_parents_Present(Boolean v_both_parents_PresentField) {
        this.v_both_parents_PresentField = v_both_parents_PresentField;
    }

    public Boolean getV_careTakerOfChild_1000_120() {
        return v_careTakerOfChild_1000_120Field;
    }

    public void setV_careTakerOfChild_1000_120(Boolean v_careTakerOfChild_1000_120Field) {
        this.v_careTakerOfChild_1000_120Field = v_careTakerOfChild_1000_120Field;
    }

    public Boolean getV_ChildOfFiler_1000_110() {
        return v_ChildOfFiler_1000_110Field;
    }

    public void setV_ChildOfFiler_1000_110(Boolean v_ChildOfFiler_1000_110Field) {
        this.v_ChildOfFiler_1000_110Field = v_ChildOfFiler_1000_110Field;
    }

    public Boolean getV_parentOfChild_1000_120() {
        return v_parentOfChild_1000_120Field;
    }

    public void setV_parentOfChild_1000_120(Boolean v_parentOfChild_1000_120Field) {
        this.v_parentOfChild_1000_120Field = v_parentOfChild_1000_120Field;
    }

    public Boolean getV_single_parent_Present() {
        return v_single_parent_PresentField;
    }

    public void setV_single_parent_Present(Boolean v_single_parent_PresentField) {
        this.v_single_parent_PresentField = v_single_parent_PresentField;
    }

    public Boolean getV_SpouseOfFiler_1000_110() {
        return v_SpouseOfFiler_1000_110Field;
    }

    public void setV_SpouseOfFiler_1000_110(Boolean v_SpouseOfFiler_1000_110Field) {
        this.v_SpouseOfFiler_1000_110Field = v_SpouseOfFiler_1000_110Field;
    }

    public Boolean getV_taxDependent_1000_110() {
        return v_taxDependent_1000_110Field;
    }

    public void setV_taxDependent_1000_110(Boolean v_taxDependent_1000_110Field) {
        this.v_taxDependent_1000_110Field = v_taxDependent_1000_110Field;
    }

    public Boolean getV_taxDepOfNonCustodialPar_1000_110() {
        return v_taxDepOfNonCustodialPar_1000_110Field;
    }

    public void setV_taxDepOfNonCustodialPar_1000_110(Boolean v_taxDepOfNonCustodialPar_1000_110Field) {
        this.v_taxDepOfNonCustodialPar_1000_110Field = v_taxDepOfNonCustodialPar_1000_110Field;
    }

    public Boolean getIsMECEligibleCHL3() {
        return isMECEligibleCHL3;
    }

    public void setIsMECEligibleCHL3(Boolean isMECEligibleCHL3) {
        this.isMECEligibleCHL3 = isMECEligibleCHL3;
    }


    public Boolean getIsCategorical() {
        return isCategoricalField;
    }

    public void setIsCategorical(Boolean isCategorical) {
        this.isCategoricalField = isCategorical;
    }


    public String getStateBenefitType() {
        return stateBenefitTypeField;
    }

    public void setStateBenefitType(String stateBenefitType) {
        this.stateBenefitTypeField = stateBenefitType;
    }


    public LocalDateTime getStartDate() {
        return startDateField;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.endDateField = startDate;
    }


    public LocalDateTime getEndDate() {
        return endDateField;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDateField = endDate;
    }

    /**
     *
     */
    public Boolean getIsSMA() {
        return IsSMAField;
    }

    public void setIsSMA(Boolean value) {
        IsSMAField = value;
    }


    private Boolean wasInFosterCare;

    public Boolean getWasInFosterCare() {
        return wasInFosterCare;
    }

    public void setWasInFosterCare(Boolean wasInFosterCare) {
        this.wasInFosterCare = wasInFosterCare;
    }

    private String applyingState;

    public String getApplyingState() {
        return applyingState;
    }

    public void setApplyingState(String applyingState) {
        this.applyingState = applyingState;
    }

    private Boolean wasReceivingMedicaid;

    public Boolean getWasReceivingMedicaid() {
        return wasReceivingMedicaid;
    }

    public void setWasReceivingMedicaid(Boolean wasReceivingMedicaid) {
        this.wasReceivingMedicaid = wasReceivingMedicaid;
    }


    public String getIsFullTimeStudent() {
        return isFullTimeStudent;
    }

    public void setIsFullTimeStudent(String isFullTimeStudent) {
        this.isFullTimeStudent = isFullTimeStudent;
    }


    public Boolean getTaxCompliant() {return isTaxCompliant;}

    public void setTaxCompliant(Boolean taxCompliant) {isTaxCompliant = taxCompliant;}

}