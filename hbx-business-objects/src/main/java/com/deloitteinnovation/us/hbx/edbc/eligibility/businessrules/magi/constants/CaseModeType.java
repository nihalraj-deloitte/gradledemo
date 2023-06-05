package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum CaseModeType {

    INTAKE("IN"),
    PERIODIC_REVIEW("PR"),
    ONGOING("AC"),
    REINSTATE("RI"),
    REOPEN("RO"),
    RECERT("RC"),
    CHANGE("CN"),
    CONVERSION("CV"),
    RENEWAL("RN");


    private final String value;

    CaseModeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
