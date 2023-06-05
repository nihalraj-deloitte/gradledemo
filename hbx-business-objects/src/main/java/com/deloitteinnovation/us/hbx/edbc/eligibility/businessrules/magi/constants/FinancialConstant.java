package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum FinancialConstant {


    EMPLOYMENT("EM"),
    UNEARNED("UN"),
    NOT_APPLICABLE("NA"),
    EARNED("EN"),
    SELF_EMPLOYMENT("SE"),
    OTHER_INCOME("OI"),
    APTC_INCOME("APTC");

    private final String value;

    FinancialConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
