package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum CDTWithdrawalReasonCodeType {

    PERSON_RECEIVES_MA_BENEFITS("PER"),
    MOVED_OUT_OF_STATE("MO"),
    CLIENT_REQUEST("CR"),
    INCORRECT_APPROVAL("IAP"),
    MOVED_TO_ANOTHER_HH("MABH"),
    NON_COOPERATION("NCO");

    private final String value;

    CDTWithdrawalReasonCodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
