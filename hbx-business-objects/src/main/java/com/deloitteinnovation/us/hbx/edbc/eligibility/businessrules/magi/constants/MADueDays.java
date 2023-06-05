package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum MADueDays {

    APPROVALDUEDAYS(90),
    PENDDUEDAYS(30),
    ALIEN60DUEDAYS(60);

    private final Integer value;

    MADueDays(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

}
