package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.businessrules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GlobalInstance {

    private Date in_date_global_systemDate;

    private BigDecimal io_number_global_applicationID;
    private String io_text_global_logicalApplicationID;
    private List<EntityIndividual> list_entity_individual = new ArrayList<>();
    private Boolean io__atleast_one_individual_enrolled_in_QHP_APTC_change_in_eligibility;
    private Boolean io__atleast_one_individual_enrolled_in_QHP_APTC_and_atleast_one_individual_change_in_eligibility;
    private Boolean io__at_least_one_member_is_enrolled_in_QHP_and_APTC;
    // Response

    private LifeEventChange out_promoted_lifeEvent;

    private Boolean out_boolean_global_disenrollmentDeterminedBy23rdRule;
    private Boolean out_boolean_global_enrollmentDeterminedBy23rdRule;
    private Boolean out_boolean_global_qualifiesSpecialEnrollment;
    private Date out_date_global_APTCDisenrollment;
    private Date out_date_global_APTCEnrollment;
    private Date out_date_global_disenrollmentDateIfDifferentPlanIsSelected;
    private Date out_date_global_disenrollmentDateIfNoPlanIsSelected;
    private Date out_date_global_disenrollmentDateIfSamePlanIsSelected;
    private Date out_date_global_earliestEligibleEventDate;
    private Date out_date_global_enrollmentDateIfDifferentPlanIsSelected;
    private Date out_date_global_enrollmentDateIfNoPlanIsSelected;
    private Date out_date_global_enrollmentDateIfSamePlanIsSelected;
    private Date out_date_global_firstDayOfMonthAfter;
    private Date out_date_global_firstDayOfMonthFromCurrent;
    private Date out_date_global_lastDayOfCurrentMonth;
    private Date out_date_global_lifeEventChangeDate;
    private Date out_date_global_newDentalPlanStartDate;
    private Date out_date_global_oldDentalPlanEndDate;
    private Date out_date_global_specialEnrollmentEndDate;
    private Date out_date_global_specialEnrollmentStartDate;
    private String out_text_global_APTCEligibilityDate;
    private String out_text_global_QHPEligibilityDate;
    private String out_text_global_familyUnitBasis;
    private String out_text_global_lifeEventChange;
    private String out_text_global_specialEnrollmentPeriod;

    public Boolean getIo__atleast_one_individual_enrolled_in_QHP_APTC_change_in_eligibility() {
        return io__atleast_one_individual_enrolled_in_QHP_APTC_change_in_eligibility;
    }

    public void setIo__atleast_one_individual_enrolled_in_QHP_APTC_change_in_eligibility(
            Boolean io__atleast_one_individual_enrolled_in_QHP_APTC_change_in_eligibility) {
        this.io__atleast_one_individual_enrolled_in_QHP_APTC_change_in_eligibility = io__atleast_one_individual_enrolled_in_QHP_APTC_change_in_eligibility;
    }

    public Boolean getIo__atleast_one_individual_enrolled_in_QHP_APTC_and_atleast_one_individual_change_in_eligibility() {
        return io__atleast_one_individual_enrolled_in_QHP_APTC_and_atleast_one_individual_change_in_eligibility;
    }

    public void setIo__atleast_one_individual_enrolled_in_QHP_APTC_and_atleast_one_individual_change_in_eligibility(
            Boolean io__atleast_one_individual_enrolled_in_QHP_APTC_and_atleast_one_individual_change_in_eligibility) {
        this.io__atleast_one_individual_enrolled_in_QHP_APTC_and_atleast_one_individual_change_in_eligibility = io__atleast_one_individual_enrolled_in_QHP_APTC_and_atleast_one_individual_change_in_eligibility;
    }

    public Date getIn_date_global_systemDate() {
        return in_date_global_systemDate;
    }

    public BigDecimal getIo_number_global_applicationID() {
        return io_number_global_applicationID;
    }

    public String getIo_text_global_logicalApplicationID() {
        return io_text_global_logicalApplicationID;
    }

    public List<EntityIndividual> getList_entity_individual() {
        return list_entity_individual;
    }

    public Boolean getOut_boolean_global_disenrollmentDeterminedBy23rdRule() {
        return out_boolean_global_disenrollmentDeterminedBy23rdRule;
    }

    public Boolean getOut_boolean_global_enrollmentDeterminedBy23rdRule() {
        return out_boolean_global_enrollmentDeterminedBy23rdRule;
    }

    public Boolean getOut_boolean_global_qualifiesSpecialEnrollment() {
        return out_boolean_global_qualifiesSpecialEnrollment;
    }

    public Date getOut_date_global_APTCDisenrollment() {
        return out_date_global_APTCDisenrollment;
    }

    public Date getOut_date_global_APTCEnrollment() {
        return out_date_global_APTCEnrollment;
    }

    public Date getOut_date_global_disenrollmentDateIfDifferentPlanIsSelected() {
        return out_date_global_disenrollmentDateIfDifferentPlanIsSelected;
    }

    public Date getOut_date_global_disenrollmentDateIfNoPlanIsSelected() {
        return out_date_global_disenrollmentDateIfNoPlanIsSelected;
    }

    public Date getOut_date_global_disenrollmentDateIfSamePlanIsSelected() {
        return out_date_global_disenrollmentDateIfSamePlanIsSelected;
    }

    public Date getOut_date_global_earliestEligibleEventDate() {
        return out_date_global_earliestEligibleEventDate;
    }

    public Date getOut_date_global_enrollmentDateIfDifferentPlanIsSelected() {
        return out_date_global_enrollmentDateIfDifferentPlanIsSelected;
    }

    public Date getOut_date_global_enrollmentDateIfNoPlanIsSelected() {
        return out_date_global_enrollmentDateIfNoPlanIsSelected;
    }

    public Date getOut_date_global_enrollmentDateIfSamePlanIsSelected() {
        return out_date_global_enrollmentDateIfSamePlanIsSelected;
    }

    public Date getOut_date_global_firstDayOfMonthAfter() {
        return out_date_global_firstDayOfMonthAfter;
    }

    public Date getOut_date_global_firstDayOfMonthFromCurrent() {
        return out_date_global_firstDayOfMonthFromCurrent;
    }

    public Date getOut_date_global_lastDayOfCurrentMonth() {
        return out_date_global_lastDayOfCurrentMonth;
    }

    public Date getOut_date_global_lifeEventChangeDate() {
        return out_date_global_lifeEventChangeDate;
    }

    public Date getOut_date_global_newDentalPlanStartDate() {
        return out_date_global_newDentalPlanStartDate;
    }

    public Date getOut_date_global_oldDentalPlanEndDate() {
        return out_date_global_oldDentalPlanEndDate;
    }

    public Date getOut_date_global_specialEnrollmentEndDate() {
        return out_date_global_specialEnrollmentEndDate;
    }

    public Date getOut_date_global_specialEnrollmentStartDate() {
        return out_date_global_specialEnrollmentStartDate;
    }

    public String getOut_text_global_APTCEligibilityDate() {
        return out_text_global_APTCEligibilityDate;
    }

    public String getOut_text_global_familyUnitBasis() {
        return out_text_global_familyUnitBasis;
    }

    public String getOut_text_global_lifeEventChange() {
        return out_text_global_lifeEventChange;
    }

    public String getOut_text_global_QHPEligibilityDate() {
        return out_text_global_QHPEligibilityDate;
    }

    public String getOut_text_global_specialEnrollmentPeriod() {
        return out_text_global_specialEnrollmentPeriod;
    }

    public void setIn_date_global_systemDate(Date in_date_global_systemDate) {
        this.in_date_global_systemDate = in_date_global_systemDate;
    }

    public void setIo_number_global_applicationID(BigDecimal bigDecimal) {
        this.io_number_global_applicationID = bigDecimal;
    }

    public void setIo_text_global_logicalApplicationID(String io_text_global_logicalApplicationID) {
        this.io_text_global_logicalApplicationID = io_text_global_logicalApplicationID;
    }

    public void setList_entity_individual(List<EntityIndividual> list_entity_individual) {
        this.list_entity_individual = list_entity_individual;
    }

    public void setOut_boolean_global_disenrollmentDeterminedBy23rdRule(
            Boolean out_boolean_global_disenrollmentDeterminedBy23rdRule) {
        this.out_boolean_global_disenrollmentDeterminedBy23rdRule = out_boolean_global_disenrollmentDeterminedBy23rdRule;
    }

    public void setOut_boolean_global_enrollmentDeterminedBy23rdRule(
            Boolean out_boolean_global_enrollmentDeterminedBy23rdRule) {
        this.out_boolean_global_enrollmentDeterminedBy23rdRule = out_boolean_global_enrollmentDeterminedBy23rdRule;
    }

    public void setOut_boolean_global_qualifiesSpecialEnrollment(
            Boolean out_boolean_global_qualifiesSpecialEnrollment) {
        this.out_boolean_global_qualifiesSpecialEnrollment = out_boolean_global_qualifiesSpecialEnrollment;
    }

    public void setOut_date_global_APTCDisenrollment(Date out_date_global_APTCDisenrollment) {
        this.out_date_global_APTCDisenrollment = out_date_global_APTCDisenrollment;
    }

    public void setOut_date_global_APTCEnrollment(Date out_date_global_APTCEnrollment) {
        this.out_date_global_APTCEnrollment = out_date_global_APTCEnrollment;
    }

    public void setOut_date_global_disenrollmentDateIfDifferentPlanIsSelected(
            Date out_date_global_disenrollmentDateIfDifferentPlanIsSelected) {
        this.out_date_global_disenrollmentDateIfDifferentPlanIsSelected = out_date_global_disenrollmentDateIfDifferentPlanIsSelected;
    }

    public void setOut_date_global_disenrollmentDateIfNoPlanIsSelected(
            Date out_date_global_disenrollmentDateIfNoPlanIsSelected) {
        this.out_date_global_disenrollmentDateIfNoPlanIsSelected = out_date_global_disenrollmentDateIfNoPlanIsSelected;
    }

    public void setOut_date_global_disenrollmentDateIfSamePlanIsSelected(
            Date out_date_global_disenrollmentDateIfSamePlanIsSelected) {
        this.out_date_global_disenrollmentDateIfSamePlanIsSelected = out_date_global_disenrollmentDateIfSamePlanIsSelected;
    }

    public void setOut_date_global_earliestEligibleEventDate(Date out_date_global_earliestEligibleEventDate) {
        this.out_date_global_earliestEligibleEventDate = out_date_global_earliestEligibleEventDate;
    }

    public void setOut_date_global_enrollmentDateIfDifferentPlanIsSelected(
            Date out_date_global_enrollmentDateIfDifferentPlanIsSelected) {
        this.out_date_global_enrollmentDateIfDifferentPlanIsSelected = out_date_global_enrollmentDateIfDifferentPlanIsSelected;
    }

    public void setOut_date_global_enrollmentDateIfNoPlanIsSelected(
            Date out_date_global_enrollmentDateIfNoPlanIsSelected) {
        this.out_date_global_enrollmentDateIfNoPlanIsSelected = out_date_global_enrollmentDateIfNoPlanIsSelected;
    }

    public void setOut_date_global_enrollmentDateIfSamePlanIsSelected(
            Date out_date_global_enrollmentDateIfSamePlanIsSelected) {
        this.out_date_global_enrollmentDateIfSamePlanIsSelected = out_date_global_enrollmentDateIfSamePlanIsSelected;
    }

    public void setOut_date_global_firstDayOfMonthAfter(Date out_date_global_firstDayOfMonthAfter) {
        this.out_date_global_firstDayOfMonthAfter = out_date_global_firstDayOfMonthAfter;
    }

    public void setOut_date_global_firstDayOfMonthFromCurrent(Date out_date_global_firstDayOfMonthFromCurrent) {
        this.out_date_global_firstDayOfMonthFromCurrent = out_date_global_firstDayOfMonthFromCurrent;
    }

    public void setOut_date_global_lastDayOfCurrentMonth(Date out_date_global_lastDayOfCurrentMonth) {
        this.out_date_global_lastDayOfCurrentMonth = out_date_global_lastDayOfCurrentMonth;
    }

    public void setOut_date_global_lifeEventChangeDate(Date out_date_global_lifeEventChangeDate) {
        this.out_date_global_lifeEventChangeDate = out_date_global_lifeEventChangeDate;
    }

    public void setOut_date_global_newDentalPlanStartDate(Date out_date_global_newDentalPlanStartDate) {
        this.out_date_global_newDentalPlanStartDate = out_date_global_newDentalPlanStartDate;
    }

    public void setOut_date_global_oldDentalPlanEndDate(Date out_date_global_oldDentalPlanEndDate) {
        this.out_date_global_oldDentalPlanEndDate = out_date_global_oldDentalPlanEndDate;
    }

    public void setOut_date_global_specialEnrollmentEndDate(Date out_date_global_specialEnrollmentEndDate) {
        this.out_date_global_specialEnrollmentEndDate = out_date_global_specialEnrollmentEndDate;
    }

    public void setOut_date_global_specialEnrollmentStartDate(Date out_date_global_specialEnrollmentStartDate) {
        this.out_date_global_specialEnrollmentStartDate = out_date_global_specialEnrollmentStartDate;
    }

    public void setOut_text_global_APTCEligibilityDate(String out_text_global_APTCEligibilityDate) {
        this.out_text_global_APTCEligibilityDate = out_text_global_APTCEligibilityDate;
    }

    public void setOut_text_global_familyUnitBasis(String out_text_global_familyUnitBasis) {
        this.out_text_global_familyUnitBasis = out_text_global_familyUnitBasis;
    }

    public void setOut_text_global_lifeEventChange(String out_text_global_lifeEventChange) {
        this.out_text_global_lifeEventChange = out_text_global_lifeEventChange;
    }

    public void setOut_text_global_QHPEligibilityDate(String out_text_global_QHPEligibilityDate) {
        this.out_text_global_QHPEligibilityDate = out_text_global_QHPEligibilityDate;
    }

    public void setOut_text_global_specialEnrollmentPeriod(String out_text_global_specialEnrollmentPeriod) {
        this.out_text_global_specialEnrollmentPeriod = out_text_global_specialEnrollmentPeriod;
    }

    public Boolean getIo__at_least_one_member_is_enrolled_in_QHP_and_APTC() {
        return io__at_least_one_member_is_enrolled_in_QHP_and_APTC;
    }

    public void setIo__at_least_one_member_is_enrolled_in_QHP_and_APTC(
            Boolean io__at_least_one_member_is_enrolled_in_QHP_and_APTC) {
        this.io__at_least_one_member_is_enrolled_in_QHP_and_APTC = io__at_least_one_member_is_enrolled_in_QHP_and_APTC;
    }

    public LifeEventChange getOut_promoted_lifeEvent() {
        return out_promoted_lifeEvent;
    }

    public void setOut_promoted_lifeEvent(LifeEventChange out_promoted_lifeEvent) {
        this.out_promoted_lifeEvent = out_promoted_lifeEvent;
    }

}
