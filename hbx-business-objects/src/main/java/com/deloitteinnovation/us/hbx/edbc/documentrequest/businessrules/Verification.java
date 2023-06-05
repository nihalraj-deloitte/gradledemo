package com.deloitteinnovation.us.hbx.edbc.documentrequest.businessrules;

public class Verification {

    private Boolean SeekingCoverage;
    private Boolean SSNEntered;
    private String VerificationSourceCode;
    private String VerificationStatusCode;
    private String ProgramType;

    private String EligibilityStatus;


    private Boolean RequestDocumentPendingReview;
    private String VerificationType;
    private Boolean SelfAttestedValue;
    private Boolean AffordabilityIndicator;
    private Boolean NaturalizedCitizenAttestation;
    private Boolean ReasonableCompatibilityFactor;
    private Boolean FedHubIndicator;

    //Out PAram

    private String AppReview;

    private String ActionRequired;
    private String DocumentRequest;


    public String getDocumentRequest() {
        return DocumentRequest;
    }

    public void setDocumentRequest(String documentRequest) {
        DocumentRequest = documentRequest;
    }

    public String getProgramType() {
        return ProgramType;
    }

    public void setProgramType(String programType) {
        ProgramType = programType;
    }

    public Boolean getSeekingCoverage() {
        return SeekingCoverage;
    }

    public void setSeekingCoverage(Boolean seekingCoverage) {
        SeekingCoverage = seekingCoverage;
    }

    public Boolean getSSNEntered() {
        return SSNEntered;
    }

    public void setSSNEntered(Boolean sSNEntered) {
        SSNEntered = sSNEntered;
    }

    public String getVerificationSourceCode() {
        return VerificationSourceCode;
    }

    public void setVerificationSourceCode(String verificationSourceCode) {
        VerificationSourceCode = verificationSourceCode;
    }

    public String getVerificationStatusCode() {
        return VerificationStatusCode;
    }

    public void setVerificationStatusCode(String verificationStatusCode) {
        VerificationStatusCode = verificationStatusCode;
    }

    public String getEligibilityStatus() {
        return EligibilityStatus;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        EligibilityStatus = eligibilityStatus;
    }

    public Boolean getRequestDocumentPendingReview() {
        return RequestDocumentPendingReview;
    }

    public void setRequestDocumentPendingReview(Boolean requestDocumentPendingReview) {
        RequestDocumentPendingReview = requestDocumentPendingReview;
    }

    public String getVerificationType() {
        return VerificationType;
    }

    public void setVerificationType(String VerificationType) {
        this.VerificationType = VerificationType;
    }

    public Boolean getSelfAttestedValue() {
        return SelfAttestedValue;
    }

    public void setSelfAttestedValue(Boolean selfAttestedValue) {
        SelfAttestedValue = selfAttestedValue;
    }

    public Boolean getAffordabilityIndicator() {
        return AffordabilityIndicator;
    }

    public void setAffordabilityIndicator(Boolean affordabilityIndicator) {
        AffordabilityIndicator = affordabilityIndicator;
    }

    public Boolean getNaturalizedCitizenAttestation() {
        return NaturalizedCitizenAttestation;
    }

    public void setNaturalizedCitizenAttestation(Boolean naturalizedCitizenAttestation) {
        NaturalizedCitizenAttestation = naturalizedCitizenAttestation;
    }

    public Boolean getReasonableCompatibilityFactor() {
        return ReasonableCompatibilityFactor;
    }

    public void setReasonableCompatibilityFactor(Boolean reasonableCompatibilityFactor) {
        ReasonableCompatibilityFactor = reasonableCompatibilityFactor;
    }

    public Boolean getFedHubIndicator() {
        return FedHubIndicator;
    }

    public void setFedHubIndicator(Boolean fedHubIndicator) {
        FedHubIndicator = fedHubIndicator;
    }


    public String getAppReview() {
        return AppReview;
    }

    public void setAppReview(String appReview) {
        AppReview = appReview;
    }

    public String getActionRequired() {
        return ActionRequired;
    }

    public void setActionRequired(String actionRequired) {
        ActionRequired = actionRequired;
    }


}
