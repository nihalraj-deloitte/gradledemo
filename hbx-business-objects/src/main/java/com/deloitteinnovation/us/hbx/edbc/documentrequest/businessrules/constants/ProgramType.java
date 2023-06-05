package com.deloitteinnovation.us.hbx.edbc.documentrequest.businessrules.constants;

public enum ProgramType {

    QHP("QHP"),
    APTC("APTC"),
    MAGI("MAGI"),
    QDP("QDP"),
    N_A("N/A");


    private final String value;

    ProgramType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
