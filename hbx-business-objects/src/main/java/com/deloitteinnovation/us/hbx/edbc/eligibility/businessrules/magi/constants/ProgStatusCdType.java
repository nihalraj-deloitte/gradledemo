package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum ProgStatusCdType {

    APPROVED("AP"),
    DENIED("DN"),
    PENDING("PE"),
    DISCONTINUED("DC"),
    RESCIND("RE");

    private final String value;

    ProgStatusCdType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
