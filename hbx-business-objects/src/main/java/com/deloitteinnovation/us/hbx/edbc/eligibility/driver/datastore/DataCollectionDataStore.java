package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseProgramIndividualR5;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseProgramR5;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.IndividualCEEligibleStatus;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.SuspensionDetails;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.SuspensionMonthlyDetails;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.APTCIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ApplicationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseProgramIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseProgramModel;
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
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCRepresentativeCaseAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCRepresentativeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCRepresentativePermissionLevelAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCSNAPHouseholdExpeditedScreeningModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCThirdPartyLiabilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCWorkRegistrationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DSNAPIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DSNAPResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DisabilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ESICoverageDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ETPAbawdCountyMappingModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ETPAbawdEffectiveDateModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ETPAbawdWaiverSetupWaivedCountyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ETPAssessmentInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ETPCureModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EarnedIncomeStrikeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationEnrollmentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationHistoryDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationalExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmancipationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmergencyMedicalConditionExtensionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmergencyMedicalConditionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmploymentBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmploymentDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmploymentDetailPayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EnrollmentDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EsiMecResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExemptionDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExpenseAmountModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HBEHIndividualControlGroupModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HeadOfHouseholdModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HealthInsuranceCoveredIndividualsDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HealthInsuranceFacilityTypeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HealthInsurancePolicyDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IPVDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IncapacityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IncomeEmploymentInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IncomePayDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IncreaseCommunitySpouseIncomeModel;
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
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.MCOPaymentDetailModel;
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
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OtherEarnedIncomeBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OtherEarnedIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OtherEarnedIncomePayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OutOfStateBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OverpaymentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.P2PGroupAssignmentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PPAuthorizationIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PPAuthorizationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PPIncomeBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PPIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PayPeriodInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PregnancyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.QualifiedIncomeTrustModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.QualifyingParentDeterminationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.RelationshipModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ResidencyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ResourceDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SDXEligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SDXModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SNAPDemoInboundModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SSIBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SafeDenialModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SafeRentMortgageModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentDetailPayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentJointOwnersBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentPayExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ShortTermExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SpendDownModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfEnrollmentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfHouseholdCompositionAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfHouseholdCompositionSummaryModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfMFPModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusOfNonCustodialParentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusofIndividualHouseholdModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StatusofTaxFilingModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SubsidizedAdoptionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SuspensionRecordModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.TMAEmploymentEndDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.TMAIncomeReportingModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.TaskModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.TransferredResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UNPAIDEMPLOYMENTModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnclearInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomeBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomeChildSupportIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomePayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnoccupiedShelterModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerificationConfigurationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyCurrentIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.WINInfoModel;

import java.util.ArrayList;
import java.util.List;

public class DataCollectionDataStore {
    private List<APTCIncomeDetailModel> APTCIncomeDetailModels = new ArrayList<>();

    public List<APTCIncomeDetailModel> getAPTCIncomeDetailModels() {
        return APTCIncomeDetailModels;
    }

    public void setAPTCIncomeDetailModels(List<APTCIncomeDetailModel> value) {
        APTCIncomeDetailModels = value;
    }

    private List<CitizenshipModel> CitizenshipModels = new ArrayList<>();

    public List<CitizenshipModel> getCitizenshipModels() {
        return CitizenshipModels;
    }

    public void setCitizenshipModels(List<CitizenshipModel> value) {
        CitizenshipModels = value;
    }

    private List<ResidencyModel> ResidencyModels = new ArrayList<>();

    public List<ResidencyModel> getResidencyModels() {
        return ResidencyModels;
    }

    public void setResidencyModels(List<ResidencyModel> value) {
        ResidencyModels = value;
    }

    private CaseModel CaseModel;

    public CaseModel getCaseModel() {
        return CaseModel;
    }

    public void setCaseModel(CaseModel value) {
        CaseModel = value;
    }


    private List<ETPAbawdWaiverSetupWaivedCountyModel> ETPAbawdWaiverSetupWaivedCountyModels = new ArrayList<>();

    public List<ETPAbawdWaiverSetupWaivedCountyModel> getETPAbawdWaiverSetupWaivedCountyModels() {
        return ETPAbawdWaiverSetupWaivedCountyModels;
    }

    public void setETPAbawdWaiverSetupWaivedCountyModels(List<ETPAbawdWaiverSetupWaivedCountyModel> value) {
        ETPAbawdWaiverSetupWaivedCountyModels = value;
    }

    private List<CaseIndividualModel> CaseIndividualModels = new ArrayList<>();

    public List<CaseIndividualModel> getCaseIndividualModels() {
        return CaseIndividualModels;
    }

    public void setCaseIndividualModels(List<CaseIndividualModel> value) {
        CaseIndividualModels = value;
    }

    private List<CaseProgramModel> CaseProgramModels = new ArrayList<>();

    public List<CaseProgramModel> getCaseProgramModels() {
        return CaseProgramModels;
    }

    public void setCaseProgramModels(List<CaseProgramModel> value) {
        CaseProgramModels = value;
    }

    private List<CaseProgramIndividualModel> CaseProgramIndividualModels = new ArrayList<>();

    public List<CaseProgramIndividualModel> getCaseProgramIndividualModels() {
        return CaseProgramIndividualModels;
    }

    public void setCaseProgramIndividualModels(List<CaseProgramIndividualModel> value) {
        CaseProgramIndividualModels = value;
    }

    private List<CaseProgramR5> CaseProgramR5Models = new ArrayList<>();

    public List<CaseProgramR5> getCaseProgramR5Models() {
        return CaseProgramR5Models;
    }

    public void setCaseProgramR5Models(List<CaseProgramR5> value) {
        CaseProgramR5Models = value;
    }

    private List<CaseProgramIndividualR5> CaseProgramIndividualR5Models = new ArrayList<>();

    public List<CaseProgramIndividualR5> getCaseProgramIndividualR5Models() {
        return CaseProgramIndividualR5Models;
    }

    public void setCaseProgramIndividualR5Models(List<CaseProgramIndividualR5> value) {
        CaseProgramIndividualR5Models = value;
    }

    private List<CaseProgramModel> CaseProgramAllModels = new ArrayList<>();

    public List<CaseProgramModel> getCaseProgramAllModels() {
        return CaseProgramAllModels;
    }

    public void setCaseProgramAllModels(List<CaseProgramModel> value) {
        CaseProgramAllModels = value;
    }

    private List<CaseProgramIndividualModel> CaseProgramIndividualAllModels = new ArrayList<>();

    public List<CaseProgramIndividualModel> getCaseProgramIndividualAllModels() {
        return CaseProgramIndividualAllModels;
    }

    public void setCaseProgramIndividualAllModels(List<CaseProgramIndividualModel> value) {
        CaseProgramIndividualAllModels = value;
    }

    private List<CustodyDetailModel> CustodyDetailModels = new ArrayList<>();

    public List<CustodyDetailModel> getCustodyDetailModels() {
        return CustodyDetailModels;
    }

    public void setCustodyDetailModels(List<CustodyDetailModel> value) {
        CustodyDetailModels = value;
    }

    private List<SubsidizedAdoptionModel> SubsidizedAdoptionModels = new ArrayList<>();

    public List<SubsidizedAdoptionModel> getSubsidizedAdoptionModels() {
        return SubsidizedAdoptionModels;
    }

    public void setSubsidizedAdoptionModels(List<SubsidizedAdoptionModel> value) {
        SubsidizedAdoptionModels = value;
    }

    private List<DCAddressModel> DCAddressModels = new ArrayList<>();

    public List<DCAddressModel> getDCAddressModels() {
        return DCAddressModels;
    }

    public void setDCAddressModels(List<DCAddressModel> value) {
        DCAddressModels = value;
    }

    private List<DCDomesticViolenceModel> DcDomesticViolenceModels = new ArrayList<>();

    public List<DCDomesticViolenceModel> getDcDomesticViolenceModels() {
        return DcDomesticViolenceModels;
    }

