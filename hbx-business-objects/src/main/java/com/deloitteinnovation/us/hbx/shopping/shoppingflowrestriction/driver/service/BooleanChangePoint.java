//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.02 at 05:56:17 PM IST 
//


package com.deloitteinnovation.us.hbx.shopping.shoppingflowrestriction.driver.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for booleanChangePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="booleanChangePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hbx.us.deloitteinnovation.com/ws/hbxshoppingflowrestrictionservice/schema}booleanDataType">
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booleanChangePoint")
public class BooleanChangePoint
    extends BooleanDataType
{

    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
