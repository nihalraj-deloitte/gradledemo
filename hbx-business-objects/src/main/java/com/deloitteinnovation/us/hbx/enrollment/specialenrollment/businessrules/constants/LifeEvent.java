package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.businessrules.constants;

public enum LifeEvent {
    ADDITIONDUETOADOPTION_BIRTH_COURTORDER(1, "ADDITION DUE TO ADOPTION/BIRTH/COURT ORDER"),
    ADDRESSCHANGE_LOSSOFCURRENTCOVERAGE(2, "ADDRESS CHANGE - LOSS OF CURRENT COVERAGE"),
    WAH_TO_QHP_APTC(3, "WAH TO QHP APTC"), ADDITION_DUE_TO_MARRIAGE(4, "ADDITION DUE TO MARRIAGE"),
    MARRIAGE(5, "MARRIAGE"), ADDITION_DUE_TO_LOSS_OF_MEC(6, "ADDITION DUE TO LOSS OF MEC"),
    LOSS_OF_MEC(7, "LOSS OF MEC"), ADDRESS_CHANGE_GAIN_OF_NEW_PLAN(8, "ADDRESS CHANGE - GAIN OF NEW PLAN"),
    DEATH(9, "DEATH"), ADDITION_DUE_TO_REASON_OTHER(10, "ADDITION DUE TO REASON OTHER"), DIVORCE(11, "DIVORCE"),
    REMOVAL_DUE_TO_INCARCERATION(12, "REMOVAL DUE TO INCARCERATION"),
    REMOVAL_DUE_TO_NO_LONGER_PART_OF_TAX_FILING_HOUSEHOLD(13, "REMOVAL DUE TO NO LONGER PART OF TAX FILING HOUSEHOLD"),
    REMOVAL_DUE_TO_MOVING_OUT_OF_STATE(14, "REMOVAL DUE TO MOVING OUT OF STATE"),
    REMOVAL_DUE_TO_REASON_OTHER(15, "REMOVAL DUE TO REASON OTHER"), INCOME_CHANGE(16, "INCOME CHANGE"),
    CHANGE_TO_TAX_FILING_HOUSEHOLD(17, "CHANGE TO TAX FILING HOUSEHOLD"),
    TAX_FILING_RECONCILIATION(18, "TAX FILING RECONCILIATION"),
    CHANGE_IN_LAWFUL_PRESENCE(19, "CHANGE IN LAWFUL PRESENCE"), DOMESTIC_VIOLENCE(20, "DOMESTIC VIOLENCE"),
    EXCEPTIONAL_CIRCUMSTANCE(21, "EXCEPTIONAL CIRCUMSTANCE"), YEAR_26_OLD(22, "26 YEAR OLD"),
    QHP_DECERTIFICATION(23, "QHP DECERTIFICATION"), EXCHANGE_ERROR(25, "EXCHANGE ERROR"),
    ACCOUNT_WORKER_INCOME(26, "ACCOUNT WORKER INCOME"),
    ACCOUNT_WORKER_CHANGE_IN_TAX_FILING_HOUSEHOLD(27, "ACCOUNT WORKER CHANGE IN TAX FILING HOUSEHOLD");

    int value;
    String displayValue;

    LifeEvent(int value, String displayValue) {
        this.value = value;
        this.displayValue = displayValue;
    }

    public int getValue() {
        return value;
    }

    public static String getNameByCode(int code) {
        for (LifeEvent e : LifeEvent.values()) {
            if (code == e.value) {
                return e.displayValue;
            }
        }
        return null;
    }

    public static Integer getCodeByName(String name) {
        for (LifeEvent e : LifeEvent.values()) {
            if (e.name().equalsIgnoreCase(name)) {
                return e.value;
            }
        }
        return null;

    }
}