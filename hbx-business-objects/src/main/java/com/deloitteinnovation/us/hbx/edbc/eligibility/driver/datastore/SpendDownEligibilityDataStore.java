package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualNoticeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNoticeReasonModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilitySpendDownModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityTraceInformationModel;

import java.util.ArrayList;
import java.util.List;

public class SpendDownEligibilityDataStore {

    private List<EligibilitySpendDownModel> EligibilitySpendDownModels = new ArrayList<>();

    public List<EligibilitySpendDownModel> getEligibilitySpendDownModels() {
        return EligibilitySpendDownModels;
    }

    public void setEligibilitySpendDownModels(List<EligibilitySpendDownModel> value) {
        EligibilitySpendDownModels = value;
    }

    private List<EligibilityModel> EligibilityModels = new ArrayList<>();

    public List<EligibilityModel> getEligibilityModels() {
        return EligibilityModels;
    }

    public void setEligibilityModels(List<EligibilityModel> value) {
        EligibilityModels = value;
    }

    private List<EligibilityIndividualModel> EligibilityIndividualModels = new ArrayList<>();

    public List<EligibilityIndividualModel> getEligibilityIndividualModels() {
        return EligibilityIndividualModels;
    }

    public void setEligibilityIndividualModels(List<EligibilityIndividualModel> value) {
        EligibilityIndividualModels = value;
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

    private List<EligibilityTraceInformationModel> EligibilityTraceInformationModels = new ArrayList<>();

    public List<EligibilityTraceInformationModel> getEligibilityTraceInformationModels() {
        return EligibilityTraceInformationModels;
    }

    public void setEligibilityTraceInformationModels(List<EligibilityTraceInformationModel> value) {
        EligibilityTraceInformationModels = value;
    }

}

