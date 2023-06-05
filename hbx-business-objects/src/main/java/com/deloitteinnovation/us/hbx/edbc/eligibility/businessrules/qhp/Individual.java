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
public class Individual {

    private Long ageField;
    private String alienTypeCdField;
    private Boolean appliedForField;
    private Boolean attendingSchoolField;
    private Boolean citizenField;
    private Boolean citizenstatusswField;
    private LocalDateTime dateofdeathField;
    private Boolean deceasedswField;
    private Boolean hasExemptionCertificateField;
    private String hasLawfulPresenceVerificationField;
    private Boolean hasOngoingQHPBenefitField;
    private Boolean hasValidRelationWithHOHField;
    private boolean hasValidRelationWithHOHFieldSpecified;
    private Boolean headOfHouseholdField;
    private Boolean incarcerationField;
    private String incarcerationStatusCodeField;
    private Boolean incarcerationStatusSwField;
    private Long individualIDField;
    private Boolean intendToResideSwField;
    private Boolean isAChildField;
    private Boolean isActiveInCaseField;
    private Boolean isAIANField;
    private Boolean isDeniedField;
    private Boolean isDisabledField;
    private Boolean isMarriedField;
    private Boolean isMedicareSelfAttestedField;
    private boolean ispregnantFieldSpecified;
    private Boolean isReceivingMedicareInOtherSystemField;
    private boolean isReceivingMedicareInOtherSystemFieldSpecified;
    private String lawfulPresenceVerifiedField;
    private String lPRField;

    private Boolean married_ChildField;
    private String mCIBenefitIdField;
    private Boolean meetresidencyswField;

    private String qualifiedNonCitizenIndicatorField;
    private Boolean resideInStateField;
    private boolean resideInStateFieldSpecified;
    private String residentStateCdField;
    private Boolean spouseOfHOHField;
    private String taxFilerStatusCodeField;
    private Long unbornChildCountField;
    private Case caseField;
    private List<Individual> childOrPutativeChildField = new ArrayList<>();
    private List<Individual> childrenField = new ArrayList<>();
    private List<Edg_individual> edg_individualField;
    private List<InsurancePolicy> insurancePolicyField;
    private List<Individual> legallyGuardedField = new ArrayList<>();
    private List<Individual> livingTogetherPartnerField = new ArrayList<>();
    private List<Individual> personsField = new ArrayList<>();
    private List<Relationship> relationshipsField = new ArrayList<>();
    private List<Individual> spouseField = new ArrayList<>();
    private String idField;
    private String hrefField;
    private List<Verification> verifications = new ArrayList<>();
    private Boolean IsSMA;

// Added Transition variable and Respective get set Method

    private Boolean perform_Relationship_Age_Check;
    private Boolean perform_Valid_Relationship_Check;

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

    public Boolean getIsSMA() {
        return IsSMA;
    }

    public void setIsSMA(Boolean SMA) {
        IsSMA = SMA;
    }

    public Long getage() {
        return ageField;
    }

    public void setage(Long value) {
        ageField = value;
    }
    /**
     *
     */


    /**
     *
     */
    public String getalienTypeCd() {
        return alienTypeCdField;
    }

    public void setalienTypeCd(String value) {
        alienTypeCdField = value;
    }

    /**
     *
     */
    public Boolean getappliedFor() {
        return appliedForField;
    }

    public void setappliedFor(Boolean value) {
        appliedForField = value;
    }

    /**
     *
     */
    public Boolean getattendingSchool() {
        return attendingSchoolField;
    }

    public void setattendingSchool(Boolean value) {
        attendingSchoolField = value;
    }

    /**
     *
     */
    public Boolean getcitizen() {
        return citizenField;
    }

    public void setcitizen(Boolean value) {
        citizenField = value;
    }

    /**
     *
     */
    public Boolean getcitizenstatussw() {
        return citizenstatusswField;
    }

    public void setcitizenstatussw(Boolean value) {
        citizenstatusswField = value;
    }

    /**
     *
     */
    public LocalDateTime getdateofdeath() {
        return dateofdeathField;
    }

    public void setdateofdeath(LocalDateTime value) {
        dateofdeathField = value;
    }

