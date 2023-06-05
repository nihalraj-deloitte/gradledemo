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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for timeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="time-val" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="uncertain-val" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}UncertainValue"/>
 *         &lt;element name="unknown-val" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}UnknownValue"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeDataType", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema", propOrder = {
    "timeVal",
    "uncertainVal",
    "unknownVal"
})
@XmlSeeAlso({
    TimeChangePoint.class,
    TimeAttributeType.class
})
public class TimeDataType {

    @XmlElement(name = "time-val")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeVal;
    @XmlElement(name = "uncertain-val")
    protected UncertainValue uncertainVal;
    @XmlElement(name = "unknown-val")
    protected UnknownValue unknownVal;

    /**
     * Gets the value of the timeVal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeVal() {
        return timeVal;
    }

    /**
     * Sets the value of the timeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeVal(XMLGregorianCalendar value) {
        this.timeVal = value;
    }

    /**
     * Gets the value of the uncertainVal property.
     * 
     * @return
     *     possible object is
     *     {@link UncertainValue }
     *     
     */
    public UncertainValue getUncertainVal() {
        return uncertainVal;
    }

    /**
     * Sets the value of the uncertainVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertainValue }
     *     
     */
    public void setUncertainVal(UncertainValue value) {
        this.uncertainVal = value;
    }

    /**
     * Gets the value of the unknownVal property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownValue }
     *     
     */
    public UnknownValue getUnknownVal() {
        return unknownVal;
    }

    /**
     * Sets the value of the unknownVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownValue }
     *     
     */
    public void setUnknownVal(UnknownValue value) {
        this.unknownVal = value;
    }

}
