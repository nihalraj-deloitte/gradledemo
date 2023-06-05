package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.programdatastores;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EligibilityIndividualBenefitsCustom;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.HBEHIndividualBenefitDetailModelCustom;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCAddtionalNoticeRequestModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCIndividualManageComplianceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCMaCancellationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityAffordableTestModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityCascadeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualDataModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualFederalVerificationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualMagiFmaBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualNoticeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualPenaltyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualProgramModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityMagiFmaBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNoticeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilitySpendDownModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityToaCascadeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExpansionPenaltyDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.HouseholdIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IndividualIncomeModel;

import java.util.ArrayList;
import java.util.List;

public class EligibilityMedicaidDataStore extends BaseEligibilityProgramStore {
    private List<EligibilityAffordableTestModel> EligibilityAffordableTestModels = new ArrayList<>();

    public List<EligibilityAffordableTestModel> getEligibilityAffordableTestModels() {
        return EligibilityAffordableTestModels;
    }

    public void setEligibilityAffordableTestModels(List<EligibilityAffordableTestModel> value) {
        EligibilityAffordableTestModels = value;
    }

    private List<EligibilityIndividualFederalVerificationModel> EligibilityIndividualFederalVerificationModels = new ArrayList<>();

    public List<EligibilityIndividualFederalVerificationModel> getEligibilityIndividualFederalVerificationModels() {
        return EligibilityIndividualFederalVerificationModels;
    }

    public void setEligibilityIndividualFederalVerificationModels(
            List<EligibilityIndividualFederalVerificationModel> value) {
        EligibilityIndividualFederalVerificationModels = value;
    }

    private List<EligibilityMagiFmaBudgetModel> EligibilityMagiFmaBudgetModels = new ArrayList<>();

    public List<EligibilityMagiFmaBudgetModel> getEligibilityMagiFmaBudgetModels() {
        return EligibilityMagiFmaBudgetModels;
    }

    public void setEligibilityMagiFmaBudgetModels(List<EligibilityMagiFmaBudgetModel> value) {
        EligibilityMagiFmaBudgetModels = value;
    }

    private List<EligibilityIndividualMagiFmaBudgetModel> EligibilityIndividualMagiFmaBudgetModels = new ArrayList<>();

    public List<EligibilityIndividualMagiFmaBudgetModel> getEligibilityIndividualMagiFmaBudgetModels() {
        return EligibilityIndividualMagiFmaBudgetModels;
    }

    public void setEligibilityIndividualMagiFmaBudgetModels(List<EligibilityIndividualMagiFmaBudgetModel> value) {
        EligibilityIndividualMagiFmaBudgetModels = value;
    }

    private List<EligibilityIndividualIncomeDetailModel> EligibilityIndividualIncomeDetailModels = new ArrayList<>();

    public List<EligibilityIndividualIncomeDetailModel> getEligibilityIndividualIncomeDetailModels() {
        return EligibilityIndividualIncomeDetailModels;
    }

    public void setEligibilityIndividualIncomeDetailModels(List<EligibilityIndividualIncomeDetailModel> value) {
        EligibilityIndividualIncomeDetailModels = value;
    }

    private List<EligibilityCascadeReasonModel> EligibilityCascadeReasonModels = new ArrayList<>();

    public List<EligibilityCascadeReasonModel> getEligibilityCascadeReasonModels() {
        return EligibilityCascadeReasonModels;
    }

    public void setEligibilityCascadeReasonModels(List<EligibilityCascadeReasonModel> value) {
        EligibilityCascadeReasonModels = value;
    }

    private List<EligibilityModel> EligibilityModels = new ArrayList<>();

    public List<EligibilityModel> getEligibilityModels() {
        return EligibilityModels;
    }

    public void setEligibilityModels(List<EligibilityModel> value) {
        EligibilityModels = value;
    }

    private List<EligibilityIndividualDataModel> EligibilityIndividualDataModels = new ArrayList<>();

    public List<EligibilityIndividualDataModel> getEligibilityIndividualDataModels() {
        return EligibilityIndividualDataModels;
    }

    public void setEligibilityIndividualDataModels(List<EligibilityIndividualDataModel> value) {
        EligibilityIndividualDataModels = value;
    }

    private List<EligibilityIndividualModel> EligibilityIndividualModels = new ArrayList<>();

    public List<EligibilityIndividualModel> getEligibilityIndividualModels() {
        return EligibilityIndividualModels;
    }

    public void setEligibilityIndividualModels(List<EligibilityIndividualModel> value) {
        EligibilityIndividualModels = value;
    }

    // aimen CE EBI
    private List<EligibilityIndividualBenefitsCustom> EligibilityIndividualBenefitsModels = new ArrayList<>();

    public List<EligibilityIndividualBenefitsCustom> getEligibilityIndividualBenefitsModels() {
        return EligibilityIndividualBenefitsModels;
    }

    public void setEligibilityIndividualBenefitsModels(List<EligibilityIndividualBenefitsCustom> value) {
        EligibilityIndividualBenefitsModels = value;
    }

    private List<EligibilityIndividualProgramModel> EligibilityIndividualProgramModels = new ArrayList<>();

    public List<EligibilityIndividualProgramModel> getEligibilityIndividualProgramModels() {
        return EligibilityIndividualProgramModels;
    }

