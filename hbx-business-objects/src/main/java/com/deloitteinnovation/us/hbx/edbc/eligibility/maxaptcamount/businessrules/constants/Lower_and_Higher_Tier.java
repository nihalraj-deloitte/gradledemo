package com.deloitteinnovation.us.hbx.edbc.eligibility.maxaptcamount.businessrules.constants;


public enum Lower_and_Higher_Tier {
    TIER_0(0),
    TIER_133(133),
    TIER_150(150),
    TIER_200(200),
    TIER_250(250),
    TIER_300(300),
    TIER_400(400);

    private final Integer value;

    Lower_and_Higher_Tier(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
