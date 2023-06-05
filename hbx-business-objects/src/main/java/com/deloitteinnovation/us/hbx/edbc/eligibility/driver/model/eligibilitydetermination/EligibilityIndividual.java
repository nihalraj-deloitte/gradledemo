package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.eligibilitydetermination;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;

public class EligibilityIndividual {

	public EligibilityIndividual()  {
		setEligibilityIndividualIncomeDetails(new HashSet<>());
	}

	private Long CaseNumber;

	public Long getCaseNumber() {
		return CaseNumber;
	}

	public void setCaseNumber(Long value) {
		CaseNumber = value;
	}

	private int EdgTraceId;

	public int getEdgTraceId() {
		return EdgTraceId;
	}

	public void setEdgTraceId(int value) {
		EdgTraceId = value;
	}

	private Long individualId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long value) {
		individualId = value;
	}

	private String AgedDisabledBlindCode = "";

	public String getAgedDisabledBlindCode() {
		return AgedDisabledBlindCode;
	}

	public void setAgedDisabledBlindCode(String value) {
		AgedDisabledBlindCode = value;
	}

	private String AidRequestCode = "";

	public String getAidRequestCode() {
		return AidRequestCode;
	}

	public void setAidRequestCode(String value) {
		AidRequestCode = value;
	}

	private String CategoryIndicator = "";

	public String getCategoryIndicator() {
		return CategoryIndicator;
	}

	public void setCategoryIndicator(String value) {
		CategoryIndicator = value;
	}

	private String CommunityEngagementExemptionReason = "";

	public String getCommunityEngagementExemptionReason() {
		return CommunityEngagementExemptionReason;
	}

	public void setCommunityEngagementExemptionReason(String value) {
		CommunityEngagementExemptionReason = value;
	}

	private LocalDateTime CreateDate;

	public LocalDateTime getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(LocalDateTime value) {
		CreateDate = value;
	}

	private String CreateUserId = "";

	public String getCreateUserId() {
		return CreateUserId;
	}

	public void setCreateUserId(String value) {
		CreateUserId = value;
	}

	private String EdgParticipantsStatusCode = "";

	public String getEdgParticipantsStatusCode() {
		return EdgParticipantsStatusCode;
	}

	public void setEdgParticipantsStatusCode(String value) {
		EdgParticipantsStatusCode = value;
	}

	private LocalDateTime EligibilityBeginDate;

	public LocalDateTime getEligibilityBeginDate() {
		return EligibilityBeginDate;
	}

	public void setEligibilityBeginDate(LocalDateTime value) {
		EligibilityBeginDate = value;
	}

	private LocalDateTime EligibilityEndDate;

	public LocalDateTime getEligibilityEndDate() {
		return EligibilityEndDate;
	}

	public void setEligibilityEndDate(LocalDateTime value) {
		EligibilityEndDate = value;
	}

	private String EligibilityResultCode = "";

	public String getEligibilityResultCode() {
		return EligibilityResultCode;
	}

	public void setEligibilityResultCode(String value) {
		EligibilityResultCode = value;
	}

	private Integer EmergencyMedicalConditionId;

	public Integer getEmergencyMedicalConditionId() {
		return EmergencyMedicalConditionId;
	}

	public void setEmergencyMedicalConditionId(Integer value) {
		EmergencyMedicalConditionId = value;
	}

	private String ExemptedForWorkIndicator = "";

	public String getExemptedForWorkIndicator() {
		return ExemptedForWorkIndicator;
	}

	public void setExemptedForWorkIndicator(String value) {
		ExemptedForWorkIndicator = value;
	}

	private String ExemptedForWorkReasonCode = "";

	public String getExemptedForWorkReasonCode() {
		return ExemptedForWorkReasonCode;
	}

	public void setExemptedForWorkReasonCode(String value) {
		ExemptedForWorkReasonCode = value;
	}

	private String GroupIndicator = "";

	public String getGroupIndicator() {
		return GroupIndicator;
	}

	public void setGroupIndicator(String value) {
		GroupIndicator = value;
	}

	private String HasIncome = "";

	public String getHasIncome() {
		return HasIncome;
	}

	public void setHasIncome(String value) {
		HasIncome = value;
	}

	private String HasResource = "";

	public String getHasResource() {
		return HasResource;
	}

	public void setHasResource(String value) {
		HasResource = value;
	}

	private String InclusionReasonCode = "";

	public String getInclusionReasonCode() {
		return InclusionReasonCode;
	}

	public void setInclusionReasonCode(String value) {
		InclusionReasonCode = value;
	}

	private LocalDateTime IndividualDataRetrievalDate;

	public LocalDateTime getIndividualDataRetrievalDate() {
		return IndividualDataRetrievalDate;
	}

	public void setIndividualDataRetrievalDate(LocalDateTime value) {
		IndividualDataRetrievalDate = value;
	}

	private LocalDateTime InstitutionalizedDate;

	public LocalDateTime getInstitutionalizedDate() {
		return InstitutionalizedDate;
	}

	public void setInstitutionalizedDate(LocalDateTime value) {
		InstitutionalizedDate = value;
	}

	private String IsAIAN = "";

	public String getIsAIAN() {
		return IsAIAN;
	}

	public void setIsAIAN(String value) {
		IsAIAN = value;
	}

	private String IsCatastrophic = "";

	public String getIsCatastrophic() {
		return IsCatastrophic;
	}

	public void setIsCatastrophic(String value) {
		IsCatastrophic = value;
	}

	private String IsCategoricalEligible = "";

	public String getIsCategoricalEligible() {
		return IsCategoricalEligible;
	}

	public void setIsCategoricalEligible(String value) {
		IsCategoricalEligible = value;
	}

	private String IsCommunityEngagementExempt = "";

	public String getIsCommunityEngagementExempt() {
		return IsCommunityEngagementExempt;
	}

	public void setIsCommunityEngagementExempt(String value) {
		IsCommunityEngagementExempt = value;
	}

	private String IsDeathDateVerified = "";

	public String getIsDeathDateVerified() {
		return IsDeathDateVerified;
	}

	public void setIsDeathDateVerified(String value) {
		IsDeathDateVerified = value;
	}

	private String IsDisqualified = "";

	public String getIsDisqualified() {
		return IsDisqualified;
	}

	public void setIsDisqualified(String value) {
		IsDisqualified = value;
	}

	private String IsDisregardIndividual = "";

	public String getIsDisregardIndividual() {
		return IsDisregardIndividual;
	}

	public void setIsDisregardIndividual(String value) {
		IsDisregardIndividual = value;
	}

	private String IsIndividualInactiveInCase = "";

	public String getIsIndividualInactiveInCase() {
		return IsIndividualInactiveInCase;
	}

	public void setIsIndividualInactiveInCase(String value) {
		IsIndividualInactiveInCase = value;
	}

	private String IsLongTermCareCategoryEligible = "";

	public String getIsLongTermCareCategoryEligible() {
		return IsLongTermCareCategoryEligible;
	}

	public void setIsLongTermCareCategoryEligible(String value) {
		IsLongTermCareCategoryEligible = value;
	}

	private String IsMedicallyFrail = "";

	public String getIsMedicallyFrail() {
		return IsMedicallyFrail;
	}

	public void setIsMedicallyFrail(String value) {
		IsMedicallyFrail = value;
	}

	private String IsMotherMACheckRequired = "";

	public String getIsMotherMACheckRequired() {
		return IsMotherMACheckRequired;
	}

	public void setIsMotherMACheckRequired(String value) {
		IsMotherMACheckRequired = value;
	}

	private String IsTarget = "";

	public String getIsTarget() {
		return IsTarget;
	}

	public void setIsTarget(String value) {
		IsTarget = value;
	}

	private String IsToConsiderDeduction = "";

	public String getIsToConsiderDeduction() {
		return IsToConsiderDeduction;
	}

	public void setIsToConsiderDeduction(String value) {
		IsToConsiderDeduction = value;
	}

	private String IsToConsiderIncome = "";

	public String getIsToConsiderIncome() {
		return IsToConsiderIncome;
	}

	public void setIsToConsiderIncome(String value) {
		IsToConsiderIncome = value;
	}

	private String IsToConsiderNeeds = "";

	public String getIsToConsiderNeeds() {
		return IsToConsiderNeeds;
	}

	public void setIsToConsiderNeeds(String value) {
		IsToConsiderNeeds = value;
	}

	private String IsToConsiderResource = "";

	public String getIsToConsiderResource() {
		return IsToConsiderResource;
	}

	public void setIsToConsiderResource(String value) {
		IsToConsiderResource = value;
	}

	private String HBEHealthIndicator = "";

	public String getHBEHealthIndicator() {
		return HBEHealthIndicator;
	}

	public void setHBEHealthIndicator(String value) {
		HBEHealthIndicator = value;
	}

	private String MABenefitOfMother = "";

	public String getMABenefitOfMother() {
		return MABenefitOfMother;
	}

	public void setMABenefitOfMother(String value) {
		MABenefitOfMother = value;
	}

	private String MCIBenefitCode = "";

	public String getMCIBenefitCode() {
		return MCIBenefitCode;
	}

	public void setMCIBenefitCode(String value) {
		MCIBenefitCode = value;
	}

	private String MedicalFrailIndicator = "";

	public String getMedicalFrailIndicator() {
		return MedicalFrailIndicator;
	}

	public void setMedicalFrailIndicator(String value) {
		MedicalFrailIndicator = value;
	}

	private String MedicalFrailReason = "";

	public String getMedicalFrailReason() {
		return MedicalFrailReason;
	}

	public void setMedicalFrailReason(String value) {
		MedicalFrailReason = value;
	}

	private String NoIncomeFlag = "";

	public String getNoIncomeFlag() {
		return NoIncomeFlag;
	}

	public void setNoIncomeFlag(String value) {
		NoIncomeFlag = value;
	}

	private String NonFinancialEligibilityResultCode = "";

	public String getNonFinancialEligibilityResultCode() {
		return NonFinancialEligibilityResultCode;
	}

	public void setNonFinancialEligibilityResultCode(String value) {
		NonFinancialEligibilityResultCode = value;
	}

	private String ParticipantsStatusCode = "";

	public String getParticipantsStatusCode() {
		return ParticipantsStatusCode;
	}

	public void setParticipantsStatusCode(String value) {
		ParticipantsStatusCode = value;
	}

	private String RelationshipWithTargetIndividual = "";

	public String getRelationshipWithTargetIndividual() {
		return RelationshipWithTargetIndividual;
	}

	public void setRelationshipWithTargetIndividual(String value) {
		RelationshipWithTargetIndividual = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private Long TaxFilerId;

	public Long getTaxFilerId() {
		return TaxFilerId;
	}

	public void setTaxFilerId(Long value) {
		TaxFilerId = value;
	}

	private String TaxFilingStatusCode = "";

	public String getTaxFilingStatusCode() {
		return TaxFilingStatusCode;
	}

	public void setTaxFilingStatusCode(String value) {
		TaxFilingStatusCode = value;
	}

	private LocalDateTime UpdateDate;

	public LocalDateTime getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(LocalDateTime value) {
		UpdateDate = value;
	}

	private String UpdateUserId = "";

	public String getUpdateUserId() {
		return UpdateUserId;
	}

	public void setUpdateUserId(String value) {
		UpdateUserId = value;
	}

	private String VerificationResultCode = "";

	public String getVerificationResultCode() {
		return VerificationResultCode;
	}

	public void setVerificationResultCode(String value) {
		VerificationResultCode = value;
	}

	private EligibilityTraceInformation EligibilityTraceInformation;

	public EligibilityTraceInformation getEligibilityTraceInformation() {
		return EligibilityTraceInformation;
	}

	public void setEligibilityTraceInformation(EligibilityTraceInformation value) {
		EligibilityTraceInformation = value;
	}

	private Collection<EligibilityIndividualIncomeDetail> EligibilityIndividualIncomeDetails;

	public Collection<EligibilityIndividualIncomeDetail> getEligibilityIndividualIncomeDetails() {
		return EligibilityIndividualIncomeDetails;
	}

	public void setEligibilityIndividualIncomeDetails(Collection<EligibilityIndividualIncomeDetail> value) {
		EligibilityIndividualIncomeDetails = value;
	}

}
