package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum RelationshipType {

    SON("SO"),
    DAUGHTER("DA"),
    MOTHER("MO"),
    FATHER("FA"),
    BROTHEROR_HALF_BROTHER("BR"),
    SISTEROR_HALF_SISTER("SI"),
    GRANDSONOR_GREAT_GRANDSON("GS"),
    GRANDDAUGHTEROR_GREAT_GRANDDAUGHTER("GD"),
    GRANDFATHEROR_GREAT_GRANDFATHER("GF"),
    GRANDMOTHEROR_GREAT_GRANDMOTHER("GM"),
    STEPSON("SS"),
    STEPDAUGHTER("SD"),
    STEPMOTHER("SM"),
    STEPFATHER("SF"),
    HUSBAND("HU"),
    WIFE("WI"),
    AUNT("AU"),
    UNCLE("UN"),
    NIECE("NI"),
    NEPHEW("NE"),
    FOSTER_CHILD("FK"),
    FOSTER_PARENT("FP"),
    OTHER("VR"),
    POTENTIAL_PUTATIVEFATHER("PF"),
    UNRELATED_PLACEMENT_COURT_ORDERED("FD"),
    STEP_SISTER("ST"),
    STEP_BROTHER("SB"),
    FIRST_COUSIN("CO"),
    FIRST_COUSIN_ONCE_REMOVED("FC"),
    LEGALLY_GUARDED("LD"),
    LEGAL_GUARDIAN("LG"),
    PENDING_LEGAL_GUARDIAN("PL"),
    LIVING_TOGETHER_PARTNER("LT"),
    STEP_GRANDMOTHERORSTEP_GREAT_GRANDMOTHER("SX"),
    STEP_GRANDFATHERORSTEP_GREAT_GRANDFATHER("SG"),
    ADOPTED_SON("AS"),
    ADOPTED_DAUGHTER("AD"),
    UNRELATED("UR"),
    STEP_GRANDDAUGHTER("SH"),
    STEP_GRANDSON("SR"),
    SPOUSE("SP"),
    SELF("SE");


    private final String value;

    RelationshipType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
