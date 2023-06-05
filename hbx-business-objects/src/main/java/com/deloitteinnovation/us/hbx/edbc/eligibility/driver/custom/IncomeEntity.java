//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:50 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class IncomeEntity {
    private long IndividualId;

    public long getIndividualId() {
        return IndividualId;
    }

    public void setIndividualId(long value) {
        IndividualId = value;
    }

    private String IncomeType = "";

    public String getIncomeType() {
        return IncomeType;
    }

    public void setIncomeType(String value) {
        IncomeType = value;
    }

    private String IncomeCategory = "";

    public String getIncomeCategory() {
        return IncomeCategory;
    }

    public void setIncomeCategory(String value) {
        IncomeCategory = value;
    }

    private double IncomeAmount;

    public double getIncomeAmount() {
        return IncomeAmount;
    }

    public void setIncomeAmount(double value) {
        IncomeAmount = value;
    }

    private double MAGIBudgetedAmount;

    public double getMAGIBudgetedAmount() {
        return MAGIBudgetedAmount;
    }

    public void setMAGIBudgetedAmount(double value) {
        MAGIBudgetedAmount = value;
    }

    private double NonMagiAdultMABudgetAmount;

    public double getNonMagiAdultMABudgetAmount() {
        return NonMagiAdultMABudgetAmount;
    }

    public void setNonMagiAdultMABudgetAmount(double value) {
        NonMagiAdultMABudgetAmount = value;
    }

    private double NonMagiFamilyMABudgetAmount;

    public double getNonMagiFamilyMABudgetAmount() {
        return NonMagiFamilyMABudgetAmount;
    }

    public void setNonMagiFamilyMABudgetAmount(double value) {
        NonMagiFamilyMABudgetAmount = value;
    }

    private double KTAPBudgetedAmount;

    public double getKTAPBudgetedAmount() {
        return KTAPBudgetedAmount;
    }

    public void setKTAPBudgetedAmount(double value) {
        KTAPBudgetedAmount = value;
    }

    private double SNAPBudgetedAmount;

    public double getSNAPBudgetedAmount() {
        return SNAPBudgetedAmount;
    }

    public void setSNAPBudgetedAmount(double value) {
        SNAPBudgetedAmount = value;
    }

    private Boolean DCIncomeExist;

    public Boolean getDCIncomeExist() {
        return DCIncomeExist;
    }

    public void setDCIncomeExist(Boolean value) {
        DCIncomeExist = value;
    }

    private double SAIndividualIncome;

    public double getSAIndividualIncome() {
        return SAIndividualIncome;
    }

    public void setSAIndividualIncome(double value) {
        SAIndividualIncome = value;
    }

    private double SelfAttestedMAGIBudgetedAmount;

    public double getSelfAttestedMAGIBudgetedAmount() {
        return SelfAttestedMAGIBudgetedAmount;
    }

    public void setSelfAttestedMAGIBudgetedAmount(double value) {
        SelfAttestedMAGIBudgetedAmount = value;
    }

    private double SelfAttestedNonMagiAdultMABudgetAmount;

    public double getSelfAttestedNonMagiAdultMABudgetAmount() {
        return SelfAttestedNonMagiAdultMABudgetAmount;
    }

    public void setSelfAttestedNonMagiAdultMABudgetAmount(double value) {
        SelfAttestedNonMagiAdultMABudgetAmount = value;
    }

    private double SelfAttestedNonMagiFamilyMABudgetAmount;

    public double getSelfAttestedNonMagiFamilyMABudgetAmount() {
        return SelfAttestedNonMagiFamilyMABudgetAmount;
    }

    public void setSelfAttestedNonMagiFamilyMABudgetAmount(double value) {
        SelfAttestedNonMagiFamilyMABudgetAmount = value;
    }

    private double SelfAttestedKTAPBudgetedAmount;

    public double getSelfAttestedKTAPBudgetedAmount() {
        return SelfAttestedKTAPBudgetedAmount;
    }

    public void setSelfAttestedKTAPBudgetedAmount(double value) {
        SelfAttestedKTAPBudgetedAmount = value;
    }

    private double SelfAttestedSNAPBudgetedAmount;

    public double getSelfAttestedSNAPBudgetedAmount() {
        return SelfAttestedSNAPBudgetedAmount;
    }

    public void setSelfAttestedSNAPBudgetedAmount(double value) {
        SelfAttestedSNAPBudgetedAmount = value;
    }

    private Boolean SAIncomeExist;

    public Boolean getSAIncomeExist() {
        return SAIncomeExist;
    }

    public void setSAIncomeExist(Boolean value) {
        SAIncomeExist = value;
    }

    private String IsIncomeExluded = "";

    public String getIsIncomeExluded() {
        return IsIncomeExluded;
    }

    public void setIsIncomeExluded(String value) {
        IsIncomeExluded = value;
    }

    private LocalDateTime SelfEmploymentBeginDate;

    public LocalDateTime getSelfEmploymentBeginDate() {
        return SelfEmploymentBeginDate;
    }

    public void setSelfEmploymentBeginDate(LocalDateTime value) {
        SelfEmploymentBeginDate = value;
    }

    private Boolean IncomeReportedTimely;

    public Boolean getIncomeReportedTimely() {
        return IncomeReportedTimely;
    }

    public void setIncomeReportedTimely(Boolean value) {
        IncomeReportedTimely = value;
    }

    private double EducationExpenseAmount;

    public double getEducationExpenseAmount() {
        return EducationExpenseAmount;
    }

    public void setEducationExpenseAmount(double value) {
        EducationExpenseAmount = value;
    }

    private int IncomeDetailId;

    public int getIncomeDetailId() {
        return IncomeDetailId;
    }

    public void setIncomeDetailId(int value) {
        IncomeDetailId = value;
    }

    private double aptcAnnualAmount;

    public double getaptcAnnualAmount() {
        return aptcAnnualAmount;
    }

    public void setaptcAnnualAmount(double value) {
        aptcAnnualAmount = value;
    }

    private double SelfEmploymentExpenseAmount;

    public double getSelfEmploymentExpenseAmount() {
        return SelfEmploymentExpenseAmount;
    }

    public void setSelfEmploymentExpenseAmount(double value) {
        SelfEmploymentExpenseAmount = value;
    }

    private List<IncomePayDetailEntity> IncomePayDetailEntities = new ArrayList<>();

    public List<IncomePayDetailEntity> getIncomePayDetailEntities() {
        return IncomePayDetailEntities;
    }

    public void setIncomePayDetailEntities(List<IncomePayDetailEntity> value) {
        IncomePayDetailEntities = value;
    }

    private LocalDateTime UpdateDateOn;

    public LocalDateTime getUpdateDateOn() {
        return UpdateDateOn;
    }

    public void setUpdateDateOn(LocalDateTime value) {
        UpdateDateOn = value;
    }

    private Boolean IsIndividualOnStrike;

    public Boolean getIsIndividualOnStrike() {
        return IsIndividualOnStrike;
    }

    public void setIsIndividualOnStrike(Boolean value) {
        IsIndividualOnStrike = value;
    }

    private double MonthlyIncomeBeforeStrike;

    public double getMonthlyIncomeBeforeStrike() {
        return MonthlyIncomeBeforeStrike;
    }

    public void setMonthlyIncomeBeforeStrike(double value) {
        MonthlyIncomeBeforeStrike = value;
    }

    private String SelfEmploymentExpenseReference = "";

    public String getSelfEmploymentExpenseReference() {
        return SelfEmploymentExpenseReference;
    }

    public void setSelfEmploymentExpenseReference(String value) {
        SelfEmploymentExpenseReference = value;
    }

    private LocalDateTime TwoMonthExclusionStartDate;

    public LocalDateTime getTwoMonthExclusionStartDate() {
        return TwoMonthExclusionStartDate;
    }

    public void setTwoMonthExclusionStartDate(LocalDateTime value) {
        TwoMonthExclusionStartDate = value;
    }

    private String IsIndividualActivelyInvolved = "";

    public String getIsIndividualActivelyInvolved() {
        return IsIndividualActivelyInvolved;
    }

    public void setIsIndividualActivelyInvolved(String value) {
        IsIndividualActivelyInvolved = value;
    }

    private double AverageHoursSpentPerWeek;

    public double getAverageHoursSpentPerWeek() {
        return AverageHoursSpentPerWeek;
    }

    public void setAverageHoursSpentPerWeek(double value) {
        AverageHoursSpentPerWeek = value;
    }

    private boolean IsToExcludeOnceAQuarter;

    public boolean getIsToExcludeOnceAQuarter() {
        return IsToExcludeOnceAQuarter;
    }

    public void setIsToExcludeOnceAQuarter(boolean value) {
        IsToExcludeOnceAQuarter = value;
    }

    private boolean IsLastVerifiedAmount;

    public boolean getIsLastVerifiedAmount() {
        return IsLastVerifiedAmount;
    }

    public void setIsLastVerifiedAmount(boolean value) {
        IsLastVerifiedAmount = value;
    }

    private int IncomeBudgetId;

    public int getIncomeBudgetId() {
        return IncomeBudgetId;
    }

    public void setIncomeBudgetId(int value) {
        IncomeBudgetId = value;
    }

    private boolean IsRFIToBeGenerated;

    public boolean getIsRFIToBeGenerated() {
        return IsRFIToBeGenerated;
    }

    public void setIsRFIToBeGenerated(boolean value) {
        IsRFIToBeGenerated = value;
    }

    private boolean HasQITEstablished;

    public boolean getHasQITEstablished() {
        return HasQITEstablished;
    }

    public void setHasQITEstablished(boolean value) {
        HasQITEstablished = value;
    }

    private String IsMeetingQITCriteria = "";

    public String getIsMeetingQITCriteria() {
        return IsMeetingQITCriteria;
    }

    public void setIsMeetingQITCriteria(String value) {
        IsMeetingQITCriteria = value;
    }

    private boolean IsValidDocument;

    public boolean getIsValidDocument() {
        return IsValidDocument;
    }

    public void setIsValidDocument(boolean value) {
        IsValidDocument = value;
    }

    private String IsTimely = "";

    public String getIsTimely() {
        return IsTimely;
    }

    public void setIsTimely(String value) {
        IsTimely = value;
    }

    private LocalDateTime VerifiedOnDate;

    public LocalDateTime getVerifiedOnDate() {
        return VerifiedOnDate;
    }

    public void setVerifiedOnDate(LocalDateTime value) {
        VerifiedOnDate = value;
    }

    private LocalDateTime DateClientReported;

    public LocalDateTime getDateClientReported() {
        return DateClientReported;
    }

    public void setDateClientReported(LocalDateTime value) {
        DateClientReported = value;
    }

    // Added by shashank Defect#205612
    private double CcBudgetedAmount;

    public double getCcBudgetedAmount() {
        return CcBudgetedAmount;
    }

    public void setCcBudgetedAmount(double value) {
        CcBudgetedAmount = value;
    }

    private double SelfAttestedCcBudgetedAmount;

    public double getSelfAttestedCcBudgetedAmount() {
        return SelfAttestedCcBudgetedAmount;
    }

    public void setSelfAttestedCcBudgetedAmount(double value) {
        SelfAttestedCcBudgetedAmount = value;
    }

    // Added for Defect#209810
    private LocalDateTime SelfEmploymentEndDate;

    public LocalDateTime getSelfEmploymentEndDate() {
        return SelfEmploymentEndDate;
    }

    public void setSelfEmploymentEndDate(LocalDateTime value) {
        SelfEmploymentEndDate = value;
    }

    private boolean IsToConsiderCDOIncome;

    public boolean getIsToConsiderCDOIncome() {
        return IsToConsiderCDOIncome;
    }

    public void setIsToConsiderCDOIncome(boolean value) {
        IsToConsiderCDOIncome = value;
    }

    private String SNAPExclusionReasonCode = "";

    public String getSNAPExclusionReasonCode() {
        return SNAPExclusionReasonCode;
    }

    public void setSNAPExclusionReasonCode(String value) {
        SNAPExclusionReasonCode = value;
    }

    private String SNAPExclusionVerificationCode = "";

    public String getSNAPExclusionVerificationCode() {
        return SNAPExclusionVerificationCode;
    }

    public void setSNAPExclusionVerificationCode(String value) {
        SNAPExclusionVerificationCode = value;
    }

    private double SNAPExclusionAmount;

    public double getSNAPExclusionAmount() {
        return SNAPExclusionAmount;
    }

    public void setSNAPExclusionAmount(double value) {
        SNAPExclusionAmount = value;
    }

    private boolean IsToExcludeIncome;

    public boolean getIsToExcludeIncome() {
        return IsToExcludeIncome;
    }

    public void setIsToExcludeIncome(boolean value) {
        IsToExcludeIncome = value;
    }

    // Added for CR 1125
    private LocalDateTime DivorceAgreementDate;

    public LocalDateTime getDivorceAgreementDate() {
        return DivorceAgreementDate;
    }

    public void setDivorceAgreementDate(LocalDateTime value) {
        DivorceAgreementDate = value;
    }

    // Added for CR 1053
    private double HoursEmployed;

    public double getHoursEmployed() {
        return HoursEmployed;
    }

    public void setHoursEmployed(double value) {
        HoursEmployed = value;
    }

    private double HoursPerMinimumWage;

    public double getHoursPerMinimumWage() {
        return HoursPerMinimumWage;
    }

    public void setHoursPerMinimumWage(double value) {
        HoursPerMinimumWage = value;
    }

    // CR 1053
    private boolean LostIncomeConsidered;

    public boolean getLostIncomeConsidered() {
        return LostIncomeConsidered;
    }

    public void setLostIncomeConsidered(boolean value) {
        LostIncomeConsidered = value;
    }

    // Added as part of defect #362547 = PAUI
    private boolean IsToExemptIncome;

    public boolean getIsToExemptIncome() {
        return IsToExemptIncome;
    }

    public void setIsToExemptIncome(boolean value) {
        IsToExemptIncome = value;
    }

}
