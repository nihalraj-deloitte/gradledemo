package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseProgramIndividualR5;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseProgramIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CitizenshipModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ComplianceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ConditionalMedicareDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ConversionCrossReferenceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ConversionIndividualInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CustodyDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCAddressModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCDomesticViolenceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCEntitledBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAddressAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienSponsorIncomeAndResourceDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienSponsorIncomeAndResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienSponsorInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienSponsorModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienSponsorRelationshipModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienTypeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualCommunityIntegrationSupplementationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualLongTermCareModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualMinorParentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualProfileModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCRepresentativeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCThirdPartyLiabilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCWorkRegistrationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DisabilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCCaseIndividualEventModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ESICoverageDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationEnrollmentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationHistoryDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationalExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmancipationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmergencyMedicalConditionExtensionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmergencyMedicalConditionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmploymentDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EnrollmentDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EsiMecResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExemptionDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.FailedFederalInterfaceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HeadOfHouseholdModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HealthInsuranceCoveredIndividualsDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HealthInsurancePolicyDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IPVDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IRSResponseMetadataModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IRSResponseVeificationDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IncapacityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualBenefitExtensionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualBenefitMonthTrackingModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualFosterCareModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualIncarcerationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualLivingArrangementModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualLowestCostEmployerPlanModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualVLPResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.JointCustodyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.JointOwnersDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.KTAPIneligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.KWPAssessmentConsentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.LTCCoupleModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.LTCResourceTransferConsentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.LivingArrangementHospitalizationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.LivingArrangementProviderTableModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.LocDeterminationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.LocPrivatePayDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MFPShelterAllowanceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MRTReferralDeterminationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MaritalStatusOfIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MealArrangementModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MedicallyFrailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MigrantSeasonalFarmWorkerModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MoneyFollowsThePersonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.NewBornModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.NoIncomeVerificationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.NoResourceVerificationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.NonCustodialParentRelationshipModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.NonEsiMecResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OrganizationProviderMasterModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OutOfStateBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OverpaymentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PPAuthorizationIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PayPeriodInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PregnancyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.QualifiedIncomeTrustModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.QualifyingParentDeterminationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.RelationshipModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ResidencyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SDXEligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SDXModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SSIBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentPayExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SpendDownModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StateUnemploymentBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfEnrollmentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfHouseholdCompositionAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfHouseholdCompositionSummaryModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfMFPModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfNonCustodialParentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusofIndividualHouseholdModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusofTaxFilingModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SubsidizedAdoptionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SwicaWagesIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UNPAIDEMPLOYMENTModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnclearInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifiedSsaCompositeIndividualResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyAnnualHouseholdIncomeIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyAnnualHouseholdIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyAnnualHouseholdIndividualIncomeResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyCurrentIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.WINInfoModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class IndividualDataStore {
    private LocalDateTime EDM;

    public LocalDateTime getEDM() {
        return EDM;
    }

    public void setEDM(LocalDateTime value) {
        EDM = value;
    }

    private Long IndividualId;

    public Long getIndividualId() {
        return IndividualId;
    }

    public void setIndividualId(Long value) {
        IndividualId = value;
    }

    private Long HeadOfHouseholdIndividualId;

    public Long getHeadOfHouseholdIndividualId() {
        return HeadOfHouseholdIndividualId;
    }

    public void setHeadOfHouseholdIndividualId(Long value) {
        HeadOfHouseholdIndividualId = value;
    }

    private boolean IsInP2Facility;

    public boolean getIsInP2Facility() {
        return IsInP2Facility;
    }

    public void setIsInP2Facility(boolean value) {
        IsInP2Facility = value;
    }

    public IndividualDataStore() {
    }

    public IndividualDataStore(Long individualId, LocalDateTime edm) {
        setIndividualId(individualId);
        setEDM(edm);
    }

    private List<IncapacityModel> IncapacityModels = new ArrayList<>();

    public List<IncapacityModel> getIncapacityModels() {
        return IncapacityModels;
    }

    public void setIncapacityModels(List<IncapacityModel> value) {
        IncapacityModels = value;
    }

    private List<JointCustodyModel> JointCustodyModels = new ArrayList<>();

    public List<JointCustodyModel> getJointCustodyModels() {
        return JointCustodyModels;
    }

    public void setJointCustodyModels(List<JointCustodyModel> value) {
        JointCustodyModels = value;
    }

    private List<CaseProgramIndividualModel> CaseProgramIndividualModels = new ArrayList<>();

    public List<CaseProgramIndividualModel> getCaseProgramIndividualModels() {
        return CaseProgramIndividualModels;
    }

    public void setCaseProgramIndividualModels(List<CaseProgramIndividualModel> value) {
        CaseProgramIndividualModels = value;
    }

    private List<CaseProgramIndividualR5> CaseProgramIndividualR5Models = new ArrayList<>();

    public List<CaseProgramIndividualR5> getCaseProgramIndividualR5Models() {
        return CaseProgramIndividualR5Models;
    }

    public void setCaseProgramIndividualR5Models(List<CaseProgramIndividualR5> value) {
        CaseProgramIndividualR5Models = value;
    }

    private StatusOfHouseholdCompositionAssociationModel StatusOfHouseholdCompositionAssociationModel;

    public StatusOfHouseholdCompositionAssociationModel getStatusOfHouseholdCompositionAssociationModel() {
        return StatusOfHouseholdCompositionAssociationModel;
    }

    public void setStatusOfHouseholdCompositionAssociationModel(StatusOfHouseholdCompositionAssociationModel value) {
        StatusOfHouseholdCompositionAssociationModel = value;
    }

    private StatusOfHouseholdCompositionSummaryModel StatusOfHouseholdCompositionSummaryModel;

    public StatusOfHouseholdCompositionSummaryModel getStatusOfHouseholdCompositionSummaryModel() {
        return StatusOfHouseholdCompositionSummaryModel;
    }

    public void setStatusOfHouseholdCompositionSummaryModel(StatusOfHouseholdCompositionSummaryModel value) {
        StatusOfHouseholdCompositionSummaryModel = value;
    }

    private CustodyDetailModel CustodyDetailModel;

    public CustodyDetailModel getCustodyDetailModel() {
        return CustodyDetailModel;
    }

    public void setCustodyDetailModel(CustodyDetailModel value) {
        CustodyDetailModel = value;
    }

    private SubsidizedAdoptionModel SubsidizedAdoptionModel;

    public SubsidizedAdoptionModel getSubsidizedAdoptionModel() {
        return SubsidizedAdoptionModel;
    }

    public void setSubsidizedAdoptionModel(SubsidizedAdoptionModel value) {
        SubsidizedAdoptionModel = value;
    }

    private SDXModel SDXModel;

    public SDXModel getSDXModel() {
        return SDXModel;
    }

    public void setSDXModel(SDXModel value) {
        SDXModel = value;
    }

    private List<SDXEligibilityModel> SDXEligibilityModels = new ArrayList<>();

    public List<SDXEligibilityModel> getSDXEligibilityModels() {
        return SDXEligibilityModels;
    }

    public void setSDXEligibilityModels(List<SDXEligibilityModel> value) {
        SDXEligibilityModels = value;
    }

    private List<MedicallyFrailModel> DCMedicallyFrailModels = new ArrayList<>();

    public List<MedicallyFrailModel> getDCMedicallyFrailModels() {
        return DCMedicallyFrailModels;
    }

    public void setDCMedicallyFrailModels(List<MedicallyFrailModel> value) {
        DCMedicallyFrailModels = value;
    }

    private List<DCAddressModel> DCAddressModels = new ArrayList<>();

    public List<DCAddressModel> getDCAddressModels() {
        return DCAddressModels;
    }

    public void setDCAddressModels(List<DCAddressModel> value) {
        DCAddressModels = value;
    }

    private DCIndividualModel DCIndividualModel;

    public DCIndividualModel getDCIndividualModel() {
        return DCIndividualModel;
    }

    public void setDCIndividualModel(DCIndividualModel value) {
        DCIndividualModel = value;
    }

    private List<DCIndividualAddressAssociationModel> DCIndividualAddressAssociationModels = new ArrayList<>();

    public List<DCIndividualAddressAssociationModel> getDCIndividualAddressAssociationModels() {
        return DCIndividualAddressAssociationModels;
    }

    public void setDCIndividualAddressAssociationModels(List<DCIndividualAddressAssociationModel> value) {
        DCIndividualAddressAssociationModels = value;
    }

    private DCIndividualAlienModel DCIndividualAlienModel;

    public DCIndividualAlienModel getDCIndividualAlienModel() {
        return DCIndividualAlienModel;
    }

    public void setDCIndividualAlienModel(DCIndividualAlienModel value) {
        DCIndividualAlienModel = value;
    }

    private List<DCIndividualAlienSponsorModel> DCIndividualAlienSponsorModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorModel> getDCIndividualAlienSponsorModels() {
        return DCIndividualAlienSponsorModels;
    }

    public void setDCIndividualAlienSponsorModels(List<DCIndividualAlienSponsorModel> value) {
        DCIndividualAlienSponsorModels = value;
    }

    private DCIndividualAlienTypeModel DCIndividualAlienTypeModel;

    public DCIndividualAlienTypeModel getDCIndividualAlienTypeModel() {
        return DCIndividualAlienTypeModel;
    }

    public void setDCIndividualAlienTypeModel(DCIndividualAlienTypeModel value) {
        DCIndividualAlienTypeModel = value;
    }

    private List<UnclearInformationModel> UnclearInformationModels = new ArrayList<>();

    public List<UnclearInformationModel> getUnclearInformationModels() {
        return UnclearInformationModels;
    }

    public void setUnclearInformationModels(List<UnclearInformationModel> value) {
        UnclearInformationModels = value;
    }

    private List<DCIndividualProfileModel> DCIndividualProfileModels = new ArrayList<>();

    public List<DCIndividualProfileModel> getDCIndividualProfileModels() {
        return DCIndividualProfileModels;
    }

    public void setDCIndividualProfileModels(List<DCIndividualProfileModel> value) {
        DCIndividualProfileModels = value;
    }

    private DCIndividualCommunityIntegrationSupplementationModel DCIndividualCommunityIntegrationSupplementationModel;

    public DCIndividualCommunityIntegrationSupplementationModel getDCIndividualCommunityIntegrationSupplementationModel() {
        return DCIndividualCommunityIntegrationSupplementationModel;
    }

    public void setDCIndividualCommunityIntegrationSupplementationModel(
            DCIndividualCommunityIntegrationSupplementationModel value) {
        DCIndividualCommunityIntegrationSupplementationModel = value;
    }

    private List<DCIndividualLongTermCareModel> DCIndividualLongTermCareModels = new ArrayList<>();

    public List<DCIndividualLongTermCareModel> getDCIndividualLongTermCareModels() {
        return DCIndividualLongTermCareModels;
    }

    public void setDCIndividualLongTermCareModels(List<DCIndividualLongTermCareModel> value) {
        DCIndividualLongTermCareModels = value;
    }

    private DCIndividualMinorParentModel DCIndividualMinorParentModel;

    public DCIndividualMinorParentModel getDCIndividualMinorParentModel() {
        return DCIndividualMinorParentModel;
    }

    public void setDCIndividualMinorParentModel(DCIndividualMinorParentModel value) {
        DCIndividualMinorParentModel = value;
    }

    private DCIndividualProfileModel DCIndividualProfileModel;

    public DCIndividualProfileModel getDCIndividualProfileModel() {
        return DCIndividualProfileModel;
    }

    public void setDCIndividualProfileModel(DCIndividualProfileModel value) {
        DCIndividualProfileModel = value;
    }

    private List<DisabilityModel> DisabilityModels = new ArrayList<>();

    public List<DisabilityModel> getDisabilityModels() {
        return DisabilityModels;
    }

    public void setDisabilityModels(List<DisabilityModel> value) {
        DisabilityModels = value;
    }

    private List<MRTReferralDeterminationModel> MRTReferralDeterminationModels = new ArrayList<>();

    public List<MRTReferralDeterminationModel> getMRTReferralDeterminationModels() {
        return MRTReferralDeterminationModels;
    }

    public void setMRTReferralDeterminationModels(List<MRTReferralDeterminationModel> value) {
        MRTReferralDeterminationModels = value;
    }

    private List<EducationalExpenseModel> EducationalExpenseModels = new ArrayList<>();

    public List<EducationalExpenseModel> getEducationalExpenseModels() {
        return EducationalExpenseModels;
    }

    public void setEducationalExpenseModels(List<EducationalExpenseModel> value) {
        EducationalExpenseModels = value;
    }

    private List<EducationHistoryDetailModel> EducationHistoryDetailModels = new ArrayList<>();

    public List<EducationHistoryDetailModel> getEducationHistoryDetailModels() {
        return EducationHistoryDetailModels;
    }

    public void setEducationHistoryDetailModels(List<EducationHistoryDetailModel> value) {
        EducationHistoryDetailModels = value;
    }

    private List<EmergencyMedicalConditionModel> EmergencyMedicalConditionModels = new ArrayList<>();

    public List<EmergencyMedicalConditionModel> getEmergencyMedicalConditionModels() {
        return EmergencyMedicalConditionModels;
    }

    public void setEmergencyMedicalConditionModels(List<EmergencyMedicalConditionModel> value) {
        EmergencyMedicalConditionModels = value;
    }

    private List<EmergencyMedicalConditionExtensionModel> EmergencyMedicalConditionExtensionModels = new ArrayList<>();

    public List<EmergencyMedicalConditionExtensionModel> getEmergencyMedicalConditionExtensionModels() {
        return EmergencyMedicalConditionExtensionModels;
    }

    public void setEmergencyMedicalConditionExtensionModels(List<EmergencyMedicalConditionExtensionModel> value) {
        EmergencyMedicalConditionExtensionModels = value;
    }

    private List<EsiMecResponseModel> EsiMecResponseModels = new ArrayList<>();

    public List<EsiMecResponseModel> getEsiMecResponseModels() {
        return EsiMecResponseModels;
    }

    public void setEsiMecResponseModels(List<EsiMecResponseModel> value) {
        EsiMecResponseModels = value;
    }

    private HeadOfHouseholdModel HeadOfHouseholdModel;

    public HeadOfHouseholdModel getHeadOfHouseholdModel() {
        return HeadOfHouseholdModel;
    }

    public void setHeadOfHouseholdModel(HeadOfHouseholdModel value) {
        HeadOfHouseholdModel = value;
    }

    private List<IndividualBenefitExtensionModel> IndividualBenefitExtensionModels = new ArrayList<>();

    public List<IndividualBenefitExtensionModel> getIndividualBenefitExtensionModels() {
        return IndividualBenefitExtensionModels;
    }

    public void setIndividualBenefitExtensionModels(List<IndividualBenefitExtensionModel> value) {
        IndividualBenefitExtensionModels = value;
    }

    private List<IndividualBenefitMonthTrackingModel> IndividualBenefitMonthTrackingModels = new ArrayList<>();

    public List<IndividualBenefitMonthTrackingModel> getIndividualBenefitMonthTrackingModels() {
        return IndividualBenefitMonthTrackingModels;
    }

    public void setIndividualBenefitMonthTrackingModels(List<IndividualBenefitMonthTrackingModel> value) {
        IndividualBenefitMonthTrackingModels = value;
    }

    private CitizenshipModel CitizenshipModel;

    public CitizenshipModel getCitizenshipModel() {
        return CitizenshipModel;
    }

    public void setCitizenshipModel(CitizenshipModel value) {
        CitizenshipModel = value;
    }

    private ResidencyModel ResidencyModel;

    public ResidencyModel getResidencyModel() {
        return ResidencyModel;
    }

    public void setResidencyModel(ResidencyModel value) {
        ResidencyModel = value;
    }

    private EmancipationModel EmancipationModel;

    public EmancipationModel getEmancipationModel() {
        return EmancipationModel;
    }

    public void setEmancipationModel(EmancipationModel value) {
        EmancipationModel = value;
    }

    private List<IndividualFosterCareModel> IndividualFosterCareModels = new ArrayList<>();

    public List<IndividualFosterCareModel> getIndividualFosterCareModels() {
        return IndividualFosterCareModels;
    }

    public void setIndividualFosterCareModels(List<IndividualFosterCareModel> value) {
        IndividualFosterCareModels = value;
    }

    private IndividualIncarcerationModel IndividualIncarcerationModel;

    public IndividualIncarcerationModel getIndividualIncarcerationModel() {
        return IndividualIncarcerationModel;
    }

    public void setIndividualIncarcerationModel(IndividualIncarcerationModel value) {
        IndividualIncarcerationModel = value;
    }

    private IndividualLivingArrangementModel IndividualLivingArrangementModel;

    public IndividualLivingArrangementModel getIndividualLivingArrangementModel() {
        return IndividualLivingArrangementModel;
    }

    public void setIndividualLivingArrangementModel(IndividualLivingArrangementModel value) {
        IndividualLivingArrangementModel = value;
    }

    private IndividualLivingArrangementModel IndividualPreviousLivingArrangementModel;

    public IndividualLivingArrangementModel getIndividualPreviousLivingArrangementModel() {
        return IndividualPreviousLivingArrangementModel;
    }

    public void setIndividualPreviousLivingArrangementModel(IndividualLivingArrangementModel value) {
        IndividualPreviousLivingArrangementModel = value;
    }

    private List<IndividualLivingArrangementModel> LstIndividualLivingArrangementModel = new ArrayList<>();

    public List<IndividualLivingArrangementModel> getLstIndividualLivingArrangementModel() {
        return LstIndividualLivingArrangementModel;
    }

    public void setLstIndividualLivingArrangementModel(List<IndividualLivingArrangementModel> value) {
        LstIndividualLivingArrangementModel = value;
    }

    private LivingArrangementProviderTableModel LivingArrangementProviderTableModel;

    public LivingArrangementProviderTableModel getLivingArrangementProviderTableModel() {
        return LivingArrangementProviderTableModel;
    }

    public void setLivingArrangementProviderTableModel(LivingArrangementProviderTableModel value) {
        LivingArrangementProviderTableModel = value;
    }

    private List<IndividualLowestCostEmployerPlanModel> IndividualLowestCostEmployerPlanModels = new ArrayList<>();

    public List<IndividualLowestCostEmployerPlanModel> getIndividualLowestCostEmployerPlanModels() {
        return IndividualLowestCostEmployerPlanModels;
    }

    public void setIndividualLowestCostEmployerPlanModels(List<IndividualLowestCostEmployerPlanModel> value) {
        IndividualLowestCostEmployerPlanModels = value;
    }


    private List<IndividualVLPResponseModel> IndividualVLPResponseModels = new ArrayList<>();

    public List<IndividualVLPResponseModel> getIndividualVLPResponseModels() {
        return IndividualVLPResponseModels;
    }

    public void setIndividualVLPResponseModels(List<IndividualVLPResponseModel> value) {
        IndividualVLPResponseModels = value;
    }

    private List<ComplianceModel> IndividualComplianceModels = new ArrayList<>();

    public List<ComplianceModel> getIndividualComplianceModels() {
        return IndividualComplianceModels;
    }

    public void setIndividualComplianceModels(List<ComplianceModel> value) {
        IndividualComplianceModels = value;
    }

    private List<ComplianceModel> IndividualComplianceModelsWithoutMinMax = new ArrayList<>();

    public List<ComplianceModel> getIndividualComplianceModelsWithoutMinMax() {
        return IndividualComplianceModelsWithoutMinMax;
    }

    public void setIndividualComplianceModelsWithoutMinMax(List<ComplianceModel> value) {
        IndividualComplianceModelsWithoutMinMax = value;
    }

    private List<IPVDetailModel> IndividualIPVComplianceModels = new ArrayList<>();

    public List<IPVDetailModel> getIndividualIPVComplianceModels() {
        return IndividualIPVComplianceModels;
    }

    public void setIndividualIPVComplianceModels(List<IPVDetailModel> value) {
        IndividualIPVComplianceModels = value;
    }

    private List<ESICoverageDetailModel> ESICoverageDetailModels = new ArrayList<>();

    public List<ESICoverageDetailModel> getESICoverageDetailModels() {
        return ESICoverageDetailModels;
    }

    public void setESICoverageDetailModels(List<ESICoverageDetailModel> value) {
        ESICoverageDetailModels = value;
    }

    private MealArrangementModel MealArrangementModel;

    public MealArrangementModel getMealArrangementModel() {
        return MealArrangementModel;
    }

    public void setMealArrangementModel(MealArrangementModel value) {
        MealArrangementModel = value;
    }


    public NewBornModel NewBornModel;

    public NewBornModel getNewBornModel() {
        return NewBornModel;
    }

    public void setNewBornModel(NewBornModel value) {
        NewBornModel = value;
    }

    private List<NonEsiMecResponseModel> NonEsiMecResponseModels = new ArrayList<>();

    public List<NonEsiMecResponseModel> getNonEsiMecResponseModels() {
        return NonEsiMecResponseModels;
    }

    public void setNonEsiMecResponseModels(List<NonEsiMecResponseModel> value) {
        NonEsiMecResponseModels = value;
    }

    private List<OutOfStateBenefitModel> OutOfStateBenefitModels = new ArrayList<>();

    public List<OutOfStateBenefitModel> getOutOfStateBenefitModels() {
        return OutOfStateBenefitModels;
    }

    public void setOutOfStateBenefitModels(List<OutOfStateBenefitModel> value) {
        OutOfStateBenefitModels = value;
    }

    private List<OverpaymentModel> OverpaymentModels = new ArrayList<>();

    public List<OverpaymentModel> getOverpaymentModels() {
        return OverpaymentModels;
    }

    public void setOverpaymentModels(List<OverpaymentModel> value) {
        OverpaymentModels = value;
    }

    private PregnancyModel PregnancyModel;

    public PregnancyModel getPregnancyModel() {
        return PregnancyModel;
    }

    public void setPregnancyModel(PregnancyModel value) {
        PregnancyModel = value;
    }

    public List<RelationshipModel> RelationshipModels = new ArrayList<>();

    public List<RelationshipModel> getRelationshipModels() {
        return RelationshipModels;
    }

    public void setRelationshipModels(List<RelationshipModel> value) {
        RelationshipModels = value;
    }

    private List<SelfEmploymentPayExpenseModel> SelfEmploymentPayExpenseModels = new ArrayList<>();

    public List<SelfEmploymentPayExpenseModel> getSelfEmploymentPayExpenseModels() {
        return SelfEmploymentPayExpenseModels;
    }

    public void setSelfEmploymentPayExpenseModels(List<SelfEmploymentPayExpenseModel> value) {
        SelfEmploymentPayExpenseModels = value;
    }

    private List<SpendDownModel> SpendDownModels = new ArrayList<>();

    public List<SpendDownModel> getSpendDownModels() {
        return SpendDownModels;
    }

    public void setSpendDownModels(List<SpendDownModel> value) {
        SpendDownModels = value;
    }

    private List<SSIBenefitModel> SSIBenefitModels = new ArrayList<>();

    public List<SSIBenefitModel> getSSIBenefitModels() {
        return SSIBenefitModels;
    }

    public void setSSIBenefitModels(List<SSIBenefitModel> value) {
        SSIBenefitModels = value;
    }

    private StatusofIndividualHouseholdModel StatusofIndividualHouseholdModel;

    public StatusofIndividualHouseholdModel getStatusofIndividualHouseholdModel() {
        return StatusofIndividualHouseholdModel;
    }

    public void setStatusofIndividualHouseholdModel(StatusofIndividualHouseholdModel value) {
        StatusofIndividualHouseholdModel = value;
    }

    private StatusofTaxFilingModel StatusofTaxFilingModel;

    public StatusofTaxFilingModel getStatusofTaxFilingModel() {
        return StatusofTaxFilingModel;
    }

    public void setStatusofTaxFilingModel(StatusofTaxFilingModel value) {
        StatusofTaxFilingModel = value;
    }

    private List<ConversionIndividualInformationModel> ConversionIndividualInformationModels = new ArrayList<>();

    public List<ConversionIndividualInformationModel> getConversionIndividualInformationModels() {
        return ConversionIndividualInformationModels;
    }

    public void setConversionIndividualInformationModels(List<ConversionIndividualInformationModel> value) {
        ConversionIndividualInformationModels = value;
    }

    private ConversionCrossReferenceModel ConversionCrossReferenceModel;

    public ConversionCrossReferenceModel getConversionCrossReferenceModel() {
        return ConversionCrossReferenceModel;
    }

    public void setConversionCrossReferenceModel(ConversionCrossReferenceModel value) {
        ConversionCrossReferenceModel = value;
    }

    private DCThirdPartyLiabilityModel DCThirdPartyLiabilityModel;

    public DCThirdPartyLiabilityModel getDCThirdPartyLiabilityModel() {
        return DCThirdPartyLiabilityModel;
    }

    public void setDCThirdPartyLiabilityModel(DCThirdPartyLiabilityModel value) {
        DCThirdPartyLiabilityModel = value;
    }

    private List<EligibilityIndividualBenefitModel> EligibilityIndividualBenefitModels = new ArrayList<>();

    public List<EligibilityIndividualBenefitModel> getEligibilityIndividualBenefitModels() {
        return EligibilityIndividualBenefitModels;
    }

    public void setEligibilityIndividualBenefitModels(List<EligibilityIndividualBenefitModel> value) {
        EligibilityIndividualBenefitModels = value;
    }

    private List<HealthInsuranceCoveredIndividualsDetailModel> HealthInsuranceCoveredIndividualsDetailModels = new ArrayList<>();

    public List<HealthInsuranceCoveredIndividualsDetailModel> getHealthInsuranceCoveredIndividualsDetailModels() {
        return HealthInsuranceCoveredIndividualsDetailModels;
    }

    public void setHealthInsuranceCoveredIndividualsDetailModels(
            List<HealthInsuranceCoveredIndividualsDetailModel> value) {
        HealthInsuranceCoveredIndividualsDetailModels = value;
    }

    private List<HealthInsurancePolicyDetailModel> HealthInsurancePolicyDetailModels = new ArrayList<>();

    public List<HealthInsurancePolicyDetailModel> getHealthInsurancePolicyDetailModels() {
        return HealthInsurancePolicyDetailModels;
    }

    public void setHealthInsurancePolicyDetailModels(List<HealthInsurancePolicyDetailModel> value) {
        HealthInsurancePolicyDetailModels = value;
    }

    private List<ConditionalMedicareDetailModel> ConditionalMedicareDetailModels = new ArrayList<>();

    public List<ConditionalMedicareDetailModel> getConditionalMedicareDetailModels() {
        return ConditionalMedicareDetailModels;
    }

    public void setConditionalMedicareDetailModels(List<ConditionalMedicareDetailModel> value) {
        ConditionalMedicareDetailModels = value;
    }

    private List<EducationModel> EducationModels = new ArrayList<>();

    public List<EducationModel> getEducationModels() {
        return EducationModels;
    }

    public void setEducationModels(List<EducationModel> value) {
        EducationModels = value;
    }

    private List<JointOwnersDetailModel> JointOwnersDetailModels = new ArrayList<>();

    public List<JointOwnersDetailModel> getJointOwnersDetailModels() {
        return JointOwnersDetailModels;
    }

    public void setJointOwnersDetailModels(List<JointOwnersDetailModel> value) {
        JointOwnersDetailModels = value;
    }

    private List<StatusOfNonCustodialParentModel> StatusOfNonCustodialParentModels = new ArrayList<>();

    public List<StatusOfNonCustodialParentModel> getStatusOfNonCustodialParentModels() {
        return StatusOfNonCustodialParentModels;
    }

    public void setStatusOfNonCustodialParentModels(List<StatusOfNonCustodialParentModel> value) {
        StatusOfNonCustodialParentModels = value;
    }

    private List<EducationEnrollmentModel> EducationEnrollmentModels = new ArrayList<>();

    public List<EducationEnrollmentModel> getEducationEnrollmentModels() {
        return EducationEnrollmentModels;
    }

    public void setEducationEnrollmentModels(List<EducationEnrollmentModel> value) {
        EducationEnrollmentModels = value;
    }

    private List<QualifiedIncomeTrustModel> QualifiedIncomeTrustModels = new ArrayList<>();

    public List<QualifiedIncomeTrustModel> getQualifiedIncomeTrustModels() {
        return QualifiedIncomeTrustModels;
    }

    public void setQualifiedIncomeTrustModels(List<QualifiedIncomeTrustModel> value) {
        QualifiedIncomeTrustModels = value;
    }

    private MigrantSeasonalFarmWorkerModel MigrantSeasonalFarmWorkerModel;

    public MigrantSeasonalFarmWorkerModel getMigrantSeasonalFarmWorkerModel() {
        return MigrantSeasonalFarmWorkerModel;
    }

    public void setMigrantSeasonalFarmWorkerModel(MigrantSeasonalFarmWorkerModel value) {
        MigrantSeasonalFarmWorkerModel = value;
    }

    private MaritalStatusOfIndividualModel MaritalStatusOfIndividualModel;

    public MaritalStatusOfIndividualModel getMaritalStatusOfIndividualModel() {
        return MaritalStatusOfIndividualModel;
    }

    public void setMaritalStatusOfIndividualModel(MaritalStatusOfIndividualModel value) {
        MaritalStatusOfIndividualModel = value;
    }

    private List<LocDeterminationModel> LocDeterminationModels = new ArrayList<>();

    public List<LocDeterminationModel> getLocDeterminationModels() {
        return LocDeterminationModels;
    }

    public void setLocDeterminationModels(List<LocDeterminationModel> value) {
        LocDeterminationModels = value;
    }

    private List<LocPrivatePayDetailModel> LocPrivatePayDetailModels = new ArrayList<>();

    public List<LocPrivatePayDetailModel> getLocPrivatePayDetailModels() {
        return LocPrivatePayDetailModels;
    }

    public void setLocPrivatePayDetailModels(List<LocPrivatePayDetailModel> value) {
        LocPrivatePayDetailModels = value;
    }

    private DCWorkRegistrationModel DCWorkRegistrationModel;

    public DCWorkRegistrationModel getDCWorkRegistrationModel() {
        return DCWorkRegistrationModel;
    }

    public void setDCWorkRegistrationModel(DCWorkRegistrationModel value) {
        DCWorkRegistrationModel = value;
    }

    private List<NoIncomeVerificationModel> NoIncomeVerificationModel = new ArrayList<>();

    public List<NoIncomeVerificationModel> getNoIncomeVerificationModel() {
        return NoIncomeVerificationModel;
    }

    public void setNoIncomeVerificationModel(List<NoIncomeVerificationModel> value) {
        NoIncomeVerificationModel = value;
    }

    private List<NoResourceVerificationModel> NoResourceVerificationModels = new ArrayList<>();

    public List<NoResourceVerificationModel> getNoResourceVerificationModels() {
        return NoResourceVerificationModels;
    }

    public void setNoResourceVerificationModels(List<NoResourceVerificationModel> value) {
        NoResourceVerificationModels = value;
    }

    private List<DCEntitledBenefitModel> DCEntitledBenefitModels = new ArrayList<>();

    public List<DCEntitledBenefitModel> getDCEntitledBenefitModels() {
        return DCEntitledBenefitModels;
    }

    public void setDCEntitledBenefitModels(List<DCEntitledBenefitModel> value) {
        DCEntitledBenefitModels = value;
    }

    private List<NonCustodialParentRelationshipModel> NonCustodialParentRelationshipModels = new ArrayList<>();

    public List<NonCustodialParentRelationshipModel> getNonCustodialParentRelationshipModels() {
        return NonCustodialParentRelationshipModels;
    }

    public void setNonCustodialParentRelationshipModels(List<NonCustodialParentRelationshipModel> value) {
        NonCustodialParentRelationshipModels = value;
    }

    private QualifyingParentDeterminationModel QualifyingParentDeterminationModel;

    public QualifyingParentDeterminationModel getQualifyingParentDeterminationModel() {
        return QualifyingParentDeterminationModel;
    }

    public void setQualifyingParentDeterminationModel(QualifyingParentDeterminationModel value) {
        QualifyingParentDeterminationModel = value;
    }

    private List<EDBCCaseIndividualEventModel> EDBCCaseIndividualEventModels = new ArrayList<>();

    public List<EDBCCaseIndividualEventModel> getEDBCCaseIndividualEventModels() {
        return EDBCCaseIndividualEventModels;
    }

    public void setEDBCCaseIndividualEventModels(List<EDBCCaseIndividualEventModel> value) {
        EDBCCaseIndividualEventModels = value;
    }

    private OrganizationProviderMasterModel OrganizationProviderMasterModel;

    public OrganizationProviderMasterModel getOrganizationProviderMasterModel() {
        return OrganizationProviderMasterModel;
    }

    public void setOrganizationProviderMasterModel(OrganizationProviderMasterModel value) {
        OrganizationProviderMasterModel = value;
    }

    private DCIndividualAlienSponsorModel DCIndividualAlienSponsorModel;

    public DCIndividualAlienSponsorModel getDCIndividualAlienSponsorModel() {
        return DCIndividualAlienSponsorModel;
    }

    public void setDCIndividualAlienSponsorModel(DCIndividualAlienSponsorModel value) {
        DCIndividualAlienSponsorModel = value;
    }

    private DCIndividualAlienSponsorRelationshipModel DCIndividualAlienSponsorRelationshipModel;

    public DCIndividualAlienSponsorRelationshipModel getDCIndividualAlienSponsorRelationshipModel() {
        return DCIndividualAlienSponsorRelationshipModel;
    }

    public void setDCIndividualAlienSponsorRelationshipModel(DCIndividualAlienSponsorRelationshipModel value) {
        DCIndividualAlienSponsorRelationshipModel = value;
    }

    private DCIndividualAlienSponsorInformationModel DCIndividualAlienSponsorInformationModel;

    public DCIndividualAlienSponsorInformationModel getDCIndividualAlienSponsorInformationModel() {
        return DCIndividualAlienSponsorInformationModel;
    }

    public void setDCIndividualAlienSponsorInformationModel(DCIndividualAlienSponsorInformationModel value) {
        DCIndividualAlienSponsorInformationModel = value;
    }

    private List<DCIndividualAlienSponsorIncomeAndResourceModel> DCIndividualAlienSponsorIncomeAndResourceModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorIncomeAndResourceModel> getDCIndividualAlienSponsorIncomeAndResourceModels() {
        return DCIndividualAlienSponsorIncomeAndResourceModels;
    }

    public void setDCIndividualAlienSponsorIncomeAndResourceModels(
            List<DCIndividualAlienSponsorIncomeAndResourceModel> value) {
        DCIndividualAlienSponsorIncomeAndResourceModels = value;
    }

    private List<DCIndividualAlienSponsorIncomeAndResourceDetailModel> DCIndividualAlienSponsorIncomeAndResourceDetailModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorIncomeAndResourceDetailModel> getDCIndividualAlienSponsorIncomeAndResourceDetailModels() {
        return DCIndividualAlienSponsorIncomeAndResourceDetailModels;
    }

    public void setDCIndividualAlienSponsorIncomeAndResourceDetailModels(
            List<DCIndividualAlienSponsorIncomeAndResourceDetailModel> value) {
        DCIndividualAlienSponsorIncomeAndResourceDetailModels = value;
    }

    private DCRepresentativeModel DCRepresentativeModel;

    public DCRepresentativeModel getDCRepresentativeModel() {
        return DCRepresentativeModel;
    }

    public void setDCRepresentativeModel(DCRepresentativeModel value) {
        DCRepresentativeModel = value;
    }

    private List<ExemptionDetailModel> ExemptionDetailModels = new ArrayList<>();

    public List<ExemptionDetailModel> getExemptionDetailModels() {
        return ExemptionDetailModels;
    }

    public void setExemptionDetailModels(List<ExemptionDetailModel> value) {
        ExemptionDetailModels = value;
    }

    private List<LTCCoupleModel> LTCCoupleModels = new ArrayList<>();

    public List<LTCCoupleModel> getLTCCoupleModels() {
        return LTCCoupleModels;
    }

    public void setLTCCoupleModels(List<LTCCoupleModel> value) {
        LTCCoupleModels = value;
    }

    private WINInfoModel WinInfoModel;

    public WINInfoModel getWinInfoModel() {
        return WinInfoModel;
    }

    public void setWinInfoModel(WINInfoModel value) {
        WinInfoModel = value;
    }

    private List<LivingArrangementHospitalizationModel> LivingArrangementHospitalizationModels = new ArrayList<>();

    public List<LivingArrangementHospitalizationModel> getLivingArrangementHospitalizationModels() {
        return LivingArrangementHospitalizationModels;
    }

    public void setLivingArrangementHospitalizationModels(List<LivingArrangementHospitalizationModel> value) {
        LivingArrangementHospitalizationModels = value;
    }

    private LTCResourceTransferConsentModel LTCResourceTransferConsentModel;

    public LTCResourceTransferConsentModel getLTCResourceTransferConsentModel() {
        return LTCResourceTransferConsentModel;
    }

    public void setLTCResourceTransferConsentModel(LTCResourceTransferConsentModel value) {
        LTCResourceTransferConsentModel = value;
    }

    private LTCResourceTransferConsentModel LTCResourceTransferConsentIncomeModel;

    public LTCResourceTransferConsentModel getLTCResourceTransferConsentIncomeModel() {
        return LTCResourceTransferConsentIncomeModel;
    }

    public void setLTCResourceTransferConsentIncomeModel(LTCResourceTransferConsentModel value) {
        LTCResourceTransferConsentIncomeModel = value;
    }

    private List<MoneyFollowsThePersonModel> MoneyFollowsThePersonModel = new ArrayList<>();

    public List<MoneyFollowsThePersonModel> getMoneyFollowsThePersonModel() {
        return MoneyFollowsThePersonModel;
    }

    public void setMoneyFollowsThePersonModel(List<MoneyFollowsThePersonModel> value) {
        MoneyFollowsThePersonModel = value;
    }

    private List<MFPShelterAllowanceModel> MFPShelterAllowanceModel = new ArrayList<>();

    public List<MFPShelterAllowanceModel> getMFPShelterAllowanceModel() {
        return MFPShelterAllowanceModel;
    }

    public void setMFPShelterAllowanceModel(List<MFPShelterAllowanceModel> value) {
        MFPShelterAllowanceModel = value;
    }

    private List<StatusOfMFPModel> StatusOfMFPModel = new ArrayList<>();

    public List<StatusOfMFPModel> getStatusOfMFPModel() {
        return StatusOfMFPModel;
    }

    public void setStatusOfMFPModel(List<StatusOfMFPModel> value) {
        StatusOfMFPModel = value;
    }

    private KTAPIneligibilityModel KTAPIneligibilityModel;

    public KTAPIneligibilityModel getKTAPIneligibilityModel() {
        return KTAPIneligibilityModel;
    }

    public void setKTAPIneligibilityModel(KTAPIneligibilityModel value) {
        KTAPIneligibilityModel = value;
    }

    private DCDomesticViolenceModel DcDomesticViolenceModel;

    public DCDomesticViolenceModel getDcDomesticViolenceModel() {
        return DcDomesticViolenceModel;
    }

    public void setDcDomesticViolenceModel(DCDomesticViolenceModel value) {
        DcDomesticViolenceModel = value;
    }

    private List<PPAuthorizationIndividualModel> PPAuthorizationIndividualModel = new ArrayList<>();

    public List<PPAuthorizationIndividualModel> getPPAuthorizationIndividualModel() {
        return PPAuthorizationIndividualModel;
    }

    public void setPPAuthorizationIndividualModel(List<PPAuthorizationIndividualModel> value) {
        PPAuthorizationIndividualModel = value;
    }

    private KWPAssessmentConsentModel KWPAssessmentConsentModel;

    public KWPAssessmentConsentModel getKWPAssessmentConsentModel() {
        return KWPAssessmentConsentModel;
    }

    public void setKWPAssessmentConsentModel(KWPAssessmentConsentModel value) {
        KWPAssessmentConsentModel = value;
    }

    private EnrollmentDetailModel EnrollmentDetailModel;

    public EnrollmentDetailModel getEnrollmentDetailModel() {
        return EnrollmentDetailModel;
    }

    public void setEnrollmentDetailModel(EnrollmentDetailModel value) {
        EnrollmentDetailModel = value;
    }

    private StatusOfEnrollmentModel StatusOfEnrollmentModel;

    public StatusOfEnrollmentModel getStatusOfEnrollmentModel() {
        return StatusOfEnrollmentModel;
    }

    public void setStatusOfEnrollmentModel(StatusOfEnrollmentModel value) {
        StatusOfEnrollmentModel = value;
    }

    private List<EmploymentDetailModel> EmploymentDetailModelsPastMonth = new ArrayList<>();

    public List<EmploymentDetailModel> getEmploymentDetailModelsPastMonth() {
        return EmploymentDetailModelsPastMonth;
    }

    public void setEmploymentDetailModelsPastMonth(List<EmploymentDetailModel> value) {
        EmploymentDetailModelsPastMonth = value;
    }

    private List<SelfEmploymentIncomeDetailModel> SelfEmploymentIncomeDetailModelsPastMonth = new ArrayList<>();

    public List<SelfEmploymentIncomeDetailModel> getSelfEmploymentIncomeDetailModelsPastMonth() {
        return SelfEmploymentIncomeDetailModelsPastMonth;
    }

    public void setSelfEmploymentIncomeDetailModelsPastMonth(List<SelfEmploymentIncomeDetailModel> value) {
        SelfEmploymentIncomeDetailModelsPastMonth = value;
    }

    private List<UNPAIDEMPLOYMENTModel> UnpaidEmploymentBudgetModelsPastMonth = new ArrayList<>();

    public List<UNPAIDEMPLOYMENTModel> getUnpaidEmploymentBudgetModelsPastMonth() {
        return UnpaidEmploymentBudgetModelsPastMonth;
    }

    public void setUnpaidEmploymentBudgetModelsPastMonth(List<UNPAIDEMPLOYMENTModel> value) {
        UnpaidEmploymentBudgetModelsPastMonth = value;
    }

    private List<DisabilityModel> DisabilityModelsPastMonth = new ArrayList<>();

    public List<DisabilityModel> getDisabilityModelsPastMonth() {
        return DisabilityModelsPastMonth;
    }

    public void setDisabilityModelsPastMonth(List<DisabilityModel> value) {
        DisabilityModelsPastMonth = value;
    }

    private List<EducationEnrollmentModel> EducationEnrollmentModelsPastMonth = new ArrayList<>();

    public List<EducationEnrollmentModel> getEducationEnrollmentModelsPastMonth() {
        return EducationEnrollmentModelsPastMonth;
    }

    public void setEducationEnrollmentModelsPastMonth(List<EducationEnrollmentModel> value) {
        EducationEnrollmentModelsPastMonth = value;
    }

    private List<VerifiedSsaCompositeIndividualResponseModel> verfSsaCompIndvResponseModels = new ArrayList<>();

    public List<VerifiedSsaCompositeIndividualResponseModel> getverfSsaCompIndvResponseModels() {
        return verfSsaCompIndvResponseModels;
    }

    public void setverfSsaCompIndvResponseModels(List<VerifiedSsaCompositeIndividualResponseModel> value) {
        verfSsaCompIndvResponseModels = value;
    }

    private List<VerifyAnnualHouseholdIndividualIncomeResponseModel> vrfAnnualHHIndvIncomeResponseModels = new ArrayList<>();

    public List<VerifyAnnualHouseholdIndividualIncomeResponseModel> getvrfAnnualHHIndvIncomeResponseModels() {
        return vrfAnnualHHIndvIncomeResponseModels;
    }

    public void setvrfAnnualHHIndvIncomeResponseModels(List<VerifyAnnualHouseholdIndividualIncomeResponseModel> value) {
        vrfAnnualHHIndvIncomeResponseModels = value;
    }

    private List<SwicaWagesIncomeModel> swicaWagesIncomeModels = new ArrayList<>();

    public List<SwicaWagesIncomeModel> getswicaWagesIncomeModels() {
        return swicaWagesIncomeModels;
    }

    public void setswicaWagesIncomeModels(List<SwicaWagesIncomeModel> value) {
        swicaWagesIncomeModels = value;
    }

    private List<IRSResponseVeificationDetailModel> irsResponseVerificationDetailModels = new ArrayList<>();

    public List<IRSResponseVeificationDetailModel> getirsResponseVerificationDetailModels() {
        return irsResponseVerificationDetailModels;
    }

    public void setirsResponseVerificationDetailModels(List<IRSResponseVeificationDetailModel> value) {
        irsResponseVerificationDetailModels = value;
    }

    private List<IRSResponseMetadataModel> irsResponseMetedataModels = new ArrayList<>();

    public List<IRSResponseMetadataModel> getirsResponseMetedataModels() {
        return irsResponseMetedataModels;
    }

    public void setirsResponseMetedataModels(List<IRSResponseMetadataModel> value) {
        irsResponseMetedataModels = value;
    }

    private List<StateUnemploymentBenefitModel> stateUnemploymentBenefitModels = new ArrayList<>();

    public List<StateUnemploymentBenefitModel> getstateUnemploymentBenefitModels() {
        return stateUnemploymentBenefitModels;
    }

    public void setstateUnemploymentBenefitModels(List<StateUnemploymentBenefitModel> value) {
        stateUnemploymentBenefitModels = value;
    }

    private VerifyAnnualHouseholdIncomeModel verifyAnnualHouseholdIncomeModel;

    public VerifyAnnualHouseholdIncomeModel getverifyAnnualHouseholdIncomeModel() {
        return verifyAnnualHouseholdIncomeModel;
    }

    public void setverifyAnnualHouseholdIncomeModel(VerifyAnnualHouseholdIncomeModel value) {
        verifyAnnualHouseholdIncomeModel = value;
    }

    private List<VerifyAnnualHouseholdIncomeIndividualModel> verifyAnnualHouseholdIncomeIndividualModels = new ArrayList<>();

    public List<VerifyAnnualHouseholdIncomeIndividualModel> getverifyAnnualHouseholdIncomeIndividualModels() {
        return verifyAnnualHouseholdIncomeIndividualModels;
    }

    public void setverifyAnnualHouseholdIncomeIndividualModels(List<VerifyAnnualHouseholdIncomeIndividualModel> value) {
        verifyAnnualHouseholdIncomeIndividualModels = value;
    }

    private List<VerifyCurrentIncomeModel> verifyCurrentIncomeModels = new ArrayList<>();

    public List<VerifyCurrentIncomeModel> getverifyCurrentIncomeModels() {
        return verifyCurrentIncomeModels;
    }

    public void setverifyCurrentIncomeModels(List<VerifyCurrentIncomeModel> value) {
        verifyCurrentIncomeModels = value;
    }

    private List<PayPeriodInformationModel> PayPeriodInformationModels = new ArrayList<>();

    public List<PayPeriodInformationModel> getPayPeriodInformationModels() {
        return PayPeriodInformationModels;
    }

    public void setPayPeriodInformationModels(List<PayPeriodInformationModel> value) {
        PayPeriodInformationModels = value;
    }

    private List<FailedFederalInterfaceModel> FailedFederalInterfaceModels = new ArrayList<>();

    public List<FailedFederalInterfaceModel> getFailedFederalInterfaceModels() {
        return FailedFederalInterfaceModels;
    }

    public void setFailedFederalInterfaceModels(List<FailedFederalInterfaceModel> value) {
        FailedFederalInterfaceModels = value;
    }

    private ComplianceModel IndividualWorkRegistrationModel;

    public ComplianceModel getIndividualWorkRegistrationModel() {
        return IndividualWorkRegistrationModel;
    }

    public void setIndividualWorkRegistrationModel(ComplianceModel value) {
        IndividualWorkRegistrationModel = value;
    }

    private IndividualLivingArrangementModel IndividualLivingArrangementApprissModel;

    public IndividualLivingArrangementModel getIndividualLivingArrangementApprissModel() {
        return IndividualLivingArrangementApprissModel;
    }

    public void setIndividualLivingArrangementApprissModel(IndividualLivingArrangementModel value) {
        IndividualLivingArrangementApprissModel = value;
    }

    private LivingArrangementProviderTableModel LivingArrangementProviderTableApprissModel;

    public LivingArrangementProviderTableModel getLivingArrangementProviderTableApprissModel() {
        return LivingArrangementProviderTableApprissModel;
    }

    public void setLivingArrangementProviderTableApprissModel(LivingArrangementProviderTableModel value) {
        LivingArrangementProviderTableApprissModel = value;
    }

}
