package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class MAGIStandardDeduction {

    @XmlElement(name = "ADBH")
    private BigDecimal aDBHField;

    @XmlElement(name = "ADLT")
    private BigDecimal aDLTField;

    @XmlElement(name = "APTC")
    private BigDecimal aPTCField;

    @XmlElement(name = "CHEX")
    private BigDecimal cHEXField;

    @XmlElement(name = "CoverageEndDate")
    private BigDecimal cHIPField;

    @XmlElement(name = "CHL1")
    private BigDecimal cHL1Field;

    @XmlElement(name = "CHL2")
    private BigDecimal cHL2Field;

    @XmlElement(name = "CHL3")
    private BigDecimal cHL3Field;

    @XmlElement(name = "CHL4")
    private BigDecimal cHL4Field;

    @XmlElement(name = "CONV")
    private BigDecimal cONVField;

    @XmlElement(name = "FFCC")
    private BigDecimal fFCCField;

    @XmlElement(name = "FFS1")
    private BigDecimal fFS1Field;

    @XmlElement(name = "FFS2")
    private BigDecimal fFS2Field;

    @XmlElement(name = "PACA")
    private BigDecimal pACAField;

    @XmlElement(name = "PREG")
    private BigDecimal pREGField;

    @XmlElement(name = "TP45")
    private BigDecimal tP45Field;

    @XmlElement(name = "case")
    private Case caseField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public BigDecimal getADBH() {
        return aDBHField;
    }

    public void setADBH(BigDecimal value) {
        aDBHField = value;
    }

    /**
     *
     */
    public BigDecimal getADLT() {
        return aDLTField;
    }

    public void setADLT(BigDecimal value) {
        aDLTField = value;
    }

    /**
     *
     */
    public BigDecimal getAPTC() {
        return aPTCField;
    }

    public void setAPTC(BigDecimal value) {
        aPTCField = value;
    }

    /**
     *
     */
    public BigDecimal getCHEX() {
        return cHEXField;
    }

    public void setCHEX(BigDecimal value) {
        cHEXField = value;
    }

    /**
     *
     */
    public BigDecimal getCHIP() {
        return cHIPField;
    }

    public void setCHIP(BigDecimal value) {
        cHIPField = value;
    }

    /**
     *
     */
    public BigDecimal getCHL1() {
        return cHL1Field;
    }

    public void setCHL1(BigDecimal value) {
        cHL1Field = value;
    }

    /**
     *
     */
    public BigDecimal getCHL2() {
        return cHL2Field;
    }

    public void setCHL2(BigDecimal value) {
        cHL2Field = value;
    }

    /**
     *
     */
    public BigDecimal getCHL3() {
        return cHL3Field;
    }

    public void setCHL3(BigDecimal value) {
        cHL3Field = value;
    }

    /**
     *
     */
    public BigDecimal getCHL4() {
        return cHL4Field;
    }

    public void setCHL4(BigDecimal value) {
        cHL4Field = value;
    }

    /**
     *
     */
    public BigDecimal getCONV() {
        return cONVField;
    }

    public void setCONV(BigDecimal value) {
        cONVField = value;
    }

    /**
     *
     */
    public BigDecimal getFFCC() {
        return fFCCField;
    }

    public void setFFCC(BigDecimal value) {
        fFCCField = value;
    }

    /**
     *
     */
    public BigDecimal getFFS1() {
        return fFS1Field;
    }

    public void setFFS1(BigDecimal value) {
        fFS1Field = value;
    }

    /**
     *
     */
    public BigDecimal getFFS2() {
        return fFS2Field;
    }

    public void setFFS2(BigDecimal value) {
        fFS2Field = value;
    }

    /**
     *
     */
    public BigDecimal getPACA() {
        return pACAField;
    }

    public void setPACA(BigDecimal value) {
        pACAField = value;
    }

    /**
     *
     */
    public BigDecimal getPREG() {
        return pREGField;
    }

    public void setPREG(BigDecimal value) {
        pREGField = value;
    }

    /**
     *
     */
    public BigDecimal getTP45() {
        return tP45Field;
    }

    public void setTP45(BigDecimal value) {
        tP45Field = value;
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