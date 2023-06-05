//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.01 at 11:05:18 PM IST 
//


package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.driver.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for datetimeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datetimeDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="datetime-val" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="uncertain-val" type="{http://hbx.us.deloitteinnovation.com/ws/hbxspecialenrollmentservice/schema}UncertainValue"/>
 *         &lt;element name="unknown-val" type="{http://hbx.us.deloitteinnovation.com/ws/hbxspecialenrollmentservice/schema}UnknownValue"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datetimeDataType", propOrder = {
    "datetimeVal",
    "uncertainVal",
    "unknownVal"
})
@XmlSeeAlso({
    DatetimeChangePoint.class,
    DatetimeAttributeType.class
})
public class DatetimeDataType {

    @XmlElement(name = "datetime-val")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeVal;
    @XmlElement(name = "uncertain-val")
    protected UncertainValue uncertainVal;
    @XmlElement(name = "unknown-val")
    protected UnknownValue unknownVal;

    /**
     * Gets the value of the datetimeVal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeVal() {
        return datetimeVal;
    }

    /**
     * Sets the value of the datetimeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeVal(XMLGregorianCalendar value) {
        this.datetimeVal = value;
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
