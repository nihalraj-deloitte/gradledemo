package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.eligibilitydetermination;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;

public class EligibilityTraceInformation {

	public EligibilityTraceInformation()  {
		setEligibilityAffordableTests(new HashSet<>());
		setEligibilityIndividuals(new HashSet<>());
		setEligibilityIndividualDatas(new HashSet<>());
		setEligibilityIndividualHubVerifications(new HashSet<>());
		setEligibilityIndividualNoticeReasons(new HashSet<>());
		setEligibilityIndividualPenalties(new HashSet<>());
		setEligibilityIndividualPrograms(new HashSet<>());
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

	private String ActivityType = "";

	public String getActivityType() {
		return ActivityType;
	}

	public void setActivityType(String value) {
		ActivityType = value;
	}

	private String AllowDispositionFlag = "";

	public String getAllowDispositionFlag() {
		return AllowDispositionFlag;
	}

	public void setAllowDispositionFlag(String value) {
		AllowDispositionFlag = value;
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

	private Integer EDBCEdmInfoId;

	public Integer getEDBCEdmInfoId() {
		return EDBCEdmInfoId;
	}

	public void setEDBCEdmInfoId(Integer value) {
		EDBCEdmInfoId = value;
	}

	private LocalDateTime EdbcRundate;

	public LocalDateTime getEdbcRundate() {
		return EdbcRundate;
	}

	public void setEdbcRundate(LocalDateTime value) {
		EdbcRundate = value;
	}

	private Integer EdgNumber;

	public Integer getEdgNumber() {
		return EdgNumber;
	}

	public void setEdgNumber(Integer value) {
		EdgNumber = value;
	}

	private String EdgStatusCode = "";

	public String getEdgStatusCode() {
		return EdgStatusCode;
	}

	public void setEdgStatusCode(String value) {
		EdgStatusCode = value;
	}

	private String EDMIndicator = "";

	public String getEDMIndicator() {
		return EDMIndicator;
	}

	public void setEDMIndicator(String value) {
		EDMIndicator = value;
	}

	private Integer EligibilityTransactionId;

	public Integer getEligibilityTransactionId() {
		return EligibilityTransactionId;
	}

	public void setEligibilityTransactionId(Integer value) {
		EligibilityTransactionId = value;
	}

	private String EmergencyFlag = "";

	public String getEmergencyFlag() {
		return EmergencyFlag;
	}

	public void setEmergencyFlag(String value) {
		EmergencyFlag = value;
	}

	private LocalDateTime InitialDispositionDate;

	public LocalDateTime getInitialDispositionDate() {
		return InitialDispositionDate;
	}

	public void setInitialDispositionDate(LocalDateTime value) {
		InitialDispositionDate = value;
	}

	private String IsDelete = "";

	public String getIsDelete() {
		return IsDelete;
	}

	public void setIsDelete(String value) {
		IsDelete = value;
	}

	private String IsProgramReinstated = "";

	public String getIsProgramReinstated() {
		return IsProgramReinstated;
	}

	public void setIsProgramReinstated(String value) {
		IsProgramReinstated = value;
	}

	private String isSupervisorOverride = "";

	public String getisSupervisorOverride() {
		return isSupervisorOverride;
	}

	public void setisSupervisorOverride(String value) {
		isSupervisorOverride = value;
	}

	private Integer LastAuthEdgTraceA;

	public Integer getLastAuthEdgTraceA() {
		return LastAuthEdgTraceA;
	}

	public void setLastAuthEdgTraceA(Integer value) {
		LastAuthEdgTraceA = value;
	}

	private Integer LastAuthEdgTraceB;

	public Integer getLastAuthEdgTraceB() {
		return LastAuthEdgTraceB;
	}

	public void setLastAuthEdgTraceB(Integer value) {
		LastAuthEdgTraceB = value;
	}

	private Integer LastAuthEdgTraceR;

	public Integer getLastAuthEdgTraceR() {
		return LastAuthEdgTraceR;
	}

	public void setLastAuthEdgTraceR(Integer value) {
		LastAuthEdgTraceR = value;
	}

	private LocalDateTime MidReviewInitiateDate;

	public LocalDateTime getMidReviewInitiateDate() {
		return MidReviewInitiateDate;
	}

	public void setMidReviewInitiateDate(LocalDateTime value) {
		MidReviewInitiateDate = value;
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

	private String PriorMedicaidCode = "";

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

	private Integer R5ConversionEdgTraceId;

	public Integer getR5ConversionEdgTraceId() {
		return R5ConversionEdgTraceId;
	}

	public void setR5ConversionEdgTraceId(Integer value) {
		R5ConversionEdgTraceId = value;
	}

	private Long R5ConversionEdgTraceIdOld;

	public Long getR5ConversionEdgTraceIdOld() {
		return R5ConversionEdgTraceIdOld;
	}

	public void setR5ConversionEdgTraceIdOld(Long value) {
		R5ConversionEdgTraceIdOld = value;
	}

	private Integer ReferenceEdgTraceId;

	public Integer getReferenceEdgTraceId() {
		return ReferenceEdgTraceId;
	}

	public void setReferenceEdgTraceId(Integer value) {
		ReferenceEdgTraceId = value;
	}

	private LocalDateTime ReviewInitiateDate;

	public LocalDateTime getReviewInitiateDate() {
		return ReviewInitiateDate;
	}

	public void setReviewInitiateDate(LocalDateTime value) {
		ReviewInitiateDate = value;
	}

	private byte[] RowVersionStamp;

	public byte[] getRowVersionStamp() {
		return RowVersionStamp;
	}

	public void setRowVersionStamp(byte[] value) {
		RowVersionStamp = value;
	}

	private String TransitionEdgStatusCode = "";

	public String getTransitionEdgStatusCode() {
		return TransitionEdgStatusCode;
	}

	public void setTransitionEdgStatusCode(String value) {
		TransitionEdgStatusCode = value;
	}

	private String TypeOfAssistanceCode = "";

	public String getTypeOfAssistanceCode() {
		return TypeOfAssistanceCode;
	}

	public void setTypeOfAssistanceCode(String value) {
		TypeOfAssistanceCode = value;
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

	private EDBCLastAuthInfo EDBCLastAuthInfo;

	public EDBCLastAuthInfo getEDBCLastAuthInfo() {
		return EDBCLastAuthInfo;
	}

	public void setEDBCLastAuthInfo(EDBCLastAuthInfo value) {
		EDBCLastAuthInfo = value;
	}

	private Eligibility Eligibility;

	public Eligibility getEligibility() {
		return Eligibility;
	}

	public void setEligibility(Eligibility value) {
		Eligibility = value;
	}

	private Collection<EligibilityAffordableTest> EligibilityAffordableTests;

	public Collection<EligibilityAffordableTest> getEligibilityAffordableTests() {
		return EligibilityAffordableTests;
	}

	public void setEligibilityAffordableTests(Collection<EligibilityAffordableTest> value) {
		EligibilityAffordableTests = value;
	}

	private Collection<EligibilityIndividual> EligibilityIndividuals;

	public Collection<EligibilityIndividual> getEligibilityIndividuals() {
		return EligibilityIndividuals;
	}

	public void setEligibilityIndividuals(Collection<EligibilityIndividual> value) {
		EligibilityIndividuals = value;
	}

	private Collection<EligibilityIndividualData> EligibilityIndividualDatas;

	public Collection<EligibilityIndividualData> getEligibilityIndividualDatas() {
		return EligibilityIndividualDatas;
	}

	public void setEligibilityIndividualDatas(Collection<EligibilityIndividualData> value) {
		EligibilityIndividualDatas = value;
	}

	private Collection<EligibilityIndividualHubVerification> EligibilityIndividualHubVerifications;

	public Collection<EligibilityIndividualHubVerification> getEligibilityIndividualHubVerifications() {
		return EligibilityIndividualHubVerifications;
	}

	public void setEligibilityIndividualHubVerifications(Collection<EligibilityIndividualHubVerification> value) {
		EligibilityIndividualHubVerifications = value;
	}

	private Collection<EligibilityIndividualNoticeReason> EligibilityIndividualNoticeReasons;

	public Collection<EligibilityIndividualNoticeReason> getEligibilityIndividualNoticeReasons() {
		return EligibilityIndividualNoticeReasons;
	}

	public void setEligibilityIndividualNoticeReasons(Collection<EligibilityIndividualNoticeReason> value) {
		EligibilityIndividualNoticeReasons = value;
	}

	private Collection<EligibilityIndividualPenalty> EligibilityIndividualPenalties;

	public Collection<EligibilityIndividualPenalty> getEligibilityIndividualPenalties() {
		return EligibilityIndividualPenalties;
	}

	public void setEligibilityIndividualPenalties(Collection<EligibilityIndividualPenalty> value) {
		EligibilityIndividualPenalties = value;
	}

	private Collection<EligibilityIndividualProgram> EligibilityIndividualPrograms;

	public Collection<EligibilityIndividualProgram> getEligibilityIndividualPrograms() {
		return EligibilityIndividualPrograms;
	}

	public void setEligibilityIndividualPrograms(Collection<EligibilityIndividualProgram> value) {
		EligibilityIndividualPrograms = value;
	}

	private EligibilityNoticeReason EligibilityNoticeReason;

	public EligibilityNoticeReason getEligibilityNoticeReason() {
		return EligibilityNoticeReason;
	}

	public void setEligibilityNoticeReason(EligibilityNoticeReason value) {
		EligibilityNoticeReason = value;
	}

}
