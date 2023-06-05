package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum FedVerifStatus {


    PASS("P"),
    FAIL("F"),
    DONT_CARE("X"),
    YES("Y");

    private final String value;

    FedVerifStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
