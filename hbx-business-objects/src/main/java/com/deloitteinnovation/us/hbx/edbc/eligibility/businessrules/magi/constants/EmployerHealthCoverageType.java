package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum EmployerHealthCoverageType {


    SELF("S"),
    POTENTIAL("P"),
    ROASTER("R"),
    INVALID("I");


    private final String value;

    EmployerHealthCoverageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
