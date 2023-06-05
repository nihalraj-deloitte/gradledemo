package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

public class MinMaxEdbcAction {
    private String ActionRefCode;
    private String ActionDescription;
    private String MinEdmSequence;
    private String MaxEdmSequence;

    public String getActionRefCode() {
        return ActionRefCode;
    }

    public void setActionRefCode(String ruleRefCode) {
        ActionRefCode = ruleRefCode;
    }

    public String getActionDescription() {
        return ActionDescription;
    }

    public void setActionDescription(String ruleDescription) {
        ActionDescription = ruleDescription;
    }

    public String getMinEdmSequence() {
        return MinEdmSequence;
    }

    public void setMinEdmSequence(String minEdmSequence) {
        MinEdmSequence = minEdmSequence;
    }

    public String getMaxEdmSequence() {
        return MaxEdmSequence;
    }

    public void setMaxEdmSequence(String maxEdmSequence) {
        MaxEdmSequence = maxEdmSequence;
    }
}
