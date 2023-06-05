package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.LocalDateTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InsurancePolicy {

    @XmlElement(name = "AffordabilityTestResultCode")
    private String affordabilityTestResultCodeField;

    @XmlElement(name = "CoverageEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime coverageEndDateField;

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlElement(name = "InsurancePolicyBeginDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime insurancePolicyBeginDateField;

    @XmlElement(name = "InsurancePolicyEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime insurancePolicyEndDateField;

    @XmlElement(name = "TypeOfCoverageCode")
    private String typeOfCoverageCodeField;

    @XmlElement(name = "individual")
    private Individual individualField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public String getAffordabilityTestResultCode() {
        return affordabilityTestResultCodeField;
    }

    public void setAffordabilityTestResultCode(String value) {
        affordabilityTestResultCodeField = value;
    }

    /**
     *
     */
    public LocalDateTime getCoverageEndDate() {
        return coverageEndDateField;
    }

    public void setCoverageEndDate(LocalDateTime value) {
        coverageEndDateField = value;
    }

    /**
     *
     */
    public Long getIndividualId() {
        return individualIdField;
    }

    public void setIndividualId(Long value) {
        individualIdField = value;
    }

    /**
     *
     */
    public LocalDateTime getInsurancePolicyBeginDate() {
        return insurancePolicyBeginDateField;
    }

    public void setInsurancePolicyBeginDate(LocalDateTime value) {
        insurancePolicyBeginDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getInsurancePolicyEndDate() {
        return insurancePolicyEndDateField;
    }

    public void setInsurancePolicyEndDate(LocalDateTime value) {
        insurancePolicyEndDateField = value;
    }

    /**
     *
     */
    public String getTypeOfCoverageCode() {
        return typeOfCoverageCodeField;
    }

    public void setTypeOfCoverageCode(String value) {
        typeOfCoverageCodeField = value;
    }

    /**
     *
     */
    public Individual getindividual() {
        return individualField;
    }

    public void setindividual(Individual value) {
        individualField = value;
    }

    /**
     *
     */
    public String getid() {
        return idField;
    }

    public void setid(String value) {
        idField = value;
    }

    /**
     *
     */
    public String gethref() {
        return hrefField;
    }

    public void sethref(String value) {
        hrefField = value;
    }

    private Boolean isVerified;

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

}