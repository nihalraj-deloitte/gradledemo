package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum OrganizationCode {

    MA("MEDC"),
    CHIP("CHIP"),
    BHPC("BHPC"),
    MC("MEDI"),
    VHPC("VHPC"),
    TRIC("TRIC"),
    PECO("PECO");


    private final String value;

    OrganizationCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
