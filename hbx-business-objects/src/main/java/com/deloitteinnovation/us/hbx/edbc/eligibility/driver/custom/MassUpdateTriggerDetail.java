//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:54 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;


public class MassUpdateTriggerDetail {
    private String TriggerCode = "";

    public String getTriggerCode() {
        return TriggerCode;
    }

    public void setTriggerCode(String value) {
        TriggerCode = value;
    }

    private LocalDateTime MassUpdateEdgBeginDate;

    public LocalDateTime getMassUpdateEdgBeginDate() {
        return MassUpdateEdgBeginDate;
    }

    public void setMassUpdateEdgBeginDate(LocalDateTime value) {
        MassUpdateEdgBeginDate = value;
    }

    private LocalDateTime EligibilityBeginDate;

    public LocalDateTime getEligibilityBeginDate() {
        return EligibilityBeginDate;
    }

    public void setEligibilityBeginDate(LocalDateTime value) {
        EligibilityBeginDate = value;
    }

    private String MuRunReason = "";

    public String getMuRunReason() {
        return MuRunReason;
    }

    public void setMuRunReason(String value) {
        MuRunReason = value;
    }

}
