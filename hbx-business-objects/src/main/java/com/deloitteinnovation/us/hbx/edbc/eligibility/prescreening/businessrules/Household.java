package com.deloitteinnovation.us.hbx.edbc.eligibility.prescreening.businessrules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Household {
    private List<Individual> individuals = new ArrayList<>();
    private List<FPLLimit> fPLLimit = new ArrayList<>();
    private BigDecimal householdIncome;
    private Integer householdSize;

    public Integer getHouseholdSize() {
        return householdSize;
    }

    public void setHouseholdSize(Integer householdSize) {
        this.householdSize = householdSize;
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(List<Individual> individuals) {
        this.individuals = individuals;
    }

    public List<FPLLimit> getfPLLimit() {
        return fPLLimit;
    }

    public void setfPLLimit(List<FPLLimit> fPLLimit) {
        this.fPLLimit = fPLLimit;
    }

    public BigDecimal getHouseholdIncome() {
        return householdIncome;
    }

    public void setHouseholdIncome(BigDecimal householdIncome) {
        this.householdIncome = householdIncome;
    }


}