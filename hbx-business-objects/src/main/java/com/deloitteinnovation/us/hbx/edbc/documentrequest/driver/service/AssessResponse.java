//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.10 at 03:28:34 PM IST 
//


package com.deloitteinnovation.us.hbx.edbc.documentrequest.driver.service;

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
 *         &lt;element name="events" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}ListEventsType" minOccurs="0"/>
 *         &lt;element name="global-instance" type="{http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema}GlobalInstanceType"/>
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
    "events",
    "globalInstance"
})
@XmlRootElement(name = "assess-response", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxdocumentrequestservice/schema")
public class AssessResponse {

    protected ListEventsType events;
    @XmlElement(name = "global-instance", required = true)
    protected GlobalInstanceType globalInstance;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ListEventsType }
     *     
     */
    public ListEventsType getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEventsType }
     *     
     */
    public void setEvents(ListEventsType value) {
        this.events = value;
    }

    /**
     * Gets the value of the globalInstance property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalInstanceType }
     *     
     */
    public GlobalInstanceType getGlobalInstance() {
        return globalInstance;
    }

    /**
     * Sets the value of the globalInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalInstanceType }
     *     
     */
    public void setGlobalInstance(GlobalInstanceType value) {
        this.globalInstance = value;
    }

}
