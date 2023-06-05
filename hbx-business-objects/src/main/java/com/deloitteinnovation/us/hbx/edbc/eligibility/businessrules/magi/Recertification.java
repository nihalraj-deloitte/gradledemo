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
public class Recertification {


    @XmlElement(name = "ForceRenewal")
    private Boolean forceRenewalField;

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlElement(name = "RrogramCode")
    private String programCodeField;

    @XmlElement(name = "RecertDueDate")
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime recertDueDateField;

    @XmlElement(name = "ReviewStatusCode")
    private String reviewStatusCodeField;

    @XmlElement(name = "TypeOfAssistance")
    private String typeOfAssistanceField;

    @XmlElement(name = "case")
    private Case caseField;

    @XmlElement(name = "eDGGroup")
    private EDGGroup eDGGroupField;

    private String idField;

    private String hrefField;

    /**
     *
     */

    public Boolean getForceRenewal() {
        return forceRenewalField;
    }

    public void setForceRenewal(Boolean value) {
        forceRenewalField = value;
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
    public String getProgramCode() {
        return programCodeField;
    }

    public void setProgramCode(String value) {
        programCodeField = value;
    }

    /**
     *
     */
    public LocalDateTime getRecertDueDate() {
        return recertDueDateField;
    }

    public void setRecertDueDate(LocalDateTime value) {
        recertDueDateField = value;
    }

    /**
     *
     */

    public String getReviewStatusCode() {
        return reviewStatusCodeField;
    }

    public void setReviewStatusCode(String value) {
        reviewStatusCodeField = value;
    }

    /**
     *
     */
    public String getTypeOfAssistance() {
        return typeOfAssistanceField;
    }

    public void setTypeOfAssistance(String value) {
        typeOfAssistanceField = value;
    }

    /**
     *
     */
    public final Case getCase() {
        return caseField;
    }

    public final void setCase(Case value) {
        caseField = value;
    }

    /**
     *
     */
    public EDGGroup geteDGGroup() {
        return eDGGroupField;
    }

    public void seteDGGroup(EDGGroup value) {
        eDGGroupField = value;
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