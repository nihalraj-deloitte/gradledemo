package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualMagiFmaBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityMagiFmaBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMAGIBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityNonMAGIIndividualBudgetModel;

import java.util.Collection;

public class EligibilityMonthlyDataStore {

    private Collection<com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EDBCLastVerifiedFinancialDetail> EDBCLastVerifiedFinancialDetails;

    public Collection<com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EDBCLastVerifiedFinancialDetail> getEDBCLastVerifiedFinancialDetails() {
        return EDBCLastVerifiedFinancialDetails;
    }

    public void setEDBCLastVerifiedFinancialDetails(Collection<com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.EDBCLastVerifiedFinancialDetail> value) {
        EDBCLastVerifiedFinancialDetails = value;
    }

    private Collection<EligibilityModel> EligibilityModels;

    public Collection<EligibilityModel> getEligibilityModels() {
        return EligibilityModels;
    }

    public void setEligibilityModels(Collection<EligibilityModel> value) {
        EligibilityModels = value;
    }

    private Collection<EligibilityIndividualModel> EligibilityIndividualModels;

    public Collection<EligibilityIndividualModel> getEligibilityIndividualModels() {
        return EligibilityIndividualModels;
    }

    public void setEligibilityIndividualModels(Collection<EligibilityIndividualModel> value) {
        EligibilityIndividualModels = value;
    }

    private Collection<EligibilityNonMAGIBudgetModel> EligibilityNonMAGIBudgetModels;

    public Collection<EligibilityNonMAGIBudgetModel> getEligibilityNonMAGIBudgetModels() {
        return EligibilityNonMAGIBudgetModels;
    }

    public void setEligibilityNonMAGIBudgetModels(Collection<EligibilityNonMAGIBudgetModel> value) {
        EligibilityNonMAGIBudgetModels = value;
    }

    private Collection<EligibilityNonMAGIIndividualBudgetModel> EligibilityIndividualNonMAGIBudgetModels;

    public Collection<EligibilityNonMAGIIndividualBudgetModel> getEligibilityIndividualNonMAGIBudgetModels() {
        return EligibilityIndividualNonMAGIBudgetModels;
    }

    public void setEligibilityIndividualNonMAGIBudgetModels(Collection<EligibilityNonMAGIIndividualBudgetModel> value) {
        EligibilityIndividualNonMAGIBudgetModels = value;
    }

    private Collection<EligibilityMagiFmaBudgetModel> EligibilityMagiFmaBudgetModels;

    public Collection<EligibilityMagiFmaBudgetModel> getEligibilityMagiFmaBudgetModels() {
        return EligibilityMagiFmaBudgetModels;
    }

    public void setEligibilityMagiFmaBudgetModels(Collection<EligibilityMagiFmaBudgetModel> value) {
        EligibilityMagiFmaBudgetModels = value;
    }

    private Collection<EligibilityIndividualMagiFmaBudgetModel> EligibilityIndividualMagiFmaBudgetModels;

    public Collection<EligibilityIndividualMagiFmaBudgetModel> getEligibilityIndividualMagiFmaBudgetModels() {
        return EligibilityIndividualMagiFmaBudgetModels;
    }

    public void setEligibilityIndividualMagiFmaBudgetModels(Collection<EligibilityIndividualMagiFmaBudgetModel> value) {
        EligibilityIndividualMagiFmaBudgetModels = value;
    }

}


