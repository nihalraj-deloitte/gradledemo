//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.05 at 07:41:07 PM IST 
//


package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for incomeVerificationStatusCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="incomeVerificationStatusCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="MV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "incomeVerificationStatusCodes", namespace = "http://hbx.us.deloitteinnovation.com/ws/hbxeligibilityservice/schema")
@XmlEnum
public enum IncomeVerificationStatusCodes {

    FA,
    MV;

    public String value() {
        return name();
    }

    public static IncomeVerificationStatusCodes fromValue(String v) {
        return valueOf(v);
    }

}
