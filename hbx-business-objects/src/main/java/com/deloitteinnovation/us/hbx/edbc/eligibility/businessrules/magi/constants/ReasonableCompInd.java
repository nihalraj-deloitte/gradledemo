package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum ReasonableCompInd {


    PASS("P"),
    FAIL("F"),
    DOWN("D"),
    ERROR("E"),
    NO_RECORDS("N"),
    CUSTOM_ERROR("C"),
    SERVER_DOWN("S"),
    OPTED_OUT("O");


    private final String value;


    ReasonableCompInd(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
