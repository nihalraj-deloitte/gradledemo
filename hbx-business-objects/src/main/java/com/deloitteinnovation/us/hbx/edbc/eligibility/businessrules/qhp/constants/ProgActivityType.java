package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum ProgActivityType {

    INTAKE("IN"),
    PERIODICI_REVIEW("PR"),
    INCOMPLETE_REVIEW("IR"),
    RESCIND("RE"),
    ONGOING("AC"),
    CONVERSION("CV"),
    CHANGE_ACTION("CN"),
    REINSTATE("RI"),
    RENEWAL_NOT_INITIATED("RNI");

    private final String value;

    ProgActivityType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
