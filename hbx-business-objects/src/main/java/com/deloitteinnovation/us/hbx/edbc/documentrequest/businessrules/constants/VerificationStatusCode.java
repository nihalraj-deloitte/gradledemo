package com.deloitteinnovation.us.hbx.edbc.documentrequest.businessrules.constants;

public enum VerificationStatusCode {

    VERIFIED("VERIFIED"),
    NOT_VERIFIED("NOT VERIFIED"),
    FAILED("FAILED"),
    N_A("N/A");

    private final String value;

    VerificationStatusCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}