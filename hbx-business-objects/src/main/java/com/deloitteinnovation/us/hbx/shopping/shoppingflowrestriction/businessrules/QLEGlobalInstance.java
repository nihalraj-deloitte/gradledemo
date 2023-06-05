package com.deloitteinnovation.us.hbx.shopping.shoppingflowrestriction.businessrules;

import java.util.ArrayList;
import java.util.List;

public class QLEGlobalInstance {

    //Request
    private Boolean in_boolean_has_active_enrollment;
    private Integer in_number_total_available_plans;
    private String in_text_enrolled_metal_level;
    private List<QleInstance> list_qle = new ArrayList<>();

    //Response
    private Boolean out_boolean_is_qle_accessment_complete;
    private Integer out_number_restriction_priority;
    private String out_text_exact_restriction;
    private String out_text_shopping_restriction;


    //Request-Response
    private Integer io_number_application_id;
    private Integer io_number_sep_id;


    //Request PoJo
    public Boolean getIn_boolean_has_active_enrollment() {
        return in_boolean_has_active_enrollment;
    }

    public void setIn_boolean_has_active_enrollment(Boolean in_boolean_has_active_enrollment) {
        this.in_boolean_has_active_enrollment = in_boolean_has_active_enrollment;
    }

    public Integer getIn_number_total_available_plans() {
        return in_number_total_available_plans;
    }

    public void setIn_number_total_available_plans(Integer in_number_total_available_plans) {
        this.in_number_total_available_plans = in_number_total_available_plans;
    }

    public String getIn_text_enrolled_metal_level() {
        return in_text_enrolled_metal_level;
    }

    public void setIn_text_enrolled_metal_level(String in_text_enrolled_metal_level) {
        this.in_text_enrolled_metal_level = in_text_enrolled_metal_level;
    }

    public Integer getIo_number_application_id() {
        return io_number_application_id;
    }

    public void setIo_number_application_id(Integer io_number_application_id) {
        this.io_number_application_id = io_number_application_id;
    }

    public Integer getIo_number_sep_id() {
        return io_number_sep_id;
    }

    public void setIo_number_sep_id(Integer io_number_sep_id) {
        this.io_number_sep_id = io_number_sep_id;
    }

    public List<QleInstance> getList_qle() {
        return list_qle;
    }

    public void setList_qle(List<QleInstance> list_qle) {
        this.list_qle = list_qle;
    }

    //Response PoJo
    public Boolean getOut_boolean_is_qle_accessment_complete() {
        return out_boolean_is_qle_accessment_complete;
    }

    public void setOut_boolean_is_qle_accessment_complete(Boolean out_boolean_is_qle_accessment_complete) {
        this.out_boolean_is_qle_accessment_complete = out_boolean_is_qle_accessment_complete;
    }

    public Integer getOut_number_restriction_priority() {
        return out_number_restriction_priority;
    }

    public void setOut_number_restriction_priority(Integer out_number_restriction_priority) {
        this.out_number_restriction_priority = out_number_restriction_priority;
    }

    public String getOut_text_exact_restriction() {
        return out_text_exact_restriction;
    }

    public void setOut_text_exact_restriction(String out_text_exact_restriction) {
        this.out_text_exact_restriction = out_text_exact_restriction;
    }

    public String getOut_text_shopping_restriction() {
        return out_text_shopping_restriction;
    }

    public void setOut_text_shopping_restriction(String out_text_shopping_restriction) {
        this.out_text_shopping_restriction = out_text_shopping_restriction;
    }

}
