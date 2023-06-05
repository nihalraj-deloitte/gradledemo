package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class FPLTypeOfAssistance {

    @XmlElement(name = "FPLLimit")
    private String fPLLimitField;

    @XmlElement(name = "StandardDeduction")
    private BigDecimal standardDeductionField;

    @XmlElement(name = "TypeOfAssistance")
    private String typeOfAssistanceField;

    @XmlElement(name = "case")
    private Case caseField;

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
    public BigDecimal getStandardDeduction() {
        return standardDeductionField;
    }

    public void setStandardDeduction(BigDecimal value) {
        standardDeductionField = value;
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