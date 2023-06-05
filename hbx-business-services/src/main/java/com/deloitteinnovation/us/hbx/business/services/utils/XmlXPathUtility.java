package com.deloitteinnovation.us.hbx.business.services.utils;

import java.util.ArrayList;

public class XmlXPathUtility {

    ArrayList<String> values = new ArrayList<String>();
    int count = 0;

    public ArrayList<String> getValue() {
        return values;
    }

    public void setValue(ArrayList<String> value) {
        this.values = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
