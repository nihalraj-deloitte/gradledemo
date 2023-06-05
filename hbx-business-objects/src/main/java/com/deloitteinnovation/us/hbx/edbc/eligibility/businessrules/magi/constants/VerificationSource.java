package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum VerificationSource {

    TRUSTED_SOURCE("TS"),
    DATA_COLLECTION("DC");


    private final String value;

    VerificationSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
