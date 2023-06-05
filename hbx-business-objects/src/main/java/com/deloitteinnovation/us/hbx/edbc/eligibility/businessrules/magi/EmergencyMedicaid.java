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
public class EmergencyMedicaid {

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @XmlElement(name = "EmergencyBeginDate")
    private LocalDateTime emergencyBeginDateField;

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlElement(name = "IsEMAExtensionRequested")
    private Boolean isEMAExtensionRequestedField;

    @XmlElement(name = "case")
    private Case caseField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public LocalDateTime getEmergencyBeginDate() {
        return emergencyBeginDateField;
    }

    public void setEmergencyBeginDate(LocalDateTime value) {
        emergencyBeginDateField = value;
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
    public Boolean getIsEMAExtensionRequested() {
        return isEMAExtensionRequestedField;
    }

    public void setIsEMAExtensionRequested(Boolean value) {
        isEMAExtensionRequestedField = value;
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