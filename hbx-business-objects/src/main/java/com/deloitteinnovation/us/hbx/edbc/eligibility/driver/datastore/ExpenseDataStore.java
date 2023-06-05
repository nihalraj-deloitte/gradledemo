package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationalExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExpenseAmountModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SafeRentMortgageModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentPayExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ShortTermExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnoccupiedShelterModel;

import java.util.ArrayList;
import java.util.List;

public class ExpenseDataStore {

    private List<String> AvailableExpenses = new ArrayList<>();

    public List<String> getAvailableExpenses() {
        return AvailableExpenses;
    }

    public void setAvailableExpenses(List<String> value) {
        AvailableExpenses = value;
    }

    private List<SafeRentMortgageModel> SafeRentMortgageModels = new ArrayList<>();

    public List<SafeRentMortgageModel> getSafeRentMortgageModels() {
        return SafeRentMortgageModels;
    }

    public void setSafeRentMortgageModels(List<SafeRentMortgageModel> value) {
        SafeRentMortgageModels = value;
    }

    private List<EducationalExpenseModel> EducationalExpenses = new ArrayList<>();

    public List<EducationalExpenseModel> getEducationalExpenses() {
        return EducationalExpenses;
    }

    public void setEducationalExpenses(List<EducationalExpenseModel> value) {
        EducationalExpenses = value;
    }

    private List<SelfEmploymentPayExpenseModel> SelfEmploymentPayExpenses = new ArrayList<>();

    public List<SelfEmploymentPayExpenseModel> getSelfEmploymentPayExpenses() {
        return SelfEmploymentPayExpenses;
    }

    public void setSelfEmploymentPayExpenses(List<SelfEmploymentPayExpenseModel> value) {
        SelfEmploymentPayExpenses = value;
    }

    private List<ShortTermExpenseModel> ShortTermExpenses = new ArrayList<>();

    public List<ShortTermExpenseModel> getShortTermExpenses() {
        return ShortTermExpenses;
    }

    public void setShortTermExpenses(List<ShortTermExpenseModel> value) {
        ShortTermExpenses = value;
    }

    private List<UnoccupiedShelterModel> UnoccupiedShelterModels = new ArrayList<>();

    public List<UnoccupiedShelterModel> getUnoccupiedShelterModels() {
        return UnoccupiedShelterModels;
    }

    public void setUnoccupiedShelterModels(List<UnoccupiedShelterModel> value) {
        UnoccupiedShelterModels = value;
    }

    private List<ExpenseModel> ExpenseModels = new ArrayList<>();

    public List<ExpenseModel> getExpenseModels() {
        return ExpenseModels;
    }

    public void setExpenseModels(List<ExpenseModel> value) {
        ExpenseModels = value;
    }

    private List<ExpenseAmountModel> ExpenseAmountModels = new ArrayList<>();

    public List<ExpenseAmountModel> getExpenseAmountModels() {
        return ExpenseAmountModels;
    }

    public void setExpenseAmountModels(List<ExpenseAmountModel> value) {
        ExpenseAmountModels = value;
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

}

