package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum PartStatusCode {

    ELIGIBLE_ADULT("EA"),
    ELIGIBLE_CHILD("EC"),
    OTHER_ADULT("OA"),
    OTHER_CHILD("OC"),
    EXCLUDED_ADULT("XA"),
    EXCLUDED_CHILD("XC"),
    DISQUALIFY_ADULT("DA"),
    DISQUALIFY_CHILD("DC");

    private final String value;

    PartStatusCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
