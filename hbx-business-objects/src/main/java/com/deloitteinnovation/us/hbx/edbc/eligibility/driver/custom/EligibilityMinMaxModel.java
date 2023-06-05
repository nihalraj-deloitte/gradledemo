//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:43 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;
import java.util.HashMap;

public class EligibilityMinMaxModel {
    private String ProgramCode = "";

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String value) {
        ProgramCode = value;
    }

    private Long CaseNumber;

    public Long getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Long value) {
        CaseNumber = value;
    }

    private LocalDateTime CaseDataChangeDate;

    public LocalDateTime getCaseDataChangeDate() {
        return CaseDataChangeDate;
    }

    public void setCaseDataChangeDate(LocalDateTime value) {
        CaseDataChangeDate = value;
    }

    private LocalDateTime AdverseActionDate;

    public LocalDateTime getAdverseActionDate() {
        return AdverseActionDate;
    }

    public void setAdverseActionDate(LocalDateTime value) {
        AdverseActionDate = value;
    }

    private LocalDateTime AdverseActionDateSNAP;

    public LocalDateTime getAdverseActionDateSNAP() {
        return AdverseActionDateSNAP;
    }

    public void setAdverseActionDateSNAP(LocalDateTime value) {
        AdverseActionDateSNAP = value;
    }

    private LocalDateTime AdverseActionDateKTAP;

    public LocalDateTime getAdverseActionDateKTAP() {
        return AdverseActionDateKTAP;
    }

    public void setAdverseActionDateKTAP(LocalDateTime value) {
        AdverseActionDateKTAP = value;
    }

    private LocalDateTime AdverseActionDateCCAP;

    public LocalDateTime getAdverseActionDateCCAP() {
        return AdverseActionDateCCAP;
    }

    public void setAdverseActionDateCCAP(LocalDateTime value) {
        AdverseActionDateCCAP = value;
    }

    private LocalDateTime AdverseActionDateQHP;

    public LocalDateTime getAdverseActionDateQHP() {
        return AdverseActionDateQHP;
    }

    public void setAdverseActionDateQHP(LocalDateTime value) {
        AdverseActionDateQHP = value;
    }

    private boolean CaseProgramRequestDate;

    public boolean getCaseProgramRequestDate() {
        return CaseProgramRequestDate;
    }

    public void setCaseProgramRequestDate(boolean value) {
        CaseProgramRequestDate = value;
    }

    private LocalDateTime CaseRecertDate;

    public LocalDateTime getCaseRecertDate() {
        return CaseRecertDate;
    }

    public void setCaseRecertDate(LocalDateTime value) {
        CaseRecertDate = value;
    }

    private LocalDateTime CutOffDate;

    public LocalDateTime getCutOffDate() {
        return CutOffDate;
    }

    public void setCutOffDate(LocalDateTime value) {
        CutOffDate = value;
    }

    private LocalDateTime R4ImplementationDate;

    public LocalDateTime getR4ImplementationDate() {
        return R4ImplementationDate;
    }

    public void setR4ImplementationDate(LocalDateTime value) {
        R4ImplementationDate = value;
    }

    private LocalDateTime R5ImplementationDate;

    public LocalDateTime getR5ImplementationDate() {
        return R5ImplementationDate;
    }

    public void setR5ImplementationDate(LocalDateTime value) {
        R5ImplementationDate = value;
    }

    private HashMap<String, LocalDateTime> caseMinMaxDate;

    public HashMap<String, LocalDateTime> getcaseMinMaxDate() {
        return caseMinMaxDate;
    }

    public void setcaseMinMaxDate(HashMap<String, LocalDateTime> value) {
        caseMinMaxDate = value;
    }

}
