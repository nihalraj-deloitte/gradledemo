package com.deloitteinnovation.us.hbx.edbc.eligibility.maxaptcamount.businessrules.constants;

public enum FPLLimit {

    FPL_100("100% FPL"),
    FPL_133("133% FPL"),
    FPL_138("138% FPL"),
    FPL_150("150% FPL"),
    FPL_185("185% FPL"),
    FPL_200("200% FPL"),
    FPL_230("230% FPL"),
    FPL_250("250% FPL"),
    FPL_300("300% FPL"),
    FPL_400("400% FPL");


    private final String value;

    FPLLimit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}


