package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum NcpGoodCauseReason {

    PHYSICAL_HARM_TO_CHILD("1"),
    EMOTIONAL_HARM_TO_CHILD("2"),
    PHYSICAL_HARM_TO_SR("3"),
    EMOTIONAL_HARM_TO_SR("4"),
    RAPE("5"),
    ADOPTION_IN_PROCESS("6"),
    INCEST("A");

    private final String value;

    NcpGoodCauseReason(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
