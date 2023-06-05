package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum SuspensionIndicator {

    UNKNOWN_ADDRESS("UA"),
    INCARCERATION("IN");

    private final String value;

    SuspensionIndicator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
