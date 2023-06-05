package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum IncarcerationStatusType {

    CONVICTED("CV"),
    PENDING("PD");

    private String value;

    IncarcerationStatusType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
