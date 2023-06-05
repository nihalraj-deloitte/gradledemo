package com.deloitteinnovation.us.hbx.business.services.utils;

import com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.Case;
import com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.EDGGroup;
import com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.EDGIndividual;
import com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi.Notice;
import com.deloitteinnovation.us.hbx.framework.logging.HBELogger;
import org.kie.api.KieServices;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RulesExecutionHelper {

    private static final HBELogger LOGGER = new HBELogger("EDLogger");
    protected static KieServices kieServices;
    protected static List<KieContainer> kContainerList;
    protected StatelessKieSession kSession;
    protected KieCommands kieCommands;
    private Object inputDataObject;
    private String rulesAgendaGroup;
    private String groupId = "com.deloitteinnovation.us.hbx";
    private String version = "LATEST";
    private String artifactId;
    private static List<String> ruleList = new ArrayList<>();
    private String rulegroup;
    private Case caseObject = null;
    private Map<String, Integer> ruleCountByName = new HashMap<>();

    public static KieServices getKieServices() {
        return kieServices;
    }

    public static void setKieServices(KieServices kieServices) {
        RulesExecutionHelper.kieServices = kieServices;
    }

    public static List<KieContainer> getkContainerList() {
        return kContainerList;
    }

    public static void setkContainerList(List<KieContainer> kContainerList) {
        RulesExecutionHelper.kContainerList = kContainerList;
    }

    public RulesExecutionHelper(Object inputDataObject, String artifactId, String rulesAgendaGroup) {
        this.inputDataObject = inputDataObject;
        this.artifactId = artifactId;
        this.rulesAgendaGroup = rulesAgendaGroup;
        if (getKieServices() == null) {
            setKieServices(KieServices.Factory.get());
        }
        if (getkContainerList() == null) {
            setkContainerList(new ArrayList<>());
        }
        KieContainer kContainer = kContainerList.stream()
                .filter(x -> (x.getReleaseId().getGroupId().equalsIgnoreCase(groupId)
                        && x.getReleaseId().getArtifactId().equalsIgnoreCase(artifactId)))
                .findFirst().orElse(null);
        if (kContainer == null) {
            kContainer = kieServices.newKieContainer(kieServices.newReleaseId(groupId, artifactId, version));
            kContainerList.add(kContainer);
        }
        kSession = kContainer.newStatelessKieSession();
    }

    public void insertFactAndFireRules() {

        getInputDataObject();
        kieCommands = kieServices.getCommands();
        DefaultAgendaEventListener beforeMatchFired = new DefaultAgendaEventListener() {
            @Override
            public void beforeMatchFired(org.kie.api.event.rule.BeforeMatchFiredEvent event) {
                super.beforeMatchFired(event);
                logInfoBeforeMatchFired(event);
            }

            private void logInfoBeforeMatchFired(org.kie.api.event.rule.BeforeMatchFiredEvent event) {

                logRuleName(event);
                String ruleName = event.getMatch().getRule().getName();

                if (ruleCountByName.containsKey(ruleName)) {
                    ruleCountByName.put(ruleName, ruleCountByName.get(ruleName) + 1);
                } else {
                    ruleCountByName.put(ruleName, 1);
                }
                logRuleName(event);
                if (caseObject != null) {
                    caseModeNullCheckAndLogCaseMode();
                    logProperties();
                }
            }

        };

        DefaultAgendaEventListener afterMatchFired = new DefaultAgendaEventListener() {
            @Override
            public void afterMatchFired(AfterMatchFiredEvent event) {
                super.afterMatchFired(event);

                if ((ruleList.contains(event.getMatch().getRule().getName())
                        || event.getMatch().getRule().toString().contains("agendaGroup=" + rulegroup))
                        && LOGGER.isDebugEnabled()) {

                    LOGGER.debug(String.format("afterMatchFired: %s", event.getMatch().getRule()));
                }
            }
        };

        List<Command<?>> cmds = addingCaseObjectAndInputDataObject();

        cmds.add(kieCommands.newAgendaGroupSetFocus(rulesAgendaGroup));
        cmds.add(kieCommands.newFireAllRules());

        kSession.addEventListener(beforeMatchFired);
        kSession.addEventListener(afterMatchFired);
        kSession.execute(kieCommands.newBatchExecution(cmds));
        kSession.removeEventListener(beforeMatchFired);
        kSession.removeEventListener(afterMatchFired);
    }

    private void getInputDataObject() {
        if (artifactId.equals("HbxAptcMagiRules")) {
            caseObject = (Case) inputDataObject;
        }
    }

    private void logProperties() {
        if (!caseObject.geteDGGroup().isEmpty()) {

            for (EDGGroup edgGrp : caseObject.geteDGGroup()) {
                if (edgGrp.getIsNew() != null && edgGrp.getIsNew()) {

                    String verificationResult = getVerificationResultCode(edgGrp);
                    String tOA = getTypeOfAssistance(edgGrp);
                    String nonFinResultCD = getNonFinancialEligibilityResultCode(edgGrp);
                    String finResultCd = getFinancialEligibilityResultCode(edgGrp);
                    String countableIncome = "null";
                    countableIncome = edgBudgetAndGroupMAGINullCheck(edgGrp, countableIncome);

                    String familySize = getFamilyBudgetSize(edgGrp);

                    checkisInfoEnabledAndLogEdgAttributes(edgGrp, verificationResult, tOA, nonFinResultCD, finResultCd,
                            countableIncome, familySize);
                    getEdgIndivAttributes(edgGrp);
                }
                checkIsInfoEnabled();

            }

        }
    }

    private void logRuleName(org.kie.api.event.rule.BeforeMatchFiredEvent event) {
        if (LOGGER.isInfoEnabled() && event.getMatch().getRule() != null) {
            LOGGER.debug(String.format("beforeMatchFired: %s", event.getMatch().getRule()));
        }
    }

    private void caseModeNullCheckAndLogCaseMode() {
        if (LOGGER.isInfoEnabled() && caseObject.getCaseMode() != null) {
            LOGGER.debug(String.format("CaseMode: %s", caseObject.getCaseMode()));
        }
    }

    private void getEdgIndivAttributes(EDGGroup edgGrp) {
        if (!edgGrp.geteDGIndividual().isEmpty()) {
            for (EDGIndividual edgIndiv : edgGrp.geteDGIndividual()) {

                String IndivId = edgIndiv.getIndividualId().toString();
                String targetId = getIsTarget(edgIndiv);
                String NonFinResult = edgIndiv.getNonFinancialEligibilityResultCode();
                String IndivNotive = "";
                if (edgIndiv.getnotice().isEmpty() != true) {
                    for (Notice notice : edgIndiv.getnotice()) {
                        IndivNotive = IndivNotive + notice.getCode() + ", ";

                    }
                    if (LOGGER.isInfoEnabled()) {
                        String infoStr = "---- IndvId: " + IndivId + " | IsTarget: " + targetId + " | Non-FinRsltCd: "
                                + NonFinResult + " | IndvNotices: " + IndivNotive;
                        LOGGER.debug(String.format(infoStr));
                    }
                }
            }
        }
    }

    private void checkisInfoEnabledAndLogEdgAttributes(EDGGroup edgGrp, String verificationResult, String tOA,
                                                       String nonFinResultCD, String finResultCd, String countableIncome, String familySize) {
        String createdFor = getCreatedForIndividualId(edgGrp);
        String finElgTest = getIsFinancialEligibilityTestRequired(edgGrp);
        String noticeCode = getNoticeCode(edgGrp);
        if (LOGGER.isInfoEnabled()) {
            String infoStr = "Edg: " + edgGrp.hashCode() + " | CrtdFor: " + createdFor + " | FmlySize: " + familySize
                    + " | CntblInc: " + countableIncome + " | TOA: " + tOA + " | FinTestRequired: " + finElgTest
                    + " | Non-FinRsltCd: " + nonFinResultCD + " | FinRsltCd: " + finResultCd + " | VrfRsltCd"
                    + verificationResult + " | Notices: " + noticeCode;
            LOGGER.debug(String.format(infoStr));
        }
    }

    private String getNoticeCode(EDGGroup edgGrp) {
        String noticeCode = "";
        if (!edgGrp.getnotice().isEmpty()) {
            for (Notice edgNotice : edgGrp.getnotice()) {
                noticeCode = noticeCode + edgNotice.getCode() + ", ";
            }
        }
        return noticeCode;
    }

    private void checkIsInfoEnabled() {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.debug(" ------------------------------------------------  ");
        }
    }

    private String getIsTarget(EDGIndividual edgIndiv) {
        return edgIndiv.getIsTarget() != null ? edgIndiv.getIsTarget().toString() : "null";
    }

    private String getFamilyBudgetSize(EDGGroup edgGrp) {
        return edgGrp.getFamilyBudgetSize() != null ? edgGrp.getFamilyBudgetSize().toString() : "null";
    }

    private String edgBudgetAndGroupMAGINullCheck(EDGGroup edgGrp, String CountableIncome) {
        if (edgGrp.getedgBudget() != null && edgGrp.getedgBudget().getGroupMAGI() != null) {
            CountableIncome = edgGrp.getedgBudget().getGroupMAGI().toString();
        }
        return CountableIncome;
    }

    private String getFinancialEligibilityResultCode(EDGGroup edgGrp) {
        return edgGrp.getFinancialEligibilityResultCode() != null ? edgGrp.getFinancialEligibilityResultCode() : "null";
    }

    private String getNonFinancialEligibilityResultCode(EDGGroup edgGrp) {
        return edgGrp.getNonFinancialEligibilityResultCode() != null ? edgGrp.getNonFinancialEligibilityResultCode()
                : "null";
    }

    private String getTypeOfAssistance(EDGGroup edgGrp) {
        return edgGrp.getTypeOfAssistance() != null ? edgGrp.getTypeOfAssistance() : "null";
    }

    private String getVerificationResultCode(EDGGroup edgGrp) {
        return edgGrp.getVerificationResultCode() != null ? edgGrp.getVerificationResultCode() : "null";
    }

    private String getIsFinancialEligibilityTestRequired(EDGGroup edgGrp) {
        return edgGrp.getIsFinancialEligibilityTestRequired() != null
                ? edgGrp.getIsFinancialEligibilityTestRequired().toString()
                : "null";
    }

    private String getCreatedForIndividualId(EDGGroup edgGrp) {
        return edgGrp.getCreatedForIndividualId() != null ? edgGrp.getCreatedForIndividualId().toString() : "null";
    }

    private List<Command<?>> addingCaseObjectAndInputDataObject() {
        List<Command<?>> cmds = new ArrayList<>();
        if (caseObject != null) {

            cmds.add(kieCommands.newInsert(caseObject));
        } else if (inputDataObject != null) {
            cmds.add(kieCommands.newInsert(inputDataObject));
        }
        return cmds;
    }
}
