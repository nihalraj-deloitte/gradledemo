package com.deloitteinnovation.us.hbx.edbc.eligibility.maxaptcamount.businessrules.constants;

import java.math.BigDecimal;


public enum InitialFPL_and_FinalFPL {

    FPL_2_03(BigDecimal.valueOf(2.03)),
    FPL_3_05(BigDecimal.valueOf(3.05)),
    FPL_4_07(BigDecimal.valueOf(4.07)),
    FPL_6_41(BigDecimal.valueOf(6.41)),
    FPL_8_18(BigDecimal.valueOf(8.18)),
    FPL_9_66(BigDecimal.valueOf(9.66));


    private final BigDecimal value;

    InitialFPL_and_FinalFPL(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

}