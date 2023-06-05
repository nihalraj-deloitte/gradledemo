package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum TypeOfCoverageCode {

    MEDICARE_PART_A("PA"),
    MEDICARE_PART_B("PB"),
    MEDICARE_A_AND_B("MED"),
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
    PC("PEC"),
    PH("PH"),
    TM("TM"),
    RH("RH"),
    TR("TRI"),
    UM("UM"),
    VA("VET"),
    VI("VI"),
    SMA("SMA"),
    ;


    private final String value;

    TypeOfCoverageCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
