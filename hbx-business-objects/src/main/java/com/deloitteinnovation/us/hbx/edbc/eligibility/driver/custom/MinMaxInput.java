package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MinMaxInput {
    private int SerialNumber;
    private String ProgramCode;
    private Long CaseNumber;
    private String ProgramStatusCode;
    private String ReviewStatusCode;
    private String EdbcRunMode;
    private List<MinMaxEdbcDates> InputList = new ArrayList<>();
    private LocalDateTime MinDate;
    private LocalDateTime MaxDate;
    private String Comments;
    private String ProgramMode;
    private String WaiveIndicator;
    private String RenewalDays;
    private String RunMonth;

    @Override
    public String toString() {
        return "MinMaxInput [SerialNumber=" + SerialNumber + ", ProgramCode=" + ProgramCode + ", CaseNumber="
                + CaseNumber + ", ProgramStatusCode=" + ProgramStatusCode + ", ReviewStatusCode=" + ReviewStatusCode
                + ", EdbcRunMode=" + EdbcRunMode + ", InputList=" + InputList + ", MinDate=" + MinDate + ", MaxDate="
                + MaxDate + ", Comments=" + Comments + ", ProgramMode=" + ProgramMode + ", WaiveIndicator="
                + WaiveIndicator + ", RenewalDays=" + RenewalDays + ", RunMonth=" + RunMonth
                + ", EvaluationDatePeriodCode=" + EvaluationDatePeriodCode + "]";
    }

    private String EvaluationDatePeriodCode;

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String programCode) {
        ProgramCode = programCode;
    }

    public Long getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Long caseNumber) {
        CaseNumber = caseNumber;
    }

    public String getProgramStatusCode() {
        return ProgramStatusCode;
    }

    public void setProgramStatusCode(String programStatusCode) {
        ProgramStatusCode = programStatusCode;
    }

    public String getReviewStatusCode() {
        return ReviewStatusCode;
    }

    public void setReviewStatusCode(String reviewStatusCode) {
        ReviewStatusCode = reviewStatusCode;
    }

    public String getEdbcRunMode() {
        return EdbcRunMode;
    }

    public void setEdbcRunMode(String edbcRunMode) {
        EdbcRunMode = edbcRunMode;
    }

    public List<MinMaxEdbcDates> getInputList() {
        return InputList;
    }

    public void setInputList(List<MinMaxEdbcDates> inputList) {
        InputList = inputList;
    }

    public LocalDateTime getMinDate() {
        return MinDate;
    }

    public void setMinDate(LocalDateTime minDate) {
        MinDate = minDate;
    }

    public LocalDateTime getMaxDate() {
        return MaxDate;
    }

    public void setMaxDate(LocalDateTime maxDate) {
        MaxDate = maxDate;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public String getProgramMode() {
        return ProgramMode;
    }

    public void setProgramMode(String programMode) {
        ProgramMode = programMode;
    }

    public String getWaiveIndicator() {
        return WaiveIndicator;
    }

    public void setWaiveIndicator(String waiveIndicator) {
        WaiveIndicator = waiveIndicator;
    }

    public String getRenewalDays() {
        return RenewalDays;
    }

    public void setRenewalDays(String renewalDays) {
        RenewalDays = renewalDays;
    }

    public String getRunMonth() {
        return RunMonth;
    }

    public void setRunMonth(String runMonth) {
        RunMonth = runMonth;
    }

    public String getEvaluationDatePeriodCode() {
        return EvaluationDatePeriodCode;
    }

    public void setEvaluationDatePeriodCode(String evaluationDatePeriodCode) {
        EvaluationDatePeriodCode = evaluationDatePeriodCode;
    }

}