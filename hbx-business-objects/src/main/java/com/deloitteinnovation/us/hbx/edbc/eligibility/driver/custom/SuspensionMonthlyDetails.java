//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:23 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;

public class SuspensionMonthlyDetails {
    private Long individualId;

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long value) {
        individualId = value;
    }

    private LocalDateTime BenefitMonth;

    public LocalDateTime getBenefitMonth() {
        return BenefitMonth;
    }

    public void setBenefitMonth(LocalDateTime value) {
        BenefitMonth = value;
    }

    private Boolean IsSuspended;

    public Boolean getIsSuspended() {
        return IsSuspended;
    }

    public void setIsSuspended(Boolean value) {
        IsSuspended = value;
    }

}
