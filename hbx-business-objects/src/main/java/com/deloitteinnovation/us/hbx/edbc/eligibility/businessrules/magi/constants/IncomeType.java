package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

public enum IncomeType {


    SENIOR_COMMUNITY_SERVICE("SC"),
    RENTAL_INCOME("RAI"),
    SELF_EMPLOYMENT("SE"),
    WAGES_SALARIES_TIPS("WS"),
    ANNUITY_PAYMENT("AN"),
    BLACK_LUNG("BL"),
    CDO_PAYMENT("CP"),
    DIVIDENDS("DI"),
    LIFE_ESTATEINTEREST("EI"),
    FARM_BUSINESS("FAR"),
    TRUST_INCOME("FI"),
    IN_KIND("IK"),
    INTEREST("IN"),
    INDEMNITY_POLICY("IP"),
    INCOME_SUPPLEMENTATION("IS"),
    LOANS("LO"),
    LOTTERY_PAYMENT("LP"),
    MINERAL_RIGHTS("MR"),
    NURSING_FACILITY("NF"),
    OIL_LLEASES("OL"),
    PENSION_RETIREMENT("PE"),
    REVERSE_MORTGAGE("RM"),
    RAILROAD_RETIREMENT("RQ"),
    RSDI("RS"),
    SSI("SI"),
    SETTLEMENT_PAYMENT("SP"),
    UNEMPLOYMENT_INSURANCE("UI"),
    VETERANS_ADMINISTRATION("VA"),
    VA_PENSION("VC"),
    APTC("APTC"),
    CENSUS_INCOME("CI"),
    PANDEMIC_UI("PAUI"),
    AR("AR");


    private final String value;

    IncomeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