    public void setDcDomesticViolenceModels(List<DCDomesticViolenceModel> value) {
        DcDomesticViolenceModels = value;
    }

    private List<DCIndividualModel> DCIndividualModels = new ArrayList<>();

    public List<DCIndividualModel> getDCIndividualModels() {
        return DCIndividualModels;
    }

    public void setDCIndividualModels(List<DCIndividualModel> value) {
        DCIndividualModels = value;
    }

    private List<DCIndividualAddressAssociationModel> DCIndividualAddressAssociationModels = new ArrayList<>();

    public List<DCIndividualAddressAssociationModel> getDCIndividualAddressAssociationModels() {
        return DCIndividualAddressAssociationModels;
    }

    public void setDCIndividualAddressAssociationModels(List<DCIndividualAddressAssociationModel> value) {
        DCIndividualAddressAssociationModels = value;
    }

    private List<DCIndividualAlienModel> DCIndividualAlienModels = new ArrayList<>();

    public List<DCIndividualAlienModel> getDCIndividualAlienModels() {
        return DCIndividualAlienModels;
    }

    public void setDCIndividualAlienModels(List<DCIndividualAlienModel> value) {
        DCIndividualAlienModels = value;
    }

    private List<DCIndividualAlienSponsorModel> DCIndividualAlienSponsorModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorModel> getDCIndividualAlienSponsorModels() {
        return DCIndividualAlienSponsorModels;
    }

    public void setDCIndividualAlienSponsorModels(List<DCIndividualAlienSponsorModel> value) {
        DCIndividualAlienSponsorModels = value;
    }

    private List<DCIndividualAlienSponsorRelationshipModel> DCIndividualAlienSponsorRelationshipModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorRelationshipModel> getDCIndividualAlienSponsorRelationshipModels() {
        return DCIndividualAlienSponsorRelationshipModels;
    }

    public void setDCIndividualAlienSponsorRelationshipModels(List<DCIndividualAlienSponsorRelationshipModel> value) {
        DCIndividualAlienSponsorRelationshipModels = value;
    }

    private List<DCIndividualAlienSponsorInformationModel> DCIndividualAlienSponsorInformationModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorInformationModel> getDCIndividualAlienSponsorInformationModels() {
        return DCIndividualAlienSponsorInformationModels;
    }

