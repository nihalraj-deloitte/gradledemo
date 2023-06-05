//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:21 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.CaseProgramIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EligibilityIndividualBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExpenseAmountModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SpendDownModel;

import java.util.ArrayList;
import java.util.List;

public class SpendDownDataCollectionDataStore {
    private List<SpendDownModel> SpendDownModels = new ArrayList<>();

    public List<SpendDownModel> getSpendDownModels() {
        return SpendDownModels;
    }

    public void setSpendDownModels(List<SpendDownModel> value) {
        SpendDownModels = value;
    }

    private List<CaseProgramIndividualModel> CaseProgramIndividualModels = new ArrayList<>();

    public List<CaseProgramIndividualModel> getCaseProgramIndividualModels() {
        return CaseProgramIndividualModels;
    }

    public void setCaseProgramIndividualModels(List<CaseProgramIndividualModel> value) {
        CaseProgramIndividualModels = value;
    }

    private List<ExpenseModel> MedicalExpenseAllModels = new ArrayList<>();

    public List<ExpenseModel> getMedicalExpenseAllModels() {
        return MedicalExpenseAllModels;
    }

    public void setMedicalExpenseAllModels(List<ExpenseModel> value) {
        MedicalExpenseAllModels = value;
    }

    private List<ExpenseAmountModel> MedicalExpenseAmountModels = new ArrayList<>();

    public List<ExpenseAmountModel> getMedicalExpenseAmountModels() {
        return MedicalExpenseAmountModels;
    }

    public void setMedicalExpenseAmountModels(List<ExpenseAmountModel> value) {
        MedicalExpenseAmountModels = value;
    }

    private List<EligibilityIndividualBenefitModel> EligibilityIndividualBenefitsModels = new ArrayList<>();

    public List<EligibilityIndividualBenefitModel> getEligibilityIndividualBenefitsModels() {
        return EligibilityIndividualBenefitsModels;
    }

    public void setEligibilityIndividualBenefitsModels(List<EligibilityIndividualBenefitModel> value) {
        EligibilityIndividualBenefitsModels = value;
    }

}

