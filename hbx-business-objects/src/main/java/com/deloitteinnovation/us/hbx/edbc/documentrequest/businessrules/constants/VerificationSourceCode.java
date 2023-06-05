package com.deloitteinnovation.us.hbx.edbc.documentrequest.businessrules.constants;

public enum VerificationSourceCode {

    MANUAL("MANUAL"),
    FEDERAL("FEDERAL"),
    NOT_VERIFIED("NOT VERIFIED"),


    N_A("N/A");

    private final String value;

    VerificationSourceCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}