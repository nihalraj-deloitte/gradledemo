package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.businessrules.constants;

public enum Dates {
    FIFTEENTH_RULE("15th rule"), FIRSTMONTH_AFTER_LAST_DAY_OF_COVERAGE("1st of month after last day of coverage"),
    DATE_OF_EVENT("Date of Event"), FIRST_MONTH_OF_PS("1st of month PS"),
    FIRSTMONTH_PS_OR_FIRSTMONTHAFTER_DOE_WHICHEVER_LATER(
            "1st of month PS or 1st of month after DOE whichever is later"),
    FIFTEENTH_RULE_OR_FIRSTMONTH_PS_OR_FIRSTMONTHAFTER_DOE_WHICHEVER_LATER(
            "15th rule or 1st of month PS or 1st of month after DOE whichever is later"),
    LAST_DAY_OF_MONTH("Last Day of the Month"), DATE_OF_EVENT_MINUS1("Date of Event -1"),
    DATE_OF_EVENT_PLUS2("Date of Event +2"), DATE_OF_EVENT_PLUS1("Date of Event +1"),
    LAST_DAY_OF_MONTH_OF_PLAN_SELECTION("Last Day of the Month of Plan Selection"),
    FIRST_DAY_OF_NEXT_MONTH_OF_PLAN_SELECTION("First of next month of plan selection"),
    FIRST_OF_NEXT_MONTH("First of Next Month"), FIRST_OF_NEXT_MONTH_OF_NEW_APTC("First of next month for new APTC"),
    NA("N/A");

    private final String value;

    Dates(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}