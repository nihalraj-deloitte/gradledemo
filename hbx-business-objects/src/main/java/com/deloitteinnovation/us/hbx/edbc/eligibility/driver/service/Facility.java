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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="facilityCd" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}facilityCodes"/>
 *         &lt;element name="admittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "facilityCd",
    "admittedDate"
})
@XmlRootElement(name = "facility", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema")
public class Facility {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FacilityCodes facilityCd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admittedDate;

    /**
     * Gets the value of the facilityCd property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityCodes }
     *     
     */
    public FacilityCodes getFacilityCd() {
        return facilityCd;
    }

    /**
     * Sets the value of the facilityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityCodes }
     *     
     */
    public void setFacilityCd(FacilityCodes value) {
        this.facilityCd = value;
    }

    /**
     * Gets the value of the admittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmittedDate() {
        return admittedDate;
    }

    /**
     * Sets the value of the admittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmittedDate(XMLGregorianCalendar value) {
        this.admittedDate = value;
    }

}
