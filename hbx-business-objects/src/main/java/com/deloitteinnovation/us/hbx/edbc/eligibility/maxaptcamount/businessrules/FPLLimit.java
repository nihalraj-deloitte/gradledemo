package com.deloitteinnovation.us.hbx.edbc.eligibility.maxaptcamount.businessrules;

import java.math.BigDecimal;

public class FPLLimit {

    private BigDecimal value;
    private String label;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
