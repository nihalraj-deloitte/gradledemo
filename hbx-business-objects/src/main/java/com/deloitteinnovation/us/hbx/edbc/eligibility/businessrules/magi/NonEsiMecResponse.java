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
public class NonEsiMecResponse {

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlElement(name = "InsuranceEffectiveDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime insuranceEffectiveDateField;

    @XmlElement(name = "InsuranceEndDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime insuranceEndDateField;

    @XmlElement(name = "MECVerificationCode")
    private String mECVerificationCodeField;

    @XmlElement(name = "OrganizationCode")
    private String organizationCodeField;

    @XmlElement(name = "individual")
    private Individual individualField;

    @XmlElement(name = "Source")
    private String sourceField;

    private String idField;

    private String hrefField;

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
    public LocalDateTime getInsuranceEffectiveDate() {
        return insuranceEffectiveDateField;
    }

    public void setInsuranceEffectiveDate(LocalDateTime value) {
        insuranceEffectiveDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getInsuranceEndDate() {
        return insuranceEndDateField;
    }

    public void setInsuranceEndDate(LocalDateTime value) {
        insuranceEndDateField = value;
    }

    /**
     *
     */
    public String getMECVerificationCode() {
        return mECVerificationCodeField;
    }

    public void setMECVerificationCode(String value) {
        mECVerificationCodeField = value;
    }

    /**
     *
     */
    public String getSource() {
        return sourceField;
    }

    public void setSource(String value) {
        sourceField = value;
    }

    /**
     *
     */
    public String getOrganizationCode() {
        return organizationCodeField;
    }

    public void setOrganizationCode(String value) {
        organizationCodeField = value;
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

}