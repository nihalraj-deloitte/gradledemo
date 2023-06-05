package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum CoverageCodeType {

    MEDICARE_PART_A("PA"),
    MEDICARE_PART_B("PB"),
    MEDICARE_A_AND_B("MB"),
    CA("CA"),
    CH("CH"),
    CO("CO"),
    DE("DE"),
    EM("EM"),
    IH("IH"),
    KA("KA"),
    LT("LT"),
    MK("MK"),
    MS("MS"),
    NC("NC"),
    OT("OT"),
    PC("PC"),
    PH("PH"),
    TM("TM"),
    RH("RH"),
    TR("TR"),
    UM("UM"),
    VA("VA"),
    VI("VI");

    private final String value;

    CoverageCodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
