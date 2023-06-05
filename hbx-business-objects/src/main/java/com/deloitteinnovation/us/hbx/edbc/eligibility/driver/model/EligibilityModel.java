//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:46:27 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlElement;

//------------------------------------------------------------------------------// <auto-generated>//    This code was generated from a template.////    Manual changes to this file may cause unexpected behavior in your application.//    Manual changes to this file will be overwritten if the code is regenerated.// </auto-generated>//------------------------------------------------------------------------------
public class EligibilityModel {

	private Long CaseNumber;

	public Long getCaseNumber() {
		return CaseNumber;
	}

	public void setCaseNumber(Long value) {
		CaseNumber = value;
	}

	private Boolean NonMagiAssessed;

	public Boolean getNonMagiAssessed() {
		return NonMagiAssessed;
	}

	public void setNonMagiAssessed(Boolean value) {
		NonMagiAssessed = value;
	}

	private Boolean IsCategorical;

	public Boolean getIsCategorical() {
		return IsCategorical;
	}

	public void setIsCategorical(Boolean value) {
		IsCategorical = value;
	}

	
	private int EdgTraceId;

	public int getEdgTraceId() {
		return EdgTraceId;
	}

	public void setEdgTraceId(int value) {
		EdgTraceId = value;
	}

	private String ActivityType = "";

	public String getActivityType() {
		return ActivityType;
	}

	public void setActivityType(String value) {
		ActivityType = value;
	}

	private LocalDateTime AdverseActionDate;

	public LocalDateTime getAdverseActionDate() {
		return AdverseActionDate;
	}

	public void setAdverseActionDate(LocalDateTime value) {
		AdverseActionDate = value;
	}

	private LocalDateTime ApplicationDate;

	public LocalDateTime getApplicationDate() {
		return ApplicationDate;
	}

	public void setApplicationDate(LocalDateTime value) {
		ApplicationDate = value;
	}

	private String ApplicationRequestStatus = "";

	public String getApplicationRequestStatus() {
		return ApplicationRequestStatus;
	}

	public void setApplicationRequestStatus(String value) {
		ApplicationRequestStatus = value;
	}

	private String BenefitStatusCode = "";

	public String getBenefitStatusCode() {
		return BenefitStatusCode;
	}

	public void setBenefitStatusCode(String value) {
		BenefitStatusCode = value;
	}

	private Integer CaseRecertificationId;

	public Integer getCaseRecertificationId() {
		return CaseRecertificationId;
	}

	public void setCaseRecertificationId(Integer value) {
		CaseRecertificationId = value;
	}

	private double CertificateGroupAdultsCount;

	public double getCertificateGroupAdultsCount() {
		return CertificateGroupAdultsCount;
	}

	public void setCertificateGroupAdultsCount(double value) {
		CertificateGroupAdultsCount = value;
	}

	private double CertificateGroupChildCount;

	public double getCertificateGroupChildCount() {
		return CertificateGroupChildCount;
	}

	public void setCertificateGroupChildCount(double value) {
		CertificateGroupChildCount = value;
	}

	private LocalDateTime CertificationBeginDate;

	public LocalDateTime getCertificationBeginDate() {
		return CertificationBeginDate;
	}

	public void setCertificationBeginDate(LocalDateTime value) {
		CertificationBeginDate = value;
	}

	private LocalDateTime CertificationEndDate;

	public LocalDateTime getCertificationEndDate() {
		return CertificationEndDate;
	}

	public void setCertificationEndDate(LocalDateTime value) {
		CertificationEndDate = value;
	}

	private double CertifiedGroupSize;

	public double getCertifiedGroupSize() {
		return CertifiedGroupSize;
	}

	public void setCertifiedGroupSize(double value) {
		CertifiedGroupSize = value;
	}

	private Integer ChangedTOAEDGNumber;

	public Integer getChangedTOAEDGNumber() {
		return ChangedTOAEDGNumber;
	}

