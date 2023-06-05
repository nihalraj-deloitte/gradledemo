package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.APTCIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DCIndividualAlienSponsorIncomeAndResourceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.DSNAPIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EarnedIncomeStrikeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EducationalExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmploymentBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmploymentDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.EmploymentDetailPayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IncomeEmploymentInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IncomePayDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.NoIncomeVerificationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OtherEarnedIncomeBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OtherEarnedIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.OtherEarnedIncomePayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PPIncomeBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PPIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.QualifiedIncomeTrustModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentDetailPayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentJointOwnersBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SelfEmploymentPayExpenseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UNPAIDEMPLOYMENTModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomeBudgetModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomeChildSupportIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomeDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.UnearnedIncomePayAssociationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyCurrentIncomeModel;

import java.util.ArrayList;
import java.util.List;

public class IncomeDataStore {
    private List<String> AvailableIncomes = new ArrayList<String>();

    public List<String> getAvailableIncomes() {
        return AvailableIncomes;
    }

    public void setAvailableIncomes(List<String> value) {
        AvailableIncomes = value;
    }

    private List<DCIndividualAlienSponsorIncomeAndResourceModel> DCIndividualAlienSponsorIncomeAndResourceModels = new ArrayList<>();

    public List<DCIndividualAlienSponsorIncomeAndResourceModel> getDCIndividualAlienSponsorIncomeAndResourceModels() {
        return DCIndividualAlienSponsorIncomeAndResourceModels;
    }

    public void setDCIndividualAlienSponsorIncomeAndResourceModels(List<DCIndividualAlienSponsorIncomeAndResourceModel> value) {
        DCIndividualAlienSponsorIncomeAndResourceModels = value;
    }

    private List<DSNAPIncomeModel> DSNAPIncomeModels = new ArrayList<>();

    public List<DSNAPIncomeModel> getDSNAPIncomeModels() {
        return DSNAPIncomeModels;
    }

    public void setDSNAPIncomeModels(List<DSNAPIncomeModel> value) {
        DSNAPIncomeModels = value;
    }

    private List<EmploymentBudgetModel> EmploymentBudgetModels = new ArrayList<>();

    public List<EmploymentBudgetModel> getEmploymentBudgetModels() {
        return EmploymentBudgetModels;
    }

    public void setEmploymentBudgetModels(List<EmploymentBudgetModel> value) {
        EmploymentBudgetModels = value;
    }

    private List<EmploymentDetailModel> EmploymentDetailModels = new ArrayList<>();

    public List<EmploymentDetailModel> getEmploymentDetailModels() {
        return EmploymentDetailModels;
    }

    public void setEmploymentDetailModels(List<EmploymentDetailModel> value) {
        EmploymentDetailModels = value;
    }

    private List<EmploymentDetailPayAssociationModel> EmploymentDetailPayAssociationModels = new ArrayList<>();

    public List<EmploymentDetailPayAssociationModel> getEmploymentDetailPayAssociationModels() {
        return EmploymentDetailPayAssociationModels;
    }

    public void setEmploymentDetailPayAssociationModels(List<EmploymentDetailPayAssociationModel> value) {
        EmploymentDetailPayAssociationModels = value;
    }

    private List<IncomeEmploymentInformationModel> IncomeEmploymentInformationModels = new ArrayList<>();

    public List<IncomeEmploymentInformationModel> getIncomeEmploymentInformationModels() {
        return IncomeEmploymentInformationModels;
    }

    public void setIncomeEmploymentInformationModels(List<IncomeEmploymentInformationModel> value) {
        IncomeEmploymentInformationModels = value;
    }

    private List<IncomePayDetailModel> IncomePayDetailModels = new ArrayList<>();

    public List<IncomePayDetailModel> getIncomePayDetailModels() {
        return IncomePayDetailModels;
    }

    public void setIncomePayDetailModels(List<IncomePayDetailModel> value) {
        IncomePayDetailModels = value;
    }

    private List<NoIncomeVerificationModel> NoIncomeVerificationModels = new ArrayList<>();

    public List<NoIncomeVerificationModel> getNoIncomeVerificationModels() {
        return NoIncomeVerificationModels;
    }

