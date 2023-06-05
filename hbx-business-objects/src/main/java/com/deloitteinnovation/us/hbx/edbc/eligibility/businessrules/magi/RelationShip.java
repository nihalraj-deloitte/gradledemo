package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.deloitteinnovation.us.hbx.framework.logging.HBELogger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RelationShip {
    private HBELogger LOGGER = new HBELogger(this.getClass());

    @XmlElement(name = "HasFillsParentalRole")
    private Boolean hasFillsParentalRoleField;

    @XmlElement(name = "IndividualId")
    private Long individualIdField;

    @XmlElement(name = "IsCaretaker")
    private Boolean isCaretakerField;

    @XmlElement(name = "IsJointTaxFiler")
    private Boolean isJointTaxFilerField;

    @XmlElement(name = "IsOwnsChildResponsibility")
    private Boolean isOwnsChildResponsibilityField;

    @XmlElement(name = "IsTaxDependent")
    private Boolean isTaxDependentField;

    @XmlElement(name = "RefIndividualId")
    private Long refIndividualIdField;

    @XmlElement(name = "RelationshipCode")
    private String relationshipCodeField;

    private String idField;

    private String hrefField;

    /**
     *
     */
    public Boolean getHasFillsParentalRole() {
        return hasFillsParentalRoleField;
    }

    public void setHasFillsParentalRole(Boolean value) {
        hasFillsParentalRoleField = value;
    }

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
    public Boolean getIsCaretaker() {
        return isCaretakerField;
    }

    public void setIsCaretaker(Boolean value) {
        isCaretakerField = value;
    }

    /**
     *
     */
    public Boolean getIsJointTaxFiler() {
        return isJointTaxFilerField;
    }

    public void setIsJointTaxFiler(Boolean value) {
        isJointTaxFilerField = value;
    }

    /**
     *
     */
    public Boolean getIsOwnsChildResponsibility() {
        return isOwnsChildResponsibilityField;
    }

    public void setIsOwnsChildResponsibility(Boolean value) {
        isOwnsChildResponsibilityField = value;
    }

    /**
     *
     */
    public Boolean getIsTaxDependent() {
        return isTaxDependentField;
    }

    public void setIsTaxDependent(Boolean value) {
        isTaxDependentField = value;
    }

    /**
     *
     */
    public Long getRefIndividualId() {
        return refIndividualIdField;
    }

    public void setRefIndividualId(Long value) {
        refIndividualIdField = value;
    }

    /**
     *
     */
    public String getRelationshipCode() {
        return relationshipCodeField;
    }

    public void setRelationshipCode(String value) {
        relationshipCodeField = value;
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

    public RelationShip() {

    }

    public RelationShip(Long actualIndivId, Long relationShipWithIndivId, String relationShipType) {
        try {
            setIndividualId(actualIndivId);
            setRefIndividualId(relationShipWithIndivId);
            setRelationshipCode(relationShipType);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

}