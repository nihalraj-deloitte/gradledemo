//
// Translated by CS2J (http://www.cs2j.com): 11/16/2020 4:24:42 PM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AuthorizedBenefits {

    @XmlElement(name = "AdverseActionMonth")
    private Individual individualField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public String gethref() {
        return hrefField;
    }

    /**
     *
     */
    public String getid() {
        return idField;
    }

    /**
     *
     */
    public Individual getindividual() {
        return individualField;
    }

    public void sethref(String value) {
        hrefField = value;
    }

    public void setid(String value) {
        idField = value;
    }

    public void setindividual(Individual value) {
        individualField = value;
    }
}