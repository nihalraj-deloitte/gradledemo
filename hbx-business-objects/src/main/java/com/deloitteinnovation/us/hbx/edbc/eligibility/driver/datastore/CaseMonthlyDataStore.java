//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:44:53 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCRepresentativeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.ETPAbawdCountyMappingModel;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class CaseMonthlyDataStore {
    private LocalDateTime EligibilityDeterminationMonth;
    private List<String> ProgramCodes;
    private List<Long> IndividualsActiveInCase;
    private HashMap<Long, IndividualDataStore> IndividualDataStores;
    private IncomeDataStore IncomeDataStore;
    private ResourceDataStore ResourceDataStore;
    private ExpenseDataStore ExpenseDataStore;
    private List<DCRepresentativeModel> MonthlyDCRepresentativeModels;
    private List<ETPAbawdCountyMappingModel> MonthlyETPAbawdCountyMappingModels;
    private EligibilityMonthlyDataStoreDelegate GetEligibilityMonthlyDataStore;

    @FunctionalInterface
    public interface EligibilityMonthlyDataStoreDelegate {
        EligibilityMonthlyDataStore[] invoke(Long caseNumber, Long individualId, String programCode, LocalDateTime edm,
                                             Integer[] edgeTraceIds, String budgetType);
    }

    public CaseMonthlyDataStore() {

    }

    public CaseMonthlyDataStore(LocalDateTime edm) {
        EligibilityDeterminationMonth = edm;
    }

    public LocalDateTime getEligibilityDeterminationMonth() {
        return EligibilityDeterminationMonth;
    }

    public void setEligibilityDeterminationMonth(LocalDateTime eligibilityDeterminationMonth) {
        EligibilityDeterminationMonth = eligibilityDeterminationMonth;
    }

    public List<String> getProgramCodes() {
        return ProgramCodes;
    }

    public void setProgramCodes(List<String> programCodes) {
        ProgramCodes = programCodes;
    }

    public List<Long> getIndividualsActiveInCase() {
        return IndividualsActiveInCase;
    }

    public void setIndividualsActiveInCase(List<Long> individualsActiveInCase) {
        IndividualsActiveInCase = individualsActiveInCase;
    }

    public HashMap<Long, IndividualDataStore> getIndividualDataStores() {
        return IndividualDataStores;
    }

    public void setIndividualDataStores(HashMap<Long, IndividualDataStore> individualDataStores) {
        IndividualDataStores = individualDataStores;
    }

    public IncomeDataStore getIncomeDataStore() {
        return IncomeDataStore;
    }

    public void setIncomeDataStore(IncomeDataStore incomeDataStore) {
        IncomeDataStore = incomeDataStore;
    }

    public ResourceDataStore getResourceDataStore() {
        return ResourceDataStore;
    }

    public void setResourceDataStore(ResourceDataStore resourceDataStore) {
        ResourceDataStore = resourceDataStore;
    }

    public ExpenseDataStore getExpenseDataStore() {
        return ExpenseDataStore;
    }

    public void setExpenseDataStore(ExpenseDataStore expenseDataStore) {
        ExpenseDataStore = expenseDataStore;
    }

    public List<DCRepresentativeModel> getMonthlyDCRepresentativeModels() {
        return MonthlyDCRepresentativeModels;
    }

    public void setMonthlyDCRepresentativeModels(List<DCRepresentativeModel> monthlyDCRepresentativeModels) {
        MonthlyDCRepresentativeModels = monthlyDCRepresentativeModels;
    }

    public List<ETPAbawdCountyMappingModel> getMonthlyETPAbawdCountyMappingModels() {
        return MonthlyETPAbawdCountyMappingModels;
    }

    public void setMonthlyETPAbawdCountyMappingModels(
            List<ETPAbawdCountyMappingModel> monthlyETPAbawdCountyMappingModels) {
        MonthlyETPAbawdCountyMappingModels = monthlyETPAbawdCountyMappingModels;
    }

    public EligibilityMonthlyDataStoreDelegate getGetEligibilityMonthlyDataStore() {
        return GetEligibilityMonthlyDataStore;
    }

    public void setGetEligibilityMonthlyDataStore(EligibilityMonthlyDataStoreDelegate getEligibilityMonthlyDataStore) {
        GetEligibilityMonthlyDataStore = getEligibilityMonthlyDataStore;
    }

}
