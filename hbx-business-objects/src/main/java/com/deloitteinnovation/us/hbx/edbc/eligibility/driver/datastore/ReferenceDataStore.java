package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTable;

import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ReferenceDataStore {

    private ReferenceTable CARETAKERSERVICE = new ReferenceTable();

    public ReferenceTable getCARETAKERSERVICE() {
        return CARETAKERSERVICE;
    }

    public void setCARETAKERSERVICE(ReferenceTable value) {
        CARETAKERSERVICE = value;
    }

    private ReferenceTable EDBCRuntime = new ReferenceTable();

    public ReferenceTable getEDBCRuntime() {
        return EDBCRuntime;
    }

    public void setEDBCRuntime(ReferenceTable value) {
        EDBCRuntime = value;
    }

    private ReferenceTable EDBCNegActionDate = new ReferenceTable();

    public ReferenceTable getEDBCNegActionDate() {
        return EDBCNegActionDate;
    }

    public void setEDBCNegActionDate(ReferenceTable value) {
        EDBCNegActionDate = value;
    }

    private ReferenceTable healthCoverageType = new ReferenceTable();

    public ReferenceTable getHealthCoverageType() {
        return healthCoverageType;
    }

    public void setHealthCoverageType(ReferenceTable value) {
        healthCoverageType = value;
    }

    private ReferenceTable Citizen = new ReferenceTable();

    public ReferenceTable getCitizen() {
        return Citizen;
    }

    public void setCitizen(ReferenceTable value) {
        Citizen = value;
    }

    private ReferenceTable UnearnedIncome = new ReferenceTable();

    public ReferenceTable getUnearnedIncome() {
        return UnearnedIncome;
    }

    public void setUnearnedIncome(ReferenceTable value) {
        UnearnedIncome = value;
    }

    private ReferenceTable Alien = new ReferenceTable();

    public ReferenceTable getAlien() {
        return Alien;
    }

    public void setAlien(ReferenceTable value) {
        Alien = value;
    }

    private ReferenceTable Identity = new ReferenceTable();

    public ReferenceTable getIdentity() {
        return Identity;
    }

    public void setIdentity(ReferenceTable value) {
        Identity = value;
    }

    private ReferenceTable Holidays = new ReferenceTable();

    public ReferenceTable getHolidays() {
        return Holidays;
    }

    public void setHolidays(ReferenceTable value) {
        Holidays = value;
    }

    private ReferenceTable EDSNAPLimits = new ReferenceTable();

    public ReferenceTable getEDSNAPLimits() {
        return EDSNAPLimits;
    }

    public void setEDSNAPLimits(ReferenceTable value) {
        EDSNAPLimits = value;
    }

    private ReferenceTable EDSNAPParms = new ReferenceTable();

    public ReferenceTable getEDSNAPParms() {
        return EDSNAPParms;
    }

    public void setEDSNAPParms(ReferenceTable value) {
        EDSNAPParms = value;
    }

    private ReferenceTable EDSNAPDeduction = new ReferenceTable();

    public ReferenceTable getEDSNAPDeduction() {
        return EDSNAPDeduction;
    }

    public void setEDSNAPDeduction(ReferenceTable value) {
        EDSNAPDeduction = value;
    }

    private ReferenceTable EDRSCParms = new ReferenceTable();

    public ReferenceTable getEDRSCParms() {
        return EDRSCParms;
    }

    public void setEDRSCParms(ReferenceTable value) {
        EDRSCParms = value;
    }

    private ReferenceTable LIVINGARRANGEMENTTYPE = new ReferenceTable();

    public ReferenceTable getLIVINGARRANGEMENTTYPE() {
        return LIVINGARRANGEMENTTYPE;
    }

    public void setLIVINGARRANGEMENTTYPE(ReferenceTable value) {
        LIVINGARRANGEMENTTYPE = value;
    }

    private ReferenceTable EDKTAPParms = new ReferenceTable();

    public ReferenceTable getEDKTAPParms() {
        return EDKTAPParms;
    }

    public void setEDKTAPParms(ReferenceTable value) {
        EDKTAPParms = value;
    }

    private ReferenceTable EDKTAPLimits = new ReferenceTable();

    public ReferenceTable getEDKTAPLimits() {
        return EDKTAPLimits;
    }

    public void setEDKTAPLimits(ReferenceTable value) {
        EDKTAPLimits = value;
    }

    private ReferenceTable EDKCLIMITS = new ReferenceTable();

    public ReferenceTable getEDKCLIMITS() {
        return EDKCLIMITS;
    }

    public void setEDKCLIMITS(ReferenceTable value) {
        EDKCLIMITS = value;
    }

    private ReferenceTable CSRALimits = new ReferenceTable();

    public ReferenceTable getCSRALimits() {
        return CSRALimits;
    }

    public void setCSRALimits(ReferenceTable value) {
        CSRALimits = value;
    }

    private ReferenceTable EDResourceCategory = new ReferenceTable();

    public ReferenceTable getEDResourceCategory() {
        return EDResourceCategory;
    }

    public void setEDResourceCategory(ReferenceTable value) {
        EDResourceCategory = value;
    }

    private ReferenceTable RefValue = new ReferenceTable();

    public ReferenceTable getRefValue() {
        return RefValue;
    }

    public void setRefValue(ReferenceTable value) {
        RefValue = value;
    }

    private ReferenceTable VCIPayFrequency = new ReferenceTable();

    public ReferenceTable getVCIPayFrequency() {
        return VCIPayFrequency;
    }

    public void setVCIPayFrequency(ReferenceTable value) {
        VCIPayFrequency = value;
    }

    private ReferenceTable EDLTCParms = new ReferenceTable();

    public ReferenceTable getEDLTCParms() {
        return EDLTCParms;
    }

    public void setEDLTCParms(ReferenceTable value) {
        EDLTCParms = value;
    }

    private ReferenceTable EDLTCLimits = new ReferenceTable();

    public ReferenceTable getEDLTCLimits() {
        return EDLTCLimits;
    }

    public void setEDLTCLimits(ReferenceTable value) {
        EDLTCLimits = value;
    }

    private ReferenceTable AuthRepVrf = new ReferenceTable();

    public ReferenceTable getAuthRepVrf() {
        return AuthRepVrf;
    }

    public void setAuthRepVrf(ReferenceTable value) {
        AuthRepVrf = value;
    }

    private ReferenceTable EDCCAPCOPAYCHART = new ReferenceTable();

    public ReferenceTable getEDCCAPCOPAYCHART() {
        return EDCCAPCOPAYCHART;
    }

    public void setEDCCAPCOPAYCHART(ReferenceTable value) {
        EDCCAPCOPAYCHART = value;
    }

    private ReferenceTable PNPAUTHORIZATION = new ReferenceTable();

    public ReferenceTable getPNPAUTHORIZATION() {
        return PNPAUTHORIZATION;
    }

    public void setPNPAUTHORIZATION(ReferenceTable value) {
        PNPAUTHORIZATION = value;
    }

    private ReferenceTable EDCCAPFPLLIMIT = new ReferenceTable();

    public ReferenceTable getEDCCAPFPLLIMIT() {
        return EDCCAPFPLLIMIT;
    }

    public void setEDCCAPFPLLIMIT(ReferenceTable value) {
        EDCCAPFPLLIMIT = value;
    }

    private Function<LocalDateTime, ReferenceTable> ReferenceEdToaFpl;

    public Function<LocalDateTime, ReferenceTable> getReferenceEdToaFpl() {
        return ReferenceEdToaFpl;
    }

    public void setReferenceEdToaFpl(Function<LocalDateTime, ReferenceTable> value) {
        ReferenceEdToaFpl = value;
    }

    private Function<LocalDateTime, ReferenceTable> FmaLimitsReference;

    public Function<LocalDateTime, ReferenceTable> getFmaLimitsReference() {
        return FmaLimitsReference;
    }

    public void setFmaLimitsReference(Function<LocalDateTime, ReferenceTable> value) {
        FmaLimitsReference = value;
    }

    private Function<LocalDateTime, ReferenceTable> CSRLimitsReference;

    public Function<LocalDateTime, ReferenceTable> getCSRLimitsReference() {
        return CSRLimitsReference;
    }

    public void setCSRLimitsReference(Function<LocalDateTime, ReferenceTable> value) {
        CSRLimitsReference = value;
    }

    private ReferenceTable EDFrequencyConfiguration;

    public ReferenceTable getEDFrequencyConfiguration() {
        return EDFrequencyConfiguration;
    }

    public void setEDFrequencyConfiguration(ReferenceTable EDFrequencyConfiguration) {
        this.EDFrequencyConfiguration = EDFrequencyConfiguration;
    }

    private Function<LocalDateTime, ReferenceTable> APTCLimitsReference;

    public Function<LocalDateTime, ReferenceTable> getAPTCLimitsReference() {
        return APTCLimitsReference;
    }

    public void setAPTCLimitsReference(Function<LocalDateTime, ReferenceTable> value) {
        APTCLimitsReference = value;
    }

    private Function<LocalDateTime, ReferenceTable> TaxFilingLimitsReference;

    public Function<LocalDateTime, ReferenceTable> getTaxFilingLimitsReference() {
        return TaxFilingLimitsReference;
    }

    public void setTaxFilingLimitsReference(Function<LocalDateTime, ReferenceTable> value) {
        TaxFilingLimitsReference = value;
    }

    private ReferenceTable EDFinancialParameters = new ReferenceTable();

    public ReferenceTable getEDFinancialParameters() {
        return EDFinancialParameters;
    }

    public void setEDFinancialParameters(ReferenceTable value) {
        EDFinancialParameters = value;
    }

    private ReferenceTable EDLIHEAPLIMITS = new ReferenceTable();

    public ReferenceTable getEDLIHEAPLIMITS() {
        return EDLIHEAPLIMITS;
    }

    public void setEDLIHEAPLIMITS(ReferenceTable value) {
        EDLIHEAPLIMITS = value;
    }

    private ReferenceTable EDLIHEAPALLOTMENT = new ReferenceTable();

    public ReferenceTable getEDLIHEAPALLOTMENT() {
        return EDLIHEAPALLOTMENT;
    }

    public void setEDLIHEAPALLOTMENT(ReferenceTable value) {
        EDLIHEAPALLOTMENT = value;
    }

    private ReferenceTable EDSSPRunProgram = new ReferenceTable();

    public ReferenceTable getEDSSPRunProgram() {
        return EDSSPRunProgram;
    }

    public void setEDSSPRunProgram(ReferenceTable value) {
        EDSSPRunProgram = value;
    }

    private ReferenceTable EDVCL = new ReferenceTable();

    public ReferenceTable getEDVCL() {
        return EDVCL;
    }

    public void setEDVCL(ReferenceTable value) {
        EDVCL = value;
    }

    private String[] FosterCareCodes = null;

    public String[] getFosterCareCodes() {
        return FosterCareCodes;
    }

    public void setFosterCareCodes(String[] value) {
        FosterCareCodes = value;
    }

    private String[] NonMecCodes = null;

    public String[] getNonMecCodes() {
        return NonMecCodes;
    }

    public void setNonMecCodes(String[] value) {
        NonMecCodes = value;
    }

    private ReferenceTable BMCutOffDate = new ReferenceTable();

    public ReferenceTable getBMCutOffDate() {
        return BMCutOffDate;
    }

    public void setBMCutOffDate(ReferenceTable value) {
        BMCutOffDate = value;
    }

    private ReferenceTable EDCCAPSMILIMIT = new ReferenceTable();

    public ReferenceTable getEDCCAPSMILIMIT() {
        return EDCCAPSMILIMIT;
    }

    public void setEDCCAPSMILIMIT(ReferenceTable value) {
        EDCCAPSMILIMIT = value;
    }

    private ReferenceTable EDTOAFPL = new ReferenceTable();

    public ReferenceTable getEDTOAFPL() {
        return EDTOAFPL;
    }

    public void setEDTOAFPL(ReferenceTable value) {
        EDTOAFPL = value;
    }

    private ReferenceTable EDFPLLIMITS = new ReferenceTable();

    public ReferenceTable getEDFPLLIMITS() {
        return EDFPLLIMITS;
    }

    public void setEDFPLLIMITS(ReferenceTable value) {
        EDFPLLIMITS = value;
    }

    private Consumer<LocalDateTime> SetMonthlyRefData;

    public Consumer<LocalDateTime> getSetMonthlyRefData() {
        return SetMonthlyRefData;
    }

    public void setSetMonthlyRefData(Consumer<LocalDateTime> value) {
        SetMonthlyRefData = value;
    }

    private ReferenceTable EDVCLDOCUMENTSOURCE = new ReferenceTable();

    public ReferenceTable getEDVCLDOCUMENTSOURCE() {
        return EDVCLDOCUMENTSOURCE;
    }

    public void setEDVCLDOCUMENTSOURCE(ReferenceTable value) {
        EDVCLDOCUMENTSOURCE = value;
    }

    private ReferenceTable EDREASONABLECOMPATIBILITYTEST = new ReferenceTable();

    public ReferenceTable getEDREASONABLECOMPATIBILITYTEST() {
        return EDREASONABLECOMPATIBILITYTEST;
    }

    public void setEDREASONABLECOMPATIBILITYTEST(ReferenceTable value) {
        EDREASONABLECOMPATIBILITYTEST = value;
    }

    private ReferenceTable EDV731RFIBATCHRULE = new ReferenceTable();

    public ReferenceTable getEDV731RFIBATCHRULE() {
        return EDV731RFIBATCHRULE;
    }

    public void setEDV731RFIBATCHRULE(ReferenceTable value) {
        EDV731RFIBATCHRULE = value;
    }

    private ReferenceTable EDSNAPTRANSDEDUCTIONCOUNTY = new ReferenceTable();

    public ReferenceTable getEDSNAPTRANSDEDUCTIONCOUNTY() {
        return EDSNAPTRANSDEDUCTIONCOUNTY;
    }

    public void setEDSNAPTRANSDEDUCTIONCOUNTY(ReferenceTable value) {
        EDSNAPTRANSDEDUCTIONCOUNTY = value;
    }

    private ReferenceTable PnPINCOMETYPE = new ReferenceTable();

    public ReferenceTable getPnPINCOMETYPE() {
        return PnPINCOMETYPE;
    }

    public void setPnPINCOMETYPE(ReferenceTable value) {
        PnPINCOMETYPE = value;
    }

    private BiFunction<String, LocalDateTime, ReferenceTable> GetMonthlyData;

    public BiFunction<String, LocalDateTime, ReferenceTable> getGetMonthlyData() {
        return GetMonthlyData;
    }

    public void setGetMonthlyData(BiFunction<String, LocalDateTime, ReferenceTable> value) {
        GetMonthlyData = value;
    }

    private ReferenceTable EDCCAPINCLIMIT = new ReferenceTable();

    public ReferenceTable getEDCCAPINCLIMIT() {
        return EDCCAPINCLIMIT;
    }

    public void setEDCCAPINCLIMIT(ReferenceTable value) {
        EDCCAPINCLIMIT = value;
    }

    private ReferenceTable EDCCAPINCLIMITVALUE = new ReferenceTable();

    public ReferenceTable getEDCCAPINCLIMITVALUE() {
        return EDCCAPINCLIMITVALUE;
    }

    public void setEDCCAPINCLIMITVALUE(ReferenceTable value) {
        EDCCAPINCLIMITVALUE = value;
    }

    private ReferenceTable EDWORKHOURS = new ReferenceTable();

    public ReferenceTable getEDWORKHOURS() {
        return EDWORKHOURS;
    }

    public void setEDWORKHOURS(ReferenceTable value) {
        EDWORKHOURS = value;
    }

    private ReferenceTable EDEXCLUDEDEARNEDINCOME = new ReferenceTable();

    public ReferenceTable getEDEXCLUDEDEARNEDINCOME() {
        return EDEXCLUDEDEARNEDINCOME;
    }

    public void setEDEXCLUDEDEARNEDINCOME(ReferenceTable value) {
        EDEXCLUDEDEARNEDINCOME = value;
    }

    private ReferenceTable EDINCOMEDETAILS = new ReferenceTable();

    public ReferenceTable getEDINCOMEDETAILS() {
        return EDINCOMEDETAILS;
    }

    public void setEDINCOMEDETAILS(ReferenceTable value) {
        EDINCOMEDETAILS = value;
    }

    private ReferenceTable EDCERTTYPE = new ReferenceTable();

    public ReferenceTable getEDCERTTYPE() {
        return EDCERTTYPE;
    }

    public void setEDCERTTYPE(ReferenceTable value) {
        EDCERTTYPE = value;
    }

    private ReferenceTable DisqualificationGoodCause = new ReferenceTable();

    public ReferenceTable getDisqualificationGoodCause() {
        return DisqualificationGoodCause;
    }

    public void setDisqualificationGoodCause(ReferenceTable value) {
        DisqualificationGoodCause = value;
    }

    private ReferenceTable EDDISQUALIFICATIONTYPE = new ReferenceTable();

    public ReferenceTable getEDDISQUALIFICATIONTYPE() {
        return EDDISQUALIFICATIONTYPE;
    }

    public void setEDDISQUALIFICATIONTYPE(ReferenceTable value) {
        EDDISQUALIFICATIONTYPE = value;
    }

    private ReferenceTable EDMinMaxDates = new ReferenceTable();
    private ReferenceTable EDMinMaxRules = new ReferenceTable();
    private ReferenceTable EDMinMaxHierarchy = new ReferenceTable();
    private ReferenceTable EDMinMaxPeriodCode = new ReferenceTable();
    private ReferenceTable EDEventPriority = new ReferenceTable();
    private ReferenceTable EDEligibilityDateRule = new ReferenceTable();

    public ReferenceTable getEDMinMaxDates() {
        return EDMinMaxDates;
    }

    public void setEDMinMaxDates(ReferenceTable eDMinMaxDates) {
        EDMinMaxDates = eDMinMaxDates;
    }

    public ReferenceTable getEDMinMaxRules() {
        return EDMinMaxRules;
    }

    public void setEDMinMaxRules(ReferenceTable eDMinMaxRules) {
        EDMinMaxRules = eDMinMaxRules;
    }

    public ReferenceTable getEDMinMaxHierarchy() {
        return EDMinMaxHierarchy;
    }

    public void setEDMinMaxHierarchy(ReferenceTable eDMinMaxHierarchy) {
        EDMinMaxHierarchy = eDMinMaxHierarchy;
    }

    public ReferenceTable getEDMinMaxPeriodCode() {
        return EDMinMaxPeriodCode;
    }

    public void setEDMinMaxPeriodCode(ReferenceTable eDMinMaxPeriodCode) {
        EDMinMaxPeriodCode = eDMinMaxPeriodCode;
    }

    public ReferenceTable getEDEventPriority() {
        return EDEventPriority;
    }

    public void setEDEventPriority(ReferenceTable eDEventPriority) {
        EDEventPriority = eDEventPriority;
    }

    public ReferenceTable getEDEligibilityDateRule() {
        return EDEligibilityDateRule;
    }

    public void setEDEligibilityDateRule(ReferenceTable eDEligibilityDateRule) {
        EDEligibilityDateRule = eDEligibilityDateRule;
    }

    private ReferenceTable EDBenefitConfiguration = new ReferenceTable();

    public ReferenceTable getEDBenefitConfiguration() {
        return EDBenefitConfiguration;
    }

    public void setEDBenefitConfiguration(ReferenceTable eDBenefitConfiguration) {
        EDBenefitConfiguration = eDBenefitConfiguration;
    }

    private ReferenceTable EDCOUNTABLEEXPENSETYPE = new ReferenceTable();

    public ReferenceTable getEDCOUNTABLEEXPENSETYPE() {
        return EDCOUNTABLEEXPENSETYPE;
    }

    public void setEDCOUNTABLEEXPENSETYPE(ReferenceTable value) {
        EDCOUNTABLEEXPENSETYPE = value;
    }

}
