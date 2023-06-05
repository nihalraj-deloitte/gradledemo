package com.deloitteinnovation.us.hbx.shopping.shoppingflowrestriction.businessrules.constants;

public enum GroupQualifyingLife {
    EXCEPTION("Exception"),
    OTHER_CHANGE("Other Change"),
    DEPENDENT_ADDITION("Dependent Addition"),
    CSR_CHANGE_TO_OTHER("CSR Change To Other"),
    CSR_CHANGE_TO_TIER_1("CSR Change To Tier 1"),
    OTHER_ENROLLED("Other Enrolled"),
    OTHER_REMOVE("Other Remove"),
    UNCERTAIN("uncertain");

    private final String value;

    GroupQualifyingLife(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
