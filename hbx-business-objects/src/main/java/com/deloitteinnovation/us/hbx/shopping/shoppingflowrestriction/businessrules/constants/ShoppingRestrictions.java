package com.deloitteinnovation.us.hbx.shopping.shoppingflowrestriction.businessrules.constants;

public enum ShoppingRestrictions {
    NO_RESTRICTIONS("No Restrictions"),
    SILVER_OR_SAME_METAL_LEVEL_OR_1_METAL_LEVEL("Silver or Same Metal Level or +/- 1 Metal Level"),
    SAME_METAL_LEVEL_OR_1_METAL_LEVEL("Same Metal Level or +/- 1 Metal Level"),
    SILVER_OR_SAME_METAL_LEVEL("Silver or Same Metal Level"),
    SAME_METAL_LEVEL("Same Metal Level"),
    SAME_PLAN("Same Plan"),
    NOT_ALLOWED_TO_SHOP("Not Allowed to Shop"),
    UNCERTAIN("uncertain");

    private final String value;

    ShoppingRestrictions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
