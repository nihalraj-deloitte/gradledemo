package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class R5_PayDetail {

    @XmlElement(name = "R5_CountableAmount")
    private BigDecimal r5_CountableAmountField;

    @XmlElement(name = "R5_DetailType")
    private String r5_DetailTypeField;

    @XmlElement(name = "R5_ExclusionAmount")
    private BigDecimal r5_ExclusionAmountField;

    @XmlElement(name = "R5_ExclusionReasonCode")
    private String r5_ExclusionReasonCodeField;

    @XmlElement(name = "R5_IncomeAmount")
    private BigDecimal r5_IncomeAmountField;

    @XmlElement(name = "R5_IncomeDetailId")
    private Long r5_IncomeDetailIdField;

    @XmlElement(name = "R5_IncomeId")
    private Long r5_IncomeIdField;

    @XmlElement(name = "R5_IncomeReference")
    private String r5_IncomeReferenceField;

    @XmlElement(name = "R5_IncomeSource")
    private String r5_IncomeSourceField;

    @XmlElement(name = "R5_IncomeType")
    private String r5_IncomeTypeField;

    @XmlElement(name = "R5_IndividualId")
    private Long r5_IndividualIdField;

    @XmlElement(name = "R5_IsConsidered")
    private String r5_IsConsideredField;

    @XmlElement(name = "R5_IsExempt")
    private Boolean r5_IsExemptField;

    @XmlElement(name = "case")
    private Case caseField;

    @XmlElement(name = "eDGIndividual")
    private EDGIndividual eDGIndividualField;

    private String idField;

    private String hrefField;

    @XmlElement(name = "R5_IsIncomeExcluded")
    private Boolean R5_IsIncomeExcludedField;

    /**
     *
     */
    public BigDecimal getR5_CountableAmount() {
        return r5_CountableAmountField;
    }

    public void setR5_CountableAmount(BigDecimal value) {
        r5_CountableAmountField = value;
    }

    /**
     *
     */
    public String getR5_DetailType() {
        return r5_DetailTypeField;
    }

    public void setR5_DetailType(String value) {
        r5_DetailTypeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_ExclusionAmount() {
        return r5_ExclusionAmountField;
    }

    public void setR5_ExclusionAmount(BigDecimal value) {
        r5_ExclusionAmountField = value;
    }

    /**
     *
     */
    public String getR5_ExclusionReasonCode() {
        return r5_ExclusionReasonCodeField;
    }

    public void setR5_ExclusionReasonCode(String value) {
        r5_ExclusionReasonCodeField = value;
    }

    /**
     *
     */
    public BigDecimal getR5_IncomeAmount() {
        return r5_IncomeAmountField;
    }

    public void setR5_IncomeAmount(BigDecimal value) {
        r5_IncomeAmountField = value;
    }

    /**
     *
     */
    public Long getR5_IncomeDetailId() {
        return r5_IncomeDetailIdField;
    }

    public void setR5_IncomeDetailId(Long value) {
        r5_IncomeDetailIdField = value;
    }

    /**
     *
     */
    public Long getR5_IncomeId() {
        return r5_IncomeIdField;
    }

    public void setR5_IncomeId(Long value) {
        r5_IncomeIdField = value;
    }

    /**
     *
     */
    public String getR5_IncomeReference() {
        return r5_IncomeReferenceField;
    }

    public void setR5_IncomeReference(String value) {
        r5_IncomeReferenceField = value;
    }

    /**
     *
     */
    public String getR5_IncomeSource() {
        return r5_IncomeSourceField;
    }

    public void setR5_IncomeSource(String value) {
        r5_IncomeSourceField = value;
    }

    /**
     *
     */
    public String getR5_IncomeType() {
        return r5_IncomeTypeField;
    }

    public void setR5_IncomeType(String value) {
        r5_IncomeTypeField = value;
    }

    /**
     *
     */
    public Long getR5_IndividualId() {
        return r5_IndividualIdField;
    }

    public void setR5_IndividualId(Long value) {
        r5_IndividualIdField = value;
    }

    /**
     *
     */
    public String getR5_IsConsidered() {
        return r5_IsConsideredField;
    }

    public void setR5_IsConsidered(String value) {
        r5_IsConsideredField = value;
    }

    /**
     *
     */
    public Boolean getR5_IsExempt() {
        return r5_IsExemptField;
    }

    public void setR5_IsExempt(Boolean value) {
        r5_IsExemptField = value;
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

    public Boolean getR5_IsIncomeExcludedField() {
        return R5_IsIncomeExcludedField;
    }

    public void setR5_IsIncomeExcludedField(Boolean R5_IsIncomeExcludedField) {
        this.R5_IsIncomeExcludedField = R5_IsIncomeExcludedField;
    }

}