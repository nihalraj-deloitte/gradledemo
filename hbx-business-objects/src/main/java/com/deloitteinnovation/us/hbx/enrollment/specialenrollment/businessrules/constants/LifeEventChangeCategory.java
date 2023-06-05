package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.businessrules.constants;

public enum LifeEventChangeCategory {
    HOUSEHOLD("household"),
    INDIVIDUAL("individual");

    String value;

    LifeEventChangeCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static String getNameByCode(String code) {
        for (LifeEventChangeCategory e : LifeEventChangeCategory.values()) {
            if (code.equalsIgnoreCase(e.value)) {
                return e.name();
            }
        }
        return null;
    }

}
