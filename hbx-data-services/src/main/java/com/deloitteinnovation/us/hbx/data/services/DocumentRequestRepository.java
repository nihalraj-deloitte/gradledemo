package com.deloitteinnovation.us.hbx.data.services;

import com.deloitteinnovation.us.hbx.edbc.documentrequest.driver.custom.DocumentRequestMasterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRequestRepository extends JpaRepository<DocumentRequestMasterModel, Long> {
    @Override
    @Query("select new com.deloitteinnovation.us.hbx.edbc.documentrequest.driver.custom.DocumentRequestMasterModel(p.documentRequestMasterId, p.verificationType, p.seekingCoverage, p.selfAttestedValue, p.verificationSourceCode, p.verificationStatusCode, p.programType, p.requestDocumentPendingReview, p.eligibilityStatus, p.naturalizedCitizenAttestation) from DocumentRequestMasterModel p")
    List<DocumentRequestMasterModel> findAll();
}