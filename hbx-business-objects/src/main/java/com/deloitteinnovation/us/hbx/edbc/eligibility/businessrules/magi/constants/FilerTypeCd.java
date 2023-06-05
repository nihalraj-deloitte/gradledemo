package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum FilerTypeCd {


    NON_FILER("NonFiler"),
    FILER("Filer");


    private final String value;

    FilerTypeCd(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
