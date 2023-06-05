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
public class Edg_group {

    public Edg_group() {

    }

    public Edg_group(Edg_group edgGroupToBeCloned) {

        this.setedg_individual(new ArrayList<>());
        this.setadverseActionAllowedSw(edgGroupToBeCloned.getadverseActionAllowedSw());
        this.setcase(edgGroupToBeCloned.getcase());
        this.setcertifiedGroupAdultsCount(edgGroupToBeCloned.getcertifiedGroupAdultsCount());
        this.setcertifiedGroupChildCount(edgGroupToBeCloned.getcertifiedGroupChildCount());
        this.setcertifiedGroupSize(edgGroupToBeCloned.getcertifiedGroupSize());
        this.setcreatedForIndivID(edgGroupToBeCloned.getcreatedForIndivID());
        this.setdummyGroupCreated(edgGroupToBeCloned.getdummyGroupCreated());
        this.setedgEligibilityResultCode(edgGroupToBeCloned.getedgEligibilityResultCode());
        this.setEdgID(edgGroupToBeCloned.getEdgID());
        this.setedgReprocessSw(edgGroupToBeCloned.getedgReprocessSw());
        this.setedgSize(edgGroupToBeCloned.getedgSize());
        this.setedm(edgGroupToBeCloned.getedm());
        this.setEDMEndDateSpecified(edgGroupToBeCloned.getEDMEndDateSpecified());
        this.setFinancialEligibilityResultCode(edgGroupToBeCloned.getFinancialEligibilityResultCode());
        this.sethref(edgGroupToBeCloned.gethref());
        this.setid(edgGroupToBeCloned.getid());
        this.setisNew(edgGroupToBeCloned.getisNew());
        this.setNonFinancialEligibilityResultCode(edgGroupToBeCloned.getNonFinancialEligibilityResultCode());
        this.setpaymentbegdt(edgGroupToBeCloned.getpaymentbegdt());
        this.setPerform_32_37_119_Alien_Check(edgGroupToBeCloned.getPerform_32_37_119_Alien_Check());
        this.setPerform_9900_003(edgGroupToBeCloned.getPerform_9900_003());
        this.setPerform_9900_004(edgGroupToBeCloned.getPerform_9900_004());
        this.setPerform_9900_006(edgGroupToBeCloned.getPerform_9900_006());
        this.setPerform_9900_130(edgGroupToBeCloned.getPerform_9900_130());
        this.setPerform_9900_160(edgGroupToBeCloned.getPerform_9900_160());
        this.setperform_9900_501(edgGroupToBeCloned.getperform_9900_501());
        this.setPerform_VLP_QNC_Check(edgGroupToBeCloned.getPerform_VLP_QNC_Check());
        this.setPriorMedicaidCode(edgGroupToBeCloned.getPriorMedicaidCode());
        this.setprogActivityType(edgGroupToBeCloned.getprogActivityType());
        this.setprogramCd(edgGroupToBeCloned.getprogramCd());
        this.setprogramRescindDate(edgGroupToBeCloned.getprogramRescindDate());
        this.setprogramStatus(edgGroupToBeCloned.getprogramStatus());
        this.setqhpReviewDueDt(edgGroupToBeCloned.getqhpReviewDueDt());
        this.setrecertification(edgGroupToBeCloned.getrecertification());
        this.setTOAPriorityNumber(edgGroupToBeCloned.getTOAPriorityNumber());
        this.settpCode(edgGroupToBeCloned.gettpCode());
        this.setV_tempMonths_9900_004(edgGroupToBeCloned.getV_tempMonths_9900_004());
        this.setverificationResultCode(edgGroupToBeCloned.getverificationResultCode());

        for (Edg_individual currentEdgIndiv : edgGroupToBeCloned.getedg_individual()) {
            this.getedg_individual().add(new Edg_individual(currentEdgIndiv));
        }
        this.setnotice(new ArrayList<>());
        for (Notice currentNotice : edgGroupToBeCloned.getnotice()) {
            this.getnotice().add(new Notice(currentNotice));
        }
    }

