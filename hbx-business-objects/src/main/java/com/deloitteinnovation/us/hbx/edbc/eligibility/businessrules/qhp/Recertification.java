//
// Translated by CS2J (http://www.cs2j.com): 12/3/2020 12:53:44 PM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp;

import java.time.LocalDateTime;


/**
 *
 */
public class Recertification {

    private Long individualIdField;
    private LocalDateTime recertDueDateField;
    private String reviewStatusCodeField;
    private String typeOfAssistanceField;
    private Case caseField;
    private Edg_group edg_groupField;
    private String idField;
    private String hrefField;

    /**
     *
     */
    public Long getIndividualId() {
        return individualIdField;
    }

    public void setIndividualId(Long value) {
        individualIdField = value;
    }


    /**
     *
     */

    public LocalDateTime getRecertDueDate() {
        return recertDueDateField;
    }

    public void setRecertDueDate(LocalDateTime value) {
        recertDueDateField = value;
    }

    /**
     *
     */
    public String getReviewStatusCode() {
        return reviewStatusCodeField;
    }

    public void setReviewStatusCode(String value) {
        reviewStatusCodeField = value;
    }

    /**
     *
     */
    public String getTypeOfAssistance() {
        return typeOfAssistanceField;
    }

    public void setTypeOfAssistance(String value) {
        typeOfAssistanceField = value;
    }

    /**
     *
     */
    public Case getcase() {
        return caseField;
    }

    public void setcase(Case value) {
        caseField = value;
    }

    /**
     *
     */
    public Edg_group getedg_group() {
        return edg_groupField;
    }

    public void setedg_group(Edg_group value) {
        edg_groupField = value;
    }

    /**
     *
     */
    public String getid() {
        return idField;
    }

    public void setid(String value) {
        idField = value;
    }

    /**
     *
     */
    public String gethref() {
        return hrefField;
    }

    public void sethref(String value) {
        hrefField = value;
    }

}