    /**
     *
     */
    public Boolean getdeceasedsw() {
        return deceasedswField;
    }

    public void setdeceasedsw(Boolean value) {
        deceasedswField = value;
    }

    /**
     *
     */
    public Boolean getHasExemptionCertificate() {
        return hasExemptionCertificateField;
    }

    public void setHasExemptionCertificate(Boolean value) {
        hasExemptionCertificateField = value;
    }

    /**
     *
     */
    public String getHasLawfulPresenceVerification() {
        return hasLawfulPresenceVerificationField;
    }

    public void setHasLawfulPresenceVerification(String value) {
        hasLawfulPresenceVerificationField = value;
    }

    /**
     *
     */
    public Boolean gethasOngoingQHPBenefit() {
        return hasOngoingQHPBenefitField;
    }

    public void sethasOngoingQHPBenefit(Boolean value) {
        hasOngoingQHPBenefitField = value;
    }

    /**
     *
     */
    public Boolean getHasValidRelationWithHOH() {
        return hasValidRelationWithHOHField;
    }

    public void setHasValidRelationWithHOH(Boolean value) {
        hasValidRelationWithHOHField = value;
    }

    /**
     *
     */
    public boolean getHasValidRelationWithHOHSpecified() {
        return hasValidRelationWithHOHFieldSpecified;
    }

    public void setHasValidRelationWithHOHSpecified(boolean value) {
        hasValidRelationWithHOHFieldSpecified = value;
    }

    /**
     *
     */
    public Boolean getheadOfHousehold() {
        return headOfHouseholdField;
    }

    public void setheadOfHousehold(Boolean value) {
        headOfHouseholdField = value;
    }

    /**
     *
     */
    public Boolean getincarceration() {
        return incarcerationField;
    }

    public void setincarceration(Boolean value) {
        incarcerationField = value;
    }

    /**
     *
     */
    public String getIncarcerationStatusCode() {
        return incarcerationStatusCodeField;
    }

    public void setIncarcerationStatusCode(String value) {
        incarcerationStatusCodeField = value;
    }

    /**
     *
     */
    public Boolean getincarcerationStatusSw() {
        return incarcerationStatusSwField;
    }

