package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp.constants;

public enum RelationshipType {

    MOTHER("MO"),
    FATHER("FA"),
    WIFE("WI"),
    HUSBAND("HU"),
    STEPMOTHER("SM"),
    STEPFATHER("SF"),
    GRANDMOTHER_OR_GREAT_GRANDMOTHER("GM"),
    GRANDFATHER_OR_GREAT_GRANDFATHER("GF"),
    STEP_GRANDMOTHER_OR_STEP_GREAT_GRANDMOTHER("SX"),
    STEP_GRANDFATHER_OR_STEP_GREAT_GRANDFATHER("SG"),
    LEGAL_GUADIAN("LG"),
    UNRELATED_PLACEMENT_COURT_ORDERED("FD"),
    FOSTER_PARENT("FP"),
    LIVING_TOGETHER_PARTNER("LT"),
    SELF("SE"),
    SPOUSE("SP");

    private final String value;

    RelationshipType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
