//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.01 at 11:05:18 PM IST 
//


package com.deloitteinnovation.us.hbx.enrollment.specialenrollment.driver.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StateEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="known"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="uncertain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StateEnum")
@XmlEnum
public enum StateEnum {

    @XmlEnumValue("known")
    KNOWN("known"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("uncertain")
    UNCERTAIN("uncertain");
    private final String value;

    StateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateEnum fromValue(String v) {
        for (StateEnum c: StateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
