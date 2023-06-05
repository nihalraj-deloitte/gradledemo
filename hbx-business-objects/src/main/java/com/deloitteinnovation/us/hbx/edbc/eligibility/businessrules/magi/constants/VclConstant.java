package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum VclConstant {


    RISK_LEVEL_LOW("L"),
    RISK_LEVEL_MEDIUM("M"),
    RISK_LEVEL_HIGH("H");

    private final String value;

    VclConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
