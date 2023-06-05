package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum ProgActivityType {

    INTAKE("IN"),
    PERIODIC_REVIEW("RN"),
    INCOMPLETE_REVIEW("IR"),
    RESCIND("RE"),
    ONGOING("AC"),
    CONVERSION("CV"),
    CHANGE_ACTION("CN"),
    REINSTATE("RI"),
    RNI("RNI");


    private final String value;

    ProgActivityType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
