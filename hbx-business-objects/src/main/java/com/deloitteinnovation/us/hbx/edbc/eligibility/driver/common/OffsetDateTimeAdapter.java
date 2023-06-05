package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
    @Override
    public LocalDateTime unmarshal(String v) throws Exception {
        return OffsetDateTime.parse(v, DateTimeFormatter.ISO_OFFSET_DATE_TIME).toLocalDateTime();
    }

    @Override
    public String marshal(LocalDateTime v) throws Exception {
        return v.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).toString();
    }
}