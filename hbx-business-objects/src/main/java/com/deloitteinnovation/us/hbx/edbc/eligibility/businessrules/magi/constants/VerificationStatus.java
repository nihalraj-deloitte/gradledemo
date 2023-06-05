package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;


public enum VerificationStatus {
    VERIFIED("VE"),
    NOT_VERIFIED("NV"),
    FAILED("FA");

    private final String value;

    VerificationStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
