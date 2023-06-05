package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum CostSharePlan {

    PREMIUM("PREM"),
    COPAY("COPA"),
    NO_COST_SHARE_REQUIRED("NCSR"),
    COST_SHARE_OPTIONAL("CSO");


    private final String value;

    CostSharePlan(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
