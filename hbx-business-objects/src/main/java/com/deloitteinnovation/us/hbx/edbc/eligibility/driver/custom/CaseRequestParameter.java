package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.DateUtility;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service.Request;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class CaseRequestParameter {
    private String ExecutionLog = StringUtils.EMPTY;
    private Long caseNumber;
    private String csraRunMode = "";
    private LocalDateTime edbcRunDate;
    private com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestMode edbcRunMode = com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestMode.BATCH;
    private com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestSource edbcRequestSource = com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestSource.DC;
    private LocalDateTime resourceAsOfDate;
    private String ProgramCode;
    private List<MinMaxInput> minMaxInput = new ArrayList<>();
    private LocalDateTime calMedicaidMinDate;
    private LocalDateTime calMedicaidMaxDate;
    private String yearType;

    public String getYearType() { return yearType; }

    public void setYearType(String yearType) { this.yearType = yearType; }

    public LocalDateTime getCalMedicaidMinDate() {
        return calMedicaidMinDate;
    }

    public void setCalMedicaidMinDate(LocalDateTime calMedicaidMinDate) {
        this.calMedicaidMinDate = calMedicaidMinDate;
    }

    public LocalDateTime getCalMedicaidMaxDate() {
        return calMedicaidMaxDate;
    }

    public void setCalMedicaidMaxDate(LocalDateTime calMedicaidMaxDate) {
        this.calMedicaidMaxDate = calMedicaidMaxDate;
    }

    public String getProgramCode() {
        return ProgramCode;
    }

    public MedicaidMode getMedicaidMode() {
        return medicaidMode;
    }

    public void setMedicaidMode(MedicaidMode medicaidMode) {
        this.medicaidMode = medicaidMode;
    }

    public String getRunModeAttributes() {
        return runModeAttributes;
    }

    public void setRunModeAttributes(String runModeAttributes) {
        this.runModeAttributes = runModeAttributes;
    }

    public void setProgramCode(String programCode) {
        ProgramCode = programCode;
    }

    private LocalDateTime assessmentRequestDate;
    private String csraApplicationMode = "";
    private String userId = "";
    private boolean edgReRunFlag;
    private List<CaseProgramDetails> programMinMaxList = new ArrayList<>();
    private List<Integer> lowerHierarchyLOCIds = new ArrayList<>();
    private List<Integer> waiverReconsideredLOCIds = new ArrayList<>();
    private String edbcProcessId = "";
    private MedicaidMode medicaidMode = MedicaidMode.ALL;
    private String patientLiabilityRunMode = "";
    private EligibilityMinMaxModel eligibilityCaseMinMax;
    private Dictionary<AdditionalAttribute, Boolean> additionalAttributes;
    private Long headOfHouseholdIndividualId;
    public List<MassUpdateTriggerDetail> muTriggerDetail = new ArrayList<>();
    private SessionMode sessionMode = SessionMode.SESSIONNONE;
    private String runModeAttributes = "";
    private String kTAPFADSelection = "";
    private LocalDateTime currentLocalDateTime;
    private boolean isTaskCreated = false;
    private boolean isMUSNAPInserted = false;
    private boolean isMUCCAPInserted = false;
    private boolean isMUKTAPSCCSSInserted = false;
    public int TempEdgTraceId = 1;
    private int _tempvclid = 1;
    private LocalDateTime CaseMinMonthDate;
    private LocalDateTime CaseMaxMonthDate;
    private LocalDateTime HBEHCaseMinMonthDate;
    private LocalDateTime HBEHCaseMaxMonthDate;
    public boolean isNMAGIExecuted;
    private int EDGNumber;
    private LocalDateTime CurrentEDM;
    private int EligibilityTransactionId;
    // 342936 - VCL Monthly Data Capture
    private boolean isToRunAllPrograms = true;
    private Dictionary<Integer, String> processedRNEdgNumbers;
    private List<Integer> processedRNEdgNumberList = new ArrayList<>();
    private List<Integer> mawithLTCProcessedIndividuals = new ArrayList<>();
    private boolean IsPayloadRequest;
    private int EDGTraceId;
    private LocalDateTime ApplicationDate;
    private LocalDateTime EDBCActionDate;
    private Request PayloadRequest;

    private boolean ToEvaluateMAGI;

    public boolean getToEvaluateMAGI() {
        return ToEvaluateMAGI;
    }

    public void setToEvaluateMAGI(boolean ToEvaluateMAGI) {
        this.ToEvaluateMAGI = ToEvaluateMAGI;
    }

    public CaseRequestParameter(Request payloadRequest) {
        PopulateInputParameters(payloadRequest);
    }

    private void PopulateInputParameters(Request payloadRequest) {
        caseNumber = payloadRequest.getApplicationRequest().getApplicationID();
        edbcRunDate = DateUtility
                .convertGregorianCalToLocalDateTime(payloadRequest.getApplicationRequest().getRequestDate());
        ApplicationDate = DateUtility
                .convertGregorianCalToLocalDateTime(payloadRequest.getApplicationRequest().getApplicationReceivedDate());
        if (ApplicationDate.isBefore(edbcRunDate.minusDays(60))) {
            ApplicationDate = edbcRunDate.minusDays(60);
        }
        IsPayloadRequest = true;
        PayloadRequest = payloadRequest;
        medicaidMode = MedicaidMode.MAGI;
    }

    public LocalDateTime getCaseMinMonthDate() {
        return CaseMinMonthDate;
    }

    public void setCaseMinMonthDate(LocalDateTime caseMinMonthDate) {
        CaseMinMonthDate = caseMinMonthDate;
    }

    public LocalDateTime getCaseMaxMonthDate() {
        return CaseMaxMonthDate;
    }

    public void setCaseMaxMonthDate(LocalDateTime caseMaxMonthDate) {
        CaseMaxMonthDate = caseMaxMonthDate;
    }

    public LocalDateTime getHBEHCaseMinMonthDate() {
        return HBEHCaseMinMonthDate;
    }

    public void setHBEHCaseMinMonthDate(LocalDateTime hbeCaseMinMonthDate) {
        HBEHCaseMinMonthDate = hbeCaseMinMonthDate;
    }

    public LocalDateTime getHBEHCaseMaxMonthDate() {
        return HBEHCaseMaxMonthDate;
    }

    public void setHBEHCaseMaxMonthDate(LocalDateTime hbeCaseMaxMonthDate) {
        HBEHCaseMaxMonthDate = hbeCaseMaxMonthDate;
    }

    public int getTempVCLId() {
        return _tempvclid;
    }

    public void setTempVCLId(int value) {
        _tempvclid = value;
    }

    public boolean getIsPayloadRequest() {
        return IsPayloadRequest;
    }

    public void setIsPayloadRequest(boolean value) {
        IsPayloadRequest = value;
    }

    public List<CaseProgramDetails> getProgramMinMaxList() {
        return programMinMaxList;
    }

    public void setProgramMinMaxList(List<CaseProgramDetails> programMinMaxList) {
        this.programMinMaxList = programMinMaxList;
    }

    public int getEDGNumber() {
        return EDGNumber;
    }

    public void setEDGNumber(int eDGNumber) {
        EDGNumber = eDGNumber;
    }

    public LocalDateTime getCurrentEDM() {
        return CurrentEDM;
    }

    public void setCurrentEDM(LocalDateTime currentEDM) {
        CurrentEDM = currentEDM;
    }

    public Long getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(Long caseNumber) {
        this.caseNumber = caseNumber;
    }

    public LocalDateTime getEdbcRunDate() {
        return edbcRunDate;
    }

    public void setEdbcRunDate(LocalDateTime edbcRunDate) {
        this.edbcRunDate = edbcRunDate;
    }

    public int getEligibilityTransactionId() {
        return EligibilityTransactionId;
    }

    public void setEligibilityTransactionId(int eligibilityTransactionId) {
        EligibilityTransactionId = eligibilityTransactionId;
    }

    public String getEdbcProcessId() {
        return edbcProcessId;
    }

    public void setEdbcProcessId(String edbcProcessId) {
        this.edbcProcessId = edbcProcessId;
    }

    public int getEDGTraceId() {
        return EDGTraceId;
    }

    public void setEDGTraceId(int eDGTraceId) {
        EDGTraceId = eDGTraceId;
    }

    public LocalDateTime getApplicationDate() {
        return ApplicationDate;
    }

    public void setApplicationDate(LocalDateTime applicationDate) {
        ApplicationDate = applicationDate;
    }

    public Long getHeadOfHouseholdIndividualId() {
        return headOfHouseholdIndividualId;
    }

    public void setHeadOfHouseholdIndividualId(Long headOfHouseholdIndividualId) {
        this.headOfHouseholdIndividualId = headOfHouseholdIndividualId;
    }

    public LocalDateTime getEDBCActionDate() {
        return EDBCActionDate;
    }

    public void setEDBCActionDate(LocalDateTime eDBCActionDate) {
        EDBCActionDate = eDBCActionDate;
    }

    public Request getPayloadRequest() {
        return PayloadRequest;
    }

    public void setPayloadRequest(Request payloadRequest) {
        PayloadRequest = payloadRequest;
    }

    public String getExecutionLog() {
        return ExecutionLog;
    }

    public void setExecutionLog(String executionLog) {
        ExecutionLog = executionLog;
    }

    public String getCsraRunMode() {
        return csraRunMode;
    }

    public void setCsraRunMode(String csraRunMode) {
        this.csraRunMode = csraRunMode;
    }

    public com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestMode getEdbcRunMode() {
        return edbcRunMode;
    }

    public void setEdbcRunMode(
            com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestMode edbcRunMode) {
        this.edbcRunMode = edbcRunMode;
    }

    public com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestSource getEdbcRequestSource() {
        return edbcRequestSource;
    }

    public void setEdbcRequestSource(
            com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom.CaseRequestSource edbcRequestSource) {
        this.edbcRequestSource = edbcRequestSource;
    }

    public LocalDateTime getResourceAsOfDate() {
        return resourceAsOfDate;
    }

    public void setResourceAsOfDate(LocalDateTime resourceAsOfDate) {
        this.resourceAsOfDate = resourceAsOfDate;
    }

    public LocalDateTime getAssessmentRequestDate() {
        return assessmentRequestDate;
    }

    public void setAssessmentRequestDate(LocalDateTime assessmentRequestDate) {
        this.assessmentRequestDate = assessmentRequestDate;
    }

    public String getCsraApplicationMode() {
        return csraApplicationMode;
    }

    public void setCsraApplicationMode(String csraApplicationMode) {
        this.csraApplicationMode = csraApplicationMode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isEdgReRunFlag() {
        return edgReRunFlag;
    }

    public void setEdgReRunFlag(boolean edgReRunFlag) {
        this.edgReRunFlag = edgReRunFlag;
    }

    public List<Integer> getLowerHierarchyLOCIds() {
        return lowerHierarchyLOCIds;
    }

    public void setLowerHierarchyLOCIds(List<Integer> lowerHierarchyLOCIds) {
        this.lowerHierarchyLOCIds = lowerHierarchyLOCIds;
    }

    public List<Integer> getWaiverReconsideredLOCIds() {
        return waiverReconsideredLOCIds;
    }

    public void setWaiverReconsideredLOCIds(List<Integer> waiverReconsideredLOCIds) {
        this.waiverReconsideredLOCIds = waiverReconsideredLOCIds;
    }

    public String getPatientLiabilityRunMode() {
        return patientLiabilityRunMode;
    }

    public void setPatientLiabilityRunMode(String patientLiabilityRunMode) {
        this.patientLiabilityRunMode = patientLiabilityRunMode;
    }

    public EligibilityMinMaxModel getEligibilityCaseMinMax() {
        return eligibilityCaseMinMax;
    }

    public void setEligibilityCaseMinMax(EligibilityMinMaxModel eligibilityCaseMinMax) {
        this.eligibilityCaseMinMax = eligibilityCaseMinMax;
    }

    public List<MinMaxInput> getMinMaxInput() {
        return minMaxInput;
    }

    public Dictionary<AdditionalAttribute, Boolean> getAdditionalAttributes() {
        return additionalAttributes;
    }

    public void setAdditionalAttributes(Dictionary<AdditionalAttribute, Boolean> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    public List<MassUpdateTriggerDetail> getMuTriggerDetail() {
        return muTriggerDetail;
    }

    public void setMuTriggerDetail(List<MassUpdateTriggerDetail> muTriggerDetail) {
        this.muTriggerDetail = muTriggerDetail;
    }

    public SessionMode getSessionMode() {
        return sessionMode;
    }

    public void setSessionMode(SessionMode sessionMode) {
        this.sessionMode = sessionMode;
    }

    public String getkTAPFADSelection() {
        return kTAPFADSelection;
    }

    public void setkTAPFADSelection(String kTAPFADSelection) {
        this.kTAPFADSelection = kTAPFADSelection;
    }

    public LocalDateTime getCurrentLocalDateTime() {
        return currentLocalDateTime;
    }

    public void setCurrentLocalDateTime(LocalDateTime currentLocalDateTime) {
        this.currentLocalDateTime = currentLocalDateTime;
    }

    public boolean isTaskCreated() {
        return isTaskCreated;
    }

    public void setTaskCreated(boolean isTaskCreated) {
        this.isTaskCreated = isTaskCreated;
    }

    public boolean isMUSNAPInserted() {
        return isMUSNAPInserted;
    }

    public void setMUSNAPInserted(boolean isMUSNAPInserted) {
        this.isMUSNAPInserted = isMUSNAPInserted;
    }

    public boolean isMUCCAPInserted() {
        return isMUCCAPInserted;
    }

    public void setMUCCAPInserted(boolean isMUCCAPInserted) {
        this.isMUCCAPInserted = isMUCCAPInserted;
    }

    public boolean isMUKTAPSCCSSInserted() {
        return isMUKTAPSCCSSInserted;
    }

    public void setMUKTAPSCCSSInserted(boolean isMUKTAPSCCSSInserted) {
        this.isMUKTAPSCCSSInserted = isMUKTAPSCCSSInserted;
    }

    public int getTempEdgTraceId() {
        return TempEdgTraceId;
    }

    public void setTempEdgTraceId(int tempEdgTraceId) {
        TempEdgTraceId = tempEdgTraceId;
    }

    public boolean isNMAGIExecuted() {
        return isNMAGIExecuted;
    }

    public void setNMAGIExecuted(boolean isNMAGIExecuted) {
        this.isNMAGIExecuted = isNMAGIExecuted;
    }

    public boolean isToRunAllPrograms() {
        return isToRunAllPrograms;
    }

    public void setToRunAllPrograms(boolean isToRunAllPrograms) {
        this.isToRunAllPrograms = isToRunAllPrograms;
    }

    public Dictionary<Integer, String> getProcessedRNEdgNumbers() {
        return processedRNEdgNumbers;
    }

    public void setProcessedRNEdgNumbers(Dictionary<Integer, String> processedRNEdgNumbers) {
        this.processedRNEdgNumbers = processedRNEdgNumbers;
    }

    public List<Integer> getProcessedRNEdgNumberList() {
        return processedRNEdgNumberList;
    }

    public void setProcessedRNEdgNumberList(List<Integer> processedRNEdgNumberList) {
        this.processedRNEdgNumberList = processedRNEdgNumberList;
    }

    public List<Integer> getMawithLTCProcessedIndividuals() {
        return mawithLTCProcessedIndividuals;
    }

    public void setMawithLTCProcessedIndividuals(List<Integer> mawithLTCProcessedIndividuals) {
        this.mawithLTCProcessedIndividuals = mawithLTCProcessedIndividuals;
    }

    private List<MemberEligDetails> memberEligDetails;

    public List<MemberEligDetails> getMemberEligDetails() {
        if (memberEligDetails == null) {
            memberEligDetails = new ArrayList<MemberEligDetails>();
        }
        return this.memberEligDetails;
    }

    public void setMemberEligDetails(List<MemberEligDetails> memberEligDetails) {
        this.memberEligDetails = memberEligDetails;
    }
}