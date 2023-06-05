package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum ProgramModeType {


    INTAKE("IN"),
    ONGOING("AC");

    private final String value;

    ProgramModeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
