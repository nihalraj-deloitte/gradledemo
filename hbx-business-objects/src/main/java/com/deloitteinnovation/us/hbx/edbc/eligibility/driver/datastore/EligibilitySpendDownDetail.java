//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:45 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import java.time.LocalDateTime;

public class EligibilitySpendDownDetail {
    private LocalDateTime DispositionDate;

    public LocalDateTime getDispositionDate() {
        return DispositionDate;
    }

    public void setDispositionDate(LocalDateTime value) {
        DispositionDate = value;
    }

    private double SpendDownAmount;

    public double getSpendDownAmount() {
        return SpendDownAmount;
    }

    public void setSpendDownAmount(double value) {
        SpendDownAmount = value;
    }

    private LocalDateTime SpendDownMetDate;

    public LocalDateTime getSpendDownMetDate() {
        return SpendDownMetDate;
    }

    public void setSpendDownMetDate(LocalDateTime value) {
        SpendDownMetDate = value;
    }

    private Long CaseNumber;

    public Long getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Long value) {
        CaseNumber = value;
    }

    private Long individualId;

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long value) {
        individualId = value;
    }

    private String PriorMedicaidCode = "";

    public String getPriorMedicaidCode() {
        return PriorMedicaidCode;
    }

    public void setPriorMedicaidCode(String value) {
        PriorMedicaidCode = value;
    }

    private LocalDateTime SpendDownStartDate;

    public LocalDateTime getSpendDownStartDate() {
        return SpendDownStartDate;
    }

    public void setSpendDownStartDate(LocalDateTime value) {
        SpendDownStartDate = value;
    }

    private LocalDateTime SpendDownEndDate;

    public LocalDateTime getSpendDownEndDate() {
        return SpendDownEndDate;
    }

    public void setSpendDownEndDate(LocalDateTime value) {
        SpendDownEndDate = value;
    }

    private String TypeOfAssistanceCode = "";

    public String getTypeOfAssistanceCode() {
        return TypeOfAssistanceCode;
    }

    public void setTypeOfAssistanceCode(String value) {
        TypeOfAssistanceCode = value;
    }

    private int EdgNumber;

    public int getEdgNumber() {
        return EdgNumber;
    }

    public void setEdgNumber(int value) {
        EdgNumber = value;
    }

    private String IsToConsiderQuarter = "";

    public String getIsToConsiderQuarter() {
        return IsToConsiderQuarter;
    }

    public void setIsToConsiderQuarter(String value) {
        IsToConsiderQuarter = value;
    }

}