    private Boolean adverseActionAllowedSwField;
    private Long certifiedGroupAdultsCountField;
    private Long certifiedGroupChildCountField;
    private Long certifiedGroupSizeField;
    private Long createdForIndivIDField;
    private Boolean dummyGroupCreatedField;
    private String edgEligibilityResultCodeField;
    private Boolean edgReprocessSwField;
    private Long edgSizeField;
    private LocalDateTime edmField;
    private boolean eDMEndDateFieldSpecified;
    private String financialEligibilityResultCodeField;
    private Boolean isNewField;
    private String nonFinancialEligibilityResultCodeField;
    private LocalDateTime paymentbegdtField;
    private Boolean perform_9900_501Field;
    private String priorMedicaidCodeField;
    private String progActivityTypeField;
    private String programCdField;
    private LocalDateTime programRescindDateField;
    private String programStatusField;
    private LocalDateTime qhpReviewDueDtField;
    private Long tOAPriorityNumberField;
    private String tpCodeField;
    private String verificationResultCodeField;
    private Case caseField;
    private List<Edg_individual> edg_individualField = new ArrayList<>();
    private List<Notice> noticeField = new ArrayList<>();
    private Recertification recertificationField;
    private String idField;
    private String hrefField;

    /// Added Transition variable and Respective get set Method
    private String edgID;
    private Boolean perform_32_37_119_Alien_Check;
    private Boolean perform_9900_003;
    private Boolean perform_9900_004;
    private Boolean perform_9900_006;
    private Boolean perform_9900_130;
    private Boolean perform_9900_160;
    private Boolean perform_VLP_QNC_Check;
    private Integer v_tempMonths_9900_004;

    public Boolean getPerform_32_37_119_Alien_Check() {
        return perform_32_37_119_Alien_Check;
    }

    public void setPerform_32_37_119_Alien_Check(Boolean perform_32_37_119_Alien_Check) {
        this.perform_32_37_119_Alien_Check = perform_32_37_119_Alien_Check;
    }

    public Boolean getPerform_9900_003() {
        return perform_9900_003;
    }

    public void setPerform_9900_003(Boolean perform_9900_003) {
        this.perform_9900_003 = perform_9900_003;
    }

    public Boolean getPerform_9900_004() {
        return perform_9900_004;
    }

    public void setPerform_9900_004(Boolean perform_9900_004) {
        this.perform_9900_004 = perform_9900_004;
    }

    public Boolean getPerform_9900_006() {
        return perform_9900_006;
    }

    public void setPerform_9900_006(Boolean perform_9900_006) {
        this.perform_9900_006 = perform_9900_006;
    }

    public Boolean getPerform_9900_130() {
        return perform_9900_130;
    }

    public void setPerform_9900_130(Boolean perform_9900_130) {
        this.perform_9900_130 = perform_9900_130;
    }

    public Boolean getPerform_9900_160() {
        return perform_9900_160;
    }

    public void setPerform_9900_160(Boolean perform_9900_160) {
        this.perform_9900_160 = perform_9900_160;
    }

    public Boolean getPerform_VLP_QNC_Check() {
        return perform_VLP_QNC_Check;
    }

    public void setPerform_VLP_QNC_Check(Boolean perform_VLP_QNC_Check) {
        this.perform_VLP_QNC_Check = perform_VLP_QNC_Check;
    }

    public Integer getV_tempMonths_9900_004() {
        return v_tempMonths_9900_004;
    }

    public void setV_tempMonths_9900_004(Integer v_tempMonths_9900_004) {
        this.v_tempMonths_9900_004 = v_tempMonths_9900_004;
    }

    public String getEdgID() {
        return edgID;
    }

    public void setEdgID(String edgID) {
        this.edgID = edgID;
    }

    /**
     *
     */
    public Boolean getadverseActionAllowedSw() {
        return adverseActionAllowedSwField;
    }

    public void setadverseActionAllowedSw(Boolean value) {
        adverseActionAllowedSwField = value;
    }

    /**
     *
     */
    public Long getcertifiedGroupAdultsCount() {
        return certifiedGroupAdultsCountField;
    }

    public void setcertifiedGroupAdultsCount(Long value) {
        certifiedGroupAdultsCountField = value;
    }

    /**
     *
     */
    public Long getcertifiedGroupChildCount() {
        return certifiedGroupChildCountField;
    }

    public void setcertifiedGroupChildCount(Long value) {
        certifiedGroupChildCountField = value;
    }

    /**
     *
     */
    public Long getcertifiedGroupSize() {
        return certifiedGroupSizeField;
    }

    public void setcertifiedGroupSize(Long value) {
        certifiedGroupSizeField = value;
    }

    /**
     *
     */
    public Long getcreatedForIndivID() {
        return createdForIndivIDField;
    }

    public void setcreatedForIndivID(Long value) {
        createdForIndivIDField = value;
    }

