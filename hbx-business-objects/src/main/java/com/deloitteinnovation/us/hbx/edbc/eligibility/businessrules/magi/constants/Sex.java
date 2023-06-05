package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum Sex {
    MALE("M"),
    FEMALE("F");

    private final String value;

    Sex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
