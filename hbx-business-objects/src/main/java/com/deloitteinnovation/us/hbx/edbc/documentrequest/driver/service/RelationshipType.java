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
 * <p>Java class for RelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}RelationshipTargetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}ListCustomPropertiesType" minOccurs="0"/>
 *         &lt;element name="decision-report" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}DecisionReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="state" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}StateEnum" />
 *       &lt;attribute name="inferred" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="outcome-style" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}OutcomeStyleEnum" />
 *       &lt;attribute name="unknown-outcome-style" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}OutcomeStyleEnum" />
 *       &lt;attribute name="known-outcome-style" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}OutcomeStyleEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipType", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema", propOrder = {
    "target",
    "properties",
    "decisionReport"
})
public class RelationshipType {

    protected List<RelationshipTargetType> target;
    protected ListCustomPropertiesType properties;
    @XmlElement(name = "decision-report")
    protected DecisionReportType decisionReport;
    @XmlAttribute(name = "state")
    protected StateEnum state;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;
    @XmlAttribute(name = "outcome-style")
    protected OutcomeStyleEnum outcomeStyle;
    @XmlAttribute(name = "unknown-outcome-style")
    protected OutcomeStyleEnum unknownOutcomeStyle;
    @XmlAttribute(name = "known-outcome-style")
    protected OutcomeStyleEnum knownOutcomeStyle;

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipTargetType }
     * 
     * 
     */
    public List<RelationshipTargetType> getTarget() {
        if (target == null) {
            target = new ArrayList<RelationshipTargetType>();
        }
        return this.target;
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
     * Gets the value of the decisionReport property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionReportType }
     *     
     */
    public DecisionReportType getDecisionReport() {
        return decisionReport;
    }

    /**
     * Sets the value of the decisionReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionReportType }
     *     
     */
    public void setDecisionReport(DecisionReportType value) {
        this.decisionReport = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateEnum }
     *     
     */
    public void setState(StateEnum value) {
        this.state = value;
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

    /**
     * Gets the value of the outcomeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public OutcomeStyleEnum getOutcomeStyle() {
        return outcomeStyle;
    }

    /**
     * Sets the value of the outcomeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public void setOutcomeStyle(OutcomeStyleEnum value) {
        this.outcomeStyle = value;
    }

    /**
     * Gets the value of the unknownOutcomeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public OutcomeStyleEnum getUnknownOutcomeStyle() {
        return unknownOutcomeStyle;
    }

    /**
     * Sets the value of the unknownOutcomeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public void setUnknownOutcomeStyle(OutcomeStyleEnum value) {
        this.unknownOutcomeStyle = value;
    }

    /**
     * Gets the value of the knownOutcomeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public OutcomeStyleEnum getKnownOutcomeStyle() {
        return knownOutcomeStyle;
    }

    /**
     * Sets the value of the knownOutcomeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public void setKnownOutcomeStyle(OutcomeStyleEnum value) {
        this.knownOutcomeStyle = value;
    }

}
