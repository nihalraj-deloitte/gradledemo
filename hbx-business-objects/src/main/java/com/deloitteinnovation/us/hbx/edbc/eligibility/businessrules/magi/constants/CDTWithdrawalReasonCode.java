package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum CDTWithdrawalReasonCode {

    PERSON_RECEIVES_MA_BENEFITS("PER"),
    MOVED_OUT_OF_STATE("MO"),
    NON_COOPERATION_CLIENT("MV"),
    CLIENT_REQUEST("CR"),
    UNABLE_TO_LOCATE_CLIENT("ULQR"),
    INCORRECT_APPROVAL("IAP"),
    MOVED_TO_ANOTHER_HH("MABH"),
    NON_COOPERATION("NCO");


    private final String value;

    CDTWithdrawalReasonCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
