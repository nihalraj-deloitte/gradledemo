package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common;

import java.math.BigDecimal;

public class GenericUtils {

    private GenericUtils() {

    }

    public static String getFormattedMessage(final Object... parms) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < parms.length; i++) {
            str.append(parms[i]);
        }
        return str.toString();
    }

    public static Long getLongFromString(String value) {
        return value != null ? Long.parseLong(value) : null;
    }

    public static BigDecimal getBigDecimalFromString(String value) {
        return value != null ? new BigDecimal(value) : null;
    }
}