    public void setNoIncomeVerificationModels(List<NoIncomeVerificationModel> value) {
        NoIncomeVerificationModels = value;
    }

    private List<OtherEarnedIncomeBudgetModel> OtherEarnedIncomeBudgetModels = new ArrayList<>();

    public List<OtherEarnedIncomeBudgetModel> getOtherEarnedIncomeBudgetModels() {
        return OtherEarnedIncomeBudgetModels;
    }

    public void setOtherEarnedIncomeBudgetModels(List<OtherEarnedIncomeBudgetModel> value) {
        OtherEarnedIncomeBudgetModels = value;
    }

    private List<OtherEarnedIncomeDetailModel> OtherEarnedIncomeDetailModels = new ArrayList<>();

    public List<OtherEarnedIncomeDetailModel> getOtherEarnedIncomeDetailModels() {
        return OtherEarnedIncomeDetailModels;
    }

    public void setOtherEarnedIncomeDetailModels(List<OtherEarnedIncomeDetailModel> value) {
        OtherEarnedIncomeDetailModels = value;
    }

    private List<OtherEarnedIncomePayAssociationModel> OtherEarnedIncomePayAssociationModels = new ArrayList<>();

    public List<OtherEarnedIncomePayAssociationModel> getOtherEarnedIncomePayAssociationModels() {
        return OtherEarnedIncomePayAssociationModels;
    }

    public void setOtherEarnedIncomePayAssociationModels(List<OtherEarnedIncomePayAssociationModel> value) {
        OtherEarnedIncomePayAssociationModels = value;
    }

    private List<QualifiedIncomeTrustModel> QualifiedIncomeTrustModels = new ArrayList<>();

    public List<QualifiedIncomeTrustModel> getQualifiedIncomeTrustModels() {
        return QualifiedIncomeTrustModels;
    }

    public void setQualifiedIncomeTrustModels(List<QualifiedIncomeTrustModel> value) {
        QualifiedIncomeTrustModels = value;
    }

    private List<SelfEmploymentDetailPayAssociationModel> SelfEmploymentDetailPayAssociationModels = new ArrayList<>();

    public List<SelfEmploymentDetailPayAssociationModel> getSelfEmploymentDetailPayAssociationModels() {
        return SelfEmploymentDetailPayAssociationModels;
    }

    public void setSelfEmploymentDetailPayAssociationModels(List<SelfEmploymentDetailPayAssociationModel> value) {
        SelfEmploymentDetailPayAssociationModels = value;
    }


    private List<SelfEmploymentIncomeDetailModel> SelfEmploymentIncomeDetailModels = new ArrayList<>();

    public List<SelfEmploymentIncomeDetailModel> getSelfEmploymentIncomeDetailModels() {
        return SelfEmploymentIncomeDetailModels;
    }

    public void setSelfEmploymentIncomeDetailModels(List<SelfEmploymentIncomeDetailModel> value) {
        SelfEmploymentIncomeDetailModels = value;
    }

    private List<SelfEmploymentJointOwnersBudgetModel> SelfEmploymentJointOwnersBudgetModels = new ArrayList<>();

    public List<SelfEmploymentJointOwnersBudgetModel> getSelfEmploymentJointOwnersBudgetModels() {
        return SelfEmploymentJointOwnersBudgetModels;
    }

    public void setSelfEmploymentJointOwnersBudgetModels(List<SelfEmploymentJointOwnersBudgetModel> value) {
        SelfEmploymentJointOwnersBudgetModels = value;
    }

    private List<UnearnedIncomeBudgetModel> UnearnedIncomeBudgetModels = new ArrayList<>();

    public List<UnearnedIncomeBudgetModel> getUnearnedIncomeBudgetModels() {
        return UnearnedIncomeBudgetModels;
    }

    public void setUnearnedIncomeBudgetModels(List<UnearnedIncomeBudgetModel> value) {
        UnearnedIncomeBudgetModels = value;
    }

    private List<UnearnedIncomeDetailModel> UnearnedIncomeDetailModels = new ArrayList<>();

    public List<UnearnedIncomeDetailModel> getUnearnedIncomeDetailModels() {
        return UnearnedIncomeDetailModels;
    }

    public void setUnearnedIncomeDetailModels(List<UnearnedIncomeDetailModel> value) {
        UnearnedIncomeDetailModels = value;
    }

