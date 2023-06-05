package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum GroupIndicator {

    CERTIFIED("C"),
    INCLUDED("E"),
    EXCLUDED("X");


    private final String value;

    GroupIndicator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
