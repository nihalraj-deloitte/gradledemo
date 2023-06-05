package com.deloitteinnovation.us.hbx.edbc.eligibility.prescreening.businessrules;

import java.time.LocalDateTime;

public class Individual {
    private String gender;
    private LocalDateTime dateOfBirth;
    private String benefitType;
    private Integer age;
    private Boolean ispregnant;
    private String CSRTier;
    private Boolean isChild;
    private String firstname;
    private String lastname;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getIsChild() {
        return isChild;
    }

    public void setIsChild(Boolean isChild) {
        this.isChild = isChild;
    }

    public String getCSRTier() {
        return CSRTier;
    }

    public void setCSRTier(String cSRTier) {
        CSRTier = cSRTier;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBenefitType() {
        return benefitType;
    }

    public void setBenefitType(String benefitType) {
        this.benefitType = benefitType;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIspregnant() {
        return ispregnant;
    }

    public void setIspregnant(Boolean ispregnant) {
        this.ispregnant = ispregnant;
    }


}