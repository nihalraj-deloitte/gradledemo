//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:49 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.time.LocalDateTime;

public class ExpenseEntity {
    private int ExpenseId;

    public int getExpenseId() {
        return ExpenseId;
    }

    public void setExpenseId(int value) {
        ExpenseId = value;
    }

    private String CategoryOfExpense = "";

    public String getCategoryOfExpense() {
        return CategoryOfExpense;
    }

    public void setCategoryOfExpense(String value) {
        CategoryOfExpense = value;
    }

    private double CountableExpenseAmount;

    public double getCountableExpenseAmount() {
        return CountableExpenseAmount;
    }

    public void setCountableExpenseAmount(double value) {
        CountableExpenseAmount = value;
    }

    private double CourtOrderedAmount;

    public double getCourtOrderedAmount() {
        return CourtOrderedAmount;
    }

    public void setCourtOrderedAmount(double value) {
        CourtOrderedAmount = value;
    }

    private String DependentCareExpenseCode = "";

    public String getDependentCareExpenseCode() {
        return DependentCareExpenseCode;
    }

    public void setDependentCareExpenseCode(String value) {
        DependentCareExpenseCode = value;
    }

    private Boolean IsDependentCareProviderInHousehold;

    public Boolean getIsDependentCareProviderInHousehold() {
        return IsDependentCareProviderInHousehold;
    }

    public void setIsDependentCareProviderInHousehold(Boolean value) {
        IsDependentCareProviderInHousehold = value;
    }

    private Boolean MedicalExpenseAppliesToSNAP;

    public Boolean getMedicalExpenseAppliesToSNAP() {
        return MedicalExpenseAppliesToSNAP;
    }

    public void setMedicalExpenseAppliesToSNAP(Boolean value) {
        MedicalExpenseAppliesToSNAP = value;
    }

    private Boolean MedicalExpenseAppliesToMA;

    public Boolean getMedicalExpenseAppliesToMA() {
        return MedicalExpenseAppliesToMA;
    }

    public void setMedicalExpenseAppliesToMA(Boolean value) {
        MedicalExpenseAppliesToMA = value;
    }

    private String ExclusionReason = "";

    public String getExclusionReason() {
        return ExclusionReason;
    }

    public void setExclusionReason(String value) {
        ExclusionReason = value;
    }

    private double ExpenseAmount;

    public double getExpenseAmount() {
        return ExpenseAmount;
    }

    public void setExpenseAmount(double value) {
        ExpenseAmount = value;
    }

    private double ExpenseExistingBalanceAmount;

    public double getExpenseExistingBalanceAmount() {
        return ExpenseExistingBalanceAmount;
    }

    public void setExpenseExistingBalanceAmount(double value) {
        ExpenseExistingBalanceAmount = value;
    }

    private Boolean HouseholdIntendsToReturn;

    public Boolean getHouseholdIntendsToReturn() {
        return HouseholdIntendsToReturn;
    }

    public void setHouseholdIntendsToReturn(Boolean value) {
        HouseholdIntendsToReturn = value;
    }

    private Boolean HouseholdOptedForOneMonthDeduction;

    public Boolean getHouseholdOptedForOneMonthDeduction() {
        return HouseholdOptedForOneMonthDeduction;
    }

    public void setHouseholdOptedForOneMonthDeduction(Boolean value) {
        HouseholdOptedForOneMonthDeduction = value;
    }

    private Boolean IndividualHasValidReason;

    public Boolean getIndividualHasValidReason() {
        return IndividualHasValidReason;
    }

    public void setIndividualHasValidReason(Boolean value) {
        IndividualHasValidReason = value;
    }

    private Boolean IsAllowable;

    public Boolean getIsAllowable() {
        return IsAllowable;
    }

    public void setIsAllowable(Boolean value) {
        IsAllowable = value;
    }

    private Boolean IsIncurredForDisabledOrDeceasedIndividual;

    public Boolean getIsIncurredForDisabledOrDeceasedIndividual() {
        return IsIncurredForDisabledOrDeceasedIndividual;
    }

    public void setIsIncurredForDisabledOrDeceasedIndividual(Boolean value) {
        IsIncurredForDisabledOrDeceasedIndividual = value;
    }

    private Boolean IsOneTimeExpense;

    public Boolean getIsOneTimeExpense() {
        return IsOneTimeExpense;
    }

    public void setIsOneTimeExpense(Boolean value) {
        IsOneTimeExpense = value;
    }

    private Boolean IsOrderedByCourt;

    public Boolean getIsOrderedByCourt() {
        return IsOrderedByCourt;
    }

    public void setIsOrderedByCourt(Boolean value) {
        IsOrderedByCourt = value;
    }

