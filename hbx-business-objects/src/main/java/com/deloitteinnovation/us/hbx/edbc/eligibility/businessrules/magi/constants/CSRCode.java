package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum CSRCode {


    CSRA("T6"),
    CSRB("T5"),
    CSRC("T4"),
    CSRD("T2"),
    CSRE("T3"),
    CSRF("T1");

    private final String value;

    CSRCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}