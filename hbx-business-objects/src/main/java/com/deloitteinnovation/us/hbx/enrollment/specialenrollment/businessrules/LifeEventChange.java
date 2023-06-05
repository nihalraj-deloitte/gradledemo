package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.businessrules;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LifeEventChange {
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Calendar cal = Calendar.getInstance();

    private String id;
    private Date in_date_lifeeventchange_Date;
    private Integer in_number_lifeeventchange_enumValue;
    private BigDecimal in_number_lifeeventchange_randomNumber;
    private String in_text_liifeeventchange_category;
    private Boolean in_qualifying_life_event_change;
    private Integer out_the_life_event_change_priority;
    private Integer out_the_life_event_change_type;
    private boolean out_boolean_individual_disenrollmentDeterminedBy23rdRule;
    private boolean out_boolean_individual_enrollmentDeterminedBy23rdRule;
    private boolean out_is_special_enrollment_period_eligible;
    private Date out_date_individual_APTCDisenrollment;
    private Date out_date_individual_APTCEnrollment;
    private Date out_date_individual_dentalEligibilityEndDate;
    private Date out_date_individual_dentalEligibilityEndDateHousehold;
    private Date out_date_individual_dentalEligibilityStartDate;
    private Date out_date_individual_dentalEligibilityStartDateHousehold;
    private Date out_date_individual_disenrollmentDateIfDifferentPlanIsSelected;
    private Date out_date_individual_disenrollmentDateIfDifferentPlanIsSelectedHousehold;
    private Date out_date_individual_disenrollmentDateIfNoPlanIsSelected;
    private Date out_date_individual_disenrollmentDateIfNoPlanIsSelectedHousehold;
    private Date out_date_individual_disenrollmentDateIfSamePlanIsSelected;
    private Date out_date_individual_disenrollmentDateIfSamePlanIsSelectedHousehold;
    private Date out_date_individual_earliestEligibleEventChange;
    private Date out_date_individual_enrollmentDateIfDifferentPlanIsSelected;
    private Date out_date_individual_enrollmentDateIfDifferentPlanIsSelectedHousehold;
    private Date out_date_individual_enrollmentDateIfNoPlanIsSelected;
    private Date out_date_individual_enrollmentDateIfNoPlanIsSelectedHousehold;
    private Date out_date_individual_enrollmentDateIfSamePlanIsSelected;
    private Date out_date_individual_enrollmentDateIfSamePlanIsSelectedHousehold;
    private Date out_date_individual_latestEventChangeDateWithinEligibleTimeframe;
    private Date out_date_individual_lifeEventChangeCategory;
    private Date out_date_individual_lifeEventChangeDate;
    private String out_text_individual_disenrollmentDateIfDifferentPlanIsSelected;
    private String out_text_individual_lifeEventChangeBasis;
    private String out_text_individual_APTCEligibilityDate;
    private String out_text_individual_QHPEligibilityDate;
    private String out_text_individual_lifeEventChange;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getOut_is_special_enrollment_period_eligible() {
        return out_is_special_enrollment_period_eligible;
    }

    public void setOut_is_special_enrollment_period_eligible(Boolean out_is_special_enrollment_period_eligible) {
        this.out_is_special_enrollment_period_eligible = out_is_special_enrollment_period_eligible;
    }

    public String getOut_text_individual_disenrollmentDateIfDifferentPlanIsSelected() {
        return out_text_individual_disenrollmentDateIfDifferentPlanIsSelected;
    }

    public void setOut_text_individual_disenrollmentDateIfDifferentPlanIsSelected(
            String out_text_individual_disenrollmentDateIfDifferentPlanIsSelected) {
        this.out_text_individual_disenrollmentDateIfDifferentPlanIsSelected = out_text_individual_disenrollmentDateIfDifferentPlanIsSelected;
    }

    public String getOut_text_individual_lifeEventChangeBasis() {
        return out_text_individual_lifeEventChangeBasis;
    }

    public void setOut_text_individual_lifeEventChangeBasis(String out_text_individual_lifeEventChangeBasis) {
        this.out_text_individual_lifeEventChangeBasis = out_text_individual_lifeEventChangeBasis;
    }

    public boolean isOut_boolean_individual_disenrollmentDeterminedBy23rdRule() {
        return out_boolean_individual_disenrollmentDeterminedBy23rdRule;
    }

    public void setOut_boolean_individual_disenrollmentDeterminedBy23rdRule(
            boolean out_boolean_individual_disenrollmentDeterminedBy23rdRule) {
        this.out_boolean_individual_disenrollmentDeterminedBy23rdRule = out_boolean_individual_disenrollmentDeterminedBy23rdRule;
    }

    public boolean isOut_boolean_individual_enrollmentDeterminedBy23rdRule() {
        return out_boolean_individual_enrollmentDeterminedBy23rdRule;
    }

    public void setOut_boolean_individual_enrollmentDeterminedBy23rdRule(
            boolean out_boolean_individual_enrollmentDeterminedBy23rdRule) {
        this.out_boolean_individual_enrollmentDeterminedBy23rdRule = out_boolean_individual_enrollmentDeterminedBy23rdRule;
    }

    public Date getOut_date_individual_APTCDisenrollment() {
        return out_date_individual_APTCDisenrollment;
    }

    public void setOut_date_individual_APTCDisenrollment(Date out_date_individual_APTCDisenrollment) {
        this.out_date_individual_APTCDisenrollment = out_date_individual_APTCDisenrollment;
    }

    public Date getOut_date_individual_APTCEnrollment() {
        return out_date_individual_APTCEnrollment;
    }

    public void setOut_date_individual_APTCEnrollment(Date out_date_individual_APTCEnrollment) {
        this.out_date_individual_APTCEnrollment = out_date_individual_APTCEnrollment;
    }

    public Date getOut_date_individual_dentalEligibilityEndDate() {
        return out_date_individual_dentalEligibilityEndDate;
    }

    public void setOut_date_individual_dentalEligibilityEndDate(Date out_date_individual_dentalEligibilityEndDate) {
        this.out_date_individual_dentalEligibilityEndDate = out_date_individual_dentalEligibilityEndDate;
    }

    public Date getOut_date_individual_dentalEligibilityEndDateHousehold() {
        return out_date_individual_dentalEligibilityEndDateHousehold;
    }

    public void setOut_date_individual_dentalEligibilityEndDateHousehold(
            Date out_date_individual_dentalEligibilityEndDateHousehold) {
        this.out_date_individual_dentalEligibilityEndDateHousehold = out_date_individual_dentalEligibilityEndDateHousehold;
    }

    public Date getOut_date_individual_dentalEligibilityStartDate() {
        return out_date_individual_dentalEligibilityStartDate;
    }

    public void setOut_date_individual_dentalEligibilityStartDate(Date out_date_individual_dentalEligibilityStartDate) {
        this.out_date_individual_dentalEligibilityStartDate = out_date_individual_dentalEligibilityStartDate;
    }

    public Date getOut_date_individual_dentalEligibilityStartDateHousehold() {
        return out_date_individual_dentalEligibilityStartDateHousehold;
    }

    public void setOut_date_individual_dentalEligibilityStartDateHousehold(
            Date out_date_individual_dentalEligibilityStartDateHousehold) {
        this.out_date_individual_dentalEligibilityStartDateHousehold = out_date_individual_dentalEligibilityStartDateHousehold;
    }

    public Date getOut_date_individual_disenrollmentDateIfDifferentPlanIsSelected() {
        return out_date_individual_disenrollmentDateIfDifferentPlanIsSelected;
    }

    public void setOut_date_individual_disenrollmentDateIfDifferentPlanIsSelected(
            Date out_date_individual_disenrollmentDateIfDifferentPlanIsSelected) {
        this.out_date_individual_disenrollmentDateIfDifferentPlanIsSelected = out_date_individual_disenrollmentDateIfDifferentPlanIsSelected;
    }

    public Date getOut_date_individual_disenrollmentDateIfDifferentPlanIsSelectedHousehold() {
        return out_date_individual_disenrollmentDateIfDifferentPlanIsSelectedHousehold;
    }

    public void setOut_date_individual_disenrollmentDateIfDifferentPlanIsSelectedHousehold(
            Date out_date_individual_disenrollmentDateIfDifferentPlanIsSelectedHousehold) {
        this.out_date_individual_disenrollmentDateIfDifferentPlanIsSelectedHousehold = out_date_individual_disenrollmentDateIfDifferentPlanIsSelectedHousehold;
    }

    public Date getOut_date_individual_disenrollmentDateIfNoPlanIsSelected() {
        return out_date_individual_disenrollmentDateIfNoPlanIsSelected;
    }

    public void setOut_date_individual_disenrollmentDateIfNoPlanIsSelected(
            Date out_date_individual_disenrollmentDateIfNoPlanIsSelected) {
        this.out_date_individual_disenrollmentDateIfNoPlanIsSelected = out_date_individual_disenrollmentDateIfNoPlanIsSelected;
    }

    public Date getOut_date_individual_disenrollmentDateIfNoPlanIsSelectedHousehold() {
        return out_date_individual_disenrollmentDateIfNoPlanIsSelectedHousehold;
    }

    public void setOut_date_individual_disenrollmentDateIfNoPlanIsSelectedHousehold(
            Date out_date_individual_disenrollmentDateIfNoPlanIsSelectedHousehold) {
        this.out_date_individual_disenrollmentDateIfNoPlanIsSelectedHousehold = out_date_individual_disenrollmentDateIfNoPlanIsSelectedHousehold;
    }

    public Date getOut_date_individual_disenrollmentDateIfSamePlanIsSelected() {
        return out_date_individual_disenrollmentDateIfSamePlanIsSelected;
    }

    public void setOut_date_individual_disenrollmentDateIfSamePlanIsSelected(
            Date out_date_individual_disenrollmentDateIfSamePlanIsSelected) {
        this.out_date_individual_disenrollmentDateIfSamePlanIsSelected = out_date_individual_disenrollmentDateIfSamePlanIsSelected;
    }

    public Date getOut_date_individual_disenrollmentDateIfSamePlanIsSelectedHousehold() {
        return out_date_individual_disenrollmentDateIfSamePlanIsSelectedHousehold;
    }

    public void setOut_date_individual_disenrollmentDateIfSamePlanIsSelectedHousehold(
            Date out_date_individual_disenrollmentDateIfSamePlanIsSelectedHousehold) {
        this.out_date_individual_disenrollmentDateIfSamePlanIsSelectedHousehold = out_date_individual_disenrollmentDateIfSamePlanIsSelectedHousehold;
    }

    public Date getOut_date_individual_earliestEligibleEventChange() {
        return out_date_individual_earliestEligibleEventChange;
    }

    public void setOut_date_individual_earliestEligibleEventChange(
            Date out_date_individual_earliestEligibleEventChange) {
        this.out_date_individual_earliestEligibleEventChange = out_date_individual_earliestEligibleEventChange;
    }

    public Date getOut_date_individual_enrollmentDateIfDifferentPlanIsSelected() {
        return out_date_individual_enrollmentDateIfDifferentPlanIsSelected;
    }

    public void setOut_date_individual_enrollmentDateIfDifferentPlanIsSelected(
            Date out_date_individual_enrollmentDateIfDifferentPlanIsSelected) {
        this.out_date_individual_enrollmentDateIfDifferentPlanIsSelected = out_date_individual_enrollmentDateIfDifferentPlanIsSelected;
    }

    public Date getOut_date_individual_enrollmentDateIfDifferentPlanIsSelectedHousehold() {
        return out_date_individual_enrollmentDateIfDifferentPlanIsSelectedHousehold;
    }

    public void setOut_date_individual_enrollmentDateIfDifferentPlanIsSelectedHousehold(
            Date out_date_individual_enrollmentDateIfDifferentPlanIsSelectedHousehold) {
        this.out_date_individual_enrollmentDateIfDifferentPlanIsSelectedHousehold = out_date_individual_enrollmentDateIfDifferentPlanIsSelectedHousehold;
    }

    public Date getOut_date_individual_enrollmentDateIfNoPlanIsSelected() {
        return out_date_individual_enrollmentDateIfNoPlanIsSelected;
    }

    public void setOut_date_individual_enrollmentDateIfNoPlanIsSelected(
            Date out_date_individual_enrollmentDateIfNoPlanIsSelected) {
        this.out_date_individual_enrollmentDateIfNoPlanIsSelected = out_date_individual_enrollmentDateIfNoPlanIsSelected;
    }

    public Date getOut_date_individual_enrollmentDateIfNoPlanIsSelectedHousehold() {
        return out_date_individual_enrollmentDateIfNoPlanIsSelectedHousehold;
    }

    public void setOut_date_individual_enrollmentDateIfNoPlanIsSelectedHousehold(
            Date out_date_individual_enrollmentDateIfNoPlanIsSelectedHousehold) {
        this.out_date_individual_enrollmentDateIfNoPlanIsSelectedHousehold = out_date_individual_enrollmentDateIfNoPlanIsSelectedHousehold;
    }

    public Date getOut_date_individual_enrollmentDateIfSamePlanIsSelected() {
        return out_date_individual_enrollmentDateIfSamePlanIsSelected;
    }

    public void setOut_date_individual_enrollmentDateIfSamePlanIsSelected(
            Date out_date_individual_enrollmentDateIfSamePlanIsSelected) {
        this.out_date_individual_enrollmentDateIfSamePlanIsSelected = out_date_individual_enrollmentDateIfSamePlanIsSelected;
    }

    public Date getOut_date_individual_enrollmentDateIfSamePlanIsSelectedHousehold() {
        return out_date_individual_enrollmentDateIfSamePlanIsSelectedHousehold;
    }

    public void setOut_date_individual_enrollmentDateIfSamePlanIsSelectedHousehold(
            Date out_date_individual_enrollmentDateIfSamePlanIsSelectedHousehold) {
        this.out_date_individual_enrollmentDateIfSamePlanIsSelectedHousehold = out_date_individual_enrollmentDateIfSamePlanIsSelectedHousehold;
    }

    public Date getOut_date_individual_latestEventChangeDateWithinEligibleTimeframe() {
        return out_date_individual_latestEventChangeDateWithinEligibleTimeframe;
    }

    public void setOut_date_individual_latestEventChangeDateWithinEligibleTimeframe(
            Date out_date_individual_latestEventChangeDateWithinEligibleTimeframe) {
        this.out_date_individual_latestEventChangeDateWithinEligibleTimeframe = out_date_individual_latestEventChangeDateWithinEligibleTimeframe;
    }

    public Date getOut_date_individual_lifeEventChangeCategory() {
        return out_date_individual_lifeEventChangeCategory;
    }

    public void setOut_date_individual_lifeEventChangeCategory(Date out_date_individual_lifeEventChangeCategory) {
        this.out_date_individual_lifeEventChangeCategory = out_date_individual_lifeEventChangeCategory;
    }

    public Date getOut_date_individual_lifeEventChangeDate() {
        return out_date_individual_lifeEventChangeDate;
    }

    public void setOut_date_individual_lifeEventChangeDate(Date out_date_individual_lifeEventChangeDate) {
        this.out_date_individual_lifeEventChangeDate = out_date_individual_lifeEventChangeDate;
    }

    public String getOut_text_individual_APTCEligibilityDate() {
        return out_text_individual_APTCEligibilityDate;
    }

    public void setOut_text_individual_APTCEligibilityDate(String out_text_individual_APTCEligibilityDate) {
        this.out_text_individual_APTCEligibilityDate = out_text_individual_APTCEligibilityDate;
    }

    public String getOut_text_individual_QHPEligibilityDate() {
        return out_text_individual_QHPEligibilityDate;
    }

    public void setOut_text_individual_QHPEligibilityDate(String out_text_individual_QHPEligibilityDate) {
        this.out_text_individual_QHPEligibilityDate = out_text_individual_QHPEligibilityDate;
    }

    public String getOut_text_individual_lifeEventChange() {
        return out_text_individual_lifeEventChange;
    }

    public void setOut_text_individual_lifeEventChange(String out_text_individual_lifeEventChange) {
        this.out_text_individual_lifeEventChange = out_text_individual_lifeEventChange;
    }

    public Date getOut_15thRule_Date(Date date) throws ParseException {
        cal.setTime(date);
        if (cal.get(Calendar.DAY_OF_MONTH) < 15) {
            cal.add(Calendar.MONTH, 1);
        } else {
            cal.add(Calendar.MONTH, 2);
        }
        cal.set(Calendar.DAY_OF_MONTH, 1);
        date = cal.getTime();
        return formatter.parse(formatter.format(date));
    }

    public Date getLastDayOfMonth(Date date) throws ParseException {
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        date = cal.getTime();
        return formatter.parse(formatter.format(date));
    }

    public Date getFirstOfNextMonth(Date date) throws ParseException {
        cal.setTime(date);
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        date = cal.getTime();
        return formatter.parse(formatter.format(date));
    }

    public Boolean getIn_qualifying_life_event_change() {
        return in_qualifying_life_event_change;
    }

    public void setIn_qualifying_life_event_change(Boolean in_qualifying_life_event_change) {
        this.in_qualifying_life_event_change = in_qualifying_life_event_change;
    }

    public Integer getOut_the_life_event_change_priority() {
        return out_the_life_event_change_priority;
    }

    public void setOut_the_life_event_change_priority(Integer out_the_life_event_change_priority) {
        this.out_the_life_event_change_priority = out_the_life_event_change_priority;
    }

    public Integer getOut_the_life_event_change_type() {
        return out_the_life_event_change_type;
    }

    public void setOut_the_life_event_change_type(Integer out_the_life_event_change_type) {
        this.out_the_life_event_change_type = out_the_life_event_change_type;
    }

    public Date getIn_date_lifeeventchange_Date() {
        return in_date_lifeeventchange_Date;
    }

    public Integer getIn_number_lifeeventchange_enumValue() {
        return in_number_lifeeventchange_enumValue;
    }

    public BigDecimal getIn_number_lifeeventchange_randomNumber() {
        return in_number_lifeeventchange_randomNumber;
    }

    public String getIn_text_liifeeventchange_category() {
        return in_text_liifeeventchange_category;
    }

    public void setIn_date_lifeeventchange_Date(Date in_date_lifeeventchange_Date) {
        this.in_date_lifeeventchange_Date = in_date_lifeeventchange_Date;
    }

    public void setIn_number_lifeeventchange_enumValue(Integer in_number_lifeeventchange_enumValue) {
        this.in_number_lifeeventchange_enumValue = in_number_lifeeventchange_enumValue;
    }

    public void setIn_number_lifeeventchange_randomNumber(BigDecimal bigDecimal) {
        this.in_number_lifeeventchange_randomNumber = bigDecimal;
    }

    public void setIn_text_liifeeventchange_category(String in_text_liifeeventchange_category) {
        this.in_text_liifeeventchange_category = in_text_liifeeventchange_category;
    }

    public void setOut_is_special_enrollment_period_eligible(boolean out_is_special_enrollment_period_eligible) {
        this.out_is_special_enrollment_period_eligible = out_is_special_enrollment_period_eligible;
    }

}

