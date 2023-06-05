package com.deloitteinnovation.us.hbx.entity.referencedata;

import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.DateUtility;
import org.apache.commons.lang3.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReferenceTableRow implements Comparable<ReferenceTableRow> {

    private String keyValue;

    private String displayValue;

    private String displayValueEs;

    private LocalDateTime effectiveStartDate;

    private LocalDateTime effectiveEndDate;

    private int sortOrder = 0;

    private Map<String, String> additionalColumns = new HashMap<>();

    private LocalDateTime additionalAttrNameEffectiveStartDate;

    private LocalDateTime additionalAttrNameEffectiveEndDate;

    private LocalDateTime additionalAttrValueEffectiveStartDate;

    private LocalDateTime additionalAttrValueEffectiveEndDate;

    public ReferenceTableRow(ResultSet rs) throws SQLException {
        if (rs == null) {
            throw new NullPointerException("row is null.");
        }

        keyValue = rs.getString(RefTableConstants.KEYVALUECONST);
        displayValue = rs.getString(RefTableConstants.DISPLAYVALUECONST);
        Date date = rs.getDate(RefTableConstants.EFFECTIVESTARTDATECONST);
        effectiveStartDate = date != null ? DateUtility.convertDateToLocalDateTimeUsingTimestamp(date) : null;

        date = rs.getDate(RefTableConstants.EFFECTIVEENDDATECONST);
        effectiveEndDate = date != null ? DateUtility.convertDateToLocalDateTimeUsingTimestamp(date) : null;

        sortOrder = rs.getInt(RefTableConstants.SORTORDERCONST);

        additionalColumns = getMapForOtherValues(rs);

        date = rs.getDate(RefTableConstants.ADDITIONALATTRNAMESTARTDATE);
        additionalAttrNameEffectiveStartDate = date != null ? DateUtility.convertDateToLocalDateTimeUsingTimestamp(date)
                : null;

        date = rs.getDate(RefTableConstants.ADDITIONALATTRNAMEENDDATE);
        additionalAttrNameEffectiveEndDate = date != null ? DateUtility.convertDateToLocalDateTimeUsingTimestamp(date)
                : null;

        date = rs.getDate(RefTableConstants.ADDITIONALATTRVALUESTARTDATE);
        additionalAttrValueEffectiveStartDate = date != null
                ? DateUtility.convertDateToLocalDateTimeUsingTimestamp(date)
                : null;
        date = rs.getDate(RefTableConstants.ADDITIONALATTRVALUEENDDATE);
        additionalAttrValueEffectiveEndDate = date != null ? DateUtility.convertDateToLocalDateTimeUsingTimestamp(date)
                : null;

    }

    private static Map<String, String> getMapForOtherValues(ResultSet rs) throws SQLException {
        Map<String, String> otherValueMap = new HashMap<>();
        List<String> skipColumnNames = Arrays.asList(RefTableConstants.KEYVALUECONST,
                RefTableConstants.DISPLAYVALUECONST, RefTableConstants.EFFECTIVESTARTDATECONST,
                RefTableConstants.EFFECTIVEENDDATECONST, RefTableConstants.SORTORDERCONST);

        int colCount = rs.getMetaData().getColumnCount();
        for (int i = 1; i <= colCount; i++) {
            String col = rs.getMetaData().getColumnName(i);
            String colName = col.startsWith("_") ? col.substring(1) : col;
            if (!skipColumnNames.contains(colName)) {
                otherValueMap.put(colName.toUpperCase(), rs.getString(col));
            }
        }
        return otherValueMap;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String value) {
        displayValue = value;
    }

    public LocalDateTime getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public LocalDateTime getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public LocalDateTime getAdditionalAttrNameStartDate() {
        return additionalAttrNameEffectiveStartDate;
    }

    public LocalDateTime getAdditionalAttrNameEndDate() {
        return additionalAttrNameEffectiveEndDate;
    }

    public LocalDateTime getAdditionalAttrValueStartDate() {
        return additionalAttrValueEffectiveStartDate;
    }

    public LocalDateTime getAdditionalAttrValueEndDate() {
        return additionalAttrValueEffectiveEndDate;
    }

    public String getDisplayValueEs() {
        return displayValueEs;
    }

    public void setDisplayValueEs(String displayValueEs) {
        this.displayValueEs = displayValueEs;
    }

    public Map<String, String> getAdditionalColumns() {
        return additionalColumns;
    }

    public void setAdditionalColumns(Map<String, String> additionalColumns) {
        this.additionalColumns = additionalColumns;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public void setEffectiveStartDate(LocalDateTime effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public void setEffectiveEndDate(LocalDateTime effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * Returns a {@link #System.String} that represents this instance.
     *
     * @return A {@link #System.String} that represents this instance.
     */
    @Override
    public String toString() {
        String initialString = String.format("KeyValue:%s; DisplayValue:%s; EffectiveStartDate:%s; EffectiveEndDate:%s",
                keyValue, displayValue, effectiveStartDate, effectiveEndDate);
        StringBuilder builder = new StringBuilder(initialString);
        for (String col : getAdditionalColumns().keySet()) {
            builder.append(String.format("; %s:%s", col, getAdditionalColumns().get(col)));
        }
        return builder.toString();
    }

    /**
     * Returns a hash code for this instance based on {@link #KeyValue} .
     *
     * @return A hash code for this instance, suitable for use in hashing algorithms
     * and data structures like a hash table.
     */
    @Override
    public int hashCode() {
        return keyValue.hashCode();
    }

    /**
     * Compares instances of {@link #ReferenceTableRow} s based on the DisplayValue.
     *
     * @param other The other.
     *
     * @return A value that indicates the relative order of the objects being
     * compared. The return value has the following meanings: Value Meaning
     * Less than zero This object is less than the {@code other}
     * parameter.Zero This object is equal to {@code other} . Greater than
     * zero This object is greater than {@code other} .
     */
    @Override
    public int compareTo(ReferenceTableRow other) {
        if (other == null) {
            return -1;
        }

        if (StringUtils.isEmpty(getDisplayValue())) {
            return -1;
        }

        if (StringUtils.isEmpty(other.getDisplayValue())) {
            return 1;
        }
        return StringUtils.equals(getDisplayValue(), other.getDisplayValue()) ? 1 : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return equals((ReferenceTableRow) obj);
    }

    public boolean equals(ReferenceTableRow other) {
        return StringUtils.equals(keyValue, other.keyValue);

    }

}
