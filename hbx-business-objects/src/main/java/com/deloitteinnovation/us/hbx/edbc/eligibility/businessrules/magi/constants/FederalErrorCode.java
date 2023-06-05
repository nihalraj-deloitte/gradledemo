package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum FederalErrorCode {

    SYSTEMIC_ERROR("HE020001"),
    AUTHENTICATIONISSUE("HE020002"),
    SPOUSE_MISMATCH("HE020003"),
    RETURNINFO_UNAVAILABLE("HE020004"),
    NOINFO_AVAILABLE("HE020006"),
    NO_APTC_RECONCILE("HE020007"),
    NO_DEPENDENT_FILING_REQUIREMENT("HE020008");


    private final String value;


    FederalErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