    public void setDCIndividualAlienSponsorInformationModels(List<DCIndividualAlienSponsorInformationModel> value) {
        DCIndividualAlienSponsorInformationModels = value;
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

    private List<DCIndividualAlienTypeModel> DCIndividualAlienTypeModels = new ArrayList<>();

    public List<DCIndividualAlienTypeModel> getDCIndividualAlienTypeModels() {
        return DCIndividualAlienTypeModels;
    }

    public void setDCIndividualAlienTypeModels(List<DCIndividualAlienTypeModel> value) {
        DCIndividualAlienTypeModels = value;
    }

    private List<DCIndividualCommunityIntegrationSupplementationModel> DCIndividualCommunityIntegrationSupplementationModels = new ArrayList<>();

    public List<DCIndividualCommunityIntegrationSupplementationModel> getDCIndividualCommunityIntegrationSupplementationModels() {
        return DCIndividualCommunityIntegrationSupplementationModels;
    }

    public void setDCIndividualCommunityIntegrationSupplementationModels(
            List<DCIndividualCommunityIntegrationSupplementationModel> value) {
        DCIndividualCommunityIntegrationSupplementationModels = value;
    }

    private List<DCIndividualLongTermCareModel> DCIndividualLongTermCareModels = new ArrayList<>();

    public List<DCIndividualLongTermCareModel> getDCIndividualLongTermCareModels() {
        return DCIndividualLongTermCareModels;
    }

    public void setDCIndividualLongTermCareModels(List<DCIndividualLongTermCareModel> value) {
        DCIndividualLongTermCareModels = value;
    }

    private List<DCIndividualMinorParentModel> DCIndividualMinorParentModels = new ArrayList<>();

    public List<DCIndividualMinorParentModel> getDCIndividualMinorParentModels() {
        return DCIndividualMinorParentModels;
    }

    public void setDCIndividualMinorParentModels(List<DCIndividualMinorParentModel> value) {
        DCIndividualMinorParentModels = value;
    }

    private List<DCIndividualProfileModel> DCIndividualProfileModels = new ArrayList<>();

    public List<DCIndividualProfileModel> getDCIndividualProfileModels() {
        return DCIndividualProfileModels;
    }

    public void setDCIndividualProfileModels(List<DCIndividualProfileModel> value) {
        DCIndividualProfileModels = value;
    }

    private List<DCSNAPHouseholdExpeditedScreeningModel> DCSNAPHouseholdExpeditedScreeningModels = new ArrayList<>();

    public List<DCSNAPHouseholdExpeditedScreeningModel> getDCSNAPHouseholdExpeditedScreeningModels() {
        return DCSNAPHouseholdExpeditedScreeningModels;
    }

    public void setDCSNAPHouseholdExpeditedScreeningModels(List<DCSNAPHouseholdExpeditedScreeningModel> value) {
        DCSNAPHouseholdExpeditedScreeningModels = value;
    }

    private List<KWPAssessmentConsentModel> KWPAssessmentConsentModels = new ArrayList<>();

    public List<KWPAssessmentConsentModel> getKWPAssessmentConsentModels() {
        return KWPAssessmentConsentModels;
    }

    public void setKWPAssessmentConsentModels(List<KWPAssessmentConsentModel> value) {
        KWPAssessmentConsentModels = value;
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

    private List<MedicallyFrailModel> DCMedicallyFrailModels = new ArrayList<>();

    public List<MedicallyFrailModel> getDCMedicallyFrailModels() {
        return DCMedicallyFrailModels;
    }

    public void setDCMedicallyFrailModels(List<MedicallyFrailModel> value) {
        DCMedicallyFrailModels = value;
    }

    private List<SuspensionDetails> SuspensionDetailModels = new ArrayList<>();

    public List<SuspensionDetails> getSuspensionDetailModels() {
        return SuspensionDetailModels;
    }

    public void setSuspensionDetailModels(List<SuspensionDetails> value) {
        SuspensionDetailModels = value;
    }

    private List<SuspensionMonthlyDetails> SuspensionMonthlyDetailModels = new ArrayList<>();

    public List<SuspensionMonthlyDetails> getSuspensionMonthlyDetailModels() {
        return SuspensionMonthlyDetailModels;
    }

    public void setSuspensionMonthlyDetailModels(List<SuspensionMonthlyDetails> value) {
        SuspensionMonthlyDetailModels = value;
    }

    private List<MCOPaymentDetailModel> MCOPaymentDetailModels = new ArrayList<>();

    public List<MCOPaymentDetailModel> getMCOPaymentDetailModels() {
        return MCOPaymentDetailModels;
    }

    public void setMCOPaymentDetailModels(List<MCOPaymentDetailModel> value) {
        MCOPaymentDetailModels = value;
    }


    private List<DSNAPIncomeModel> DSNAPIncomeModels = new ArrayList<>();

    public List<DSNAPIncomeModel> getDSNAPIncomeModels() {
        return DSNAPIncomeModels;
    }

    public void setDSNAPIncomeModels(List<DSNAPIncomeModel> value) {
        DSNAPIncomeModels = value;
    }

    private List<DSNAPResourceModel> DSNAPResourceModels = new ArrayList<>();

    public List<DSNAPResourceModel> getDSNAPResourceModels() {
        return DSNAPResourceModels;
    }

    public void setDSNAPResourceModels(List<DSNAPResourceModel> value) {
        DSNAPResourceModels = value;
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

    private List<EmploymentBudgetModel> EmploymentBudgetModels = new ArrayList<>();

    public List<EmploymentBudgetModel> getEmploymentBudgetModels() {
        return EmploymentBudgetModels;
    }

    public void setEmploymentBudgetModels(List<EmploymentBudgetModel> value) {
        EmploymentBudgetModels = value;
    }

    private List<UNPAIDEMPLOYMENTModel> UnEmploymentBudgetModels = new ArrayList<>();

    public List<UNPAIDEMPLOYMENTModel> getUnEmploymentBudgetModels() {
        return UnEmploymentBudgetModels;
    }

    public void setUnEmploymentBudgetModels(List<UNPAIDEMPLOYMENTModel> value) {
        UnEmploymentBudgetModels = value;
    }

    private List<PPIncomeDetailModel> PPIncomeDetailModel = new ArrayList<>();

    public List<PPIncomeDetailModel> getPPIncomeDetailModel() {
        return PPIncomeDetailModel;
    }

    public void setPPIncomeDetailModel(List<PPIncomeDetailModel> value) {
        PPIncomeDetailModel = value;
    }

    private List<EmploymentDetailModel> EmploymentDetailModels = new ArrayList<>();

    public List<EmploymentDetailModel> getEmploymentDetailModels() {
        return EmploymentDetailModels;
    }

    public void setEmploymentDetailModels(List<EmploymentDetailModel> value) {
        EmploymentDetailModels = value;
    }

    private List<EmploymentDetailPayAssociationModel> EmploymentDetailPayAssociationModels = new ArrayList<>();

    public List<EmploymentDetailPayAssociationModel> getEmploymentDetailPayAssociationModels() {
        return EmploymentDetailPayAssociationModels;
    }

    public void setEmploymentDetailPayAssociationModels(List<EmploymentDetailPayAssociationModel> value) {
        EmploymentDetailPayAssociationModels = value;
    }

    private List<EsiMecResponseModel> EsiMecResponseModels = new ArrayList<>();

    public List<EsiMecResponseModel> getEsiMecResponseModels() {
        return EsiMecResponseModels;
    }

    public void setEsiMecResponseModels(List<EsiMecResponseModel> value) {
        EsiMecResponseModels = value;
    }

    private List<HeadOfHouseholdModel> HeadOfHouseholdModels = new ArrayList<>();

    public List<HeadOfHouseholdModel> getHeadOfHouseholdModels() {
        return HeadOfHouseholdModels;
    }

    public void setHeadOfHouseholdModels(List<HeadOfHouseholdModel> value) {
        HeadOfHouseholdModels = value;
    }

    private List<UnclearInformationModel> UnclearInformationModels = new ArrayList<>();

    public List<UnclearInformationModel> getUnclearInformationModels() {
        return UnclearInformationModels;
    }

    public void setUnclearInformationModels(List<UnclearInformationModel> value) {
        UnclearInformationModels = value;
    }

    private List<StatusOfHouseholdCompositionAssociationModel> StatusOfHouseholdCompositionAssociationModel = new ArrayList<>();

    public List<StatusOfHouseholdCompositionAssociationModel> getStatusOfHouseholdCompositionAssociationModel() {
        return StatusOfHouseholdCompositionAssociationModel;
    }

    public void setStatusOfHouseholdCompositionAssociationModel(
            List<StatusOfHouseholdCompositionAssociationModel> value) {
        StatusOfHouseholdCompositionAssociationModel = value;
    }

    private List<StatusOfHouseholdCompositionSummaryModel> StatusOfHouseholdCompositionSummaryModel = new ArrayList<>();

    public List<StatusOfHouseholdCompositionSummaryModel> getStatusOfHouseholdCompositionSummaryModel() {
        return StatusOfHouseholdCompositionSummaryModel;
    }

    public void setStatusOfHouseholdCompositionSummaryModel(List<StatusOfHouseholdCompositionSummaryModel> value) {
        StatusOfHouseholdCompositionSummaryModel = value;
    }

    private List<IncomeEmploymentInformationModel> IncomeEmploymentInformationModels = new ArrayList<>();

    public List<IncomeEmploymentInformationModel> getIncomeEmploymentInformationModels() {
        return IncomeEmploymentInformationModels;
    }

    public void setIncomeEmploymentInformationModels(List<IncomeEmploymentInformationModel> value) {
        IncomeEmploymentInformationModels = value;
    }

    private List<IncomePayDetailModel> IncomePayDetailModels = new ArrayList<>();

    public List<IncomePayDetailModel> getIncomePayDetailModels() {
        return IncomePayDetailModels;
    }

    public void setIncomePayDetailModels(List<IncomePayDetailModel> value) {
        IncomePayDetailModels = value;
    }

    private List<IndividualBenefitExtensionModel> IndividualBenefitExtensionModels = new ArrayList<>();

    public List<IndividualBenefitExtensionModel> getIndividualBenefitExtensionModels() {
        return IndividualBenefitExtensionModels;
    }

    public void setIndividualBenefitExtensionModels(List<IndividualBenefitExtensionModel> value) {
        IndividualBenefitExtensionModels = value;
    }

    private List<DCDomesticViolenceModel> DCDomesticViolenceModelsList = new ArrayList<>();

    public List<DCDomesticViolenceModel> getDCDomesticViolenceModelsList() {
        return DCDomesticViolenceModelsList;
    }

    public void setDCDomesticViolenceModelsList(List<DCDomesticViolenceModel> value) {
        DCDomesticViolenceModelsList = value;
    }

    private List<IndividualBenefitMonthTrackingModel> IndividualBenefitMonthTrackingModels = new ArrayList<>();

    public List<IndividualBenefitMonthTrackingModel> getIndividualBenefitMonthTrackingModels() {
        return IndividualBenefitMonthTrackingModels;
    }

    public void setIndividualBenefitMonthTrackingModels(List<IndividualBenefitMonthTrackingModel> value) {
        IndividualBenefitMonthTrackingModels = value;
    }

    private List<IndividualFosterCareModel> IndividualFosterCareModels = new ArrayList<>();

    public List<IndividualFosterCareModel> getIndividualFosterCareModels() {
        return IndividualFosterCareModels;
    }

    public void setIndividualFosterCareModels(List<IndividualFosterCareModel> value) {
        IndividualFosterCareModels = value;
    }

    private List<IndividualIncarcerationModel> IndividualIncarcerationModels = new ArrayList<>();

    public List<IndividualIncarcerationModel> getIndividualIncarcerationModels() {
        return IndividualIncarcerationModels;
    }

    public void setIndividualIncarcerationModels(List<IndividualIncarcerationModel> value) {
        IndividualIncarcerationModels = value;
    }

    private List<IndividualLivingArrangementModel> IndividualLivingArrangementModels = new ArrayList<>();

    public List<IndividualLivingArrangementModel> getIndividualLivingArrangementModels() {
        return IndividualLivingArrangementModels;
    }

    public void setIndividualLivingArrangementModels(List<IndividualLivingArrangementModel> value) {
        IndividualLivingArrangementModels = value;
    }

    private List<LivingArrangementProviderTableModel> LivingArrangementProviderTableModels = new ArrayList<>();

    public List<LivingArrangementProviderTableModel> getLivingArrangementProviderTableModels() {
        return LivingArrangementProviderTableModels;
    }

    public void setLivingArrangementProviderTableModels(List<LivingArrangementProviderTableModel> value) {
        LivingArrangementProviderTableModels = value;
    }

    private List<MealArrangementModel> MealArrangementModels = new ArrayList<MealArrangementModel>();

    public List<MealArrangementModel> getMealArrangementModels() {
        return MealArrangementModels;
    }

    public void setMealArrangementModels(List<MealArrangementModel> value) {
        MealArrangementModels = value;
    }

    private List<MigrantSeasonalFarmWorkerModel> MigrantSeasonalFarmWorkerModels = new ArrayList<>();

    public List<MigrantSeasonalFarmWorkerModel> getMigrantSeasonalFarmWorkerModels() {
        return MigrantSeasonalFarmWorkerModels;
    }

    public void setMigrantSeasonalFarmWorkerModels(List<MigrantSeasonalFarmWorkerModel> value) {
        MigrantSeasonalFarmWorkerModels = value;
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

    private List<NewBornModel> NewBornModels = new ArrayList<>();

    public List<NewBornModel> getNewBornModels() {
        return NewBornModels;
    }

    public void setNewBornModels(List<NewBornModel> value) {
        NewBornModels = value;
    }

    private List<NoIncomeVerificationModel> NoIncomeVerificationModels = new ArrayList<>();

    public List<NoIncomeVerificationModel> getNoIncomeVerificationModels() {
        return NoIncomeVerificationModels;
    }

    public void setNoIncomeVerificationModels(List<NoIncomeVerificationModel> value) {
        NoIncomeVerificationModels = value;
    }

    private List<NoResourceVerificationModel> NoResourceVerificationModels = new ArrayList<>();

    public List<NoResourceVerificationModel> getNoResourceVerificationModels() {
        return NoResourceVerificationModels;
    }

    public void setNoResourceVerificationModels(List<NoResourceVerificationModel> value) {
        NoResourceVerificationModels = value;
    }

    private List<NonEsiMecResponseModel> NonEsiMecResponseModels = new ArrayList<>();

    public List<NonEsiMecResponseModel> getNonEsiMecResponseModels() {
        return NonEsiMecResponseModels;
    }

    public void setNonEsiMecResponseModels(List<NonEsiMecResponseModel> value) {
        NonEsiMecResponseModels = value;
    }

    private List<DCThirdPartyLiabilityModel> DCThirdPartyLiabilityModels = new ArrayList<>();

    public List<DCThirdPartyLiabilityModel> getDCThirdPartyLiabilityModels() {
        return DCThirdPartyLiabilityModels;
    }

    public void setDCThirdPartyLiabilityModels(List<DCThirdPartyLiabilityModel> value) {
        DCThirdPartyLiabilityModels = value;
    }

    private List<OtherEarnedIncomeBudgetModel> OtherEarnedIncomeBudgetModels = new ArrayList<>();

    public List<OtherEarnedIncomeBudgetModel> getOtherEarnedIncomeBudgetModels() {
        return OtherEarnedIncomeBudgetModels;
    }

    public void setOtherEarnedIncomeBudgetModels(List<OtherEarnedIncomeBudgetModel> value) {
        OtherEarnedIncomeBudgetModels = value;
    }

    private List<OtherEarnedIncomeDetailModel> OtherEarnedIncomeDetailModels = new ArrayList<>();

    public List<OtherEarnedIncomeDetailModel> getOtherEarnedIncomeDetailModels() {
        return OtherEarnedIncomeDetailModels;
    }

    public void setOtherEarnedIncomeDetailModels(List<OtherEarnedIncomeDetailModel> value) {
        OtherEarnedIncomeDetailModels = value;
    }

    private List<OtherEarnedIncomePayAssociationModel> OtherEarnedIncomePayAssociationModels = new ArrayList<>();

    public List<OtherEarnedIncomePayAssociationModel> getOtherEarnedIncomePayAssociationModels() {
        return OtherEarnedIncomePayAssociationModels;
    }

    public void setOtherEarnedIncomePayAssociationModels(List<OtherEarnedIncomePayAssociationModel> value) {
        OtherEarnedIncomePayAssociationModels = value;
    }

    private List<OutOfStateBenefitModel> OutOfStateBenefitModels = new ArrayList<>();

    public List<OutOfStateBenefitModel> getOutOfStateBenefitModels() {
        return OutOfStateBenefitModels;
    }

    public void setOutOfStateBenefitModels(List<OutOfStateBenefitModel> value) {
        OutOfStateBenefitModels = value;
    }

    private List<DCWorkRegistrationModel> DCWorkRegistrationModels = new ArrayList<>();

    public List<DCWorkRegistrationModel> getDCWorkRegistrationModels() {
        return DCWorkRegistrationModels;
    }

    public void setDCWorkRegistrationModels(List<DCWorkRegistrationModel> value) {
        DCWorkRegistrationModels = value;
    }

    private List<EducationModel> EducationModels = new ArrayList<>();

    public List<EducationModel> getEducationModels() {
        return EducationModels;
    }

    public void setEducationModels(List<EducationModel> value) {
        EducationModels = value;
    }

    private List<EducationEnrollmentModel> EducationEnrollmentModels = new ArrayList<>();

    public List<EducationEnrollmentModel> getEducationEnrollmentModels() {
        return EducationEnrollmentModels;
    }

    public void setEducationEnrollmentModels(List<EducationEnrollmentModel> value) {
        EducationEnrollmentModels = value;
    }

    private List<EmancipationModel> EmancipationModels = new ArrayList<>();

    public List<EmancipationModel> getEmancipationModels() {
        return EmancipationModels;
    }

    public void setEmancipationModels(List<EmancipationModel> value) {
        EmancipationModels = value;
    }

    private List<ESICoverageDetailModel> ESICoverageDetailModels = new ArrayList<>();

    public List<ESICoverageDetailModel> getESICoverageDetailModels() {
        return ESICoverageDetailModels;
    }

    public void setESICoverageDetailModels(List<ESICoverageDetailModel> value) {
        ESICoverageDetailModels = value;
    }

    private List<HealthInsuranceCoveredIndividualsDetailModel> HealthInsuranceCoveredIndividualsDetailModels = new ArrayList<>();

    public List<HealthInsuranceCoveredIndividualsDetailModel> getHealthInsuranceCoveredIndividualsDetailModels() {
        return HealthInsuranceCoveredIndividualsDetailModels;
    }

    public void setHealthInsuranceCoveredIndividualsDetailModels(
            List<HealthInsuranceCoveredIndividualsDetailModel> value) {
        HealthInsuranceCoveredIndividualsDetailModels = value;
    }

    private List<HealthInsuranceFacilityTypeModel> HealthInsuranceFacilityTypeModels = new ArrayList<>();

    public List<HealthInsuranceFacilityTypeModel> getHealthInsuranceFacilityTypeModels() {
        return HealthInsuranceFacilityTypeModels;
    }

    public void setHealthInsuranceFacilityTypeModels(List<HealthInsuranceFacilityTypeModel> value) {
        HealthInsuranceFacilityTypeModels = value;
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


    private List<IncapacityModel> IncapacityModels = new ArrayList<>();

    public List<IncapacityModel> getIncapacityModels() {
        return IncapacityModels;
    }

    public void setIncapacityModels(List<IncapacityModel> value) {
        IncapacityModels = value;
    }

    private List<OverpaymentModel> OverpaymentModels = new ArrayList<>();

    public List<OverpaymentModel> getOverpaymentModels() {
        return OverpaymentModels;
    }

    public void setOverpaymentModels(List<OverpaymentModel> value) {
        OverpaymentModels = value;
    }

    private List<PayPeriodInformationModel> PayPeriodInformationModels = new ArrayList<>();

    public List<PayPeriodInformationModel> getPayPeriodInformationModels() {
        return PayPeriodInformationModels;
    }

    public void setPayPeriodInformationModels(List<PayPeriodInformationModel> value) {
        PayPeriodInformationModels = value;
    }

    private List<PregnancyModel> PregnancyModels = new ArrayList<>();

    public List<PregnancyModel> getPregnancyModels() {
        return PregnancyModels;
    }

    public void setPregnancyModels(List<PregnancyModel> value) {
        PregnancyModels = value;
    }

    private List<QualifiedIncomeTrustModel> QualifiedIncomeTrustModels = new ArrayList<>();

    public List<QualifiedIncomeTrustModel> getQualifiedIncomeTrustModels() {
        return QualifiedIncomeTrustModels;
    }

    public void setQualifiedIncomeTrustModels(List<QualifiedIncomeTrustModel> value) {
        QualifiedIncomeTrustModels = value;
    }

    private List<RelationshipModel> RelationshipModels = new ArrayList<>();

    public List<RelationshipModel> getRelationshipModels() {
        return RelationshipModels;
    }

    public void setRelationshipModels(List<RelationshipModel> value) {
        RelationshipModels = value;
    }

    private List<ResourceModel> ResourceModels = new ArrayList<>();

    public List<ResourceModel> getResourceModels() {
        return ResourceModels;
    }

    public void setResourceModels(List<ResourceModel> value) {
        ResourceModels = value;
    }

    private List<ResourceDetailModel> ResourceDetailModels = new ArrayList<>();

    public List<ResourceDetailModel> getResourceDetailModels() {
        return ResourceDetailModels;
    }

    public void setResourceDetailModels(List<ResourceDetailModel> value) {
        ResourceDetailModels = value;
    }

    private List<SelfEmploymentDetailPayAssociationModel> SelfEmploymentDetailPayAssociationModels = new ArrayList<>();

    public List<SelfEmploymentDetailPayAssociationModel> getSelfEmploymentDetailPayAssociationModels() {
        return SelfEmploymentDetailPayAssociationModels;
    }

    public void setSelfEmploymentDetailPayAssociationModels(List<SelfEmploymentDetailPayAssociationModel> value) {
        SelfEmploymentDetailPayAssociationModels = value;
    }

    private List<SelfEmploymentJointOwnersBudgetModel> SelfEmploymentJointOwnersBudgetModels = new ArrayList<>();

    public List<SelfEmploymentJointOwnersBudgetModel> getSelfEmploymentJointOwnersBudgetModels() {
        return SelfEmploymentJointOwnersBudgetModels;
    }

    public void setSelfEmploymentJointOwnersBudgetModels(List<SelfEmploymentJointOwnersBudgetModel> value) {
        SelfEmploymentJointOwnersBudgetModels = value;
    }

    private List<SelfEmploymentIncomeDetailModel> SelfEmploymentIncomeDetailModels = new ArrayList<>();

    public List<SelfEmploymentIncomeDetailModel> getSelfEmploymentIncomeDetailModels() {
        return SelfEmploymentIncomeDetailModels;
    }

    public void setSelfEmploymentIncomeDetailModels(List<SelfEmploymentIncomeDetailModel> value) {
        SelfEmploymentIncomeDetailModels = value;
    }

    private List<SelfEmploymentPayExpenseModel> SelfEmploymentPayExpenseModels = new ArrayList<>();

    public List<SelfEmploymentPayExpenseModel> getSelfEmploymentPayExpenseModels() {
        return SelfEmploymentPayExpenseModels;
    }

    public void setSelfEmploymentPayExpenseModels(List<SelfEmploymentPayExpenseModel> value) {
        SelfEmploymentPayExpenseModels = value;
    }

    private List<ShortTermExpenseModel> ShortTermExpenseModels = new ArrayList<>();

    public List<ShortTermExpenseModel> getShortTermExpenseModels() {
        return ShortTermExpenseModels;
    }

    public void setShortTermExpenseModels(List<ShortTermExpenseModel> value) {
        ShortTermExpenseModels = value;
    }

    private List<ExpenseModel> ExpenseModels = new ArrayList<>();

    public List<ExpenseModel> getExpenseModels() {
        return ExpenseModels;
    }

    public void setExpenseModels(List<ExpenseModel> value) {
        ExpenseModels = value;
    }

    private List<ExpenseAmountModel> ExpenseAmountModels = new ArrayList<>();

    public List<ExpenseAmountModel> getExpenseAmountModels() {
        return ExpenseAmountModels;
    }

    public void setExpenseAmountModels(List<ExpenseAmountModel> value) {
        ExpenseAmountModels = value;
    }

    private List<ExpenseModel> MedicalExpenseAllModels = new ArrayList<>();

    public List<ExpenseModel> getMedicalExpenseAllModels() {
        return MedicalExpenseAllModels;
    }

    public void setMedicalExpenseAllModels(List<ExpenseModel> value) {
        MedicalExpenseAllModels = value;
    }

    private List<ExpenseAmountModel> MedicalExpenseAmountModels = new ArrayList<>();

    public List<ExpenseAmountModel> getMedicalExpenseAmountModels() {
        return MedicalExpenseAmountModels;
    }

    public void setMedicalExpenseAmountModels(List<ExpenseAmountModel> value) {
        MedicalExpenseAmountModels = value;
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

    private List<StatusofIndividualHouseholdModel> StatusofIndividualHouseholdModels = new ArrayList<>();

    public List<StatusofIndividualHouseholdModel> getStatusofIndividualHouseholdModels() {
        return StatusofIndividualHouseholdModels;
    }

    public void setStatusofIndividualHouseholdModels(List<StatusofIndividualHouseholdModel> value) {
        StatusofIndividualHouseholdModels = value;
    }

    private List<StatusofTaxFilingModel> StatusofTaxFilingModels = new ArrayList<>();

    public List<StatusofTaxFilingModel> getStatusofTaxFilingModels() {
        return StatusofTaxFilingModels;
    }

    public void setStatusofTaxFilingModels(List<StatusofTaxFilingModel> value) {
        StatusofTaxFilingModels = value;
    }

    private List<TransferredResourceModel> TransferredResourceModels = new ArrayList<>();

    public List<TransferredResourceModel> getTransferredResourceModels() {
        return TransferredResourceModels;
    }

    public void setTransferredResourceModels(List<TransferredResourceModel> value) {
        TransferredResourceModels = value;
    }

    private List<TransferredResourceModel> TransferredResourceModelsForSNAP = new ArrayList<>();

    public List<TransferredResourceModel> getTransferredResourceModelsForSNAP() {
        return TransferredResourceModelsForSNAP;
    }

    public void setTransferredResourceModelsForSNAP(List<TransferredResourceModel> value) {
        TransferredResourceModelsForSNAP = value;
    }

    private List<UnearnedIncomeBudgetModel> UnearnedIncomeBudgetModels = new ArrayList<>();

    public List<UnearnedIncomeBudgetModel> getUnearnedIncomeBudgetModels() {
        return UnearnedIncomeBudgetModels;
    }

    public void setUnearnedIncomeBudgetModels(List<UnearnedIncomeBudgetModel> value) {
        UnearnedIncomeBudgetModels = value;
    }

    private List<UnearnedIncomeDetailModel> UnearnedIncomeDetailModels = new ArrayList<>();

    public List<UnearnedIncomeDetailModel> getUnearnedIncomeDetailModels() {
        return UnearnedIncomeDetailModels;
    }

    public void setUnearnedIncomeDetailModels(List<UnearnedIncomeDetailModel> value) {
        UnearnedIncomeDetailModels = value;
    }

    private List<UnearnedIncomePayAssociationModel> UnearnedIncomePayAssociationModels = new ArrayList<>();

    public List<UnearnedIncomePayAssociationModel> getUnearnedIncomePayAssociationModels() {
        return UnearnedIncomePayAssociationModels;
    }

    public void setUnearnedIncomePayAssociationModels(List<UnearnedIncomePayAssociationModel> value) {
        UnearnedIncomePayAssociationModels = value;
    }

    private List<UnearnedIncomeChildSupportIndividualModel> UnearnedIncomeChildSupportIndividualModels = new ArrayList<>();

    public List<UnearnedIncomeChildSupportIndividualModel> getUnearnedIncomeChildSupportIndividualModels() {
        return UnearnedIncomeChildSupportIndividualModels;
    }

    public void setUnearnedIncomeChildSupportIndividualModels(List<UnearnedIncomeChildSupportIndividualModel> value) {
        UnearnedIncomeChildSupportIndividualModels = value;
    }

    private List<UnoccupiedShelterModel> UnoccupiedShelterModels = new ArrayList<>();

    public List<UnoccupiedShelterModel> getUnoccupiedShelterModels() {
        return UnoccupiedShelterModels;
    }

    public void setUnoccupiedShelterModels(List<UnoccupiedShelterModel> value) {
        UnoccupiedShelterModels = value;
    }

    private List<VerifyCurrentIncomeModel> VerifyCurrentIncomeModels = new ArrayList<>();

    public List<VerifyCurrentIncomeModel> getVerifyCurrentIncomeModels() {
        return VerifyCurrentIncomeModels;
    }

    public void setVerifyCurrentIncomeModels(List<VerifyCurrentIncomeModel> value) {
        VerifyCurrentIncomeModels = value;
    }

    private List<ConversionIndividualInformationModel> ConversionIndividualInformationModels = new ArrayList<>();

    public List<ConversionIndividualInformationModel> getConversionIndividualInformationModels() {
        return ConversionIndividualInformationModels;
    }

    public void setConversionIndividualInformationModels(List<ConversionIndividualInformationModel> value) {
        ConversionIndividualInformationModels = value;
    }

    private List<ConversionCrossReferenceModel> ConversionCrossReferenceModels = new ArrayList<>();

    public List<ConversionCrossReferenceModel> getConversionCrossReferenceModels() {
        return ConversionCrossReferenceModels;
    }

    public void setConversionCrossReferenceModels(List<ConversionCrossReferenceModel> value) {
        ConversionCrossReferenceModels = value;
    }

    private List<SDXModel> SDXModels = new ArrayList<>();

    public List<SDXModel> getSDXModels() {
        return SDXModels;
    }

    public void setSDXModels(List<SDXModel> value) {
        SDXModels = value;
    }

    private List<SDXEligibilityModel> SDXEligibilityModels = new ArrayList<>();

    public List<SDXEligibilityModel> getSDXEligibilityModels() {
        return SDXEligibilityModels;
    }

    public void setSDXEligibilityModels(List<SDXEligibilityModel> value) {
        SDXEligibilityModels = value;
    }

    private List<ComplianceModel> ComplianceModels = new ArrayList<>();

    public List<ComplianceModel> getComplianceModels() {
        return ComplianceModels;
    }

    public void setComplianceModels(List<ComplianceModel> value) {
        ComplianceModels = value;
    }

    private List<ComplianceModel> ComplianceModelsNew = new ArrayList<>();

    public List<ComplianceModel> getComplianceModelsNew() {
        return ComplianceModelsNew;
    }

    public void setComplianceModelsNew(List<ComplianceModel> value) {
        ComplianceModelsNew = value;
    }

    private List<ComplianceModel> ComplianceModelsWithoutMinMax = new ArrayList<>();

    public List<ComplianceModel> getComplianceModelsWithoutMinMax() {
        return ComplianceModelsWithoutMinMax;
    }

    public void setComplianceModelsWithoutMinMax(List<ComplianceModel> value) {
        ComplianceModelsWithoutMinMax = value;
    }

    private List<IPVDetailModel> IPVDetailModels = new ArrayList<>();

    public List<IPVDetailModel> getIPVDetailModels() {
        return IPVDetailModels;
    }

    public void setIPVDetailModels(List<IPVDetailModel> value) {
        IPVDetailModels = value;
    }

    private List<JointOwnersDetailModel> JointOwnersDetailModels = new ArrayList<>();

    public List<JointOwnersDetailModel> getJointOwnersDetailModels() {
        return JointOwnersDetailModels;
    }

    public void setJointOwnersDetailModels(List<JointOwnersDetailModel> value) {
        JointOwnersDetailModels = value;
    }

    private List<LocDeterminationModel> LocDeterminationModels = new ArrayList<>();

    public List<LocDeterminationModel> getLocDeterminationModels() {
        return LocDeterminationModels;
    }

    public void setLocDeterminationModels(List<LocDeterminationModel> value) {
        LocDeterminationModels = value;
    }

    private List<LocDeterminationModel> ParentLocDeterminationModel = new ArrayList<>();

    public List<LocDeterminationModel> getParentLocDeterminationModel() {
        return ParentLocDeterminationModel;
    }

    public void setParentLocDeterminationModel(List<LocDeterminationModel> value) {
        ParentLocDeterminationModel = value;
    }

    private List<DCRepresentativeModel> DCRepresentativeModels = new ArrayList<>();

    public List<DCRepresentativeModel> getDCRepresentativeModels() {
        return DCRepresentativeModels;
    }

    public void setDCRepresentativeModels(List<DCRepresentativeModel> value) {
        DCRepresentativeModels = value;
    }

    private List<DCRepresentativeCaseAssociationModel> DCRepresentativeCaseAssociationModels = new ArrayList<>();

    public List<DCRepresentativeCaseAssociationModel> getDCRepresentativeCaseAssociationModels() {
        return DCRepresentativeCaseAssociationModels;
    }

    public void setDCRepresentativeCaseAssociationModels(List<DCRepresentativeCaseAssociationModel> value) {
        DCRepresentativeCaseAssociationModels = value;
    }

    private List<MaritalStatusOfIndividualModel> MaritalStatusOfIndividualModels = new ArrayList<>();

    public List<MaritalStatusOfIndividualModel> getMaritalStatusOfIndividualModels() {
        return MaritalStatusOfIndividualModels;
    }

    public void setMaritalStatusOfIndividualModels(List<MaritalStatusOfIndividualModel> value) {
        MaritalStatusOfIndividualModels = value;
    }

    private List<SafeRentMortgageModel> SafeRentMortgageModels = new ArrayList<>();

    public List<SafeRentMortgageModel> getSafeRentMortgageModels() {
        return SafeRentMortgageModels;
    }

    public void setSafeRentMortgageModels(List<SafeRentMortgageModel> value) {
        SafeRentMortgageModels = value;
    }

    private List<SafeDenialModel> SafeDenialModels = new ArrayList<>();

    public List<SafeDenialModel> getSafeDenialModels() {
        return SafeDenialModels;
    }

    public void setSafeDenialModels(List<SafeDenialModel> value) {
        SafeDenialModels = value;
    }

    private List<StatusOfNonCustodialParentModel> StatusOfNonCustodialParentModels = new ArrayList<>();

    public List<StatusOfNonCustodialParentModel> getStatusOfNonCustodialParentModels() {
        return StatusOfNonCustodialParentModels;
    }

    public void setStatusOfNonCustodialParentModels(List<StatusOfNonCustodialParentModel> value) {
        StatusOfNonCustodialParentModels = value;
    }

    private List<NonCustodialParentRelationshipModel> NonCustodialParentRelationshipModels = new ArrayList<>();

    public List<NonCustodialParentRelationshipModel> getNonCustodialParentRelationshipModels() {
        return NonCustodialParentRelationshipModels;
    }

    public void setNonCustodialParentRelationshipModels(List<NonCustodialParentRelationshipModel> value) {
        NonCustodialParentRelationshipModels = value;
    }

    private List<LocPrivatePayDetailModel> LocPrivatePayDetailModels = new ArrayList<>();

    public List<LocPrivatePayDetailModel> getLocPrivatePayDetailModels() {
        return LocPrivatePayDetailModels;
    }

    public void setLocPrivatePayDetailModels(List<LocPrivatePayDetailModel> value) {
        LocPrivatePayDetailModels = value;
    }

    private List<QualifyingParentDeterminationModel> QualifyingParentDeterminationModels = new ArrayList<>();

    public List<QualifyingParentDeterminationModel> getQualifyingParentDeterminationModels() {
        return QualifyingParentDeterminationModels;
    }

    public void setQualifyingParentDeterminationModels(List<QualifyingParentDeterminationModel> value) {
        QualifyingParentDeterminationModels = value;
    }

    private List<JointCustodyModel> JointCustodyModels = new ArrayList<>();

    public List<JointCustodyModel> getJointCustodyModels() {
        return JointCustodyModels;
    }

    public void setJointCustodyModels(List<JointCustodyModel> value) {
        JointCustodyModels = value;
    }

    private List<DCEntitledBenefitModel> DCEntitledBenefitModels = new ArrayList<>();

    public List<DCEntitledBenefitModel> getDCEntitledBenefitModels() {
        return DCEntitledBenefitModels;
    }

    public void setDCEntitledBenefitModels(List<DCEntitledBenefitModel> value) {
        DCEntitledBenefitModels = value;
    }

    private List<OrganizationProviderMasterModel> OrganizationProviderMasterModels = new ArrayList<>();

    public List<OrganizationProviderMasterModel> getOrganizationProviderMasterModels() {
        return OrganizationProviderMasterModels;
    }

    public void setOrganizationProviderMasterModels(List<OrganizationProviderMasterModel> value) {
        OrganizationProviderMasterModels = value;
    }

    private List<ExemptionDetailModel> ExemptionDetailModels = new ArrayList<>();

    public List<ExemptionDetailModel> getExemptionDetailModels() {
        return ExemptionDetailModels;
    }

    public void setExemptionDetailModels(List<ExemptionDetailModel> value) {
        ExemptionDetailModels = value;
    }

    private List<EarnedIncomeStrikeDetailModel> EarnedIncomeStrikeDetailModels = new ArrayList<>();

    public List<EarnedIncomeStrikeDetailModel> getEarnedIncomeStrikeDetailModels() {
        return EarnedIncomeStrikeDetailModels;
    }

    public void setEarnedIncomeStrikeDetailModels(List<EarnedIncomeStrikeDetailModel> value) {
        EarnedIncomeStrikeDetailModels = value;
    }

    private List<LTCCoupleModel> LTCCoupleModels = new ArrayList<>();

    public List<LTCCoupleModel> getLTCCoupleModels() {
        return LTCCoupleModels;
    }

    public void setLTCCoupleModels(List<LTCCoupleModel> value) {
        LTCCoupleModels = value;
    }

    private List<EmploymentDetailModel> LossOfEmployementDetailModels = new ArrayList<>();

    public List<EmploymentDetailModel> getLossOfEmployementDetailModels() {
        return LossOfEmployementDetailModels;
    }

    public void setLossOfEmployementDetailModels(List<EmploymentDetailModel> value) {
        LossOfEmployementDetailModels = value;
    }

    private List<WINInfoModel> WinInfoModels = new ArrayList<>();

    public List<WINInfoModel> getWinInfoModels() {
        return WinInfoModels;
    }

    public void setWinInfoModels(List<WINInfoModel> value) {
        WinInfoModels = value;
    }

    private List<LivingArrangementHospitalizationModel> LivingArrangementHospitalizationModels = new ArrayList<>();

    public List<LivingArrangementHospitalizationModel> getLivingArrangementHospitalizationModels() {
        return LivingArrangementHospitalizationModels;
    }

    public void setLivingArrangementHospitalizationModels(List<LivingArrangementHospitalizationModel> value) {
        LivingArrangementHospitalizationModels = value;
    }

    private List<LTCResourceTransferConsentModel> LTCResourceTransferConsentModels = new ArrayList<>();

    public List<LTCResourceTransferConsentModel> getLTCResourceTransferConsentModels() {
        return LTCResourceTransferConsentModels;
    }

    public void setLTCResourceTransferConsentModels(List<LTCResourceTransferConsentModel> value) {
        LTCResourceTransferConsentModels = value;
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

    private List<KTAPIneligibilityModel> KTAPIneligibilityModels = new ArrayList<>();

    public List<KTAPIneligibilityModel> getKTAPIneligibilityModels() {
        return KTAPIneligibilityModels;
    }

    public void setKTAPIneligibilityModels(List<KTAPIneligibilityModel> value) {
        KTAPIneligibilityModels = value;
    }

    private List<SuspensionRecordModel> SuspensionRecordModels = new ArrayList<>();

    public List<SuspensionRecordModel> getSuspensionRecordModels() {
        return SuspensionRecordModels;
    }

    public void setSuspensionRecordModels(List<SuspensionRecordModel> value) {
        SuspensionRecordModels = value;
    }

    private List<IndividualCEEligibleStatus> IndividualCEEligibleStatusModels = new ArrayList<>();

    public List<IndividualCEEligibleStatus> getIndividualCEEligibleStatusModels() {
        return IndividualCEEligibleStatusModels;
    }

    public void setIndividualCEEligibleStatusModels(List<IndividualCEEligibleStatus> value) {
        IndividualCEEligibleStatusModels = value;
    }

    private List<PPAuthorizationModel> PPAuthorizationModels = new ArrayList<>();

    public List<PPAuthorizationModel> getPPAuthorizationModels() {
        return PPAuthorizationModels;
    }

    public void setPPAuthorizationModels(List<PPAuthorizationModel> value) {
        PPAuthorizationModels = value;
    }

    private List<PPAuthorizationIndividualModel> PPAuthorizationIndividualModels = new ArrayList<>();

    public List<PPAuthorizationIndividualModel> getPPAuthorizationIndividualModels() {
        return PPAuthorizationIndividualModels;
    }

    public void setPPAuthorizationIndividualModels(List<PPAuthorizationIndividualModel> value) {
        PPAuthorizationIndividualModels = value;
    }

    private List<com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EDBCLastVerifiedFinancialDetail> EDBCLastVerifiedFinancialDetails = new ArrayList<>();

    public List<com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EDBCLastVerifiedFinancialDetail> getEDBCLastVerifiedFinancialDetails() {
        return EDBCLastVerifiedFinancialDetails;
    }

    public void setEDBCLastVerifiedFinancialDetails(
            List<com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EDBCLastVerifiedFinancialDetail> value) {
        EDBCLastVerifiedFinancialDetails = value;
    }

    private List<PPIncomeBudgetModel> PPIncomeBudgetModels = new ArrayList<>();

    public List<PPIncomeBudgetModel> getPPIncomeBudgetModels() {
        return PPIncomeBudgetModels;
    }

    public void setPPIncomeBudgetModels(List<PPIncomeBudgetModel> value) {
        PPIncomeBudgetModels = value;
    }

    private List<TaskModel> TaskModels = new ArrayList<>();

    public List<TaskModel> getTaskModels() {
        return TaskModels;
    }

    public void setTaskModels(List<TaskModel> value) {
        TaskModels = value;
    }

    private List<DCRepresentativePermissionLevelAssociationModel> DCRepresentativePermissionLevelAssociationModels = new ArrayList<>();

    public List<DCRepresentativePermissionLevelAssociationModel> getDCRepresentativePermissionLevelAssociationModels() {
        return DCRepresentativePermissionLevelAssociationModels;
    }

    public void setDCRepresentativePermissionLevelAssociationModels(
            List<DCRepresentativePermissionLevelAssociationModel> value) {
        DCRepresentativePermissionLevelAssociationModels = value;
    }

    private List<UnearnedIncomeDetailModel> TerminatedUnearnedIncomeDetailModels = new ArrayList<>();

    public List<UnearnedIncomeDetailModel> getTerminatedUnearnedIncomeDetailModels() {
        return TerminatedUnearnedIncomeDetailModels;
    }

    public void setTerminatedUnearnedIncomeDetailModels(List<UnearnedIncomeDetailModel> value) {
        TerminatedUnearnedIncomeDetailModels = value;
    }

    private List<SelfEmploymentIncomeDetailModel> TerminatedSelfEmploymentIncomeDetailModels = new ArrayList<>();

    public List<SelfEmploymentIncomeDetailModel> getTerminatedSelfEmploymentIncomeDetailModels() {
        return TerminatedSelfEmploymentIncomeDetailModels;
    }

    public void setTerminatedSelfEmploymentIncomeDetailModels(List<SelfEmploymentIncomeDetailModel> value) {
        TerminatedSelfEmploymentIncomeDetailModels = value;
    }

    private List<SelfEmploymentIncomeDetailModel> TerminatedAfterLastDispositionSelfIncomeDetailModels = new ArrayList<>();

    public List<SelfEmploymentIncomeDetailModel> getTerminatedAfterLastDispositionSelfIncomeDetailModels() {
        return TerminatedAfterLastDispositionSelfIncomeDetailModels;
    }

    public void setTerminatedAfterLastDispositionSelfIncomeDetailModels(List<SelfEmploymentIncomeDetailModel> value) {
        TerminatedAfterLastDispositionSelfIncomeDetailModels = value;
    }

    private List<UnearnedIncomeDetailModel> TerminatedAfterLastDispositionUnearnedIncomeDetailModels = new ArrayList<>();

    public List<UnearnedIncomeDetailModel> getTerminatedAfterLastDispositionUnearnedIncomeDetailModels() {
        return TerminatedAfterLastDispositionUnearnedIncomeDetailModels;
    }

    public void setTerminatedAfterLastDispositionUnearnedIncomeDetailModels(List<UnearnedIncomeDetailModel> value) {
        TerminatedAfterLastDispositionUnearnedIncomeDetailModels = value;
    }

    private List<SNAPDemoInboundModel> SNAPDemoInboundModels = new ArrayList<>();

    public List<SNAPDemoInboundModel> getSNAPDemoInboundModels() {
        return SNAPDemoInboundModels;
    }

    public void setSNAPDemoInboundModels(List<SNAPDemoInboundModel> value) {
        SNAPDemoInboundModels = value;
    }

    private List<ETPAbawdEffectiveDateModel> ETPAbawdEffectiveDateModels = new ArrayList<>();

    public List<ETPAbawdEffectiveDateModel> getETPAbawdEffectiveDateModels() {
        return ETPAbawdEffectiveDateModels;
    }

    public void setETPAbawdEffectiveDateModels(List<ETPAbawdEffectiveDateModel> value) {
        ETPAbawdEffectiveDateModels = value;
    }

    private List<ETPAbawdCountyMappingModel> ETPAbawdCountyMappingModels = new ArrayList<>();

    public List<ETPAbawdCountyMappingModel> getETPAbawdCountyMappingModels() {
        return ETPAbawdCountyMappingModels;
    }

    public void setETPAbawdCountyMappingModels(List<ETPAbawdCountyMappingModel> value) {
        ETPAbawdCountyMappingModels = value;
    }

    private List<ETPCureModel> ETPCureModels = new ArrayList<>();

    public List<ETPCureModel> getETPCureModels() {
        return ETPCureModels;
    }

    public void setETPCureModels(List<ETPCureModel> value) {
        ETPCureModels = value;
    }

    private List<IncreaseCommunitySpouseIncomeModel> IncreaseCommunitySpouseIncomeModels = new ArrayList<>();

    public List<IncreaseCommunitySpouseIncomeModel> getIncreaseCommunitySpouseIncomeModels() {
        return IncreaseCommunitySpouseIncomeModels;
    }

    public void setIncreaseCommunitySpouseIncomeModels(List<IncreaseCommunitySpouseIncomeModel> value) {
        IncreaseCommunitySpouseIncomeModels = value;
    }

    private List<EnrollmentDetailModel> EnrollmentDetailModels = new ArrayList<>();

    public List<EnrollmentDetailModel> getEnrollmentDetailModels() {
        return EnrollmentDetailModels;
    }

    public void setEnrollmentDetailModels(List<EnrollmentDetailModel> value) {
        EnrollmentDetailModels = value;
    }

    private List<StatusOfEnrollmentModel> StatusOfEnrollmentModels = new ArrayList<>();

    public List<StatusOfEnrollmentModel> getStatusOfEnrollmentModels() {
        return StatusOfEnrollmentModels;
    }

    public void setStatusOfEnrollmentModels(List<StatusOfEnrollmentModel> value) {
        StatusOfEnrollmentModels = value;
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

    private List<ETPAssessmentInformationModel> ETPAssessmentInformationModels = new ArrayList<>();

    public List<ETPAssessmentInformationModel> getETPAssessmentInformationModels() {
        return ETPAssessmentInformationModels;
    }

    public void setETPAssessmentInformationModels(List<ETPAssessmentInformationModel> value) {
        ETPAssessmentInformationModels = value;
    }

    private List<P2PGroupAssignmentModel> P2PGroupAssignmentModels = new ArrayList<>();

    public List<P2PGroupAssignmentModel> getP2PGroupAssignmentModels() {
        return P2PGroupAssignmentModels;
    }

    public void setP2PGroupAssignmentModels(List<P2PGroupAssignmentModel> value) {
        P2PGroupAssignmentModels = value;
    }

    private List<ApplicationModel> ApplicationModels = new ArrayList<>();

    public List<ApplicationModel> getApplicationModels() {
        return ApplicationModels;
    }

    public void setApplicationModels(List<ApplicationModel> value) {
        ApplicationModels = value;
    }

    private List<CaseProgramModel> AllCaseProgramModels = new ArrayList<>();

    public List<CaseProgramModel> getAllCaseProgramModels() {
        return AllCaseProgramModels;
    }

    public void setAllCaseProgramModels(List<CaseProgramModel> value) {
        AllCaseProgramModels = value;
    }

    private List<TMAIncomeReportingModel> TMAIncomeReportingModels = new ArrayList<>();

    public List<TMAIncomeReportingModel> getTMAIncomeReportingModels() {
        return TMAIncomeReportingModels;
    }

    public void setTMAIncomeReportingModels(List<TMAIncomeReportingModel> value) {
        TMAIncomeReportingModels = value;
    }

    private List<TMAEmploymentEndDetailModel> TMAEmploymentEndDetailModels = new ArrayList<>();

    public List<TMAEmploymentEndDetailModel> getTMAEmploymentEndDetailModels() {
        return TMAEmploymentEndDetailModels;
    }

    public void setTMAEmploymentEndDetailModels(List<TMAEmploymentEndDetailModel> value) {
        TMAEmploymentEndDetailModels = value;
    }

    private List<HBEHIndividualControlGroupModel> HBEHIndividualControlGroupModels = new ArrayList<>();

    public List<HBEHIndividualControlGroupModel> getHBEHIndividualControlGroupModels() {
        return HBEHIndividualControlGroupModels;
    }

    public void setHBEHIndividualControlGroupModels(List<HBEHIndividualControlGroupModel> value) {
        HBEHIndividualControlGroupModels = value;
    }

    private List<IPVDetailModel> IPVDetailModelsNew = new ArrayList<>();

    public List<IPVDetailModel> getIPVDetailModelsNew() {
        return IPVDetailModelsNew;
    }

    public void setIPVDetailModelsNew(List<IPVDetailModel> value) {
        IPVDetailModelsNew = value;
    }

    private List<IPVDetailModel> IPVDetailModelsWithoutMinMax = new ArrayList<>();

    public List<IPVDetailModel> getIPVDetailModelsWithoutMinMax() {
        return IPVDetailModelsWithoutMinMax;
    }

    public void setIPVDetailModelsWithoutMinMax(List<IPVDetailModel> value) {
        IPVDetailModelsWithoutMinMax = value;
    }

    private List<IndividualLivingArrangementModel> IndividualLivingArrangemenApprissModels = new ArrayList<>();

    public List<IndividualLivingArrangementModel> getIndividualLivingArrangemenApprissModels() {
        return IndividualLivingArrangemenApprissModels;
    }

    public void setIndividualLivingArrangemenApprissModels(List<IndividualLivingArrangementModel> value) {
        IndividualLivingArrangemenApprissModels = value;
    }

    private List<LivingArrangementProviderTableModel> livingArrangementProviderTableApprissModels = new ArrayList<>();

    public List<LivingArrangementProviderTableModel> getlivingArrangementProviderTableApprissModels() {
        return livingArrangementProviderTableApprissModels;
    }

    public void setlivingArrangementProviderTableApprissModels(List<LivingArrangementProviderTableModel> value) {
        livingArrangementProviderTableApprissModels = value;
    }

    private List<VerificationConfigurationModel> verificationConfigurationModels = new ArrayList<>();

    public List<VerificationConfigurationModel> getVerificationConfigurationModels() {
        return verificationConfigurationModels;
    }

    public void setVerificationConfigurationModels(List<VerificationConfigurationModel> verificationConfigurationModels) {
        this.verificationConfigurationModels = verificationConfigurationModels;
    }
}
