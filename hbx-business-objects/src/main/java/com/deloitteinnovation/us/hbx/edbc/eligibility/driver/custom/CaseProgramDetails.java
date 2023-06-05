//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:44:53 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;


public class CaseProgramDetails {
    private String ProgramCode = "";

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String value) {
        ProgramCode = value;
    }

    private String PriorMedicaidCode = "";

    public String getPriorMedicaidCode() {
        return PriorMedicaidCode;
    }

    @Override
    public String toString() {
        return "CaseProgramDetails [ProgramCode=" + ProgramCode + ", PriorMedicaidCode=" + PriorMedicaidCode
                + ", ProgramMinDate=" + ProgramMinDate + ", ProgramMaxDate=" + ProgramMaxDate + ", IsProgramValid="
                + IsProgramValid + ", ProgramStatus=" + ProgramStatus + ", RequestDate=" + RequestDate
                + ", ReinstatementDate=" + ReinstatementDate + ", CaseProgramStatusDate=" + CaseProgramStatusDate + "]";
    }

    public void setPriorMedicaidCode(String value) {
        PriorMedicaidCode = value;
    }

    private LocalDateTime ProgramMinDate;

    public LocalDateTime getProgramMinDate() {
        return ProgramMinDate;
    }

    public void setProgramMinDate(LocalDateTime value) {
        ProgramMinDate = value;
    }

    private LocalDateTime ProgramMaxDate;

    public LocalDateTime getProgramMaxDate() {
        return ProgramMaxDate;
    }

    public void setProgramMaxDate(LocalDateTime value) {
        ProgramMaxDate = value;
    }

    private boolean IsProgramValid;

    public boolean getIsProgramValid() {
        return IsProgramValid;
    }

    public void setIsProgramValid(boolean value) {
        IsProgramValid = value;
    }

    private String ProgramStatus = "";

    public String getProgramStatus() {
        return ProgramStatus;
    }

    public void setProgramStatus(String value) {
        ProgramStatus = value;
    }

    private LocalDateTime RequestDate;

    public LocalDateTime getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(LocalDateTime value) {
        RequestDate = value;
    }

    private LocalDateTime ReinstatementDate;

    public LocalDateTime getReinstatementDate() {
        return ReinstatementDate;
    }

    public void setReinstatementDate(LocalDateTime value) {
        ReinstatementDate = value;
    }

    private LocalDateTime CaseProgramStatusDate;

    public LocalDateTime getCaseProgramStatusDate() {
        return CaseProgramStatusDate;
    }

    public void setCaseProgramStatusDate(LocalDateTime value) {
        CaseProgramStatusDate = value;
    }

}
