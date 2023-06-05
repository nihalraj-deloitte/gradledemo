package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EDGIndividualExpenses {

    @XmlElement(name = "ExpenseType")
    private String expenseTypeField;

    @XmlElement(name = "ExpenseValue")
    private BigDecimal expenseValueField;

    @XmlElement(name = "eDGIndividual")
    private EDGIndividual eDGIndividualField;

    @XmlElement(name = "individual")
    private Individual individualField;

    private String idField;

    private String hrefField;


    /**
     *
     */

    public String getExpenseType() {
        return expenseTypeField;
    }

    public void setExpenseType(String value) {
        expenseTypeField = value;
    }

    public BigDecimal getExpenseValue() {
        return expenseValueField;
    }

    public void setExpenseValue(BigDecimal value) {
        expenseValueField = value;
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