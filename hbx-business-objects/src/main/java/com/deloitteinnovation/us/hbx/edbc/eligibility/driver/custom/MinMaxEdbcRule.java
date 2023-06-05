package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

public class MinMaxEdbcRule {
    private String RuleName;
    private String RuleDescription;
    private String RuleExpression;
    private String IsActiveRule;
    private String IsMinCalc;
    private String IsMaxCalc;
    private String DateId1;
    private String DateId2;
    private String Condition;
    private String FinalDate;

    public String getRuleName() {
        return RuleName;
    }

    public void setRuleName(String ruleName) {
        RuleName = ruleName;
    }

    public String getRuleDescription() {
        return RuleDescription;
    }

    public void setRuleDescription(String ruleDescription) {
        RuleDescription = ruleDescription;
    }

    public String getRuleExpression() {
        return RuleExpression;
    }

    public void setRuleExpression(String ruleExpression) {
        RuleExpression = ruleExpression;
    }

    public String getIsActiveRule() {
        return IsActiveRule;
    }

    public void setIsActiveRule(String isActiveRule) {
        IsActiveRule = isActiveRule;
    }

    public String getIsMinCalc() {
        return IsMinCalc;
    }

    public void setIsMinCalc(String isMinCalc) {
        IsMinCalc = isMinCalc;
    }

    public String getIsMaxCalc() {
        return IsMaxCalc;
    }

    public void setIsMaxCalc(String isMaxCalc) {
        IsMaxCalc = isMaxCalc;
    }

    public String getDateId1() {
        return DateId1;
    }

    public void setDateId1(String dateId1) {
        DateId1 = dateId1;
    }

    public String getDateId2() {
        return DateId2;
    }

    public void setDateId2(String dateId2) {
        DateId2 = dateId2;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getFinalDate() {
        return FinalDate;
    }

    public void setFinalDate(String finalDate) {
        FinalDate = finalDate;
    }

}
