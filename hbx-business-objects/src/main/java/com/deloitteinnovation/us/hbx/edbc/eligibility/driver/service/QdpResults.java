//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.05 at 07:41:07 PM IST 
//


package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in_boolean_global_isAutoRenewalTrialPeriod" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}booleanAttributeType" minOccurs="0"/>
 *         &lt;element name="in_boolean_global_isCRMode" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}booleanAttributeType" minOccurs="0"/>
 *         &lt;element name="in_boolean_global_isOpenEnrollment" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}booleanAttributeType" minOccurs="0"/>
 *         &lt;element name="in_boolean_global_isSpecialEnrollment" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}booleanAttributeType" minOccurs="0"/>
 *         &lt;element name="in_date_global_requestDate" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}dateAttributeType" minOccurs="0"/>
 *         &lt;element name="in_text_global_applicationId" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}textAttributeType" minOccurs="0"/>
 *         &lt;element name="out_boolean_global_isExchangeAndApplicationEligibilityComplete" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}booleanAttributeType" minOccurs="0"/>
 *         &lt;element name="out_date_global_firstOfNextMonth" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}dateAttributeType" minOccurs="0"/>
 *         &lt;element name="out_date_global_firstOfTheMonth" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}dateAttributeType" minOccurs="0"/>
 *         &lt;element name="out_date_global_firstOfTheMonthAfterTheNextMonth" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}dateAttributeType" minOccurs="0"/>
 *         &lt;element name="out_date_global_referenceDate" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}dateAttributeType" minOccurs="0"/>
 *         &lt;element name="list-entity_individual" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}entity_individualEntityListType" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}ListCustomPropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inBooleanGlobalIsAutoRenewalTrialPeriod",
    "inBooleanGlobalIsCRMode",
    "inBooleanGlobalIsOpenEnrollment",
    "inBooleanGlobalIsSpecialEnrollment",
    "inDateGlobalRequestDate",
    "inTextGlobalApplicationId",
    "outBooleanGlobalIsExchangeAndApplicationEligibilityComplete",
    "outDateGlobalFirstOfNextMonth",
    "outDateGlobalFirstOfTheMonth",
    "outDateGlobalFirstOfTheMonthAfterTheNextMonth",
    "outDateGlobalReferenceDate",
    "listEntityIndividual",
    "properties"
})
@XmlRootElement(name = "qdpResults", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema")
public class QdpResults {

    @XmlElement(name = "in_boolean_global_isAutoRenewalTrialPeriod")
    protected BooleanAttributeType inBooleanGlobalIsAutoRenewalTrialPeriod;
    @XmlElement(name = "in_boolean_global_isCRMode")
    protected BooleanAttributeType inBooleanGlobalIsCRMode;
    @XmlElement(name = "in_boolean_global_isOpenEnrollment")
    protected BooleanAttributeType inBooleanGlobalIsOpenEnrollment;
    @XmlElement(name = "in_boolean_global_isSpecialEnrollment")
    protected BooleanAttributeType inBooleanGlobalIsSpecialEnrollment;
    @XmlElement(name = "in_date_global_requestDate")
    protected DateAttributeType inDateGlobalRequestDate;
    @XmlElement(name = "in_text_global_applicationId")
    protected TextAttributeType inTextGlobalApplicationId;
    @XmlElement(name = "out_boolean_global_isExchangeAndApplicationEligibilityComplete")
    protected BooleanAttributeType outBooleanGlobalIsExchangeAndApplicationEligibilityComplete;
    @XmlElement(name = "out_date_global_firstOfNextMonth")
    protected DateAttributeType outDateGlobalFirstOfNextMonth;
    @XmlElement(name = "out_date_global_firstOfTheMonth")
    protected DateAttributeType outDateGlobalFirstOfTheMonth;
    @XmlElement(name = "out_date_global_firstOfTheMonthAfterTheNextMonth")
    protected DateAttributeType outDateGlobalFirstOfTheMonthAfterTheNextMonth;
    @XmlElement(name = "out_date_global_referenceDate")
    protected DateAttributeType outDateGlobalReferenceDate;
    @XmlElement(name = "list-entity_individual")
    protected EntityIndividualEntityListType listEntityIndividual;
    protected ListCustomPropertiesType properties;

    /**
     * Gets the value of the inBooleanGlobalIsAutoRenewalTrialPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanAttributeType }
     *     
     */
    public BooleanAttributeType getInBooleanGlobalIsAutoRenewalTrialPeriod() {
        return inBooleanGlobalIsAutoRenewalTrialPeriod;
    }

    /**
     * Sets the value of the inBooleanGlobalIsAutoRenewalTrialPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanAttributeType }
     *     
     */
    public void setInBooleanGlobalIsAutoRenewalTrialPeriod(BooleanAttributeType value) {
        this.inBooleanGlobalIsAutoRenewalTrialPeriod = value;
    }

    /**
     * Gets the value of the inBooleanGlobalIsCRMode property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanAttributeType }
     *     
     */
    public BooleanAttributeType getInBooleanGlobalIsCRMode() {
        return inBooleanGlobalIsCRMode;
    }

    /**
     * Sets the value of the inBooleanGlobalIsCRMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanAttributeType }
     *     
     */
    public void setInBooleanGlobalIsCRMode(BooleanAttributeType value) {
        this.inBooleanGlobalIsCRMode = value;
    }

    /**
     * Gets the value of the inBooleanGlobalIsOpenEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanAttributeType }
     *     
     */
    public BooleanAttributeType getInBooleanGlobalIsOpenEnrollment() {
        return inBooleanGlobalIsOpenEnrollment;
    }

    /**
     * Sets the value of the inBooleanGlobalIsOpenEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanAttributeType }
     *     
     */
    public void setInBooleanGlobalIsOpenEnrollment(BooleanAttributeType value) {
        this.inBooleanGlobalIsOpenEnrollment = value;
    }

    /**
     * Gets the value of the inBooleanGlobalIsSpecialEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanAttributeType }
     *     
     */
    public BooleanAttributeType getInBooleanGlobalIsSpecialEnrollment() {
        return inBooleanGlobalIsSpecialEnrollment;
    }

    /**
     * Sets the value of the inBooleanGlobalIsSpecialEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanAttributeType }
     *     
     */
    public void setInBooleanGlobalIsSpecialEnrollment(BooleanAttributeType value) {
        this.inBooleanGlobalIsSpecialEnrollment = value;
    }

    /**
     * Gets the value of the inDateGlobalRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAttributeType }
     *     
     */
    public DateAttributeType getInDateGlobalRequestDate() {
        return inDateGlobalRequestDate;
    }

    /**
     * Sets the value of the inDateGlobalRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAttributeType }
     *     
     */
    public void setInDateGlobalRequestDate(DateAttributeType value) {
        this.inDateGlobalRequestDate = value;
    }

    /**
     * Gets the value of the inTextGlobalApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link TextAttributeType }
     *     
     */
    public TextAttributeType getInTextGlobalApplicationId() {
        return inTextGlobalApplicationId;
    }

    /**
     * Sets the value of the inTextGlobalApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAttributeType }
     *     
     */
    public void setInTextGlobalApplicationId(TextAttributeType value) {
        this.inTextGlobalApplicationId = value;
    }

    /**
     * Gets the value of the outBooleanGlobalIsExchangeAndApplicationEligibilityComplete property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanAttributeType }
     *     
     */
    public BooleanAttributeType getOutBooleanGlobalIsExchangeAndApplicationEligibilityComplete() {
        return outBooleanGlobalIsExchangeAndApplicationEligibilityComplete;
    }

    /**
     * Sets the value of the outBooleanGlobalIsExchangeAndApplicationEligibilityComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanAttributeType }
     *     
     */
    public void setOutBooleanGlobalIsExchangeAndApplicationEligibilityComplete(BooleanAttributeType value) {
        this.outBooleanGlobalIsExchangeAndApplicationEligibilityComplete = value;
    }

    /**
     * Gets the value of the outDateGlobalFirstOfNextMonth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAttributeType }
     *     
     */
    public DateAttributeType getOutDateGlobalFirstOfNextMonth() {
        return outDateGlobalFirstOfNextMonth;
    }

    /**
     * Sets the value of the outDateGlobalFirstOfNextMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAttributeType }
     *     
     */
    public void setOutDateGlobalFirstOfNextMonth(DateAttributeType value) {
        this.outDateGlobalFirstOfNextMonth = value;
    }

    /**
     * Gets the value of the outDateGlobalFirstOfTheMonth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAttributeType }
     *     
     */
    public DateAttributeType getOutDateGlobalFirstOfTheMonth() {
        return outDateGlobalFirstOfTheMonth;
    }

    /**
     * Sets the value of the outDateGlobalFirstOfTheMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAttributeType }
     *     
     */
    public void setOutDateGlobalFirstOfTheMonth(DateAttributeType value) {
        this.outDateGlobalFirstOfTheMonth = value;
    }

    /**
     * Gets the value of the outDateGlobalFirstOfTheMonthAfterTheNextMonth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAttributeType }
     *     
     */
    public DateAttributeType getOutDateGlobalFirstOfTheMonthAfterTheNextMonth() {
        return outDateGlobalFirstOfTheMonthAfterTheNextMonth;
    }

    /**
     * Sets the value of the outDateGlobalFirstOfTheMonthAfterTheNextMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAttributeType }
     *     
     */
    public void setOutDateGlobalFirstOfTheMonthAfterTheNextMonth(DateAttributeType value) {
        this.outDateGlobalFirstOfTheMonthAfterTheNextMonth = value;
    }

    /**
     * Gets the value of the outDateGlobalReferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAttributeType }
     *     
     */
    public DateAttributeType getOutDateGlobalReferenceDate() {
        return outDateGlobalReferenceDate;
    }

    /**
     * Sets the value of the outDateGlobalReferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAttributeType }
     *     
     */
    public void setOutDateGlobalReferenceDate(DateAttributeType value) {
        this.outDateGlobalReferenceDate = value;
    }

    /**
     * Gets the value of the listEntityIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIndividualEntityListType }
     *     
     */
    public EntityIndividualEntityListType getListEntityIndividual() {
        return listEntityIndividual;
    }

    /**
     * Sets the value of the listEntityIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIndividualEntityListType }
     *     
     */
    public void setListEntityIndividual(EntityIndividualEntityListType value) {
        this.listEntityIndividual = value;
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

}