    public void setEligibilityIndividualProgramModels(List<EligibilityIndividualProgramModel> value) {
        EligibilityIndividualProgramModels = value;
    }

    private List<EligibilityNoticeReasonModel> EligibilityNoticeReasonModels = new ArrayList<>();

    public List<EligibilityNoticeReasonModel> getEligibilityNoticeReasonModels() {
        return EligibilityNoticeReasonModels;
    }

    public void setEligibilityNoticeReasonModels(List<EligibilityNoticeReasonModel> value) {
        EligibilityNoticeReasonModels = value;
    }

    private List<EligibilityIndividualNoticeReasonModel> EligibilityIndividualNoticeReasonModels = new ArrayList<>();

    public List<EligibilityIndividualNoticeReasonModel> getEligibilityIndividualNoticeReasonModels() {
        return EligibilityIndividualNoticeReasonModels;
    }

    public void setEligibilityIndividualNoticeReasonModels(List<EligibilityIndividualNoticeReasonModel> value) {
        EligibilityIndividualNoticeReasonModels = value;
    }

    private List<EligibilityToaCascadeModel> EligibilityToaCascadeModels = new ArrayList<>();

    public List<EligibilityToaCascadeModel> getEligibilityToaCascadeModels() {
        return EligibilityToaCascadeModels;
    }

    public void setEligibilityToaCascadeModels(List<EligibilityToaCascadeModel> value) {
        EligibilityToaCascadeModels = value;
    }

    private List<EDBCMaCancellationModel> EDBCMaCancellationModels = new ArrayList<>();

    public List<EDBCMaCancellationModel> getEDBCMaCancellationModels() {
        return EDBCMaCancellationModels;
    }

    public void setEDBCMaCancellationModels(List<EDBCMaCancellationModel> value) {
        EDBCMaCancellationModels = value;
    }

    public List<EligibilitySpendDownModel> EligibilitySpendDownModels = new ArrayList<>();

    public List<EligibilitySpendDownModel> getEligibilitySpendDownModels() {
        return EligibilitySpendDownModels;
    }

    public void setEligibilitySpendDownModels(List<EligibilitySpendDownModel> value) {
        EligibilitySpendDownModels = value;
    }

    private List<EDBCAddtionalNoticeRequestModel> EDBCAddtionalNoticeRequestModels = new ArrayList<>();

    public List<EDBCAddtionalNoticeRequestModel> getEDBCAddtionalNoticeRequestModels() {
        return EDBCAddtionalNoticeRequestModels;
    }

    public void setEDBCAddtionalNoticeRequestModels(List<EDBCAddtionalNoticeRequestModel> value) {
        EDBCAddtionalNoticeRequestModels = value;
    }

    private List<EligibilityIndividualPenaltyModel> EligibilityIndividualPenaltyModels = new ArrayList<>();

    public List<EligibilityIndividualPenaltyModel> getEligibilityIndividualPenaltyModels() {
        return EligibilityIndividualPenaltyModels;
    }

    public void setEligibilityIndividualPenaltyModels(List<EligibilityIndividualPenaltyModel> value) {
        EligibilityIndividualPenaltyModels = value;
    }

    private List<HouseholdIncomeModel> HouseholdIncomeModels = new ArrayList<>();

    public List<HouseholdIncomeModel> getHouseholdIncomeModels() {
        return HouseholdIncomeModels;
    }

    public void setHouseholdIncomeModels(List<HouseholdIncomeModel> value) {
        HouseholdIncomeModels = value;
    }

    private List<IndividualIncomeModel> IndividualIncomeModels = new ArrayList<>();

    public List<IndividualIncomeModel> getIndividualIncomeModels() {
        return IndividualIncomeModels;
    }

    public void setIndividualIncomeModels(List<IndividualIncomeModel> value) {
        IndividualIncomeModels = value;
    }

    private List<EDBCIndividualManageComplianceModel> EDBCIndividualManageComplianceModels = new ArrayList<>();

    public List<EDBCIndividualManageComplianceModel> getEDBCIndividualManageComplianceModels() {
        return EDBCIndividualManageComplianceModels;
    }

    public void setEDBCIndividualManageComplianceModels(List<EDBCIndividualManageComplianceModel> value) {
        EDBCIndividualManageComplianceModels = value;
    }

    private List<Integer> LstCEEdgtraceIds = new ArrayList<>();

    public List<Integer> getLstCEEdgtraceIds() {
        return LstCEEdgtraceIds;
    }

    public void setLstCEEdgtraceIds(List<Integer> value) {
        LstCEEdgtraceIds = value;
    }


    private List<HBEHIndividualBenefitDetailModelCustom> HBEHIndividualBenefitDetails = new ArrayList<>();

    public List<HBEHIndividualBenefitDetailModelCustom> getHBEHIndividualBenefitDetails() {
        return HBEHIndividualBenefitDetails;
    }

    public void setHBEHIndividualBenefitDetails(List<HBEHIndividualBenefitDetailModelCustom> value) {
        HBEHIndividualBenefitDetails = value;
    }

    private List<ExpansionPenaltyDetailModel> ExpansionPenaltyDetails = new ArrayList<>();

    public List<ExpansionPenaltyDetailModel> getExpansionPenaltyDetails() {
        return ExpansionPenaltyDetails;
    }

    public void setExpansionPenaltyDetails(List<ExpansionPenaltyDetailModel> value) {
        ExpansionPenaltyDetails = value;
    }

}
