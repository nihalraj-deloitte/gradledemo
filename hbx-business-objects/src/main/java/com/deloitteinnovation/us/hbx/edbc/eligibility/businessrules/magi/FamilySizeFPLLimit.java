package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class FamilySizeFPLLimit {

    @XmlElement(name = "FPLLimit")
    private String fPLLimitField;

    @XmlElement(name = "FPLLimitAmount")
    private BigDecimal fPLLimitAmountField;

    @XmlElement(name = "eDGGroup")
    private EDGGroup eDGGroupField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public String getFPLLimit() {
        return fPLLimitField;
    }

    public void setFPLLimit(String value) {
        fPLLimitField = value;
    }

    /**
     *
     */
    public BigDecimal getFPLLimitAmount() {
        return fPLLimitAmountField;
    }

    public void setFPLLimitAmount(BigDecimal value) {
        fPLLimitAmountField = value;
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