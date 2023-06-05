package com.deloitteinnovation.us.hbx.shopping.shoppingflowrestriction.businessrules.constants;

public enum CurrentMetalLevel {
    CATASTROPHIC_LEVEL("CATASTROPHIC"),
    SILVER_LEVEL("SILVER");

    private final String value;

    CurrentMetalLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
