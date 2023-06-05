package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Income {


    @XmlElement(name = "APTCIncome")
    private BigDecimal aPTCIncomeField;

    @XmlElement(name = "IncomeCategory")
    private String incomeCategoryField;

    @XmlElement(name = "IncomeId")
    private Long incomeIdField;

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlElement(name = "MonthlyIncome")
    private BigDecimal monthlyIncomeField;

    @XmlElement(name = "R5_IsSelfAttestedIncome")
    private Boolean r5_IsSelfAttestedIncomeField;

    @XmlElement(name = "TypeOfIncome")
    private String typeOfIncomeField;

    @XmlElement(name = "eDGIndividual")
    private EDGIndividual eDGIndividualField;

    @XmlElement(name = "individual")
    private Individual individualField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public BigDecimal getAPTCIncome() {
        return aPTCIncomeField;
    }

    public void setAPTCIncome(BigDecimal value) {
        aPTCIncomeField = value;
    }

    /**
     *
     */
    public String getIncomeCategory() {
        return incomeCategoryField;
    }

    public void setIncomeCategory(String value) {
        incomeCategoryField = value;
    }

    /**
     *
     */
    public Long getIncomeId() {
        return incomeIdField;
    }

    public void setIncomeId(Long value) {
        incomeIdField = value;
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
    public BigDecimal getMonthlyIncome() {
        return monthlyIncomeField;
    }

    public void setMonthlyIncome(BigDecimal value) {
        monthlyIncomeField = value;
    }

    /**
     *
     */
    public Boolean getR5_IsSelfAttestedIncome() {
        return r5_IsSelfAttestedIncomeField;
    }

    public void setR5_IsSelfAttestedIncome(Boolean value) {
        r5_IsSelfAttestedIncomeField = value;
    }

    /**
     *
     */
    public String getTypeOfIncome() {
        return typeOfIncomeField;
    }

    public void setTypeOfIncome(String value) {
        typeOfIncomeField = value;
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