//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:50 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class IncomePayDetailEntity {
    private String IncomeReference = "";

    public String getIncomeReference() {
        return IncomeReference;
    }

    public void setIncomeReference(String value) {
        IncomeReference = value;
    }

    private String IncomeSource = "";

    public String getIncomeSource() {
        return IncomeSource;
    }

    public void setIncomeSource(String value) {
        IncomeSource = value;
    }

    private long IndividualId;

    public long getIndividualId() {
        return IndividualId;
    }

    public void setIndividualId(long value) {
        IndividualId = value;
    }

    private int IncomePayDetailId;

    public int getIncomePayDetailId() {
        return IncomePayDetailId;
    }

    public void setIncomePayDetailId(int value) {
        IncomePayDetailId = value;
    }

    private int EmployerId;

    public int getEmployerId() {
        return EmployerId;
    }

    public void setEmployerId(int value) {
        EmployerId = value;
    }

    private String IncomeType = "";

    public String getIncomeType() {
        return IncomeType;
    }

    public void setIncomeType(String value) {
        IncomeType = value;
    }

    private String DetailType = "";

    public String getDetailType() {
        return DetailType;
    }

    public void setDetailType(String value) {
        DetailType = value;
    }

    private double Amount;

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double value) {
        Amount = value;
    }

    private String IsTemporarilyOnLeave = "";

    public String getIsTemporarilyOnLeave() {
        return IsTemporarilyOnLeave;
    }

    public void setIsTemporarilyOnLeave(String value) {
        IsTemporarilyOnLeave = value;
    }

    private List<IncomePayAssociation> incomePayDetailIds = new ArrayList<>();

    public List<IncomePayAssociation> getincomePayDetailIds() {
        return incomePayDetailIds;
    }

    public void setincomePayDetailIds(List<IncomePayAssociation> value) {
        incomePayDetailIds = value;
    }

    // CR 935
    private LocalDateTime EndDate;

    public LocalDateTime getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDateTime value) {
        EndDate = value;
    }

}
