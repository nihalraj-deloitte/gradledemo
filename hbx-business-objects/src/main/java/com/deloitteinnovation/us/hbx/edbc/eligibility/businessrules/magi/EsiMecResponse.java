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
public class EsiMecResponse {

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @XmlElement(name = "InsuranceEffectiveDate")
    private LocalDateTime insuranceEffectiveDateField;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @XmlElement(name = "InsuranceExpirationDate")
    private LocalDateTime insuranceExpirationDateField;

    @XmlElement(name = "IsApplicantInsured")
    private Boolean isApplicantInsuredField;

    @XmlElement(name = "individual")
    private Individual individualField;

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
    public LocalDateTime getInsuranceExpirationDate() {
        return insuranceExpirationDateField;
    }

    public void setInsuranceExpirationDate(LocalDateTime value) {
        insuranceExpirationDateField = value;
    }

    /**
     *
     */


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