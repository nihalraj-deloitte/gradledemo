package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum ReviewStatusCode {
    REVIEWINITIATED("RI");

    private final String value;

    ReviewStatusCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
