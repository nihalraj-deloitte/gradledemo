package com.deloitteinnovation.us.hbx.edbc.eligibility.prescreening.businessrules.constants;

public enum CSRTier {
    TIER_1("TIER_1"), TIER_2("TIER_2"), TIER_3("TIER_3");

    private final String value;

    CSRTier(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
