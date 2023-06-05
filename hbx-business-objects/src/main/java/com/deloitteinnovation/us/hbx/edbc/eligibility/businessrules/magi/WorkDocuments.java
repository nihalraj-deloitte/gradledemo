package com.deloitteinnovation.us.hbx.edbc.eligibility.businessrules.magi;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WorkDocuments {

    @JacksonXmlElementWrapper(useWrapping = false)
    @XmlElement(name = "items")
    private List<Object> itemsField;

    public List<Object> getItems() {
        return itemsField;
    }

    public void setItems(List<Object> value) {
        itemsField = value;
    }

}