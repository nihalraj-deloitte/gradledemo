package com.deloitteinnovation.us.hbx.edbc.eligibility.prescreening.businessrules.constants;

public enum BenefitType {

    QHP("QHP"),
    APTC("APTC"),
    CHIP("CHIP"),

    MAGI("MAGI");

    private final String value;

    BenefitType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}