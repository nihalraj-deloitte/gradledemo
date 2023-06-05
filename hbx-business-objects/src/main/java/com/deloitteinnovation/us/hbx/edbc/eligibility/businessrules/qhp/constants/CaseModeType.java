package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum CaseModeType {

    INTAKE("IN"),
    PERIODICI_REVIEW("PR"),
    ONGOING("AC"),
    RESCIND("RE"),
    REOPEN("RO"),
    RECERT("RC"),
    CONVERSION("CV"),
    REINSTATE("RI"),
    RENEWAL("RN"),
    CHANGE("CN");

    private final String value;

    CaseModeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