    /**
     *
     */
    public Boolean getdummyGroupCreated() {
        return dummyGroupCreatedField;
    }

    public void setdummyGroupCreated(Boolean value) {
        dummyGroupCreatedField = value;
    }

    /**
     *
     */
    public String getedgEligibilityResultCode() {
        return edgEligibilityResultCodeField;
    }

    public void setedgEligibilityResultCode(String value) {
        edgEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public Boolean getedgReprocessSw() {
        return edgReprocessSwField;
    }

    public void setedgReprocessSw(Boolean value) {
        edgReprocessSwField = value;
    }

    /**
     *
     */
    public Long getedgSize() {
        return edgSizeField;
    }

    public void setedgSize(Long value) {
        edgSizeField = value;
    }

    /**
     *
     */
    public LocalDateTime getedm() {
        return edmField;
    }

    public void setedm(LocalDateTime value) {
        edmField = value;
    }

    /**
     *
     */
    public boolean getEDMEndDateSpecified() {
        return eDMEndDateFieldSpecified;
    }

    public void setEDMEndDateSpecified(boolean value) {
        eDMEndDateFieldSpecified = value;
    }

    /**
     *
     */
    public String getFinancialEligibilityResultCode() {
        return financialEligibilityResultCodeField;
    }

    public void setFinancialEligibilityResultCode(String value) {
        financialEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public Boolean getisNew() {
        return isNewField;
    }

    public void setisNew(Boolean value) {
        isNewField = value;
    }

    /**
     *
     */
    public String getNonFinancialEligibilityResultCode() {
        return nonFinancialEligibilityResultCodeField;
    }

    public void setNonFinancialEligibilityResultCode(String value) {
        nonFinancialEligibilityResultCodeField = value;
    }

    /**
     *
     */
    public LocalDateTime getpaymentbegdt() {
        return paymentbegdtField;
    }

    public void setpaymentbegdt(LocalDateTime value) {
        paymentbegdtField = value;
    }

    /**
     *
     */
    public Boolean getperform_9900_501() {
        return perform_9900_501Field;
    }

    public void setperform_9900_501(Boolean value) {
        perform_9900_501Field = value;
    }

    /**
     *
     */
    public String getPriorMedicaidCode() {
        return priorMedicaidCodeField;
    }

    public void setPriorMedicaidCode(String value) {
        priorMedicaidCodeField = value;
    }

    /**
     *
     */
    public String getprogActivityType() {
        return progActivityTypeField;
    }

    public void setprogActivityType(String value) {
        progActivityTypeField = value;
    }

    /**
     *
     */
    public String getprogramCd() {
        return programCdField;
    }

    public void setprogramCd(String value) {
        programCdField = value;
    }

    /**
     *
     */
    public LocalDateTime getprogramRescindDate() {
        return programRescindDateField;
    }

    public void setprogramRescindDate(LocalDateTime value) {
        programRescindDateField = value;
    }

    /**
     *
     */
    public String getprogramStatus() {
        return programStatusField;
    }

    public void setprogramStatus(String value) {
        programStatusField = value;
    }

    /**
     *
     */
    public LocalDateTime getqhpReviewDueDt() {
        return qhpReviewDueDtField;
    }

    public void setqhpReviewDueDt(LocalDateTime value) {
        qhpReviewDueDtField = value;
    }

    /**
     *
     */
    public Long getTOAPriorityNumber() {
        return tOAPriorityNumberField;
    }

    public void setTOAPriorityNumber(Long value) {
        tOAPriorityNumberField = value;
    }

    /**
     *
     */
    public String gettpCode() {
        return tpCodeField;
    }

    public void settpCode(String value) {
        tpCodeField = value;
    }

    /**
     *
     */
    public String getverificationResultCode() {
        return verificationResultCodeField;
    }

    public void setverificationResultCode(String value) {
        verificationResultCodeField = value;
    }

    /**
     *
     */
    public Case getcase() {
        return caseField;
    }

    public void setcase(Case value) {
        caseField = value;
    }

    /**
     *
     */
    public List<Edg_individual> getedg_individual() {
        return edg_individualField;
    }

    public void setedg_individual(List<Edg_individual> value) {
        edg_individualField = value;
    }

    /**
     *
     */
    public List<Notice> getnotice() {
        return noticeField;
    }

    public void setnotice(List<Notice> value) {
        noticeField = value;
    }

    /**
     *
     */
    public Recertification getrecertification() {
        return recertificationField;
    }

    public void setrecertification(Recertification value) {
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
}
