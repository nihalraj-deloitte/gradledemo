//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:01 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityTraceInformationModel;

import java.util.ArrayList;
import java.util.List;

public class MSPEligibilityDataStore {
    private List<EligibilityModel> MSPEligibilityModels = new ArrayList<>();

    public List<EligibilityModel> getMSPEligibilityModels() {
        return MSPEligibilityModels;
    }

    public void setMSPEligibilityModels(List<EligibilityModel> value) {
        MSPEligibilityModels = value;
    }

    private List<EligibilityIndividualModel> MSPEligibilityIndividualModels = new ArrayList<>();

    public List<EligibilityIndividualModel> getMSPEligibilityIndividualModels() {
        return MSPEligibilityIndividualModels;
    }

    public void setMSPEligibilityIndividualModels(List<EligibilityIndividualModel> value) {
        MSPEligibilityIndividualModels = value;
    }

    private List<EligibilityTraceInformationModel> MSPEligibilityTraceInformationModels = new ArrayList<>();

    public List<EligibilityTraceInformationModel> getMSPEligibilityTraceInformationModels() {
        return MSPEligibilityTraceInformationModels;
    }

    public void setMSPEligibilityTraceInformationModels(List<EligibilityTraceInformationModel> value) {
        MSPEligibilityTraceInformationModels = value;
    }

}

