package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;

public class EligibilityIndividualPenaltyCustom {
    private LocalDateTime DisqualificationBeginDate;

    public LocalDateTime getDisqualificationBeginDate() {
        return DisqualificationBeginDate;
    }

    public void setDisqualificationBeginDate(LocalDateTime value) {
        DisqualificationBeginDate = value;
    }

    private LocalDateTime DisqualificationEndDate;

    public LocalDateTime getDisqualificationEndDate() {
        return DisqualificationEndDate;
    }

    public void setDisqualificationEndDate(LocalDateTime value) {
        DisqualificationEndDate = value;
    }

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

    private String ProgramCode = "";

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String value) {
        ProgramCode = value;
    }

    private double ResourceTransferAmount;

    public double getResourceTransferAmount() {
        return ResourceTransferAmount;
    }

    public void setResourceTransferAmount(double value) {
        ResourceTransferAmount = value;
    }

    private int TotalPenaltyDays;

    public int getTotalPenaltyDays() {
        return TotalPenaltyDays;
    }

    public void setTotalPenaltyDays(int value) {
        TotalPenaltyDays = value;
    }

    private String DispostionStatusIndicator = "";

    public String getDispostionStatusIndicator() {
        return DispostionStatusIndicator;
    }

    public void setDispostionStatusIndicator(String value) {
        DispostionStatusIndicator = value;
    }

    private LocalDateTime EligibilityRecordPaymentBeginDate;

    public LocalDateTime getEligibilityRecordPaymentBeginDate() {
        return EligibilityRecordPaymentBeginDate;
    }

    public void setEligibilityRecordPaymentBeginDate(LocalDateTime value) {
        EligibilityRecordPaymentBeginDate = value;
    }

    private LocalDateTime EligibilityRecordPaymentEndDate;

    public LocalDateTime getEligibilityRecordPaymentEndDate() {
        return EligibilityRecordPaymentEndDate;
    }

    public void setEligibilityRecordPaymentEndDate(LocalDateTime value) {
        EligibilityRecordPaymentEndDate = value;
    }

    private String PenaltyDisqualificationTypeCode = "";

    public String getPenaltyDisqualificationTypeCode() {
        return PenaltyDisqualificationTypeCode;
    }

    public void setPenaltyDisqualificationTypeCode(String value) {
        PenaltyDisqualificationTypeCode = value;
    }

    private int NonCooperationSequenceNumber;

    public int getNonCooperationSequenceNumber() {
        return NonCooperationSequenceNumber;
    }

    public void setNonCooperationSequenceNumber(int value) {
        NonCooperationSequenceNumber = value;
    }

    private String TransferredResourceIds = "";

    public String getTransferredResourceIds() {
        return TransferredResourceIds;
    }

    public void setTransferredResourceIds(String value) {
        TransferredResourceIds = value;
    }

    private Long SpouseIndividualId;

    public Long getSpouseIndividualId() {
        return SpouseIndividualId;
    }

    public void setSpouseIndividualId(Long value) {
        SpouseIndividualId = value;
    }

    private int SpouseNCSequenceNumber;

    public int getSpouseNCSequenceNumber() {
        return SpouseNCSequenceNumber;
    }

    public void setSpouseNCSequenceNumber(int value) {
        SpouseNCSequenceNumber = value;
    }

    private LocalDateTime OriginalBeginDate;

    public LocalDateTime getOriginalBeginDate() {
        return OriginalBeginDate;
    }

    public void setOriginalBeginDate(LocalDateTime value) {
        OriginalBeginDate = value;
    }

    private LocalDateTime OriginalEndDate;

    public LocalDateTime getOriginalEndDate() {
        return OriginalEndDate;
    }

    public void setOriginalEndDate(LocalDateTime value) {
        OriginalEndDate = value;
    }

    private String Status = "";

    public String getStatus() {
        return Status;
    }

    public void setStatus(String value) {
        Status = value;
    }

    private String IsAddedByWorker = "";

    public String getIsAddedByWorker() {
        return IsAddedByWorker;
    }

    public void setIsAddedByWorker(String value) {
        IsAddedByWorker = value;
    }

    private String IsAuditTobeDisplayed = "";

    public String getIsAuditTobeDisplayed() {
        return IsAuditTobeDisplayed;
    }

    public void setIsAuditTobeDisplayed(String value) {
        IsAuditTobeDisplayed = value;
    }

    private String IsOverriden = "";

    public String getIsOverriden() {
        return IsOverriden;
    }

    public void setIsOverriden(String value) {
        IsOverriden = value;
    }

    private LocalDateTime OverriddenDate;

    public LocalDateTime getOverriddenDate() {
        return OverriddenDate;
    }

    public void setOverriddenDate(LocalDateTime value) {
        OverriddenDate = value;
    }

    private LocalDateTime ExemptionDate;

    public LocalDateTime getExemptionDate() {
        return ExemptionDate;
    }

    public void setExemptionDate(LocalDateTime value) {
        ExemptionDate = value;
    }

    private String ExemptionReasonCode = "";

    public String getExemptionReasonCode() {
        return ExemptionReasonCode;
    }

    public void setExemptionReasonCode(String value) {
        ExemptionReasonCode = value;
    }

    private String CurrentProgramCode = "";

    public String getCurrentProgramCode() {
        return CurrentProgramCode;
    }

    public void setCurrentProgramCode(String value) {
        CurrentProgramCode = value;
    }

    private int OriginalCaseNumber;

    public int getOriginalCaseNumber() {
        return OriginalCaseNumber;
    }

    public void setOriginalCaseNumber(int value) {
        OriginalCaseNumber = value;
    }

}
