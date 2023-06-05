//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:53 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;

public class HBEHIndividualBenefitDetailModelCustom {
    private long HBEHIndividualBenefitDetailId;

    public long getHBEHIndividualBenefitDetailId() {
        return HBEHIndividualBenefitDetailId;
    }

    public void setHBEHIndividualBenefitDetailId(long value) {
        HBEHIndividualBenefitDetailId = value;
    }

    private String BenefitCategory = "";

    public String getBenefitCategory() {
        return BenefitCategory;
    }

    public void setBenefitCategory(String value) {
        BenefitCategory = value;
    }

    private Long CaseNumber;

    public Long getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(Long value) {
        CaseNumber = value;
    }

    private String CEStatusReasonCode = "";

    public String getCEStatusReasonCode() {
        return CEStatusReasonCode;
    }

    public void setCEStatusReasonCode(String value) {
        CEStatusReasonCode = value;
    }

    private LocalDateTime CreateDate;

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime value) {
        CreateDate = value;
    }

    private LocalDateTime EDMBeginDate;

    public LocalDateTime getEDMBeginDate() {
        return EDMBeginDate;
    }

    public void setEDMBeginDate(LocalDateTime value) {
        EDMBeginDate = value;
    }

    private LocalDateTime EDMEndDate;

    public LocalDateTime getEDMEndDate() {
        return EDMEndDate;
    }

    public void setEDMEndDate(LocalDateTime value) {
        EDMEndDate = value;
    }

    private Long individualId;

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long value) {
        individualId = value;
    }

    private String CEStatus = "";

    public String getCEStatus() {
        return CEStatus;
    }

    public void setCEStatus(String value) {
        CEStatus = value;
    }

    private String IsDelete = "";

    public String getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(String value) {
        IsDelete = value;
    }

    private String IsMedicallyFrail = "";

    public String getIsMedicallyFrail() {
        return IsMedicallyFrail;
    }

    public void setIsMedicallyFrail(String value) {
        IsMedicallyFrail = value;
    }

    private LocalDateTime MedicalFrailtyExpirationDate;

    public LocalDateTime getMedicalFrailtyExpirationDate() {
        return MedicalFrailtyExpirationDate;
    }

    public void setMedicalFrailtyExpirationDate(LocalDateTime value) {
        MedicalFrailtyExpirationDate = value;
    }

    private String MedicalFrailtySource = "";

    public String getMedicalFrailtySource() {
        return MedicalFrailtySource;
    }

    public void setMedicalFrailtySource(String value) {
        MedicalFrailtySource = value;
    }

    private String PlanType = "";

    public String getPlanType() {
        return PlanType;
    }

    public void setPlanType(String value) {
        PlanType = value;
    }

    private String StatusIndicator = "";

    public String getStatusIndicator() {
        return StatusIndicator;
    }

    public void setStatusIndicator(String value) {
        StatusIndicator = value;
    }

    private LocalDateTime UpdateDate;

    public LocalDateTime getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(LocalDateTime value) {
        UpdateDate = value;
    }

}
