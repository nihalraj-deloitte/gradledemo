package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.constants;

import java.time.LocalDateTime;

public enum VclConstantDate {

    HIGH_DATE(LocalDateTime.parse("9999-12-31T00:00:00.00"));

    private final LocalDateTime value;

    VclConstantDate(LocalDateTime value) {
        this.value = value;
    }

    public LocalDateTime getValue() {
        return value;
    }

}

