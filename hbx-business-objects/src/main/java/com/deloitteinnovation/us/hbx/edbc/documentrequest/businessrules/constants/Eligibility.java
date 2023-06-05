package com.deloitteinnovation.us.hbx.edbc.documentrequest.businessrules.constants;

public enum Eligibility {


    CONDITIONAL("CONDITIONAL"),
    APPROVED("APPROVED"),
    DENIED("DENIED"),
    N_A("N/A"),
    PENDING("PENDING");


    private final String value;

    Eligibility(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
