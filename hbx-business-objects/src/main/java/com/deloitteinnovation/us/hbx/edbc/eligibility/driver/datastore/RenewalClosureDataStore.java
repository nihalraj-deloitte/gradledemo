package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseProgramModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualDataModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityModel;

import java.util.ArrayList;
import java.util.List;

public class RenewalClosureDataStore {
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

    private List<CaseProgramModel> CaseProgramModels = new ArrayList<>();

    public List<CaseProgramModel> getCaseProgramModels() {
        return CaseProgramModels;
    }

    public void setCaseProgramModels(List<CaseProgramModel> value) {
        CaseProgramModels = value;
    }

}

