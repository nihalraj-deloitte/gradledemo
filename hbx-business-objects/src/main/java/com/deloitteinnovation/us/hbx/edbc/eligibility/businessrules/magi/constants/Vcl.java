package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum Vcl {


    NF_AGE("V001"),
    NF_CITIZENSHIP("V003"),
    NF_ALIENSTATUS("V004"),
    NF_PREGNANCY("V016"),
    NF_RESIDENCE("V018"),
    NF_SSN("V108"),
    NF_SSN_APPLIED("V426"),
    NF_RELATIONSHIP("V020"),
    NF_DEATH("V089"),
    NF_INCARCERATION("V542"),
    NF_AIAN("V543"),
    NF_INCOME("V544"),
    VCL_NCP_GOOD_CAUSE("V545"),
    VCL_EXPENSE("V546"),
    VCL_APTC_INCOME("V549"),
    VCL_AUTH_REP("V547"),
    VCL_LOSS_OF_EMPL("V077"),
    VCL_SELF_EXPENSE("V091"),
    NF_ZERO_INCOME("V548"),
    VCL_CASE_PROFILE_INCOME("V550"),
    VCL_CASE_PROFILE_DEDUCTIONS("V551"),
    ALIEN_G845A("V16A"),
    ALIEN_G845B("V16B"),
    ALIEN_STATEMENT_CODE5("V005"),
    ALIEN_STATEMENT_CODE32("V032"),
    ALIEN_STATEMENT_CODE37("V037"),
    ALIEN_STATEMENT_CODE119("V119"),
    NF_ESIMEC("V008"),
    NF_NON_ESIMEC("V009"),
    NF_MEDICARE("V011");


    private final String value;

    Vcl(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
