package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp;

import java.util.ArrayList;
import java.util.List;

public class Verification {
    private String name;
    private String verificationStatus;
    private String failReason;
    private List<String> validProgram = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public List<String> getValidProgram() {
        return validProgram;
    }

    public void setValidProgram(List<String> validProgram) {
        this.validProgram = validProgram;
    }


}
