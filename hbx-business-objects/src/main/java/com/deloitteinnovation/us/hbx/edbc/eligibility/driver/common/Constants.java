package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constants {
    public static LocalDateTime RE_RTLookupDate = LocalDateTime.of(2015, 1, 1, 0, 0);
    public static final String QHP_ENROLLMENT_CUTOFF = "QHP_ENROLLMENT_CUTOFF";
    public static final String STATE_CHECK_FFC = "STATE_CHECK_FFC";
    public static final String STATE_CODE = "STATE_CODE";
    public static final int PREGNANCYPOSTPARTUMMONTHS = 3;
    public static final String PREGTP45RECIPIENTCODE = "P3";
    public static final int MINAGEINMONTHSFORPREGNANCY = 120;
    public static final int AGEINMONTHNINETEENYEARS = 228;
    public static final int AGEINMONTHTHIRTEENYEARS = 156;
    public static final int AGEINMONTHFIVEYEARS = 60;
    public static final int AGEINMONTHEIGHTEENYEARS = 216;
    public static final int AGEINMONTHSSIXTYFIVEYEARS = 780;
    public static final int AGEINMONTHSTWENTYONEYEARS = 252;
    public static final int AGEINMONTHSTWENTYTWOYEARS = 264;
    public static final int AGEINMONTHFOURTEENYEARS = 216;
    public static final int AGEINMONTHTWENTYYEARS = 240;
    public static final int AGEINMONTHSTHREEMONTHS = 3;
    public static final int AGEINMONTHSTWELVEMONTHS = 12;
    public static final int AGEINMONTHSSIXYEARS = 72;
    public static final int AGEINMONTHSTWELVEYEARS = 144;
    public static final int AGEINMONTHSFORTYNINE = 588;
    public static final int AGEINMONTHSFIFTY = 600;
    public static final int AGEINMONTHSTWENTYSIX = 312;
    public static final int AGEINMONTHSSEVENTEENYEARS = 204;
    public static final int AGEWHENLEFTFOSTERCARE = 18;
    public static final int ABAWDMONTHRANGE = 36;
    public static final String ABAWDCODEBADMONTH = "BA";
    public static final String ABAWDCODECLAIMMONTH = "CM";
    public static final String ABAWDBONUSMONTH = "BN";
    public static final String ELIGIBILITYSNAP = "ES";
    public static final String PRORATEDMONTH = "PM";
    public static final String ABAWDWORKINGEIGHTYHOURS = "HR";
    public static final String COUNTYTYPE = "ABAWD";
    public static final int CAREFORINDIVIDUALRFIMONTH = 5;
    public static final int HIGHINDIVIDUALAGE = 1000;
    public static final int AGEINMONTHSTHIRTEENYEARS = 156;
    public static final int AGEINMONTHSFIFTEENYEARS = 180;
    public static final LocalDateTime AlienRulesDate = LocalDateTime.of(1996, 8, 31, 0, 0);
    public static final int AGEINMONTHSIXTEENYEARS = 192;
    public static final int FOSTERCARETERMINATIONAGE = 18;
    public static final int APTCINCOMEDETAILID = 1000;
    public static final String HBE = "HBE";
    public static final String FPL = "FPL";
    public static final String PACAW5PCT = "PACAW5PCT";
    public static final String VCIACTIVESWITCH = "IsActive";
    public static final String VCIMULTIPLYFACTOR = "MULTIPLY_FACTOR";
    public static final String EMPLOYERCOVERAGE = "EC";
    public static final String MEC = "MEC";
    public static final String OTHERSYSTEM = "OtherSystem";
    public static final String SDX = "SDX";
    public static final String MCIBENEFITPROGRAMCODEFA = "FA";
    public static final String MCIBENEFITSUBPROGRAMCODEMA = "MA";
    public static final String DEFAULTCORRESPONDENCECONNECTION = "default";
    public static final String DEFAULTCONNECTION = "default";
    public static final int DEFAULTPRIORMASEQUENCE = 1;
    public static final int DEFAULTLEVELNUMBER = 1;
    public static final String LTCPARAMETERS = "LTCPARAMETERS";
    public static final String INDIVIDUAL = "INDIVIDUAL";
    public static final String ELIGIBLESPOUSE = "ELIGIBLE_SPOUSE";
    public static final String INELIGIBLESPOUSE = "INELIGIBLE_SPOUSE";
    public static final String NMAGIPROGRAMCATEGORY = "NM";
    public static final String SSPPROGRAMCODE = "SS";
    public static final String CCAPPROGRAMCODE = "CC";
    public static final String MSPPROGRAMCATEGORY = "MSP";
    public static final String SSPPROGRAMCATEGORY = "SSP";
    public static final String MAGIPROGRAMCATEGORY = "MAGI";
    public static final int LTCM35DAYPERIOD = -35;
    public static final String FFCCCATEGORY = "FosterCare";
    public static final String INVALIDRESIDENCYSTATECODE = "X";
    public static final String LIVINGARRANGEMENTTYPECODE = "XX";
    public static final double BOARDERALLOTMENTRATIO = 2 / 3f;
    public static final String EMANCIPATED = "Emancipated";
    public static final String SSIBENEFITCODE = "SSI";
    public static final String CASEDATACHANGEACTIONTYPEINSERTED = "Inserted";
    public static final String NOGOODCAUSEREASON = "NO";
    public static final int LOSSOFEMPLOYMENT30DAYSPERIOD = -30;
    public static final int LOSSOFEMPLOYMENT60DAYSPERIOD = -60;
    public static final int LOSSOFEMPLOYMENT1YEARPERIOD = -1;
    public static final int LOSSOFEMPLOYMENTLOOKBACKPERIOD = -18;
    public static final int PASTMONTHPERIOD = -12;
    public static final int PASTMONTHPERIOD6MONTHS = -6;
    public static final String METLOCSTATUSCODE = "MET";
    public static final String SEMICOLAN = ";";
    public static final String STRING_NULL = "null";
    public static final String SMI_PREMIUM_MEDICALEXPENSE = "SMI";
    public static final String RENEWALDENIAL = "R5_RN_DN_RI_FLAG";
    public static final String RN_DN_ESNAP_SNAP_CNCL = "RN_DN_ESNAP_SNAP_CNL";
    public static final String RENEWALREINSTATEMENTREASONCODE = "RN";
    public static final String RENEWALDISCONTINUANCEDAYFORSNAPFS2 = "RenewalDiscontinuanceDayForSnapFS2";
    public static final String ALIMONYVERIFICATIONCODE = "V834";
    public static final int EDUCATIONLIMIT = 60;
    public static final int TRANSFERREDRESOURCEPRIORMONTH = 60;
    public static final int TRANFERREDRESOURCEINTAKEMONTH = 24;
    public static final int TRANSFERREDRESOURCECHANGERENEWALMONTH = 12;
    public static final int MIDDAYOFMONTH = 15;
    public static final int SEVENTEEN = 17;
    public static final int THIRTY = 30;
    public static final String PREVENTION = "PR";
    public static final String PROTECTION = "PT";
    public static final String INDIVIDUALBUDGETTYPECODE = "INDV";
    public static final String CHANGED = "C";
    public static final String NOINCOMEVERIFICATIONREQUIREDFORMEDICAID = "M";
    public static final int PREGNANCYPOSTPARTUMDAYS = 60;
    public static final String NONPROFITALIENSPONSOR = "NPO";
    public static final int REVIEWINITIATEDATE = -10;
    public static final int DEEMEDPERIODLENGTH_TMA = 5;
    public static final String GUARDIANSHIP = "DAIL";
    public static final int VERIFICATIONDATE = -3;
    public static final int VERIFICATIONTYPEFIELDLENGTH = 24;
    public static final String APP = "APP";
    public static final String CSAR = "CSAR";
    public static final String TIMELIMITMAGIPROGRAMCATEGORY = "TLMAGI";
    public static final String SPMA = "SPMA";
    public static final int RENEWAL_DUE_DAYS = 40;
    public static final int FORTYFIVEDAYS = 45;
    public static final String ACTIONCODERFI = "RFI";
    public static final String NOTREQUESTING = "EL1926";
    public static final String RELATIONSHIPEXCLUDED = "EL1565";
    public static final String SOURCESYSTEMNAME = "sourceSystemName";
    public static final String SOURCEINDIVIDUALID = "sourceIndividualId";
    public static final String MAIDCARDNUMBER = "maidcardNumber";
    public static final String FINANCIAL_ASSISTANCE = "FA";
    public static final String CASENUMBER = "caseNumber";
    public static final String PROGRAMPARTICIPANTMODELLISTTOBEFLAGGEDINBENEFITSTABLE = "programparticipantModelListToBeFlaggedInBenefitsTable";
    public static final String MCIFAILEDINDIVIDUALS = "MCIFAILEDINDIVIDUALS";
    public static final String ALLINDIVIDUALSLIST = "IndividualList";
    public static final String EDGNUMBERTARGETINDIVIDUALIDDICTIONARY = "eDGNumberTargetIndividualIdDictionary";
    public static final String MCIMINAUTHEDMDATE = "mciMinAuthEDMDate";
    public static final String MCIMAXAUTHEDMDATE = "mciMaxAuthEDMDate";
    public static final String PROGRAMPARTICIPANTMODELLIST = "programParticipantModelList";
    public static final String ELIGIBILITYUPDATELISTFROMPREVEDM = "eligibilityUpdateListFromPrevEDM";
    public static final String ELIGIBILITYMODELUPDATELISTFROMAUTHEDM = "eligibilityModelUpdateListFromAuthEDM";
    public static String ELIGIBILITYINSERTLISTFROMPREVEDM = "eligibilityInsertListFromPrevEDM";
    public static String COMPLETEAUTHRECORDSLISTPREMCIUPDATE = "completeAuthRecordsListPreMciUpdate";
    public static String EDVCLMAPPER_PASSTHROUGH = "PASS_THRU";
    public static final char SEMICOLAN_CHAR = ';';
    public static final char COMMA_CHAR = ',';
    public static final String COMMA_STRING = ",";
    public static final LocalDateTime GoLiveDate = LocalDateTime.of(2016, 3, 1, 0, 0);
    public static final List<String> EDMProgramList = Collections.unmodifiableList(Arrays.asList(ProgramCode.KTAP,
            ProgramCode.NMAGI, ProgramCode.MEDICAID, ProgramCode.SNAP, ProgramCode.DSNAP, ProgramCode.KINSHIPCARE,
            ProgramCode.STATESUPPLEMENT, ProgramCode.SAFE, ProgramCode.LIHEAP, ProgramCode.CSRA, ProgramCode.CCAP));
    public static final String APPLICATIONSIGNATUREPERIOD = "RFI_APPL_SIGNATURE_PERIOD";
    public static final String REFERENCETIME = "ReferenceTime";
    public static final String CHARINITSPACE = "0";
    public static final List<String> KCHIPCODES = Collections.unmodifiableList(Arrays.asList("P5", "P6", "P7"));
    public static final List<String> VehicleExemptionCodes = Collections
            .unmodifiableList(Arrays.asList("COMMSP", "DISEQP", "EMPSELF", "MEDTREAT", "OWNEQP"));
    public static final List<String> SSIApprovalCodes = Collections.unmodifiableList(Arrays.asList("C01"));
    public static final List<String> SSIDenialCodesPassThrough = Collections.unmodifiableList(Arrays.asList("N01"));
    public static final List<String> PassThroughReviewStatusCodes = Collections
            .unmodifiableList(Arrays.asList("SDX", "SSA", "MSBB", "NV", "CV"));
    public static final List<String> PassThroughReviewApprovalCodes = Collections
            .unmodifiableList(Arrays.asList("SDX", "SSA", "CV"));
    public static final List<String> SSPLivingArrangementType = Collections
            .unmodifiableList(Arrays.asList("FCH", "PCH", "CIS"));
    public static final List<String> MRTDecisionType = Collections
            .unmodifiableList(Arrays.asList("NDSBD", "RR", "DS", "IN"));
    public static final List<String> CARETAKERRELATIVES = Collections.unmodifiableList(Arrays.asList("CH", "PA", "SP"));
    public static final List<String> SpendDownTypeOfAssistances = Collections
            .unmodifiableList(Arrays.asList("SPNM", "SPMA", "SPDN"));
    public static final List<String> SNAPPostponedVerifications = Collections.unmodifiableList(Arrays.asList("V702",
            "V714", "V708", "V719", "V706", "V679", "V709", "V720", "V704", "V683", "V710", "V721", "V703", "V715",
            "V712", "V723", "V705", "V716", "V711", "V725", "V574", "V717", "V713", "V724", "V707", "V718", "V722"));
    public static final List<String> KTAPPostponedVerifications = Collections
            .unmodifiableList(Arrays.asList("V786", "V829"));
    public static final List<String> CCAPPostponedVerifications = Collections
            .unmodifiableList(Arrays.asList("V108", "V804"));
    public static final List<String> MAGIPostponedVerifications = Collections
            .unmodifiableList(Arrays.asList("V732", "V003", "V089", "V001", "V221", "V020", "V784", "V108"));
    public static final List<String> RFIToGenerateOnDataChange = Collections
            .unmodifiableList(Arrays.asList("V791", "V787", "V553", "V561", "V556", "V560", "V555", "V554", "V566",
                    "V567", "V568", "V814", "V815", "V816", "V817", "V818", "V819", "V820", "V821", "V822", "V823",
                    "V824", "V825", "V826", "V827", "V828", "V077", "V093", "V094", "V581", "V622", "V842"));
    public static final List<String> RFIToGenerateOnRenewal = Collections
            .unmodifiableList(Arrays.asList("V814", "V815", "V816", "V817", "V818", "V819", "V820", "V821", "V822",
                    "V823", "V824", "V825", "V826", "V827", "V828", "V077", "V093", "V094", "V581", "V622", "V842"));
    public static final List<String> IncomeVerifications = Collections
            .unmodifiableList(Arrays.asList("V581", "V583", "V584", "V544"));
    public static final List<String> VerificationsForClearRFIAttribute = Collections
            .unmodifiableList(Arrays.asList("V581", "V583", "V584", "V544"));
    public static final List<String> StateSuppIncomeVCLs = Collections
            .unmodifiableList(Arrays.asList("V581", "V583", "V584", "V793", "V838", "V077", "V794", "V796"));
    public static final List<String> ExemptVCLFromDueDateAlignment = Collections
            .unmodifiableList(Arrays.asList("V804", "V829"));
    public static String HouseholdPayeeCode = "PY";
    public static final List<String> BenefitTypeListForEDBM = Collections
            .unmodifiableList(Arrays.asList(BenefitTypeCode.INITIAL, BenefitTypeCode.SUPPLEMENTALBENEFIT,
                    BenefitTypeCode.RESTORATION, BenefitTypeCode.MONTHLYONGOING));
    public static String HealthyFoodBMBenefitType = "FG";
    public static String Eligible = "Eligible";
    public static String NotEligible = "Not Eligible";
    public static final String PRTFI = "PRTFI";
    public static final String PRTFII = "PRTFII";
    public static final String EPSDT = "EPSDT";
    public static final String EL1509 = "EL1509";
    public static final String EL1531 = "EL1531";
    public static final String EL7035 = "EL7035";

    public static final String GENERIC_DENIAL_CODE = "599";
    public static final String OUT_OF_HOUSEHOLD = "602";

    protected static final String PRV_STATIC_CONS = "Private Constructor for Static Class as Sonar Fix";

    public static class ProgramCategory {
        private ProgramCategory() {

        }

        public static final String NM = "NM";
        public static final String TLNM = "TLNM";
        public static final String SS = "SSP";
        public static final String MSP = "MSP";
    }

    public static class programType {
        private programType() {

        }

        public static final String MS = "MS";
        public static final String SP = "SP";
        public static final String MA = "MA";
    }

    public static final String CASEDATACHANGEACTIONTYPEUPDATED = "Updated";
    public static final char SEPERATORPIPE = '|';

    public static class PassThroughCategoryCodes {
        private PassThroughCategoryCodes() {

        }

        public static final String DAC = "DAC";
        public static final String DWDSD = "DWDSD";
        public static final String CAC = "CAC";
    }

    public static class SpendDownQuarters {
        private SpendDownQuarters() {

        }

        public static final String CURRENT = "C";
        public static final String RETRO = "R";
    }

    public static class SSNGoodCauseReasons {
        private SSNGoodCauseReasons() {

        }

        public static final String RE = "R";
        public static final String RG = "X";
        public static final String APPLIEDSSN = "N";
        public static final String NEWBORN = "H";
        public static final String WITHOUTSSNCARD = "WS";
    }

    public static class EligibilityStatus {
        private EligibilityStatus() {

        }

        public static final String AUTHORIZED = "1";
        public static final String REFERRAL = "4";
        public static final int LENGTH = 9;
        public static final String PROCESSED = "2";
        public static final String TEMPORARY = "3";
        public static final String TEMPORARYORPROCESSED = "0";
        public static final String CLAIMREFERRAL = "5";
        public static final String OTHERPGMELIGINFO = "6";
        public static final String NOSUPPLEMENT = "7";
        public static final String DATABASEPROCESSED = "8";
    }

    public static class VerificationGoodCauseCode {
        private VerificationGoodCauseCode() {

        }

        public static final String DRUGFELONYGOODCAUSE = "VC001";
        public static final String CHEMICALPROGRAMPARTICIPANTGOODCAUSE = "VC002";
    }

    public static class DrugFelonyGoodCauseReason {
        private DrugFelonyGoodCauseReason() {

        }

        public static final String PREGNANT = "PG";
        public static final String LIVINGINDAA = "DAA";
        public static final String CHEMICALPROGRAMPARTICIPANT = "CPP";
    }

    public static class TPRRelationship {
        private TPRRelationship() {

        }

        public static final String SELF = "1";
    }

    public static class PassThroughBenefitTerminationReasonCodes {
        private PassThroughBenefitTerminationReasonCodes() {

        }

        public static final String CO = "CO";
        public static final String OT = "OT";
        public static final String RE = "RE";
        public static final String ID = "ID";
        public static final String DW = "DW";
        public static final String DE = "DE";
        public static final String IB = "IB";
        public static final String NB = "NB";
        public static final String ND = "ND";
        public static final String NA = "NA";
        public static final String NLD = "NLD";
    }

    public static class SSIDenialReason {
        private SSIDenialReason() {

        }

        public static final String NONDISABILTIY = "DT";
        public static final String NOTBLINDDISABLED = "NBD";
    }

    public static class Pregnancy {
        private Pregnancy() {

        }

        public static final String PG = "PG";
        public static final String DC = "DC";
    }

    public static class SAFEDenialReason {
        private SAFEDenialReason() {

        }

        public static final String CLIENTREQUNWRITTEN = "CRU";
        public static final String CLIENTREQWRITTEN = "CRW";
        public static final String FAILEDPROVIDESUFFICIENTINFO = "FPSI";
        public static final String INELIGIBLEDRUGFELON = "IDF";
        public static final String INELIGIBLEFACILITYMORETHAN30DAYS = "IFMTD";
        public static final String INELIGIBLEHOUSEHOLDCOMPOSITION_ADULT = "IHCA";
        public static final String INELIGIBLEHOUSEHOLDCOMPOSITION_CHILD = "IHCC";
        public static final String MOVEDOUTOFSTATE = "MOOS";
        public static final String MARITALSTATUSMISMATCH = "MSS";
        public static final String TRANSFERSAFETOSNAP = "TFSS";
        public static final String UNABLETOLOCATEFORQCREVIEW = "ULQCR";
    }

    public static class HBEBenefits {
        private HBEBenefits() {

        }

        public static final String BEGINDATE = "BeginDate";
        public static final String ENDDATE = "EndDate";
        public static final String TYPEOFASSISTANCECODE = "TypeOfAssistanceCode";
    }

    public static class ErrorMessages {
        private ErrorMessages() {

        }

        public static String TransactionLogErrorFormat = "Message#%s|InnerException#%s|StackTrace#%s";
    }

    public static class FedIndvIncomeFactor {
        private FedIndvIncomeFactor() {

        }

        public static final String FEDID = "FED-";
        public static final int YEARLY = 12;
    }

    public static class IncomeTaxExempt {
        private IncomeTaxExempt() {

        }

        public static final String ANNUALEARNEDINCOME = "FINANNUALEARNEDINCTAXEXMT";
        public static final String ANNUALUNEARNEDINCOME = "FINANNUNEARNEDINCTAXEXMT";
    }

    public static class MCIConstants {
        private MCIConstants() {

        }

        public static String BENEFITTYPE = "BENEFITTYPE";
        public static String MAIDCARDTYPE = "MAIDCARDTYPE";
        public static String MAIDCARDSUCCESSMESSAGE = "MAIDCARD ID Call Passed";
        public static String MAIDCARDFAILUREMESSAGE = "MAIDCARD ID Call Failed";
        public static String COLON = " : ";
        public static String BENEFITSSUCCESSMESSAGE = "MCI CALL Passed";
        public static String BENEFITSFAILUREMESSAGE = "MCI CALL Failed";
    }

    public static class ApplicationStatusCode {
        private ApplicationStatusCode() {

        }

        public static final String APPLIED = "AP";
        public static final String APPEALED = "DPA";
    }

    public static class ApplicationStatusCodeForEntitledBenefits {
        private ApplicationStatusCodeForEntitledBenefits() {

        }

        public static final String APPLIED = "A";
        public static final String APPEALED = "DPA";
        public static final String NOTAPPLIED = "P";
        public static final String DENIED = "D";
        public static final String TEMINATED = "T";
    }

    public static class AbuseCommittedBy {
        private AbuseCommittedBy() {

        }

        public static final String SPOUSE = "SP";
        public static final String FAMILYMEMOFSPOUSEORPARENT = "FA";
        public static final String PARENT = "PA";
    }

    public static class BenefitTypeCode {
        private BenefitTypeCode() {

        }

        public static final String UIB = "UI";
        public static final String INITIAL = "INT";
        public static final String SUPPLEMENTALBENEFIT = "SUPP";
        public static final String RESTORATION = "REST";
        public static final String SPECIALCIRCUMSTANCE = "SC";
        public static final String MONTHLYONGOING = "MO";
    }

    public static class HasLawfulPresenceVerification {
        private HasLawfulPresenceVerification() {

        }

        public static final String PEND = "U";
        public static final String YES = "Y";
    }

    public static class DayOfMonth {
        private DayOfMonth() {

        }

        public static final int BEGINOFMONTH = 1;
        public static final int ENDOFMONTH = 2;
        public static final int ANYDAYOFMONTH = 3;
    }

    public static class ETPIneligibleReason {
        private ETPIneligibleReason() {

        }

        public static final String MAI = "MAI";
        public static final String NCO = "NCO";
        public static final String MRH = "MRH";
        public static final String MJS = "MJS";
    }

    public static class ActivityType {
        private ActivityType() {

        }

        public static final String CHANGEACTION = "CN";
        public static final String CONVERSION = "CV";
        public static final String INTAKE = "IN";
        public static final String NULL = null;
        public static final String ONGOING = "AC";
        public static final String PERIODICREVIEW = "PR";
        public static final String RENEWAL = "RN";
        public static final String REINSTATE = "RI";
        public static final String RNI = "RNI";
        public static final String NOTAPPLICABLE = "NA";
        public static final String INCOMPLETEREVIEW = "IR";
        public static final String SPECIALCIRCUMSTANCES = "SC";
    }

    public static class RFIActivityType {
        private RFIActivityType() {

        }

        public static final String RENEWAL = "RV";
    }

    public static class GraduationCodes {
        private GraduationCodes() {

        }

        public static final String GRADUATED = "GR";
        public static final String NOTGRADUATED = "NGR";
    }

    public static class ReferenceTable {
        private ReferenceTable() {

        }

        public static final String TAXFILINGLIMITS = "TaxFilingLimits";
        public static final String EDINCOMEDETAILS = "EDINCOMEDETAILS";
        public static final String EDVCLDOCUMENTSOURCE = "EDVCLDOCUMENTSOURCE";
        public static final String EDBCNEGACTIONDATE = "EDNEGACTIONDATE";
        public static final String MCOCUTOFFDATE = "NEGACTIONDATEMCO";
        public static final String QHPCUTOFFDATE = "NEGACTIONDATEQHP";
        public static final String KTAPCUTOFFDATE = "KTAP_DATE";
        public static final String SNAPCUTOFFDATE = "SNAP_DATE";
        public static final String CCAPCUTOFFDATE = "KTAP_DATE";
        public static final String HEALTHCOVERAGETYPE = "HEALTHCOVERAGETYPE";
        public static final String TAXFILINGSTATUS = "TAXFILINGSTATUS";
        public static final String EDTOAFPL = "EDTOAFPL";
        public static final String EDFPLLIMITS = "EDFPLLIMITS";
        public static final String EDAPTCLIMITS = "EDAPTCLIMITS";
        public static final String EDSNAPLIMITS = "EDSNAPLIMITS";
        public static final String EDCSRTIER = "EDCSRTIER";

        public static final String EDFREQUENCYCONFIGURATION = "EDFrequencyConfiguration";

        public static final String EDSNAPPARMS = "EDSNAPPARMS";
        public static final String EDSNAPDEDUCTION = "EDSNAPDEDUCTION";
        public static final String EDRSCPARMS = "EDRSCPARMS";
        public static final String LIVINGARRANGEMENTTYPE = "LIVINGARRANGEMENTTYPE";
        public static final String EDKTAPPARMS = "EDKTAPPARMS";
        public static final String EDKTAPLIMITS = "EDKTAPLimits";
        public static final String EDKCLIMITS = "EDKCLIMITS";
        public static final String EDLTCLIMITS = "EDLTCLIMITS";
        public static final String EDLTCPARMS = "EDLTCPARMS";
        public static final String RESOURCECATEGORY = "EDRESOURCECATEGORY";
        public static final String EDMUSETTING = "EDMUSETTING";
        public static final String EDBCRUNTIME = "EDBCRUNTIME";
        public static final String AUTHREPVRF = "AUTHREPVRF";
        public static final String EDLIHEAPLIMITS = "EDLIHEAPLIMITS";
        public static final String EDLIHEAPALLOTMENT = "EDLIHEAPALLOTMENT";
        public static final String BMCUTOFFDATE = "BMCUTOFFDATE";
        public static final String ALIENTYPE = "ALIENTYPE";
        public static final String EDSSPRUNPROGRAM = "EDSSPRunProgram";
        public static final String EDVCL = "EDVCL";
        public static final String EDCCAPCOPAYCHART = "EDCCAPCOPAYCHART";
        public static final String PNPAUTHORIZATION = "P&PAUTHORIZATION";
        public static final String EDCCAPLIMITS = "EDCCAPSMILIMIT";
        public static final String EDCCAPFPLLIMIT = "EDCCAPFPLLIMIT";
        public static final String WORKEXEMPTIONTYPE = "WORKEXEMPTIONTYPE";
        public static final String EDEDBCDCTABLES = "EDEDBCDCTABLES";
        public static final String EDV731RFIBATCHRULE = "EDV731RFIBATCHRULE";
        public static final String EDSNAPTRANSDEDUCTIONCOUNTY = "EDSNAPTRANSDEDUCTIONCOUNTY";
        public static final String COLAUNEARNEDINCOMETYPES = "COLAUnearnedIncomeTypes";
        public static final String VANURSINGFACILITY = "VANURSINGFACILITY";
        public static final String EDCCAPINCLIMIT = "EDCCAPINCLIMIT";
        public static final String EDCCAPINCLIMITVALUE = "EDCCAPINCLIMITVALUE";
        public static final String EDWORKHOURS = "EDWORKHOURS";
        public static final String PNPINCOMETYPE = "P&PINCOMETYPE";
        public static final String HOLIDAYS = "HOLIDAYS";
        public static final String EDCERTTYPE = "EDCERTTYPE";
        public static final String EDREASONABLECOMPATIBILITYTEST = "EDREASONABLECOMPATIBILITYTEST";
        public static final String EDEXCLUDEDEARNEDINCOME = "EDEXCLUDEDEARNEDINCOME";
        public static final String EDEXCLUDEDUNEARNEDINCOME = "EDEXCLUDEDUNEARNEDINCOME";
        public static final String DISQUALIFICATIONGOODCAUSE = "DisqualificationGoodCause";
        public static final String EDDISQUALIFICATIONTYPE = "EDDISQUALIFICATIONTYPE";
        public static final String EDMINMAXDATES = "EDMinMaxDates";
        public static final String EDMINMAXRULES = "EDMinMaxRules";
        public static final String EDMINMAXHIERARCHY = "EDMinMaxHierarchy";
        public static final String EDMINMAXPERIODCODE = "EDMinMaxPeriodCode";
        public static final String EDEVENTPRIORITY = "EDEventPriority";
        public static final String EDELIGIBILITYDATERULE = "EDEligibilityDateRule";
        public static final String EDBENEFITCONFIGURATION = "EDBENEFITCONFIGURATION";
        public static final String EDCOUNTABLEEXPENSETYPE = "EDCOUNTABLEEXPENSETYPE";
    }

    public static class TaxFilerCode {
        private TaxFilerCode() {

        }

        public static final String FILINGJOINTLY = "MFT";
        public static final String FILINGSEPARATELY = "MFS";
        public static final String NONFILER = "NFT";
        public static final String TAXDEPENDANT = "TD";
        public static final String TAXFILER = "TF";

    }

    public static class DenialIndicatorType {
        private DenialIndicatorType() {

        }

        public static final String INDIVIDUAL = "I";
        public static final String HOUSEHOLD = "H";
    }

    public static class ReferenceTableColumn {
        private ReferenceTableColumn() {

        }

        public static final String LTCLIVINGARRANGEMENTTYPE = "LTCLIVINGARRANGEMENTTYPE";
        public static final String MAGICOUNTABLE = "MAGICOUNTABLE";
        public static final String VCI_COMPARE_ALL_INCOME = "VCI_COMPARE_ALL_INCOME";
        public static final String CATEGORY_CODE = "CATEGORYCODE";
        public static final String CATEGORY_DESC = "CATEGORYDESC";
        public static final String SNAP_130PCT_LMT = "SNAP_130PCT_LMT";
        public static final String SNAP_165PCT_LMT = "SNAP_165PCT_LMT";
        public static final String SNAP_200PCT_LMT = "SNAP_200PCT_LMT";
        public static final String SNAP_MAX_ALLOT_AMT = "SNAP_MAX_ALLOT_AMT";
        public static final String SNAP_NETINC_LMT = "SNAP_NETINC_LMT";
        public static final String DEDUCTION_AMOUNT = "DEDUCTION_AMOUNT";
        public static final String SNAP_PARAMETERS = "SNAP_PARAMETERS";
        public static final String FIXEDTTRANSPORTATIONDEDUCTIONAMOUNT = "FixedTransportationDeductionAmount";
        public static final String RSC_PARAMETERS = "RSC_PARAMETERS";
        public static final String KTAP_PARAMETERS = "KTAP_PARAMETERS";
        public static final String KTAPLIMITS_KTAP_BDGT_NEEDS = "KTAP_BDGT_NEEDS";
        public static final String KTAPLIMITS_KTAP_MAX_GRANT = "KTAP_MAX_GRANT";
        public static final String KTAPLIMITS_KTAP_STD_NEEDS = "KTAP_STD_NEEDS";
        public static final String KTAPLIMITS_KTAP_WIN_LIMIT = "KTAP_WIN_LIMIT";
        public static final String R5_IMPLEMENTATIONDATE = "R5_IMPLEMENTATIONDATE";
        public static final String MAGI_MEDICAID_START_DATE = "MAGI_MEDICAID_START_DATE";
        public static final String REFERENCETIME = "REFERENCETIME";
        public static final String KCMAXGRANT = "KCMAXGRANT";
        public static final String LIHEAP_100PCT_LMT = "LIHEAP_100PCT_LMT";
        public static final String LIHEAP_101PCT_LMT = "LIHEAP_101PCT_LMT";
        public static final String LIHEAP_130PCT_LMT = "LIHEAP_130PCT_LMT";
        public static final String LIHEAP_34PCT_LMT = "LIHEAP_34PCT_LMT";
        public static final String LIHEAP_66PCT_LMT = "LIHEAP_66PCT_LMT";
        public static final String LIHEAP_99PCT_LMT = "LIHEAP_99PCT_LMT";
        public static final String LIHEAP_75PCT_LMT = "LIHEAP_75PCT_LMT";
        public static final String LIHEAP_COAL_ALLOT_AMT = "LIHEAP_COAL_ALLOT_AMT";
        public static final String LIHEAP_ELEC_ALLOT_AMT = "LIHEAP_ELEC_ALLOT_AMT";
        public static final String LIHEAP_FUELOIL_ALLOT_AMT = "LIHEAP_FUELOIL_ALLOT_AMT";
        public static final String LIHEAP_NATGAS_ALLOT_AMT = "LIHEAP_NATGAS_ALLOT_AMT";
        public static final String LIHEAP_PROP_ALLOT_AMT = "LIHEAP_PROP_ALLOT_AMT";
        public static final String LIHEAP_WOOD_ALLOT_AMT = "LIHEAP_WOOD_ALLOT_AMT";
        public static final String SSP_MODE_SNAP = "SSP_MODE_SNAP";
        public static final String SSP_MODE_KTAP = "SSP_MODE_KTAP";
        public static final String SSP_MODE_KC = "SSP_MODE_KC";
        public static final String SSP_MODE_QHP = "SSP_MODE_QHP";
        public static final String SSP_MODE_PLTB = "SSP_MODE_PLTB";
        public static final String SSP_MODE_NMAGI = "SSP_MODE_NMAGI";
        public static final String SSP_MODE_MAGI = "SSP_MODE_MAGI";
        public static final String RUN_PROGRAM = "Run_Program";
        public static final String SSP_MODE_CCAP = "SSP_MODE_CCAP";
        public static final String GRS_INC_LOWER_LMT = "GRS_INC_LOWER_LMT";
        public static final String GRS_INC_UPPER_LMT = "GRS_INC_UPPER_LMT";
        public static final String HH2_CHLD1 = "HH2_CHLD1";
        public static final String HH3_CHLD1 = "HH3_CHLD1";
        public static final String HH3_CHLD2_PLUS = "HH3_CHLD2_PLUS";
        public static final String HH4_CHLD1 = "HH4_CHLD1";
        public static final String HH4_CHLD2_PLUS = "HH4_CHLD2_PLUS";
        public static final String HH5_CHLD1 = "HH5_CHLD1";
        public static final String HH5_CHLD2_PLUS = "HH5_CHLD2_PLUS";
        public static final String HH2 = "HH2";
        public static final String HH3 = "HH3";
        public static final String HH4 = "HH4";
        public static final String HH5 = "HH5";
        public static final String HH6 = "HH6";
        public static final String HH7 = "HH7";
        public static final String HH8 = "HH8";
        public static final String HH8_PLUS = "HH8_PLUS";
        public static final String HH7_PLUS = "HH7_PLUS";
        public static final String HH9 = "HH9";
        public static final String HH02 = "HH02";
        public static final String HH03 = "HH03";
        public static final String HH04 = "HH04";
        public static final String HH05 = "HH05";
        public static final String HH06 = "HH06";
        public static final String HH07 = "HH07";
        public static final String HH08 = "HH08";
        public static final String HH09 = "HH09";
        public static final String HH10 = "HH10";
        public static final String HH11 = "HH11";
        public static final String HH12 = "HH12";
        public static final String HH13 = "HH13";
        public static final String HH14 = "HH14";
        public static final String HH15 = "HH15";
        public static final String DENIAL_REASON = "DENIAL_REASON";
        public static final String RFI_SNAPRN_DDC = "RFI_SNAPRN_DDC";
        public static final String RFI_MA_RN_DDC = "RFI_MA_RN_DDC";
        public static final String RFI_ALL_IN_DDC = "RFI_ALL_IN_DDC";
        public static final String EDBC_REN_DUE_DAYS = "EDBC_REN_DUE_DAYS";
        public static final String DENIAL_INDICATOR = "DENIAL_INDICATOR";
        public static final String TIMELY_UNTIMELY_FLAG = "TIMELY_UNTIMELY_FLAG ";
        public static final String TIMELY_UNTIMELY_DATE_FLAG = "TIMELY_UNTIMELY_DATE_FLAG";
        public static final String TIMELY_UNTIMELY_IMPL_DATE = "TIMELY_UNTIMELY_IMPL_DATE";
        public static final String HF_EFF_START_DATE = "HF_EFF_START_DATE";
        public static final String HF_EFF_END_DATE = "HF_EFF_END_DATE";
        public static final String HF_IMPL_END_DATE = "HF_IMPL_END_DATE";
        public static final String ROUNDING_IMPL_DT = "ROUNDING_IMPL_DT";
        public static final String APPLY_7_DAY_LOGIC_ESNP = "APPLY_7_DAY_LOGIC_ESNP";
        public static final String INTAKE_LIMIT = "INTAKE_LIMIT";
        public static final String RECERT_LIMIT = "RECERT_LIMIT";
        public static final String SMI_LIMIT = "SMI_LIMIT";
        public static final String UPPER_LIMIT = "UPPERLIMIT";
        public static final String LOWER_LIMIT = "LOWERLIMIT";
        public static final String ALTMNT_LWR_LMT = "ALTMNT_LWR_LMT";
        public static final String ALTMNT_UPR_LMT = "ALTMNT_UPR_LMT";
        public static final String WRKFR_GLHR = "WRKFR_GLHR";
        public static final String FEDMINWAGE = "FEDMINWAGE";
        public static final String RFI_OVERDUE_DAYS = "RFI_OVERDUE_DAYS";
        public static final String RFI_DENY_UNPROCESSED_VCL = "RFI_DENY_UNPROCESSED_VCL";
        public static final String PROGRAM_CODE = "PROGRAM_CODE";
        public static final String CERT_PERIOD = "CERT_PERIOD";
        public static final String IS_MID_REVIEW = "IS_MID_REVIEW";
        public static final String SNAP_IS_APPLY_CSDP_CHANGE = "SNAP_IS_APPLY_CSDP_CHANGE";
        public static final String SNAP_CSDP_EDBC_RUN_DATE = "SNAP_CSDP_EDBC_RUN_DATE";
        public static final String SWICA_CONTROL_POPULATION = "SWICA_CONTROL_POPULATION";
        public static final String RUN_KHIPP_IN_EDBC = "RUN_KHIPP_IN_EDBC";
        public static final String INCOMERFIGENERATED = "INCOMERFIGENERATED";
        public static final String NOINCOMERFIGENERATED = "NOINCOMERFIGENERATED";
        public static final String SELFEMPLOYMENTINCOMERFIGENERATED = "SELFEMPLOYMENTINCOMERFIGENERATED";
        public static final String MA = "MA";
        public static final String APTC = "APTC";
        public static final String MA_EXCLUDE = "MA_EXCLUDE";
        public static final String APTC_EXCLUDE = "APTC_EXCLUDE";
        public static final String NM = "NM";
        public static final String REFERENCECODE = "CI";
        public static final String SN = "SN";
        public static final String KTAP = "KT";
        public static final String KC = "KC";
        public static final String CCAP = "CC";
        public static final String VCL_DATA_CAPTURE_MODE = "VCL_DATA_CAPTURE_MODE";
        public static final String ENABLE_COVID19_GI_EXP = "ENABLE_COVID19_GI_EXP";
        public static final String REFERENCE_CODE_DESCRIPTION = "REFERENCE_CODE_DESCRIPTION";
        public static final String IS_MAGI_COUNTABLE = "ISMAGICOUNTABLE";
        public static final String ISAIAN = "ISAIAN";
        public static final String AMOUNTMULTIPLIERVALUE = "AMOUNTMULTIPLIERVALUE";
        public static final String AMOUNTDIVISORVALUE = "AMOUNTDIVISORVALUE";
        public static final String YEAR_ZERO = "YEAR_ZERO";
        public static final String VCL_COMPARE_ALL_INCOME = "VCI_COMPARE_ALL_INCOME";
        public static final String OVERRIDE_MAGI_MIN_MAX = "OVERRIDE_MAGI_MIN_MAX";
    }

    public static class AdditionalColumn {
        private AdditionalColumn() {

        }

        public static final String EDBCVALUE = "EDBCVALUE";
        public static final String ACESVALUE = "ACES";
        public static final String CATEGORY = "CATEGORY";
        public static final String ISFIVEYEARBANEXEMPT = "IsFiveYearBanExempt";
        public static final String MAGICOUNTABLE = "MAGICOUNTABLE";
        public static final String VRF_TABLE_NAME = "VRF_TABLE_NAME";
        public static final String VRF_CODE = "VRF_CODE";
        public static final String PGM_SNAP = "PGM_SNAP";
        public static final String PGM_SAFE = "PGM_SAFE";
        public static final String PGM_KTAP = "PGM_KTAP";
        public static final String PGM_KC = "PGM_KC";
        public static final String PGM_CCAP = "PGM_CCAP";
        public static final String PGM_ESHI = "PGM_ESHI";
        public static final String PGM_QHP = "PGM_QHP";
        public static final String PGM_SSP = "PGM_SSP";
        public static final String PGM_NMAGI = "PGM_NMAGI";
        public static final String PGM_MAGI = "PGM_MAGI";
        public static final String TABLE_NAME = "TABLE_NAME";
        public static final String IS_ACTIVE = "IS_ACTIVE";
        public static final String MSP = "MSP";
        public static final String NONMAGI = "NONMAGI";
        public static final String ORDER_BY = "ORDER_BY";
        public static final String NEW_LOGIC_FLAG_PNP = "NEW_LOGIC_FLAG_PnP";
        public static final String NEW_LOGIC_FLAG_TENF = "NEW_LOGIC_FLAG_TENF";
        public static final String NEW_LOGIC_FLAG_CCIE = "NEW_LOGIC_FLAG_CCIE";
        public static final String INCOMETYPE = "INCOMETYPE";
        public static final String CCAP_RM_UR_MBR_FLAG = "CCAP_RM_UR_MBR_FLAG";
        public static final String PP_TERMINATION_CUTOFF = "PP_TERMINATION_CUTOFF";
        public static final String AHI = "AHI";
        public static final String SWICA = "SWICA";
        public static final String VCI = "VCI";
        public static final String ISACTIVE = "ISACTIVE";
    }

    public static class VerificationDocument {
        private VerificationDocument() {

        }

        public static final String SELFEMPLOYMENTSCHEDULE = "Schedule";
        public static final String CLIENTSTATEMENT = "CS";
        public static final String COLATTERALCONTRACT = "CC";
        public static final String SSACOMPOSITE = "SS";
        public static final String NOTVERIFIED = "NV";
        public static final String ELIGIBILITYADVISOR = "EA";
        public static final String VERIFICATIONREQUIREDRENEWAL = "RR";
        public static final String CATEGORICALLYELIGIBLE = "CE";
    }

    public static class CategoricalEligibilityCode {
        private CategoricalEligibilityCode() {

        }

        public static final String EXP = "EXP";
        public static final String KTP = "KTP";
        public static final String SSI = "SSI";
    }

    public static class ExpenseVerificationType {
        private ExpenseVerificationType() {

        }

        public static final String CHILDSUPPORTANDALIMONYCODE = "CAE";
        public static final String DEPENDENTCAREEXPENSECODE = "DCE";
        public static final String DEDUCTIONCODE = "DE";
        public static final String MEDICALEXPENSECODE = "ME";
        public static final String SHELTEREXPENSECODE = "SE";
        public static final String SHORTTERMEXPENSECODE = "STE";
        public static final String UTILITYEXPENSECODE = "UE";
        public static final String WORKRELATEDCODE = "WR";
        public static final String UTILITYEXPENSEALLOWANCECODE = "UEA";
        public static final String TRANSPORTEXPENSECODE = "TE";
        public static final String SPOUSEEXPENSECODE = "SP";
        public static final String EDUCATIONEXPENSE = "EDUCATIONEXPENSE";
        public static final String MANDATORYWITHHOLDINGS = "WTH";
        public static final String WORKEXPENSES = "IBE";
    }

    public static class ResourcePreArrangedFuneralAgreementsSubType {
        private ResourcePreArrangedFuneralAgreementsSubType() {

        }

    }

    public static class ResourceExemptReasonCode {
        private ResourceExemptReasonCode() {

        }

        public static final String E064 = "E064";
        public static final String E037 = "E037";
        public static final String E057 = "E057";
    }

    public static class ResourceVerificationType {
        private ResourceVerificationType() {

        }

        public static final String LIQUIDASSET = "LA";
        public static final String EXEMPTEDRESOURCES = "EXEMPTEDRESOURCES";
        public static final String TRANSFEROFRESOURCES = "TRANSFEROFRESOURCES";
        public static final String JOINTACCOUNTS = "JOINTACCOUNTS";
        public static final String REALPROPERTY = "RP";
        public static final String LIFETEAMCAREAGREEMENT = "LTC";
        public static final String BURIALPLOTS = "BP";
        public static final String TRUST = "TR";
        public static final String LIFESETTLEMENTCONTRACT = "LSC";
        public static final String LIFEINSURANCE = "LI";
        public static final String PREARRANGEDFUNERALAGREEMENTS = "FA";
        public static final String PROMISSORNOTEORLANDCONTRACTS = "PN";
        public static final String LIFEESTATE = "LE";
        public static final String VEHICLE = "VI";
        public static final String PARTNERSHIPQUALIFIEDLTCPOLICY = "PQ";
        public static final String BURIALINSURANCE = "BI";
        public static final String OTHERRESOURCES = "OT";
        public static final String BURIALFUNDS = "BF";
        public static final String ANNUITY = "AN";
        public static final String RESOURCETRANSFER = "RT";
        public static final String RESOURCEASSESSMENT = "RA";
    }

    public static class ResourceVerificationTypeSave {
        private ResourceVerificationTypeSave() {

        }

        public static final String LIQUIDASSET = "LIQUIDASSET";
        public static final String VEHICLE = "VEHICLE";
        public static final String LIFEINSURANCE = "LIFEINSURANCE";
        public static final String PREARRANGEDFUNERALAGREEMENTS = "PREARRANGEDFUNERALAGREEMENTS";
        public static final String BURIALPLOTS = "BURIALPLOTS";
        public static final String BURIALFUNDS = "BURIALFUNDS";
        public static final String REALPROPERTY = "REALPROPERTY";
        public static final String LIFEESTATE = "LIFEESTATE";
        public static final String ANNUITY = "ANNUITY";
        public static final String TRUST = "Trust";
        public static final String PROMISSORNOTEORLANDCONTRACTS = "PROMISSORNOTEORLANDCONTRACTS";
        public static final String OTHERRESOURCES = "OTHERRESOURCES";
        public static final String LIFETEAMCAREAGREEMENT = "LIFETEAMCAREAGREEMENT";
        public static final String PARTNERSHIPQUALIFIEDLTCPOLICY = "PARTNERSHIPQUALIFIEDLTCPOLICY";
        public static final String LIFESETTLEMENTCONTRACT = "LIFESETTLEMENTCONTRACT";
        public static final String RESOURCETRANSFER = "RESOURCETRANSFER";
        public static final String RESOURCEASSESSMENT = "RESOURCEASSESSMENT";
    }

    public static class ResourceLiquidAsessetSubType {
        private ResourceLiquidAsessetSubType() {

        }

        public static final String RSRCFAIRMKTVALUE = "RSRCFAIRMKTVALUE";
        public static final String RSRCDEBTVERIFICATION = "RSRCDEBTVERIFICATION";
        public static final String EXCLUDEDAMOUNT = "EXCLUDEDAMOUNT";
        public static final String JOINTOWNERSHIP = "JOINTOWNERSHIP";
        public static final String INACCESSIBILITY = "INACCESSIBILITY";
        public static final String OWNERSHIPEND = "OWNERSHIPEND";
        public static final String CHECKINGACCOUNT = "CA";
        public static final String SAVING = "SA";
        public static final String CERTDEPOSIT = "CD";
        public static final String STABLEACCOUNT = "STA";
        public static final String STABLEACCOUNTS = "STABLEACCOUNTS";
    }

    public static class ResourceVehicleSubType {
        private ResourceVehicleSubType() {

        }

        public static final String VEHICLEDETAILS = "VEHICLEDETAILS";
        public static final String VEHICLERSRCFAIRMKTVALUE = "VEHICLERSRCFAIRMKTVALUE";
        public static final String VEHICLERSRCDEBTVERIFICATION = "VEHICLERSRCDEBTVERIFICATION";
        public static final String JOINTOWNERSHIP = "JOINTOWNERSHIP";
        public static final String INACCESSIBILITY = "INACCESSIBILITY";
        public static final String OWNERSHIPEND = "OWNERSHIPEND";
    }

    public static class ResourceLifeInsuranceSubType {
        private ResourceLifeInsuranceSubType() {

        }

        public static final String LIFEINSURANCEDETAILS = "LIFEINSURANCEDETAILS";
        public static final String LIFEINSCSVVERIFICATION = "LIFEINSCSVVERIFICATION";
        public static final String LIFEINSBALVERIFICATION = "LIFEINSBALVERIFICATION";
    }

    public static class ResourceFuneralAgreementSubType {
        private ResourceFuneralAgreementSubType() {

        }

        public static final String FDAK = "FDAK";
    }

    public static class ResourceBurialPlotsSubType {
        private ResourceBurialPlotsSubType() {

        }

        public static final String BRLPLTRSRCVALUEDETAILS = "BRLPLTRSRCVALUEDETAILS";
        public static final String BRLPLTRSRCOWNERSHIPEND = "BRLPLTRSRCOWNERSHIPEND";
    }

    public static class ResourceBurialFundsSubType {
        private ResourceBurialFundsSubType() {

        }

        public static final String BRLFNDINFOCONTAGGMNT = "BRLFNDINFOCONTAGGMNT";
        public static final String BRLFNDINFOINACCESSIBLE = "BRLFNDINFOINACCESSIBLE";
    }

    public static class ResourceRealProperty {
        private ResourceRealProperty() {

        }

        public static final String RELPRPTYFAIRMKTVALUE = "RELPRPTYFAIRMKTVALUE";
        public static final String RELPRPTYDEBTVERIFY = "RELPRPTYDEBTVERIFY";
        public static final String RELPRPTYEXCLUSION = "RELPRPTYEXCLUSION";
        public static final String RELPRPTYLSTDWITHAGENT = "RELPRPTYLSTDWITHAGENT";
        public static final String RELPRPTYLOCALADVRT = "RELPRPTYLOCALADVRT";
        public static final String RELPRPTYFORSALESIGN = "RELPRPTYFORSALESIGN";
        public static final String RELPRPTYSALEFLIERADVRT = "RELPRPTYSALEFLIERADVRT";
        public static final String RELPRPTYCOMMBULLTNNOTICE = "RELPRPTYCOMMBULLTNNOTICE";
        public static final String RELPRPTYSHOWINTPARTIES = "RELPRPTYSHOWINTPARTIES";
        public static final String RELPRPTYJOINTOWNRSHP = "RELPRPTYJOINTOWNRSHP";
        public static final String RELPRPTYINACCESIBILITY = "RELPRPTYINACCESIBILITY";
        public static final String RELPRPTYOWNSHPENDDTLS = "RELPRPTYOWNSHPENDDTLS";
    }

    public static class ResourceLifeEstateSubType {
        private ResourceLifeEstateSubType() {

        }

        public static final String ETBLSHMNTOFLIFEESTATE = "ETBLSHMNTOFLIFEESTATE";
        public static final String RELNQSHMNTDETAILS = "RELNQSHMNTDETAILS";
    }

    public static class ResourceAnnuityInformation {
        private ResourceAnnuityInformation() {

        }

        public static final String TERMINATIONENDVERIFY = "TERMINATIONENDVERIFY";
        public static final String DOCUMENT = "DOCUMENT";
    }

    public static class ResourceTermination {
        private ResourceTermination() {

        }

        public static final String TERMINATIONENDVERIFY = "TERMINATIONENDVERIFY";
        public static final String DOCUMENT = "DOCUMENT";
        public static final String DCBSSTATUSVERIFICATION = "DCBSSTATUSVERIFICATION";
    }

    public static class ResourcePromisoryNoteLandContracts {
        private ResourcePromisoryNoteLandContracts() {

        }

        public static final String PROMISORNOTELANDDTLS = "PROMISORNOTELANDDTLS";
        public static final String PROMISORNOTELANDTERMNTON = "PROMISORNOTELANDTERMNTON";
    }

    public static class ResourceOtherResources {
        private ResourceOtherResources() {

        }

        public static final String RSRCFAIRMKTVALUEVERIFY = "RSRCFAIRMKTVALUEVERIFY";
        public static final String RSRCDEBTVERIFICATION = "RSRCDEBTVERIFICATION";
        public static final String JOINTOWNERSHIPDETAILS = "JOINTOWNERSHIPDETAILS";
        public static final String INACCESIBILITY = "INACCESIBILITY";
        public static final String OWNERSHIPENDDETAILS = "OWNERSHIPENDDETAILS";
    }

    public static class ResourceLfeTmeCareAgreemnt {
        private ResourceLfeTmeCareAgreemnt() {

        }

        public static final String AGREEMNTINFORMATION = "AGREEMNTINFORMATION";
    }

    public static class ResourceLifeSettlementContract {
        private ResourceLifeSettlementContract() {

        }

        public static final String LIFESETTLEMENTCONTRACT = "LIFESETTLEMENTCONTRACT";
        public static final String LIFESETTLCNTRCTCSVVERIFY = "LIFESETTLCNTRCTCSVVERIFY";
        public static final String LIFESETTLCNTRCTLOANVERIFY = "LIFESETTLCNTRCTLOANVERIFY";
    }

    public static class ResourceTransfer {
        private ResourceTransfer() {

        }

        public static final String RETURNASSET = "RETURNASSET";
        public static final String DISABILITYVERIFICATION = "DISABILITYVERIFICATION";
        public static final String PURPOSE = "PURPOSE";
        public static final String GOODCAUSE = "GOODCAUSE";
    }

    public static class ResourceAssessment {
        private ResourceAssessment() {

        }

        public static final String ASSESSMENTINFORMATION = "ASSESSMENTINFORMATION";
    }

    public static class AlienVerificationType {
        private AlienVerificationType() {

        }

        public static final String BATTEREDALIEN = "BS";
        public static final String EXEMPTEDRESOURCES = "EXEMPTEDRESOURCES";
        public static final String TRANSFEROFRESOURCES = "TRANSFEROFRESOURCES";
        public static final String JOINTACCOUNTS = "JOINTACCOUNTS";
        public static final String LEGALALIENPERMANENT = "LAPR";
    }

    public static class ExpenseVerificationSubType {
        private ExpenseVerificationSubType() {

        }

        public static final String INSURANCECODE = "INS";
        public static final String INSURANCEDESC = "INSURANCE";
        public static final String MORTGAGECODE = "MRT";
        public static final String MORTGAGEDESC = "MORTGAGE";
        public static final String RENTCODE = "RNT";
        public static final String RENTDESC = "RENT";
        public static final String TAXCODE = "TAX";
        public static final String TAXDESC = "TAX";
        public static final String CHILDSUPPORTCODE = "CS";
        public static final String CHILDSUPPORTDESC = "CHILDSUPPORT";
        public static final String ALIMONYCODE = "AL";
        public static final String ALIMONYDESC = "ALIMONY";
        public static final String CHILDSUPPORTARREARSCODE = "CSA";
        public static final String CHILDSUPPORTARREARSDESC = "CHILDSUPPORTARREARS";
        public static final String TAXINTERCEPTCODE = "TI";
        public static final String TAXINTERCEPTDESC = "TAXINTERCEPT";
        public static final String COOKINGFUELCODE = "CF";
        public static final String COOKINGFUELDESC = "COOKINGFUEL";
        public static final String ELECTRICITYCODE = "EL";
        public static final String ELECTRICITYDESC = "ELECTRICITY";
        public static final String GARBAGECODE = "GA";
        public static final String GARBAGEDESC = "GARBAGE";
        public static final String HASRECEIVEDLIHEAPASSISTANCECODE = "LIHEAP";
        public static final String HASRECEIVEDLIHEAPASSISTANCEDESC = "LIHEAPASSISTANCE";
        public static final String ISBILLEDFORPRIMARYHEATINGCODE = "PH";
        public static final String ISBILLEDFORPRIMARYHEATINGDESC = "ISBILLEDFORPRIMARYHEATING";
        public static final String SEWAGECODE = "SW";
        public static final String SEWAGEDESC = "SEWAGE";
        public static final String TELEPHONECODE = "TP";
        public static final String TELEPHONEDESC = "TELEPHONE";
        public static final String WATERCODE = "WA";
        public static final String WATERDESC = "WATER";
        public static final String DEPENDENTCARECODE = "DC";
        public static final String DEPENDENTCAREDESC = "DEPENDENTCARE";
        public static final String SUACODE = "SUA";
        public static final String SUADESC = "SUA";
        public static final String BUACODE = "BUA";
        public static final String BUADESC = "BUA";
        public static final String TELEPHONESTANDARDCODE = "TSD";
        public static final String TELEPHONESTANDARDCODEDESC = "TELEPHONESTANDARD";
        public static final String TRANSPORTATIONCODE = "TR";
        public static final String TRANSPORTATIONDESC = "TRANSPORTATION";
        public static final String CHILDCARECODE = "CC";
        public static final String CHILDCAREDESC = "CHILDCARE";
        public static final String UTILITIESCODE = "UT";
        public static final String UTILITIESDESC = "UTILITIES";
        public static final String HOUSINGCODE = "HO";
        public static final String HOUSINGDESC = "HOUSING";
        public static final String EMPLOYMENTEXPENSECODE = "EE";
        public static final String EMPLOYMENTEXPENSEDESC = "EMPLOYMENTEXPENSE";
        public static final String RELOCATIONCODE = "RE";
        public static final String RELOCATIONDESC = "RELOCATION";
        public static final String SHORTTERMINSURANCECODE = "IN";
        public static final String SHORTTERMINSURANCEDESC = "INSURANCE";
        public static final String TAXESLICENSECODE = "TX";
        public static final String TAXESLICENSEDESC = "TAXESLICENSE";
        public static final String HOUSEHOLDFURNISHINGCODE = "HF";
        public static final String HOUSEHOLDFURNISHINGDESC = "HOUSEHOLDFURNISHING";
        public static final String CRIMINALRECORDCHECKCODE = "CR";
        public static final String CRIMINALRECORDCHECKDESC = "CRIMINALRECORDCHECK";
        public static final String DRUGTESTCODE = "DR";
        public static final String DRUGTESTDESC = "DRUGTEST";
        public static final String OTHERMANDATORYCODE = "OM";
        public static final String OTHERMANDATORYCODEDESC = "OTHERMANDATORYWITHHOLDINGS";
        public static final String MANDATORYTAXESCODE = "MT";
        public static final String MANDATORYTAXESDESC = "MANDATORYTAXES";
        public static final String IRWE = "IRWE";
        public static final String BWE = "BWE";
        public static final String WR = "WR";
        public static final String BW = "BW";
    }

    public static class MedicalExpenseSubType extends ExpenseVerificationSubType {
        private MedicalExpenseSubType() {

        }

        public static Map<String, String> getMedicalExpenseType() {

            Map<String, String> medicalExpenseType = new HashMap<>();
            medicalExpenseType.put("CPP", "CANCERPOLICYPREMIUM"); // MEDICALEXPENSETYPE vrf
            medicalExpenseType.put("CSD", "COSTSHARINGXPENSES");
            medicalExpenseType.put("DN", "DENTURES");
            medicalExpenseType.put("HA", "HEARINGAIDS");
            medicalExpenseType.put("PR", "PROSTHETICS");
            medicalExpenseType.put("SA", "SECURINGSERVICEANIMALS");
            medicalExpenseType.put("GC", "GLASSESCONTACTS");
            medicalExpenseType.put("TC", "TELEPHONECHARGES");
            medicalExpenseType.put("TR", TRANSPORTATIONDESC);
            medicalExpenseType.put("LD", "LODGING");
            medicalExpenseType.put("HH", "ATTENDANTHOUSEKEEPER");
            medicalExpenseType.put("SMI", "SMIPREMIUM");
            medicalExpenseType.put("MP", "MEDICAREPREMIUMS");
            medicalExpenseType.put("OT", "OTHER");
            medicalExpenseType.put("MN", "MEDICALLYDOCTORNOTE");
            medicalExpenseType.put("MS", "MEDICALSUPPLIES");
            medicalExpenseType.put("HIP", "HEALTHINSURANCEPREMIUM");
            medicalExpenseType.put("PD", "PRESCRIPTIONDRUG");
            return medicalExpenseType;
        }

    }

    public static class DeductionExpenseSubType extends ExpenseVerificationSubType {
        private DeductionExpenseSubType() {

        }

        public static Map<String, String> getDeductionExpenseType() {

            Map<String, String> deductionExpenseType = new HashMap<>();
            deductionExpenseType.put("SE", "NONREIMBURSABLEEDUCATOREXPENSE");
            deductionExpenseType.put("SH", "TUITIONANDFEES");
            deductionExpenseType.put("AL", ALIMONYDESC);
            deductionExpenseType.put("SLI", "STUDENTLOANINTEREST");
            deductionExpenseType.put("AIAN", "AIANINCOME");
            deductionExpenseType.put("BE", "BUSINESSEXPENSESOFRESERVISTSANDOFFICIALS");
            deductionExpenseType.put("HAS", "HEALTHSAVINGSACCOUNTDEDUCTION");
            deductionExpenseType.put("ME", "MOVINGEXPENSES");
            deductionExpenseType.put("SET", "DEDUCTIBLEPARTOFSELFEMPLOYMENTTAX");
            deductionExpenseType.put("SSP", "SELFEMPLOYEDSIMPLEPLANS");
            deductionExpenseType.put("SQP", "SELFEMPLOYEDQUALIFIEDPLANS");
            deductionExpenseType.put("SHI", "SELFEMPLOYEDHEALTHINSURANCE");
            deductionExpenseType.put("EWS", "PENALTYONEARLYWITHDRAWALOFSAVINGS");
            deductionExpenseType.put("IRA", "IRADEDUCTION");
            deductionExpenseType.put("DPA", "DOMESTICPRODUCTIONACTIVITIES");
            return deductionExpenseType;
        }

    }

    public static class ReferenceTableRowValue {
        private ReferenceTableRowValue() {

        }

        public static final String SAFE_IND_MIN_ALT_SHL_LMT = "SAFE_IND_MIN_ALT_SHL_LMT";
        public static final String SAFE_IND_MAX_ALT_SHL_LMT = "SAFE_IND_MAX_ALT_SHL_LMT";
        public static final String SAFE_IND_SHL_EXP_LMT = "SAFE_IND_SHL_EXP_LMT";
        public static final String SAFE_CP_SHL_EXP_LMT = "SAFE_CP_SHL_EXP_LMT";
        public static final String SAFE_CP_MAX_ALT_SHL_LMT = "SAFE_CP_MAX_ALT_SHL_LMT";
        public static final String SAFE_CP_MIN_ALT_SHL_LMT = "SAFE_CP_MIN_ALT_SHL_LMT";
        public static final String SNAP_RSC_LMT = "SNAP_RSC_LMT";
        public static final String SNAP_ADJ_IN_PCT = "SNAP_ADJ_IN_PCT";
        public static final String SNAP_ELDRLY_RSC_LMT = "SNAP_ELDRLY_RSC_LMT";
        public static final String SNAP_RSC_TFR_PENALTY1 = "SNAP_RSC_TFR_PENALTY1";
        public static final String SNAP_RSC_TFR_PENALTY2 = "SNAP_RSC_TFR_PENALTY2";
        public static final String SNAP_RSC_TFR_PENALTY3 = "SNAP_RSC_TFR_PENALTY3";
        public static final String SNAP_RSC_TFR_PENALTY4 = "SNAP_RSC_TFR_PENALTY4";
        public static final String SNAP_RSC_TFR_PENALTY5 = "SNAP_RSC_TFR_PENALTY5";
        public static final String SNAP_BS_ULT_ALW = "SNAP_BS_ULT_ALW";
        public static final String SNAP_CONTR_IN_LMT = "SNAP_CONTR_IN_LMT";
        public static final String SNAP_ED_DED_PCT = "SNAP_ED_DED_PCT";
        public static final String SNAP_HF_ED_DED_PCT = "SNAP_HF_ED_DED_PCT";
        public static final String SNAP_ELD_AGE = "SNAP_ELD_AGE";
        public static final String SNAP_EXC_SHL_PCT = "SNAP_EXC_SHL_PCT";
        public static final String SNAP_EXD_IN_LTM_AMT = "SNAP_EXD_IN_LMT_AMT";
        public static final String SNAP_EXD_LQ_RSC_LMT_AMT = "SNAP_EXD_LQ_RSC_LMT_AMT";
        public static final String SNAP_FARM_MIN_AMT = "SNAP_FARM_MIN_AMT";
        public static final String SNAP_HOMELESS_STD = "SNAP_HOMELESS_STD";
        public static final String SNAP_MAX_EXS_SHL_AMT = "SNAP_MAX_EXS_SHL_AMT";
        public static final String SNAP_MED_EXP_LMT = "SNAP_MED_EXP_LMT";
        public static final String SNAP_MIN_ALT_AMT = "SNAP_MIN_ALT_AMT";
        public static final String SNAP_NON_COMP_PEN_PCT = "SNAP_NON_COMP_PEN_PCT";
        public static final String SNAP_SE_WKL_HRS_THD = "SNAP_SE_WKL_HRS_THD";
        public static final String SNAP_STD_DED_AMT = "SNAP_STD_DED_AMT";
        public static final String SNAP_STD_ULT_ALW = "SNAP_STD_ULT_ALW";
        public static final String SNAP_TEL_STD_AMT = "SNAP_TEL_STD_AMT";
        public static final String SNAP_MIN_WAG_AMT = "SNAP_MIN_WAG_AMT";
        public static final String CHLD_SUPPORT_DSRD = "CHLD_SUPPORT_DSRD";
        public static final String KTAP_IDA_LMT_AMT = "KTAP_IDA_LMT_AMT";
        public static final String KTAP_WK_EXP_STD = "KTAP_WK_EXP_STD";
        public static final String MAX_FAD_AMT = "MAX_FAD_AMT";
        public static final String KINSHIP_CARE_RSC_LMT = "KINSHIP_CARE_RSC_LMT";
        public static final String KTAP_RSC_LMT = "KTAP_RSC_LMT";
        public static final String APPLICATIONSIGNATUREPERIOD = "RFI_APPL_SIGNATURE_PERIOD";
        public static final String R5_IMPLEMENTATIONDATE = "R5_IMPLEMENTATIONDATE";
        public static final String LIHEAP_NS_UNDER_34PCT_FPL = "LIHEAP_NS_UNDER_34PCT_FPL";
        public static final String LIHEAP_NS_UNDER_66PCT_FPL = "LIHEAP_NS_UNDER_66PCT_FPL";
        public static final String LIHEAP_NS_UNDER_99PCT_FPL = "LIHEAP_NS_UNDER_99PCT_FPL";
        public static final String LIHEAP_SU_UNDER_34PCT_FPL = "LIHEAP_SU_UNDER_34PCT_FPL";
        public static final String LIHEAP_SU_UNDER_66PCT_FPL = "LIHEAP_SU_UNDER_66PCT_FPL";
        public static final String LIHEAP_SU_UNDER_99PCT_FPL = "LIHEAP_SU_UNDER_99PCT_FPL";
        public static final String INC_RANGE = "INC_RANGE_";
        public static final String FPL_150 = "FPL_150";
        public static final String FPL_165 = "FPL_165";
        public static final String SMI_85 = "SMI_85";
        public static final String PO = "PT";
        public static final String PV = "PR";
        public static final String MSP = "MSP";
        public static final String EDBC_RUN_DATE = "EDBC_RUN_DATE";
        public static final String RI_DATE = "RI_DATE";
        public static final String REQUEST_DATE = "REQUEST_DATE";
        public static final String APPLICATIONSIGNATUREFORTARGET = "APPL_SIG_FOR_TARGET";
        public static final String APPLICATIONSIGNATUREFORHOH = "APPL_SIG_FOR_HOH";
        public static final String CAT_ELIG_MA_GROUP = "CAT_ELIG_MA_GROUP";
        public static final String INACTIVEAPTCANDQHP = "FFM_APTC_Flag";
        public static final String INACTIVEAPTCANDQHPEFFECTIVEDATE = "FFM_APTC_EFDate";
        public static final String ISRETAINNEXTMONTHEDG = "RETAIN_MA_NXTMTH_EDG_FLAG";
        public static final String CC_INC_LIMIT = "CC_INC_LIMIT";
        public static final String HBEH_IMPLEMENTATIONDATE = "HBEH_IMPLEMENTATIONDATE";
        public static final String HBEH_MF_STARTDATE = "HBEH_MF_STARTDATE";
        public static final String HBEH_CE_STARTDATE = "HBEH_CE_STARTDATE";
        public static final String HBEH_PE_CS_STARTDATE = "HBEH_PE_CS_STARTDATE";
        public static final String HBEH_PE_VW_STARTDATE = "HBEH_PE_VW_STARTDATE";
        public static final String HBEH_PE_RE_STARTDATE = "HBEH_PE_RE_STARTDATE";
        public static final String HBEH_PE_CE_STARTDATE = "HBEH_PE_CE_STARTDATE";
        public static final String HBEH_PLANTYPE_STARTDATE = "HBEH_PLANTYPE_STARTDATE";
        public static final String HBEH_SU_STARTDATE = "HBEH_SU_STARTDATE";
        public static final String RRC_RESTRICT = "RRC_RESTRICT";
        public static final String HBEH_RETRO_STARTDATE = "HBEH_RETRO_STARTDATE";
        public static final String HBEH_IS_APPLY_STC_CHANGES = "HBEH_IS_APPLY_STC_CHANGES";
        public static final String HBEH_STC_START_DATE = "HBEH_STC_START_DATE";
        public static final String HBEH_DIVORCE_AGREEMENT_DT = "HBEH_Divorce_Agreement_DT";
        public static final String CI = "CI";
        public static final String REFERENCECODE = "CI";
        public static final String SN = "SN";
        public static final String CENSUS_INCOME = "CI";
        public static final String PAUI = "PAUI";
        public static final String ENABLE_COVID19 = "ENABLE_COVID19";
        public static final String COVID19_STARTDATE = "COVID19_StartDate";
    }

    public static class CaseMode {
        private CaseMode() {

        }

        public static final String ACTIVE = "AC";
        public static final String CHANGE = "CN";
        public static final String CONVERSION = "CV";
        public static final String INACTIVE = "IA";
        public static final String INTAKE = "IN";
        public static final String ONGOING = "AC";
        public static final String PERIODICREVIEW = "PR";
        public static final String REINSTATE = "RI";
        public static final String RENEWAL = "RN";
    }

    public static class CaseProgramStatus {
        private CaseProgramStatus() {

        }

        public static final String APPROVED = "AP";
        public static final String DENIED = "DN";
        public static final String DISCONTINUED = "DC";
        public static final String PENDING = "PE";
        public static final String WITHDRAWN = "WD";
        public static final String NULL = null;
    }

    public static class EDBCRunMode {
        private EDBCRunMode() {

        }

        public static final String BATCH = "Batch";
        public static final String ONLINE = "Online";
    }

    public static class WithdrawalTypeCode {
        private WithdrawalTypeCode() {

        }

        public static final String WRITTEN = "WR";
    }

    public static class CaseStatus {
        private CaseStatus() {

        }

        public static final String APPROVED = "AP";
        public static final String DENIED = "DN";
        public static final String DISCONTINUED = "DC";
        public static final String PENDING = "PE";
    }

    public static class SSIBenefitStatusCode {
        private SSIBenefitStatusCode() {

        }

        public static final String APPROVED = "AP";
        public static final String DENIED = "DN";
        public static final String DISCONTINUED = "DC";
        public static final String PENDING = "PE";
    }

    public static class EDBCBenefitStatus {
        private EDBCBenefitStatus() {

        }

        public static final String INCREASE = "IN";
        public static final String DECREASE = "DE";
        public static final String CERTIFY = "CE";
        public static final String DENY = "DN";
        public static final String PENDING = "PE";
        public static final String SUSTAIN = "SU";
        public static final String NOSUPPLEMENT = "NS";
        public static final String OVERRIDE = "OV";
    }

    public static class EligibilityActionCode {
        private EligibilityActionCode() {

        }

        public static final String APPROVED = "11";
        public static final String CLOSED = "12";
        public static final String DENIED = "13";
        public static final String PENDING = "31";
        public static final String SUPPLEMENT = "51";
        public static final String ONGOINGBENEFITCHANGE = "52";
        public static final String OPREFERRAL = "53";
        public static final String NOOPREFERRAL = "54";
        public static final String NOCHANGE = "55";
    }

    public static class DefaultDate {
        private DefaultDate() {

        }

        public static final LocalDateTime MaxDate = LocalDateTime.of(9999, 12, 31, 0, 0);
        public static final LocalDateTime MinDate = LocalDateTime.of(0001, 01, 01, 0, 0);
        public static final LocalDateTime DBMinDate = LocalDateTime.of(1975, 01, 01, 0, 0);
        public static final LocalDateTime HighDate = LocalDateTime.of(9999, 12, 31, 0, 0);
        public static final LocalDateTime LowDate = LocalDateTime.of(0001, 01, 01, 0, 0);
        public static final LocalDateTime CompareLowDate = LocalDateTime.of(1000, 01, 01, 0, 0);
        public static final LocalDateTime RTTaxFilingLimitsEffectiveDate = LocalDateTime.of(2015, 01, 01, 0, 0);
        public static final LocalDateTime HighDateWithTime = LocalDateTime.of(9999, 12, 31, 23, 59, 59, 997);
        public static final LocalDateTime TaxMemberEndDate = LocalDateTime.of(2020, 12, 31, 0, 0);
    }

    public static class StartDate {
        private StartDate() {

        }

        public static final LocalDateTime NonMAGIStartDate = LocalDateTime.of(2015, 03, 01, 0, 0);
        public static final LocalDateTime KTAPStartDate = LocalDateTime.of(2015, 03, 01, 0, 0);
        public static final LocalDateTime SNAPStartDate = LocalDateTime.of(2015, 03, 01, 0, 0);
        public static final LocalDateTime APTCQHPDeniedTerminateBenefitsDate = LocalDateTime.of(2017, 01, 01, 0, 0);
    }

    public static class CustodyType {
        private CustodyType() {

        }

        public static final String FOSTERCARE = "F";
        public static final String JUVENILEJUSTICE = "J";
        public static final String SUBSIDIZEDADOPTION = "S";
        public static final String DAIL = "D";
    }

    public static class EDMRunMode {
        private EDMRunMode() {

        }

        public static final String PROGRAM = "0";
        public static final String EDM = "1";
    }

    public static class AppKeys {
        private AppKeys() {

        }

        public static final String EDMRUNMODE = "1";
        public static final String LOCKDURATION = "300";
        public static final String ISDEBUG = "true";
        public static final String EXCEPTIONDETAILSSIZE = "8000";
        public static final String LOGBUFFERSIZE = "8000";
        public static final String ADVERSEACTIONDAYS = "13";
        public static final String INVOKEMA = "false";
        public static final String ISMCITOBETRIGGED = "false";
        public static final String ISMCIEXCEPTIONTOBETHROWN = "false";
        public static final String ISCERTIFICATETOBEIGNORED = "false";
        public static final String ISFTITOBETRIGGERED = "false";
        public static final String ISAVSTOBETRIGGERED = "false";
        public static final String ISCORRESPONDENCETOBETRIGGED = "false";
        public static final String MCICALLFROMBINARIES = "false";
        public static final String ISDCINDIVIDUALTOBEUPDATEDFORMCIBATCH = "false";
        public static final String GETDCDATAUSINGPROCEDURE = "false";
        public static final String ENABLEPERFLOGGING = "false";
        public static final String USEGENERICRENEWALCLOSUREPROCESS = "Y";
        public static final String USENEWEDMLOGIC = "Y";
        public static final String READEDMDATA = "false";
        public static final String SAVEEDMDATA = "false";
        public static final String EDBC_PROCESSPENDINGAPPLICATIONINBATCH = "Y";
        public static final String ISLASTVERIFIEDINCOMELOGIC = "Y";
        public static final String LOGINCOMEFROMDATASOURCE = "false";
    }

    public static class LogIncomeSource {
        private LogIncomeSource() {

        }

        public static final String SWICASTATESOURCE = "Swica-StateUnemploymentBenefit";
        public static final String SWICAWAGESSOURCE = "Swica-SwicaWagesIncome";
        public static final String FEDIRSSOURCE = "Fed-IrsResponseVerificationDetail";
        public static final String VCISOURCE = "Vci-VerifyCurrentIncome";
        public static final String VCIPAYPERIODSOURCE = "Vci-PayPeriodInformation";
    }

    public static class EligibilityDetermination {
        private EligibilityDetermination() {

        }

        public static final String EDBC = "EDBC";
        public static final String HHC = "HHC";
    }

    public static class RequestTriggerStatusCode {
        private RequestTriggerStatusCode() {

        }

        public static final String NEW = "NEW";
    }

    public static class PrintMode {
        private PrintMode() {

        }

        public static final String BATCHPRINT = "BP";
    }

    public static class HBEProgramCategory {
        private HBEProgramCategory() {

        }

        public static List<String> NMAGICategoryCodes = Collections
                .unmodifiableList(Arrays.asList("FACILITY", "HOSPICE", "MSP", "NM", "NMSD", "SSP", "TLNM", "WAIVER"));
    }

    public static class CoresspondenceTriggerCode {
        private CoresspondenceTriggerCode() {

        }

        public static final String HBE001 = "HBE-001";
        public static final String HBE051 = "HBE-051";
        public static final String HBE014 = "HBE-014";
        public static final String WPM023 = "WPM-023";
        public static final String EDB033 = "EDB-033";
        public static final String EDB056 = "EDB-056";
        public static final String EDB051 = "EDB-051";
        public static final String EDB062 = "EDB-062";
        public static final String EDB030 = "EDB-030";
        public static final String EDB085 = "EDB-085";
        public static final String C142 = "C-142";
        public static final String EDB082 = "EDB-082";
        public static final String DCC091 = "DCC-091";
        public static final String DCC94C = "DCC-94C";
    }

    public static class CoresspondenceMiscellaneousParameters {
        private CoresspondenceMiscellaneousParameters() {

        }

        public static final String EDB030_PARAMNAMES = "OpeningStatementFlag";
        public static final String WPM023_PARAMNAME = "ActivityMode";
        public static final String EDB033_PARAMNAME = "IsRemainderRFI";
    }

    public static class CCAPCOPAYTYPE {
        private CCAPCOPAYTYPE() {

        }

        public static final String WAIVED = "WA";
        public static final String COURTORDER = "CO";
        public static final String SYSTEMCALCULATED = "SC";
    }

    public static class CCAPApprovalReason {
        private CCAPApprovalReason() {

        }

        public static final String EDUCATION = "ED";
    }

    public static class BillStatusCode {
        private BillStatusCode() {

        }

        public static final String UNPAID = "UP";
        public static final String PAID = "P";
    }

    public static class PriorDays {
        private PriorDays() {

        }

        public static final int NINETYDAYS = 90;
    }

    public static class EDBCDiscrepancyCode {
        private EDBCDiscrepancyCode() {

        }

        public static final String OVERPAYMENT = "OV";
        public static final String UNDERPAYMENT = "UN";
        public static final String NOCHANGE = "NC";
        public static final String OVERPAYMENTCOPAY = "OVC";
        public static final String OVERPAYMENTINELIGIBILITY = "OVI";
    }

    public static class SupplementOverpaymentReason {
        private SupplementOverpaymentReason() {

        }

        public static final String DECREASEINHOUSEHOLDMEMBERS = "EL1627";
        public static final String INCREASEINHOUSEHOLDMEMBERS = "EL1628";
        public static final String DECREASEDINEARNEDINCOME = "EL1629";
        public static final String INCREASEDINEARNEDCOME = "EL1630";
        public static final String DECREASEDINUNEARNEDINCOME = "EL1631";
        public static final String INCREASEDINUNEARNEDCOME = "EL1632";
        public static final String KTAPGRANTDECREASED = "EL1633";
        public static final String KTAPGRANTINCREASED = "EL1634";
        public static final String DECREASEDINCHILDCAREEXPENSE = "EL1635";
        public static final String INCREASEDINCHILDCAREEXPENSE = "EL1636";
        public static final String DECREASEDINDEPENDENTCAREEXPENSE = "EL1637";
        public static final String INCREASEDINDEPENDENTCAREEXPENSE = "EL1638";
        public static final String DECREASEDINMEDICALEXPENSE = "EL1639";
        public static final String INCREASEDINMEDICALEXPENSE = "EL1640";
        public static final String DECREASEDINSHELTEREXPENSE = "EL1641";
        public static final String INCREASEDINSHELTEREXPENSE = "EL1642";
        public static final String DECREASEDDUETOCHANGEINLIMIT = "EL1658";
        public static final String INCREASEDDUETOCHANGEINLIMIT = "EL1659";
    }

    public static class TriggerSourceCode {
        private TriggerSourceCode() {

        }

        public static final String EDBC_SYSTEM_TRG = "EDBC_SYSTEM_TRG";
    }

    public static class ProgramOrderList {
        private ProgramOrderList() {

        }

        public static List<String> ProgramPriorityList = Collections.unmodifiableList(
                Arrays.asList(ProgramCode.KINSHIPCARE, ProgramCode.KTAP, ProgramCode.LIHEAP, ProgramCode.QHP,
                        ProgramCode.MEDICAID, ProgramCode.SAFE, ProgramCode.SNAP, ProgramCode.ESHI, ProgramCode.CCAP));
    }

    public static class ProgramDependencies {
        private ProgramDependencies() {

        }

        public static List<String> MA = Collections.unmodifiableList(Arrays.asList(ProgramCode.QHP));
        public static List<String> SNAP = Collections.unmodifiableList(Arrays.asList(ProgramCode.SAFE));
        public static List<String> SAFE = Collections.unmodifiableList(Arrays.asList(ProgramCode.SNAP));
        public static List<String> KC = Collections.unmodifiableList(
                Arrays.asList(ProgramCode.SNAP, ProgramCode.SAFE, ProgramCode.KTAP, ProgramCode.CCAP));
        public static List<String> KTAP = Collections.unmodifiableList(
                Arrays.asList(ProgramCode.SNAP, ProgramCode.SAFE, ProgramCode.KINSHIPCARE, ProgramCode.CCAP));
    }

    public static class LoggingType {
        private LoggingType() {

        }

        public static final int INFO = 1;
        public static final int ERROR = 2;
        public static final int DEBUG = 3;
    }

    public static class EligibilityIndicator {
        private EligibilityIndicator() {

        }

        public static final String AUTHORIZED = "A";
        public static final String CANCELLED = "C";
        public static final String RETAIN = "E";
        public static final String NOISSUANCECHANGE = "V";
        public static final String PROCESSED = "P";
        public static final String RETURNFORCORRECTION = "K";
        public static final String SUPERVISORREVIEWTOAUTHORIZE = "S";
        public static final String TEMPORARY = "T";
        public static final String Q = "Q";
        public static final String INVALID = "Z";
        public static final String CLAIMREFERRAL = "R";
        public static final String M = "M";
        public static final String OVERLAPPEDLTC = "O";
        public static final String NOSUPPLEMENT = "B";
    }

    public static class CSRAAMOUNT {
        private CSRAAMOUNT() {

        }

        public static final String MAXCSRALIMITAMOUNT = "MAX_CSRA_LMT";
        public static final String MINCSRALIMITAMOUNT = "MIN_CSRA_LMT";
        public static final String ALEUTIANPAYMENTEXCLUSIONAMOUNT = "RSC_ALTN_EXCL_AMT";
        public static final String JAPANESEEXCLUSIONAMOUNT = "RSC_JAP_EXCL_AMT";
        public static final String VEHICLEEXCLUSIONAMOUNT = "RSC_VEH_EXCL_AML";
        public static final String BURIALEXCLUSIONAMOUNT = "RSC_BUR_EXCL_AMT";
        public static final String INSTITUTIONEDINDIVIDUALRESOURCEAMOUNT = "NM_ABD_RSC_LMT_HH1";
        public static final String REALPROPERTYEXCLUSIONAMOUNT = "REAL_PROP_EXC_AMT";
        public static final String HOMESTEADFAIRMARKETVALUE = "HOMESTEAD_FMV_LMT_AMT";
    }

    public static class CSRAStatus {
        private CSRAStatus() {

        }

        public static final String TEMPORARYRECORDS = "0";
        public static final String AUTHORIZEDRECORDS = "1";
        public static final int LENGTH = 2;
    }

    public static class CSRAStatusCode {
        private CSRAStatusCode() {

        }

        public static final String APPROVED = "Approved";
        public static final String PENDING = "Pending";
        public static final String CANCELLED = "Cancelled";
        public static final String PENDINGVERIFICATION = "Pending Verification";
    }

    public static class CSRARunMode {
        private CSRARunMode() {

        }

        public static final String CALCULATE = "Calculate";
        public static final String RECALCULATE = "Calculate";
        public static final String AUTHORIZE = "Authorize";
    }

    public static class CSRAApplicationMode {
        private CSRAApplicationMode() {

        }

        public static final String CSRA = "CSRA";
        public static final String MEDICAID = "MA";
    }

    public static class GroupIndicator {
        private GroupIndicator() {

        }

        public static final String CERTIFIEDGROUP = "C";
        public static final String ELIGIBLEGROUP = "E";
        public static final String EXCLUDEDGROUP = "X";
        public static final String NULL = null;
    }

    public static class HighestLevelEducationCode {
        private HighestLevelEducationCode() {

        }

        public static final String HIGHSCHOOL = "HG";
        public static final String MIDDLESCHOOL = "MS";
        public static final String ELEMENTARYSCHOOL = "ES";
        public static final String GED = "GED";
    }

    public static class IncomeSource {
        private IncomeSource() {

        }

        public static final String EMPLOYMENT = "EMPLOYMENT";
        public static final String OTHEREARNED = "OTHER_EARNED";
        public static final String SELFEMPLOYMENT = "SELF_EMPLOYMENT";
        public static final String UNEARNED = "UNEARNED";
        public static final String APTCAMOUNT = "APTC";
        public static final String ALLADVANCEDINCOME = "ALL_ADVANCED_INCOME";
        public static final String EXPENSE = "EXPENSE";
        public static final String SELFEXPENSE = "SELF_EMPL_EXPENSE";
        public static final String QUALIFIEDINCOMETRUST = "QIT";
        public static final String PNP = "PP";
    }

    public static class IncomeCategoryCode {
        private IncomeCategoryCode() {

        }

        public static final String EARNED = "EN";
        public static final String OTHERINCOME = "OI";
        public static final String SELFEMPLOYMENT = "SE";
        public static final String UNEARNED = "UN";
        public static final String APTC = "APTC";
        public static final String QIT = "QT";
        public static final String PNP = "PP";
        public static final String FTIINCOME = "FTI";
        public static final String IMAINCOME = "IMA";
        public static final String TRBINCOME = "TRB";
    }

    public static class Detail {
        private Detail() {

        }

        public static final String INCOME = "IN";
        public static final String EXPENSE = "EX";
    }

    public static class ExpenseCategoryCode {
        private ExpenseCategoryCode() {

        }

        public static final String CHILDSUPPORT = "CAE";
        public static final String DEPENDENTCARE = "DCE";
        public static final String MEDICALEXPENSE = "ME";
        public static final String WORKRELATED = "WR";
        public static final String IRWE_BWE = "IBE";
        public static final String UTILITY = "UE";
        public static final String SHELTER = "SE";
        public static final String UTILITYALLOWANCE = "UEA";
        public static final String SHORTTERMEXPENSE = "STE";
        public static final String MANDATORYWITHHOLDINGS = "WTH";
    }

    public static class ExpenseSource {
        private ExpenseSource() {

        }

        public static final String CHILDSUPPORT = "CHILD_SUPPORT";
        public static final String DEPENDENTCARE = "DEPENDENTCARE";
        public static final String MEDICALEXPENSE = "MEDICAL_EXP";
        public static final String WORKRELATED = "WORK_REL";
        public static final String IRWE_BWE_EXPENSE = "IRWE_BWE_EXP";
        public static final String UTILITY = "UTILITY";
        public static final String SHELTER = "SHELTER";
        public static final String DEDUCTION = "DEDUCTION";
        public static final String SHORTTERMEXPENSE = "SHORTTERMEXPENSE";
        public static final String UTILITYALLOWANCE = "UTILITY_ALLOWANCE";
        public static final String SPOUSEEXPENSE = "SPOUSAL_EXPENSE";
        public static final String EXPENSE = "EXPENSE";
        public static final String MANDATORYWITHHOLDINGS = "MANDATORY_WITHHOLDINGS";
    }

    public static class Source {
        private Source() {

        }

        public static final String DC = "DC";
        public static final String SSP = "SSP";
        public static final String WP = "WP";
        public static final String MU = "MU";
        public static final String CONV = "CONV";
        public static final String COLA = "COLA";
        public static final String NULL = null;
    }

    public static class ModuleName {
        private ModuleName() {

        }

        public static final String DISPOSITION = "DI";
        public static final String EDBC = "EDBC";
        public static final String EDG = "EDG";
        public static final String FINANCIAL = "FIN";
        public static final String NONFINANCIAL = "NF";
        public static final String RESOURCE = "RSC";
        public static final String VERIFICATION = "VCL";
    }

    public static class DetailType {
        private DetailType() {

        }

        public static final String INCOME = "IN";
        public static final String EXPENSE = "EX";
    }

    public static class ProcessId {
        private ProcessId() {

        }

        public static final String DC = "WP-EDG";
        public static final String EDBC = "EDBC";
        public static final String EDBC_PTLB = "EDBC-PTLB";
        public static final String SSP = "SSP-EDBC";
        public static final String BATCHRENEWALDENIAL = "BATCH-RN-DN";
        public static final String PNPRENEWALDENIAL = "BATCH-PP-DN";
        public static final String BATCHDISABILITYDENIALCASES = "BATCH-DIS-DN";
        public static final String MUEDBC = "BATCH-EDBC";
        public static final String DISPOSITION = "DI";
        public static final String DISPOSITIONMCI = "DI-MCI";
        public static final String SSPDISPOSITION = "SSP-DI";
        public static final String WORKERPORTALDISPOSITION = "WP-DI";
        public static final String MUDISPOSITION = "BATCH-DI";
        public static final String CONVDISPOSITION = "CONV-DI";
        public static final String COLADISPOSITION = "COLA-DI";
        public static final String EDG = "EDG";
        public static final String QHP = "QHP";
        public static final String CONVEDBC = "CONV-EDBC";
        public static final String COLAEDBC = "COLA-EDBC";
        public static final String BATCHMARENEWALDENIAL = "BATCH-MA-RN-DN";
        public static final String BATCHPTRENEWALDENIAL = "BATCH-PT-RN-DN";
        public static final String CONVERSIONBATCH = "CONV-BATCH";
        public static final String DIPOSTPROCESSBATCH = "DPP-BATCH";
        public static final String BATCHAPTCQHPRENEWAL = "APTCQHP-DECOMM";
        public static final String DC_PRESUMPTIVE = "WP-EDG-PE";
        public static final String DISPOSITION_PRESUMPTIVE = "DI-PE";
        public static final String SSPDISPOSITION_PRESUMPTIVE = "SSP-DI-PE";
        public static final String WORKERPORTALDISPOSITION_PRESUMPTIVE = "WP-DI-PE";
        public static final String MUDISPOSITION_PRESUMPTIVE = "BATCH-DI-PE";
        public static final String CONVDISPOSITION_PRESUMPTIVE = "CONV-DI-PE";
        public static final String COLADISPOSITION_PRESUMPTIVE = "COLA-DI-PE";
        public static final String EDBC_PRESUMPTIVE = "EDBC-PE";
        public static final String EDG_PRESUMPTIVE = "EDG-PE";
        public static final String SSP_PRESUMPTIVE = "SSP-EDBC-PE";
        public static final String MUEDBC_PRESUMPTIVE = "BATCH-EDBC-PE";
        public static final String CONVEDBC_PRESUMPTIVE = "CONV-EDBC-PE";
        public static final String COLAEDBC_PRESUMPTIVE = "COLA-EDBC-PE";
        public static final String CONVERSION = "CV";
        public static final String NEWAPP = "-New-App";
        public static final String CCAPPOSTGRACERENEWALDENIAL = "BATCH-PG-DN";
    }

    public static class LogSource {
        private LogSource() {

        }

        public static final String EDBCSOURCE = "EDBC - ";
        public static final String SPECIALENROLLMENTSOURCE = "SPECIAL ENROLLMENT - ";
        public static final String DISPOSITIONSOURCE = "DISPOSITION - ";
        public static final String MASSUPDATETRIGGERINSERTIONSOURCE = "MASS UPDATE TRIGGER INSERTION - ";
        public static final String MASSUPDATESOURCE = "MASS UPDATE - ";
        public static final String MCIBATCHUPDATESOURCE = "MCI BATCH UPDATE - ";
        public static final String CSRASOURCE = "CSRA - ";
        public static final String PATIENTLIABILITYSOURCE = "Patient Liability - ";
    }

    public static class PartStatusCode {
        private PartStatusCode() {

        }

        public static final String DISQUALIFIEDADULT = "DA";
        public static final String DISQUALIFIEDCHILD = "DC";
        public static final String DISQUALIFIEDPERSON = "DP";
        public static final String ELIGIBLEADULT = "EA";
        public static final String ELIGIBLECHILD = "EC";
        public static final String EXCLUDEDADULT = "XA";
        public static final String EXCLUDEDCHILD = "XC";
        public static final String OTHERADULT = "OA";
        public static final String OTHERCHILD = "OC";
        public static final String INCLUDEDADULT = "IA";
        public static final List<String> EligibleMember = Collections.unmodifiableList(Arrays.asList("EA", "EC"));
        public static final List<String> OtherMember = Collections.unmodifiableList(Arrays.asList("OA", "OC"));
        public static final List<String> ExcludedMember = Collections.unmodifiableList(Arrays.asList("XA", "XC"));
        public static final List<String> DisqualifiedMember = Collections
                .unmodifiableList(Arrays.asList("DA", "DC", "DP"));
        public static final List<String> AdultMember = Collections
                .unmodifiableList(Arrays.asList("EA", "XA", "OA", "DA", "IA", "TA"));
    }

    public static class PriorMedicaidCode {
        private PriorMedicaidCode() {

        }

        public static final String DEFAULT = "P0";
        public static final String P1 = "P1";
        public static final String P2 = "P2";
        public static final String P3 = "P3";
    }

    public static class MCI_Source {
        private MCI_Source() {

        }

        public static final String SOURCE_SDX = "SDX";
        public static final String SOURCE_OTHERSYSTEM = "OtherSystem";
    }

    public static class HouseHoldStatusCode {
        private HouseHoldStatusCode() {

        }

        public static final String IN = "IN";
        public static final String OUT = "OT";
    }

    public static class DisQualificationType {
        private DisQualificationType() {

        }

        public static final String WORKREGISTRATION = "FRWREG";
        public static final String THIRDPARTYLIABILITY = "TPL";
        public static final String VOLUNTARYQUIT = "VQRHRS";
        public static final String LUMPSUM = "LSUM";
    }

    public static class VCLProgramColumnName {
        private VCLProgramColumnName() {

        }

        public static final String SNAP = "RFI_SNAP";
        public static final String KTAP = "RFI_KTAP";
        public static final String CCAP = "RFI_CCAP";
        public static final String NMAGI = "RFI_NMAGI";
    }

    public static class ResourceMappedColumn {
        private ResourceMappedColumn() {

        }

        public static Map<String, String> getMappedColumn() {
            final String resourceVal_Start_and_enddate = "ResourceValueStartDate;ResourceValueEndDate";
            Map<String, String> mappedColumn = new HashMap<>();
            mappedColumn.put("FairMarketValueVerification", resourceVal_Start_and_enddate);
            mappedColumn.put("DebtVerification", resourceVal_Start_and_enddate);
            mappedColumn.put("LiquidAssetVerification", "LiquidAssetDateReceived;EndDate");
            mappedColumn.put("OwnershipVerificationCode", "StartDate;EndDate");
            mappedColumn.put("InaccessiblilityVerification", "ResourceInaccessibleFrom;ResourceInaccessibleTo");
            mappedColumn.put("OwnershipEndVerificationCode", "ResourceStartDate;ResourceEndDate");
            mappedColumn.put("LoanBalanceVerification", resourceVal_Start_and_enddate);
            mappedColumn.put("RealPropertyExclusionVerification", "RealPropertyExclusionFrom;EndDate");
            mappedColumn.put("CashSurrenderValueVerification", resourceVal_Start_and_enddate);
            return mappedColumn;
        }

    }

    public static class ProgramCode {
        private ProgramCode() {

        }

        public static final String MEDICAID = "MA";
        public static final String SNAP = "SN";
        public static final String KTAP = "KT";
        public static final String SAFE = "SA";
        public static final String DSNAP = "DS";
        public static final String KINSHIPCARE = "KC";
        public static final String STATESUPPLEMENT = "SS";
        public static final String LIHEAP = "LI";
        public static final String QHP = "QP";
        public static final String QDP = "QD";
        public static final String APTC = "TC";
        public static final String ESHI = "ES";
        public static final String NMAGI = "MA";
        public static final String MAGIMEDICAID = "MEDICAID";
        public static final String MCIOTHERSYSTEMPROGRAMTYPEMEDICAID = "MEDICAID";
        public static final List<String> NonMAGIMedicaid = Collections
                .unmodifiableList(Arrays.asList("Z", "ZJ", "ZL", "ZQ"));
        public static final String MCIPROGRAMTYPEBUYIN = "BUY IN";
        public static final String MCIPROGRAMTYPEBUYIN2 = "BUYIN";
        public static final String CCAP = "CC";
        public static final String PRESUMPTIVE = "PE";
        public static final String CSRA = "CSRA";
        public static final String PTLB = "PTLB";
        public static final String KP = "KP";
        public static final List<String> ProgramCodesForApprissModels = Collections
                .unmodifiableList(Arrays.asList(CCAP, KINSHIPCARE, KTAP, SNAP));
    }

    public static class ResultCode {
        private ResultCode() {

        }

        public static final String FAIL = "FL";
        public static final String NOTAPPLICABLE = "NA";
        public static final String NOTREQUIRED = "NR";
        public static final String NULL = null;
        public static final String PASS = "PS";
        public static final String PENDING = "PE";
        public static final String NOTTESTED = "NT";
        public static final String OBSOLETE = "OB";
        public static final String POSTPONEDDENIAL = "PD";
    }

    public static class VerificationConfiguration {
        private VerificationConfiguration() {

        }

        public static final String SSNVERIFICATION = "ssnVerification";
        public static final String CITIZENSHIPVERIFICATION = "citizenshipVerification";
        public static final String LAWFULPRESENCEVERIFICATION = "lawfulPresenceVerification";
        public static final String SSN = "SSN";
        public static final String CITIZENSHIP = "Citizenship";
        public static final String VLP = "VLP";
        public static final String INCARCERATION = "INCARCERATION";
        public static final String MED = "MED";
        public static final String MEC = "MEC";
        public static final String TRI = "TRI";
        public static final String PEC = "PEC";
        public static final String VET = "VET";
        public static final String TRIBAL = "tribal";
        public static final String SMA = "SMA";
    }

    public static class BudgetTypeCode {
        private BudgetTypeCode() {

        }

        public static final String REGULAR = "RG";
        public static final String TEST165 = "TP";
        public static final String FAD = "FD";
        public static final String IPV = "IP";
        public static final String DEPENDENTCARE = "DC";
        public static final String INELIGIBLESP = "IN_ELIG_SPS";
        public static final String HEALTHYFOOD = "HF";
        public static final String HEALTHFOODFAD = "HD";
    }

    public static class HealthyFoodCaseType {
        private HealthyFoodCaseType() {

        }

        public static final String TREATMENTCASE = "01";
        public static final String CONTROLCASE = "02";
        public static final String RECEIVINGNOTSTUDY = "03";
        public static final String NOTAPPLICABLE = "04";
    }

    public static class Status {
        private Status() {

        }

        public static final String FAIL = "F";
    }

    public static class ReasonableCompatibilityIndicator {
        private ReasonableCompatibilityIndicator() {

        }

        public static final String PASS = "P";
        public static final String FAIL = "F";
        public static final String DOWN = "D";
        public static final String ERROR = "E";
        public static final String NORECORD = "N";
        public static final String CUSTOMEXCEPTION = "C";
        public static final String SERVERDOWN = "S";
        public static final String NOTEVALUATED = "X";
        public static final String OPTEDOUT = "O";
    }

    public static class StatusCode {
        private StatusCode() {

        }

        public static final String APPROVED = "AP";
        public static final String DENIED = "DN";
        public static final String APPROVEDDENIED = "AD";
        public static final String PENDING = "PE";
        public static final String TERMINATED = "TN";
        public static final String SSITERMINATION = "TR";
        public static final String WITHDRAWN = "WD";
        public static final String REINSTATE = "RI";
        public static final String DISCONTINUED = "DC";
        public static final String APPLIED = "AI";
        public static final String PENDING_APPEAL = "AE";
        public static String CONDITIONALLYELIGIBLE = "CE";
        public static final String POSTPONEDENIAL = "PD";
        public static final String SUSTAINED = "SU";
        public static final String CHANGED = "CN";
    }

    public static class StatusCodeList {
        private StatusCodeList() {

        }

        public static final List<String> StatusList = Collections.unmodifiableList(Arrays.asList("AP", "TN", "DN"));
    }

    public static class Swica {
        private Swica() {

        }

        public static final String SWICAID = "SWICA-";
    }

    public static class VerifyCurrentIncomeId {
        private VerifyCurrentIncomeId() {

        }

        public static final String VCIID = "VCI-";
    }

    public static class StateIncomeFactor {
        private StateIncomeFactor() {

        }

        public static final double STATEUNEMPLOYMENTINCOME = 0;
        public static final double BENEFITAMOUNTFACTOR = 2.17f;
        public static final double MEMBERWAGESFACTOR = 3;
        public static final double STATEWAGESFACTOR = 0;
    }

    public static class DMSStatus {
        private DMSStatus() {

        }

        public static final String PENDING = "PE";
        public static final String DENIED = "DE";
        public static final String APPROVED = "AP";
    }

    public static class RenewalStatusCode {
        private RenewalStatusCode() {

        }

        public static final String REVIEWINITIATED = "RI";
        public static final String NOTAPPLICABLE = "NA";
        public static final String PASSIVERENEWAL = "PS";
    }

    public static class TypeofAssistance {
        private TypeofAssistance() {

        }

        public static List<String> MAGITypeOfAssistances = Collections.unmodifiableList(Arrays.asList("ADBH", "ADLT",
                "CHEX", "CHIP", "CHL1", "CHL2", "CHL3", "CHL4", "CONV", "FFCC", "FFS1", "FFS2", "PACA", "PREG", "TP45",
                "APTC", "EMC1", "EMC2", "EMC3", "EMC4", "ADPR", "ADFF", "FFOS"));
        public static List<String> NMAGITypeOfAssistances = Collections
                .unmodifiableList(Arrays.asList("ABDM", "SSIR", "QMBP", "SLMB", "QDWI", "QI1P", "MAWR", "SSPM", "DJJM",
                        "ASMA", "FCMA", "SSPP", "LTCM", "EMCA", "EXPT", "PTCC", "PTDC", "PTEW", "QMBC"));
        public static List<String> NMAGIMATypeOfAssistances = Collections.unmodifiableList(Arrays.asList("ABDM", "SSIR",
                "MAWR", "SSPM", "DJJM", "ASMA", "FCMA", "SSPP", "LTCM", "EMCA", "EXPT", "PTCC", "PTDC", "PTEW"));
        public static List<String> MSPTypeOfAssistances = Collections
                .unmodifiableList(Arrays.asList("QMBP", "SLMB", "QDWI", "QI1P", "QMBC"));
        public static List<String> MAGIEMCATypeOfAssitances = Collections
                .unmodifiableList(Arrays.asList("EMC1", "EMC2", "EMC3", "EMC4", "EMCA"));
        public static List<String> FacilityHospiceWaiverTOAs = Collections
                .unmodifiableList(Arrays.asList("ABIF", "ABIM", "ADDY", EPSDT, "HCBS", "HSNF", "HSPC", "HSWV", "ICFF",
                        "IMDF", "MFTP", "MHPF", "MICP", "MWII", "NFVP", "PRT1", "PRT2", "SCLM", "SCL1", "HCB1"));
        public static List<String> EndDatedBenefits = Collections
                .unmodifiableList(Arrays.asList("EXPT", "SPNM", "SPMA"));
        public static List<String> BatchV731TOAs = Collections.unmodifiableList(
                Arrays.asList("QMBP", "SLMB", "QDWI", "QI1P", "ABDM", "SSPM", "MAWR", "LTCM", "QMBC"));
        public static List<String> TempPassthroughTOAs = Collections
                .unmodifiableList(Arrays.asList("PTCC", "PTDC", "PTEW"));
        public static final List<String> CHILDTOAS = List.of("CHL1", "CHL2", "CHL3", "CHL4");
        public static final List<String> EMCTOAS = List.of("EMC1", "EMC2", "EMC4");
        public static final String COMMONCHILDTOA = "CHL4";
        public static final String COMMONEMCTOA = "EMC4";
        public static final String NULL = null;
        public static final String NONE = "NONE";
        public static final String SNAP = "SNAP";
        public static final String SAFE = "SAFE";
        public static final String SNAPELDERLYANDDISABLED = "SNED";
        public static final String LTCM = "LTCM";
        public static final String NEWBORN = "TP45";
        public static final String PREGNANCY = "PREG";
        public static final String QHP = "QHCP";
        public static final String APTC = "APTC";
        public static final String CONV = "CONV";
        public static final String ADBH = "ADBH";
        public static final String ABDM = "ABDM";
        public static final String ADULT = "ADLT";
        public static final String CHILDEXPANSION = "CHEX";
        public static final String CHL1 = "CHL1";
        public static final String CHL2 = "CHL2";
        public static final String CHL3 = "CHL3";
        public static final String CHL4 = "CHL4";
        public static final String TMCE = "TMCE";
        public static final String TMCS = "TMCS";
        public static final String FFS1 = "FFS1";
        public static final String FFS2 = "FFS2";
        public static final String KCHIP = "CHIP";
        public static final String NONMAGIMEDICAID = "NMME";
        public static final String PARENTCARETAKER = "PACA";
        public static final String TMAE = "TMAE";
        public static final String TMAS = "TMAS";
        public static final String ESI = "ESHI";
        public static final String FAD = "FADP";
        public static final String SSPP = "SSPP";
        public static final String KTAP = "KTAP";
        public static final String KINSHIPCARE = "KNCR";
        public static final String SPENDDOWN = "SPDN";
        public static final String NMAGISPENDDOWN = "SPNM";
        public static final String DSNP = "DSNP";
        public static final String ESNP = "ESNP";
        public static final String QI1P = "QI1P";
        public static final String QDWI = "QDWI";
        public static final String MAGI = "MAGI";
        public static final String EMC1 = "EMC1";
        public static final String EMC2 = "EMC2";
        public static final String EMC3 = "EMC3";
        public static final String EMC4 = "EMC4";
        public static final String EMCA = "EMCA";
        public static final String SSPM = "SSPM";
        public static final String EXPT = "EXPT";
        public static final String QMBP = "QMBP";
        public static final String SLMB = "SLMB";
        public static final String SSIR = "SSIR";
        public static final String SSIP = "SSIP";
        public static final String ASMA = "ASMA";
        public static final String CCPO = "CCPO";
        public static final String CCPE = "CCPE";
        public static final String TANF = "TANF";
        public static final String CCIE = "CCIE";
        public static final String MAWR = "MAWR";
        public static final String DJJM = "DJJM";
        public static final String FCMA = "FCMA";
        public static final String PTCC = "PTCC";
        public static final String PTDC = "PTDC";
        public static final String PTEW = "PTEW";
        public static final String PTDW = "PTDW";
        public static final String SPMA = "SPMA";
        public static final String CCAP = "CCAP";
        public static final String CCSS = "CCSS";
        public static final String TENF = "TENF";
        public static final String QMBC = "QMBC";
        public static final String ADPR = "ADPR";
        public static final String FORMERFOSTERCARE = "FFCC";
        public static final String ADFF = "ADFF";
        public static final String FFOS = "FFOS";
        public static final String PEAD = "PEAD";
    }

    public static class TMAIncomeReportingStatus {
        private TMAIncomeReportingStatus() {

        }

        public static final String COMPLETE = "CO";
        public static final String PENDING = "PE";
        public static final String INCOMPLETE = "IN";
    }

    public static class TMAEmploymentLossGoodCause {
        private TMAEmploymentLossGoodCause() {

        }

        public static final String WAGERATEDEDUCTION = "WRR";
        public static final String ACCEPTANCEOFJOB = "AJ";
        public static final String UNAVAILABLECHILDCARE = "UCC";
        public static final String CARINGFORCHILD = "CC";
        public static final String DOCTORSSTATEMENT = "DS";
        public static final String UNAVAILABLETRANSPORTATION = "UT";
        public static final String EXCESSIVETIMETRAVEL = "ETT";
        public static final String TEMPORARYINCARCERATION = "TI";
        public static final String DISCRIMINATIONCOMPLAINT = "DC";
        public static final String UNSAFEWORKCONDITIONS = "UWC";
    }

    public static class TMAInvoluntaryEmploymentEndReason {
        private TMAInvoluntaryEmploymentEndReason() {

        }

        public static final String FIRED = "F";
        public static final String LAIDOFF = "LO";
        public static final String BUSINESSCLOSED = "BC";
        public static final String MEDICALLYNECESSARY = "MN";
    }

    public static class TMAIncomeReportingGoodCause {
        private TMAIncomeReportingGoodCause() {

        }

        public static final String OUTOFTOWN = "1";
        public static final String INSTITUTIONALIZED = "2";
        public static final String NATURALDISASTER = "3";
        public static final String DIDNOTRECEIVE_MA800 = "4";
    }

    public static class ConversionPersonTypeCode {
        private ConversionPersonTypeCode() {

        }

        public static final String REQUESTINGMEMBERTYPECODE = "M";
    }

    public static class VCL {
        private VCL() {

        }

        public static final String ALIENVERIFICATIONCHECKLISTTYPECODE = "V004";
        public static final String VERIFICATIONOFLAWFULPRESENCE = "V006";
        public static final String IMMIGRATIONENTRYDATEVERIFICATION = "V007";
        public static final String NONESIMECTYPECODE = "V009";
        public static final String ESIMECTYPECODE = "V008";
        public static final String CITIZENTYPECODE = "V003";
        public static final String APPLIEDSSNCODE = "V108";
        public static final String SSPVERIFICATIONCODE = "V731";
        public static final String WORKREGRFI = "V569";
        public static final String SPECIALNEEDFORCHILDUNDER13 = "V805";
        public static final String ENTITLEDBENEFIT = "V806";
        public static final String AUTHORIZEREPRESENTATIVEREL = "V677";
        public static final String FULLTIMESTUDENT = "V807";
        public static final String EMPLOYMENT = "V581";
        public static final String SELFEMPLOYMENT = "V584";
        public static final String REFUGEE = "V791";
        public static final String JOBCONTACTLIST = "V804";
        public static final String REALPROPERTYEXLCUSION = "V647";
        public static final String UNEARNEDINCOME = "V583";
        public static final String MAGIINCOME = "V544";
        public static final String PREGNANCY = "V565";
        public static final String RESIDENCE = "V018";
        public static final String ALIENSPONSOR = "V573";
    }

    public static class LossOfEmploymentVCLCodes {
        private LossOfEmploymentVCLCodes() {

        }

        public static Map<String, String> getLossOfEmploymentVCLCodes() {
            Map<String, String> lossOfEmploymentVCLCodes = new HashMap<>();
            lossOfEmploymentVCLCodes.put("V077", "EN");
            lossOfEmploymentVCLCodes.put("V794", "SE");
            lossOfEmploymentVCLCodes.put("V793", "UN");
            return lossOfEmploymentVCLCodes;
        }
    }

    public static class VCLDueDays {
        private VCLDueDays() {

        }

        public static final int TEN = 10;
        public static final int NINETY = 90;
        public static final int THIRTY = 30;
        public static final int SIXTY = 60;
        public static final int SIXMONTHS = 183;
        public static final int ONESIXTYFIVEDAYS = 165;
    }

    public static class ProviderNumbers {
        private ProviderNumbers() {

        }

        public static List<String> P2Facilities = Collections
                .unmodifiableList(Arrays.asList("0202020030002", "0202020048002"));
    }

    public static class Verification {
        private Verification() {

        }

        public static final String ALLPGMSW = "ALLPGMSW";
        public static final String NCPALLPGMSW = "ALLPRGMSW";
        public static final String ALLPROGRAMSWITCH = "ALLPGMVRFSW";
        public static final String ALLRELATIONSHIPSWITCH = "ALLRELVRFSW";
        public static final String SSN = "SSN";
        public static final String SSNGOODCAUSEREASON = "Valid";
        public static final String EARNEDINCOME = "EARNEDINC";
        public static final String UNEARNEDINCOME = "ALLPGMSW";
        public static final String PRINTSW = "PRINTSW";
        public static final String RFI_SNAP = "RFI_SNAP";
        public static final String RFI_KTAP = "RFI_KTAP";
        public static final String RFI_CCAP = "RFI_CCAP";
        public static final String RFI_NMAGI = "RFI_NMAGI";
        public static final String RFI_SAFE = "RFI_SAFE";
        public static final String RFI_SS = "RFI_SS";
        public static final String AUTHREP = "AllPGMVRFSW";
        public static final String IDVERIFICATIONNEEDED = "IDVerificationNeeded";
    }

    public static class CaseProfileVerification {
        private CaseProfileVerification() {

        }

        public static final String LIQUIDASSET = "LIQUIDASSET";
        public static final String VEHICLE = "VEHICLE";
        public static final String LIFEINSURANCE = "LIFEINSURANCE";
        public static final String BURIALINSURANCE = "BURIALINSURANCE";
        public static final String PREARRANGEFUNERALAGREEMENT = "PREARRANGEFUNERALAGREEMENT";
        public static final String BURIALFUNDS = "BURIALFUNDS";
        public static final String BURIALPLOTS = "BURIALPLOTS";
        public static final String REALPROPERTY = "REALPROPERTY";
        public static final String LIFEESTATE = "LIFEESTATE";
        public static final String ANNUITY = "ANNUITY";
        public static final String PROMISSORYNOTE = "PROMISSORYNOTE";
        public static final String OTHERRESOURCE = "OTHERRESOURCE";
        public static final String LTCARRANGEMENT = "LTCARRANGEMENT";
        public static final String PARTNERSHIPQUALIFIEDLTCPOLICY = "PARTNERSHIPQUALIFIEDLTCPOLICY";
        public static final String LIFESETTLEMENTCONTRACT = "LIFESETTLEMENTCONTRACT";
        public static final String RESOURCETRANSFER = "RESOURCETRANSFER";
        public static final String SPECIALNEEDTRUST = "SPECIALNEEDTRUST";
        public static final String EARNEDINCOME = "EARNEDINCOME";
        public static final String SOMEONEINHOUSEHOLDONSTRIKE = "SOMEONEINHOUSEHOLDONSTRIKE";
        public static final String SELFEMPLOYMENTINCOME = "SELFEMPLOYMENTINCOME";
        public static final String UNEARNEDINCOME = "UNEARNEDINCOME";
        public static final String SHELTEREXPENSE = "SHELTEREXPENSE";
        public static final String UTILITYEXPENSE = "UTILITYEXPENSE";
        public static final String UTILITYEXPENSEALLOWANCE = "UTILITYEXPENSEALLOWANCE";
        public static final String HOUSEHOLDPAIDCHILDSUPPORT = "HOUSEHOLDPAIDCHILDSUPPORT";
        public static final String HOUSEHOLDPAIDALIMONY = "HOUSEHOLDPAIDALIMONY";
        public static final String MEDICALPARTDPREMIUM = "MEDICALPARTDPREMIUM";
        public static final String MEDICALEXPENSE = "MEDICALEXPENSE";
        public static final String DEPENDENTCAREEXPENSE = "DEPENDENTCAREEXPENSE";
        public static final String HOUSEHOLDDEDUCTIONS = "HOUSEHOLDDEDUCTIONS";
        public static final String PREGNANT = "PREGNANT";
        public static final String BLINDDISABLEDINCAPACITATED = "BLINDDISABLEDINCAPACITATED";
        public static final String PAYINGFORBOARDING = "PAYINGFORBOARDING";
        public static final String EMANCIPATED = "EMANCIPATED";
        public static final String RECEIVINGINSTITUTIONALCARE = "RECEIVINGINSTITUTIONALCARE";
        public static final String EVERINFOSTERCARE = "EVERINFOSTERCARE";
        public static final String ENROLLEDINCIS = "ENROLLEDINCIS";
        public static final String HASMEDICARE = "HASMEDICARE";
        public static final String DISCONTINUEDSSI = "DISCONTINUEDSSI";
        public static final String RECEIVINGORAPPLIEDFORSSI = "RECEIVINGORAPPLIEDFORSSI";
        public static final String OUTOFSTATEBENEFITS = "OUTOFSTATEBENEFITS";
        public static final String CAREFORINCAPACITATEDINDIVIDUAL = "CAREFORINCAPACITATEDINDIVIDUAL";
        public static final String DOMESTICVIOLENCEVICTIM = "DOMESTICVIOLENCEVICTIM";
        public static final String FLEEINGFELONORPROBATIONPAROLEVIOLATOR = "FLEEINGFELONORPROBATIONPAROLEVIOLATOR";
        public static final String CONVICTEDOFDRUGFELONY = "CONVICTEDOFDRUGFELONY";
        public static final String CHEMICALLYDEPENDENT = "CHEMICALLYDEPENDENT";
        public static final String COMPLETEDCHEMICALTREATMENT = "COMPLETEDCHEMICALTREATMENT";
        public static final String ENTITLEDBENEFITS = "ENTITLEDBENEFITS";
        public static final String PROVIDINGCHILDCARE = "PROVIDINGCHILDCARE";
        public static final String DELINQUENTCLAIMS = "DELINQUENTCLAIMS";
    }

    public static class WorkRegisterExempt {
        private WorkRegisterExempt() {

        }

        public static final String MANDATORY = "M";
        public static final String EXEMPT = "E";
        public static final String WORKERING = "P";
        public static final List<String> WorkingOrMandatory = Collections.unmodifiableList(Arrays.asList("M", "P"));
    }

    public static class VerificationGroupType {
        private VerificationGroupType() {

        }

        public static final String NONFINDATA = "NONFIN";
        public static final String INCOMEDATA = "INCOME";
        public static final String EXPENSEDATA = "EXPENSE";
        public static final String RESOURCEDATA = "RESOURCE";
    }

    public static class ChildCareType {
        private ChildCareType() {

        }

        public static final String CHILDCARE = "CC";
        public static final String INCAPACITATED = "IIC";
        public static final String KTAPCHILDCARE = "KCC";
        public static final String SNAPCHILDCARE = "SCC";
    }

    public static class SNAPCertificationPeriod {
        private SNAPCertificationPeriod() {

        }

        public static final int SHORTERCERTPERIOD = 12;
        public static final int LONGERCERTPERIOD = 24;
    }

    public static class SNAPCertificationType {
        private SNAPCertificationType() {

        }

        public static final String ABAWD_TYPE = "ABAWD";
        public static final String NORMAL_TYPE = "NORMAL";
        public static final String ALL_ELDERLY_DISABLED_TYPE = "ALL_ELDERLY_DISABLED";
    }

    public static class CCAPCertificationPeriod {
        private CCAPCertificationPeriod() {

        }

        public static final int CERTPERIOD = 12;
    }

    public static class VerificationSubType {
        private VerificationSubType() {

        }

        public static final String BLACKLUNG = "BLACKLUNG";
        public static final String SSA = "SSA";
        public static final String AWARDLETTER = "LT";
        public static final String RAILROAD = "RAILROADRETIREMENT";
        public static final String LIFETIMEWORKERCOMP = "LIFETIMEWORKERCOMP";
        public static final String VABENEFIT = "VABENEFIT";
        public static final String ENDSTAGERENALDISEASE = "ENDSTAGERENALDISEASE";
        public static final String SURGERYILLNESS = "SURGERYILLNESS";
        public static final String SICKLEAVE = "SICKLEAVE";
        public static final String DETERMINEDDISABLED = "DETERMINEDDISABLED";
        public static final String DISABILITYTYPE = "DISABILITYTYPE";
        public static final String RSDI = "RSDI";
        public static final String MRTDISABLED = "MRTDISABLED";
        public static final String LOSSOFRSDI = "LOSSOFRSDI";
        public static final String PERMANENTDISABILITY = "PERMANENTDISABILITY";
        public static final String TEMPORARYDISABILITY = "TEMPORARYDISABILITY";
        public static final String CHILDCARE = "CHILDCARE";
        public static final String UNABLETOCAREFORCHILD = "UNABLETOCAREFORCHILD";
        public static final String CHEMICALLYDEPENDENT = "CHEMICALLYDEPENDENT";
        public static final String PROGRAMCOMPLETED = "PROGRAMCOMPLETED";
        public static final String PROGRAMENROLLMENT = "PROGRAMENROLLMENT";
        public static final String LEGALLYOBLIGATED = "LEGALLYOBLIGATED";
        public static final String EDUCATIONENROLLMENT = "EDUCATIONENROLLMENT";
        public static final String ATTENDANCE = "ATTENDANCE";
        public static final String FULLTIMESTUDENT = "FULLTIMESTUDENT";
        public static final String DRUGANDALCOHOLTREATCENTER = "DAA";
        public static final String FOSTERCARE = "FC";
        public static final String PCH = "PCH";
        public static final String FCH = "FCH";
        public static final String INCARCERATION = "INCARCERATION";
        public static final String GROUPLIVINGARRANGEMENT = "GLA";
        public static final String HOUSEHOLDINCOME = "INCOME";
        public static final String DEDUCTION = "DEDUCTION";
        public static final String RESOURCE = "RESOURCE";
        public static final String INCOME = "INCOME";
        public static final String EXPENSE = "EXPENSE";
        public static final String HOUSEHOLD = "HOUSEHOLD";
        public static final String NONFIN = "NONFIN";
        public static final String FOURTYQUATERALIEN = "FOURTYQUATERALIEN";
        public static final String ALIENSPONSOR = "ALIENSPONSOR";
        public static final String BATTEREDALIEN = "BATTEREDALIEN";
        public static final String ALIENENTRYDATE = "ALIENENTRYDATE";
        public static final String LEGALALIENPERMANENT = "LEGALALIENPERMANENT";
        public static final String APPLIEDSSN = "APPLIEDSSN";
        public static final String SSNGOODCAUSE = "SSNGOODCAUSE";
        public static final String SSNDISCREPANCY = "SSNDISCREPANCY";
        public static final String EXEMPTEDRESOURCE = "EXEMPTEDRESOURCE";
        public static final String TRANSFERRESOURCE = "TRANSFERRESOURCE";
        public static final String JOINTACCOUNT = "JOINTACCOUNT";
        public static final String LIQUIDASSET = "LIQUIDASSET";
        public static final String ABSENCE = "ABSENCE";
        public static final String VOLUNTARYABSENCE = "VOLUNTARYABSENCE";
        public static final String BOARDERAMOUNT = "BOARDERAMOUNT";
        public static final String CONSENT = "CONSENT";
        public static final String CCAPJOINTCUSTODY = "CCAPJOINTCUSTODY";
        public static final String NONCOMPLIANCEKWP = "NONCOMPLIANCEKWP";
        public static final String TAXFILING = "TAXFILING";
        public static final String IDENTITY = "IDENTITY";
        public static final String DECLAREANNUITY = "DECLAREANNUITY";
        public static final String ZERORESOURCE = "ZERORESOURCE";
        public static final String INCAPACTITATED = "INCAPACTITATED";
        public static final String ALIMONYAGREEMENTDATE = "ALIMONYAGREEMENTDATE";
        public static final String DOMESTICVIOLENCE = "DOMESTICVIOLENCE";
        public static final String FIELDDETERMINATION = "FIELDDETERMINATION";
        public static final String HIGHRISKPREGNANCY = "HIGHRISKPREGNANCY";
        public static final String CONDITIONALMEDICARE = "CONDITIONALMEDICARE";
        public static final String JOINTCUSTODY = "JOINTCUSTODY";
        public static final String AGREEMENTBEINGFOLLOWED = "AGREEMENTBEINGFOLLOWED";
        public static final String PENSION = "PENSION";
    }

    public static class VerificationResourceSubType {
        private VerificationResourceSubType() {

        }

        public static final String LIQUIDASSET = "LIQUIDASSET";
    }

    public static class CaseProfileConstants {
        private CaseProfileConstants() {

        }

        public static final String YES = "Y";
        public static final String NO = "N";
        public static final String PEND = "U";
    }

    public static class VerificationType {
        private VerificationType() {

        }

        public static final String CASEPROFILE = "CASEPROFILE";
        public static final String INCOME = "INCOME";
        public static final String APTC = "APTC";
        public static final String ZEROINCOME = "ZEROINCOME";
        public static final String LOSSOFEMPLOYMENT = "LOSSOFEMPLOYMENT";
        public static final String EXPENSEDETAIL = "EXPENSE";
        public static final String SELFEMPLOYMENTEXPENSE = "SELF_EMPL_EXPENSE";
        public static final String NCPGOODCAUSE = "NCP";
        public static final String SINGLEPARENTADOPTION = "SINGLEPARENTADOPTION";
        public static final String CITIZEN = "CITIZEN";
        public static final String RESIDENCY = "RESIDENCE";
        public static final String RELATIONSHIP = "REL";
        public static final String DOB = "DOB";
        public static final String SSN = "SSN";
        public static final String NONESIMECMEDICARE = "NONESIMECMEDICARE";
        public static final String NONESIMEC = "NONESIMEC";
        public static final String ESIMEC = "ESIMEC";
        public static final String IDENTITY = "IDENTITY";
        public static final String DISABILITY = "DISABILITY";
        public static final String INCAPACTITATED = "INCAPACTITATED";
        public static final String DRUGFELONY = "DRUGFELONY";
        public static final String DECEASED = "DECEASED";
        public static final String HOUSEHOLD = "HOUSEHOLD";
        public static final String STUDENTSTATUS = "STUDENTSTATUS";
        public static final String PREGNANCY = "PREGNANCY";
        public static final String WORKREGISTRATION = "WORKREGISTRATION";
        public static final String AIAN = "AIAN";
        public static final String OUTOFSTATE = "OUTOFSTATE";
        public static final String TPL = "TPL";
        public static final String EMERGENCYCONDITION = "EMERGENCYNATURE";
        public static final String VCIEMPLOYEESTATUS = "VCIEMPLOYEESTATUS";
        public static final String VCIPAYFREQUENCY = "VCIEMPLOYEESTATUS";
        public static final String ENTITLEDBENEFITS = "EntitledBenefits";
        public static final String ALIEN = "ALIEN";
        public static final String SPECIALNEED = "SPECIALNEED";
        public static final String SPECIALNEEDFORCHILDUNDER13 = "SPECIALNEEDFORCHILDUNDER13";
        public static final String WORKHOURS = "WORKHOURS";
        public static final String DISABILITYBLACKLUNG = "DISABILITYBLACKLUNG";
        public static final String RAILROAD = "RAILROAD";
        public static final String VABENEFIT = "VABENEFIT";
        public static final String LIFETIMEWORKERCOMP = "LIFETIMEWORKERCOMP";
        public static final String DETERMINEDDISABLED = "DETERMINEDDISABLED";
        public static final String VOLUNTARYQUIT = "VOLUNTARILYQUIT";
        public static final String INCARCERATION = "INCARCERATION";
        public static final String GROUPLIVINGARRANGEMENT = "GROUPLIVINGARRANGEMENT";
        public static final String DRUGADDICTIONANDALCOHOLTREATEMENTCENTERS = "DRUGADDICTIONANDALCOHOLTREATEMENTCENTERS";
        public static final String PERSONALCAREHOME = "PERSONALCAREHOME";
        public static final String FAMILYCAREHOME = "FAMILYCAREHOME";
        public static final String COMMUNITYINTEGRATIONSERVICE = "COMMUNITYINTEGRATIONSERVICE";
        public static final String CARETAKERSERVICE = "CARETAKERSERVICE";
        public static final String LIVINGARRANGEMENT = "LIVINGARRANGEMENT";
        public static final String STATESUPPLEMENT = "STATESUPPLEMENT";
        public static final String RESOURCE = "RESOURCE";
        public static final String CAREFORINDIVIDUAL = "CAREFORINDIVIDUAL";
        public static final String CHILDCARE = "CHILDCARE";
        public static final String CHILDCAREDETAILS = "CHILDCAREDETAIL";
        public static final String AUTHORIZEREPRESENTATIVE = "AUTHORIZEREPRESENTATIVE";
        public static final String MEDICALPROVIDER = "MEDICALPROVIDER";
        public static final String RENTMORTGAGE = "RENTMORTGAGE";
        public static final String ABSENTPARENTSTATUS = "ABSENTPARENTSTATUS";
        public static final String QUALIFIEDINCOMETRUST = "QUALIFIEDINCOMETRUST";
        public static final String BOARDER = "BOARDER";
        public static final String IMPRISONMENT = "IMPRISONMENT";
        public static final String SSP = "SSP";
        public static final String SIGNATURE = "SIGNATURE";
        public static final String CCAPJOINTCUSTODY = "CCAPJOINTCUSTODY";
        public static final String NONCOMPLIANCEKWP = "NONCOMPLIANCEKWP";
        public static final String NOGOODCAUSE = "8";
        public static final String TAXFILING = "TAXFILING";
        public static final String MRTDETERMINATION = "MRTDETERMINATION";
        public static final String APPLICATIONSIGNATURE = "APPLICATIONSIGNATURE";
        public static final String UTILITY_ALLOWANCE = "UTILITY_ALLOWANCE";
        public static final String DEDUCTION = "DEDUCTION";
        public static final String ETPASSESSMENT = "ETPASSESSMENT";
        public static final String UNEARNEDINCOME = "UNEARNEDINCOME";
        public static final String UNEARNED = "UNEARNED";
        public static final String SELFEMPLOYMENTINCOME = "SELFEMPLOYMENTINCOME";
        public static final String TEMPORARILYLEAVE = "TEMPORARILYLEAVE";
        public static final String DECLAREANNUITY = "DECLAREANNUITY";
        public static final String ZERORESOURCE = "ZERORESOURCE";
        public static final String SELFEMPLOYMENTOPERATEDHOME = "SELFEMPLOYMENTOPERATEDHOME";
        public static final String JOBCONTACTLIST = "JOBCONTACTLIST";
        public static final String CSARSIGNATURE = "CSARSIGNATURE";
        public static final String KTAPEXTENSION = "KTAPEXTENSION";
        public static final String KWPPARTICIPATION = "KWPPARTICIPATION";
        public static final String DOMESTICVIOLENCE = "DOMESTICVIOLENCE";
        public static final String JOBEND = "JOBEND";
        public static final String MEDICAREDETAILS = "MEDICAREDETAILS";
        public static final String JOINTCUSTODY = "JOINTCUSTODY";
        public static final String RESOURCETRANSFER = "RESOURCETRANSFER";
    }

    public static class WorkExemptCode {
        private WorkExemptCode() {

        }

        public static final String DISABILITY = "DI";
        public static final String WORKINGMIN30HRS = "WF";
        public static final String STUDENTSTATUS = "SS";
    }

    public static class VCLCode {
        private VCLCode() {

        }

        public static final String VCLAPPLICATIONSIGNATUREPENDING = "EL6001";
        public static final String AIAN = "V543";
        public static final String V005 = "V005";
        public static final String V688 = "V688";
        public static final String V16B = "V16B";
        public static final String BLACKLUNG = "V552";
        public static final String SSA = "V554";
        public static final String RAILROADRETIREMENT = "V553";
        public static final String LIFETIMEWORKERCOMP = "V555";
        public static final String VABENEFIT = "V556";
        public static final String ENDSTAGERENALDISEASE = "V557";
        public static final String DETERMINEDDISABLED = "V560";
        public static final String RSDI = "V561";
        public static final String SICKLEAVE = "V559";
        public static final String SURGERYILLNESS = "V558";
        public static final String WORKREGISTRATION = "V569";
        public static final String VCLFAILURENOTICEREASON = "EL6090";
        public static String LOSSOFEMPLOYMENT = "V077";
        public static final String LOSSOFSELFEMPLOYMENT = "V794";
        public static final String LOSSOFUNEARNEDINCOME = "V793";
        public static String PROGRAMCOMPLETED = "V567";
        public static String PROGRAMENROLLMENT = "V568";
        public static String CHEMICALLYDEPENDENT = "V566";
        public static String UnearnedIncome = "V583";
        public static String CARINGFORCHILD = "V621";
        public static String TemporaryLeave = "V796";
        public static String CSARSignature = "V808";
        public static String V680 = "V680";
        public static final String V702 = "V702";
        public static final String V706 = "V706";
        public static final String V704 = "V704";
        public static final String V703 = "V703";
        public static final String V705 = "V705";
        public static final String V574 = "V574";
        public static final String V707 = "V707";
        public static final String V708 = "V708";
        public static final String V709 = "V709";
        public static final String V710 = "V710";
        public static final String V712 = "V712";
        public static final String V711 = "V711";
        public static final String V713 = "V713";
        public static final String V714 = "V714";
        public static final String V679 = "V679";
        public static final String V683 = "V683";
        public static final String V715 = "V715";
        public static final String V716 = "V716";
        public static final String V717 = "V717";
        public static final String V718 = "V718";
        public static final String V719 = "V719";
        public static final String V720 = "V720";
        public static final String V721 = "V721";
        public static final String V723 = "V723";
        public static final String V725 = "V725";
        public static final String V724 = "V724";
        public static final String V722 = "V722";
        public static final String V032 = "V032";
        public static final String V119 = "V119";
        public static final String V16A = "V16A";
        public static final String V037 = "V037";
        public static final String V006 = "V006";
        public static final String V007 = "V007";
        public static final String V786 = "V786";
        public static final String V108 = "V108";
        public static final String V676 = "V676";
        public static final String V677 = "V677";
        public static final String V552 = "V552";
        public static final String V805 = "V805";
        public static final String V804 = "V804";
        public static final String V731 = "V731";
        public static final String V829 = "V829";
        public static final String V577 = "V577";
        public static final String V608 = "V608";
        public static final String V609 = "V609";
        public static final String V610 = "V610";
        public static final String V576 = "V576";
        public static final String V598 = "V598";
        public static final String V599 = "V599";
        public static final String V601 = "V601";
        public static final String V600 = "V600";
        public static final String V602 = "V602";
        public static final String V603 = "V603";
        public static final String V604 = "V604";
        public static final String V607 = "V607";
        public static final String V581 = "V581";
        public static final String V582 = "V582";
        public static final String V583 = "V583";
        public static final String V584 = "V584";
        public static final String V089 = "V089";
        public static final String V018 = "V018";
        public static final String INCARCERATION = "V542";
    }

    public static class ApplicantType {
        private ApplicantType() {

        }

        public static final String EMPLOYEE = "E";
        public static final String DEPENDANT = "D";
        public static final String DEPENDANTNOTINCLUDED = "DNI";
    }

    public static class ParticipantsStatusCode {
        private ParticipantsStatusCode() {

        }

        public static final String ELIGIBLECHILD = "EC";
        public static final String OTHERCHILD = "OC";
        public static final String OTHERADULT = "OA";
        public static final String EXCLUDEDCHILD = "XC";
        public static final String C = "C";
        public static final String ELIGIBLEADULT = "EA";
        public static final String EXCLUDEDADULT = "XA";
        public static final String INELIGIBLESTUDENT = "IS";
    }

    public static class MRTCategory {
        private MRTCategory() {

        }

        public static final String BLIND = "B";
        public static final String DISABLED = "D";
    }

    public static class MedicareTypeCode {
        private MedicareTypeCode() {

        }

        public static final String PARTA = "PA";
        public static final String PARTB = "PB";
        public static final String PARTAB = "MED";
    }

    public static class TypeOfCoverageCode {
        private TypeOfCoverageCode() {

        }

        public static final String MK = "MK";
    }

    public static class KHIPPRunResons {
        private KHIPPRunResons() {

        }

        public static final String DUETOHEALTHINSURANCEPOLICY = "KHIPP eligibile policy information is present";
        public static final String DUETOAUTHORIZEDKHIPP = "KHIPP is authorized in case";
    }

    public static class AddressTypeCode {
        private AddressTypeCode() {

        }

        public static final String MAILINGADDRESS = "MA";
        public static final String PHYSICALADDRESS = "PH";
    }

    public static class VerificationTypeCode {
        private VerificationTypeCode() {

        }

        public static final String AIAN = "TRIBEVRF";
        public static final String ALIENSTATUS = "ALIENSTATUSVRF";
        public static final String APPLIEDSSN = "APPLIEDSSNVRF";
        public static final String CITIZEN = "citizen";
        public static final String DEATH = "DEATHVRF";
        public static final String DOB = "dob";
        public static final String EARNEDINCOME = "EARNEDINCOMEVRF";
        public static final String IMMIGRATION = "IMMIGRATIONSTATUSVRF";
        public static final String INCARCERATION = "INCARCERATIONSTATUSVRF";
        public static final String NULL = null;
        public static final String RELATIONSHIP = "rel";
        public static final String RESIDENCY = "residence";
        public static final String SSN = "ssn";
        public static final String TRIBE = "TRIBEVRF";
        public static final String TPLGOODCAUSEVERIFICATION = "TPLGoodCauseVerification";
        public static final String UNEARNEDINCOME = "UNEARNEDINCOMETYPE";
        public static final String INCOME = "income";
        public static final String NOSSNREASON = "NOSSNREASON";
        public static final String NCPGOODCAUSE = "ncp";
        public static final String SELFEXPENSE = "SELFEMPEXPVRF";
        public static final String EXPENSE = "DEDUCTIONVRF";
        public static final String NOINCOMEVRF = "ZEROINCOMEVRF";
        public static final String LOSSOFEMPLOYMENTVRF = "LOSSOFEMPVRF";
        public static final String VCIEMPLOYEESTATUS = "VCIEMPLOYEESTATUS";
        public static final String VCIPAYFREQUENCY = "VCIEMPLOYEESTATUS";
    }

    public static class ProgramExemption {
        private ProgramExemption() {

        }

        public static final String SNAPDISABILITYEXEMPTION = "DI";
        public static final String KTAPDISABILITYEXEMPTION = "RB";
    }

    public static class ExemptionReasonCode {
        private ExemptionReasonCode() {

        }

        public static final String PERMANENTDISABILITY = "PD";
        public static final String TEMPORARYDISABILITY = "TD";
    }

    public static class VerificationReferenceTable {
        private VerificationReferenceTable() {

        }

        public static final String DISABILITYBLACKLUNGVRF = "DISABILITYBENEFITVRF";
        public static final String DISABILITYRAILROADVRF = "DISABILITYBENEFITVRF";
        public static final String DISABILITYSSAVRF = "SSAVRF";
        public static final String DISABILITYLIFETIMEWORKERCOMPVRF = "DISABILITYBENEFITVRF";
        public static final String DISABILITYVABENEFITVRF = "DISABILITYBENEFITVRF";
        public static final String DISABILITYENDSTAGERENALDISEASEVRF = "ENDSTAGERENALDISEDISABILITYBENEFITVRFASEVRF";
        public static final String DISABILITYSURGERYILLNESSVRF = "RECOVERBYVRF";
        public static final String DISABILITYSICKLEAVEVRF = "RETURNDATEVRF";
        public static final String DISABILITYDETERMINEDDISABLEDVRF = "DETERMINEDDISABLEDVRF";
        public static final String DISABILITYDISABILITYTYPE = "DISABILITYTYPE";
        public static final String DISABILITYRSDIVRF = "DISABILITYBENEFITVRF";
        public static final String NCPGOODCAUSEREASON = "NCPGOODCAUSEREASON";
        public static final String DRUGFELONYCHEMICALLYDEPENDENTVRF = "ASSESSEDCHEMDEPENDENTVRF";
        public static final String DRUGFELONYPROGRAMCOMPLETEDVRF = "COMPLETEDCHEMDEPENDENTVRF";
        public static final String DRUGFELONYPROGRAMENROLLMENTVRF = "PARTICIPATINGCHEMDEPENDENTVRF";
        public static final String EDUCATIONENROLLMENTVRF = "STUDENTENROLLMENTVRF";
        public static final String ATTENDANCEVRF = "ATTENDANCEVRF";
        public static final String OUTOFSTATEVRF = "DENIALTERMINATIONVRF";
        public static final String WORKREGISTRATIONVRF = "WORKREGISTRATIONVRF";
        public static final String EMERGENCYNATUREVRF = "EMERGENCYNATUREVRF";
        public static final String NOCAREAVAILABLEVRF = "NOCAREAVAILABLEVRF";
        public static final String DECEASEDVRF = "DEATHVRF";
        public static final String HOUSEHOLDSTATUSVRF = "HOUSEHOLDSTATUSVRF";
        public static final String PREGNANCYVRF = "PregnancyVRF";
        public static final String NOESIMECVRF = "NOESIMECVRF";
        public static final String ESIMECVRF = "NOMECVRF";
        public static final String AIANVRF = "TRIBEVRF";
        public static final String ALIENSTATUSVRF = "ALIENSTATUSVRF";
        public static final String APPLIEDSSNVRF = "APPLIEDSSNVRF";
        public static final String CITIZENVRF = "CITIZENSTATUSVRF";
        public static final String DEATHVRF = "DEATHVRF";
        public static final String DOBVRF = "DOBVRF";
        public static final String EARNEDINCOMEVRF = "EARNEDINCOMEVRF";
        public static final String IMMIGRATIONVRF = "IMMIGRATIONSTATUSVRF";
        public static final String INCARCERATIONVRF = "INCARCERATIONSTATUSVRF";
        public static final String NULL = null;
        public static final String RELATIONSHIPVRF = "RELATIONSHIPVRF";
        public static final String RESIDENCYVRF = "RESIDENCEVRF";
        public static final String SSNVRF = "SSNVRF";
        public static final String TRIBEVRF = "TRIBEVRF";
        public static final String UNEARNEDINCOMEVRF = "UNEARNEDINCOMEVRF";
        public static final String TPLVRF = "TPLGOODVER";
        public static final String IDENTITYVRF = "IDVERIFICATION";
        public static final String INCOMEVRF = "INCOMEVRF";
        public static final String SELFEMPLOYMENTINCOMEVRF = "INCTYPEVRF";
        public static final String NOSSNREASONVRF = "NOSSNREASON";
        public static final String NCPGOODCAUSEVRF = "NCPGOODCAUSEVRF";
        public static final String SELFEXPENSEVRF = "EXPTYPEVRF";
        public static final String EXPENSEVRF = "DEDUCTIONVRF";
        public static final String NOINCOMEVRF = "ZEROINCOMEVRF";
        public static final String LOSSOFEMPLOYMENTVRF = "LOSSOFEMPVRF";
        public static final String SINGLEPARENT = "SINGLEPARENTVRF";
        public static final String APTCINCOMEVRF = "ANNUALAPTCINCOMEVRF";
        public static final String VCIEMPLOYEESTATUS = "VCIEMPLOYEESTATUS";
        public static final String VCIPAYFREQUENCY = "VCIEMPLOYEESTATUS";
        public static final String LIVINGARRANGEMENTVRF = "LIVINGARRANGEMENTTYPEVRF";
        public static final String CARETAKERSERVICE = "CISVRF";
        public static final String CISVRF = "CISVRF";
        // TO DO need to change when reference table finalize for AlienSponsorVRF
        public static final String FOURTYQUATERALIENVRF = "SSCVRF";
        public static final String BATTEREDALIENVRF = "ALIENTYPEVRF";
        public static final String ALIENENTRYDATEVRF = "ENTRYVRF";
        public static final String ALIENSPONSORVRF = "SPONSORCONTRIBUTIONVRF";
        public static final String VOLUNTARYQUITVRF = "OTHERCOMPLIANCEGOODCAUSEVERF";
        public static final String UTILITYEXPENSEVRF = "UTILITYACTVERIFICATION";
        public static final String SHELTEREXPENSEVRF = "SHELTERVRF";
        public static final String DEPENDENTCAREEXPENSEVRF = "DEPENDENEXPVRF";
        public static final String MEDICALEXPENSEVRF = "MEDICALBILLVRF";
        public static final String CHILDSUPPORTEXPENSEVRF = "ACTUALPAYMENTAMTVRF";
        public static final String MRTVRF = "MRTVRF";
        public static final String SHORTTERMEXPENSEVRF = "SHORTTERMEXPTYPEVRF";
        public static final String UTILITYEXPENSEALLOWANCEVRF = "UTILITYEXPTYPEVRF";
        public static final String HOLIDAYS = "HOLIDAYS";
        public static final String RESOURCEVRF = "RESOURCEVRF";
        public static final String EXEMPTEDRESOURCEVRF = "EXEMPTEDRESOURCEVRF";
        public static final String TRANSFERRESOURCEVRF = "TRANSFERRESOURCEVRF";
        public static final String JOINTACCOUNTVRF = "JOINTACCOUNTVRF";
        public static final String ZEROINCOMEVRF = "ZEROINCOMEVRF";
        public static final String INCOMEEXCLUSIONRSNVRF = "INCOMEEXCLUSIONRSNVRF";
        public static final String UNEARNEDAGREEMENTVRF = "UNEARNEDAGREEMENTVRF";
        public static final String LIQUIDRESOURCEVALUEDETAILS = "LIQUIDASSETVRF";
        public static final String LIQUIDEXCLUDEDAMOUNT = "EXCLUSIONREASONVRF";
        public static final String LIQUIDJOINTOWNERSHIPDETAILS = "JOINTOWNERVRF";
        public static final String LIQUIDINACCESIBILITY = "INACCESSIBLEVRF";
        public static final String LIQUIDOWNERSHIPENDDETAILS = "ASSETENDVRF";
        public static final String VEHICLEFAIRMARKETVALUE = "VEHICLEVALUEVRF";
        public static final String VEHICLEDEBTVERIFICATION = "VEHICLEDEBTVRF";
        public static final String VEHICLEDETAILS = "ABLETORIDEVRF";
        public static final String VEHICLEJOINTOWNERSHIPDETAILS = "JOINTOWNERVRF";
        public static final String VEHICLEINACCESIBILITY = "INACCESSIBLEVRF";
        public static final String VEHICLEOWNERSHIPENDDETAILS = "ASSETENDVRF";
        public static final String LIFEINSURANCEDETAILS = "INSURANCEFACEVALUEVRF";
        public static final String LIFEINSURANCECSVVERIFICATION = "CVSVRF";
        public static final String LIFEINSURANCEBALVERIFICATION = "LOANBALANCEVRF";
        public static final String PREARRNGDFUNRLCONTAGRMNTPMNTINFO = "YESNO";
        public static final String GOODSANDSERVICES = "YESNO";
        public static final String BURIALPLOTSRSRCVALUEDETAILS = "FMVVRF";
        public static final String BURIALPLOTOWNERSHIPENDDETAILS = "ASSETENDVRF";
        public static final String BURIALFUNDSCONTRACTUALAGRMNTPROVIDED = "YESNO";
        public static final String BURIALFUNDSINACCESSIBLE = "YESNO";
        public static final String REALPRPRTYFAIRMKTVALUEVERFY = "FMVVRF";
        public static final String REALPRPTYDEBTVRFY = "DEBTVRF";
        public static final String REALPRPTYEXCLUSION = "REALPROPERTYEXCLUSIONVERF";
        public static final String REALPRPTYWITHESTAGENT = "REALESTATEAGENTVERF";
        public static final String REALPRPTYLOACLADVERT = "SELLADVERTISINGVRF";
        public static final String REALPRPTYSIGNFORSALENRPBLCROAD = "SELLSIGNVRF";
        public static final String REALPRPTYADVRTFLIERSFORSALE = "SELLFLYERSVRF";
        public static final String REALPRPTYCOMMNTBULLTNNOTICE = "SELLNOTICESVRF";
        public static final String REALPRPTYSHOWINTPARTIES = "SELLSHOWINGVRF";
        public static final String REALPRPTYINACCESSIBILITY = "INACCESSIBLEVRF";
        public static final String REALPRPTYOWNERSHPENDDTLS = "ASSETENDVRF";
        public static final String REALPRPTYJOINTOWNERSHPDTLS = "JOINTOWNERVRF";
        public static final String LIFEESTATEESTABLISHMENT = "LIFEESTATEFMVVERF";
        public static final String LIFEESTATERELINQUISHMENTDETAILS = "LIQUIDASSETVRF";
        public static final String ANNUITYINFORMATION = "ASSETENDVRF";
        public static final String ANNUITYTERMINATIONEND = "ASSETENDVRF";
        public static final String TERMINATIONENDVERIFICATION = "ASSETENDVRF";
        public static final String PROMSORNOTELANDDETAILS = "PNLCASSEPROMNOTELANDCONTRACTVRFTVRF";
        public static final String PROMSORNOTELANDTERMINATION = "PROMNOTELANDCONTRACTVRF";
        public static final String OTHERRSRCFAIRMKTVALUE = "FMVVRF";
        public static final String OTHERRSRCDEBTVERIFICATION = "DEBTVRF";
        public static final String OTHERRSRCJOINTOWNERSHIPDTLS = "JOINTOWNERVRF";
        public static final String OTHERRSRCINACCESSIBILITY = "INACCESSIBLEVRF";
        public static final String OTHERRSRCOWNSHPENDDTLS = "ASSETENDVRF";
        public static final String LIFETIMECAREAGREEMENT = "LCAVERF";
        public static final String PANTRSHPQLFDLTCPOLICY = "YESNO";
        public static final String LIFETMESETTLECONTCT = "LIFESETTLEMETVERF";
        public static final String LIFETMESETTLECONTCTCSVVERFY = "CVSVRF";
        public static final String LIFETMESETTLECONTCTLOANVERFY = "LOANBALANCEVRF";
        public static final String RESOURCETRANSFER = "TRFVRF";
        public static final String RESOURCEASSESSMENT = "RESOURCEASSESSMENTVRF";
    }

    public static class YesNo {
        private YesNo() {

        }

        public static final String DONTCARE = "X";
        public static final String NO = "N";
        public static final String NOTAPPLICABLE = "NA";
        public static final String NULL = null;
        public static final String YES = "Y";
        public static final String UNKNOWN = "U";
        public static final String CANCELLED = "C";
        public static final String LOWERHIERARCHY = "L";
        public static final String IGNORED = "I";
        public static final String FULLVERIFICATION = "FV";
        public static final String PARTIALVERIFICATION = "PV";
        public static final String NOVERIFICATION = "NV";
    }

    public static class HistoryType {
        private HistoryType() {

        }

        public static final String HISTORY = "HS";
    }

    public static class PPAssesConst {
        private PPAssesConst() {

        }

        public static final String NO = "N";
        public static final String YES = "Y";
        public static final String YESHISTORICAL = "H";
        public static final String PEND = "U";
        public static final String COMPLETE = "CE";
        public static final String PENDING = "PE";
    }

    public static String getappendlock() {
        return "-LOCK";
    }

    public static class VerificationReason {
        private VerificationReason() {

        }

        public static final String VERIFICATIONREASONCODE = "NO LONGER VALID RFI";
        public static final String VCLDELETEREASON = "TOA Changed";
        public static final String VCLDELETEREASONFORINDIVIDUALEXCLUDED = "INDIVIDUAL IS EXCLUDED";
        public static final String VCLDELETEREASONFORTP45 = "INDIVIDUAL IS GETTING TP45";
        public static final String VCLDELETEREASONFORCLOSURE = "SDX TOA DELETED";
        public static final String VCLDELETEREASONWORKREGRFIGENERATED = "WORKREGISTRATION RFI GENERATED";
        public static final String VCLDELETEREASONNEWAPP = "New-App";
        public static final String VCLDELETEREASONKTAPDENIED = "KTAP DENIED";
    }

    public static class EDLTCPARMCODES {
        private EDLTCPARMCODES() {

        }

        public static final String GENERALEXCLUSIONAMOUNT = "GN_EX_AMT";
        public static final String COMMUNITYEARNEDINCOMEEXCLUSIONAMOUNT = "CMN_ERIN_EX_AMT";
        public static final String INELIGIBLESIBLINGALLOCATION = "INELIG_SB_ALW";
        public static final String SPECIALINCOMESTANDARDFORLTC = "SP_IN_STD_LTC";
        public static final String MAXIMUMSPOUSALINCOMEALLOWANCESTANDARD = "MX_CO_SPU_AL_STD";
        public static final String MINIMUMSPOUSALINCOMEALLOWANCESTANDARD = "MN_CO_SPU_AL_STD";
        public static final String MAWRSPOUSEINCOMELIMIT = "IN_LMT_SPU_MW";
        public static final String MAWRBLINDINCOMELIMIT = "MW_GR_INC_LMT_BLD";
        public static final String MAWRDISABLEDINCOMELIMIT = "MW_GR_INC_LMT_DBL";
        public static final String MAWRUNEARNEDINCOMEAMOUNT = "MW_UN_IN_AMT";
        public static final String FAMILYMEMBERINCOMEALLOWANCESTANDARD = "FL_IN_ALW";
        public static final String PARENTEARNEDINCOMEALLOCATIONFORONE = "PA_ALL_EN_AMT1";
        public static final String PARENTEARNEDINCOMEALLOCATIONFORTWO = "PA_ALL_EN_AMT2";
        public static final String PARENTUNEARNEDINCOMEALLOCATIONFORONE = "PA_ALL_UN_AMT1";
        public static final String PARENTUNEARNEDINCOMEALLOCATIONFORTWO = "PA_ALL_UN_AMT2";
        public static final String PERSONALNEEDSALLOWANCEFACILITY = "PL_ALW_STD_FCT";
        public static final String SPOUSESPECIALINCOMESTANDARD = "CMN_SPU_SLT_STD";
        public static final String PERSONALNEEDSALLOWANCEWAIVER = "PL_ALW_STD_WV";
        public static final String PERSONALNEEDSALLOWANCEWAIVERINCREASED = "PL_ALW_STD_WV_1";
        public static final String SSPSTANDARDFORCIS = "SSP_CIS_STD";
        public static final String SSPSTANDARDFORFCH = "SSP_FCH_STD";
        public static final String SSPSTANDARDFORPCH = "SSP_PCH_STD";
        public static final String COMMUNITYSPOUSESHELTERALLOWANCESTD = "CMN_SPU_SLT_STD";
        public static final String SSIINCOMESTANDARD = "SSI_INCOME_LMT";
        public static final String COUPLEONEREQUIRINGCARE = "CP_ELIG_GP1";
        public static final String COUPLEBOTHREQUIRINGCARE = "CP_ELIG_GP2";
        public static final String SINGLEINDVRECEIVINGCARE = "INDIV_CARE_STD";
        public static final String SCLWAIVERSTANDARD = "SCL_WV_STD";
        public static final String MASCALEFOR1 = "MA_SCALE_1";
        public static final String TELEPHONESTANDARDDEDUCTION = "MA_TEL_STD_AMT";
        public static final String TRANSFERREDRESOURCEDIVIDER = "MA_TNRD_RES_DIV_DAY";
    }

    public static class VerificationKWPAssessmentStatus {
        private VerificationKWPAssessmentStatus() {

        }

        public static final String KWPASSESSMENTCODE = "CP";
        public static final String EXEMPT = "ET";
    }

    public static class EDRSCPARMCODES {
        private EDRSCPARMCODES() {

        }

        public static final String ABDMRESOURCELIMITFOR1 = "NM_ABD_RSC_LMT_HH1";
        public static final String ABDMRESOURCELIMITFOR2 = "NM_ABD_RSC_LMT_HH2";
        public static final String MAWRRESOURCELIMITFOR1 = "NM_MWRSC_LMT_HH1";
        public static final String MAWRRESOURCELIMITFOR2 = "NM_MWRSC_LMT_HH2";
        public static final String PASSTHROUGHRESOURCELIMITFOR1 = "NM_PT_SSP_RSC_LMT_HH1";
        public static final String PASSTHROUGHRESOURCELIMITFOR2 = "NM_PT_SSP_RSC_LMT_HH2";
        public static final String QDWIRESOURCELIMITFOR1 = "MSP_QDWI_RSC_LMT_HH1";
        public static final String QDWIRESOURCELIMITFOR2 = "MSP_QDWI_RSC_LMT_HH2";
        public static final String MSPRESOURCELIMITFOR1 = "MSP_RSC_LMT_HH1";
        public static final String MSPRESOURCELIMITFOR2 = "MSP_RSC_LMT_HH2";
        public static final String DISABLEDCHILDRESOURCELIMITFOR1 = "NM_DIS_CHLD_LMT_1P";
        public static final String DISABLEDCHILDRESOURCELIMITFOR2 = "NM_DIS_CHLD_LMT_2P";
        public static final String HOMESTEADFAIRMARKETVALUELIMITAMOUNT = "HMSTD_LMT_AMT";
        public static final String POTENTIALSSIRESOURCELIMITFOR2 = "NM_SSI_RSC_LMT_HH2";
    }

    public static class EDLTCLIMITCODES {
        private EDLTCLIMITCODES() {

        }

        public static final String QDWIINCOMELIMITS = "QDWI_IN_LMT";
        public static final String LTCSPECIALINCOMESTANDARD = "LTC_SPL_IN_STD";
        public static final String QI1INCOMELIMITS = "QI_IN_LMT";
        public static final String QMBINCOMELIMITS = "QMB_IN_LMT";
        public static final String SLMBINCOMELIMITS = "SLMB_IN_LMT";
        public static final String SSIINCOMELIMITS = "SSI_FED_BN_RT";
        public static final String ABDMINCOMELIMITS = "ABDM_INC_LMT";
    }

    public static class TableNames {
        private TableNames() {

        }

        public static final String CASETABLE = "Case";
        public static final String CARINGFORANINDIVIDUAL = "CaringForAnIndividual";
        public static final String CARINGFORANINDIVIDUALCHILDCAREDETAIL = "CaringForAnIndividualChildCareDetail";
        public static final String OUTOFSTATEBENEFIT = "OutOfStateBenefit";
        public static final String CUSTODYDETAIL = "CustodyDetail";
        public static final String SDX = "SDX";
        public static final String SDXELIGIBILITY = "SDXEligibility";
        public static final String EXEMPTIONDETAIL = "ExemptionDetail";
        public static final String COMPLIANCE = "Compliance";
        public static final String COMPLIANCENONCONTINOUSDATA = "ComplianceNonContinousData";
        public static final String DCINDIVIDUALCOMMUNITYINTEGRATIONSUPPLEMENTATION = "DCIndividualCommunityIntegrationSupplementation";
        public static final String CARETAKERSERVICE = "CareTakerService";
        public static final String RELATIONSHIP = "Relationship";
        public static final String ELIGIBILITYINDIVIDUALBENEFITS = "EligibilityIndividualBenefits";
        public static final String ELIGIBILITYINDIVIDUALBENEFITSALL = "EligibilityIndividualBenefitsAll";
        public static final String TAXFILINGSTATUS = "TaxFilingStatus";
        public static final String STATUSOFHOUSEHOLDCOMPOSITIONSUMMARY = "StatusOfHouseholdCompositionSummary";
        public static final String STATUSOFHOUSEHOLDCOMPOSITIONASSOCIATION = "StatusOfHouseholdCompositionAssociation";
        public static final String IPVDETAIL = "IPVDetail";
        public static final String UNCLEARINFORMATION = "UnclearInformation";
        public static final String BOARDERAMOUNT = "BoarderAmount";
        public static final String INDIVIDUALBENEFITEXTENSION = "IndividualBenefitExtension";
        public static final String BOARDER = "Boarder";
        public static final String INSURANCEPOLICYDETAIL = "InsurancePolicyDetail";
        public static final String MEDICAIDPREMIUM = "MedicaidPremium";
        public static final String DCINDIVIDUAL = "DCIndividual";
        public static final String DCINDIVIDUALALIEN = "DCIndividualAlien";
        public static final String DCINDIVIDUALALIENTYPE = "DCIndividualAlienType";
        public static final String DCINDIVIDUALPROFILE = "DCIndividualProfile";
        public static final String DCINDIVIDUALADDRESSASSOCIATION = "DCIndividualAddressAssociation";
        public static final String DCINDIVIDUALRACE = "DCIndividualRace";
        public static final String PREGNANCY = "Pregnancy";
        public static final String INDIVIDUALINCARCERATION = "IndividualIncarceration";
        public static final String NEWBORN = "NewBorn";
        public static final String HEADOFHOUSEHOLD = "HeadOfHousehold";
        public static final String CASEINDIVIDUAL = "CaseIndividual";
        public static final String CASEPROGRAMINDIVIDUAL = "CaseProgramIndividual";
        public static final String ELIGIBILITYOVERRIDEREQUEST = "EligibilityOverrideRequest";
        public static final String NONESIMECRESPONSE = "NonEsiMecResponse";
        public static final String SUSPENSIONRECORD = "SuspensionRecord";
        public static final String ESIMECRESPONSE = "EsiMecResponse";
        public static final String INSURANCEPOLICY = "InsurancePolicy";
        public static final String STATUSOFINDIVIDUALHOUSEHOLD = "StatusofIndividualHousehold";
        public static final String STATUSOFTAXFILING = "StatusofTaxFiling";
        public static final String INDIVIDUALDEMOGRAPHY = "IndividualDemography";
        public static final String FEDERALINCARCENATIONINFORMATION = "FederalIncarcenationInformation";
        public static final String INDIVIDUALLOWESTCOSTEMPLOYERPLAN = "IndividualLowestCostEmployerPlan";
        public static final String INDIVIDUALFOSTERCARE = "IndividualFosterCare";
        public static final String CCAPWORKEXEMPTION = "CCAPWORKExemption";
        public static final String ESIPOTENTIALCOVERAGE = "ESIPotentialCoverage";
        public static final String DCADDRESS = "DCAddress";
        public static final String CASEPROGRAM = "CaseProgram";
        public static final String CASEEMPLOYERINDIVIDUALROSTER = "CaseEmployerIndividualRoster";
        public static final String CASEPROFILE = "CaseProfile";
        public static final String CASEEMPLOYERROSTER = "CaseEmployerRoster";
        public static final String DCMEDICAREBENEFIT = "DCMedicareBenefit";
        public static final String INDIVIDUALLIVINGARRANGEMENT = "IndividualLivingArrangement";
        public static final String LIVINGARRANGEMENTPROVIDERTABLE = "LivingArrangementProviderTable";
        public static final String LTCRESOURCETRANSFERCONSENT = "LTCResourceTransferConsent";
        public static final String DISABILITY = "Disability";
        public static final String MRTDETERMINATION = "MRTReferralDetermination";
        public static final String ATTENDANCEMODELS = "AttendanceModels";
        public static final String MARITALSTATUSOFINDIVIDUAL = "MaritalStatusOfIndividual";
        public static final String SUBSIDIZEDADOPTION = "SubsidizedAdoption";
        public static final String EARNEDINCOMESTRIKEDETAIL = "EarnedIncomeStrikeDetail";
        public static final String MONEYFOLLOWSTHEPERSON = "MoneyFollowsThePerson";
        public static final String STATUSOFMFP = "StatusOfMFP";
        public static final String SPENDDOWN = "SpendDown";
        public static final String MFPSHELTERALLOWANCE = "MFPShelterAllowance";
        public static final String DCTHIRDPARTYLIABILITY = "DCThirdPartyLiability";
        public static final String CHILDCARECHILDCARE = "ChildcareChildcare";
        public static final String NOINCOMEVERIFICATION = "NoIncomeVerification";
        public static final String NORESOURCEVERIFICATION = "NoResourceVerification";
        public static final String VERIFYCURRENTINCOME = "VerifyCurrentIncome";
        public static final String SUPPORTDEDUCTION = "SupportDeduction";
        public static final String ROOMANDBOARD = "RoomAndBoard";
        public static final String SHELTEREXPENSETYPE = "ShelterExpenseType";
        public static final String UNOCCUPIEDSHELTER = "UnoccupiedShelter";
        public static final String DCINDIVIDUALCHILDCARE = "DCIndividualChildCare";
        public static final String DEDUCTIONINFORMATION = "DeductionInformation";
        public static final String INDIVIDUALNONCUSTODIALPARENTASSOCIATION = "IndividualNonCustodialParentAssociation";
        public static final String DSNAPSETUP = "DSNAPSetup";
        public static final String CHILDSUPPORTDISQUALIFICATION = "ChildSupportDisqualification";
        public static final String EDUCATIONHISTORYDETAIL = "EducationHistoryDetail";
        public static final String STATUSOFNONCUSTODIALPARENT = "StatusOfNonCustodialParent";
        public static final String EMERGENCYMEDICALCONDITION = "EmergencyMedicalCondition";
        public static final String INCAPACITATEDINDIVIDUALCARE = "IncapacitatedIndividualCare";
        public static final String ELIGIBILITYINDIVIDUAL = "EligibilityIndividual";
        public static final String ELIGIBILITY = "Eligibility";
        public static final String ELIGIBILITYINDIVIDUALNONMAGIBUDGET = "EligibilityIndividualNonMAGIBudget";
        public static final String ELIGIBILITYNONMAGIBUDGET = "EligibilityNonMAGIBudget";
        public static final String LOCDETERMINATION = "LocDetermination";
        public static final String LOCPRIVATEPAYDETAIL = "LocPrivatePayDetail";
        public static final String PROCERTDATA = "ProCertData";
        public static final String INCAPACITY = "Incapacity";
        public static final String DCREPRESENTATIVE = "DCRepresentative";
        public static final String DCDOMESTICVIOLENCE = "DCDomesticViolence";
        public static final String JOINTCUSTODY = "JointCustody";
        public static final String WININFO = "WINInfo";
        public static final String UNPAIDEMPLOYMENT = "UNPAIDEMPLOYMENT";
        public static final String CHILDCAREDISCONTINUANCEDETAIL = "ChildCareDiscontinuanceDetail";
        public static final String PPINCOMEDETAIL = "PPIncomeDetail";
        public static final String PPINCOMEBUDGET = "PPIncomeBudget";
        public static final String ORGANIZATIONPROVIDERMASTER = "OrganizationProviderMaster";
        public static final String HEALTHINSURANCECOVEREDINDIVIDUALSDETAIL = "HealthInsuranceCoveredIndividualsDetail";
        public static final String CONDITIONALMEDICAREDETAIL = "ConditionalMedicareDetail";
        public static final String EMPLOYMENTBUDGET = "EmploymentBudget";
        public static final String SELFEMPLOYMENTINCOMEBUDGET = "SelfEmploymentIncomeBudget";
        public static final String UNEARNEDINCOMEBUDGET = "UnearnedIncomeBudget";
        public static final String OTHEREARNEDINCOMEBUDGET = "OtherEarnedIncomeBudget";
        public static final String EMPLOYMENTDETAILPAYASSOCIATION = "EmploymentDetailPayAssociation";
        public static final String SELFEMPLOYMENTDETAILPAYASSOCIATION = "SelfEmploymentDetailPayAssociation";
        public static final String EMPLOYMENTDETAIL = "EmploymentDetail";
        public static final String SELFEMPLOYMENTINCOMEDETAIL = "SelfEmploymentIncomeDetail";
        public static final String UNEARNEDINCOMEPAYASSOCIATION = "UnearnedIncomePayAssociation";
        public static final String OTHEREARNEDINCOMEPAYASSOCIATION = "OtherEarnedIncomePayAssociation";
        public static final String INCOMEPAYDETAIL = "IncomePayDetail";
        public static final String EXPENSEDETAIL = "ExpenseDetail";
        public static final String UNEARNEDINCOMEDETAIL = "UnearnedIncomeDetail";
        public static final String OTHEREARNEDINCOMEDETAIL = "OtherEarnedIncomeDetail";
        public static final String QUALIFIEDINCOMETRUST = "QualifiedIncomeTrust";
        public static final String LOSSOFEMPLOYMENTDETAIL = "LossOfEmploymentDetail";
        public static final String SELFEMPLOYMENTJOINTOWNERSBUDGET = "SelfEmploymentJointOwnersBudget";
        public static final String DCTERMINATEDUNEARNEDINCOMEDETAIL = "DCTerminatedUnearnedIncomeDetail";
        public static final String DCTERMINATEDSELFEMPLOYMENTDETAIL = "DCTerminatedSelfEmploymentDetail";
        public static final String TERMINATEDINCOMEAFTERLASTDISPOSITION = "TerminatedIncomeExpenseAfterLastDisposition";
        public static final String LIFEINSURANCERESOURCE = "LifeInsuranceResource";
        public static final String LIFESETTLEMENTCONTRACTRESOURCE = "LifeSettlementContractResource";
        public static final String LIQUIDASSETSRESOURCE = "LiquidAssetsResource";
        public static final String BURIALPLOTRESOURCE = "BurialPlotResource";
        public static final String VEHICLERESOURCE = "VehicleResource";
        public static final String REALPROPERTYRESOURCE = "RealPropertyResource";
        public static final String OTHERRESOURCE = "OtherResource";
        public static final String PROMISSORYNOTEORLANDCONTRACTRESOURCE = "PromissoryNoteOrLandContractResource";
        public static final String JOINTOWNERSHIP = "JointOwnership";
        public static final String FUNERALBURIALITEM = "FuneralBurialItem";
        public static final String PREFUNERALAGREEMENTRESOURCE = "PreFuneralAgreementResource";
        public static final String BURIALFUNDRESOURCE = "BurialFundResource";
        public static final String FUNERALINSURANCEPOLICY = "FuneralInsurancePolicy";
        public static final String TRUSTRESOURCE = "TrustResource";
        public static final String TRANSFERREDRESOURCE = "TransferredResource";
        public static final String KTAPINELIGIBILITY = "KTAPIneligibility";
        public static final String UTILITYEXPENSE = "UtilityExpense";
        public static final String SHELTEREXPENSE = "ShelterExpense";
        public static final String EDUCATIONALEXPENSE = "EducationalExpense";
        public static final String DEPENDENTCAREEXPENSE = "DependentCareExpense";
        public static final String UTILITYEXPENSETYPE = "UtilityExpenseType";
        public static final String CHILDSUPPORTALIMONYEXPENSE = "ChildSupportAlimonyExpense";
        public static final String MEDICALEXPENSE = "MedicalExpense";
        public static final String SHORTTERMEXPENSE = "ShortTermExpense";
        public static final String EXPENSE = "Expense";
        public static final String EXPENSEAMOUNT = "ExpenseAmount";
        public static final String MEDICALEXPENSEALL = "MedicalExpenseAll";
        public static final String MEDICALEXPENSEAMOUNT = "MedicalExpenseAmount";
        public static final String EMANCIPATION = "Emancipation";
        public static final String MEALARRANGEMENT = "MealArrangement";
        public static final String MIGRANTSEASONALFARMWORKERS = "MigrantSeasonalFarmWorkers";
        public static final String CHEMICALDEPENDENCYPROGRAM = "ChemicalDependencyProgram";
        public static final String EDUCATIONENROLLMENT = "EducationEnrollment";
        public static final String RESIDENCY = "Residency";
        public static final String CITIZENSHIP = "Citizenship";
        public static final String CASEINTERVIEWEE = "CaseInterviewee";
        public static final String DCINDIVIDUALALIENSPONSOR = "DCIndividualAlienSponsor";
        public static final String DCINDIVIDUALALIENSPONSORRELATIONSHIP = "DCIndividualAlienSponsorRelationship";
        public static final String DCINDIVIDUALALIENSPONSORINFORMATION = "DCIndividualAlienSponsorInformation";
        public static final String DCINDIVIDUALALIENSPONSORINCOMEANDRESOURCE = "DCIndividualAlienSponsorIncomeAndResource";
        public static final String DCINDIVIDUALALIENSPONSORINCOMEANDRESOURCEDETAIL = "DCIndividualAlienSponsorIncomeAndResourceDetail";
        public static final String LTCCOUPLE = "LTCCouple";
        public static final String SELFEMPLOYMENTPAYEXPENSE = "SelfEmploymentPayExpense";
        public static final String ETPABAWDWAIVERSETUPWAIVEDCOUNTY = "ETPAbawdWaiverSetupWaivedCounty";
        public static final String EDBCCASEINDIVIDUALRFISUMMARY = "EligibilityDetermination.EDBCCaseIndividualRFISummary";
        public static final String LIVINGARRANGEMENTHOSPITALIZATION = "LivingArrangementHospitalization";
        public static final String CCAPJOINTCUSTODY = "CCAPJointCustody";
        public static final String PPAUTHORIZATIONINDIVIDUAL = "PPAuthorizationIndividual";
        public static final String PPAUTHORIZATION = "PPAuthorization";
        public static final String CHILDCARESUPPORTSERVICE = "ChildCareSupportService";
        public static final String DCSNAPHOUSEHOLDEXPEDITEDSCREENING = "DCSNAPHouseholdExpeditedScreening";
        public static final String KWPASSESSMENTCONSENT = "KWPAssessmentConsent";
        public static final String ABAWDMONTHTRACKING = "ABAWDMonthTracking";
        public static final String TASK = "Task";
        public static final String DCREPRESENTATIVEPERMISSIONLEVELASSOCIATION = "DCRepresentativePermissionLevelAssociation";
        public static final String SNAPDEMOINBOUND = "SNAPDemoInbound";
        public static final String ETPABAWDEFFECTIVEDATE = "ETPAbawdEffectiveDate";
        public static final String ETPABAWDCOUNTYMAPPING = "ETPAbawdCountyMapping";
        public static final String ETPCURE = "ETPCure";
        public static final String INCREASECOMMUNITYSPOUSEINCOMEMODEL = "IncreaseCommunitySpouseIncomeModel";
        public static final String ENROLLMENTDETAIL = "EnrollmentDetail";
        public static final String STATUSOFENROLLMENT = "StatusOfEnrollment";
        public static final String ABAWDBONUSMONTH = "ABAWDBonusMonth";
        public static final String ETPASSESSMENTINFORMATION = "ETPAssessmentInformation";
        public static final String P2PGROUPASSIGNMENT = "P2PGroupAssignment";
        public static final String APPLICATION = "Application";
        public static final String APPLICATIONPROGRAM = "ApplicationProgram";
        public static final String TMAINCOMEREPORTING = "TMAIncomeReporting";
        public static final String TMAEMPLOYMENTENDDETAILS = "TMAEmploymentEndDetails";
        public static final String MEDICALLYFRAIL = "MedicallyFrail";
        public static final String MCOPAYMENTDETAIL = "MCOPaymentDetail";
        public static final String COSTSHARECLOCK = "CostShareClock";
        public static final String HBEHINDIVIDUALCONTROLGROUP = "HBEHIndividualControlGroup";
        public static final String CCAPCOPAYOVERRIDE = "CCAPCopayOverride";
        public static final String SDXINDIVIDUALSAFEDETAIL = "SDXIndividualSAFEDetail";
    }

    public static class ProgramTablesList extends TableNames {
        private ProgramTablesList() {

        }

        public static final String DCALLADDRESS = "DCAllAddress";
        public static final String NONCUSTODIALPARENTALRELATIONSHIP = "NonCustodialParentRelationship";
        public static final String APTCINCOMEDETAILS = "APTCIncomeDetails";
        public static final String ESICOVERAGEDETAILS = "ESICoverageDetail";
        public static final String HEALTHINSURANCEPOLICYDETAIL = "HealthInsurancePolicyDetail";
        public static final String HEALTHINSURANCEFACILITYTYPE = "HealthInsuranceFacilityType";
        public static final String DCINDIVIDUALALIEN = "DCIndividualAlien";
        public static final String UNEARNEDINCOME = "UnEarnedIncome";
        public static final String OTHEREARNEDINCOME = "OtherEarnedIncome";
        public static final String EMPLOYMENT = "Employment";
        public static final String SELFEMPLOYMENT = "SelfEmployment";
        public static final String CONVERSIONINDIVIDUALINFO = "ConversionIndividualInformation";
        public static final String SSIBENEFIT = "SSIBenefit";
        public static final String CONVERSIONCROSSREFERENCE = "ConversionCrossReference";
        public static final String DCINDIVIDUALMINORPARENT = "DCIndividualMinorParent";
        public static final String ALLRESOURCE = "AllResource";
        public static final String EMERGENCYMEDICALCONDITIONEXTENSION = "EmergencyMedicalConditionExtension";
        public static final String DCREPRESENTATIVECASEASSOCIATION = "DCRepresentativeCaseAssociation";
        public static final String EDUCATION = "Education";
        public static final String INCOMEEMPLOYMENTINFO = "IncomeEmploymentInformation";
        public static final String ATTENDANCE = "Attendance";
        public static final String JOINTOWNERDETAIL = "JointOwnersDetail";
        public static final String CARINGFORANINDIVIDUALVERIFICATIONDETAIL = "CaringForAnIndividualVerificationDetail";
        public static final String DCWORKREGISTRATION = "DCWorkRegistration";
        public static List<String> SNAPList = Collections.unmodifiableList(Arrays.asList(TableNames.SUBSIDIZEDADOPTION,
                TableNames.WININFO, TableNames.INDIVIDUALBENEFITEXTENSION, TableNames.EXEMPTIONDETAIL,
                TableNames.HEADOFHOUSEHOLD, TableNames.CCAPWORKEXEMPTION, TableNames.STATUSOFINDIVIDUALHOUSEHOLD,
                TableNames.INDIVIDUALLIVINGARRANGEMENT, TableNames.RESIDENCY, TableNames.DCINDIVIDUAL, DCALLADDRESS,
                TableNames.NONESIMECRESPONSE, TableNames.RELATIONSHIP, TableNames.INDIVIDUALFOSTERCARE,
                TableNames.LOCDETERMINATION, NONCUSTODIALPARENTALRELATIONSHIP, TableNames.JOINTCUSTODY,
                TableNames.STATUSOFNONCUSTODIALPARENT, APTCINCOMEDETAILS, TableNames.NOINCOMEVERIFICATION,
                TableNames.VERIFYCURRENTINCOME, TableNames.HEALTHINSURANCECOVEREDINDIVIDUALSDETAIL,
                HEALTHINSURANCEFACILITYTYPE, HEALTHINSURANCEPOLICYDETAIL, ESICOVERAGEDETAILS, CITIZENSHIP,
                DCINDIVIDUALALIEN, "IndividualVLPResponse", TableNames.DCINDIVIDUALCOMMUNITYINTEGRATIONSUPPLEMENTATION,
                TableNames.CARETAKERSERVICE, TableNames.PREGNANCY, TableNames.INDIVIDUALINCARCERATION,
                TableNames.NEWBORN, TableNames.STATUSOFTAXFILING, TableNames.DCINDIVIDUALPROFILE,
                TableNames.INDIVIDUALLOWESTCOSTEMPLOYERPLAN, OTHEREARNEDINCOME, UNEARNEDINCOME, EMPLOYMENT,
                SELFEMPLOYMENT, TableNames.DISABILITY, TableNames.MRTDETERMINATION, TableNames.EDUCATIONALEXPENSE,
                SSIBENEFIT, DCINDIVIDUALMINORPARENT, CONVERSIONCROSSREFERENCE, CONVERSIONINDIVIDUALINFO,
                TableNames.CUSTODYDETAIL, TableNames.EXPENSE, TableNames.EXPENSEAMOUNT, SELFEMPLOYMENTPAYEXPENSE,
                SHORTTERMEXPENSE, UNOCCUPIEDSHELTER, TableNames.DCTHIRDPARTYLIABILITY,
                TableNames.EMERGENCYMEDICALCONDITION, EMERGENCYMEDICALCONDITIONEXTENSION, ALLRESOURCE,
                TableNames.DCREPRESENTATIVE, DCREPRESENTATIVECASEASSOCIATION, TableNames.QUALIFIEDINCOMETRUST,
                "DSNAPIncome", "DSNAPResource", TableNames.ELIGIBILITYINDIVIDUALBENEFITS, "CustodyTitleIVE",
                "DCIndividualLongTermCare", TableNames.EDUCATIONHISTORYDETAIL, ESIMECRESPONSE, INCOMEEMPLOYMENTINFO,
                TableNames.OUTOFSTATEBENEFIT, EDUCATION, TableNames.EDUCATIONENROLLMENT, ATTENDANCE,
                TableNames.EMANCIPATION, TableNames.INCAPACITY, TableNames.CARINGFORANINDIVIDUAL,
                CARINGFORANINDIVIDUALVERIFICATIONDETAIL, JOINTOWNERDETAIL, TableNames.COMPLIANCE,
                TableNames.COMPLIANCENONCONTINOUSDATA, TableNames.MEALARRANGEMENT,
                TableNames.MIGRANTSEASONALFARMWORKERS, TableNames.MARITALSTATUSOFINDIVIDUAL, DCWORKREGISTRATION,
                "SafeRentMortgage", "SafeDenial", TableNames.SDXELIGIBILITY, TableNames.DCINDIVIDUALALIENTYPE,
                "AllBoader", CHEMICALDEPENDENCYPROGRAM, "ChemicalDependencyProgramAssessmentDetail",
                "ChemicalDependencyProgramCompletionDetail", "ABAWDIndividualNonCompliantMonthTracking",
                TableNames.ETPABAWDWAIVERSETUPWAIVEDCOUNTY, "QualifyingParentDetermination", "AssessmentInformation",
                "DCEntitledBenefit", TableNames.STATUSOFHOUSEHOLDCOMPOSITIONASSOCIATION,
                TableNames.STATUSOFHOUSEHOLDCOMPOSITIONSUMMARY, TableNames.CARINGFORANINDIVIDUALCHILDCAREDETAIL,
                TableNames.CASEINTERVIEWEE, TableNames.TRANSFERREDRESOURCE, TableNames.LIVINGARRANGEMENTPROVIDERTABLE,
                TableNames.DCINDIVIDUALALIENSPONSORRELATIONSHIP, TableNames.DCINDIVIDUALALIENSPONSOR,
                TableNames.DCINDIVIDUALALIENSPONSORINFORMATION, TableNames.DCINDIVIDUALALIENSPONSORINCOMEANDRESOURCE,
                TableNames.DCINDIVIDUALALIENSPONSORINCOMEANDRESOURCEDETAIL, TableNames.EARNEDINCOMESTRIKEDETAIL,
                TableNames.STATUSOFHOUSEHOLDCOMPOSITIONASSOCIATION, TableNames.STATUSOFHOUSEHOLDCOMPOSITIONSUMMARY,
                TableNames.LOSSOFEMPLOYMENTDETAIL, TableNames.LTCCOUPLE, TableNames.IPVDETAIL,
                TableNames.PPINCOMEDETAIL, TableNames.PPINCOMEBUDGET, TableNames.UNPAIDEMPLOYMENT,
                TableNames.UNCLEARINFORMATION, TableNames.LIVINGARRANGEMENTHOSPITALIZATION,
                TableNames.LTCRESOURCETRANSFERCONSENT, TableNames.MONEYFOLLOWSTHEPERSON, TableNames.KTAPINELIGIBILITY,
                TableNames.CCAPJOINTCUSTODY, TableNames.SUSPENSIONRECORD, TableNames.SPENDDOWN,
                TableNames.MEDICALEXPENSEALL, TableNames.MEDICALEXPENSEAMOUNT, TableNames.CHILDCARESUPPORTSERVICE,
                TableNames.STATUSOFMFP, TableNames.DCSNAPHOUSEHOLDEXPEDITEDSCREENING, TableNames.KWPASSESSMENTCONSENT,
                TableNames.DCDOMESTICVIOLENCE));

        public static List<String> SAFEList = Collections.unmodifiableList(Arrays.asList(TableNames.HEADOFHOUSEHOLD,
                TableNames.STATUSOFINDIVIDUALHOUSEHOLD, TableNames.INDIVIDUALLIVINGARRANGEMENT, TableNames.RESIDENCY,
                TableNames.DCINDIVIDUAL, DCALLADDRESS, TableNames.NONESIMECRESPONSE, TableNames.RELATIONSHIP,
                TableNames.INDIVIDUALFOSTERCARE, TableNames.LOCDETERMINATION, NONCUSTODIALPARENTALRELATIONSHIP,
                TableNames.STATUSOFNONCUSTODIALPARENT, APTCINCOMEDETAILS, TableNames.NOINCOMEVERIFICATION,
                TableNames.VERIFYCURRENTINCOME, TableNames.HEALTHINSURANCECOVEREDINDIVIDUALSDETAIL,
                HEALTHINSURANCEFACILITYTYPE, HEALTHINSURANCEPOLICYDETAIL, ESICOVERAGEDETAILS, CITIZENSHIP,
                DCINDIVIDUALALIEN, "IndividualVLPResponse", TableNames.DCINDIVIDUALCOMMUNITYINTEGRATIONSUPPLEMENTATION,
                TableNames.CARETAKERSERVICE, TableNames.PREGNANCY, TableNames.INDIVIDUALINCARCERATION,
                TableNames.NEWBORN, TableNames.STATUSOFTAXFILING, TableNames.DCINDIVIDUALPROFILE,
                TableNames.INDIVIDUALLOWESTCOSTEMPLOYERPLAN, TableNames.DISABILITY, TableNames.EDUCATIONALEXPENSE,
                SSIBENEFIT, DCINDIVIDUALMINORPARENT, CONVERSIONCROSSREFERENCE, CONVERSIONINDIVIDUALINFO,
                TableNames.CUSTODYDETAIL, TableNames.DCTHIRDPARTYLIABILITY, TableNames.EMERGENCYMEDICALCONDITION,
                EMERGENCYMEDICALCONDITIONEXTENSION, TableNames.DCREPRESENTATIVE, DCREPRESENTATIVECASEASSOCIATION,
                TableNames.QUALIFIEDINCOMETRUST, "DSNAPIncome", "DSNAPResource",
                TableNames.ELIGIBILITYINDIVIDUALBENEFITS, "CustodyTitleIVE", "DCIndividualLongTermCare",
                TableNames.EDUCATIONHISTORYDETAIL, ESIMECRESPONSE, INCOMEEMPLOYMENTINFO, TableNames.OUTOFSTATEBENEFIT,
                EDUCATION, TableNames.EDUCATIONENROLLMENT, ATTENDANCE, TableNames.EMANCIPATION, TableNames.INCAPACITY,
                TableNames.CARINGFORANINDIVIDUAL, CARINGFORANINDIVIDUALVERIFICATIONDETAIL, JOINTOWNERDETAIL,
                TableNames.MEALARRANGEMENT, TableNames.MIGRANTSEASONALFARMWORKERS, DCWORKREGISTRATION,
                "SafeRentMortgage", "SafeDenial", TableNames.DCINDIVIDUALALIENTYPE, TableNames.CASEINTERVIEWEE,
                TableNames.LOSSOFEMPLOYMENTDETAIL, TableNames.SDXINDIVIDUALSAFEDETAIL));

        public static List<String> KTAPList = Collections.unmodifiableList(Arrays.asList(TableNames.WININFO,
                TableNames.INDIVIDUALBENEFITEXTENSION, TableNames.EXEMPTIONDETAIL, TableNames.HEADOFHOUSEHOLD,
                TableNames.STATUSOFINDIVIDUALHOUSEHOLD, TableNames.INDIVIDUALLIVINGARRANGEMENT, TableNames.RESIDENCY,
                TableNames.DCINDIVIDUAL, TableNames.SDXELIGIBILITY, DCALLADDRESS, TableNames.RELATIONSHIP,
                TableNames.JOINTCUSTODY, TableNames.STATUSOFNONCUSTODIALPARENT, CITIZENSHIP, DCINDIVIDUALALIEN,
                TableNames.PREGNANCY, TableNames.INDIVIDUALINCARCERATION, TableNames.NEWBORN, OTHEREARNEDINCOME,
                UNEARNEDINCOME, EMPLOYMENT, SELFEMPLOYMENT, TableNames.DISABILITY, DCINDIVIDUALMINORPARENT,
                TableNames.EXPENSE, TableNames.EXPENSEAMOUNT, ALLRESOURCE, TableNames.OUTOFSTATEBENEFIT, EDUCATION,
                TableNames.EDUCATIONENROLLMENT, ATTENDANCE, TableNames.INCAPACITY, TableNames.CARINGFORANINDIVIDUAL,
                CARINGFORANINDIVIDUALVERIFICATIONDETAIL, JOINTOWNERDETAIL, DCWORKREGISTRATION, "AssessmentInformation",
                "DCEntitledBenefit", TableNames.CASEINTERVIEWEE, TableNames.STATUSOFHOUSEHOLDCOMPOSITIONASSOCIATION,
                TableNames.STATUSOFHOUSEHOLDCOMPOSITIONSUMMARY, TableNames.LOSSOFEMPLOYMENTDETAIL,
                TableNames.KWPASSESSMENTCONSENT, TableNames.DCDOMESTICVIOLENCE));

        public static List<String> KCList = Collections.unmodifiableList(Arrays.asList(TableNames.HEADOFHOUSEHOLD,
                TableNames.STATUSOFINDIVIDUALHOUSEHOLD, TableNames.INDIVIDUALLIVINGARRANGEMENT, TableNames.RESIDENCY,
                TableNames.DCINDIVIDUAL, DCALLADDRESS, TableNames.RELATIONSHIP, CITIZENSHIP, DCINDIVIDUALALIEN,
                OTHEREARNEDINCOME, UNEARNEDINCOME, EMPLOYMENT, TableNames.SDXELIGIBILITY, TableNames.DISABILITY,
                DCINDIVIDUALMINORPARENT, TableNames.EXPENSE, TableNames.EXPENSEAMOUNT, ALLRESOURCE,
                TableNames.OUTOFSTATEBENEFIT, EDUCATION, TableNames.EDUCATIONENROLLMENT, ATTENDANCE,
                TableNames.LOSSOFEMPLOYMENTDETAIL));
        public static List<String> MedicaidList = Collections.unmodifiableList(Arrays.asList(
                TableNames.STATUSOFINDIVIDUALHOUSEHOLD, TableNames.INDIVIDUALLIVINGARRANGEMENT, TableNames.RESIDENCY,
                TableNames.DCINDIVIDUAL, DCALLADDRESS, TableNames.NONESIMECRESPONSE, TableNames.RELATIONSHIP,
                TableNames.INDIVIDUALFOSTERCARE, TableNames.LOCDETERMINATION, NONCUSTODIALPARENTALRELATIONSHIP,
                TableNames.STATUSOFNONCUSTODIALPARENT, APTCINCOMEDETAILS, TableNames.NOINCOMEVERIFICATION,
                TableNames.VERIFYCURRENTINCOME, TableNames.HEALTHINSURANCECOVEREDINDIVIDUALSDETAIL,
                HEALTHINSURANCEFACILITYTYPE, HEALTHINSURANCEPOLICYDETAIL, ESICOVERAGEDETAILS, CITIZENSHIP,
                DCINDIVIDUALALIEN, TableNames.DCINDIVIDUALCOMMUNITYINTEGRATIONSUPPLEMENTATION,
                TableNames.CARETAKERSERVICE, TableNames.PREGNANCY, TableNames.INDIVIDUALINCARCERATION,
                TableNames.NEWBORN, TableNames.STATUSOFTAXFILING, TableNames.DCINDIVIDUALPROFILE,
                TableNames.INDIVIDUALLOWESTCOSTEMPLOYERPLAN, OTHEREARNEDINCOME, UNEARNEDINCOME, EMPLOYMENT,
                SELFEMPLOYMENT, TableNames.DISABILITY, SSIBENEFIT, CONVERSIONCROSSREFERENCE, CONVERSIONINDIVIDUALINFO,
                TableNames.CUSTODYDETAIL, TableNames.EXPENSE, TableNames.EXPENSEAMOUNT, SELFEMPLOYMENTPAYEXPENSE,
                SHORTTERMEXPENSE, UNOCCUPIEDSHELTER, TableNames.DCTHIRDPARTYLIABILITY,
                TableNames.EMERGENCYMEDICALCONDITION, EMERGENCYMEDICALCONDITIONEXTENSION, ALLRESOURCE,
                TableNames.DCREPRESENTATIVE, DCREPRESENTATIVECASEASSOCIATION, TableNames.QUALIFIEDINCOMETRUST,
                TableNames.ELIGIBILITYINDIVIDUALBENEFITS, ESIMECRESPONSE, INCOMEEMPLOYMENTINFO,
                TableNames.OUTOFSTATEBENEFIT, JOINTOWNERDETAIL, TableNames.SDXELIGIBILITY,
                TableNames.DCINDIVIDUALALIENTYPE, TableNames.CASEINTERVIEWEE, TableNames.SUBSIDIZEDADOPTION,
                TableNames.TRANSFERREDRESOURCE, TableNames.STATUSOFHOUSEHOLDCOMPOSITIONASSOCIATION,
                TableNames.STATUSOFHOUSEHOLDCOMPOSITIONSUMMARY, TableNames.LOSSOFEMPLOYMENTDETAIL, TableNames.LTCCOUPLE,
                TableNames.MONEYFOLLOWSTHEPERSON, TableNames.SUSPENSIONRECORD));

        public static Map<String, ArrayList<String>> getAllTables() {
            Map<String, ArrayList<String>> AllTables = new HashMap<>();
            AllTables.put(ProgramCode.QHP, (ArrayList<String>) SNAPList);
            AllTables.put(ProgramCode.STATESUPPLEMENT, (ArrayList<String>) SNAPList);
            AllTables.put(ProgramCode.SNAP, (ArrayList<String>) SNAPList);
            AllTables.put(ProgramCode.SAFE, (ArrayList<String>) SNAPList);
            AllTables.put(ProgramCode.KTAP, (ArrayList<String>) SNAPList);
            AllTables.put(ProgramCode.CCAP, (ArrayList<String>) SNAPList);
            AllTables.put(ProgramCode.KINSHIPCARE, (ArrayList<String>) SNAPList);
            AllTables.put(ProgramCode.MEDICAID, (ArrayList<String>) SNAPList);
            return AllTables;
        }
    }

    public static class SNAPMidMonthDay {
        private SNAPMidMonthDay() {

        }

        public static final int MIDMONTHDAY = 15;
    }

    public static class FilterDates {
        private FilterDates() {

        }

        public static final String TECHNICALBEGINDATE = "TechnicalBeginDate";
        public static final String TECHNICALENDDATE = "TechnicalEndDate";
        public static final String FUNCTIONALBEGINDATE = "FunctionalBeginDate";
        public static final String FUNCTIONALENDDATE = "FunctionalEndDate";
    }

    public static class MedicalFrailtyVerificationSource {
        private MedicalFrailtyVerificationSource() {

        }

        public static final String MCO = "MCO";
        public static final String SELFATTESTATION = "SA";
        public static final String STATEINTERFACE = "SS";
        public static final String ARDV = "ARDV";
    }

    public static class DCMedicallyFrailReason {
        private DCMedicallyFrailReason() {

        }

        public static final String N = "N";
        public static final String Y = "Y";
        public static final String A = "A";
        public static final String H = "H";
        public static final String M = "M";
        public static final String P = "P";
        public static final String S = "S";
    }

    public static class MedicallyFrailReasons {
        private MedicallyFrailReasons() {

        }

        public static final String MR = "MR";
        public static final String SS = "SS";
        public static final String RW = "RW";
        public static final String BE = "BE";
        public static final String SA = "SA";
        public static final String VA = "VA";
        public static final String BL = "BL";
        public static final String IH = "IH";
        public static final String WC = "WC";
        public static final String ESR = "ESR";
        public static final String RR = "RR";
        public static final String MCO = "MCO";
        public static final String HO = "HO";
        public static final String ADL = "ADL";
        public static final String SF = "SF";
    }

    public static class RandomControlTrialParam {
        private RandomControlTrialParam() {

        }

        public static final String HBEHRCT = "HBEHRCT";
        public static final String ALIENREFUGEE = "AR";
    }

    public static class NoticeReasons {
        private NoticeReasons() {

        }

        public static final String EL2131 = "EL2131";
        public static final String EL2086 = "EL2086";
        public static final String EL2134 = "EL2134";
        public static final String EL2135 = "EL2135";
        public static final String EL2136 = "EL2136";
        public static final String EL9998 = "EL9998";
        public static final String EL9999 = "EL9999";
        public static final String EL1020 = "EL1020";
        public static final String EL7023 = "EL7023";
        public static final String EL7002 = "EL7002";
        public static final String EL7007 = "EL7007";
        public static final String EL7015 = "EL7015";
        public static final String EL7016 = "EL7016";
        public static final String EL7011 = "EL7011";
        public static final String EL2053 = "EL2053";
        public static final String EL7022 = "EL7022";
        public static final String EL1741 = "EL1741";
        public static final String EL1777 = "EL1777";
        public static final String EL1776 = "EL1776";
        public static final String EL1779 = "EL1779";
        public static final String EL1786 = "EL1786";
        public static final String EL1788 = "EL1788";
        public static final String EL1791 = "EL1791";
        public static final String EL1792 = "EL1792";
        public static final String EL1795 = "EL1795";
        public static final String EL7019 = "EL7019";
        public static final String EL1764 = "EL1764";
        public static final String EL1800 = "EL1800";
        public static final String EL2065 = "EL2065";
        public static final String EL1005 = "EL1005";
        public static final String EL2014 = "EL2014";
        public static final String EL1014 = "EL1014";
        public static final String EL1010 = "EL1010";
        public static final String EL1011 = "EL1011";
        public static final String EL1007 = "EL1007";
        public static final String EL2044 = "EL2044";
        public static final String EL2039 = "EL2039";
        public static final String EL1022 = "EL1022";
        public static final String EL2025 = "EL2025";
        public static final String EL2023 = "EL2023";
        public static final String EL2026 = "EL2026";
        public static final String EL2040 = "EL2040";
        public static final String EL2041 = "EL2041";
        public static final String EL2066 = "EL2066";
        public static final String EL4444 = "EL4444";
        public static final String EL5555 = "EL5555";
        public static final String EL6666 = "EL6666";
        public static final String EL2005 = "EL2005";
        public static final String EL1734 = "EL1734";
        public static final String EL1748 = "EL1748";
        public static final String EL1731 = "EL1731";
        public static final String EL1744 = "EL1744";
        public static final String EL1749 = "EL1749";
        public static final String EL1527 = "EL1527";
        public static final String EL1528 = "EL1528";
        public static final String EL1529 = "EL1529";
        public static final String EL9904 = "EL9904";
        public static final String EL1560 = "EL1560";
        public static final String EL1514 = "EL1514";
        public static final String APPROVEDALLELIGIBILITY = "EL1568";
        public static final String RNICODE = "EL1754";
        public static final String TMEMBER = "EL1623";
        public static final String SSPMPEND = "EL1648";
        public static final String SSPMDENY = "EL1649";
        public static final String EL9905 = "EL9905";
        public static final String EL9906 = "EL9906";
        public static final String EL9907 = "EL9907";
        public static final String EL9908 = "EL9908";
        public static final String EL9909 = "EL9909";
        public static final String EL5003 = "EL5003";
        public static final String EL1710 = "EL1710";
        public static final String EL1712 = "EL1712";
        public static final String EL1002 = "EL1002";
        public static final String EL1721 = "EL1721";
        public static final String EL1719 = "EL1719";
        public static final String EL1723 = "EL1723";
        public static final String EL1722 = "EL1722";
        public static final String EL1742 = "EL1742";
        public static final String EL1727 = "EL1727";
        public static final String EL1728 = "EL1728";
        public static final String EL1729 = "EL1729";
        public static final String EL1720 = "EL1720";
        public static final String EL1724 = "EL1724";
        public static final String EL1726 = "EL1726";
        public static final String EL1793 = "EL1793";
        public static final String EL1794 = "EL1794";
        public static final String EL1797 = "EL1797";
        public static final String EL1789 = "EL1789";
        public static final String EL2058 = "EL2058";
        public static final String EL1798 = "EL1798";
        public static final String EL1738 = "EL1738";
        public static final String EL1616 = "EL1616";
        public static final String EL1647 = "EL1647";
        public static final String EL1966 = "EL1966";
        public static final String ELIGIBILITYNOTTESTED = "EL1775";
        public static final String EL2012 = "EL2012";
        public static final String EL2030 = "EL2030";
        public static final String EL2032 = "EL2032";
        public static final String EL1780 = "EL1780";
        public static final String EL1924 = "EL1924";
        public static final String EL2059 = "EL2059";
        public static final String EL9911 = "EL9911";
        public static final String IPVPENDINGFORINDIVIDUAL = "EL1624";
        public static final String EL2022 = "EL2022";
        public static final String EL2001 = "EL2001";
        public static final String EL2015 = "EL2015";
        public static final String EL1759 = "EL1759";
        public static final String EL2054 = "EL2054";
        public static final String EL2033 = "EL2033";
        public static final String EL5009 = "EL5009";
        public static final String EL9912 = "EL9912";
        public static final String EL1562 = "EL1562";
        public static final String EL1951 = "EL1951";
        public static final String EL2072 = "EL2072";
        public static final String EL2073 = "EL2073";
        public static final String EL9913 = "EL9913";
        public static final String EL9914 = "EL9914";
        public static final String EL9915 = "EL9915";
        public static final String EL9916 = "EL9916";
        public static final String EL9918 = "EL9918";
        public static final String EL9917 = "EL9917";
        public static final String EL2075 = "EL2075";
        public static final String EL1569 = "EL1569";
        public static final String EL1952 = "EL1952";
        public static final String EL1921 = "EL1921";
        public static final String EL2074 = "EL2074";
        public static final String EL1570 = "EL1570";
        public static final String EL2076 = "EL2076";
        public static final String EL2085 = "EL2085";
        public static final String EL2077 = "EL2077";
        public static final String EL2078 = "EL2078";
        public static final String EL2079 = "EL2079";
        public static final String EL9921 = "EL9921";
        public static final String CCSSCLOSURE = "EL1964";
        public static final String EL1661 = "EL1661";
        public static final String EL2080 = "EL2080";
        public static final String EL2087 = "EL2087";
        public static final String EL1914 = "EL1914";
        public static final String EL1571 = "EL1571";
        public static final String EL2042 = "EL2042";
        public static final String EL7018 = "EL7018";
        public static final String EL7020 = "EL7020";
        public static final String EL5014 = "EL5014";
        public static final String EL5015 = "EL5015";
        public static final String EL5017 = "EL5017";
    }

    public static List<String> WithdrawalNotices = Collections.unmodifiableList(Arrays.asList(NoticeReasons.EL7018,
            NoticeReasons.EL7020, NoticeReasons.EL5014, NoticeReasons.EL5015, NoticeReasons.EL5017));

    public static class ExpenseTypeCode {
        private ExpenseTypeCode() {

        }

        public static final String SELFEMPLOYMENTEXPENSE = "ST";
        public static final String CHILDSUPPORTARREARAGE = "CSA";
    }

    public static class IndividualBenefitAttributes {
        private IndividualBenefitAttributes() {

        }

        public static final int PROGRAMCODES = 0;
        public static final int TYPEOFASSISTANCECODES = 1;
        public static final int LENGTH = 2;
    }

    public static class LTCResourceTransferConsentType {
        private LTCResourceTransferConsentType() {

        }

        public static final String RESOURCE = "Resource";
        public static final String INCOME = "Income";
    }

    public static class CurrentLocationReasonCode {
        private CurrentLocationReasonCode() {

        }

        public static final String WORK = "WK";
    }

    public static class Relationship {
        private Relationship() {

        }

        public static final String ADOPTEDSON = "AS";
        public static final String ADOPTEDDAUGHTER = "AD";
        public static final String HUSBAND = "HU";
        public static final String MOTHER = "MO";
        public static final String STEPMOTHER = "SM";
        public static final String WIFE = "WI";
        public static final String SON = "SO";
        public static final String STEPSON = "SS";
        public static final String DAUGHTER = "DA";
        public static final String STEPDAUGHTER = "SD";
        public static final String NEPHEW = "NE";
        public static final String NIECE = "NI";
        public static final String FOSTERCHILD = "FK";
        public static final String FATHER = "FA";
        public static final String STEPFATHER = "SF";
        public static final String PARENT = "PA";
        public static final String BROTHER = "BR";
        public static final String STEPBROTHER = "SB";
        public static final String SISTER = "SI";
        public static final String STEPSISTER = "ST";
        public static final String SPOUSE = "SP";
        public static List<String> parentList = Collections
                .unmodifiableList(Arrays.asList(FATHER, MOTHER, STEPFATHER, STEPMOTHER));
        public static final List<String> spouseList = Collections
                .unmodifiableList(Arrays.asList(HUSBAND, WIFE, SPOUSE));
    }

    public static class ProgramLimit {
        private ProgramLimit() {

        }

        public static final String KTAPBUDGET = "KTAP_BDGT_NEEDS";
        public static final String SNAPBUDGET = "SNAP_130PCT_LMT";
        public static final String CCAPBUDGET = "HH";
        public static final String CCAPBUDGETMORETHAN8 = "PLUS";
    }

    public static class FPLLimit {
        private FPLLimit() {

        }

        public static final String AFDC = "AFDC";
        public static final String FPL100 = "100FPL";
        public static final String FPL133 = "133FPL";
        public static final String FPL150 = "150FPL";
        public static final String FPL159 = "159FPL";
        public static final String FPL185 = "185FPL";
        public static final String FPL200 = "200FPL";
        public static final String FPL250 = "250FPL";
        public static final String FPL300 = "300FPL";
        public static final String FPL400 = "400FPL";
        public static final String FPL420 = "420FPL";
        public static final String FPL100_APTC = "100FPL_APTC";
        public static final String FPL150_APTC = "150FPL_APTC";
        public static final String FPL200_APTC = "200FPL_APTC";
        public static final String FPL250_APTC = "250FPL_APTC";
        public static final String FPL300_APTC = "300FPL_APTC";
        public static final String FPL400_APTC = "400FPL_APTC";
    }

    public static class BenefitSource {
        private BenefitSource() {

        }

        public static final String NEWBORN = "WP-Newborn";
    }

    public static class IncarcerationSource {
        private IncarcerationSource() {

        }

        public static final String SELFATTEST = "DC";
    }

    public static class CertifiedGroupSize {
        private CertifiedGroupSize() {

        }

        public static final String CERTIFIEDGROUPSIZE_1 = "1";
        public static final String CERTIFIEDGROUPSIZE_2 = "2";
        public static final String CERTIFIEDGROUPSIZE_3 = "3";
        public static final String CERTIFIEDGROUPSIZE_4 = "4";
        public static final String CERTIFIEDGROUPSIZE_5 = "5";
        public static final String CERTIFIEDGROUPSIZE_6 = "6";
        public static final String CERTIFIEDGROUPSIZE_7 = "7";
        public static final String CERTIFIEDGROUPSIZE_8 = "8";
        public static final String CERTIFIEDGROUPSIZE_9 = "9";
        public static final String CERTIFIEDGROUPSIZE_10 = "10";
        public static final String CERTIFIEDGROUPSIZE_11 = "11";
        public static final String CERTIFIEDGROUPSIZE_12 = "12";
        public static final String CERTIFIEDGROUPSIZE_13 = "13";
        public static final String CERTIFIEDGROUPSIZE_14 = "14";
        public static final String CERTIFIEDGROUPSIZE_15 = "15";
        public static final String CERTIFIEDGROUPSIZE_16 = "16";
        public static final String CERTIFIEDGROUPSIZE_17 = "17";
        public static final String CERTIFIEDGROUPSIZE_18 = "18";
        public static final String CERTIFIEDGROUPSIZE_19 = "19";
        public static final String CERTIFIEDGROUPSIZE_20 = "20";
        public static final String CERTIFIEDGROUPSIZE_21 = "21";
    }

    public static class Financial {
        private Financial() {

        }

        public static final String TAXFILINGLIMITS = "TaxFilingLimits";
        public static final String EDFINANCIALPARAMETERS = "EDFINPARMS";
        public static final String EDAPTCLIMITS = "EDAPTCLIMITS";
        public static final String FINANCIALPARAMETERS = "FINPARAMETERS";
        public static final String INCOMEREASONABLECOMPATIBILITYLIMIT = "FININCREASCOMPPCLIMIT";
        public static final String PREMIUMTHRESHOLDEDGINCOME = "FINPREMIUMTHRESHOLDEDGINC";

        public static final String FPLPERCENTAGE = "FPL_PCT";
        public static final String DISREGARDPERCENTAGE = "DISREGARD_PCT";
    }

    public static class MaritalStatusCode {
        private MaritalStatusCode() {

        }

        public static final String NEVERMARRIED = "NM";
    }

    public static class NCP {
        private NCP() {

        }

        public static final String DCSE = "DCSE";
        public static final String ETPNC = "ETPNC";
    }

    public static class NonEsiConstants {
        private NonEsiConstants() {

        }

        public static final String EDB = "EDB";
        public static final String ORGANIZATIONCODE = "MEDI";
        public static final String TYPEOFCOVERAGEMEDICAREPARTAB = "MED";
        public static final String TYPEOFCOVERAGEMEDICAREPARTA = "PA";
        public static final String TYPEOFCOVERAGEMEDICAREPARTB = "PB";
        public static final String MEDICAID = "MEDC";
        public static final String CHIP = "CHIP";
        public static final String BHPC = "BHPC";
        public static final String VHPC = "VHPC";
        public static final String TRICARE = "TRIC";
        public static final String PEACECORPS = "PECO";
        public static final String MEDICARE = "MEDI";
    }

    public static class IncomeFrequencyCode {
        private IncomeFrequencyCode() {

        }

        public static final String ANNUAL = "YR";
        public static final String BIWEEKLY = "BW";
        public static final String DAILY = "DA";
        public static final String HOURLY = "HO";
        public static final String MONTHLY = "MO";
        public static final String ONETIME = "ON";
        public static final String QUATERLY = "QU";
        public static final String SEMIMONTHLY = "SM";
        public static final String WEEKLY = "WE";
        public static final String IRREGULAR = "IR";
        public static final String SINGLEPAYMENT = "SP";
    }

    public static class ExpenseType {
        private ExpenseType() {

        }

        public static final String IRWE = "IRWE";
        public static final String BWE = "BWE";
    }

    public static class P2PEmbargoPeriodCompletion {
        private P2PEmbargoPeriodCompletion() {

        }

        public static final int P2PEMBARGOPERIOD = 35;
    }

    public static class PatientLiabilityRunMode {
        private PatientLiabilityRunMode() {

        }

        public static final String INDEPENDENT = "Independent";
        public static final String INTEGRATED = "Integrated";
    }

    public static class PTLBLOCList extends TypeofAssistance {
        private PTLBLOCList() {

        }

        public static List<String> hospiceLOCTypeList = Collections.unmodifiableList(Arrays.asList("NIHP"));
        public static List<String> facilityLOCTypeList = Collections
                .unmodifiableList(Arrays.asList("NF", "IHP", "MHP", "ICF", "IMD", EPSDT, PRTFI, PRTFII));
        public static List<String> nonWaiverLOCTypeList = Collections
                .unmodifiableList(Arrays.asList("NIHP", "NF", "IHP", "MHP", "ICF", "IMD", EPSDT, PRTFI, PRTFII));
        public static List<String> waiverLOCTypeList = Collections
                .unmodifiableList(Arrays.asList("ABI-Acute", "ADD", "SCL", "HCB", "MII", "MPW", "MFP", "HSWV", "ABI"));
        public static final String ADD = "ADD";
        public static final String HCB = "HCB";
        public static final String NIHP = "NIHP";
        public static final String IHP = "IHP";
    }

    public static class PTLBTOAList {
        private PTLBTOAList() {

        }

        public static List<String> waiverLOCTOAList = Collections
                .unmodifiableList(Arrays.asList("MFTP", "HCBS", "ABIM", "ADDY", "MICP", "MWII", "SCLM", "ABIF"));
        public static final String ADDY = "ADDY";
        public static final String HCBS = "HCBS";
        public static final String NIHP = "HSPC";
    }

    public static class IncomeFactor {
        private IncomeFactor() {

        }

        public static final double ANNUAL = 12;
        public static final double SEMIANNUAL = 6;
        public static final double BIWEEKLY = 13.00 / 6;
        public static final double DAILY = 20;
        public static final double HOURLY = 160;
        public static final double QUATERLY = 3;
        public static final double SEMIMONTHLY = 2;
        public static final double WEEKLY = 4.33;
    }

    public static class ShelterType {
        private ShelterType() {

        }

        public static final String OCCUPIEDHOUSING = "OH";
        public static final String UNOCCUPIEDHOUSING = "UH";
    }

    public static class AlienType {
        private AlienType() {

        }

        public static final String PAROLEE = "PA";
        public static final String CUBANHAITIAN = "CH";
        public static final String UNDOCUMENTEDALIEN = "UA";
        public static final String REFUGEE = "RE";
    }

    public static class StoredProcedures {
        private StoredProcedures() {

        }

        public static final String SP_USPCHECKINDIVIDUALISACTIVEINSNAP = "[EligibilityDetermination].[uspCheckIndividualIsActiveInSNAP]";

        public static final String SP_USPGETNEXTEDGTRACEIDSFROMSEQUENCER = "[EligibilityDetermination].[uspGetNextEdgTraceIdsFromSequencer]";
        public static final String SP_USPDELETEPREVIOUSELIGIBILITYDATA = "[EligibilityDetermination].[uspDeletePreviousEligibilityData]";
        public static final String SP_USPDELETEPREVIOUSELIGIBILITYDATA_ENROLLMENT = "[EligibilityDetermination].[uspDeletePreviousEligibilityDataEnrollment]";
        public static final String SP_USPDELETEPREVIOUSSAFEELIGIBILITYDATA = "[EligibilityDetermination].[uspDeletePreviousSAFEEligibilityData]";
        public static final String SP_USPDELETEPREVIOUSCCAPELIGIBILITYDATA = "[EligibilityDetermination].[uspDeletePreviousCCAPEligibilityData]";
        public static final String SP_USPDELETEPREVIOUSPTLBDATA = "[EligibilityDetermination].[uspDeletePreviousPTLBData]";
        public static final String SP_USPGETEDBCTRANSACTIONLOCK = "[EligibilityDetermination].[uspGetEDBCTransactionLock]";
        public static final String SP_USPGETDCDATA = "[DataCollection].[UspGetDCData]";
        public static final String SP_USPGETRESOURCEDATA = "[DataCollection].[UspGetResourceData]";

        public static final String SP_USPGETRECOUPMENTAMOUNT = "[BenefitManagement].[UspGetRecoupmentAmount]";
        public static final String SP_USPDELETERENEWALPREVIOUSELIGIBILITYDATA = "[EligibilityDetermination].[uspDeleteRenewalPreviousEligibilityData]";
        public static final String SP_USPDELETEVERIFICATIONCHECKLISTWITHOUTPRINTDATE = "[EligibilityDetermination].[uspDeleteVerificationCheckListWithOutPrintDate]";
        public static final String SP_USPPERFORMTRANSACTION = "[EligibilityDetermination].[uspPerformTransaction]";
        public static final String SP_USPINSERTEDBCBENEFITDISCREPANCY = "[EligibilityDetermination].[UspInsertEDBCBenefitDiscrepancy]";
        public static final String SP_USPINSERTOETWORKREGISTRATION = "[EligibilityDetermination].[UspInsertOETWorkRegistration]";
        public static final String SP_USPGETCASEINDIVIDUALLIST = "[EligibilityDetermination].[UspGetCaseIndividualList]";
        public static final String SP_USPDETERMINEEDMFORSUPERVISOROVERRIDE = "[EligibilityDetermination].[UspDetermineEDMForSupervisorOverride]";
        public static final String SP_USPPERFORMSUPERVISOROVERRIDE = "[EligibilityDetermination].[uspPerformSupervisorOverride]";
        public static final String SP_USPINSERTEDBCLASTVERIFIEDFINANCIALDETAILSTAGING = "[EligibilityDetermination].[UspInsertEDBCLastVerifiedFinancialDetailStaging]";
        public static final String SP_USPDELETEPREVIOUSEDBCLASTVERIFIEDFINANCIALDETAILSTAGINGDATA = "[EligibilityDetermination].[UspDeletePreviousEDBCLastVerifiedFinancialDetailStagingData]";
        public static final String SP_USPREADEDBCLASTVERIFIEDFINANCIALDETAILS = "[EligibilityDetermination].[UspReadEDBCLastVerifiedFinancialDetails]";
        public static final String SP_USPDELETEUSPDELETEELIGIBILITYKTAPDEDUCTIONSTAGINGDATA = "[EligibilityDetermination].[UspDeleteEligibilityKTAPDeductionStagingData]";
        public static final String SP_USPDELETEPREVIOUSELIGIBILITYDATAFORRENEWALDENIAL = "[EligibilityDetermination].[uspDeletePreviousEligibilityDataForRenewalDenial]";
        public static final String SP_USPDELETEPREVIOUSELIGIBILITYDATAFORPASSTHROUGHDENIAL = "[EligibilityDetermination].[uspDeletePreviousEligibilityDataForPassThroughDenial]";
        public static final String SP_USPRFIDENAILFORCASCADETOA = "[EligibilityDetermination].[uspRFIDenailForCasCadeTOA]";
        public static final String SP_USPGETRFIMAXDUEDATEFORSNAP = "[EligibilityDetermination].[uspGetRFIMaxDueDateForSNAP]";
        public static final String SP_USPGETPENALTYSEQUENCENUMBERNEXTVAL = "[EligibilityDetermination].[uspGetPenaltySequenceNumberNextVal]";
        public static final String SP_USPUPDATEELIGIBILITYDATAFOREDGTRACEID = "[EligibilityDetermination].[uspUpdateEligibilityDataForEdgTraceId]";
        public static final String SP_USPINSERTTRIGGERINMASSCHANGETRIGGER = "[EligibilityDetermination].[uspMUInsertTriggersInMassChangeTrigger]";
        public static final String SP_USPUPDATETRANSACTIONTABLE = "[EligibilityDetermination].[uspUpdateTransactionDetails]";
        public static final String SP_USPGETCURRENTPROGRAMACTION = "[DataCollection].[uspGetCurrentProgramAction]";
        public static final String SP_USPGETINTERVIEWNOTICESENTSTATUS = "[Correspondence].[uspGetInterviewNoticeSentStatus]";
        public static final String SP_USPGETACTIVECHILDCAREENROLLMENTSFORINDIVIDUALS = "[ChildCareEnrollment].[uspGetActiveChildCareEnrollmentsForIndividuals]";
        public static final String SP_USPGETHBEHEALTHDETAILS = "[EligibilityDetermination].[uspGetHBEHealthDetails]";
        public static final String SP_USPGETISCEAPPLICABLEAFTERRECERT = "[EligibilityDetermination].[uspGetIsCEApplicableAfterRecert]";
        public static final String SP_USPCHECKKHIPPRUNREQUIRED = "EligibilityDetermination.uspCheckKHIPPRunRequired";
        public static final String SP_USPCHECKINDIVIDUALSNAPETPREQUIREMENTSTATUSFORCCAP = "[EligibilityDetermination].[uspCheckIndividualSNAPETPRequirementStatusForCCAP]";
        public static final String SP_BMGETFADINSSUANCEHISTORY = "[BenefitManagement].[uspgetFADIssuanceHistory]";
        public static final String SP_USPCHECKLOSSOFINCOMEVERIFICATIONLISTFORSNAP = "[EligibilityDetermination].[uspCheckLossOfIncomeVerificationListForSNAP]";
        public static final String SP_GETVCLIDS = "[EligibilityDetermination].[uspGetEligibilityVerificationChecklistIds]";
        public static final String SP_SDXINDIVIDUALSAFEELIGIBILITYDETAILS = "[Interface].[uspSDXIndividualSAFEEligibilityDetails]";
        public static final String SP_USPGETAPPRISSLIVINGARRANGEMENTDATA = "DataCollection.uspGetApprissLivingArrangementData";
    }

    public static class StoredProceduresParameters {
        private StoredProceduresParameters() {

        }

        public static final String CASENUMBER = "caseNumber";
        public static final String DECISIONSERVICENAME = "DecisionServiceName";
        public static final String MESSAGEDESCRIPTION = "MessageDescription";
        public static final String USERID = "UserId";
        public static final String CURRENTDATE = "CurrentDate";
        public static final String ISREBUILD = "isRebuild";
        public static final String COUNT = "count";
        public static final String PROCESSNAME = "processName";
        public static final String EDBCSTARTDATE = "edbcStartDate";
        public static final String LOCKDURATION = "lockDuration";
        public static final String CREATEDATE = "createDate";
        public static final String CREATEUSERID = "createUserId";
        public static final String EDBCRUNDATE = "edbcRunDate";
        public static final String EDBCRUNMODE = "edbcRunMode";

        public static final String ISDELETEPRESCREENING = "isDeletePrescreening";
        public static final String BEGINDATE = "BeginDate";
        public static final String INDIVIDUALIDS = "IndividualIDs";
        public static final String INDIVIDUALID = "Individualid";
        public static final String RESOURCETYPECODE = "resourcetypecode";
        public static final String INDIVIDUALS = "individuals";
        public static final String RULEFLOWIDS = "RuleFlowIDs";
        public static final String TOTALCOUNTS = "TotalCounts";
        public static final String RULESTATEMENTIDS = "RuleStatementIDs";
        public static final String TOTALCOUNTSTATEMENTS = "TotalCountStatements";

        public static final String EDMS = "EDM";
        public static final String CASEDATA = "CaseData";
        public static final String RUNTIME = "RunTime";
        public static final String AUDITORUSERID = "auditorUserId";
        public static final String PROGRAMCODES = "ProgramCodes";
        public static final String VERIFICATIONCHECKLISTDUEDATES = "DueDates";
        public static final String OVERRIDEDATE = "OverrideDate";
        public static final String TOA = "TOA";
        public static final String RFICASENUMBER = "CaseNumber";
        public static final String RFIINDIVIDUALID = "IndividualId";
        public static final String TYPEOFASSISTANCE = "TypeOfAssistance";
        public static final String PROGRAMCODE = "ProgramCode";
        public static final String EDGTRACEID = "edgTraceId";
        public static final String ISTOCREATEPREGRECORD = "IsToCreatePREGRecord";
        public static final String EDMSTARTDATE = "EDMStartDate";
        public static final String EDMENDDATE = "EDMEndDate";
        public static final String TRIGGERCODE = "TriggerCode";
        public static final String SCHEDULERUNDATE = "ScheduleRunDate";
        public static final String ELIGIBILITYBEGINDATE = "EligibilityBeginDate";
        public static final String ELIGIBILITYTRANSACTIONENDDATE = "EligibilityTransactionEndDate";
        public static final String MINIMUMEDM = "MinimumEDM";
        public static final String MAXIMUMEDM = "MaximumEDM";
        public static final String EDBCINPUTPARAMETER = "EDBCInputParameter";
        public static final String ISKHIPPEVALUTED = "IsKHIPPEvaluted";
        public static final String KHIPPRUNREASON = "KHIPPRunReason";
        public static final String KHIPPRUNSTATUS = "KhippRunStatus";
        public static final String SNAPETPINDIVIDUALSFORCCAP = "@SNAPETPIndividualsForCCAP";
        public static final String ACTIONDATE = "ActionDate";
        public static final String SNAPETPSTATUS = "SNAPETPStatus";
        public static final String SOURCESYSTEM = "@SourceSystem";
        public static final String UDCASENUMBER = "UDCaseNumber";
        public static final String UDBENEFITBEGINDATE = "UDBenefitBeginDate";
        public static final String UDBENEFITENDDATE = "UDBenefitEndDate";
        public static final String UDTBMFADPAYMENTDETAILS = "fadPaymentUsertable";
        public static final String INPUTDATA = "@InputData";
        public static final String CASEPROGRAMSTATUSDATE = "CaseProgramStatusDate";
        public static final String APPLICATIONNUMBER = "ApplicationNumber";
        public static final String ISINTERVIEWNOTICESENT = "IsInterviewNoticeSent";
        public static final String INCOMETYPE = "IncomeType";
        public static final String INCOMEID = "IncomeId";
        public static final String COUNTVALUES = "countValues";
        public static final String FIRSTVAL = "FirstVal";
        public static final String LASTVAL = "LastVal";
        public static final String CYCLECOUNT = "CycleCount";
        public static final String SEQINCREMENT = "SeqIncrement";
        public static final String MINSEQ = "MinSeq";
        public static final String MAXSEQ = "MaxSeq";
        public static final String CASENUMBERSAFE = "CaseNumber";
        public static final String INDIVIDUALIDSAFE = "IndividualId";
        public static final String SDXINDIVIDUALSSAFE = "@SDXIndividuals";
        public static final String DATETOBECONSIDERED = "@DateToBeConsidered";
        public static final String TEMPINDIVIDUALIDS = "TempIndividualIds";
        public static final String EDBCRUNSTARTDATE = "EDBCRunStartDate";
        public static final String EDBCRUNENDDATE = "EDBCRunEndDate";
        public static final String CURRENTCASENUMBER = "CurrentCaseNumber";
        public static final String INDIVIDUALIDSNAP = "IndividualId";
        public static final String CURRENTEDM = "CurrentEDM";
        public static final String ISCOREMEMBERINSNAP = "IsCOrEMemberInSNAP";
    }

    public static class DCStoredProcedureTablesOrder {
        private DCStoredProcedureTablesOrder() {

        }

        public static final int STATUSOFINDIVIDUALHOUSEHOLD = 0;
        public static final int HEADOFHOUSEHOLD = 1;
        public static final int INDIVIDUALLIVINGARRANGEMENT = 2;
        public static final int RESIDENCY = 3;
    }

    public static class CategoryOfResource {
        private CategoryOfResource() {

        }

        public static final String LIQUID = "LA";
        public static final String VEHICLE = "VI";
        public static final String REALPROPERTY = "RP";
        public static final String ANNUITY = "AN";
        public static final String BURIALFUNDS = "BF";
        public static final String BURIALPLOTS = "BP";
        public static final String PREARRANGEDFUNERALAGREEMENT = "FA";
        public static final String LIFEINSURANCE = "LI";
        public static final String TRUST = "TR";
        public static final String PROMISSORYNOTES = "PN";
        public static final String OTHERS = "OT";
        public static final String LIFETIMECAREAGREEMENT = "LTC";
        public static final String LIFESETTLEMENTCONTRACT = "LSC";
        public static final String PARTNERSHIPQUALIFIEDLTCPOLICY = "PQ";
        public static final String LIFEESTATE = "LE";
    }

    public static class RealPropertyExclusionReasons {
        private RealPropertyExclusionReasons() {

        }

        public static final String FIRST6MONTHS = "6MO";
        public static final String COMMUNITYSPOUSE = "CSP";
        public static final String DEPENDENTFAMILYMEMBER = "DFM";
        public static final String EFFORTSTOSELL = "ES";
        public static final String ESSENTIALFORSELFSUPPORT = "ESS";
        public static final String INTENTTORETURN = "IRT";
        public static final String JOINTLYOWNED = "JTO";
        public static final String UNABLETOSELL = "US";
    }

    public static class IncomeType {
        private IncomeType() {

        }

        public static final String UNEMPLOYMENTINSURANCEBENEFITS = "UI";
        public static final String RENTALINCOME = "RE";
        public static final String LIFEESTATEINTEREST = "EI";
        public static final String FARMBUSINESS = "FB";
        public static final String MINERALRIGHT = "MR";
        public static final String ILLEGALACTIVITIES = "IA";
        public static final String WAGES = "WS";
        public static final String CHILDSUPPORT = "CS";
        public static final String SOCIALSECURITY = "RS";
        public static final String TFW = "TFW";
        public static final String FFW = "FFW";
        public static final String CI = "CI";
        public static final String FPC = "FPC";
        public static final List<String> NotCountedInKTAP = Collections
                .unmodifiableList(Arrays.asList("TFW", "FFW", "WI"));
        public static final String AMERICORPLIVINGSTIPEND = "ALS";
    }

    public static class PnPIncomeType {
        private PnPIncomeType() {

        }

        public static final String SELFEMPLOYMENTFARMINCOME = "SEF";
        public static final String EARNEDINCOME = "EI";
        public static final String UNEARNEDINCOME = "UI";
        public static final String FOOD = "FS";
        public static final String HOUSING = "HA";
        public static final String CHILDSUPPORT = "CS";
        public static final String SOCIALSECURITY = "SS";
        public static final String UNEMPLOYMENTINSURANCEBENEFITS = "UI";
        public static final String FOSTERCAREINCOME = "FCIPP";
    }

    public static class DataType {
        private DataType() {

        }

        public static final String DECIMAL = "Decimal";
    }

    public static class UnearnedIncomeType {
        private UnearnedIncomeType() {

        }

        public static final String SSI = "SI";
        public static final String SSP = "SP";
        public static final String FCP = "FC";
        public static final String UIB = "UI";
        public static final String RSDI = "RS";
        public static final String ACTUALSSI = "SSIACT";
        public static final String INKIND = "IK";
        public static final String UNEARDINCOMEINKIND = "UN|IK";
        public static final String SPOUSALSUPPORT = "AR";
        public static final String FCI = "FCI";
        public static final String FPC = "FPC";
    }

    public static class IncomeExclusionReasonCode {
        private IncomeExclusionReasonCode() {

        }

        public static final String DIVERTEDTOTHIRDPARTY = "DTP";
        public static final String EXCLUDEDBYLAW = "EBL";
        public static final String RECOUPMENTOFOVERPAYMENT = "RO";
        public static final String USEDFORCAREANDMAINTENANCEOFNONHHM = "CMOOH";
    }

    public static class ResourceReviewOutcome {
        private ResourceReviewOutcome() {

        }

        public static final String REVIEWOUTCOME = "RS";
        public static final String REVIEWOUTCOMEPENDING = "PE";
        public static final String RESOURCECOUNTED = "CR";
    }

    public static class TORReviewOutcomeCode {
        private TORReviewOutcomeCode() {

        }

        public static final String TR = "TR";
        public static final String RT = "RT";
    }

    public static class CategoryOfExpense {
        private CategoryOfExpense() {

        }

        public static final String UTILITY = "UE";
        public static final String SHELTER = "SE";
        public static final String CHILDSUPPORT = "CAE";
        public static final String DEPENDENTCARE = "DCE";
        public static final String MEDICAL = "ME";
        public static final String DEDUCTION = "DE";
        public static final String UTILITYALLOWANCE = "UEA";
        public static final String SHORTTERMEXPENSE = "STE";
        public static final String IRWE_BWEEXPENSE = "IBE";
        public static final String MANDATORYWITHHOLDINGS = "WTH";
    }

    public static class TypeOfExpenseAmount {
        private TypeOfExpenseAmount() {

        }

        public static final String ACTUAL = "ACTUALAMOUNT";
        public static final String LEGALLYOBLIGATED = "LEGALAMOUNT";
        public static final String DEPENDENTCAREAMOUNT = "DE";
        public static final String TRANSPORTAMOUNT = "TE";
    }

    public static class LiquidAssetExclusionsType {
        private LiquidAssetExclusionsType() {

        }

        public static final String SALEOFHOME = "SALE";
        public static final String CURRENTMONTHINCOME = "CI";
        public static final String DESIGNATEDFORBURIAL = "DB";
        public static final String OTHER = "OT";
        public static final String RELOCATIONASSISTANCE = "RELA";
        public static List<String> nonTLExclusionTypes = Collections
                .unmodifiableList(Arrays.asList("CI", "DB", "OT", "RELA"));
    }

    public static class VehicleTypeCode {
        private VehicleTypeCode() {

        }

        public static final String RECREATIONAL = "RECR";
    }

    public static class LiquidAssetTypeCode {
        private LiquidAssetTypeCode() {

        }

        public static final String HOUSESALE = "HS";
        public static final String CASH = "CH";
        public static final String STABLEACCOUNT = "STA";
    }

    public static class PublicAssistanceIndicator {
        private PublicAssistanceIndicator() {

        }

        public static final String PUBLICASSISTANCE = "PA";
        public static final String NONPUBLICASSISTANCE = "NPA";
    }

    public static class CareOfIndividualCode {
        private CareOfIndividualCode() {

        }

        public static final String SNAPCHILDCARE = "SCC";
        public static final String KTAPCHILDCARE = "KCC";
        public static final String INCAPACITATEDINDIVIDUAL = "IIC";
    }

    public static class ConvictionCode {
        private ConvictionCode() {

        }

        public static final String FUGITIVEFELON = "FUFE";
        public static final String CHEMICALDEPENDENCY = "CHDE";
        public static final String PAROLEPROBATION = "PAPR";
        public static final String DRUGFELON = "DRUGFE";
    }

    public static class SubsidizedHouseholdCode {
        private SubsidizedHouseholdCode() {

        }

        public static final String SUBSIDIZEDHOUSEHOLD = "SH";
        public static final String NONSUBSIDIZEDHOUSEHOLD = "NS";
    }

    public static class UnoccupiedShelterCode {
        private UnoccupiedShelterCode() {

        }

        public static final String OCCUPIEDSHELTER = "OC";
        public static final String UNOCCUPIEDSHELTER = "UN";
    }

    public static class SNAPMaxHouseholdSize {
        private SNAPMaxHouseholdSize() {

        }

        public static final String GROUPSIZE8 = "8";
        public static final String GROUPSIZE6 = "6";
    }

    public static class LIIHEAPMaxHouseholdSize {
        private LIIHEAPMaxHouseholdSize() {

        }

        public static final String GROUPSIZE8 = "8";
    }

    public static class KTAPMaxHouseholdSize {
        private KTAPMaxHouseholdSize() {

        }

        public static final String GROUPSIZE7 = "7";
    }

    public static class KCMAXHouseHoldSize {
        private KCMAXHouseHoldSize() {

        }

        public static final String GROUPSIZE6 = "6";
    }

    public static class RulesEngineErrorCodes {
        private RulesEngineErrorCodes() {

        }

        public static String EDRE0001 = "EDRE0001";
        public static String EDRE0002 = "EDRE0002";
        public static String EDRE0003 = "EDRE0003";
        public static String EDRE0004 = "EDRE0004";
        public static String EDRE0005 = "EDRE0005";
    }

    public static class Prescreening {
        private Prescreening() {

        }

        public static final String EDFPLLIMITS = "EDFPLLIMITS";
        public static final String EDAPTCLIMITS = "EDAPTCLIMITS";
        public static final String EDFINANCIALPARAMETERS = "EDFINPARMS";
        public static final String EDKTAPLIMITS = "EDKTAPLIMITS";
        public static final String EDSNAPLIMITS = "EDSNAPLIMITS";
        public static final String EDCCAPFPLLIMIT = "EDCCAPFPLLIMIT";
    }

    public enum EnumNoticeReasons {
        EL5001, EL1100, EL7023, EL7002, EL7007, EL7015, EL7011, EL7016, EL7022, EL9999, EL1017, EL5008, EL9505, EL1019,
        EL1020, EL5009, EL2033, EL2039, EL1105, EL2053, EL2056, EL1566, EL1022, EL1646, EL1560
    }

    public static class CreatorIndicator {
        private CreatorIndicator() {

        }

        public static final String REGULARCREATEDBYEDG = "E";
        public static final String SPLITEDGTRANSACTIONCREATEDBYDI = "D";
        public static final String CONVERSIONLOADCREATEDBYCONVERSION = "C";
        public static final String PRESUMPTIVECREATEDBYDC = "P";
        public static final String COPYEDGCREATEDBYEDG = "Y";
        public static final String RENEWALCLOSURE = "R";
    }

    public static class ReviewStatusCode {
        private ReviewStatusCode() {

        }

        public static final String REVIEWREQUESTED = "RR";
        public static final String REVIEWINITIATE = "RI";
        public static final String REVIEWCOMPLETE = "RC";
        public static final String REVIEWCOMPLETEDENIED = "RCD";
        public static final String INCOMPLETEREVIEWDENIED = "IRD";
        public static final String REVIEWINPROGRESS = "RIP";
    }

    public static class ReviewTypeCode {
        private ReviewTypeCode() {

        }

        public static final String PASSIVERENEWAL = "PS";
    }

    public static String getEligibilityAlreadyRunForConversion() {
        return "Eligibility has been already determined. Conversion renewal closure cannot be performed.";
    }

    public static String getInterviewInitiatedForConversion() {
        return "Case mode is not CV/Interview has been already initiated. Cannot perform conversion closure";
    }

    public static String getP0RecordsNotFoundForConversion() {
        return "No P0 Records were found in CaseProgram.";
    }

    public static class DataValidationErrorCodes {
        private DataValidationErrorCodes() {

        }

        public static String EDDV0001 = "EDDV0001";
        public static String EDDV0002 = "EDDV0002";
        public static String EDDV0003 = "EDDV0003";
        public static String EDDV0004 = "EDDV0004";
        public static String EDDV0005 = "EDDV0005";
        public static String EDDV0006 = "EDDV0006";
        public static String EDDV0007 = "EDDV0007";
        public static String EDDV0008 = "EDDV0008";
        public static String EDDV0009 = "EDDV0009";
        public static String EDDV0010 = "EDDV0010";
        public static String EDDV0011 = "EDDV0011";
        public static String EDDV0012 = "EDDV0012";
        public static String EDDV0013 = "EDDV0013";
        public static String EDDV0014 = "EDDV0014";
        public static String EDDV0015 = "EDDV0015";
        public static String EDDV0016 = "EDDV0016";
        public static String EDDV0017 = "EDDV0017";
        public static String EDDV0124 = "EDDV0124";
        public static String EDDV0128 = "EDDV0128";
        public static String EDDV0018 = "EDDV0018";
        public static String EDDV0019 = "EDDV0019";
        public static String EDDV0020 = "EDDV0020";
        public static String EDDV0021 = "EDDV0021";
        public static String EDDV0022 = "EDDV0022";
        public static String EDDV0023 = "EDDV0023";
        public static String EDDV0024 = "EDDV0024";
        public static String EDDV0025 = "EDDV0025";
        public static String EDDV0026 = "EDDV0026";
        public static String EDDV0027 = "EDDV0027";
        public static String EDDV0028 = "EDDV0028";
        public static String EDDV0029 = "EDDV0029";
        public static String EDDV0030 = "EDDV0030";
        public static String EDDV0031 = "EDDV0031";
        public static String EDDV0032 = "EDDV0032";
        public static String EDDV0033 = "EDDV0033";
        public static String EDDV0034 = "EDDV0034";
        public static String EDDV0035 = "EDDV0035";
        public static String EDDV0036 = "EDDV0036";
        public static String EDDV0037 = "EDDV0037";
        public static String EDDV0038 = "EDDV0038";
        public static String EDDV0039 = "EDDV0039";
        public static String EDDV0040 = "EDDV0040";
        public static String EDDV0041 = "EDDV0041";
        public static String EDDV0042 = "EDDV0042";
        public static String EDDV0043 = "EDDV0043";
        public static String EDDV0044 = "EDDV0044";
        public static String EDDV0045 = "EDDV0045";
        public static String EDDV0046 = "EDDV0046";
        public static String EDDV0047 = "EDDV0047";
        public static String EDDV0048 = "EDDV0048";
        public static String EDDV0049 = "EDDV0049";
        public static String EDDV0050 = "EDDV0050";
        public static String EDDV052 = "EDDV0052";
        public static String EDDV053 = "EDDV0053";
        public static String EDDV054 = "EDDV0054";
        public static String EDDV0055 = "EDDV0055";
        public static String EDDV0056 = "EDDV0056";
        public static String EDDV0057 = "EDDV0057";
        public static String EDDV0058 = "EDDV0058";
        public static String EDDV0059 = "EDDV0059";
        public static String EDDV0060 = "EDDV0060";
        public static String EDDV0061 = "EDDV0061";
        public static String EDDV0064 = "EDDV0064";
        public static String EDDV0065 = "EDDV0065";
        public static String EDDV0066 = "EDDV0066";
        public static String EDDV0067 = "EDDV0067";
        public static String EDDV0068 = "EDDV0068";
        public static String EDDV0069 = "EDDV0069";
        public static String EDDV0070 = "EDDV0070";
        public static String EDDV0071 = "EDDV0071";
        public static String EDDV0072 = "EDDV0072";
        public static String EDDV0073 = "EDDV0073";
        public static String EDDV0074 = "EDDV0074";
    }

    public static class DataValidationErrorMessages {
        private DataValidationErrorMessages() {

        }

        public static String EDDV0073Message = "Patient Liability cannot be determined as no Level Of Care found for individuals in Case";
        public static String EDDV0074Message = "Patient Liability cannot be determined as no valid Medicaid eligibilty found for Case";
    }

    public static class TOAPriorityNumber {
        private TOAPriorityNumber() {

        }

        public static final int ADULT = 4300;
        public static final int APTC = 6000;
        public static final int CHILDEXPANSION = 3800;
        public static final int CHL1 = 3500;
        public static final int CHL2 = 3600;
        public static final int CHL3 = 3700;
        public static final int CHL4 = 3400;
        public static final int ESI = 1300;
        public static final int FORMERFOSTERCARE = 3210;
        public static final int ADFF = 3250;
        public static final int FFOS = 3280;
        public static final int KCHIP = 4000;
        public static final int NEWBORN = 3300;
        public static final int NONMAGIMEDICAID = 9000;
        public static final int PARENTCARETAKER = 4100;
        public static final int PREGNANCY = 3200;
        public static final int QHP = 1200;
        public static final int CONV = 3900;
        public static final int FFS1 = 4200;
        public static final int FFS2 = 4500;
        public static final int ADBH = 4400;
        public static final int SSIR = 100;
        public static final int ASMA = 200;
        public static final int FCMA = 300;
        public static final int DJJM = 400;
        public static final int EXPT = 700;
        public static final int PTCC = 800;
        public static final int PTDC = 900;
        public static final int PTEW = 1000;
        public static final int ABDM = 1100;
        public static final int MAWR = 1400;
        public static final int LTCM = 1500;
        public static final int SSIP = 1050;
        public static final int QMBP = 6200;
        public static final int SLMB = 6300;
        public static final int QI1P = 6400;
        public static final int QDWI = 6500;
        public static final int SSPP = 500;
        public static final int SSPM = 600;
        public static final int EMCA = 1600;
        public static final int SPDN = 6100;
        public static final int SPNM = 3000;
        public static final int SPMA = 5000;
    }

    public static class BenefitStatus {
        private BenefitStatus() {

        }

        public static final String CERTIFY = "CE";
        public static final String DECREASE = "DE";
        public static final String DENY = "DN";
        public static final String INCREASE = "IN";
        public static final String PENDING = "PE";
        public static final String SUSTAIN = "SU";
        public static final String RENEWALCERTIFY = "RC";
    }

    public static class BenefitStatusCodeList {
        private BenefitStatusCodeList() {

        }

        public static final List<String> StatusCodeList = Collections.unmodifiableList(Arrays.asList("IN", "SU", "CE"));
    }

    public static class MFPStatus {
        private MFPStatus() {

        }

        public static final String INFACILITY = "IF";
        public static final String INHOSPITAL = "IH";
        public static final String INMFP = "IMFP";
    }

    public static class LivingArrangementType {
        private LivingArrangementType() {

        }

        public static final String PERSONALCAREHOME = "PCH";
        public static final String FAMILYCAREHOME = "FCH";
        public static final String COMMUNITYINTEGRATIONSERVICES = "CIS";
        public static final String INCARCERATED = "IC";
        public static final String LTC = "LTC";
        public static final String INHOME = "IH";
        public static final String NURSINGFACILITY = "NF";
        public static final String FOSTERCARE = "FC";
        public static final String CARETAKERSERVICES = "CTS";
        public static final String HOMELESS = "HL";
        public static final String PSYCHIATRICFACILITY = "APF";
        public static final String HOSPITALIZATION = "HS";
        public static final String TREATMENTCENTERS = "DAA";
        public static final String BATTERREDSHELTER = "BW";
        public static final String SOMEONEELSESHOME = "SH";
    }

    public static final List<String> LivingArrangementTypeList = Collections
            .unmodifiableList(Arrays.asList(LivingArrangementType.HOMELESS, LivingArrangementType.TREATMENTCENTERS,
                    LivingArrangementType.BATTERREDSHELTER, LivingArrangementType.SOMEONEELSESHOME));

    public static class SAFENoticeReasonsPriority {
        private SAFENoticeReasonsPriority() {

        }

        public static Map<String, Integer> getSAFENoticeReasons() {

            Map<String, Integer> safeNoticeReasons = new HashMap<>();
            safeNoticeReasons.put("EL1604", 1);
            safeNoticeReasons.put("EL1609", 1);
            safeNoticeReasons.put("EL1602", 1);
            safeNoticeReasons.put("EL1601", 1);
            safeNoticeReasons.put("EL1603", 1);
            safeNoticeReasons.put("EL1608", 1);
            safeNoticeReasons.put("EL1606", 1);
            safeNoticeReasons.put("EL1605", 1);
            safeNoticeReasons.put("EL1610", 1);
            safeNoticeReasons.put("EL1697", 1);
            safeNoticeReasons.put("EL7021", 2);
            safeNoticeReasons.put("EL1611", 1);
            safeNoticeReasons.put(NoticeReasons.EL5014, 2);
            safeNoticeReasons.put(NoticeReasons.EL5015, 2);
            safeNoticeReasons.put("EL5019", 2);
            safeNoticeReasons.put(NoticeReasons.EL7022, 2);
            safeNoticeReasons.put(NoticeReasons.EL7020, 2);
            safeNoticeReasons.put("EL5018", 2);
            safeNoticeReasons.put("EL1504", 3);
            safeNoticeReasons.put("EL1598", 4);
            safeNoticeReasons.put("EL7028", 5);
            safeNoticeReasons.put(NoticeReasons.EL1712, 6);
            safeNoticeReasons.put("EL7029", 7);
            safeNoticeReasons.put(NoticeReasons.EL2015, 8);
            safeNoticeReasons.put("EL7030", 9);
            safeNoticeReasons.put("EL1567", 10);
            safeNoticeReasons.put("EL7031", 11);
            safeNoticeReasons.put(VCLCode.VCLFAILURENOTICEREASON, 13);
            safeNoticeReasons.put("EL7033", 15);
            safeNoticeReasons.put("EL7034", 16);
            safeNoticeReasons.put("EL7000", 12);
            safeNoticeReasons.put(EL7035, 14);
            safeNoticeReasons.put("EL1508", 17);
            safeNoticeReasons.put(EL1509, 17);
            safeNoticeReasons.put("EL1512", 17);
            safeNoticeReasons.put(EL1531, 17);
            safeNoticeReasons.put("EL1533", 17);
            safeNoticeReasons.put("EL1546", 17);
            safeNoticeReasons.put(NoticeReasons.IPVPENDINGFORINDIVIDUAL, 17);
            safeNoticeReasons.put("EL9919", 17);
            safeNoticeReasons.put(NoticeReasons.EL2039, 999);
            return safeNoticeReasons;
        }

    }

    public static class CCAPNoticeReasonsPriority {
        private CCAPNoticeReasonsPriority() {

        }

        public static Map<String, String> getCCAPNoticeReasons() {

            Map<String, String> ccapNoticeReasons = new HashMap<>();

            ccapNoticeReasons.put(RELATIONSHIPEXCLUDED, "5");
            ccapNoticeReasons.put(NoticeReasons.EL1571, "10");
            ccapNoticeReasons.put("EL1574", "5");
            ccapNoticeReasons.put("EL1619", "1");
            ccapNoticeReasons.put("EL1901", "1");
            ccapNoticeReasons.put("EL1902", "1");
            ccapNoticeReasons.put("EL1904", "1");
            ccapNoticeReasons.put("EL1905", "5");
            ccapNoticeReasons.put("EL1909", "1");
            ccapNoticeReasons.put(NoticeReasons.EL1914, "1");
            ccapNoticeReasons.put("EL1915", "2");
            ccapNoticeReasons.put("EL1916", "1");
            ccapNoticeReasons.put("EL1919", "1");
            ccapNoticeReasons.put("EL1920", "10");
            ccapNoticeReasons.put(NoticeReasons.EL1921, "1");
            ccapNoticeReasons.put(NoticeReasons.EL1924, "1");
            ccapNoticeReasons.put(NOTREQUESTING, "1");
            ccapNoticeReasons.put("EL1931", "1");
            ccapNoticeReasons.put("EL1934", "2");
            ccapNoticeReasons.put("EL1935", "1");
            ccapNoticeReasons.put("EL1939", "1");
            ccapNoticeReasons.put("EL1940", "2");
            ccapNoticeReasons.put("EL1941", "1");
            ccapNoticeReasons.put("EL1942", "1");
            ccapNoticeReasons.put("EL1943", "1");
            ccapNoticeReasons.put("EL1944", "1");
            ccapNoticeReasons.put("EL1950", "1");
            ccapNoticeReasons.put(NoticeReasons.EL1951, "1");
            ccapNoticeReasons.put(NoticeReasons.EL1952, "1");
            ccapNoticeReasons.put("EL1953", "1");
            ccapNoticeReasons.put("EL1954", "1");
            ccapNoticeReasons.put("EL1955", "1");
            ccapNoticeReasons.put("EL1960", "1");
            ccapNoticeReasons.put("EL1961", "1");
            ccapNoticeReasons.put(NoticeReasons.EL2001, "1");
            ccapNoticeReasons.put(NoticeReasons.EL2005, "1");
            ccapNoticeReasons.put(NoticeReasons.EL2015, "1");
            ccapNoticeReasons.put(NoticeReasons.EL2039, "1");
            ccapNoticeReasons.put(NoticeReasons.EL5009, "1");
            ccapNoticeReasons.put("EL1506", "10");
            ccapNoticeReasons.put("EL1507", "1");
            ccapNoticeReasons.put(EL1509, "1");
            ccapNoticeReasons.put(EL1531, "1");
            ccapNoticeReasons.put("EL1540", "10");
            ccapNoticeReasons.put("EL1552", "1");
            ccapNoticeReasons.put("EL1594", "1");
            ccapNoticeReasons.put("EL1928", "1");
            ccapNoticeReasons.put("EL1018", "1");
            ccapNoticeReasons.put("EL1546", "10");
            ccapNoticeReasons.put("EL1945", "10");
            ccapNoticeReasons.put("EL1946", "1");
            ccapNoticeReasons.put("EL1949", "1");
            ccapNoticeReasons.put("EL1956", "1");
            ccapNoticeReasons.put("EL1957", "1");
            ccapNoticeReasons.put("EL5011", "1");
            ccapNoticeReasons.put("EL5012", "1");
            ccapNoticeReasons.put("EL5013", "1");
            ccapNoticeReasons.put(NoticeReasons.EL5014, "1");
            ccapNoticeReasons.put(NoticeReasons.EL5015, "1");
            ccapNoticeReasons.put(NoticeReasons.EL5017, "1");
            ccapNoticeReasons.put(NoticeReasons.EL7018, "1");
            ccapNoticeReasons.put(NoticeReasons.EL7020, "1");

            return ccapNoticeReasons;
        }

    }

    public static class LABasedLTCType {
        private LABasedLTCType() {

        }

        public static final String FACILITY = "F";
        public static final String WAIVER = "W";
    }

    public static class IncarcerationStatusTypeCode {
        private IncarcerationStatusTypeCode() {

        }

        public static final String CONVICTED = "CV";
        public static final String PENDING = "PD";
    }

    public static class InHomeCareType {
        private InHomeCareType() {

        }

        public static final String HOSPICE = "H";
        public static final String MFP = "MFP";
        public static final String WAIVER = "W";
        public static final String NOTAPPLICABLE = "NA";
    }

    public enum CurrentEligibilityIndicators {
        P, S, K, V, H, M, X, U
    }

    public static class MinMaxKeys {
        private MinMaxKeys() {

        }

        public static final String R5STARTDATE = "R5IMPLEMENTATIONDATE";
        public static final String R4STARTDATE = "MAGIMEDICAIDSTARTDATE";
        public static final String MAXAUTHSTARTDATE = "MaxAuthorizedPeriodStartDate";
        public static final String RUNDATE = "RUNDATE";
        public static final String CASEDATECHANGEDATE = "CaseDataChangeMinMax";
        public static final String ADVERSEACTIONDATE = "ADVERSEACTIONDATE";
        public static final String ADVERSEACTIONDATESNAP = "ADVERSEACTIONDATESNAP";
        public static final String ADVERSEACTIONDATEKTAP = "ADVERSEACTIONDATEKTAP";
        public static final String ADVERSEACTIONDATECCAP = "ADVERSEACTIONDATECCAP";
        public static final String ADVERSEACTIONDATEQHP = "ADVERSEACTIONDATEQHP";
        public static final String BMCUTOFFDATE = "BMCUTOFFDATE";
        public static final int MONTHDIFFERENCE = 1;
    }

    public static final String RUNDATE = "EDBCRunDate";
    public static final String REBUILDREASON = "REBUILDREASON";
    public static final String MUPROGRAMSTORUN = "MUProgramsToRun";
    public static final String MUTRIGGERDETAIL = "MUTriggerDetail";
    public static final String EDBCPROCESSID = "ProcessId";
    public static String TRANSACTIONID = "TransactionId";

    public static String getEdgRerunFlag() {
        return "EDGRERUNFLAG";
    }

    public static String getRequestCaseRunMode() {
        return "CASE_RUN_MODE";
    }

    public static String getCaseNum() {
        return "CASE_NUM";
    }

    public static String getEdbcActionDate() {
        return "EdbcActionDate";
    }

    public static class SpecialEnrollment {
        private SpecialEnrollment() {

        }

        public static class ReferenceTable {
            private ReferenceTable() {

            }

            public static final String ANNUALOPENENROLLMENT = "AL";
            public static final String OPENENROLLMENTPERIOD = "OPENENROLLPERIOD";
            public static final String STARTDATE = "START_DATE";
            public static final String ENDDATE = "END_DATE";
            public static final String EDBCAPTCQHPSTARTDATE = "EDBC_APTCQHP_RENEWAL_START_DT";
        }

    }

    public static class SpecialTriggerCodes {
        private SpecialTriggerCodes() {

        }

        public static List<String> CodeList = Collections.unmodifiableList(Arrays.asList(MassUpdateTriggerCode.RN001,
                MassUpdateTriggerCode.RN002, MassUpdateTriggerCode.RN022, MassUpdateTriggerCode.RN003,
                MassUpdateTriggerCode.RN004, MassUpdateTriggerCode.RN005, "CV001", MassUpdateTriggerCode.WM001, "IN020",
                MassUpdateTriggerCode.AL078, MassUpdateTriggerCode.AL077, MassUpdateTriggerCode.AL006,
                MassUpdateTriggerCode.AL007, MassUpdateTriggerCode.AL102, MassUpdateTriggerCode.AL103,
                MassUpdateTriggerCode.AL104, MassUpdateTriggerCode.AL105, MassUpdateTriggerCode.AL106));
    }

    public static class SNAPSpecialTriggerCode {
        private SNAPSpecialTriggerCode() {

        }

        public static final String RN014 = "RN014";
        public static final String RN027 = "RN027";
    }

    public static class SNAPSpecialTriggerCodes {
        private SNAPSpecialTriggerCodes() {

        }

        public static List<String> SNAPCodeList = Collections
                .unmodifiableList(Arrays.asList(SNAPSpecialTriggerCode.RN014, MassUpdateTriggerCode.AL077,
                        MassUpdateTriggerCode.AL078, SNAPSpecialTriggerCode.RN027));
    }

    public static class MedicaidSpecialTriggerCodes {
        private MedicaidSpecialTriggerCodes() {

        }

        public static List<String> medicaidCodeList = Collections
                .unmodifiableList(Arrays.asList("IN025", MassUpdateTriggerCode.AL066, MassUpdateTriggerCode.AL048,
                        MassUpdateTriggerCode.AL006, MassUpdateTriggerCode.AL007, MassUpdateTriggerCode.AL077,
                        MassUpdateTriggerCode.AL078, MassUpdateTriggerCode.AL102));
    }

    public enum BatchTriggerCodes {
        IN001
    }

    public enum EnumVCLCode {
        V004, V544, V548, V549
    }

    public static String MU0001 = "MU0001 : Case Number, TriggerCode, ScheduledRunDate, IndividualId and MassUpdateBeginDate are mandatory parameters.";
    public static String MU0002 = "MU0002 : Invalid ScheduledRunDate";
    public static String MU0003 = "MU0003 : Invalid MassUpdateEdgBeginDate";
    public static String MU0004 = "MU0004 : Error occured while inserting triggers into MassChangeTrigger.";
    public static String MU0005 = "MU0005 : Null input passed";
    public static String MU0006 = "MU0006 : Error occured while fetching Case from DataCollection.";
    public static String MU0007 = "MU0007 : This casenumber is not present in the database.";
    public static String MU0008 = "MU0008 : Error occured while checking if this trigger is present in the database.";
    public static String MU0009 = "MU0009 : This trigger is already present in the database.";
    public static String MU00010 = "MU00010 : Trigger successfully inserted into the database.";
    public static String MU00011 = "MU00011 : This trigger is already present in the database for this individual.";
    public static String MU00012 = "MU00012 : Trigger successfully updated into the database.";
    public static String MASSUPDATEDEFAULTCONNECTION = "MassUpdateConnection";
    public static String MASSUPDATECREATEUSER = "MASS UPDATE";
    public static String BLANKSTRING = "";
    public static String APOSTROPHE = "'";
    public static String COLONSTRING = ":";

    public static class RenewalDenialErrorCode {
        private RenewalDenialErrorCode() {

        }

        public static final String RENEWALDENIALSUCCESSFUL = "EDRD001";
        public static final String NOCASERECERTRECORDS = "EDRD002";
        public static final String DUPLICATECASERECERTRECORDS = "EDRD003";
        public static final String NOELIGIBILITYRECORDS = "EDRD004";
        public static final String NODCINDVRECORDS = "EDRD005";
        public static final String CONDITIONNOTMETFORDENIAL = "EDRD006";
        public static final String DUPLICATECASERECERTRECORDLATESTSELECTED = "EDRD007";
        public static final String RFIEXISTS = "EDRD008";
        public static final String PENDINGELIGIBILITYRECORDWITHRNI = "EDRD009";
        public static final String NOELIGIBILITYPENDINGRECORDS = "EDRD010";
        public static final String QMBPRECERTUPDATED = "EDRD011";
        public static final String NOPASSTHROUGHRECORDS = "EDRD012";
        public static final String NOSSIBENEFITRECORDS = "EDRD013";
        public static final String NOEDGNUMBERALLOTMENTRECORDS = "EDRD014";
    }

    public static class MassUpdateTriggerCode {
        private MassUpdateTriggerCode() {

        }

        public static final String IN001 = "IN001";
        public static final String CV002 = "CV002";
        public static final String CV003 = "CV003";
        public static final String RN001 = "RN001";
        public static final String EN001 = "EN001";
        public static final String RN002 = "RN002";
        public static final String RN022 = "RN022";
        public static final String RN003 = "RN003";
        public static final String RN004 = "RN004";
        public static final String RN005 = "RN005";
        public static final String RN010 = "RN010";
        public static final String RN011 = "RN011";
        public static final String RN014 = "RN014";
        public static final String RN015 = "RN015";
        public static final String RN016 = "RN016";
        public static final String RN017 = "RN017";
        public static final String RN018 = "RN018";
        public static final String RN021 = "RN021";
        public static final String RN023 = "RN023";
        public static final String RN024 = "RN024";
        public static final String RN025 = "RN025";
        public static final String RN028 = "RN028";
        public static final String RN027 = "RN027";
        public static final String AL011 = "AL011";
        public static final String AL001 = "AL001";
        public static final String AL002 = "AL002";
        public static final String AL003 = "AL003";
        public static final String AL004 = "AL004";
        public static final String AL005 = "AL005";
        public static final String AL006 = "AL006";
        public static final String AL007 = "AL007";
        public static final String AL008 = "AL008";
        public static final String AL009 = "AL009";
        public static final String AL010 = "AL010";
        public static final String AL020 = "AL020";
        public static final String AL021 = "AL021";
        public static final String AL022 = "AL022";
        public static final String AL023 = "AL023";
        public static final String AL024 = "AL024";
        public static final String AL025 = "AL025";
        public static final String AL026 = "AL026";
        public static final String AL027 = "AL027";
        public static final String AL028 = "AL028";
        public static final String AL029 = "AL029";
        public static final String AL030 = "AL030";
        public static final String AL031 = "AL031";
        public static final String AL032 = "AL032";
        public static final String AL033 = "AL033";
        public static final String AL034 = "AL034";
        public static final String AL035 = "AL035";
        public static final String AL036 = "AL036";
        public static final String AL037 = "AL037";
        public static final String AL038 = "AL038";
        public static final String AL039 = "AL039";
        public static final String AL040 = "AL040";
        public static final String AL041 = "AL041";
        public static final String AL042 = "AL042";
        public static final String AL043 = "AL043";
        public static final String AL044 = "AL044";
        public static final String AL045 = "AL045";
        public static final String AL046 = "AL046";
        public static final String AL047 = "AL047";
        public static final String AL048 = "AL048";
        public static final String AL049 = "AL049";
        public static final String AL050 = "AL050";
        public static final String AL051 = "AL051";
        public static final String AL052 = "AL052";
        public static final String AL053 = "AL053";
        public static final String AL054 = "AL054";
        public static final String AL055 = "AL055";
        public static final String AL056 = "AL056";
        public static final String AL057 = "AL057";
        public static final String AL058 = "AL058";
        public static final String AL059 = "AL059";
        public static final String AL060 = "AL060";
        public static final String AL061 = "AL061";
        public static final String AL062 = "AL062";
        public static final String AL063 = "AL063";
        public static final String AL064 = "AL064";
        public static final String AL065 = "AL065";
        public static final String AL066 = "AL066";
        public static final String AL067 = "AL067";
        public static final String AL068 = "AL068";
        public static final String AL069 = "AL069";
        public static final String AL070 = "AL070";
        public static final String AL076 = "AL076";
        public static final String AL077 = "AL077";
        public static final String AL078 = "AL078";
        public static final String AL097 = "AL097";
        public static final String WM001 = "WM001";
        public static final String WM002 = "WM002";
        public static final String WM007 = "WM007";
        public static final String AL102 = "AL102";
        public static final String AL103 = "AL103";
        public static final String AL104 = "AL104";
        public static final String AL105 = "AL105";
        public static final String AL106 = "AL106";
        public static final String AL101 = "AL101";
        public static final String AL117 = "AL117";
    }

    public static List<String> RFIDenailTriggerCodes = Collections.unmodifiableList(
            Arrays.asList(MassUpdateTriggerCode.AL102, MassUpdateTriggerCode.AL103, MassUpdateTriggerCode.AL104,
                    MassUpdateTriggerCode.AL105, MassUpdateTriggerCode.AL106, MassUpdateTriggerCode.AL078,
                    MassUpdateTriggerCode.AL077, MassUpdateTriggerCode.AL007, MassUpdateTriggerCode.AL006));

    public static class StatusIndicator {
        private StatusIndicator() {

        }

        public static final String REQUESTED = "REQUESTED";
    }

    public static class InsuranceSource {
        private InsuranceSource() {

        }

        public static final String PMB = "INDIVIDUAL_LOWEST_COST_SILVER_PLAN";
        public static final String SELFATTESTED = "INSURANCE_EMPLOYER_HEALTH_COVERAGE";
        public static final String ESIPOTENTIALCOVERAGE = "ESI_POTENTIAL_COVERAGE";
    }

    public static class DispositionStatusIndicator {
        private DispositionStatusIndicator() {

        }

        public static final String NOCHANGE = "NOCHANGE";
        public static final String INSERT = "INSERT";
        public static final String UPDATE = "UPDATE";
        public static final String DELETE = "DELETE";
        public static final String UPDATECOR = "UPDATECOR";
    }

    public static class WorkRegistrationStatusCode {
        private WorkRegistrationStatusCode() {

        }

        public static final String PENDING = "P";
        public static final String REGISTER = "R";
        public static final String DECLINE = "D";
    }

    public static class DeprivationType {
        private DeprivationType() {

        }

        public static final String FORCEDSEPERATION = "18";
        public static final String LEGALLYSEPERATED = "14";
        public static final String DEPORTED = "23";
        public static final String MARRIAGEANNULLED = "15";
        public static final String DEATH = "40";
        public static final String SINGLEPARENTADOPTION = "24";
        public static final String DIVORCE = "11";
        public static final String PENALINSTITUTION = "22";
        public static final String BIRTHOUTOFWEDLOCK = "13";
        public static final String HOSPITALIZATION_120 = "21";
        public static final String DESERTATION = "12";
        public static final String BIRTHOUTOFWEDLOCKPATERNITYESTABLISHED = "25";
    }

    public static class QCDays {
        private QCDays() {

        }

        public static final String QUALITYREVIEWDAYSFROM30SEP = "125";
    }

    public static class DeprivationCode {
        private DeprivationCode() {

        }

        public static final String INCAPACITATED = "IN";
        public static final String QUALIFIEDPARENT = "QP";
        public static final String MARRIAGEANNULMENT = "MA";
        public static final String NOTOBLIGATEDTOSUPPORT = "OB";
        public static final String DEATH = "DC";
        public static final String HOSPITALIZATION = "HO";
        public static final String DESERTION = "DS";
        public static final String DIVORCE = "DV";
        public static final String INCARCERATION = "PE";
        public static final String JOINTCUSTODY = "JC";
        public static final String FORCEDSEPARATION = "FS";
        public static final String BIRTHOUTOFWEDLOCK = "BW";
        public static final String SINGLEPARENTADOPTION = "SP";
        public static final String LEGALSEPARATION = "LS";
        public static final String DEPORTATION = "DP";
    }

    public static class ComplianceType {
        private ComplianceType() {

        }

        public static final String PROTECTIONPERMANENCE = "PPC";
        public static final String CHILDSUPPORT = "DCSE";
        public static final String WORKREGISTRATION = "FRWREG";
        public static final String KWP = "COPKWP";
        public static final String FULLFAMILYSANCTION = "FFS";
        public static final String FULLFAMILYSANCTIONTRIM = "FF";
        public static final String QUALITYCONTROL = "CWDQC";
        public static final String CHILDSUPPORTDEBT = "CSDP";
        public static final String DRUGFELONY = "DRUGFE";
        public static final String NOTWILLINGTOACCEPTEMPLOYMENT = "NWEMP";
        public static final String TRANSFEROFRESOURCE = "TROFRES";
        public static final String UIBDISQUALIFICATION = "UIBNC";
        public static final String UIBPENALTY = "UIBPEN";
    }

    public static class ComplianceTypeList {
        private ComplianceTypeList() {

        }

        public static final List<String> ComplianceNonContinuousTableTypes = Collections.unmodifiableList(Arrays.asList(
                ComplianceType.QUALITYCONTROL, "CSDP", DisqualificationTypeCode.VOLUNTARYQUIT, "VRWH",
                ConvictionCode.DRUGFELON, "PV", "FE", ComplianceType.UIBPENALTY, ComplianceType.UIBDISQUALIFICATION));
        public static final List<String> IPVDetailTableTypes = Collections
                .unmodifiableList(Arrays.asList("APPFRA", "DRUGTRA", "FDBFTS", "TRA", "TRAADMIN"));
        public static final List<String> UIBComplianceTypes = Collections
                .unmodifiableList(Arrays.asList(ComplianceType.UIBDISQUALIFICATION, ComplianceType.UIBPENALTY));
        public static final List<String> ComplianceNonContinuousTableTypesWithoutVQ = Collections
                .unmodifiableList(Arrays.asList(ComplianceType.QUALITYCONTROL, "CSDP", ConvictionCode.DRUGFELON, "PV",
                        "FE", ComplianceType.UIBPENALTY, ComplianceType.UIBDISQUALIFICATION));
        public static final List<String> KwpDcseTableTypes = Collections
                .unmodifiableList(Arrays.asList(ComplianceType.KWP, "DCSE"));
    }

    public static class TransferredResourceData {
        private TransferredResourceData() {

        }

        public static final String APPLICATION = "IN";
        public static final String ADDAMEMBER = "AD";
        public static final String CHANGEORRECERT = "RC";
    }

    public static class DisqualificationStatus {
        private DisqualificationStatus() {

        }

        public static final String VALID = "VA";
        public static final String INVALID = "INV";
    }

    public static final int TRANSFERREDRESOURCELOOKBACKPERIOD = -90;
    public static final String QUALITYCONTROLDATE = "2016-09-30";

    public static class SanctionedMonth {
        private SanctionedMonth() {

        }

        public static final String SANCTIONED = "SA";
        public static final String EXEMPTED = "EX";
    }

    public static class LIHEAPFuelType {
        private LIHEAPFuelType() {

        }

        public static final String COAL = "CL";
        public static final String NATURALGAS = "NG";
        public static final String ELECTRIC = "EL";
        public static final String PROPANE = "PR";
        public static final String WOOD = "WD";
        public static final String FUELOIL = "FO";
    }

    public static class HubResponseInterfaces {
        private HubResponseInterfaces() {

        }

        public static final String SSACOMPOSITE = "SSA COMPOSITE";
        public static final String VLP = "VLP";
        public static final String AHI = "Annual Income Verification";
        public static final String VCI = "Current Income Verification";
        public static final String ESIMEC = "ESIMEC";
        public static final String NONESIMEC = "NON ESIMEC";
    }

    public static class HubResponseStatuses {
        private HubResponseStatuses() {

        }

        public static final String PENDING = "PEND";
        public static final String SUCCESS = "SUCCESS";
        public static final String FAILED = "FAIL";
        public static final String VERIFIED = "VERIFIED";
        public static final String INVALID = "INVALID";
        public static final String TECHNICALFAILURE = "TE";
    }

    public static class IdentityStatuses {
        private IdentityStatuses() {

        }

        public static final String CASEINTERVIEWEE = "CI";
        public static final String REPRESENTATIVE = "RP";
        public static final String HEADOFHOUSEHOLD = "HOH";
    }

    public static class ChildCareStatuses {
        private ChildCareStatuses() {

        }

        public static final String PARENTSCARINGDISABLED = "PD";
        public static final String CARINGCHILD = "CH";
        public static final String CAREINCAPACITATED = "CI";
        public static final String PROVIDINGCARE = "PC";
    }

    public static class HubVerificationStatus {
        private HubVerificationStatus() {

        }

        public static final String FAILED = "FAILED";
        public static final String INVALID = "IV";
    }

    public static class MassUpdateRequestSource {
        private MassUpdateRequestSource() {

        }

        public static final String CONVERSION = "CONV";
        public static final String MASSUPDATE = "MU";
    }

    public static class EventType {
        private EventType() {

        }

        public static final String PRORATA = "KTAP_PRORATA_SANC";
        public static final String TWOMONTHEXCLUSION = "KTAP_2MTH_EXCLUSION";
        public static final String FAD = "FAD_BENEFIT";
        public static final String UEXEMPTION = "KTAP_U_EXEMPTION";
        public static final String JOBSEARCH = "JOB_SEARCH";
        public static final String JOBSEARCHPEND = "JOB_SEARCH_PEND";
        public static final String EDUCATIONGRACE = "POST_EDUCATION_LIMIT";
    }

    public static class AppSettings {
        private AppSettings() {

        }

    }

    public static class OutOfStateBenefitProgramCode {
        private OutOfStateBenefitProgramCode() {

        }

        public static final String TANF = "TN";
        public static final String MEDICAID = "MA";
        public static final String SNAP = "SN";
        public static final String SAFE = "SA";
    }

    public static class AbsentParentType {
        private AbsentParentType() {

        }

        public static final String DIVORCE = "11";
        public static final String DESERTION = "12";
        public static final String LEGALSEPARATION = "14";
        public static final String MARRIAGEANNULMENT = "15";
        public static final String BIRTHOUTOFWEDLOCKPATERNITYESTABLISHED = "25";
        public static final String BIRTHOUTOFWEDLOCKPATERNITYNOTESTABLISHED = "13";
    }

    public static class AbsentParentTypeCode {
        private AbsentParentTypeCode() {

        }

        public static final String DIVORCE = "DV";
        public static final String DESERTION = "DS";
        public static final String LEGALSEPARATION = "LS";
        public static final String MARRIAGEANNULMENT = "MA";
        public static final String BIRTHOUTOFWEDLOCKPATERNITYESTABLISHED = "BP";
    }

    public static class KTAPFADSelection {
        private KTAPFADSelection() {

        }

        public static final String KTAP = "K";
        public static final String FAD = "F";
        public static final String BOTH = "B";
    }

    public static class RenewalDiscontinuanceMassUpdateResponse {
        private RenewalDiscontinuanceMassUpdateResponse() {

        }

        public static final String SUCCESSRESPONSEWITHRECORDSPROCESSED = "Renewal Discontinuance Batch Ran successfully and records were processed for ";
        public static final String PTSUCCESSRESPONSEWITHRECORDSPROCESSED = "Pass Through Discontinuance Batch Ran successfully and records were processed for ";
        public static final String SUCCESSRESPONSEWITHOUTRECORDSPROCESSED = "Renewal Discontinuance Batch Ran successfully and no records were processed for ";
        public static final String PTSUCCESSRESPONSEWITHOUTRECORDSPROCESSED = "Pass Through Discontinuance Batch Ran successfully and no records were processed for ";
        public static final String FAILURERESPONSE = "Renewal Discontinuance Batch failed with exception ";
        public static final String PTFAILURERESPONSE = "Pass Through Discontinuance Batch failed with exception ";
    }

    public static class RenewalDiscontinuanceNoticeReasons {
        private RenewalDiscontinuanceNoticeReasons() {

        }

        public static final String FAILURETORETURNRENEWALFORM = "EL2039";
        public static final String VERIFICATIONNOTPROVIDEDWITHINDUEDATE = "EL6090";
        public static final String FAILURETOENROLL = "EL1929";
        public static final String FAILURETORETURNRENEWALFORMFORMIDYEARREVIEW = "EL2060";
        public static final String HEALTHCHOICEDECOMMISSIONED = "EL2061";
        public static final String PASSTHROUGHPERIODENDED = "EL2062";
        public static final String PNPBENEFITSDISCONTINUEDAFTERCERTIFICATIONENDDATE = "EL2071";
        public static final String CCSSDISCONTINUEDDUETOKTAPTERMINATION = "EL2072";
        public static String CCAPPOSTGRACEPERIOD = NoticeReasons.EL2073;
    }

    public static class AlienSubType {
        private AlienSubType() {

        }

        public static String REFUGEESETTLEMENTPROGRAM = "REFUGEESETTLEMENTPROGRAM";

        public static Map<String, String> getCCAPNoticeReasons() {
            Map<String, String> AlienType = new HashMap<>();
            AlienType.put("ACD", "ACTIVEARMEDFORCES");
            AlienType.put("AIB", "AMERICANINDIANBORNINCANADA");
            AlienType.put("AMI", "AMERASIANIMMIGRANT");
            AlienType.put("AS", "ASYLEE");
            AlienType.put("ASI", "AFGHANISPECIALIMMIGRANT");
            AlienType.put("BS", VerificationSubType.BATTEREDALIEN);
            AlienType.put("CE", "CONDITIONALENTRY");
            AlienType.put("CH", "CUBANHAITIANENTRANT");
            AlienType.put("CSA", "CURRENTSPOUSEARMEDFORCES");
            AlienType.put("CSV", "CURRENTSPOUSEVETERAN");
            AlienType.put("DDF", "DIPLOMATSFAMILIES");
            AlienType.put("DW", "DEPORTATIONWITHHELD");
            AlienType.put("EM", "ENROLLEDINDIANTRIBE");
            AlienType.put("IS", "IRAQISPECIALIMMIGRANT");
            AlienType.put("LAPR", VerificationSubType.LEGALALIENPERMANENT);
            AlienType.put("PA", "PAROLEE");
            AlienType.put("PRCL", "PERMANENTRESIDENTPRUCOL");
            AlienType.put("RE", "REFUGEE");
            AlienType.put("SSI", "SSIDETERMINED");
            AlienType.put("ST", "STUDENTS");
            AlienType.put("UA", "UNDOCUMENTEDALIENS");
            AlienType.put("UCA", "UNMARRIEDCHILDUSAF");
            AlienType.put("UCV", "UNMARRIEDCHILDVETERAN");
            AlienType.put("URW", "WIDOWVETERANREMARRIED");
            AlienType.put("VE", "VETERAN");
            AlienType.put("VIT", "VISITORSTOURISTS");
            AlienType.put("VT", "VICTIMTRAFFICKING");
            return AlienType;
        }
    }

    public static String getRENEWALFLAGYESTEXTFORCORRESPONDENCE() {
        return "RenewalFlag:Y";
    }

    public static String getRENEWALFLAGNOTEXTFORCORRESPONDENCE() {
        return "RenewalFlag:N";
    }

    public static class MedicaidRenewal {
        private MedicaidRenewal() {

        }

        public static final String SP_USPRNMASOFTDELETERFI = "[EligibilityDetermination].[uspRnMaSoftDeleteRFI]";
        public static final String CREATEUSERID = "@CreateUserId";
        public static final String EDBCRUNDATE = "@EdbcRunDate";
        public static final String CASENUMBER = "@caseNumber";
    }

    public static class ExpenseAmountTypeInitals {
        private ExpenseAmountTypeInitals() {

        }

        public static final String ACTUAL = "A";
        public static final String LEGAL = "L";
    }

    public static class CustodyStatus {
        private CustodyStatus() {

        }

        public static final String DENIEDCUSTODY = "DC";
        public static final String REFUSEDTOPURSUE = "NP";
        public static final String OBTAINEDCUSTODY = "O";
        public static final String PURSUINGCUSTODY = "P";
    }

    public static class RFISummaryObject {
        private RFISummaryObject() {

        }

        public static final String EDBCCASEINDIVIDUALRFISUMMARYID = "EDBCCaseIndividualRFISummaryID";
        public static final String CASENUMBER = "Casenumber";
        public static final String EDMDATE = "EDMDate";
        public static final String VCLCATEGORY = "VCLCategory";
        public static final String VCLSUBCATEGORY = "VCLSubCategory";
        public static final String VCLGROUPTYPE = "VCLGroupType";
        public static final String INDIVIDUALID = "IndividualId";
        public static final String VERIFICATIONSOURCE = "VerificationSource";
        public static final String VERIFICATONDATE = "VerificatonDate";
        public static final String ISVALIDDOCUMENT = "IsValidDocument";
        public static final String HUBVERIFICATIONSTATUS = "HubVerificationStatus";
        public static final String PROCESSID = "ProcessId";
        public static final String RFITEXT = "RFIText";
        public static final String VERIFICATIONRECORDLASTUPDATEDON = "VerificationRecordLastUpdatedOn";
        public static final String REFERENCEID = "ReferenceId";
        public static final String ISACTIVE = "IsActive";
        public static final String ISDELETE = "IsDelete";
        public static final String CREATEUSERID = "CreateUserId";
        public static final String CREATEDATE = "CreateDate";
        public static final String UPDATEUSERID = "UpdateUserId";
        public static final String UPDATEDATE = "UpdateDate";
        public static final String ROWVERSIONSTAMP = "RowVersionStamp";
        public static final String ISDCDATAONGOING = "IsDCDataOngoing";
        public static final String ISVALIDDOCUMENTKTAP = "IsValidDocumentKTAP";
        public static final String ISVALIDDOCUMENTSNAP = "IsValidDocumentSNAP";
        public static final String ISVALIDDOCUMENTCCAP = "IsValidDocumentCCAP";
        public static final String ISVALIDDOCUMENTNMAGI = "IsValidDocumentNONMAGI";
        public static final String ISVALIDDOCUMENTSAFE = "IsValidDocumentSAFE";
        public static final String TIER1 = "TIER1";
    }

    public static class RelationShipCode {
        private RelationShipCode() {

        }

        public static final String FIRSTCOUSINONCEREMOVED = "FC";
        public static final String FIRSTCOUSIN = "CO";
        public static final String LIVINGTOGETHERPARTNER = "LT";
        public static final String STEPGRANDMOTHERINCLUDINGGREAT = "SX";
        public static final String STEPGRANDFATHERINCLUDINGGREAT = "SG";
        public static final String STEPGRANDDAUGHTERINCLUDINGGREAT = "SH";
        public static final String UNRELATED = "UR";
        public static final String OTHERRELATIONSHIP = "VR";
        public static final String LIVEINATTENDANT = "LA";
        public static final String LEGALGUARDIAN = "LG";
        public static final String SPOUSE = "SP";
        public static final String UNRELATEDPLACEMENT_COURTORDERED = "FD";
    }

    public static final List<String> IndividualLevelNotices = Collections.unmodifiableList(
            Arrays.asList(NoticeReasons.EL2005, EL7035, "EL1508", EL1509, "EL1512", EL1531, "EL1533"));

    public static class InterfaceMaritalStatus {
        private InterfaceMaritalStatus() {

        }

        public static final String MARRIED = "1";
        public static final String SINGLE = "3";
    }

    public static class ExpenseExclusionReasonType {
        private ExpenseExclusionReasonType() {

        }

        public static final String NOTVERIFIED = "NOT_VERIFIED";
    }

    public static class NCPGoodCauseReasonCode {
        private NCPGoodCauseReasonCode() {

        }

        public static final String INAPPLICABLE_CLAIM_WITHDRAWN = "0";
        public static final String PHYSICAL_HARM_TO_CHILD = "1";
        public static final String EMOTIONAL_HARM_TO_CHILD = "2";
        public static final String PHYSICAL_HARM_TO_SR = "3";
        public static final String EMOTIONAL_HARM_TO_SR = "4";
        public static final String RAPE = "5";
        public static final String ADOPTION_IN_PROCESS = "6";
        public static final String BEING_ASSISTED_IN_DECISION_ON_ADOPTION = "7";
        public static final String NO_GOOD_CAUSE = "8";
        public static final String INAPPLICABLE_NO_CLAIM_FILED = "9";
        public static final String INCEST = "A";
    }

    public static class KWPGoodCause {
        private KWPGoodCause() {

        }

        public static final String INCAPACITY = "IN";
        public static final String DOMESTICVIOLENCE = "DV";
        public static final String HIGHRISKPREGNANCY = "HP";
        public static final String INCARCERATION = "IC";
        public static final String CARINGFORDISABLED = "IIC";
        public static final String CARINGFORCHILD = "KCC";
        public static final String DEFAULT = "XX";
    }

    public static class KWPExemptionReason {
        private KWPExemptionReason() {

        }

        public static final String CHILDCARE = "U";
    }

    public static class IPVStatusCode {
        private IPVStatusCode() {

        }

        public static final String INACTIVE = "IN";
        public static final String ACTIVE = "AC";
        public static final String PENDING = "PE";
    }

    public static class TaxFilingLimits {
        private TaxFilingLimits() {

        }

        public static final String EARNEDINCOMETAXFILINGLIMIT = "ER";
        public static final String UNEARNEDINCOMETAXFILINGLIMIT = "UNR";
        public static final String FILINGLIMIT = "FILING_LIMIT";
    }

    public static final List<String> SSIMedicaidOtherSystem = Collections
            .unmodifiableList(Arrays.asList("AP", "BP", "DP"));

    public static class SuspensionRecordType {
        private SuspensionRecordType() {

        }

        public static final String INCARCERATION = "IN";
        public static final String UNKNOWN_ADDRESS = "UA";
    }

    public static class HouseGuestType {
        private HouseGuestType() {

        }

        public static final String BOARDER = "B";
        public static final String LIVEINATTENDANT = "L";
    }

    public static class TransferVerificationCode {
        private TransferVerificationCode() {

        }

        public static final String NOTVERIFIED = "NV";
    }

    public static class QITVerificationCode {
        private QITVerificationCode() {

        }

        public static final String NOTVERIFIED = "NV";
    }

    public static class MAProgramCode {
        private MAProgramCode() {

        }

        public static final List<String> MAProgramCODEVALUE = Collections.unmodifiableList(Arrays.asList("MA", "SS"));
    }

    public static class DeprivationTypeCode {
        private DeprivationTypeCode() {

        }

        public static Map<String, String> getDeprivationTypeCodes() {

            Map<String, String> deprivationTypeCodes = new HashMap<>();
            deprivationTypeCodes.put("BP", "Birth Out of Wedlock Paternity Established");
            deprivationTypeCodes.put("DP", "Deportation");
            deprivationTypeCodes.put("PE", "Incarceration");
            deprivationTypeCodes.put("HO", "Hospitalization");
            deprivationTypeCodes.put("DC", "Death");
            deprivationTypeCodes.put("BW", "BirthWedlock");
            deprivationTypeCodes.put("FS", "ForcedSeparation");
            deprivationTypeCodes.put("MA", "Marriageannulment");
            deprivationTypeCodes.put("LS", "LegalSeparation");
            deprivationTypeCodes.put("DV", "Divorce");
            deprivationTypeCodes.put("SP", "SingleParentAdoption");
            deprivationTypeCodes.put("DS", "Desertion");
            return deprivationTypeCodes;
        }

    }

    public static class VoluntaryAbsentParentTypeCode {
        private VoluntaryAbsentParentTypeCode() {

        }

        public static Map<String, String> getVoluntaryDeprivationTypeCode() {
            Map<String, String> voluntaryDeprivationTypeCode = new HashMap<>();
            voluntaryDeprivationTypeCode.put("DV", "Divorce");
            voluntaryDeprivationTypeCode.put("DS", "Desertion");
            voluntaryDeprivationTypeCode.put("LS", "LegalSeparation");
            voluntaryDeprivationTypeCode.put("MA", "MarriageAnnulment");
            voluntaryDeprivationTypeCode.put("BP", "BirthOutofWedlockPaternityEstablished");
            return voluntaryDeprivationTypeCode;
        }

    }

    public static class DisqualificationTypeCode {
        private DisqualificationTypeCode() {

        }

        public static final String ETPREQUIREMENT = "ETPREQ";
        public static final String TRANSFERREDRESOURCE = "TROFRES";
        public static final String WORKREGISTRATION = "FRWREG";
        public static final String CHILDSUPPORTDEBT = "CSDP";
        public static final String QUALITYCONTROL = "CWDQC";
        public static final String REDUCEDWORKHOURS = "VRWH";
        public static final String VOLUNTARYQUIT = "VQRHRS";
    }

    public static class BurialPlotAssigned {
        private BurialPlotAssigned() {

        }

        public static final String SELF = "SEL";
        public static final String OTHER = "OT";
    }

    public static class ExcludedLOCsList {
        private ExcludedLOCsList() {

        }

        public static List<String> excludedLOCTypeList = Collections
                .unmodifiableList(Arrays.asList("IHP", "NIHP", "MHP", EPSDT, PRTFI, PRTFII));
        public static List<String> qitNonCompatibleLOCsList = Collections
                .unmodifiableList(Arrays.asList("SCL", "NIHP", "ICF"));
    }

    public static class MRTReferralStatus {
        private MRTReferralStatus() {

        }

        public static List<String> pendingClientAction = Collections.unmodifiableList(Arrays.asList("NS", "IP"));
        public static List<String> completedClientAction = Collections.unmodifiableList(Arrays.asList("SB", "CP"));
        public static final String COMPLETED = "CP";
        public static final String SUBMITTED = "SB";
    }

    public static class SDXDisabilityCodes {
        private SDXDisabilityCodes() {

        }

        public static List<String> sdxCategoryCode = Collections
                .unmodifiableList(Arrays.asList("DC", "DS", "DI", "BI", "BC", "BS"));
    }

    public static class WithdrawalNoticeReasonCodes {
        private WithdrawalNoticeReasonCodes() {

        }

        public static final String MOVEDOUTOFSTATE = "EL7020";
        public static final String VOLUNTARYWITHDRAWAL = "EL7018";
        public static final String UNABLETOLOCATE = "EL2018";
        public static final String TRANSFERTOSAFE = "EL1547";
        public static final String NONCOOPERATIONOFCLIENTWITHDRAWAL = "EL7022";
    }

    public static class TimelyUntimelySupplement {
        private TimelyUntimelySupplement() {

        }

        public static final String TIMELY = "T";
        public static final String UNTIMELY = "U";
        public static final String DONTCARE = "D";
        public static final int INCOMEEXPENSE = 50;
        public static final int VERIFICATIONDATE = 20;
        public static final int REPORTEDDATE = 20;
        public static final int REPORTEDDATEKTAP = 10;
        public static final int VERIFICATIONDATEKTAP = 10;
    }

    public static class SupplementReasonCode {
        private SupplementReasonCode() {

        }

        public static final String SU1001 = "1001";
        public static final String SU1002 = "1002";
        public static final String SU1003 = "1003";
        public static final String SU1004 = "1004";
        public static final String SU1005 = "1005";
    }

    public static class EDBCDay0Table {
        private EDBCDay0Table() {

        }

        public static final String EDPROGRAMCATEGORY = "EDProgramCategory";
        public static final String EDRFICATALOGUE = "EDRFICatalogue";
        public static final String EDTIMELYUNTIMELYRULE = "EDTimelyUntimelyRule";
    }

    public static class AvsStatusCodes {
        private AvsStatusCodes() {

        }

        public static final String INPROCESS = "InProcess";
        public static final String COMPLETE = "Complete";
        public static final String FAILED = "Failed";
        public static final String INCOMPLETE = "InComplete";
        public static final String GETINPROG = "GetInProg";
    }

    public static class NotApplicableCode {
        private NotApplicableCode() {

        }

        public static final String NOTAPPLICABLE = "NA";
    }

    public static class MagiEarnedIncomeExempt {
        private MagiEarnedIncomeExempt() {

        }

        public static final String FFW = "FFW";
        public static final String CDO = "CP";
        public static final String CI = "CI";
    }

    public static class HashKeyConstantsCoPayCalc {
        private HashKeyConstantsCoPayCalc() {

        }

        public static final String RTEDCCAPCOPAYCHART = "RTEDCCAPCOPAYCHART";
        public static final String ELIGIBILITYTEMPORARYORPROCESSEDCCAPMODELS = "EligibilityTemporaryOrProcessedCCAPModels";
        public static final String ELIGIBILITYTEMPORARYORPROCESSEDCCAPINDIVIDUALMODELS = "EligibilityTemporaryOrProcessedCCAPIndividualModels";
        public static final String ELIGIBILITYTEMPORARYORPROCESSEDCCAPBUDGETMODELS = "EligibilityTemporaryOrProcessedCCAPBudgetModels";
        public static final String ELIGIBILITYTEMPORARYORPROCESSEDCCAPCOPAYMODELS = "EligibilityTemporaryOrProcessedCCAPCoPayModels";
        public static final String ELIGIBILITYAUTHORIZEDMODELS = "EligibilityAuthorizedModels";
        public static final String ELIGIBILITYLASTAUTHORIZEDTERMINATEDMODEL = "EligibilityLastAuthorizedTerminatedModel";
        public static final String DCPPAUTHORIZATIONMODELS = "DCPPAuthorizationModels";
        public static final String DCCAPCOPAYOVERRIDEMODELS = "DCCAPCopayOverrideModels";
    }

    public static class PPActionTypeCode {
        private PPActionTypeCode() {

        }

        public static final String NEW = "NW";
        public static final String CHANGE = "CH";
        public static final String DELETE = "DE";
        public static final String DISPOSED = "DI";
        public static final String INCOMECHANGE = "IC";
    }

    public static class WorkExemptedForWorkReason {
        private WorkExemptedForWorkReason() {

        }

        public static final String ATTENDINGSCHOOL = "AS";
        public static final String REFUGEE = "RF";
        public static final String PARTICIPANTDRUGPROGRAM = "DA";
    }

    public static class RelationshipToClient {
        private RelationshipToClient() {

        }

        public static final String AUTHREP = "Authorized Representative";
        public static final String HOH = "Head of Household";
    }

    public static class CaseInterviewStatus {
        private CaseInterviewStatus() {

        }

        public static final String INPROCESS = "IP";
        public static final String COMPLETED = "CP";
    }

    public static class InterviewActionType {
        private InterviewActionType() {

        }

        public static final String APPLICATION = "AP";
        public static final String RENEWAL = "RE";
    }

    public static class BenefitExtensionFlag {
        private BenefitExtensionFlag() {

        }

        public static final String CURED = "C";
    }

    public static class BenefitExtensionReason {
        private BenefitExtensionReason() {

        }

        public static final String TEMPORARYDISABILITY = "TEMP_DISABILITY";
    }

    public static class EntitledBenefitTypeCode {
        private EntitledBenefitTypeCode() {

        }

        public static final String BLACKLUNG = "BL";
        public static final String IRA = "IR";
        public static final String MEDICAREPARTA = "MA";
        public static final String MEDICAREPARTB = "MB";
        public static final String RAILROADRETIREMENT = "RR";
        public static final String RSDI = "RS";
        public static final String UMWA = "UMWA";
        public static final String UNEMPLOYMENTINSURANCE = "UI";
        public static final String VACOMPENSATION = "VC";
        public static final String VAIMPROVEDPENSION = "VA";
        public static final String VAPENSION = "VP";
        public static final String WORKERCOMPENSATION = "WC";
        public static final String WILSONFISH = "WF";
    }

    public static class PnPStatusCode {
        private PnPStatusCode() {

        }

        public static final String ELIGIBLECHILD = "EC";
        public static final String OUTOFHOUSEHOLD = "OT";
        public static final String DECEASED = "DE";
        public static final String AIDNOTREQUESTED = "NR";
        public static final String FOSTERCARE = "FC";
        public static final String RECEIVINGBENEFITSINANOTHERCASE = "RB";
    }

    public static class ExemptionVerification {
        private ExemptionVerification() {

        }

        public static final String INCOME = "I";
        public static final String EXCLUSION = "E";
    }

    public static class ApplicationRequestStatus {
        private ApplicationRequestStatus() {

        }

        public static final String REINSTATE = "RI";
        public static final String REACTIVATE = "RA";
        public static final String ADDREAPPLY = "ARA";
    }

    public static final String ISTOCREATEPREG = "IsToCreatePREG";

    public static class CountyTypes {
        private CountyTypes() {

        }

        public static final String ABAWD = "ABAWD";
        public static final String VOLALL = "VOLALL";
        public static final String VOLLIM = "VOLLIM";
    }

    public static List<String> HBEHToaList = Collections.unmodifiableList(Arrays.asList("ADLT", "PACA", "TMAE", "TMAS",
            "FFCC", "PREG", "ADPR", "CHL1", "CHL2", "CHL3", "CHL4", "CHIP", "CHEX", "TP45", "ADFF", "FFOS"));

    public static class EnrollmentTypeCode {
        private EnrollmentTypeCode() {

        }

        public static final String FULLTIME = "FT";
    }

    public static class SuspensionStatus {
        private SuspensionStatus() {

        }

        public static final String SUSPENSION = "SUSP";
    }

    public static final String ABAWDCODEWORKFARE = "EM";

    public static class PenaltyType {
        private PenaltyType() {

        }

        public static final String VOLUNTARYWITHDRAWAL = "VW";
    }

    public static class HBEHCEApprovalReasons {
        private HBEHCEApprovalReasons() {

        }

        public static final String BACKDATEDAPPLICATION = "BDA";
        public static final String FAILEDTORECERTIFY = "FTR";
        public static final String FASTTRACKPAYMENT = "FTP";
        public static final String INCARCERATED = "IC";
        public static final String MEDICALLYFRAIL = "MF";
        public static final String RCT = "RCT";
        public static final String PRESUMPTIVE = "PE";
        public static final String PERIODICREVIEW = "PR";
        public static final String RETROMONTH = "RM";
    }

    public static List<String> PendNotices = Collections.unmodifiableList(Arrays.asList(NoticeReasons.EL1731, "EL1750",
            NoticeReasons.RNICODE, "EL1757", NoticeReasons.EL1764, "EL1766", NoticeReasons.EL1776, "EL1778", "EL1781",
            "EL1782", "EL1783", "EL1799", NoticeReasons.EL2059));

    public static class TaskClousure {
        private TaskClousure() {

        }

        public static final String CS = "CS";
        public static final String TASKTYPE = "PEC";
        public static final String TASKTYPESAFE = "PECSAFE";
        public static final String SOURCE = "EDBC";
        public static final String STATUSCODE = "CP";
    }

    public static class LOCGapModel {

        private LocalDateTime GapStartDate;

        public LocalDateTime getGapStartDate() {
            return GapStartDate;
        }

        public void setGapStartDate(LocalDateTime value) {
            GapStartDate = value;
        }

        private LocalDateTime GapEndDate;

        public LocalDateTime getGapEndDate() {
            return GapEndDate;
        }

        public void setGapEndDate(LocalDateTime value) {
            GapEndDate = value;
        }

        private boolean IsWaiverReinstateApplicable;

        public boolean getIsWaiverReinstateApplicable() {
            return IsWaiverReinstateApplicable;
        }

        public void setIsWaiverReinstateApplicable(boolean value) {
            IsWaiverReinstateApplicable = value;
        }

    }

    public static class DuplicateBenefitsLog {
        private DuplicateBenefitsLog() {

        }

        public static final String DUPLICATEINMCI = "MCI";
        public static final String DUPLICATEINCROSSCASE = "CrossCase";
        public static final String DUPLICATEINSAMECASE = "SameCase";
    }

    public static class VerificationDueDateReason {
        private VerificationDueDateReason() {

        }

        public static final String ESNPEVALUATED = "ESNP Evaluated";
    }

    public static class VerificationListApplicableForEligibleIndividuals {
        private VerificationListApplicableForEligibleIndividuals() {

        }

        public static final List<String> VerificationCategoryForKC = Collections
                .unmodifiableList(Arrays.asList(VerificationType.TEMPORARILYLEAVE, VerificationType.DECEASED));
        public static final List<String> VerificationCategoryForKTAP = Collections.unmodifiableList(Arrays.asList(
                VerificationType.TEMPORARILYLEAVE, VerificationType.LOSSOFEMPLOYMENT, VerificationType.KTAPEXTENSION,
                VerificationType.WORKREGISTRATION, VerificationType.NONCOMPLIANCEKWP, VerificationType.KWPPARTICIPATION,
                VerificationType.DECEASED, VerificationType.PREGNANCY, VerificationType.JOBEND,
                VerificationType.INCARCERATION, VerificationType.DOMESTICVIOLENCE));
        public static final List<String> VerificationCategoryForSNAP = Collections.unmodifiableList(Arrays.asList(
                VerificationType.TEMPORARILYLEAVE, VerificationType.LOSSOFEMPLOYMENT, VerificationType.SSN,
                VerificationType.DECEASED, VerificationType.JOBEND, VerificationType.DRUGFELONY));
        public static final List<String> VerificationCategoryForMedicaid = Collections
                .unmodifiableList(Arrays.asList(VerificationType.TEMPORARILYLEAVE, VerificationType.LOSSOFEMPLOYMENT,
                        VerificationType.DECEASED, VerificationType.JOBEND));
        public static final List<String> VerificationCategoryForCCAP = Collections
                .unmodifiableList(Arrays.asList(VerificationType.TEMPORARILYLEAVE, VerificationType.DECEASED));
    }

    public static class WithdrawalReasonCodes {
        private WithdrawalReasonCodes() {

        }

        public static final String CLIENTREQUEST = "CR";
        public static final String MOVEDOUTOFSTATE = "MO";
        public static final String INCORRECTAPPROVAL = "IAP";
        public static final String MOVEDTOANOTHERHH = "MABH";
        public static final String NONCOOPERATION = "NCO";
    }

    public static class DeductionExpenseTypeCode {
        private DeductionExpenseTypeCode() {

        }

        public static Map<String, String> getDeducationExpenseVCLCode() {
            Map<String, String> deducationExpenseVCLCode = new HashMap<>();
            deducationExpenseVCLCode.put("SE", "V814");
            deducationExpenseVCLCode.put("SH", "V815");
            deducationExpenseVCLCode.put("AL", "V816");
            deducationExpenseVCLCode.put("SLI", "V817");
            deducationExpenseVCLCode.put("AIAN", "V818");
            deducationExpenseVCLCode.put("BE", "V819");
            deducationExpenseVCLCode.put("HAS", "V820");
            deducationExpenseVCLCode.put("ME", "V821");
            deducationExpenseVCLCode.put("SET", "V822");
            deducationExpenseVCLCode.put("SSP", "V823");
            deducationExpenseVCLCode.put("SQP", "V824");
            deducationExpenseVCLCode.put("SHI", "V825");
            deducationExpenseVCLCode.put("EWS", "V826");
            deducationExpenseVCLCode.put("IRA", "V827");
            deducationExpenseVCLCode.put("DPA", "V828");
            return deducationExpenseVCLCode;
        }

    }

    public static class MAGIReasonableCompatibilitySource {
        private MAGIReasonableCompatibilitySource() {

        }

        public static final String SWICA = "SWICA";
        public static final String AHI = "AHI";
        public static final String VCI = "VCI";
    }

    public static class HouseholdCategoryCode {
        private HouseholdCategoryCode() {

        }

        public static final String TWOPARENT = "TP";
        public static final String PAYEE = "PY";
    }

    public static class DeceasedVerificationSource {
        private DeceasedVerificationSource() {

        }

        public static final String SVES = "SV";
        public static final String KVETS = "MI";
    }

    public static final List<String> VclCodeforRFIDueDate = Collections.unmodifiableList(new ArrayList<>());

    public static Map<String, Integer> getKWPGoodCauseHierarchy() {
        return new HashMap<>();
    }

    public static class KWPGoodCauseHierarchy {
        private KWPGoodCauseHierarchy() {

        }

        public static Map<String, Integer> getKWPGoodCauseHierarchy() {
            Map<String, Integer> KWPGoodCauseHierarchy = new HashMap<>();
            KWPGoodCauseHierarchy.put("DV", 1);
            KWPGoodCauseHierarchy.put("IN", 2);
            KWPGoodCauseHierarchy.put("IIC", 3);
            KWPGoodCauseHierarchy.put("HP", 4);
            KWPGoodCauseHierarchy.put("KCC", 5);
            KWPGoodCauseHierarchy.put("IC", 6);
            KWPGoodCauseHierarchy.put("XX", 7);
            return KWPGoodCauseHierarchy;
        }
    }

    public static class COVID19 {
        private COVID19() {

        }

        public static final LocalDateTime MARFIDueDate = LocalDateTime.of(2020, 06, 30, 0, 0);
        public static final LocalDateTime AllProgramsRFIDueDate = LocalDateTime.of(2020, 06, 10, 0, 0);
    }

    public static class PaymentStatusCode {
        private PaymentStatusCode() {

        }

        public static final String T01 = "T01";
    }

    public static class CaptureModes {
        private CaptureModes() {

        }

        public static final String NONE = "N";
        public static final String VCLONLY = "V";
        public static final String ALL = "A";
        private static final List<String> ValidCaptureModes = Collections.unmodifiableList(new ArrayList<>());

        public static boolean isValidCaptureMode(String currentMode) {
            boolean isValidMode;
            isValidMode = ValidCaptureModes.contains(currentMode);
            return isValidMode;
        }

    }

    public static class VerificationStatus {
        private VerificationStatus() {

        }

        public static final String VERIFIED = "VF";
        public static final String NOTVERIFIED = "NV";
    }

    public static class BusinessTypeCode {
        private BusinessTypeCode() {

        }

        public static final String FARMING = "SF";
    }

    public static class DisqualificationExemptionReason {
        private DisqualificationExemptionReason() {

        }

        public static final String NONCOMPLIANCERECORDDELETED = "NCRD";
        public static final String NONCOMPLIANCERECORDENDDATED = "NCRE";
    }

    public static class IncarcerationVerification {
        private IncarcerationVerification() {

        }

        public static final String APPRISSVERIFIED = "VA";
    }

    public static class EIPComments {
        private EIPComments() {

        }

        public static final String CREATE = "System Entry: Disqualification/Penalty created on %s";
        public static final String UPDATE = "System Entry: Disqualification/Penalty updated on %s - %s";
        public static final String INVALIDATED = "System Entry: Disqualification/Penalty invalidated on %s - %s";
    }

    public static class DisqualTypesToReadFromPenaltyList {
        private DisqualTypesToReadFromPenaltyList() {

        }

        public static final List<String> DisqualifcationTypes = Collections
                .unmodifiableList(Arrays.asList("VRWH", DisqualificationTypeCode.VOLUNTARYQUIT,
                        ConvictionCode.DRUGFELON, ComplianceType.UIBDISQUALIFICATION, ComplianceType.UIBPENALTY));
        public static final List<String> DisqualifcationTypesForSAFE = Collections
                .unmodifiableList(Arrays.asList(ConvictionCode.DRUGFELON));
    }

    public static class PayloadModelMappings {
        private PayloadModelMappings() {

        }

        public static Map<String, String> getPayloadToModelToaCodes() {

            Map<String, String> payloadToModelToaCodes = new HashMap<>();
            payloadToModelToaCodes.put("N01", "PACA");
            payloadToModelToaCodes.put("N03", "ADPR");
            payloadToModelToaCodes.put("N05", "ADLT");
            payloadToModelToaCodes.put("N10", "TP45");
            payloadToModelToaCodes.put("N33", "CHIP");
            payloadToModelToaCodes.put("N31_1", "CHL1");
            payloadToModelToaCodes.put("N31_6", "CHL2");
            payloadToModelToaCodes.put("N31_19", "CHL4");
            payloadToModelToaCodes.put("N23", "PREG");
            payloadToModelToaCodes.put("N21", "EMC3");
            payloadToModelToaCodes.put("N25", "EMC4");
            payloadToModelToaCodes.put("N42", "NMME");

            payloadToModelToaCodes.put("N43", "FFCC");

            return payloadToModelToaCodes;
        }

        public static Map<String, String> getTaxFilingStatusCodes() {
            Map<String, String> TaxFilingStatusCodes = new HashMap<>();
            TaxFilingStatusCodes.put("DDI", "DSH");
            TaxFilingStatusCodes.put("DDO", "DSO");
            return TaxFilingStatusCodes;
        }

        public static Map<String, String> getFacilityCodes() {
            Map<String, String> FacilityCodes = new HashMap<>();
            FacilityCodes.put("IM", "IMD");
            FacilityCodes.put("HC", "IHP");
            FacilityCodes.put("MR", "MHP");
            FacilityCodes.put("NF", "NF");
            return FacilityCodes;
        }

        public static Map<String, String> getOtherCoveragCodes() {
            Map<String, String> OtherCoveragCodes = new HashMap<>();
            OtherCoveragCodes.put("OTH", "OT");
            OtherCoveragCodes.put("TRI", "TR");
            OtherCoveragCodes.put("VET", "VA");
            OtherCoveragCodes.put("PEC", "PC");
            OtherCoveragCodes.put("MED", "MD");
            return OtherCoveragCodes;
        }

        public static Map<String, String> getRelationshipCodes() {

            Map<String, String> RelationshipCodes = new HashMap<>();
            RelationshipCodes.put("PA_M", "FA");
            RelationshipCodes.put("CH_F", "DA");
            RelationshipCodes.put("CH_M", "SO");
            RelationshipCodes.put("SB_F", "SI");
            RelationshipCodes.put("SB_M", "BR");
            RelationshipCodes.put("SS_F", "WI");
            RelationshipCodes.put("SS_M", "HU");
            RelationshipCodes.put("SP_F", "SM");
            RelationshipCodes.put("SP_M", "SF");
            RelationshipCodes.put("SC_F", "SD");
            RelationshipCodes.put("SC_M", "SS");
            RelationshipCodes.put("AU_F", "AU");
            RelationshipCodes.put("AU_M", "UN");
            RelationshipCodes.put("NE_F", "NI");
            RelationshipCodes.put("NE_M", "NE");
            RelationshipCodes.put("CO_M", "CO");
            RelationshipCodes.put("CO_F", "CO");
            RelationshipCodes.put("GP_F", "GM");
            RelationshipCodes.put("GP_M", "GF");
            RelationshipCodes.put("GC_F", "GD");
            RelationshipCodes.put("LG_F", "LG");
            RelationshipCodes.put("LG_M", "LG");
            RelationshipCodes.put("DP_F", "LT");
            RelationshipCodes.put("DP_M", "LT");
            RelationshipCodes.put("OT_F", "VR");
            RelationshipCodes.put("OT_M", "VR");
            RelationshipCodes.put("UN_F", "UR");
            RelationshipCodes.put("UN_M", "UR");
            RelationshipCodes.put("GC_M", "GS");
            RelationshipCodes.put("PA_F", "MO");
            return RelationshipCodes;
        }

        public static Map<String, String> getCaseModeCodes() {
            Map<String, String> CaseModeCodes = new HashMap<>();
            CaseModeCodes.put("APPL", "IN");
            CaseModeCodes.put("CRPT", "CN");
            CaseModeCodes.put("ONRN", "RN");
            CaseModeCodes.put("BTRN", "RN");
            return CaseModeCodes;
        }

        public static Map<String, String> getFrequencyCodes() {
            Map<String, String> FrequencyCodes = new HashMap<>();
            FrequencyCodes.put("AN", "YR");
            FrequencyCodes.put("BW", "BW");
            FrequencyCodes.put("MO", "MO");
            FrequencyCodes.put("OT", "ON");
            FrequencyCodes.put("QT", "QU");
            FrequencyCodes.put("WK", "WE");
            return FrequencyCodes;
        }

        public static Map<String, String> getSelfEmploymentIncomeType() {
            Map<String, String> SelfEmploymentIncomeType = new HashMap<>();
            SelfEmploymentIncomeType.put("FAR", "SF");
            SelfEmploymentIncomeType.put("RNI", "RE");
            return SelfEmploymentIncomeType;
        }

        public static Map<String, String> getCategoryOfIncome() {

            Map<String, String> CategoryOfIncome = new HashMap<>();

            CategoryOfIncome.put("EAI", "EA");
            CategoryOfIncome.put("SEI", "EA");
            CategoryOfIncome.put("RNI", "EA");
            CategoryOfIncome.put("ALI", "UN");
            CategoryOfIncome.put("SSA", "UN");
            CategoryOfIncome.put("CAP", "UN");
            CategoryOfIncome.put("DIV", "UN");
            CategoryOfIncome.put("DVI", "UN");
            CategoryOfIncome.put("IRA", "UN");
            CategoryOfIncome.put("MBI", "UN");
            CategoryOfIncome.put("OTH", "UN");
            CategoryOfIncome.put("ANN", "UN");
            CategoryOfIncome.put("RRI", "UN");
            CategoryOfIncome.put("SSI", "UN");
            CategoryOfIncome.put("TRU", "UN");
            CategoryOfIncome.put("UNI", "UN");
            CategoryOfIncome.put("FPC", "UN");
            CategoryOfIncome.put("INT", "UN");
            CategoryOfIncome.put("FAR", "SE");
            CategoryOfIncome.put("FTI", "UN");
            CategoryOfIncome.put("FEI", "EA");
            CategoryOfIncome.put("ROY", "UN");
            CategoryOfIncome.put("IMA", "UN");
            CategoryOfIncome.put("TRB", "UN");
            return CategoryOfIncome;
        }

    }

    public static class ModelPayloadMappings {
        private ModelPayloadMappings() {

        }

        public static Map<String, String> getModelToPayloadTOACodes() {

            Map<String, String> TOACodes = new HashMap<>();
            TOACodes.put("PACA", "N01");
            TOACodes.put("ADPR", "N03");
            TOACodes.put("ADLT", "N05");
            TOACodes.put("TP45", "N10");
            TOACodes.put("CHIP", "N33");
            TOACodes.put("CHEX", "N33");
            TOACodes.put("CHL1", "N31");
            TOACodes.put("CHL2", "N31");
            TOACodes.put("CHL3", "N31");
            TOACodes.put("CHL4", "N31");
            TOACodes.put("PREG", "N23");
            TOACodes.put("EMC3", "N21");
            TOACodes.put("EMC4", "N25");
            TOACodes.put("EMC1", "N25");
            TOACodes.put("EMC2", "N25");
            TOACodes.put("NMME", "N42");
            TOACodes.put("FFCC", "N43");

            return TOACodes;
        }

        public static Map<String, String> getMAGIStatusCodes() {
            Map<String, String> MAGIStatusCodes = new HashMap<>();
            MAGIStatusCodes.put("AP", "A");
            MAGIStatusCodes.put("TN", "C");
            MAGIStatusCodes.put("DN", "D");
            MAGIStatusCodes.put("PE", "P");
            return MAGIStatusCodes;
        }

    }

    public static final DateTimeFormatter localFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static final List<String> Priority1Changes = Collections
            .unmodifiableList(Arrays.asList("BH", "AF", "PA", "DE"));
    public static final List<String> Priority2Changes = Collections.unmodifiableList(Arrays.asList("MA", "LC", "DI"));
    public static final List<String> Priority3Changes = Collections
            .unmodifiableList(Arrays.asList("IN", "AO", "OT", "OS", "NL", "IC", "RO"));

    public static final String EFFV_END_DT_FILTER = "effectiveEndDateFilter";

    public static class IncomeCategory {
        private IncomeCategory() {
        }

        public static final String EAVALUE = "EA";
        public static final String UNVALUE = "UN";
        public static final String SEVALUE = "SE";

    }

    public static class ColumnNames {
        private ColumnNames() {

        }

        public static final String REFERENCECODE = "REFERENCECODE";
        public static final String REFERENCECODEDESCRIPTION = "REFERENCECODEDESCRIPTION";
        public static final String DATEID = "DATEID";
        public static final String ISFORMINEDM = "ISFORMINEDM";
        public static final String ISFORMAXEDM = "ISFORMAXEDM";
        public static final String PROGRAMMODE = "PROGRAMMODE";
        public static final String RUNMONTHCODE = "RUNMONTHCODE";
        public static final String RENEWALDAYS = "RENEWALDAYS";
        public static final String WAIVEINDICATOR = "WAIVEINDICATOR";
        public static final String EVALUATIONDATEPERIODCODE = "EVALUATIONDATEPERIODCODE";
        public static final String PROGRAMCODE = "PROGRAMCODE";
        public static final String RULENAME = "RULENAME";
        public static final String PROGRAMSTATUS = "PROGRAMSTATUS";
        public static final String ACTIONCODE = "ACTIONCODE";
        public static final String REFCODE = "REFCODE";
        public static final String ISACTIVERULE = "ISACTIVERULE";
        public static final String MINIMUMEDM_SEQUENCE = "MINIMUMEDM_SEQUENCE";
        public static final String MAXIMUMEDM_SEQUENCE = "MAXIMUMEDM_SEQUENCE";
        public static final String CONDITION = "CONDITION";
        public static final String FINALDATE = "FINALDATE";
        public static final String DATEID1 = "DATEID1";
        public static final String DATEID2 = "DATEID2";
        public static final String ISMAXCALC = "ISMAXCALC";
        public static final String ISMINCALC = "ISMINCALC";
        public static final String RULEEXPRESSION = "RULEEXPRESSION";
        public static final String NEGACTIONDATEMCO = "NEGACTIONDATEMCO";
        public static final String FPL_100 = "100FPL";
        public static final String FPL_109 = "109FPL";
        public static final String FPL_120 = "120FPL";
        public static final String FPL_133 = "133FPL";
        public static final String FPL_135 = "135FPL";
        public static final String FPL_138 = "138FPL";
        public static final String FPL_142 = "142FPL";
        public static final String FPL_147 = "147FPL";
        public static final String FPL_150 = "150FPL";
        public static final String FPL_159 = "159FPL";
        public static final String FPL_185 = "185FPL";
        public static final String FPL_195 = "195FPL";
        public static final String FPL_200 = "200FPL";
        public static final String FPL_213 = "213FPL";
        public static final String FPL_218 = "218FPL";
        public static final String FPL_250 = "250FPL";
        public static final String FPL_300 = "300FPL";
        public static final String FPL_400 = "400FPL";
        public static final String FPL_420 = "420FPL";
        public static final String CONSIDERFORPASTEVALUATION = "CONSIDERFORPASTEVALUATION";
        public static final String PRIORITY = "PRIORITY";
        public static final String PROGRAM = "PROGRAM";
        public static final String MODE = "MODE";
        public static final String BENEFITSTATUS = "BENEFITSTATUS";
        public static final String BEGINDATE = "BEGINDATE";
        public static final String ENDDATE = "ENDDATE";
        public static final String YEARTYPE = "YEARTYPE";
        public static final String SUPPORTEDBENEFIT = "SUPPORTEDBENEFIT";
    }

    public static class MinMaxConstants {
        private MinMaxConstants() {

        }

        public static final String BATCH = "BATCH";
        public static final String NA = "NA";
        public static final String RAC = "RAC";
        public static final String RI = "RI";
        public static final String AAI = "AAI";
        public static final String PE = "PE";
        public static final String AP = "AP";
        public static final String DC = "DC";
    }

    public static class EligibilityDates {
        private EligibilityDates() {

        }

        public static final String RUNYEAR = "RUNYEAR";
        public static final String NEXTYEAR = "NEXTYEAR";
    }
}