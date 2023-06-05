package com.deloitteinnovation.us.hbx.edbc.documentrequest.businessrules;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Individual {

    private BigDecimal PersonId;
    private BigDecimal logicalAppId;
    private List<Verification> ListofVerificationTypes = new ArrayList<>();

    public BigDecimal getPersonId() {
        return PersonId;
    }

    public void setPersonId(BigDecimal personId) {
        PersonId = personId;
    }

    public BigDecimal getLogicalAppId() {
        return logicalAppId;
    }

    public void setLogicalAppId(BigDecimal logicalAppId) {
        this.logicalAppId = logicalAppId;
    }

    public List<Verification> getListofVerificationTypes() {
        return ListofVerificationTypes;
    }

    public void setListofVerificationTypes(List<Verification> listofVerificationTypes) {
        ListofVerificationTypes = listofVerificationTypes;
    }

}