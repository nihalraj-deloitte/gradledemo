package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum SSNGoodCause {


    RG("X"), //Refused for Religious Reasons
    AL("U"), //U: Undocumented Alien
    //G: SSN Good Cause	| Old Value "NO" : Does not have an SSN and may only be issued an SSN for a valid non-work reason
    NO("G"),
    //H: Hospital Application | Old Value "NB" : Newborn without SSN
    NB("H"),
    RE("R"), //R: Refuse to Supply SSN/Not Required for a B99 AU
    AP("N"); //N: SSN Application Pending


    private final String value;

    SSNGoodCause(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
