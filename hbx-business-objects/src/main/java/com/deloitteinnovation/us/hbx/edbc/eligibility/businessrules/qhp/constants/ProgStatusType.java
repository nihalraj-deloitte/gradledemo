package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum ProgStatusType {

    APPROVED("AP"),
    DENIED("DN"),
    PENDING("PE"),
    DISCONTINUED("DC"),
    RESCIND("RE");

    private final String value;

    ProgStatusType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
