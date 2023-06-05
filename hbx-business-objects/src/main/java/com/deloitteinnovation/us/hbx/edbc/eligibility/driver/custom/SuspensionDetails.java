//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:23 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;

public class SuspensionDetails {
    private Long CaseNumber;

    public Long getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Long value) {
        CaseNumber = value;
    }

    private LocalDateTime PlanEnrollmentBeginDate;

    public LocalDateTime getPlanEnrollmentBeginDate() {
        return PlanEnrollmentBeginDate;
    }

    public void setPlanEnrollmentBeginDate(LocalDateTime value) {
        PlanEnrollmentBeginDate = value;
    }

    private LocalDateTime PlanEnrollmentEndDate;

    public LocalDateTime getPlanEnrollmentEndDate() {
        return PlanEnrollmentEndDate;
    }

    public void setPlanEnrollmentEndDate(LocalDateTime value) {
        PlanEnrollmentEndDate = value;
    }

    private String StatusCode = "";

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String value) {
        StatusCode = value;
    }

    private Long individualId;

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long value) {
        individualId = value;
    }

}
