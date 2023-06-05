package com.deloitteinnovation.us.hbx.edbc.eligibility.maxaptcamount.businessrules.constants;

public enum FPLType {

    FPL_100("100FPL"),
    FPL_109("109FPL"),
    FPL_120("120FPL"),
    FPL_133("133FPL"),
    FPL_135("135FPL"),
    FPL_138("138FPL"),
    FPL_142("142FPL"),
    FPL_147("147FPL"),
    FPL_150("150FPL"),
    FPL_159("159FPL"),
    FPL_185("185FPL"),
    FPL_195("195FPL"),
    FPL_200("200FPL"),
    FPL_213("213FPL"),
    FPL_218("218FPL"),
    FPL_250("250FPL"),
    FPL_300("300FPL"),
    FPL_400("400FPL"),
    FPL_420("420FPL");


    private final String value;

    FPLType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}