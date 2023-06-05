package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service.BenefitSourceCodes;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service.BenefitTypeCodes;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service.MedicalCoverageGroupCodes;

import javax.xml.datatype.XMLGregorianCalendar;

public class MemberEligDetails {

    private Long IndividualId;
    private BenefitTypeCodes benefitType;
    private MedicalCoverageGroupCodes eligStatusCd;
    private String csrCategory;
    private XMLGregorianCalendar eligibilityStartDate;
    private XMLGregorianCalendar eligibilityEndDate;
    private BenefitSourceCodes benefitSource;

    public BenefitTypeCodes getBenefitType() {
        return benefitType;
    }

    public void setBenefitType(BenefitTypeCodes benefitType) {
        this.benefitType = benefitType;
    }

    public MedicalCoverageGroupCodes getEligStatusCd() {
        return eligStatusCd;
    }

    public void setEligStatusCd(MedicalCoverageGroupCodes eligStatusCd) {
        this.eligStatusCd = eligStatusCd;
    }

    public String getCsrCategory() {
        return csrCategory;
    }

    public void setCsrCategory(String csrCategory) {
        this.csrCategory = csrCategory;
    }

    public XMLGregorianCalendar getEligibilityStartDate() {
        return eligibilityStartDate;
    }

    public void setEligibilityStartDate(XMLGregorianCalendar eligibilityStartDate) {
        this.eligibilityStartDate = eligibilityStartDate;
    }

    public XMLGregorianCalendar getEligibilityEndDate() {
        return eligibilityEndDate;
    }

    public void setEligibilityEndDate(XMLGregorianCalendar eligibilityEndDate) {
        this.eligibilityEndDate = eligibilityEndDate;
    }

    public BenefitSourceCodes getBenefitSource() {
        return benefitSource;
    }

    public void setBenefitSource(BenefitSourceCodes benefitSource) {
        this.benefitSource = benefitSource;
    }

    public Long getIndividualId() {
        return IndividualId;
    }

    public void setIndividualId(Long individualId) {
        IndividualId = individualId;
    }
}
