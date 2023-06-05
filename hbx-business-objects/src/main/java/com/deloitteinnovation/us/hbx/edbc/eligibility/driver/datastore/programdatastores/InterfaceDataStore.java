//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:51 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.programdatastores;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.FailedFederalInterfaceModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IRSResponseMetadataModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.IRSResponseVeificationDetailModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.InterfaceTechnicalFailureModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.PayPeriodInformationModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.StateUnemploymentBenefitModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.SwicaWagesIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifiedSsaCompositeIndividualResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyAnnualHouseholdIncomeIndividualModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyAnnualHouseholdIncomeModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyAnnualHouseholdIndividualIncomeResponseModel;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.model.VerifyCurrentIncomeModel;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDataStore {
    private List<VerifiedSsaCompositeIndividualResponseModel> verfSsaCompIndvResponseModels = new ArrayList<>();

    public List<VerifiedSsaCompositeIndividualResponseModel> getverfSsaCompIndvResponseModels() {
        return verfSsaCompIndvResponseModels;
    }

    public void setverfSsaCompIndvResponseModels(List<VerifiedSsaCompositeIndividualResponseModel> value) {
        verfSsaCompIndvResponseModels = value;
    }

    private List<VerifyAnnualHouseholdIndividualIncomeResponseModel> vrfAnnualHHIndvIncomeResponseModels = new ArrayList<>();

    public List<VerifyAnnualHouseholdIndividualIncomeResponseModel> getvrfAnnualHHIndvIncomeResponseModels() {
        return vrfAnnualHHIndvIncomeResponseModels;
    }

    public void setvrfAnnualHHIndvIncomeResponseModels(List<VerifyAnnualHouseholdIndividualIncomeResponseModel> value) {
        vrfAnnualHHIndvIncomeResponseModels = value;
    }

    private List<SwicaWagesIncomeModel> swicaWagesIncomeModels = new ArrayList<>();

    public List<SwicaWagesIncomeModel> getswicaWagesIncomeModels() {
        return swicaWagesIncomeModels;
    }

    public void setswicaWagesIncomeModels(List<SwicaWagesIncomeModel> value) {
        swicaWagesIncomeModels = value;
    }

    private List<IRSResponseVeificationDetailModel> irsResponseVerificationDetailModels = new ArrayList<>();

    public List<IRSResponseVeificationDetailModel> getirsResponseVerificationDetailModels() {
        return irsResponseVerificationDetailModels;
    }

    public void setirsResponseVerificationDetailModels(List<IRSResponseVeificationDetailModel> value) {
        irsResponseVerificationDetailModels = value;
    }

    private List<IRSResponseMetadataModel> irsResponseMetedataModels = new ArrayList<>();

    public List<IRSResponseMetadataModel> getirsResponseMetedataModels() {
        return irsResponseMetedataModels;
    }

    public void setirsResponseMetedataModels(List<IRSResponseMetadataModel> value) {
        irsResponseMetedataModels = value;
    }

    private List<StateUnemploymentBenefitModel> stateUnemploymentBenefitModels = new ArrayList<>();

    public List<StateUnemploymentBenefitModel> getstateUnemploymentBenefitModels() {
        return stateUnemploymentBenefitModels;
    }

    public void setstateUnemploymentBenefitModels(List<StateUnemploymentBenefitModel> value) {
        stateUnemploymentBenefitModels = value;
    }

    private List<VerifyAnnualHouseholdIncomeModel> verifyAnnualHouseholdIncomeModels = new ArrayList<>();

    public List<VerifyAnnualHouseholdIncomeModel> getverifyAnnualHouseholdIncomeModels() {
        return verifyAnnualHouseholdIncomeModels;
    }

    public void setverifyAnnualHouseholdIncomeModels(List<VerifyAnnualHouseholdIncomeModel> value) {
        verifyAnnualHouseholdIncomeModels = value;
    }

    private List<VerifyAnnualHouseholdIncomeIndividualModel> verifyAnnualHouseholdIncomeIndividualModels = new ArrayList<>();

    public List<VerifyAnnualHouseholdIncomeIndividualModel> getverifyAnnualHouseholdIncomeIndividualModels() {
        return verifyAnnualHouseholdIncomeIndividualModels;
    }

    public void setverifyAnnualHouseholdIncomeIndividualModels(List<VerifyAnnualHouseholdIncomeIndividualModel> value) {
        verifyAnnualHouseholdIncomeIndividualModels = value;
    }

    private List<VerifyCurrentIncomeModel> verifyCurrentIncomeModels = new ArrayList<>();

    public List<VerifyCurrentIncomeModel> getverifyCurrentIncomeModels() {
        return verifyCurrentIncomeModels;
    }

    public void setverifyCurrentIncomeModels(List<VerifyCurrentIncomeModel> value) {
        verifyCurrentIncomeModels = value;
    }

    private List<PayPeriodInformationModel> PayPeriodInformationModels = new ArrayList<>();

    public List<PayPeriodInformationModel> getPayPeriodInformationModels() {
        return PayPeriodInformationModels;
    }

    public void setPayPeriodInformationModels(List<PayPeriodInformationModel> value) {
        PayPeriodInformationModels = value;
    }

    // SP CR -126 -Start
    private List<InterfaceTechnicalFailureModel> InterfaceTechnicalFailureModels = new ArrayList<>();

    public List<InterfaceTechnicalFailureModel> getInterfaceTechnicalFailureModels() {
        return InterfaceTechnicalFailureModels;
    }

    public void setInterfaceTechnicalFailureModels(List<InterfaceTechnicalFailureModel> value) {
        InterfaceTechnicalFailureModels = value;
    }

    private List<FailedFederalInterfaceModel> FailedFederalInterfaceModels = new ArrayList<>();

    public List<FailedFederalInterfaceModel> getFailedFederalInterfaceModels() {
        return FailedFederalInterfaceModels;
    }

    public void setFailedFederalInterfaceModels(List<FailedFederalInterfaceModel> value) {
        FailedFederalInterfaceModels = value;
    }

}