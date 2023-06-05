package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum IncomeIndicator {

    EARNED("E"),
    UNEARNED("U"),
    UN("UN"),
    EN("EN");
    private final String value;

    IncomeIndicator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
