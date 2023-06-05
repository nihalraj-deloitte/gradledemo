package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Notice {

    @XmlElement(name = "Code")
    private String codeField;

    @XmlElement(name = "eDGGroup")
    private EDGGroup eDGGroupField;

    @XmlElement(name = "eDGIndividual")
    private EDGIndividual eDGIndividualField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public String getCode() {
        return codeField;
    }

    public void setCode(String value) {
        codeField = value;
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
    public EDGIndividual geteDGIndividual() {
        return eDGIndividualField;
    }

    public void seteDGIndividual(EDGIndividual value) {
        eDGIndividualField = value;
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