    private List<UnearnedIncomePayAssociationModel> UnearnedIncomePayAssociationModels = new ArrayList<>();

    public List<UnearnedIncomePayAssociationModel> getUnearnedIncomePayAssociationModels() {
        return UnearnedIncomePayAssociationModels;
    }

    public void setUnearnedIncomePayAssociationModels(List<UnearnedIncomePayAssociationModel> value) {
        UnearnedIncomePayAssociationModels = value;
    }

    private List<VerifyCurrentIncomeModel> VerifyCurrentIncomeModels = new ArrayList<>();

    public List<VerifyCurrentIncomeModel> getVerifyCurrentIncomeModels() {
        return VerifyCurrentIncomeModels;
    }

    public void setVerifyCurrentIncomeModels(List<VerifyCurrentIncomeModel> value) {
        VerifyCurrentIncomeModels = value;
    }

    private List<APTCIncomeDetailModel> APTCIncomeDetailModels = new ArrayList<>();

    public List<APTCIncomeDetailModel> getAPTCIncomeDetailModels() {
        return APTCIncomeDetailModels;
    }

    public void setAPTCIncomeDetailModels(List<APTCIncomeDetailModel> value) {
        APTCIncomeDetailModels = value;
    }

    private List<EducationalExpenseModel> EducationalExpenseModels = new ArrayList<>();

    public List<EducationalExpenseModel> getEducationalExpenseModels() {
        return EducationalExpenseModels;
    }

    public void setEducationalExpenseModels(List<EducationalExpenseModel> value) {
        EducationalExpenseModels = value;
    }

    private List<EarnedIncomeStrikeDetailModel> EarnedIncomeStrikeDetailModels = new ArrayList<>();

    public List<EarnedIncomeStrikeDetailModel> getEarnedIncomeStrikeDetailModels() {
        return EarnedIncomeStrikeDetailModels;
    }

    public void setEarnedIncomeStrikeDetailModels(List<EarnedIncomeStrikeDetailModel> value) {
        EarnedIncomeStrikeDetailModels = value;
    }

    private List<SelfEmploymentPayExpenseModel> SelfEmploymentPayExpenseModels = new ArrayList<>();

    public List<SelfEmploymentPayExpenseModel> getSelfEmploymentPayExpenseModels() {
        return SelfEmploymentPayExpenseModels;
    }

    public void setSelfEmploymentPayExpenseModels(List<SelfEmploymentPayExpenseModel> value) {
        SelfEmploymentPayExpenseModels = value;
    }

    private List<UNPAIDEMPLOYMENTModel> UnEmploymentBudgetModels = new ArrayList<>();

    public List<UNPAIDEMPLOYMENTModel> getUnEmploymentBudgetModels() {
        return UnEmploymentBudgetModels;
    }

    public void setUnEmploymentBudgetModels(List<UNPAIDEMPLOYMENTModel> value) {
        UnEmploymentBudgetModels = value;
    }

    private List<PPIncomeDetailModel> PPIncomeDetailModels = new ArrayList<>();

    public List<PPIncomeDetailModel> getPPIncomeDetailModels() {
        return PPIncomeDetailModels;
    }

    public void setPPIncomeDetailModels(List<PPIncomeDetailModel> value) {
        PPIncomeDetailModels = value;
    }

    private List<UnearnedIncomeChildSupportIndividualModel> UnearnedIncomeChildSupportIndividualModels = new ArrayList<>();

    public List<UnearnedIncomeChildSupportIndividualModel> getUnearnedIncomeChildSupportIndividualModels() {
        return UnearnedIncomeChildSupportIndividualModels;
    }

    public void setUnearnedIncomeChildSupportIndividualModels(List<UnearnedIncomeChildSupportIndividualModel> value) {
        UnearnedIncomeChildSupportIndividualModels = value;
    }

    private List<PPIncomeBudgetModel> PPIncomeBudgetModels = new ArrayList<>();

    public List<PPIncomeBudgetModel> getPPIncomeBudgetModels() {
        return PPIncomeBudgetModels;
    }

    public void setPPIncomeBudgetModels(List<PPIncomeBudgetModel> value) {
        PPIncomeBudgetModels = value;
    }

}

