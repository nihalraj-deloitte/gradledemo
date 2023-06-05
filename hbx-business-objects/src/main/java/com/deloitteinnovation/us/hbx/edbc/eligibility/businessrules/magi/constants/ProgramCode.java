package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum ProgramCode {


    QHP("QP"),
    MA("MA"),
    ESI("ES");


    private final String value;

    ProgramCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
