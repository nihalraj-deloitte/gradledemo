package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum TPCodePriorityType {

    QHCP(1200),
    TP_HIGH(9999),
    NMME(9000);

    private final Integer value;

    TPCodePriorityType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

}
