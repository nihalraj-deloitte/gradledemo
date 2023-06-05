//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:40 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;

public class EligibilityIndividualBenefitsCustom {
    private Long individualId;

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long value) {
        individualId = value;
    }

    private Long CaseNumber;

    public Long getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Long value) {
        CaseNumber = value;
    }

    private LocalDateTime BenefitBeginDate;

    public LocalDateTime getBenefitBeginDate() {
        return BenefitBeginDate;
    }

    public void setBenefitBeginDate(LocalDateTime value) {
        BenefitBeginDate = value;
    }

    private LocalDateTime BenefitEndDate;

    public LocalDateTime getBenefitEndDate() {
        return BenefitEndDate;
    }

    public void setBenefitEndDate(LocalDateTime value) {
        BenefitEndDate = value;
    }

    private String ProgramCode = "";

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String value) {
        ProgramCode = value;
    }

    private String TypeOfAssistanceCode = "";

    public String getTypeOfAssistanceCode() {
        return TypeOfAssistanceCode;
    }

    public void setTypeOfAssistanceCode(String value) {
        TypeOfAssistanceCode = value;
    }

    private String IsDelete = "";

    public String getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(String value) {
        IsDelete = value;
    }

    private boolean IsConditionallyEligible;

    public boolean getIsConditionallyEligible() {
        return IsConditionallyEligible;
    }

    public void setIsConditionallyEligible(boolean value) {
        IsConditionallyEligible = value;
    }

}
