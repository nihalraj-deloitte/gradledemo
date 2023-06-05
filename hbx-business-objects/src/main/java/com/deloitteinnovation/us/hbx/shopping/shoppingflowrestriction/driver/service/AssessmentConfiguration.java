//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.02 at 05:56:17 PM IST 
//


package com.deloitteinnovation.us.hbx.shopping.shoppingflowrestriction.driver.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="show-silent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="show-invisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="show-properties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="show-events" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="resolve-indecision-relationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}ResponseOutcome" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentConfiguration", propOrder = {
    "showSilent",
    "showInvisible",
    "showProperties",
    "showEvents",
    "resolveIndecisionRelationships",
    "outcome"
})
public class AssessmentConfiguration {

    @XmlElement(name = "show-silent")
    protected Boolean showSilent;
    @XmlElement(name = "show-invisible")
    protected Boolean showInvisible;
    @XmlElement(name = "show-properties")
    protected Boolean showProperties;
    @XmlElement(name = "show-events")
    protected Boolean showEvents;
    @XmlElement(name = "resolve-indecision-relationships")
    protected Boolean resolveIndecisionRelationships;
    protected ResponseOutcome outcome;

    /**
     * Gets the value of the showSilent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSilent() {
        return showSilent;
    }

    /**
     * Sets the value of the showSilent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSilent(Boolean value) {
        this.showSilent = value;
    }

    /**
     * Gets the value of the showInvisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInvisible() {
        return showInvisible;
    }

    /**
     * Sets the value of the showInvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInvisible(Boolean value) {
        this.showInvisible = value;
    }

    /**
     * Gets the value of the showProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowProperties() {
        return showProperties;
    }

    /**
     * Sets the value of the showProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowProperties(Boolean value) {
        this.showProperties = value;
    }

    /**
     * Gets the value of the showEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEvents() {
        return showEvents;
    }

    /**
     * Sets the value of the showEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEvents(Boolean value) {
        this.showEvents = value;
    }

    /**
     * Gets the value of the resolveIndecisionRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResolveIndecisionRelationships() {
        return resolveIndecisionRelationships;
    }

    /**
     * Sets the value of the resolveIndecisionRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResolveIndecisionRelationships(Boolean value) {
        this.resolveIndecisionRelationships = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOutcome }
     *     
     */
    public ResponseOutcome getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOutcome }
     *     
     */
    public void setOutcome(ResponseOutcome value) {
        this.outcome = value;
    }

}
