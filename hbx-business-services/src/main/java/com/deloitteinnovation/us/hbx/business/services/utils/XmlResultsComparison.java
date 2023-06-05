package com.deloitteinnovation.us.hbx.business.services.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class XmlResultsComparison {
    private boolean consistency;
    private ArrayList<String> missingPaths = new ArrayList<String>();
    private HashMap<String, ArrayList<String>> missingOrMismatchingValues = new HashMap<String, ArrayList<String>>();

    public ArrayList<String> getMissingPaths() {
        return missingPaths;
    }

    public void setMissingPaths(ArrayList<String> missingPaths) {
        this.missingPaths = missingPaths;
    }

    public HashMap<String, ArrayList<String>> getMissingOrMismatchingValues() {
        return missingOrMismatchingValues;
    }

    public void setMissingOrMismatchingValues(HashMap<String, ArrayList<String>> missingOrMismatchingValues) {
        this.missingOrMismatchingValues = missingOrMismatchingValues;
    }

    public boolean isConsistency() {
        return consistency;
    }

    public void setConsistency(boolean consistency) {
        this.consistency = consistency;
    }

}
