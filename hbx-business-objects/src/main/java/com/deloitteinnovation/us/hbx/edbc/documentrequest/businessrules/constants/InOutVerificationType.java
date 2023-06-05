package com.deloitteinnovation.us.hbx.edbc.documentrequest.businessrules.constants;

public enum InOutVerificationType {

    SSN("SSN"),
    INCOME("INCOME"),
    CITIZENSHIP("CITIZENSHIP"),
    VLP("VLP"),
    MEC_TRICARE("MEC-TRICARE"),
    MEC_VETERANS("MEC-VETERANS"),
    MEC_MEDICARE("MEC-MEDICARE"),
    MEC_MEDICAID("MEC-MEDICAID"),
    MEC_PEACE_CORPS("MEC-PEACE CORPS"),
    TRIBAL("TRIBAL"),
    INCARCERATION("INCARCERATION");


    private final String value;

    InOutVerificationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
