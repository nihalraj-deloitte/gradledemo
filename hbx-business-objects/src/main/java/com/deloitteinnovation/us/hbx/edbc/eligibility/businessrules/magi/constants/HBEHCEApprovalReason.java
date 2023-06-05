package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum HBEHCEApprovalReason {

    IC("IC"),
    MF("MF"),
    RCT("RCT"),
    PR("PR"),
    FTP("FTP"),
    FTR("FTR"),
    PE("PE"),
    RM("RM"),
    BDA("BDA"),
    MSP("MSP"),
    LOC("LOC"),
    DAIL("DAIL"),
    LTC("LTC"),
    ARDV("ARDV");


    private final String value;

    HBEHCEApprovalReason(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
