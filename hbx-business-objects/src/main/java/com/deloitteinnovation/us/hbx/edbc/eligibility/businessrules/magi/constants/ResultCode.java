package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum ResultCode {

    FAIL("FL"),
    PASS("PS"),
    PENDING("PE"),
    NOT_APPLICABLE("NA");

    private final String value;

    ResultCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
