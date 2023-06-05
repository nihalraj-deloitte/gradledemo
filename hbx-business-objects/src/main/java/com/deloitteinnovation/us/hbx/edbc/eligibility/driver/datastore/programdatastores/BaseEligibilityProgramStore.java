//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:44:43 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.programdatastores;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore.EligibilityDataStore;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BaseEligibilityProgramStore {
    private Supplier<EligibilityDataStore> GetAuthorizedEligibility;

    public Supplier<EligibilityDataStore> getGetAuthorizedEligibility() {
        return GetAuthorizedEligibility;
    }

    public void setGetAuthorizedEligibility(Supplier<EligibilityDataStore> value) {
        GetAuthorizedEligibility = value;
    }

    private Supplier<EligibilityDataStore> GetTemporaryOrProcessedEligibility;

    public Supplier<EligibilityDataStore> getGetTemporaryOrProcessedEligibility() {
        return GetTemporaryOrProcessedEligibility;
    }

    public void setGetTemporaryOrProcessedEligibility(Supplier<EligibilityDataStore> value) {
        GetTemporaryOrProcessedEligibility = value;
    }

    private Supplier<EligibilityDataStore> GetProcessedEligiblity;

    public Supplier<EligibilityDataStore> getGetProcessedEligiblity() {
        return GetProcessedEligiblity;
    }

    public void setGetProcessedEligiblity(Supplier<EligibilityDataStore> value) {
        GetProcessedEligiblity = value;
    }

    private Consumer<EligibilityDataStore> SetEligibility;

    public Consumer<EligibilityDataStore> getSetEligibility() {
        return SetEligibility;
    }

    public void setSetEligibility(Consumer<EligibilityDataStore> value) {
        SetEligibility = value;
    }

    /* string=PgmCode, int=EdgTraceId, int=CertificationPeriod */
    private List<Triplet<String, Integer, Integer>> ProgramCertificationPeriod = new ArrayList<>();

    public List<Triplet<String, Integer, Integer>> getProgramCertificationPeriod() {
        return ProgramCertificationPeriod;
    }

    public void setProgramCertificationPeriod(List<Triplet<String, Integer, Integer>> value) {
        ProgramCertificationPeriod = value;
    }

}