package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.programdatastores.EligibilityMedicaidDataStore;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.programdatastores.EligibilityNMAGIDataStore;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.programdatastores.InterfaceDataStore;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCCaseIndividualRFISummaryModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDProgramCategoryModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDRFICatalogueModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDTimelyUntimelyRuleModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EdgNumberAllotmentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualHubVerificationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualTMADetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilitySuppressInvalidRFIModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityVerificationChecklistDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityVerificationChecklistModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.FailedFederalInterfaceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.InterfaceTechnicalFailureModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VCLReferenceAllotmentModel;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class CaseDataStore {
    public CaseDataStore() {
        setDataCollectionDataStore(new DataCollectionDataStore());
        setMCIBenefitsDataStore(new MCIBenefitsDataStore());
        setReferenceDataStore(new ReferenceDataStore());
    }

    private DataCollectionDataStore DataCollectionDataStore;

    public DataCollectionDataStore getDataCollectionDataStore() {
        return DataCollectionDataStore;
    }

    public void setDataCollectionDataStore(DataCollectionDataStore value) {
        DataCollectionDataStore = value;
    }

    private MCIBenefitsDataStore MCIBenefitsDataStore;

    public MCIBenefitsDataStore getMCIBenefitsDataStore() {
        return MCIBenefitsDataStore;
    }

    public void setMCIBenefitsDataStore(MCIBenefitsDataStore value) {
        MCIBenefitsDataStore = value;
    }

    public ReferenceDataStore ReferenceDataStore;

    public ReferenceDataStore getReferenceDataStore() {
        return ReferenceDataStore;
    }

    public void setReferenceDataStore(ReferenceDataStore value) {
        ReferenceDataStore = value;
    }

    private EligibilityDataStore[] EligibilityDataStores;

    public EligibilityDataStore[] getEligibilityDataStores() {
        return EligibilityDataStores;
    }

    public void setEligibilityDataStores(EligibilityDataStore[] value) {
        EligibilityDataStores = value;
    }

    private EligibilityNMAGIDataStore[] EligibilityNMAGIDataStores;

    public EligibilityNMAGIDataStore[] getEligibilityNMAGIDataStores() {
        return EligibilityNMAGIDataStores;
    }

    public void setEligibilityNMAGIDataStores(EligibilityNMAGIDataStore[] value) {
        EligibilityNMAGIDataStores = value;
    }

    private List<EDBCCaseIndividualRFISummaryModel> EDBCCaseIndividualRFISummaryModels = new ArrayList<>();

    public List<EDBCCaseIndividualRFISummaryModel> getEDBCCaseIndividualRFISummaryModels() {
        return EDBCCaseIndividualRFISummaryModels;
    }

    public void setEDBCCaseIndividualRFISummaryModels(List<EDBCCaseIndividualRFISummaryModel> value) {
        EDBCCaseIndividualRFISummaryModels = value;
    }

    private List<EDRFICatalogueModel> VerificationDetailModels = new ArrayList<>();

    public List<EDRFICatalogueModel> getVerificationDetailModels() {
        return VerificationDetailModels;
    }

    public void setVerificationDetailModels(List<EDRFICatalogueModel> value) {
        VerificationDetailModels = value;
    }

    private List<EDProgramCategoryModel> EDProgramCategoryModels = new ArrayList<>();

    public List<EDProgramCategoryModel> getEDProgramCategoryModels() {
        return EDProgramCategoryModels;
    }

    public void setEDProgramCategoryModels(List<EDProgramCategoryModel> value) {
        EDProgramCategoryModels = value;
    }

    private List<EDTimelyUntimelyRuleModel> EDTimelyUntimelyRuleModels = new ArrayList<>();

    public List<EDTimelyUntimelyRuleModel> getEDTimelyUntimelyRuleModels() {
        return EDTimelyUntimelyRuleModels;
    }

    public void setEDTimelyUntimelyRuleModels(List<EDTimelyUntimelyRuleModel> value) {
        EDTimelyUntimelyRuleModels = value;
    }

    private List<EligibilityVerificationChecklistModel> EligibilityVerificationChecklistModels = new ArrayList<>();

    public List<EligibilityVerificationChecklistModel> getEligibilityVerificationChecklistModels() {
        return EligibilityVerificationChecklistModels;
    }

    public void setEligibilityVerificationChecklistModels(List<EligibilityVerificationChecklistModel> value) {
        EligibilityVerificationChecklistModels = value;
    }

    private List<EligibilityVerificationChecklistModel> EligibilityVerificationChecklistAllModels = new ArrayList<>();

    public List<EligibilityVerificationChecklistModel> getEligibilityVerificationChecklistAllModels() {
        return EligibilityVerificationChecklistAllModels;
    }

    public void setEligibilityVerificationChecklistAllModels(List<EligibilityVerificationChecklistModel> value) {
        EligibilityVerificationChecklistAllModels = value;
    }

    private List<EligibilityVerificationChecklistModel> EligibilityVerificationChecklistValidVCLModels = new ArrayList<>();

    public List<EligibilityVerificationChecklistModel> getEligibilityVerificationChecklistValidVCLModels() {
        return EligibilityVerificationChecklistValidVCLModels;
    }

    public void setEligibilityVerificationChecklistValidVCLModels(List<EligibilityVerificationChecklistModel> value) {
        EligibilityVerificationChecklistValidVCLModels = value;
    }

    private List<EligibilityVerificationChecklistModel> EligibilityVerificationIsDeletedVCLModels = new ArrayList<>();

    public List<EligibilityVerificationChecklistModel> getEligibilityVerificationIsDeletedVCLModels() {
        return EligibilityVerificationIsDeletedVCLModels;
    }

    public void setEligibilityVerificationIsDeletedVCLModels(List<EligibilityVerificationChecklistModel> value) {
        EligibilityVerificationIsDeletedVCLModels = value;
    }

    private List<EligibilitySuppressInvalidRFIModel> EligibilitySuppressInvalidRFIModel = new ArrayList<>();

    public List<EligibilitySuppressInvalidRFIModel> getEligibilitySuppressInvalidRFIModel() {
        return EligibilitySuppressInvalidRFIModel;
    }

    public void setEligibilitySuppressInvalidRFIModel(List<EligibilitySuppressInvalidRFIModel> value) {
        EligibilitySuppressInvalidRFIModel = value;
    }

    private EligibilityMedicaidDataStore[] EligibilityMedicaidDataStores;

    public EligibilityMedicaidDataStore[] getEligibilityMedicaidDataStores() {
        return EligibilityMedicaidDataStores;
    }

    public void setEligibilityMedicaidDataStores(EligibilityMedicaidDataStore[] value) {
        EligibilityMedicaidDataStores = value;
    }

    private InterfaceDataStore InterfaceDataStore;

    public InterfaceDataStore getInterfaceDataStore() {
        return InterfaceDataStore;
    }

    public void setInterfaceDataStore(InterfaceDataStore value) {
        InterfaceDataStore = value;
    }

    private List<CaseMonthlyDataStore> CaseMonthlyDataStoreList = new ArrayList<>();

    public List<CaseMonthlyDataStore> getCaseMonthlyDataStoreList() {
        return CaseMonthlyDataStoreList;
    }

    public void setCaseMonthlyDataStoreList(List<CaseMonthlyDataStore> value) {
        CaseMonthlyDataStoreList = value;
    }

    private Map<Long, IndividualCommonDetail> IndividualCommonDetails = new HashMap<>();

    public Map<Long, IndividualCommonDetail> getIndividualCommonDetails() {
        return IndividualCommonDetails;
    }

    public void setIndividualCommonDetails(HashMap<Long, IndividualCommonDetail> value) {
        IndividualCommonDetails = value;
    }

    private List<String> MedicaidTOACodeList = new ArrayList<>();

    public List<String> getMedicaidTOACodeList() {
        return MedicaidTOACodeList;
    }

    public void setMedicaidTOACodeList(List<String> value) {
        MedicaidTOACodeList = value;
    }

    private List<String> MAGIAndNMAGITOACodeList = new ArrayList<>();

    public List<String> getMAGIAndNMAGITOACodeList() {
        return MAGIAndNMAGITOACodeList;
    }

    public void setMAGIAndNMAGITOACodeList(List<String> value) {
        MAGIAndNMAGITOACodeList = value;
    }

    private List<InterfaceTechnicalFailureModel> InterfaceTechnicalFailureModels = new ArrayList<>();

    public List<InterfaceTechnicalFailureModel> getInterfaceTechnicalFailureModels() {
        return InterfaceTechnicalFailureModels;
    }

    public void setInterfaceTechnicalFailureModels(List<InterfaceTechnicalFailureModel> value) {
        InterfaceTechnicalFailureModels = value;
    }

    private List<FailedFederalInterfaceModel> FailedFederalInterfaceModels = new ArrayList<>();

    public List<FailedFederalInterfaceModel> getFailedFederalInterfaceModels() {
        return FailedFederalInterfaceModels;
    }

    public void setFailedFederalInterfaceModels(List<FailedFederalInterfaceModel> value) {
        FailedFederalInterfaceModels = value;
    }

    private EligibilityPostRunDateDataStore EligibilityPostRunDateDataStore;

    public EligibilityPostRunDateDataStore getEligibilityPostRunDateDataStore() {
        return EligibilityPostRunDateDataStore;
    }

    public void setEligibilityPostRunDateDataStore(EligibilityPostRunDateDataStore value) {
        EligibilityPostRunDateDataStore = value;
    }

    private List<Integer> PassThroughEligibleIndividuals = new ArrayList<>();

    public List<Integer> getPassThroughEligibleIndividuals() {
        return PassThroughEligibleIndividuals;
    }

    public void setPassThroughEligibleIndividuals(List<Integer> value) {
        PassThroughEligibleIndividuals = value;
    }

    private LocalDateTime MaxPaymentEndDateExparteEDG;

    public LocalDateTime getMaxPaymentEndDateExparteEDG() {
        return MaxPaymentEndDateExparteEDG;
    }

    public void setMaxPaymentEndDateExparteEDG(LocalDateTime value) {
        MaxPaymentEndDateExparteEDG = value;
    }

    private LocalDateTime ExparteEdgMaxPaymentEndDate;

    public LocalDateTime getExparteEdgMaxPaymentEndDate() {
        return ExparteEdgMaxPaymentEndDate;
    }

    public void setExparteEdgMaxPaymentEndDate(LocalDateTime value) {
        ExparteEdgMaxPaymentEndDate = value;
    }

    private List<EligibilityIndividualBenefitModel> EligibilityIndividualBenefitsModels = new ArrayList<>();

    public List<EligibilityIndividualBenefitModel> getEligibilityIndividualBenefitsModels() {
        return EligibilityIndividualBenefitsModels;
    }

    public void setEligibilityIndividualBenefitsModels(List<EligibilityIndividualBenefitModel> value) {
        EligibilityIndividualBenefitsModels = value;
    }

    private List<EligibilityIndividualTMADetailModel> EligibilityIndividualTMADetailModels = new ArrayList<>();

    public List<EligibilityIndividualTMADetailModel> getEligibilityIndividualTMADetailModels() {
        return EligibilityIndividualTMADetailModels;
    }

    public void setEligibilityIndividualTMADetailModels(List<EligibilityIndividualTMADetailModel> value) {
        EligibilityIndividualTMADetailModels = value;
    }

    private List<Integer> LOCsDischargedBeforeGoLive = new ArrayList<>();

    public List<Integer> getLOCsDischargedBeforeGoLive() {
        return LOCsDischargedBeforeGoLive;
    }

    public void setLOCsDischargedBeforeGoLive(List<Integer> value) {
        LOCsDischargedBeforeGoLive = value;
    }

    private Dictionary<Integer, Integer> LOCsDischargedInPast;

    public Dictionary<Integer, Integer> getLOCsDischargedInPast() {
        return LOCsDischargedInPast;
    }

    public void setLOCsDischargedInPast(Dictionary<Integer, Integer> value) {
        LOCsDischargedInPast = value;
    }

    private Dictionary<Integer, Integer> WaiverReinstatedLOCs;

    public Dictionary<Integer, Integer> getWaiverReinstatedLOCs() {
        return WaiverReinstatedLOCs;
    }

    public void setWaiverReinstatedLOCs(Dictionary<Integer, Integer> value) {
        WaiverReinstatedLOCs = value;
    }

    private Dictionary<Long, List<LocalDateTime>> PTLBInstitutionalizedDateList;

    public Dictionary<Long, List<LocalDateTime>> getPTLBInstitutionalizedDateList() {
        return PTLBInstitutionalizedDateList;
    }

    public void setPTLBInstitutionalizedDateList(Dictionary<Long, List<LocalDateTime>> value) {
        PTLBInstitutionalizedDateList = value;
    }

    private List<EligibilityIndividualHubVerificationModel> EligibilityIndividualHubVerificationModels = new ArrayList<>();

    public List<EligibilityIndividualHubVerificationModel> getEligibilityIndividualHubVerificationModels() {
        return EligibilityIndividualHubVerificationModels;
    }

    public void setEligibilityIndividualHubVerificationModels(List<EligibilityIndividualHubVerificationModel> value) {
        EligibilityIndividualHubVerificationModels = value;
    }

    private List<VCLReferenceAllotmentModel> VCLReferenceAllotmentModels = new ArrayList<>();

    public List<VCLReferenceAllotmentModel> getVCLReferenceAllotmentModels() {
        return VCLReferenceAllotmentModels;
    }

    public void setVCLReferenceAllotmentModels(List<VCLReferenceAllotmentModel> value) {
        VCLReferenceAllotmentModels = value;
    }

    private List<EligibilityVerificationChecklistDetailModel> EligibilityVerificationChecklistDetailModels = new ArrayList<>();

    public List<EligibilityVerificationChecklistDetailModel> getEligibilityVerificationChecklistDetailModels() {
        return EligibilityVerificationChecklistDetailModels;
    }

    public void setEligibilityVerificationChecklistDetailModels(
            List<EligibilityVerificationChecklistDetailModel> value) {
        EligibilityVerificationChecklistDetailModels = value;
    }

    private List<EligibilityVerificationChecklistDetailModel> TempEligibilityVerificationChecklistDetailModels = new ArrayList<>();

    public List<EligibilityVerificationChecklistDetailModel> getTempEligibilityVerificationChecklistDetailModels() {
        return TempEligibilityVerificationChecklistDetailModels;
    }

    public void setTempEligibilityVerificationChecklistDetailModels(
            List<EligibilityVerificationChecklistDetailModel> value) {
        TempEligibilityVerificationChecklistDetailModels = value;
    }

    private String VCLMonthlyCaptureMode = "";

    public String getVCLMonthlyCaptureMode() {
        return VCLMonthlyCaptureMode;
    }

    public void setVCLMonthlyCaptureMode(String value) {
        VCLMonthlyCaptureMode = value;
    }

    public String fetchProgramCode(String toaCode) {
        EDProgramCategoryModel element = getEDProgramCategoryModels().stream().filter((pc) -> {
            return StringUtils.equals(pc.getTypeOfAssistanceCode(), toaCode);
        }).findFirst().orElse(null);
        if (element != null) {
            return element.getHBEProgramCategory();
        }
        return "";
    }

    private List<EdgNumberAllotmentModel> ListEdgNumberAllotmentModels = new ArrayList<>();

    public List<EdgNumberAllotmentModel> getListEdgNumberAllotmentModels() {
        return ListEdgNumberAllotmentModels;
    }

    public void setListEdgNumberAllotmentModels(List<EdgNumberAllotmentModel> value) {
        ListEdgNumberAllotmentModels = value;
    }

    public Function<LocalDateTime, CaseMonthlyDataStore> getGetCaseMonthlyDataStore() {
        return GetCaseMonthlyDataStore;
    }

    public void setGetCaseMonthlyDataStore(Function<LocalDateTime, CaseMonthlyDataStore> getCaseMonthlyDataStore) {
        GetCaseMonthlyDataStore = getCaseMonthlyDataStore;
    }

    private Function<LocalDateTime, CaseMonthlyDataStore> GetCaseMonthlyDataStore;
}
