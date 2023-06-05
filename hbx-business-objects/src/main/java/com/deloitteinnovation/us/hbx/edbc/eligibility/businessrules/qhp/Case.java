//
// Translated by CS2J (http://www.cs2j.com): 12/3/2020 12:53:44 PM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Case {

    private LocalDateTime adverseActionDateField;
    private String caseModeField;
    private LocalDateTime edbcRunDateField;
    private Boolean isCaseWithdrawnField;
    private Boolean isHOHDeceasedField;
    private Boolean isInactiveQHPField;
    private LocalDateTime paymentBeginDateField;
    private LocalDateTime qhpRequestDateField;
    private LocalDateTime recertReviewDueDateField;
    private List<Edg_group> edg_groupField = new ArrayList<>();
    private List<Individual> individualField = new ArrayList<>();
    private List<Recertification> recertificationField = new ArrayList<>();
    private String idField;
    private String hrefField;
    private Constants constants;
    private String ValidStateCode;
    private boolean qdpApplied;


    public boolean getQdpApplied() {
        return qdpApplied;
    }

    public void setQdpApplied(boolean qdpApplied) {
        this.qdpApplied = qdpApplied;
    }

    public String getValidStateCode() {
        return ValidStateCode;
    }

    public void setValidStateCode(String validStateCode) {
        ValidStateCode = validStateCode;
    }

    /**
     *
     */
    public LocalDateTime getadverseActionDate() {
        return adverseActionDateField;
    }

    public void setadverseActionDate(LocalDateTime value) {
        adverseActionDateField = value;
    }

    /**
     *
     */
    public String getcaseMode() {
        return caseModeField;
    }

    public void setcaseMode(String value) {
        caseModeField = value;
    }

    /**
     *
     */
    public LocalDateTime getedbcRunDate() {
        return edbcRunDateField;
    }

    public void setedbcRunDate(LocalDateTime value) {
        edbcRunDateField = value;
    }

    /**
     *
     */
    public Boolean getIsCaseWithdrawn() {
        return isCaseWithdrawnField;
    }

    public void setIsCaseWithdrawn(Boolean value) {
        isCaseWithdrawnField = value;
    }

    /**
     *
     */
    public Boolean getIsHOHDeceased() {
        return isHOHDeceasedField;
    }

    public void setIsHOHDeceased(Boolean value) {
        isHOHDeceasedField = value;
    }

    /**
     *
     */
    public Boolean getIsInactiveQHP() {
        return isInactiveQHPField;
    }

    public void setIsInactiveQHP(Boolean value) {
        isInactiveQHPField = value;
    }

    /**
     *
     */
    public LocalDateTime getpaymentBeginDate() {
        return paymentBeginDateField;
    }

    public void setpaymentBeginDate(LocalDateTime value) {
        paymentBeginDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getqhpRequestDate() {
        return qhpRequestDateField;
    }

    public void setqhpRequestDate(LocalDateTime value) {
        qhpRequestDateField = value;
    }

    /**
     *
     */
    public LocalDateTime getrecertReviewDueDate() {
        return recertReviewDueDateField;
    }

    public void setrecertReviewDueDate(LocalDateTime value) {
        recertReviewDueDateField = value;
    }

    /**
     *
     */
    public List<Individual> getindividual() {
        return individualField;
    }

    public void setindividual(List<Individual> value) {
        individualField = value;
    }

    /**
     *
     */
    public List<Recertification> getrecertification() {
        return recertificationField;
    }

    public void setrecertification(List<Recertification> value) {
        recertificationField = value;
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

    public List<Edg_group> getedg_group() {
        return edg_groupField;
    }

    public void setedg_group(List<Edg_group> edg_groupField) {
        this.edg_groupField = edg_groupField;
    }

    public Constants getConstants() {
        return constants;
    }

    public void setConstants(Constants constants) {
        this.constants = constants;
    }

}
