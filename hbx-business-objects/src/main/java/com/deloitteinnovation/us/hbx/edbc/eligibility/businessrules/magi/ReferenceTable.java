package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class ReferenceTable {

    @XmlElement(name = "AFDC_Limit")
    private BigDecimal aFDC_LimitField;

    @XmlElement(name = "FPL_100_Percent")
    private BigDecimal fPL_100_PercentField;

    @XmlElement(name = "FPL_133_Percent")
    private BigDecimal fPL_133_PercentField;

    @XmlElement(name = "FPL_150_Percent")
    private BigDecimal fPL_150_PercentField;

    @XmlElement(name = "FPL_185_Percent")
    private BigDecimal fPL_185_PercentField;

    @XmlElement(name = "FPL_200_Percent")
    private BigDecimal fPL_200_PercentField;

    @XmlElement(name = "FPL_250_Percent")
    private BigDecimal fPL_250_PercentField;

    @XmlElement(name = "FPL_300_Percent")
    private BigDecimal fPL_300_PercentField;

    @XmlElement(name = "FPL_400_Percent")
    private BigDecimal fPL_400_PercentField;

    @XmlElement(name = "case")
    private Case caseField;

    @XmlElement(name = "eDGGroup")
    private EDGGroup eDGGroupField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public BigDecimal getAFDC_Limit() {
        return aFDC_LimitField;
    }

    public void setAFDC_Limit(BigDecimal value) {
        aFDC_LimitField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_100_Percent() {
        return fPL_100_PercentField;
    }

    public void setFPL_100_Percent(BigDecimal value) {
        fPL_100_PercentField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_133_Percent() {
        return fPL_133_PercentField;
    }

    public void setFPL_133_Percent(BigDecimal value) {
        fPL_133_PercentField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_150_Percent() {
        return fPL_150_PercentField;
    }

    public void setFPL_150_Percent(BigDecimal value) {
        fPL_150_PercentField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_185_Percent() {
        return fPL_185_PercentField;
    }

    public void setFPL_185_Percent(BigDecimal value) {
        fPL_185_PercentField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_200_Percent() {
        return fPL_200_PercentField;
    }

    public void setFPL_200_Percent(BigDecimal value) {
        fPL_200_PercentField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_250_Percent() {
        return fPL_250_PercentField;
    }

    public void setFPL_250_Percent(BigDecimal value) {
        fPL_250_PercentField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_300_Percent() {
        return fPL_300_PercentField;
    }

    public void setFPL_300_Percent(BigDecimal value) {
        fPL_300_PercentField = value;
    }

    /**
     *
     */
    public BigDecimal getFPL_400_Percent() {
        return fPL_400_PercentField;
    }

    public void setFPL_400_Percent(BigDecimal value) {
        fPL_400_PercentField = value;
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