    private Boolean IsProcessed;

    public Boolean getIsProcessed() {
        return IsProcessed;
    }

    public void setIsProcessed(Boolean value) {
        IsProcessed = value;
    }

    private Boolean IsUnoccupiedShelterRented;

    public Boolean getIsUnoccupiedShelterRented() {
        return IsUnoccupiedShelterRented;
    }

    public void setIsUnoccupiedShelterRented(Boolean value) {
        IsUnoccupiedShelterRented = value;
    }

    private Boolean IsVerified;

    public Boolean getIsVerified() {
        return IsVerified;
    }

    public void setIsVerified(Boolean value) {
        IsVerified = value;
    }

    private Boolean IsShelterUnoccupied;

    public Boolean getIsShelterUnoccupied() {
        return IsShelterUnoccupied;
    }

    public void setIsShelterUnoccupied(Boolean value) {
        IsShelterUnoccupied = value;
    }

    private LocalDateTime LastMonthAllowedDate;

    public LocalDateTime getLastMonthAllowedDate() {
        return LastMonthAllowedDate;
    }

    public void setLastMonthAllowedDate(LocalDateTime value) {
        LastMonthAllowedDate = value;
    }

    private Boolean OccupiedClaimShelterCost;

    public Boolean getOccupiedClaimShelterCost() {
        return OccupiedClaimShelterCost;
    }

    public void setOccupiedClaimShelterCost(Boolean value) {
        OccupiedClaimShelterCost = value;
    }

    private Boolean IntendsToPayCourOrdered;

    public Boolean getIntendsToPayCourOrdered() {
        return IntendsToPayCourOrdered;
    }

    public void setIntendsToPayCourOrdered(Boolean value) {
        IntendsToPayCourOrdered = value;
    }

    private Boolean IsPaidForIndividualHousehold;

    public Boolean getIsPaidForIndividualHousehold() {
        return IsPaidForIndividualHousehold;
    }

    public void setIsPaidForIndividualHousehold(Boolean value) {
        IsPaidForIndividualHousehold = value;
    }

    private Boolean IsPaidToIndividualHousehold;

    public Boolean getIsPaidToIndividualHousehold() {
        return IsPaidToIndividualHousehold;
    }

    public void setIsPaidToIndividualHousehold(Boolean value) {
        IsPaidToIndividualHousehold = value;
    }

    private Boolean IsReimbursible;

    public Boolean getIsReimbursible() {
        return IsReimbursible;
    }

    public void setIsReimbursible(Boolean value) {
        IsReimbursible = value;
    }

    private Long PaidByIndividualId;

    public Long getPaidByIndividualId() {
        return PaidByIndividualId;
    }

    public void setPaidByIndividualId(Long value) {
        PaidByIndividualId = value;
    }

    private Long NonHouseholdMemberPayIndividualId;

    public Long getNonHouseholdMemberPayIndividualId() {
        return NonHouseholdMemberPayIndividualId;
    }

    public void setNonHouseholdMemberPayIndividualId(Long value) {
        NonHouseholdMemberPayIndividualId = value;
    }

    private String AssistanceReceivedAgencyProgramCode = "";

    public String getAssistanceReceivedAgencyProgramCode() {
        return AssistanceReceivedAgencyProgramCode;
    }

    public void setAssistanceReceivedAgencyProgramCode(String value) {
        AssistanceReceivedAgencyProgramCode = value;
    }

    private Boolean hasReceivedAssistanceFromHUDOrSection8;

    public Boolean gethasReceivedAssistanceFromHUDOrSection8() {
        return hasReceivedAssistanceFromHUDOrSection8;
    }

    public void sethasReceivedAssistanceFromHUDOrSection8(Boolean value) {
        hasReceivedAssistanceFromHUDOrSection8 = value;
    }

    private String OtherAgency = "";

    public String getOtherAgency() {
        return OtherAgency;
    }

    public void setOtherAgency(String value) {
        OtherAgency = value;
    }

    private LocalDateTime ExpenseStartDate;

    public LocalDateTime getExpenseStartDate() {
        return ExpenseStartDate;
    }

    public void setExpenseStartDate(LocalDateTime value) {
        ExpenseStartDate = value;
    }

    private LocalDateTime ExpenseEndDate;

    public LocalDateTime getExpenseEndDate() {
        return ExpenseEndDate;
    }

    public void setExpenseEndDate(LocalDateTime value) {
        ExpenseEndDate = value;
    }

    private Long PaidForIndividualId;

    public Long getPaidForIndividualId() {
        return PaidForIndividualId;
    }

    public void setPaidForIndividualId(Long value) {
        PaidForIndividualId = value;
    }