    public void setincarcerationStatusSw(Boolean value) {
        incarcerationStatusSwField = value;
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
    public Boolean getintendToResideSw() {
        return intendToResideSwField;
    }

    public void setintendToResideSw(Boolean value) {
        intendToResideSwField = value;
    }

    /**
     *
     */
    public Boolean getisAChild() {
        return isAChildField;
    }

    public void setisAChild(Boolean value) {
        isAChildField = value;
    }

    /**
     *
     */
    public Boolean getisActiveInCase() {
        return isActiveInCaseField;
    }

    public void setisActiveInCase(Boolean value) {
        isActiveInCaseField = value;
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
    public Boolean getisDenied() {
        return isDeniedField;
    }

    public void setisDenied(Boolean value) {
        isDeniedField = value;
    }

    /**
     *
     */
    public Boolean getisDisabled() {
        return isDisabledField;
    }

    public void setisDisabled(Boolean value) {
        isDisabledField = value;
    }

    /**
     *
     */

    public Boolean getisMarried() {
        return isMarriedField;
    }

    public void setisMarried(Boolean value) {
        isMarriedField = value;
    }

    /**
     *
     */
    public Boolean getisMedicareSelfAttested() {
        return isMedicareSelfAttestedField;
    }

    public void setisMedicareSelfAttested(Boolean value) {
        isMedicareSelfAttestedField = value;
    }

    /**
     *
     */
    public boolean getispregnantSpecified() {
        return ispregnantFieldSpecified;
    }

    public void setispregnantSpecified(boolean value) {
        ispregnantFieldSpecified = value;
    }

    /**
     *
     */
    public Boolean getIsReceivingMedicareInOtherSystem() {
        return isReceivingMedicareInOtherSystemField;
    }

    public void setIsReceivingMedicareInOtherSystem(Boolean value) {
        isReceivingMedicareInOtherSystemField = value;
    }

    /**
     *
     */
    public boolean getIsReceivingMedicareInOtherSystemSpecified() {
        return isReceivingMedicareInOtherSystemFieldSpecified;
    }

    public void setIsReceivingMedicareInOtherSystemSpecified(boolean value) {
        isReceivingMedicareInOtherSystemFieldSpecified = value;
    }

    /**
     *
     */
    public String getlawfulPresenceVerified() {
        return lawfulPresenceVerifiedField;
    }

    public void setlawfulPresenceVerified(String value) {
        lawfulPresenceVerifiedField = value;
    }

    /**
     *
     */
    public String getLPR() {
        return lPRField;
    }

    public void setLPR(String value) {
        lPRField = value;
    }

    /**
     *
     */

    /**
     *
     */
    public Boolean getmarried_Child() {
        return married_ChildField;
    }

    public void setmarried_Child(Boolean value) {
        married_ChildField = value;
    }

    /**
     *
     */
    public String getMCIBenefitId() {
        return mCIBenefitIdField;
    }

    public void setMCIBenefitId(String value) {
        mCIBenefitIdField = value;
    }

    /**
     *
     */
    public Boolean getmeetresidencysw() {
        return meetresidencyswField;
    }

    public void setmeetresidencysw(Boolean value) {
        meetresidencyswField = value;
    }

    /**
     *
     */
    public String getqualifiedNonCitizenIndicator() {
        return qualifiedNonCitizenIndicatorField;
    }

    public void setqualifiedNonCitizenIndicator(String value) {
        qualifiedNonCitizenIndicatorField = value;
    }

    /**
     *
     */
    public Boolean getresideInState() {
        return resideInStateField;
    }

    public void setresideInState(Boolean value) {
        resideInStateField = value;
    }

    /**
     *
     */
    public boolean getresideInStateSpecified() {
        return resideInStateFieldSpecified;
    }

    public void setresideInStateSpecified(boolean value) {
        resideInStateFieldSpecified = value;
    }

    /**
     *
     */
    public String getresidentStateCd() {
        return residentStateCdField;
    }

    public void setresidentStateCd(String value) {
        residentStateCdField = value;
    }

    /**
     *
     */
    public Boolean getspouseOfHOH() {
        return spouseOfHOHField;
    }

    public void setspouseOfHOH(Boolean value) {
        spouseOfHOHField = value;
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
    public Long getunbornChildCount() {
        return unbornChildCountField;
    }

    public void setunbornChildCount(Long value) {
        unbornChildCountField = value;
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
    public List<InsurancePolicy> getinsurancePolicy() {
        return insurancePolicyField;
    }

    public void setinsurancePolicy(List<InsurancePolicy> value) {
        insurancePolicyField = value;
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

    public List<Individual> getchildOrPutativeChild() {
        return childOrPutativeChildField;
    }

    public void setchildOrPutativeChild(List<Individual> childOrPutativeChildField) {
        this.childOrPutativeChildField = childOrPutativeChildField;
    }

    public List<Individual> getlivingTogetherPartner() {
        return livingTogetherPartnerField;
    }

    public void setlivingTogetherPartner(List<Individual> livingTogetherPartnerField) {
        this.livingTogetherPartnerField = livingTogetherPartnerField;
    }

    public List<Individual> getchildren() {
        return childrenField;
    }

    public void setchildren(List<Individual> childrenField) {
        this.childrenField = childrenField;
    }

    public List<Individual> getlegallyGuarded() {
        return legallyGuardedField;
    }

    public void setlegallyGuarded(List<Individual> legallyGuardedField) {
        this.legallyGuardedField = legallyGuardedField;
    }

    public List<Individual> getpersons() {
        return personsField;
    }

    public void setpersons(List<Individual> personsField) {
        this.personsField = personsField;
    }

    public List<Individual> getspouse() {
        return spouseField;
    }

    public void setspouse(List<Individual> spouseField) {
        this.spouseField = spouseField;
    }

    public List<Relationship> getRelationships() {
        return relationshipsField;
    }

    public void setRelationships(List<Relationship> relationshipsField) {
        this.relationshipsField = relationshipsField;
    }

    public List<Verification> getVerifications() {
        return verifications;
    }

    public void setVerifications(List<Verification> verifications) {
        this.verifications = verifications;
    }

}
