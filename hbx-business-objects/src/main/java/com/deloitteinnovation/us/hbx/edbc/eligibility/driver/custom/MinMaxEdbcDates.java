package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;

public class MinMaxEdbcDates {
    private String DateName;
    private String DateId;
    private String DateSourceTable;
    private String IsForMinEDM;
    private String IsForMaxEDM;
    private LocalDateTime DateValue;

    public String getDateName() {
        return DateName;
    }

    public void setDateName(String dateName) {
        DateName = dateName;
    }

    public String getDateId() {
        return DateId;
    }

    public void setDateId(String dateId) {
        DateId = dateId;
    }

    public String getDateSourceTable() {
        return DateSourceTable;
    }

    public void setDateSourceTable(String dateSourceTable) {
        DateSourceTable = dateSourceTable;
    }

    public String getIsForMinEDM() {
        return IsForMinEDM;
    }

    public void setIsForMinEDM(String isForMinEDM) {
        IsForMinEDM = isForMinEDM;
    }

    public String getIsForMaxEDM() {
        return IsForMaxEDM;
    }

    public void setIsForMaxEDM(String isForMaxEDM) {
        IsForMaxEDM = isForMaxEDM;
    }

    public LocalDateTime getDateValue() {
        return DateValue;
    }

    public void setDateValue(LocalDateTime dateValue) {
        DateValue = dateValue;
    }


}
