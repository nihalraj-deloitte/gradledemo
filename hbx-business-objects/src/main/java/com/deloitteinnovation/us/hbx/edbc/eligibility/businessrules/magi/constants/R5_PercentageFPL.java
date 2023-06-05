package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum R5_PercentageFPL {

    FPL_100("100FPL"),
    FPL_133("133FPL"),
    FPL_150("150FPL"),
    FPL_185("185FPL"),
    FPL_200("200FPL"),
    FPL_250("250FPL"),
    FPL_300("300FPL"),
    FPL_400("400FPL");


    private final String value;

    R5_PercentageFPL(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