    private Long PaidToIndividualId;

    public Long getPaidToIndividualId() {
        return PaidToIndividualId;
    }

    public void setPaidToIndividualId(Long value) {
        PaidToIndividualId = value;
    }

    private LocalDateTime ReportedDate;

    public LocalDateTime getReportedDate() {
        return ReportedDate;
    }

    public void setReportedDate(LocalDateTime value) {
        ReportedDate = value;
    }

    private LocalDateTime ReportedMonthAdverseActionDate;

    public LocalDateTime getReportedMonthAdverseActionDate() {
        return ReportedMonthAdverseActionDate;
    }

    public void setReportedMonthAdverseActionDate(LocalDateTime value) {
        ReportedMonthAdverseActionDate = value;
    }

    private String TypeOfExpense = "";

    public String getTypeOfExpense() {
        return TypeOfExpense;
    }

    public void setTypeOfExpense(String value) {
        TypeOfExpense = value;
    }

    private String UnoccupiedReason = "";

    public String getUnoccupiedReason() {
        return UnoccupiedReason;
    }

    public void setUnoccupiedReason(String value) {
        UnoccupiedReason = value;
    }

    private double alimonyExpense;

    public double getalimonyExpense() {
        return alimonyExpense;
    }

    public void setalimonyExpense(double value) {
        alimonyExpense = value;
    }

    private double studentLoanExpense;

    public double getstudentLoanExpense() {
        return studentLoanExpense;
    }

    public void setstudentLoanExpense(double value) {
        studentLoanExpense = value;
    }

    private double selfEmploymentExpense;

    public double getselfEmploymentExpense() {
        return selfEmploymentExpense;
    }

    public void setselfEmploymentExpense(double value) {
        selfEmploymentExpense = value;
    }

    private double educatorsExpense;

    public double geteducatorsExpense() {
        return educatorsExpense;
    }

    public void seteducatorsExpense(double value) {
        educatorsExpense = value;
    }

    private double studentTuitionFees;

    public double getstudentTuitionFees() {
        return studentTuitionFees;
    }

    public void setstudentTuitionFees(double value) {
        studentTuitionFees = value;
    }

    private String FrequencyCode = "";

    public String getFrequencyCode() {
        return FrequencyCode;
    }

    public void setFrequencyCode(String value) {
        FrequencyCode = value;
    }

    private double AmountPerFrequency;

    public double getAmountPerFrequency() {
        return AmountPerFrequency;
    }

    public void setAmountPerFrequency(double value) {
        AmountPerFrequency = value;
    }

    private Boolean IsShelterRentedDuringAbsence;

    public Boolean getIsShelterRentedDuringAbsence() {
        return IsShelterRentedDuringAbsence;
    }

    public void setIsShelterRentedDuringAbsence(Boolean value) {
        IsShelterRentedDuringAbsence = value;
    }

    private int AgeOfDependentChild;

    public int getAgeOfDependentChild() {
        return AgeOfDependentChild;
    }

    public void setAgeOfDependentChild(int value) {
        AgeOfDependentChild = value;
    }

    private boolean IsLastVerifiedAmount;

    public boolean getIsLastVerifiedAmount() {
        return IsLastVerifiedAmount;
    }

    public void setIsLastVerifiedAmount(boolean value) {
        IsLastVerifiedAmount = value;
    }

    private int ExpenseBudgetId;

    public int getExpenseBudgetId() {
        return ExpenseBudgetId;
    }

    public void setExpenseBudgetId(int value) {
        ExpenseBudgetId = value;
    }

    private boolean IsRFIToBeGenerated;

    public boolean getIsRFIToBeGenerated() {
        return IsRFIToBeGenerated;
    }

    public void setIsRFIToBeGenerated(boolean value) {
        IsRFIToBeGenerated = value;
    }

    private boolean IsUtilityExpenseToBeConsidered;

    public boolean getIsUtilityExpenseToBeConsidered() {
        return IsUtilityExpenseToBeConsidered;
    }

    public void setIsUtilityExpenseToBeConsidered(boolean value) {
        IsUtilityExpenseToBeConsidered = value;
    }

    private LocalDateTime UpdateDateOn;

    public LocalDateTime getUpdateDateOn() {
        return UpdateDateOn;
    }

    public void setUpdateDateOn(LocalDateTime value) {
        UpdateDateOn = value;
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

    // Added for CR 1125
    private LocalDateTime DivorceAgreementDate;

    public LocalDateTime getDivorceAgreementDate() {
        return DivorceAgreementDate;
    }

    public void setDivorceAgreementDate(LocalDateTime value) {
        DivorceAgreementDate = value;
    }

}
