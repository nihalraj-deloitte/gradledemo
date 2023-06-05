//
// Translated by CS2J (http://www.cs2j.com): 12/3/2020 12:53:44 PM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.qhp;

/**
 *
 */
public class Notice {

    public Notice() {

    }

    public Notice(Notice noticeToBeCloned) {
        this.setCode(noticeToBeCloned.getCode());
        this.setedg_group(noticeToBeCloned.getedg_group());
        this.setedg_individual(noticeToBeCloned.getedg_individual());
        this.sethref(noticeToBeCloned.gethref());
        this.setid(noticeToBeCloned.getid());
    }

    private String codeField;
    private Edg_group edg_groupField;
    private Edg_individual edg_individualField;
    private String idField;
    private String hrefField;

    /**
     *
     */
    public String getCode() {
        return codeField;
    }

    public void setCode(String value) {
        codeField = value;
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
    public Edg_individual getedg_individual() {
        return edg_individualField;
    }

    public void setedg_individual(Edg_individual value) {
        edg_individualField = value;
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
