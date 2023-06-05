package com.deloitteinnovation.us.hbx.edbc.documentrequest.driver.custom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "document_request_master", schema = "hc_eligibility")
public class DocumentRequestMasterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_request_master_seq")
    @SequenceGenerator(name = "document_request_master_seq", schema = "hc_eligibility", sequenceName = "document_request_master_seq", allocationSize = 1)
    @Column(name = "document_request_master_id", nullable = false)
    private long documentRequestMasterId;

    @Column(name = "verification_type", length = 50)
    private String verificationType;

    @Column(name = "seeking_coverage")
    private Boolean seekingCoverage;

    @Column(name = "self_attested_value")
    private Boolean selfAttestedValue;

    @Column(name = "verification_source_code", length = 50)
    private String verificationSourceCode;

    @Column(name = "verification_status_code", length = 50)
    private String verificationStatusCode;

    @Column(name = "program_type", length = 50)
    private String programType;

    @Column(name = "request_document_pending_review")
    private Boolean requestDocumentPendingReview;

    @Column(name = "eligibility_status", length = 50)
    private String eligibilityStatus;

    @Column(name = "naturalized_citizen_attestation")
    private Boolean naturalizedCitizenAttestation;

    public long getDocumentRequestMasterId() {
        return documentRequestMasterId;
    }

    public void setDocumentRequestMasterId(long documentRequestMasterId) {
        this.documentRequestMasterId = documentRequestMasterId;
    }

    public String getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(String verificationType) {
        this.verificationType = verificationType;
    }

    public Boolean getSeekingCoverage() {
        return seekingCoverage;
    }

    public void setSeekingCoverage(Boolean seekingCoverage) {
        this.seekingCoverage = seekingCoverage;
    }

    public Boolean getSelfAttestedValue() {
        return selfAttestedValue;
    }

    public void setSelfAttestedValue(Boolean selfAttestedValue) {
        this.selfAttestedValue = selfAttestedValue;
    }

    public String getVerificationSourceCode() {
        return verificationSourceCode;
    }

    public void setVerificationSourceCode(String verificationSourceCode) {
        this.verificationSourceCode = verificationSourceCode;
    }

    public String getVerificationStatusCode() {
        return verificationStatusCode;
    }

    public void setVerificationStatusCode(String verificationStatusCode) {
        this.verificationStatusCode = verificationStatusCode;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public Boolean getRequestDocumentPendingReview() {
        return requestDocumentPendingReview;
    }

    public void setRequestDocumentPendingReview(Boolean requestDocumentPendingReview) {
        this.requestDocumentPendingReview = requestDocumentPendingReview;
    }

    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    public Boolean getNaturalizedCitizenAttestation() {
        return naturalizedCitizenAttestation;
    }

    public void setNaturalizedCitizenAttestation(Boolean naturalizedCitizenAttestation) {
        this.naturalizedCitizenAttestation = naturalizedCitizenAttestation;
    }

    @SuppressWarnings("squid:S107")
    //Sonar complaining about method with more than 7 arguments, we need this as per functionality
    public DocumentRequestMasterModel(long documentRequestMasterId, String verificationType, Boolean seekingCoverage,
                                      Boolean selfAttestedValue, String verificationSourceCode, String verificationStatusCode, String programType,
                                      Boolean requestDocumentPendingReview, String eligibilityStatus, Boolean naturalizedCitizenAttestation) {
        this.documentRequestMasterId = documentRequestMasterId;
        this.verificationType = verificationType;
        this.seekingCoverage = seekingCoverage;
        this.selfAttestedValue = selfAttestedValue;
        this.verificationSourceCode = verificationSourceCode;
        this.verificationStatusCode = verificationStatusCode;
        this.programType = programType;
        this.requestDocumentPendingReview = requestDocumentPendingReview;
        this.eligibilityStatus = eligibilityStatus;
        this.naturalizedCitizenAttestation = naturalizedCitizenAttestation;
    }
}
