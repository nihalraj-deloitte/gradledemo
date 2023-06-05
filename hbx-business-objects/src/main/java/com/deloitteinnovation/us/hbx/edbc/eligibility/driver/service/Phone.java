//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.05 at 07:41:07 PM IST 
//


package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="receiveSMSInd" type="{http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema}yesOrNoCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="phoneType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="C"/>
 *             &lt;enumeration value="H"/>
 *             &lt;enumeration value="O"/>
 *             &lt;enumeration value="W"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phoneNumber",
    "receiveSMSInd"
})
@XmlRootElement(name = "phone", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema")
public class Phone {

    protected BigInteger phoneNumber;
    @XmlSchemaType(name = "string")
    protected YesOrNoCodes receiveSMSInd;
    @XmlAttribute(name = "phoneType")
    protected String phoneType;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneNumber(BigInteger value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the receiveSMSInd property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNoCodes }
     *     
     */
    public YesOrNoCodes getReceiveSMSInd() {
        return receiveSMSInd;
    }

    /**
     * Sets the value of the receiveSMSInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNoCodes }
     *     
     */
    public void setReceiveSMSInd(YesOrNoCodes value) {
        this.receiveSMSInd = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

}
