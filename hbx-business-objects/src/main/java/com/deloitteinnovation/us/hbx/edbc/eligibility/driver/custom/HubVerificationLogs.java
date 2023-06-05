//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:49 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import java.util.ArrayList;
import java.util.List;

public class HubVerificationLogs {
    private int Casenumber;

    public int getCasenumber() {
        return Casenumber;
    }

    public void setCasenumber(int value) {
        Casenumber = value;
    }

    private Long individualId;

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long value) {
        individualId = value;
    }

    private int EdgTraceId;

    public int getEdgTraceId() {
        return EdgTraceId;
    }

    public void setEdgTraceId(int value) {
        EdgTraceId = value;
    }

    private List<IncomeSourceLog> IncomeSources = new ArrayList<>();

    public List<IncomeSourceLog> getIncomeSources() {
        return IncomeSources;
    }

    public void setIncomeSources(List<IncomeSourceLog> value) {
        IncomeSources = value;
    }

    private String XmlData = "";

    public String getXmlData() {
        return XmlData;
    }

    public void setXmlData(String value) {
        XmlData = value;
    }

}