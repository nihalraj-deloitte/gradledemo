//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.02 at 05:56:17 PM IST 
//


package com.deloitteinnovation.us.hbx.shopping.shoppingflowrestriction.driver.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for booleanAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="booleanAttributeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}booleanDataType">
 *       &lt;sequence>
 *         &lt;element name="change-point" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}booleanChangePoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}ListCustomPropertiesType" minOccurs="0"/>
 *         &lt;element name="decision-report" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}DecisionReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}AttributeTypeEnum" />
 *       &lt;attribute name="inferred" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="outcome-style" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}OutcomeStyleEnum" />
 *       &lt;attribute name="unknown-outcome-style" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}OutcomeStyleEnum" />
 *       &lt;attribute name="known-outcome-style" type="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}OutcomeStyleEnum" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booleanAttributeType", propOrder = {
    "changePoint",
    "properties",
    "decisionReport"
})
public class BooleanAttributeType
    extends BooleanDataType
{

    @XmlElement(name = "change-point")
    protected List<BooleanChangePoint> changePoint;
    protected ListCustomPropertiesType properties;
    @XmlElement(name = "decision-report")
    protected DecisionReportType decisionReport;
    @XmlAttribute(name = "type")
    protected AttributeTypeEnum type;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;
    @XmlAttribute(name = "outcome-style")
    protected OutcomeStyleEnum outcomeStyle;
    @XmlAttribute(name = "unknown-outcome-style")
    protected OutcomeStyleEnum unknownOutcomeStyle;
    @XmlAttribute(name = "known-outcome-style")
    protected OutcomeStyleEnum knownOutcomeStyle;

    /**
     * Gets the value of the changePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BooleanChangePoint }
     * 
     * 
     */
    public List<BooleanChangePoint> getChangePoint() {
        if (changePoint == null) {
            changePoint = new ArrayList<BooleanChangePoint>();
        }
        return this.changePoint;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeEnum }
     *     
     */
    public AttributeTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeEnum }
     *     
     */
    public void setType(AttributeTypeEnum value) {
        this.type = value;
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
