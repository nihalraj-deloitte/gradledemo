package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum CDTLevelOfCare {
    PRTFI("PRTF1"),
    PRTFII("PRTF2"),
    IMD("IMD"),
    MENTAL_HEALTH_PSYCHIATRIC("MHP");


    private final String value;

    CDTLevelOfCare(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
