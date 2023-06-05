package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityModel;

import java.util.ArrayList;
import java.util.List;

public class EligibilityPostRunDateDataStore {
    private List<EligibilityModel> EligibilityModels = new ArrayList<>();

    public List<EligibilityModel> getEligibilityModels() {
        return EligibilityModels;
    }

    public void setEligibilityModels(List<EligibilityModel> value) {
        EligibilityModels = value;
    }

}

