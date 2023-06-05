package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseRecertificationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCCOLAChangeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCTransactionCaseLockModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EdgNumberAllotmentModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityOverrideRequestModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityTraceInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityTransactionModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EnrolledIndividualModel;

import java.util.ArrayList;
import java.util.List;

public class EligibilityDataStore {
    private List<EligibilityTransactionModel> EligibilityTransactionModels = new ArrayList<>();

    public List<EligibilityTransactionModel> getEligibilityTransactionModels() {
        return EligibilityTransactionModels;
    }

    public void setEligibilityTransactionModels(List<EligibilityTransactionModel> value) {
        EligibilityTransactionModels = value;
    }

    private List<EdgNumberAllotmentModel> EdgNumberAllotmentModels = new ArrayList<>();

    public List<EdgNumberAllotmentModel> getEdgNumberAllotmentModels() {
        return EdgNumberAllotmentModels;
    }

    public void setEdgNumberAllotmentModels(List<EdgNumberAllotmentModel> value) {
        EdgNumberAllotmentModels = value;
    }

    private List<EligibilityTraceInformationModel> EligibilityTraceInformationModels = new ArrayList<>();

    public List<EligibilityTraceInformationModel> getEligibilityTraceInformationModels() {
        return EligibilityTraceInformationModels;
    }

    public void setEligibilityTraceInformationModels(List<EligibilityTraceInformationModel> value) {
        EligibilityTraceInformationModels = value;
    }

    private List<EligibilityTraceInformationModel> EligibilityTraceInformationModelsForCE = new ArrayList<>();

    public List<EligibilityTraceInformationModel> getEligibilityTraceInformationModelsForCE() {
        return EligibilityTraceInformationModelsForCE;
    }

    public void setEligibilityTraceInformationModelsForCE(List<EligibilityTraceInformationModel> value) {
        EligibilityTraceInformationModelsForCE = value;
    }

    private List<EDBCTransactionCaseLockModel> EligibilityDeterminationTransactionTimeModels = new ArrayList<>();

    public List<EDBCTransactionCaseLockModel> getEligibilityDeterminationTransactionTimeModels() {
        return EligibilityDeterminationTransactionTimeModels;
    }

    public void setEligibilityDeterminationTransactionTimeModels(List<EDBCTransactionCaseLockModel> value) {
        EligibilityDeterminationTransactionTimeModels = value;
    }

    private List<EligibilityIndividualBenefitModel> EligibilityIndividualBenefitsModels = new ArrayList<>();

    public List<EligibilityIndividualBenefitModel> getEligibilityIndividualBenefitsModels() {
        return EligibilityIndividualBenefitsModels;
    }

    public void setEligibilityIndividualBenefitsModels(List<EligibilityIndividualBenefitModel> value) {
        EligibilityIndividualBenefitsModels = value;
    }

    private List<CaseRecertificationModel> CaseRecertificationModels = new ArrayList<>();

    public List<CaseRecertificationModel> getCaseRecertificationModels() {
        return CaseRecertificationModels;
    }

    public void setCaseRecertificationModels(List<CaseRecertificationModel> value) {
        CaseRecertificationModels = value;
    }

    private List<CaseRecertificationModel> caseRecertificationModelsWithTimeStamp = new ArrayList<>();

    public List<CaseRecertificationModel> getcaseRecertificationModelsWithTimeStamp() {
        return caseRecertificationModelsWithTimeStamp;
    }

    public void setcaseRecertificationModelsWithTimeStamp(List<CaseRecertificationModel> value) {
        caseRecertificationModelsWithTimeStamp = value;
    }

    private List<CaseRecertificationModel> CaseRecertificationForReinstatePrograms = new ArrayList<>();

    public List<CaseRecertificationModel> getCaseRecertificationForReinstatePrograms() {
        return CaseRecertificationForReinstatePrograms;
    }

    public void setCaseRecertificationForReinstatePrograms(List<CaseRecertificationModel> value) {
        CaseRecertificationForReinstatePrograms = value;
    }

    private List<EDBCCOLAChangeModel> COLAChangeModels = new ArrayList<>();

    public List<EDBCCOLAChangeModel> getCOLAChangeModels() {
        return COLAChangeModels;
    }

    public void setCOLAChangeModels(List<EDBCCOLAChangeModel> value) {
        COLAChangeModels = value;
    }

    private List<EnrolledIndividualModel> EnrolledIndividualModels = new ArrayList<>();

    public List<EnrolledIndividualModel> getEnrolledIndividualModels() {
        return EnrolledIndividualModels;
    }

    public void setEnrolledIndividualModels(List<EnrolledIndividualModel> value) {
        EnrolledIndividualModels = value;
    }

    private List<EligibilityOverrideRequestModel> EligibilityOverrideRequestModels = new ArrayList<>();

    public List<EligibilityOverrideRequestModel> getEligibilityOverrideRequestModels() {
        return EligibilityOverrideRequestModels;
    }

    public void setEligibilityOverrideRequestModels(List<EligibilityOverrideRequestModel> value) {
        EligibilityOverrideRequestModels = value;
    }

}
