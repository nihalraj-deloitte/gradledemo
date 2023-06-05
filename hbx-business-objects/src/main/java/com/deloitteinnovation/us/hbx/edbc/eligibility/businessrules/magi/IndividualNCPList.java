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
public class IndividualNCPList {

    @XmlElement(name = "IsApplicantCooperative")
    private Boolean isApplicantCooperativeField;

    @XmlElement(name = "IsNCPGoodCauseValidField")
    private Boolean isNCPGoodCauseValidField;

    @XmlElement(name = "NCPKASESReceivedDateField")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime nCPKASESReceivedDateField;

    @XmlElement(name = "individualField")
    private Individual individualField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public Boolean getIsApplicantCooperative() {
        return isApplicantCooperativeField;
    }

    public void setIsApplicantCooperative(Boolean value) {
        isApplicantCooperativeField = value;
    }

    /**
     *
     */
    public Boolean getIsNCPGoodCauseValid() {
        return isNCPGoodCauseValidField;
    }

    public void setIsNCPGoodCauseValid(Boolean value) {
        isNCPGoodCauseValidField = value;
    }

    /**
     *
     */
    public LocalDateTime getNCPKASESReceivedDate() {
        return nCPKASESReceivedDateField;
    }

    public void setNCPKASESReceivedDate(LocalDateTime value) {
        nCPKASESReceivedDateField = value;
    }

    /**
     *
     */
    public Individual getIndividual() {
        return individualField;
    }

    public void setIndividual(Individual value) {
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