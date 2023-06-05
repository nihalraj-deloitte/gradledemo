package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.programdatastores;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EligibilityIndividualPenaltyCustom;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.IndividualCascadeNoticeReason;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCAddtionalNoticeRequestModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCIndividualManageComplianceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EDBCMaCancellationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityCascadeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualDataModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualNoticeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualPenaltyModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMAGIBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMAGIIndividualBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMAGIIndividualResourceDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMAGIIndividualResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMAGIResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMagiDeemedIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNoticeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilitySpendDownModel;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EligibilityNMAGIDataStore extends BaseEligibilityProgramStore {
    private List<EligibilitySpendDownModel> EligibilityNMAGISpendDownModels = new ArrayList<>();

    public List<EligibilitySpendDownModel> getEligibilityNMAGISpendDownModels() {
        return EligibilityNMAGISpendDownModels;
    }

    public void setEligibilityNMAGISpendDownModels(List<EligibilitySpendDownModel> value) {
        EligibilityNMAGISpendDownModels = value;
    }

    private List<EligibilityNonMAGIResourceModel> EligibilityNMAGIResourceModels = new ArrayList<>();

    public List<EligibilityNonMAGIResourceModel> getEligibilityNMAGIResourceModels() {
        return EligibilityNMAGIResourceModels;
    }

    public void setEligibilityNMAGIResourceModels(List<EligibilityNonMAGIResourceModel> value) {
        EligibilityNMAGIResourceModels = value;
    }

    private List<EligibilityNoticeReasonModel> EligibilityNoticeReasonModels = new ArrayList<>();

    public List<EligibilityNoticeReasonModel> getEligibilityNoticeReasonModels() {
        return EligibilityNoticeReasonModels;
    }

    public void setEligibilityNoticeReasonModels(List<EligibilityNoticeReasonModel> value) {
        EligibilityNoticeReasonModels = value;
    }

    private List<EligibilityNonMAGIBudgetModel> EligibilityNonMAGIBudgetModels = new ArrayList<>();

    public List<EligibilityNonMAGIBudgetModel> getEligibilityNonMAGIBudgetModels() {
        return EligibilityNonMAGIBudgetModels;
    }

    public void setEligibilityNonMAGIBudgetModels(List<EligibilityNonMAGIBudgetModel> value) {
        EligibilityNonMAGIBudgetModels = value;
    }

    private List<DefaultKeyValue<Integer, LocalDateTime>> InitialEligiblityPbdIndividIdKeyValuePair = new ArrayList<>();

    public List<DefaultKeyValue<Integer, LocalDateTime>> getInitialEligiblityPbdIndividIdKeyValuePair() {
        return InitialEligiblityPbdIndividIdKeyValuePair;
    }

    public void setInitialEligiblityPbdIndividIdKeyValuePair(List<DefaultKeyValue<Integer, LocalDateTime>> value) {
        InitialEligiblityPbdIndividIdKeyValuePair = value;
    }

    public List<EligibilityModel> EligibilityModels = new ArrayList<>();

    public List<EligibilityModel> getEligibilityModels() {
        return EligibilityModels;
    }

    public void setEligibilityModels(List<EligibilityModel> value) {
        EligibilityModels = value;
    }

    //ToDo EDMX-change R5dbchange 2015-03-05
    private List<EligibilityNonMAGIIndividualResourceDetailModel> EligibilityNMAGIIndividualResourceDetailModels = new ArrayList<>();

    public List<EligibilityNonMAGIIndividualResourceDetailModel> getEligibilityNMAGIIndividualResourceDetailModels() {
        return EligibilityNMAGIIndividualResourceDetailModels;
    }

    public void setEligibilityNMAGIIndividualResourceDetailModels(List<EligibilityNonMAGIIndividualResourceDetailModel> value) {
        EligibilityNMAGIIndividualResourceDetailModels = value;
    }

    //ToDo EDMX-change R5dbchange 2015-03-05
    private List<EligibilityNonMAGIIndividualResourceModel> EligibilityNMAGIIndividualResourceModels = new ArrayList<>();

    public List<EligibilityNonMAGIIndividualResourceModel> getEligibilityNMAGIIndividualResourceModels() {
        return EligibilityNMAGIIndividualResourceModels;
    }

    public void setEligibilityNMAGIIndividualResourceModels(List<EligibilityNonMAGIIndividualResourceModel> value) {
        EligibilityNMAGIIndividualResourceModels = value;
    }

    private List<EligibilityIndividualNoticeReasonModel> EligibilityIndividualNoticeReasonModels = new ArrayList<>();

    public List<EligibilityIndividualNoticeReasonModel> getEligibilityIndividualNoticeReasonModels() {
        return EligibilityIndividualNoticeReasonModels;
    }

    public void setEligibilityIndividualNoticeReasonModels(List<EligibilityIndividualNoticeReasonModel> value) {
        EligibilityIndividualNoticeReasonModels = value;
    }

    private List<EligibilityIndividualIncomeDetailModel> EligibilityIndividualIncomeDetailModels = new ArrayList<>();

    public List<EligibilityIndividualIncomeDetailModel> getEligibilityIndividualIncomeDetailModels() {
        return EligibilityIndividualIncomeDetailModels;
    }

    public void setEligibilityIndividualIncomeDetailModels(List<EligibilityIndividualIncomeDetailModel> value) {
        EligibilityIndividualIncomeDetailModels = value;
    }

    private List<EligibilityNonMAGIIndividualBudgetModel> EligibilityIndividualNonMAGIBudgetModels = new ArrayList<>();

    public List<EligibilityNonMAGIIndividualBudgetModel> getEligibilityIndividualNonMAGIBudgetModels() {
        return EligibilityIndividualNonMAGIBudgetModels;
    }

    public void setEligibilityIndividualNonMAGIBudgetModels(List<EligibilityNonMAGIIndividualBudgetModel> value) {
        EligibilityIndividualNonMAGIBudgetModels = value;
    }

    public List<EligibilityIndividualModel> EligibilityIndividualModels = new ArrayList<>();

    public List<EligibilityIndividualModel> getEligibilityIndividualModels() {
        return EligibilityIndividualModels;
    }

    public void setEligibilityIndividualModels(List<EligibilityIndividualModel> value) {
        EligibilityIndividualModels = value;
    }

    private List<EligibilityIndividualDataModel> EligibilityIndividualDataModels = new ArrayList<>();

    public List<EligibilityIndividualDataModel> getEligibilityIndividualDataModels() {
        return EligibilityIndividualDataModels;
    }

    public void setEligibilityIndividualDataModels(List<EligibilityIndividualDataModel> value) {
        EligibilityIndividualDataModels = value;
    }

    private List<EligibilityCascadeReasonModel> EligibilityCascadeReasonModels = new ArrayList<>();

    public List<EligibilityCascadeReasonModel> getEligibilityCascadeReasonModels() {
        return EligibilityCascadeReasonModels;
    }

    public void setEligibilityCascadeReasonModels(List<EligibilityCascadeReasonModel> value) {
        EligibilityCascadeReasonModels = value;
    }

    private List<Integer> NoMedicaidEligiblityEdgList = new ArrayList<>();

    public List<Integer> getNoMedicaidEligiblityEdgList() {
        return NoMedicaidEligiblityEdgList;
    }

    public void setNoMedicaidEligiblityEdgList(List<Integer> value) {
        NoMedicaidEligiblityEdgList = value;
    }

    private List<EligibilityNonMagiDeemedIncomeModel> EligibilityNonMagiDeemedIncomeModels = new ArrayList<>();

    public List<EligibilityNonMagiDeemedIncomeModel> getEligibilityNonMagiDeemedIncomeModels() {
        return EligibilityNonMagiDeemedIncomeModels;
    }

    public void setEligibilityNonMagiDeemedIncomeModels(List<EligibilityNonMagiDeemedIncomeModel> value) {
        EligibilityNonMagiDeemedIncomeModels = value;
    }

    private List<EDBCMaCancellationModel> EDBCMaCancellationModels = new ArrayList<>();

    public List<EDBCMaCancellationModel> getEDBCMaCancellationModels() {
        return EDBCMaCancellationModels;
    }

    public void setEDBCMaCancellationModels(List<EDBCMaCancellationModel> value) {
        EDBCMaCancellationModels = value;
    }

    private List<EligibilityIndividualPenaltyModel> EligibilityIndividualPenaltyModels = new ArrayList<>();

    public List<EligibilityIndividualPenaltyModel> getEligibilityIndividualPenaltyModels() {
        return EligibilityIndividualPenaltyModels;
    }

    public void setEligibilityIndividualPenaltyModels(List<EligibilityIndividualPenaltyModel> value) {
        EligibilityIndividualPenaltyModels = value;
    }

    private List<IndividualCascadeNoticeReason> IndividualCascadeNoticeReasons = new ArrayList<>();

    public List<IndividualCascadeNoticeReason> getIndividualCascadeNoticeReasons() {
        return IndividualCascadeNoticeReasons;
    }

    public void setIndividualCascadeNoticeReasons(List<IndividualCascadeNoticeReason> value) {
        IndividualCascadeNoticeReasons = value;
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

    private List<EligibilityIndividualPenaltyCustom> EligibilityIndividualPenaltyCustomList = new ArrayList<>();

    public List<EligibilityIndividualPenaltyCustom> getEligibilityIndividualPenaltyCustomList() {
        return EligibilityIndividualPenaltyCustomList;
    }

    public void setEligibilityIndividualPenaltyCustomList(List<EligibilityIndividualPenaltyCustom> value) {
        EligibilityIndividualPenaltyCustomList = value;
    }

    private List<EDBCIndividualManageComplianceModel> EDBCIndividualManageComplianceModels = new ArrayList<>();

    public List<EDBCIndividualManageComplianceModel> getEDBCIndividualManageComplianceModels() {
        return EDBCIndividualManageComplianceModels;
    }

    public void setEDBCIndividualManageComplianceModels(List<EDBCIndividualManageComplianceModel> value) {
        EDBCIndividualManageComplianceModels = value;
    }

    private List<EDBCIndividualManageComplianceModel> EDBCIndividualInvalidManageComplianceModels = new ArrayList<>();

    public List<EDBCIndividualManageComplianceModel> getEDBCIndividualInvalidManageComplianceModels() {
        return EDBCIndividualInvalidManageComplianceModels;
    }

    public void setEDBCIndividualInvalidManageComplianceModels(List<EDBCIndividualManageComplianceModel> value) {
        EDBCIndividualInvalidManageComplianceModels = value;
    }

    private List<EligibilityModel> EligibilitySSPPCTSOtherCaseModels = new ArrayList<>();

    public List<EligibilityModel> getEligibilitySSPPCTSOtherCaseModels() {
        return EligibilitySSPPCTSOtherCaseModels;
    }

    public void setEligibilitySSPPCTSOtherCaseModels(List<EligibilityModel> value) {
        EligibilitySSPPCTSOtherCaseModels = value;
    }

    private List<EligibilityIndividualModel> EligibilityIndividualSSPPCTSOtherCaseModels = new ArrayList<>();

    public List<EligibilityIndividualModel> getEligibilityIndividualSSPPCTSOtherCaseModels() {
        return EligibilityIndividualSSPPCTSOtherCaseModels;
    }

    public void setEligibilityIndividualSSPPCTSOtherCaseModels(List<EligibilityIndividualModel> value) {
        EligibilityIndividualSSPPCTSOtherCaseModels = value;
    }

}

