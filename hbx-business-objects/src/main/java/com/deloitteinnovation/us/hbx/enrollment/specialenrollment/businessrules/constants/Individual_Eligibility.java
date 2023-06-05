package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.businessrules.constants;

public enum Individual_Eligibility {
    WASHINGTON_APPLE_HEALTH(1),
    QHP(2),
    APTC(3),
    NA(4),
    APTC_NEW_TIER(5);
    private final int value;

    Individual_Eligibility(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
