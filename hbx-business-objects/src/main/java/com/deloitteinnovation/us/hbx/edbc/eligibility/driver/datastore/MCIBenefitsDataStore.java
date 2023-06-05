package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualBenefitModel;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;

import java.util.ArrayList;
import java.util.List;

public class MCIBenefitsDataStore {
    public List<EligibilityIndividualBenefitModel> EligibilityIndividualBenefitModels = new ArrayList<>();
    public List<DefaultKeyValue<EligibilityIndividualBenefitModel, EligibilityIndividualBenefitModel[]>> MCILinkedEligibilityIndividualBenefitModels = new ArrayList<>();

}
