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
 * <p>Java class for AttributeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="number"/>
 *     &lt;enumeration value="currency"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="datetime"/>
 *     &lt;enumeration value="timeofday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeTypeEnum")
@XmlEnum
public enum AttributeTypeEnum {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("number")
    NUMBER("number"),
    @XmlEnumValue("currency")
    CURRENCY("currency"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("timeofday")
    TIMEOFDAY("timeofday");
    private final String value;

    AttributeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeTypeEnum fromValue(String v) {
        for (AttributeTypeEnum c: AttributeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
