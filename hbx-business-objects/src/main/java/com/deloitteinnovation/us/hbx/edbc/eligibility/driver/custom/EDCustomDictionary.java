//
// Translated by CS2J (http://www.cs2j.com): 12/14/2020 11:45:31 AM
//

package com.deloitteinnovation.us.hbx.edbc.eligibility.driver.custom;

import org.apache.commons.lang3.StringUtils;

/**
 * Custom object to mimic Dictionary which can be Serializable
 */
public class EDCustomDictionary {
    private String key = StringUtils.EMPTY;
    private String val = StringUtils.EMPTY;

    public String getKey() {
        return key;
    }

    public void setKey(String value) {
        key = value;
    }

    public String getValue() {
        return val;
    }

    public void setValue(String value) {
        val = value;
    }

    public EDCustomDictionary(String key, String value) {
        setKey(key);
        setValue(value);
    }

}
