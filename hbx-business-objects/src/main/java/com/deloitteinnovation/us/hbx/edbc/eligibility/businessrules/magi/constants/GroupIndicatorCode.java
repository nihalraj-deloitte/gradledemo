package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum GroupIndicatorCode {

    CHILD("Child"),
    PREGNANT("Pregnant"),
    PARENTCARETAKER("ParentCaretaker"),
    ADULT("Adult"),
    QHP("QHP"),
    CHILD_LESS_THAN_1("Child less than 1"),
    CHILD_1_THRU_5("Child 1 through 5"),
    CHILD_LESS_THAN19("Child less than 19");


    private final String value;

    GroupIndicatorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
