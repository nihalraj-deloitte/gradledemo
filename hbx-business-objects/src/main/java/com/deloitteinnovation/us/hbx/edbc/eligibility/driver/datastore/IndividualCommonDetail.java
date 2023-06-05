//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:50 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.datastore;

import java.time.LocalDateTime;

public class IndividualCommonDetail {
    private Long individualId;

    public Long getindividualId() {
        return individualId;
    }

    public void setindividualId(Long value) {
        individualId = value;
    }

    private LocalDateTime spendDownCurrentQuarterBeginDate;

    public LocalDateTime getspendDownCurrentQuarterBeginDate() {
        return spendDownCurrentQuarterBeginDate;
    }

    public void setspendDownCurrentQuarterBeginDate(LocalDateTime value) {
        spendDownCurrentQuarterBeginDate = value;
    }

    private boolean isToRunMAGI;

    public boolean getisToRunMAGI() {
        return isToRunMAGI;
    }

    public void setisToRunMAGI(boolean value) {
        isToRunMAGI = value;
    }

    private LocalDateTime lastNMAGIEDM;

    public LocalDateTime getlastNMAGIEDM() {
        return lastNMAGIEDM;
    }

    public void setlastNMAGIEDM(LocalDateTime value) {
        lastNMAGIEDM = value;
    }

    private String PassThroughCategoryCode = "";

    public String getPassThroughCategoryCode() {
        return PassThroughCategoryCode;
    }

    public void setPassThroughCategoryCode(String value) {
        PassThroughCategoryCode = value;
    }

    private boolean isToRunMAGISpendown;

    public boolean getisToRunMAGISpendown() {
        return isToRunMAGISpendown;
    }

    public void setisToRunMAGISpendown(boolean value) {
        isToRunMAGISpendown = value;
    }

    private boolean isSpendDownEligible;

    public boolean getisSpendDownEligible() {
        return isSpendDownEligible;
    }

    public void setisSpendDownEligible(boolean value) {
        isSpendDownEligible = value;
    }

    private boolean isPotentialSSIEligible;

    public boolean getisPotentialSSIEligible() {
        return isPotentialSSIEligible;
    }

    public void setisPotentialSSIEligible(boolean value) {
        isPotentialSSIEligible = value;
    }

    private boolean isPenaltyToBeApplied;

    public boolean getisPenaltyToBeApplied() {
        return isPenaltyToBeApplied;
    }

    public void setisPenaltyToBeApplied(boolean value) {
        isPenaltyToBeApplied = value;
    }

    private LocalDateTime locBeginDate;

    public LocalDateTime getlocBeginDate() {
        return locBeginDate;
    }

    public void setlocBeginDate(LocalDateTime value) {
        locBeginDate = value;
    }

    private String IsIndividualDeceasedForMA = "";

    public String getIsIndividualDeceasedForMA() {
        return IsIndividualDeceasedForMA;
    }

    public void setIsIndividualDeceasedForMA(String value) {
        IsIndividualDeceasedForMA = value;
    }

    private String IsDeceasedRFIDue = "";

    public String getIsDeceasedRFIDue() {
        return IsDeceasedRFIDue;
    }

    public void setIsDeceasedRFIDue(String value) {
        IsDeceasedRFIDue = value;
    }

}
