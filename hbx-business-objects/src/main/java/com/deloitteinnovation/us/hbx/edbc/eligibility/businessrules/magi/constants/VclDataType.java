package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum VclDataType {


    SSN("SSN"),
    CITIZEN("CITIZEN"),
    RESIDENCE("RESIDENCE"),
    INCARCERATION("INCARCERATION"),
    INCOME("INCOME"),
    EXPENSE("DEDUCTION"),
    DOB("DOB"),
    RELATIONSHIP("RELATIONSHIP"),
    ALIEN("ALIEN"),
    DEATH("DEATH"),
    AIAN("AIAN"),
    NCP("NCP"),
    SELF_EMPLOYMENT_EXPENSE("SELFEMPLOYMENTEXPENSE"),
    APTC("APTC"),
    CASEPROFILEINCOME("CASEPROFILEINCOME"),
    CASEPROFILEEXPENSE("CASEPROFILEDEDUCTIONS"),
    ESIMEC("ESIMEC"),
    NON_ESIMEC("NONESIMEC"),
    NON_ESIMECMEDI("NONESIMECMEDI");

    private final String value;

    VclDataType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
