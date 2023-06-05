//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.10 at 03:28:34 PM IST 
//


package com.deloitteinnovation.us.hbx.edbc.documentrequest.driver.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entity_verification_typeEntityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity_verification_typeEntityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity_verification_type" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}entity_verification_typeInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}ListCustomPropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inferred" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity_verification_typeEntityListType", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema", propOrder = {
    "entityVerificationType",
    "properties"
})
public class EntityVerificationTypeEntityListType {

    @XmlElement(name = "entity_verification_type")
    protected List<EntityVerificationTypeInstanceType> entityVerificationType;
    protected ListCustomPropertiesType properties;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;

    /**
     * Gets the value of the entityVerificationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityVerificationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityVerificationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityVerificationTypeInstanceType }
     * 
     * 
     */
    public List<EntityVerificationTypeInstanceType> getEntityVerificationType() {
        if (entityVerificationType == null) {
            entityVerificationType = new ArrayList<EntityVerificationTypeInstanceType>();
        }
        return this.entityVerificationType;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ListCustomPropertiesType }
     *     
     */
    public ListCustomPropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCustomPropertiesType }
     *     
     */
    public void setProperties(ListCustomPropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the inferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInferred() {
        return inferred;
    }

    /**
     * Sets the value of the inferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInferred(Boolean value) {
        this.inferred = value;
    }

}
