package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum RecipientStatusCode {

    PREG_TP_45("P3"),
    CHIP("P7"),
    CHL2("P2"),
    CHL4("P1");


    private final String value;

    RecipientStatusCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