	public void setChangedTOAEDGNumber(Integer value) {
		ChangedTOAEDGNumber = value;
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

	private String CurrentEligibilityIndicator = "";

	public String getCurrentEligibilityIndicator() {
		return CurrentEligibilityIndicator;
	}

	public void setCurrentEligibilityIndicator(String value) {
		CurrentEligibilityIndicator = value;
	}

	private LocalDateTime DispositionDate;

	public LocalDateTime getDispositionDate() {
		return DispositionDate;
	}

	public void setDispositionDate(LocalDateTime value) {
		DispositionDate = value;
	}

	private Integer DispositionTransactionId;

	public Integer getDispositionTransactionId() {
		return DispositionTransactionId;
	}

	public void setDispositionTransactionId(Integer value) {
		DispositionTransactionId = value;
	}

	private Integer DispositionTransId;

	public Integer getDispositionTransId() {
		return DispositionTransId;
	}

	public void setDispositionTransId(Integer value) {
		DispositionTransId = value;
	}

	private LocalDateTime EdbcRundate;

	public LocalDateTime getEdbcRundate() {
		return EdbcRundate;
	}

	public void setEdbcRundate(LocalDateTime value) {
		EdbcRundate = value;
	}

	private String EdbcRunMode = "";

	public String getEdbcRunMode() {
		return EdbcRunMode;
	}

	public void setEdbcRunMode(String value) {
		EdbcRunMode = value;
	}

	private String EdgEligibilityResultCode = "";

	public String getEdgEligibilityResultCode() {
		return EdgEligibilityResultCode;
	}

	public void setEdgEligibilityResultCode(String value) {
		EdgEligibilityResultCode = value;
	}

	private int EdgNumber;

	public int getEdgNumber() {
		return EdgNumber;
	}

	public void setEdgNumber(int value) {
		EdgNumber = value;
	}

	private double EdgSize;

	public double getEdgSize() {
		return EdgSize;
	}

	public void setEdgSize(double value) {
		EdgSize = value;
	}

	private Long familyBudgetSize;
	
	public Long getFamilyBudgetSize() {
		return familyBudgetSize;
	}

	public void setFamilyBudgetSize(Long familyBudgetSize) {
		this.familyBudgetSize = familyBudgetSize;
	}
	
	private String EdgStatusCode = "";

	public String getEdgStatusCode() {
		return EdgStatusCode;
	}

	public void setEdgStatusCode(String value) {
		EdgStatusCode = value;
	}

	private String EligibilityActionCode = "";

	public String getEligibilityActionCode() {
		return EligibilityActionCode;
	}

	public void setEligibilityActionCode(String value) {
		EligibilityActionCode = value;
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

	private int EligibilityTransactionId;

	public int getEligibilityTransactionId() {
		return EligibilityTransactionId;
	}

	public void setEligibilityTransactionId(int value) {
		EligibilityTransactionId = value;
	}

	private LocalDateTime EstimatedEligibilityEndDate;

	public LocalDateTime getEstimatedEligibilityEndDate() {
		return EstimatedEligibilityEndDate;
	}

	public void setEstimatedEligibilityEndDate(LocalDateTime value) {
		EstimatedEligibilityEndDate = value;
	}

	private String EvaluatePassThroughWithoutEXPT = "";

	public String getEvaluatePassThroughWithoutEXPT() {
		return EvaluatePassThroughWithoutEXPT;
	}

	public void setEvaluatePassThroughWithoutEXPT(String value) {
		EvaluatePassThroughWithoutEXPT = value;
	}

	private String FilerType = "";

	public String getFilerType() {
		return FilerType;
	}

	public void setFilerType(String value) {
		FilerType = value;
	}

	private String FinanceEligibilityResultCode = "";

	public String getFinanceEligibilityResultCode() {
		return FinanceEligibilityResultCode;
	}

	public void setFinanceEligibilityResultCode(String value) {
		FinanceEligibilityResultCode = value;
	}

	private LocalDateTime InitialCEDispositionDate;

	public LocalDateTime getInitialCEDispositionDate() {
		return InitialCEDispositionDate;
	}

	public void setInitialCEDispositionDate(LocalDateTime value) {
		InitialCEDispositionDate = value;
	}

	private LocalDateTime InitialDispositionDate;

	public LocalDateTime getInitialDispositionDate() {
		return InitialDispositionDate;
	}

	public void setInitialDispositionDate(LocalDateTime value) {
		InitialDispositionDate = value;
	}

	private String IsAdequateNoticeRequired = "";

	public String getIsAdequateNoticeRequired() {
		return IsAdequateNoticeRequired;
	}

	public void setIsAdequateNoticeRequired(String value) {
		IsAdequateNoticeRequired = value;
	}

	private String IsAdvanceNoticeRequired = "";

	public String getIsAdvanceNoticeRequired() {
		return IsAdvanceNoticeRequired;
	}

	public void setIsAdvanceNoticeRequired(String value) {
		IsAdvanceNoticeRequired = value;
	}

	private String IsAdverseActionAllowed = "";

	public String getIsAdverseActionAllowed() {
		return IsAdverseActionAllowed;
	}

	public void setIsAdverseActionAllowed(String value) {
		IsAdverseActionAllowed = value;
	}

	private String IsAutoDisposed = "";

	public String getIsAutoDisposed() {
		return IsAutoDisposed;
	}

	public void setIsAutoDisposed(String value) {
		IsAutoDisposed = value;
	}

	private String IsBuildNextMonth = "";

	public String getIsBuildNextMonth() {
		return IsBuildNextMonth;
	}

	public void setIsBuildNextMonth(String value) {
		IsBuildNextMonth = value;
	}

	private String IsCreator = "";

	public String getIsCreator() {
		return IsCreator;
	}

	public void setIsCreator(String value) {
		IsCreator = value;
	}

	private String IsDelete = "";

	public String getIsDelete() {
		return IsDelete;
	}

	public void setIsDelete(String value) {
		IsDelete = value;
	}

	private String IsDeterminedUsingTrustedDataSource = "";

	public String getIsDeterminedUsingTrustedDataSource() {
		return IsDeterminedUsingTrustedDataSource;
	}

	public void setIsDeterminedUsingTrustedDataSource(String value) {
		IsDeterminedUsingTrustedDataSource = value;
	}

	private String IsEdgClosure = "";

	public String getIsEdgClosure() {
		return IsEdgClosure;
	}

	public void setIsEdgClosure(String value) {
		IsEdgClosure = value;
	}

	private String IsEdgOverride = "";

	public String getIsEdgOverride() {
		return IsEdgOverride;
	}

	public void setIsEdgOverride(String value) {
		IsEdgOverride = value;
	}

	private String IsEdgReprocess = "";

	public String getIsEdgReprocess() {
		return IsEdgReprocess;
	}

	public void setIsEdgReprocess(String value) {
		IsEdgReprocess = value;
	}

	private String IsFinancialEligibilityTestRequired = "";

	public String getIsFinancialEligibilityTestRequired() {
		return IsFinancialEligibilityTestRequired;
	}

	public void setIsFinancialEligibilityTestRequired(String value) {
		IsFinancialEligibilityTestRequired = value;
	}

	private String IsHistorical = "";

	public String getIsHistorical() {
		return IsHistorical;
	}

	public void setIsHistorical(String value) {
		IsHistorical = value;
	}

	private String IsHistoryType = "";

	public String getIsHistoryType() {
		return IsHistoryType;
	}

	public void setIsHistoryType(String value) {
		IsHistoryType = value;
	}

	private String IsHospitalizedDuringIncarceration = "";

	public String getIsHospitalizedDuringIncarceration() {
		return IsHospitalizedDuringIncarceration;
	}

	public void setIsHospitalizedDuringIncarceration(String value) {
		IsHospitalizedDuringIncarceration = value;
	}

	private String IsIncomeExclusionEligibilityResult = "";

	public String getIsIncomeExclusionEligibilityResult() {
		return IsIncomeExclusionEligibilityResult;
	}

	public void setIsIncomeExclusionEligibilityResult(String value) {
		IsIncomeExclusionEligibilityResult = value;
	}

	private String IsIncomeExclusionTestRequired = "";

	public String getIsIncomeExclusionTestRequired() {
		return IsIncomeExclusionTestRequired;
	}

	public void setIsIncomeExclusionTestRequired(String value) {
		IsIncomeExclusionTestRequired = value;
	}

	private String IsMFPCase = "";

	public String getIsMFPCase() {
		return IsMFPCase;
	}

	public void setIsMFPCase(String value) {
		IsMFPCase = value;
	}

	private String IsMidYearReview = "";

	public String getIsMidYearReview() {
		return IsMidYearReview;
	}

	public void setIsMidYearReview(String value) {
		IsMidYearReview = value;
	}

	private String IsNonFinancialVerificationRequired = "";

	public String getIsNonFinancialVerificationRequired() {
		return IsNonFinancialVerificationRequired;
	}

	public void setIsNonFinancialVerificationRequired(String value) {
		IsNonFinancialVerificationRequired = value;
	}

	private String IsPenaltyToBeApplied = "";

	public String getIsPenaltyToBeApplied() {
		return IsPenaltyToBeApplied;
	}

	public void setIsPenaltyToBeApplied(String value) {
		IsPenaltyToBeApplied = value;
	}

	private String IsPendingVerification = "";

	public String getIsPendingVerification() {
		return IsPendingVerification;
	}

	public void setIsPendingVerification(String value) {
		IsPendingVerification = value;
	}

	private String IsPregEligible = "";

	public String getIsPregEligible() {
		return IsPregEligible;
	}

	public void setIsPregEligible(String value) {
		IsPregEligible = value;
	}

	private String IsResourceEligibilityTestRequired = "";

	public String getIsResourceEligibilityTestRequired() {
		return IsResourceEligibilityTestRequired;
	}

	public void setIsResourceEligibilityTestRequired(String value) {
		IsResourceEligibilityTestRequired = value;
	}

	private String IsResourceExcluded = "";

	public String getIsResourceExcluded() {
		return IsResourceExcluded;
	}

	public void setIsResourceExcluded(String value) {
		IsResourceExcluded = value;
	}

	private String IsSanction = "";

	public String getIsSanction() {
		return IsSanction;
	}

	public void setIsSanction(String value) {
		IsSanction = value;
	}

	private String IsSSIRelatedQMB = "";

	public String getIsSSIRelatedQMB() {
		return IsSSIRelatedQMB;
	}

	public void setIsSSIRelatedQMB(String value) {
		IsSSIRelatedQMB = value;
	}

	private String IsSSIToBeReferred = "";

	public String getIsSSIToBeReferred() {
		return IsSSIToBeReferred;
	}

	public void setIsSSIToBeReferred(String value) {
		IsSSIToBeReferred = value;
	}

	private String IsSupervisorOverride = "";

	public String getIsSupervisorOverride() {
		return IsSupervisorOverride;
	}

	public void setIsSupervisorOverride(String value) {
		IsSupervisorOverride = value;
	}

	private String IsTemporaryBenefit = "";

	public String getIsTemporaryBenefit() {
		return IsTemporaryBenefit;
	}

	public void setIsTemporaryBenefit(String value) {
		IsTemporaryBenefit = value;
	}

	private String IsToConsiderUCase = "";

	public String getIsToConsiderUCase() {
		return IsToConsiderUCase;
	}

	public void setIsToConsiderUCase(String value) {
		IsToConsiderUCase = value;
	}

	private String IsWarningRequiredForFTR = "";

	public String getIsWarningRequiredForFTR() {
		return IsWarningRequiredForFTR;
	}

	public void setIsWarningRequiredForFTR(String value) {
		IsWarningRequiredForFTR = value;
	}

	private String KHIPPStatus = "";

	public String getKHIPPStatus() {
		return KHIPPStatus;
	}

	public void setKHIPPStatus(String value) {
		KHIPPStatus = value;
	}

	private String HBEHCEApprovalReason = "";

	public String getHBEHCEApprovalReason() {
		return HBEHCEApprovalReason;
	}

	public void setHBEHCEApprovalReason(String value) {
		HBEHCEApprovalReason = value;
	}

	private String HBEHealthFlag = "";

	public String getHBEHealthFlag() {
		return HBEHealthFlag;
	}

	public void setHBEHealthFlag(String value) {
		HBEHealthFlag = value;
	}

	private LocalDateTime LocBeginDate;

	public LocalDateTime getLocBeginDate() {
		return LocBeginDate;
	}

	public void setLocBeginDate(LocalDateTime value) {
		LocBeginDate = value;
	}

	private String ManagecareExempt = "";

	public String getManagecareExempt() {
		return ManagecareExempt;
	}

	public void setManagecareExempt(String value) {
		ManagecareExempt = value;
	}

	private LocalDateTime MFPEndDate;

	public LocalDateTime getMFPEndDate() {
		return MFPEndDate;
	}

	public void setMFPEndDate(LocalDateTime value) {
		MFPEndDate = value;
	}

	private String NonFin90DaysLPRResult = "";

	public String getNonFin90DaysLPRResult() {
		return NonFin90DaysLPRResult;
	}

	public void setNonFin90DaysLPRResult(String value) {
		NonFin90DaysLPRResult = value;
	}

	private String NonFinancialEligibilityResultCode = "";

	public String getNonFinancialEligibilityResultCode() {
		return NonFinancialEligibilityResultCode;
	}

	public void setNonFinancialEligibilityResultCode(String value) {
		NonFinancialEligibilityResultCode = value;
	}

	private Integer NumberOfParents;

	public Integer getNumberOfParents() {
		return NumberOfParents;
	}

	public void setNumberOfParents(Integer value) {
		NumberOfParents = value;
	}

	private LocalDateTime PaymentBeginDate;

	public LocalDateTime getPaymentBeginDate() {
		return PaymentBeginDate;
	}

	public void setPaymentBeginDate(LocalDateTime value) {
		PaymentBeginDate = value;
	}

	private LocalDateTime PaymentEndDate;

	public LocalDateTime getPaymentEndDate() {
		return PaymentEndDate;
	}

	public void setPaymentEndDate(LocalDateTime value) {
		PaymentEndDate = value;
	}

	private LocalDateTime PeriodEndDate;

	public LocalDateTime getPeriodEndDate() {
		return PeriodEndDate;
	}

	public void setPeriodEndDate(LocalDateTime value) {
		PeriodEndDate = value;
	}

	private LocalDateTime PeriodStartDate;

	public LocalDateTime getPeriodStartDate() {
		return PeriodStartDate;
	}

	public void setPeriodStartDate(LocalDateTime value) {
		PeriodStartDate = value;
	}

	private Integer PriorMASequenceNumber;

	public Integer getPriorMASequenceNumber() {
		return PriorMASequenceNumber;
	}

	public void setPriorMASequenceNumber(Integer value) {
		PriorMASequenceNumber = value;
	}

	public String PriorMedicaidCode = "";

	public String getPriorMedicaidCode() {
		return PriorMedicaidCode;
	}

	public void setPriorMedicaidCode(String value) {
		PriorMedicaidCode = value;
	}

	private String ProcessId = "";

	public String getProcessId() {
		return ProcessId;
	}

	public void setProcessId(String value) {
		ProcessId = value;
	}

	private String ProgramCode = "";

	public String getProgramCode() {
		return ProgramCode;
	}

	public void setProgramCode(String value) {
		ProgramCode = value;
	}

	private Integer ReferenceEdgTraceId;

	public Integer getReferenceEdgTraceId() {
		return ReferenceEdgTraceId;
	}

	public void setReferenceEdgTraceId(Integer value) {
		ReferenceEdgTraceId = value;
	}

	private LocalDateTime RequestDate;

	public LocalDateTime getRequestDate() {
		return RequestDate;
	}

	public void setRequestDate(LocalDateTime value) {
		RequestDate = value;
	}

	private String ResourceEligibilityResultCode = "";

	public String getResourceEligibilityResultCode() {
		return ResourceEligibilityResultCode;
	}

	public void setResourceEligibilityResultCode(String value) {
		ResourceEligibilityResultCode = value;
	}

	private Integer RosterEmployerId;

	public Integer getRosterEmployerId() {
		return RosterEmployerId;
	}

	public void setRosterEmployerId(Integer value) {
		RosterEmployerId = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private String RRCRequired = "";

	public String getRRCRequired() {
		return RRCRequired;
	}

	public void setRRCRequired(String value) {
		RRCRequired = value;
	}

	private String SpecialTriggerCode = "";

	public String getSpecialTriggerCode() {
		return SpecialTriggerCode;
	}

	public void setSpecialTriggerCode(String value) {
		SpecialTriggerCode = value;
	}

	private String SSPWaiverType = "";

	public String getSSPWaiverType() {
		return SSPWaiverType;
	}

	public void setSSPWaiverType(String value) {
		SSPWaiverType = value;
	}

	private String SuspensionIndicator = "";

	public String getSuspensionIndicator() {
		return SuspensionIndicator;
	}

	public void setSuspensionIndicator(String value) {
		SuspensionIndicator = value;
	}

	private Long TargetIndividualId;

	public Long getTargetIndividualId() {
		return TargetIndividualId;
	}

	public void setTargetIndividualId(Long value) {
		TargetIndividualId = value;
	}

	private Integer TaxGroupID;

	public Integer getTaxGroupID() {
		return TaxGroupID;
	}

	public void setTaxGroupID(Integer value) {
		TaxGroupID = value;
	}

	private LocalDateTime Temporary90DaysApprovalEndDate;

	public LocalDateTime getTemporary90DaysApprovalEndDate() {
		return Temporary90DaysApprovalEndDate;
	}

	public void setTemporary90DaysApprovalEndDate(LocalDateTime value) {
		Temporary90DaysApprovalEndDate = value;
	}

	private LocalDateTime TMABeginDate;

	public LocalDateTime getTMABeginDate() {
		return TMABeginDate;
	}

	public void setTMABeginDate(LocalDateTime value) {
		TMABeginDate = value;
	}

	private LocalDateTime TMAEndDate;

	public LocalDateTime getTMAEndDate() {
		return TMAEndDate;
	}

	public void setTMAEndDate(LocalDateTime value) {
		TMAEndDate = value;
	}

	private Integer TOAPriorityNumber;

	public Integer getTOAPriorityNumber() {
		return TOAPriorityNumber;
	}

	public void setTOAPriorityNumber(Integer value) {
		TOAPriorityNumber = value;
	}

	private String TransitionEdgStatusCode = "";

	public String getTransitionEdgStatusCode() {
		return TransitionEdgStatusCode;
	}

	public void setTransitionEdgStatusCode(String value) {
		TransitionEdgStatusCode = value;
	}

	private String TrustedSourceResultCode = "";

	public String getTrustedSourceResultCode() {
		return TrustedSourceResultCode;
	}

	public void setTrustedSourceResultCode(String value) {
		TrustedSourceResultCode = value;
	}

	private String TypeOfAssitanceCode = "";

	public String getTypeOfAssitanceCode() {
		return TypeOfAssitanceCode;
	}

	public void setTypeOfAssitanceCode(String value) {
		TypeOfAssitanceCode = value;
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

	private String VerificationStatusCode = "";

	public String getVerificationStatusCode() {
		return VerificationStatusCode;
	}

	public void setVerificationStatusCode(String value) {
		VerificationStatusCode = value;
	}

	private String WorkerId = "";

	public String getWorkerId() {
		return WorkerId;
	}

	public void setWorkerId(String value) {
		WorkerId = value;
	}

}
