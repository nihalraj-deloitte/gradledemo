//
// Translated by CS2J (http://www.cs2j.com): 12/3/2020 12:53:44 PM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Edg_individual {

    public Edg_individual() {

    }

    public Edg_individual(Edg_individual edgIndividualToBeCloned) {

        this.setnotice(new ArrayList<>());
        this.setalienStatusVrfReqSw(edgIndividualToBeCloned.getalienStatusVrfReqSw());
        this.setalienTypeCode(edgIndividualToBeCloned.getalienTypeCode());
        this.setAlienVCLCode(edgIndividualToBeCloned.getAlienVCLCode());
        this.setbuildQHPEdge(edgIndividualToBeCloned.getbuildQHPEdge());
        this.setbuildQHPEdgeSpecified(edgIndividualToBeCloned.getbuildQHPEdgeSpecified());
        this.setcatastrophicPlan_EligibilitySw(edgIndividualToBeCloned.getcatastrophicPlan_EligibilitySw());
        this.setcatastrophicPlan_EligibilitySwSpecified(
                edgIndividualToBeCloned.getcatastrophicPlan_EligibilitySwSpecified());
        this.setconsiderNeedsSpecified(edgIndividualToBeCloned.getconsiderNeedsSpecified());
        this.setdisqualifiedaliensw(edgIndividualToBeCloned.getdisqualifiedaliensw());
        this.setdisqualifysw(edgIndividualToBeCloned.getdisqualifysw());
        this.setedg_group(edgIndividualToBeCloned.getedg_group());
        this.seteligibilityGroupIndicator(edgIndividualToBeCloned.geteligibilityGroupIndicator());
        this.setFinancialEligibilityResultCode(edgIndividualToBeCloned.getFinancialEligibilityResultCode());
        this.sethref(edgIndividualToBeCloned.gethref());
        this.setid(edgIndividualToBeCloned.getid());
        this.setindividual(edgIndividualToBeCloned.getindividual());
        this.setindividualID(edgIndividualToBeCloned.getindividualID());
        this.setindvAge(edgIndividualToBeCloned.getindvAge());
        this.setisAIAN(edgIndividualToBeCloned.getisAIAN());
        this.setisCitizen(edgIndividualToBeCloned.getisCitizen());
        this.setIsDisabled(edgIndividualToBeCloned.getIsDisabled());
        this.setLPRResult(edgIndividualToBeCloned.getLPRResult());
        this.setNonFinancialEligibilityResultCode(edgIndividualToBeCloned.getNonFinancialEligibilityResultCode());
        this.setpartStatusCode(edgIndividualToBeCloned.getpartStatusCode());
        this.setPerform_32_37_119_Alien_Check(edgIndividualToBeCloned.getPerform_32_37_119_Alien_Check());
        this.setperform_9900_313(edgIndividualToBeCloned.getperform_9900_313());
        this.setperform_9900_315(edgIndividualToBeCloned.getperform_9900_315());
        this.setperform_9900_320(edgIndividualToBeCloned.getperform_9900_320());
        this.setperform_9900_330(edgIndividualToBeCloned.getperform_9900_330());
        this.setperform_9900_390(edgIndividualToBeCloned.getperform_9900_390());
        this.setperform_9900_400(edgIndividualToBeCloned.getperform_9900_400());
        this.setPerform_Medicare_Check(edgIndividualToBeCloned.getPerform_Medicare_Check());
        this.setPerform_Relationship_Age_Check(edgIndividualToBeCloned.getPerform_Relationship_Age_Check());
        this.setPerform_Valid_Relationship_Check(edgIndividualToBeCloned.getPerform_Valid_Relationship_Check());
        this.setPerform_VLP_QNC_Check(edgIndividualToBeCloned.getPerform_VLP_QNC_Check());
        this.setRelationshipWithTargetIndividual(edgIndividualToBeCloned.getRelationshipWithTargetIndividual());
        this.setspouseIndividualId(edgIndividualToBeCloned.getspouseIndividualId());
        this.settargetSw(edgIndividualToBeCloned.gettargetSw());
        this.settaxFilerStatusCode(edgIndividualToBeCloned.gettaxFilerStatusCode());
        this.setunbornChildren(edgIndividualToBeCloned.getunbornChildren());
        this.setVerificationResultCode(edgIndividualToBeCloned.getVerificationResultCode());

        for (Notice currentNotice : edgIndividualToBeCloned.getnotice()) {
            this.getnotice().add(new Notice(currentNotice));
        }
    }

    private Boolean alienStatusVrfReqSwField;

    private String alienTypeCodeField;
    private String alienVCLCodeField;
    private Boolean buildQHPEdgeField;
    private boolean buildQHPEdgeFieldSpecified;
    private Boolean catastrophicPlan_EligibilitySwField;
    private boolean catastrophicPlan_EligibilitySwFieldSpecified;
    private boolean considerNeedsFieldSpecified;
    private Boolean disqualifiedalienswField;
    private String disqualifyswField;
    private String eligibilityGroupIndicatorField;
    private String financialEligibilityResultCodeField;
    private Long individualIDField;
    private Long indvAgeField;
    private Boolean isAIANField;
    private Boolean isCitizenField;
    private Boolean isDisabledField;
    private String lPRResultField;
    private String nonFinancialEligibilityResultCodeField;
    private String partStatusCodeField;
    private Boolean perform_9900_313Field;
    private Boolean perform_9900_315Field;
    private Boolean perform_9900_320Field;
    private Boolean perform_9900_330Field;
    private Boolean perform_9900_390Field;
    private Boolean perform_9900_400Field;
    private String relationshipWithTargetIndividualField;
    private Long spouseIndividualIdField;
    private Boolean targetSwField;
    private String taxFilerStatusCodeField;
    private Long unbornChildrenField;
    private Edg_group edg_groupField;
    private Individual individualField;
    private List<Notice> noticeField = new ArrayList<>();
    private String idField;
    private String hrefField;

    // Added Transition variable and Respective get set Method
    private Boolean perform_32_37_119_Alien_Check;
    private Boolean perform_Medicare_Check;
    private Boolean perform_Relationship_Age_Check;
    private Boolean perform_Valid_Relationship_Check;
    private Boolean perform_VLP_QNC_Check;
    private String verificationResultCode;

    public Boolean getPerform_32_37_119_Alien_Check() {
        return perform_32_37_119_Alien_Check;
    }

    public void setPerform_32_37_119_Alien_Check(Boolean perform_32_37_119_Alien_Check) {
        this.perform_32_37_119_Alien_Check = perform_32_37_119_Alien_Check;
    }

    public Boolean getPerform_Medicare_Check() {
        return perform_Medicare_Check;
    }

    public void setPerform_Medicare_Check(Boolean perform_Medicare_Check) {
        this.perform_Medicare_Check = perform_Medicare_Check;
    }

    public Boolean getPerform_Relationship_Age_Check() {
        return perform_Relationship_Age_Check;
    }

    public void setPerform_Relationship_Age_Check(Boolean perform_Relationship_Age_Check) {
        this.perform_Relationship_Age_Check = perform_Relationship_Age_Check;
    }

    public Boolean getPerform_Valid_Relationship_Check() {
        return perform_Valid_Relationship_Check;
    }

    public void setPerform_Valid_Relationship_Check(Boolean perform_Valid_Relationship_Check) {
        this.perform_Valid_Relationship_Check = perform_Valid_Relationship_Check;
    }

    public Boolean getPerform_VLP_QNC_Check() {
        return perform_VLP_QNC_Check;
    }

    public void setPerform_VLP_QNC_Check(Boolean perform_VLP_QNC_Check) {
        this.perform_VLP_QNC_Check = perform_VLP_QNC_Check;
    }

    ////// End //////

    /**
     *
     */
    public Boolean getalienStatusVrfReqSw() {
        return alienStatusVrfReqSwField;
    }

    public void setalienStatusVrfReqSw(Boolean value) {
        alienStatusVrfReqSwField = value;
    }

    /**
     *
     */
    public String getalienTypeCode() {
        return alienTypeCodeField;
    }

    public void setalienTypeCode(String value) {
        alienTypeCodeField = value;
    }

    /**
     *
     */
    public String getAlienVCLCode() {
        return alienVCLCodeField;
    }

    public void setAlienVCLCode(String value) {
        alienVCLCodeField = value;
    }

    /**
     *
     */
    public Boolean getbuildQHPEdge() {
        return buildQHPEdgeField;
    }

    public void setbuildQHPEdge(Boolean value) {
        buildQHPEdgeField = value;
    }

    /**
     *
     */
    public boolean getbuildQHPEdgeSpecified() {
        return buildQHPEdgeFieldSpecified;
    }

    public void setbuildQHPEdgeSpecified(boolean value) {
        buildQHPEdgeFieldSpecified = value;
    }

    /**
     *
     */
    public Boolean getcatastrophicPlan_EligibilitySw() {
        return catastrophicPlan_EligibilitySwField;
    }

    public void setcatastrophicPlan_EligibilitySw(Boolean value) {
        catastrophicPlan_EligibilitySwField = value;
    }

    /**
     *
     */
    public boolean getcatastrophicPlan_EligibilitySwSpecified() {
        return catastrophicPlan_EligibilitySwFieldSpecified;
    }

    public void setcatastrophicPlan_EligibilitySwSpecified(boolean value) {
        catastrophicPlan_EligibilitySwFieldSpecified = value;
    }

    /**
     *
     */
    public boolean getconsiderNeedsSpecified() {
        return considerNeedsFieldSpecified;
    }

    public void setconsiderNeedsSpecified(boolean value) {
        considerNeedsFieldSpecified = value;
    }

    /**
     *
     */
    public Boolean getdisqualifiedaliensw() {
        return disqualifiedalienswField;
    }

    public void setdisqualifiedaliensw(Boolean value) {
        disqualifiedalienswField = value;
    }

    /**
     *
     */
    public String getdisqualifysw() {
        return disqualifyswField;
    }

    public void setdisqualifysw(String value) {
        disqualifyswField = value;
    }

    /**
     *
     */
    public String geteligibilityGroupIndicator() {
        return eligibilityGroupIndicatorField;
    }

    public void seteligibilityGroupIndicator(String value) {
        eligibilityGroupIndicatorField = value;
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
    public Long getindividualID() {
        return individualIDField;
    }

    public void setindividualID(Long value) {
        individualIDField = value;
    }

    /**
     *
     */
    public Long getindvAge() {
        return indvAgeField;
    }

    public void setindvAge(Long value) {
        indvAgeField = value;
    }

    /**
     *
     */
    public Boolean getisAIAN() {
        return isAIANField;
    }

    public void setisAIAN(Boolean value) {
        isAIANField = value;
    }

    /**
     *
     */
    public Boolean getisCitizen() {
        return isCitizenField;
    }

    public void setisCitizen(Boolean value) {
        isCitizenField = value;
    }

    /**
     *
     */
    public Boolean getIsDisabled() {
        return isDisabledField;
    }

    public void setIsDisabled(Boolean value) {
        isDisabledField = value;
    }

    /**
     *
     */
    public String getLPRResult() {
        return lPRResultField;
    }

    public void setLPRResult(String value) {
        lPRResultField = value;
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
    public String getpartStatusCode() {
        return partStatusCodeField;
    }

    public void setpartStatusCode(String value) {
        partStatusCodeField = value;
    }

    /**
     *
     */
    public Boolean getperform_9900_313() {
        return perform_9900_313Field;
    }

    public void setperform_9900_313(Boolean value) {
        perform_9900_313Field = value;
    }

    /**
     *
     */
    public Boolean getperform_9900_315() {
        return perform_9900_315Field;
    }

    public void setperform_9900_315(Boolean value) {
        perform_9900_315Field = value;
    }

    /**
     *
     */
    public Boolean getperform_9900_320() {
        return perform_9900_320Field;
    }

    public void setperform_9900_320(Boolean value) {
        perform_9900_320Field = value;
    }

    /**
     *
     */
    public Boolean getperform_9900_330() {
        return perform_9900_330Field;
    }

    public void setperform_9900_330(Boolean value) {
        perform_9900_330Field = value;
    }

    /**
     *
     */
    public Boolean getperform_9900_390() {
        return perform_9900_390Field;
    }

    public void setperform_9900_390(Boolean value) {
        perform_9900_390Field = value;
    }

    /**
     *
     */
    public Boolean getperform_9900_400() {
        return perform_9900_400Field;
    }

    public void setperform_9900_400(Boolean value) {
        perform_9900_400Field = value;
    }

    /**
     *
     */
    public String getRelationshipWithTargetIndividual() {
        return relationshipWithTargetIndividualField;
    }

    public void setRelationshipWithTargetIndividual(String value) {
        relationshipWithTargetIndividualField = value;
    }

    /**
     *
     */
    public Long getspouseIndividualId() {
        return spouseIndividualIdField;
    }

    public void setspouseIndividualId(Long value) {
        spouseIndividualIdField = value;
    }

    /**
     *
     */
    public Boolean gettargetSw() {
        return targetSwField;
    }

    public void settargetSw(Boolean value) {
        targetSwField = value;
    }

    /**
     *
     */
    public String gettaxFilerStatusCode() {
        return taxFilerStatusCodeField;
    }

    public void settaxFilerStatusCode(String value) {
        taxFilerStatusCodeField = value;
    }

    /**
     *
     */
    public Long getunbornChildren() {
        return unbornChildrenField;
    }

    public void setunbornChildren(Long value) {
        unbornChildrenField = value;
    }

    /**
     *
     */
    public Edg_group getedg_group() {
        return edg_groupField;
    }

    public void setedg_group(Edg_group value) {
        edg_groupField = value;
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
    public List<Notice> getnotice() {
        return noticeField;
    }

    public void setnotice(List<Notice> value) {
        noticeField = value;
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

    public String getVerificationResultCode() {
        return verificationResultCode;
    }

    public void setVerificationResultCode(String verificationResultCode) {
        this.verificationResultCode = verificationResultCode;
    }

}
