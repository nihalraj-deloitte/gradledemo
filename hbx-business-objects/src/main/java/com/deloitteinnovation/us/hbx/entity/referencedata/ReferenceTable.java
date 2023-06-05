package com.deloitteinnovation.us.hbx.entity.referencedata;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferenceTable {
    private String refernceTablename;
    private Map<String, ReferenceTableRow> referenceTableRows = new HashMap<>();
    private Map<String, List<ReferenceTableRow>> allRows = new HashMap<>();

    public String getRefernceTablename() {
        return refernceTablename;
    }

    public void setRefernceTablename(String refernceTablename) {
        this.refernceTablename = refernceTablename;
    }

    public Map<String, ReferenceTableRow> getReferenceTableRows() {
        return referenceTableRows;
    }

    public void setReferenceTableRows(Map<String, ReferenceTableRow> referenceTableRows) {
        this.referenceTableRows = referenceTableRows;
    }

    public void setAllRows(Map<String, List<ReferenceTableRow>> allRows) {
        this.allRows = allRows;
    }

    public ReferenceTable(String name, List<ReferenceTableRow> rows) {
        if (StringUtils.isAllEmpty(name)) {
            throw new NullPointerException("name is null or empty.");
        }

        if (rows == null) {
            throw new NullPointerException("rows is null.");
        }

        if (rows.isEmpty()) {
            throw new NullPointerException("rows does not contain any elements.");
        }
        Map<String, ReferenceTableRow> working = new HashMap<>();
        rows.forEach(row -> {
            working.put(row.getKeyValue(), row);
        });
        referenceTableRows = working;
        rows.forEach(row -> {
            if (allRows.containsKey(row.getKeyValue())) {
                allRows.get(row.getKeyValue()).add(row);
            } else {
                allRows.put(row.getKeyValue(), new ArrayList<>(Arrays.asList(row)));
            }
        });
        refernceTablename = name;
    }

    public ReferenceTable() {
    }

    @Override
    public String toString() {

        if (refernceTablename == null) {
            return "";
        }

        return String.format("Reference table name: %s; Number of rows: %s.", refernceTablename,
                referenceTableRows.size());
    }

    @Override
    public int hashCode() {

        return refernceTablename.hashCode();

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return equals((ReferenceTable) obj);

    }

    public boolean equals(ReferenceTable other) {

        return StringUtils.equals(refernceTablename, other.refernceTablename);

    }

    public String getColumnValue(String key, String returnColumnName) {
        if (StringUtils.isEmpty(key)) {
            throw new NullPointerException("key is null or empty.");
        }

        if (StringUtils.isEmpty(returnColumnName)) {
            throw new NullPointerException("returnColumnName is null or empty.");
        }

        if (!referenceTableRows.containsKey(key)) {
            String msg = "Key name %s does not exist in reference table %s.";
            throw new NullPointerException(String.format(msg, key, getRefernceTablename()));
        }

        if (!referenceTableRows.get(key).getAdditionalColumns().containsKey(returnColumnName)) {
            String msg = "Column name %s does not exist in reference table %s.";
            throw new NullPointerException(String.format(msg, returnColumnName, getRefernceTablename()));
        }

        return referenceTableRows.get(key).getAdditionalColumns().get(returnColumnName).toString();
    }

    public String getKey(LocalDateTime effectiveDate, String searchColumnName, String searchColumnValue) {
        if (StringUtils.isEmpty(searchColumnName)) {
            throw new NullPointerException("searchColumnName is null or empty.");
        }

        if (!referenceTableRows.values().stream()
                .anyMatch(x -> x.getAdditionalColumns().containsKey(searchColumnName))) {
            String msg = "Column name %s does not exist in reference table %s.";
            throw new NullPointerException(String.format(msg, searchColumnName));
        }

        try {
            java.util.Optional<ReferenceTableRow> refRow = referenceTableRows.values().stream()
                    .filter(x -> x.getAdditionalColumns().containsKey(searchColumnName)).findFirst();
            Stream<Object> value = null;
            if (refRow.isPresent()) {
                value = referenceTableRows.entrySet().stream().filter(entry -> refRow.get().equals(entry.getValue()))
                        .map(Map.Entry::getKey);
                if (value.count() <= 0) {
                    String msg = "Could not find key for column name %s with a value of %s.";
                    throw new NullPointerException(String.format(msg, searchColumnName, searchColumnValue));
                }
                return value.toString();
            }
            return null;
        } catch (Exception e) {
            String effectiveDateStringValue = effectiveDate != null ? effectiveDate.toString() : "(null)";
            String exceptionStr = "More than one row in table %s satifies the filter expression :\nEffectiveDate: %s\nColumn Name: %s\nColumn Value: %s.";
            throw new NullPointerException(String.format(exceptionStr, getRefernceTablename(), effectiveDateStringValue,
                    searchColumnName, searchColumnValue));
        }

    }

    public List<ReferenceTableRow> getFilteredRows(Comparator<ReferenceTableRow> comparer) {
        List<ReferenceTableRow> rows = referenceTableRows.values().stream().collect(Collectors.toList());
        if (comparer == null) {
            rows.sort(null);
        } else {
            rows.sort(comparer);
        }
        return rows;
    }

    public List<ReferenceTableRow> getAllRows() {
        List<ReferenceTableRow> rows = referenceTableRows.values().stream().collect(Collectors.toList());
        rows.sort((ReferenceTableRow row1, ReferenceTableRow row2) -> row1.getDisplayValue()
                .compareTo(row2.getDisplayValue()));
        return rows;

    }

    public List<ReferenceTableRow> getRowsAllDates() {
        List<ReferenceTableRow> rows = allRows.values().stream().flatMap(List::stream).collect(Collectors.toList());
        return rows;

    }

}