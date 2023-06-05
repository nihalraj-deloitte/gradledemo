package com.deloitteinnovation.us.hbx.business.services.utils;

import com.deloitteinnovation.us.hbx.business.services.ReferenceDataService;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.DateUtility;
import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTable;
import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTableRow;
import com.deloitteinnovation.us.hbx.framework.logging.HBELogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ReferenceTableFactory {

    @Autowired
    private ReferenceDataService service;

    @PostConstruct
    private void initStaticDao() {
        setReferenceDataService(service);
    }

    private static ReferenceDataService referenceDataService;

    public static void setReferenceDataService(ReferenceDataService referenceDataService) {
        ReferenceTableFactory.referenceDataService = referenceDataService;
    }

    private static Map<String, ReferenceTable> allReferenceTable = new HashMap<>();

    private static final HBELogger LOGGER = new HBELogger(ReferenceTableFactory.class);

    public static ReferenceTable getReferenceTable(String tableName) {
        String refTableName = tableName != null ? tableName.toUpperCase() : null;
        ReferenceTable referenceTable = new ReferenceTable();
        if (refTableName != null) {
            if (!allReferenceTable.containsKey(refTableName)) {
                try {
                    referenceTable = getReferenceTableFromStore(refTableName);
                } catch (Exception ex) {
                    LOGGER.error(String.format("Error while retrieving ref table data - %s", tableName));
                }
            } else {
                referenceTable = allReferenceTable.get(refTableName);
            }
        }
        return referenceTable;
    }

    public static ReferenceTable getReferenceTable(String refTableName, LocalDateTime edm) {
        ReferenceTable refTable = new ReferenceTable();
        try {
            if (!allReferenceTable.containsKey(refTableName)) {
                refTable = getReferenceTableFromStore(refTableName);
            } else {
                refTable = allReferenceTable.get(refTableName);
            }

            if (refTable != null) {
                return filterRefTableByDate(edm, refTable);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return refTable;
    }

    private static ReferenceTable getReferenceTableFromStore(String refTableName) {
        ReferenceTable referenceTable = referenceDataService.getReferenceDataInCacheByType(refTableName.toUpperCase());
        if (referenceTable != null) {
            allReferenceTable.put(refTableName, referenceTable);
        }
        return referenceTable;
    }

    private static ReferenceTable filterRefTableByDate(LocalDateTime dateTime, ReferenceTable referenceTable) {
        ReferenceTable refTable = getReferenceTableFilteredByDate(referenceTable, dateTime);
        return refTable == null ? null : refTable;
    }

    private static ReferenceTable getReferenceTableFilteredByDate(ReferenceTable referenceTable, LocalDateTime edm) {
        ReferenceTable refTableFiltered;

        if (referenceTable == null) {
            return null;
        }

        List<ReferenceTableRow> refTableRows = referenceTable.getRowsAllDates().stream()
                .filter(x -> ((x.getEffectiveStartDate() == null
                        || DateUtility.dateLteqDateInTimestamp(x.getEffectiveStartDate(), edm))
                        && (x.getEffectiveEndDate() == null
                        || DateUtility.dateGteqDateInTimestamp(x.getEffectiveEndDate(), edm))
                        && (x.getAdditionalAttrNameStartDate() == null
                        || DateUtility.dateLteqDateInTimestamp(x.getAdditionalAttrNameStartDate(), edm))
                        && (x.getAdditionalAttrNameEndDate() == null
                        || DateUtility.dateGteqDateInTimestamp(x.getAdditionalAttrNameEndDate(), edm))
                        && (x.getAdditionalAttrValueStartDate() == null
                        || DateUtility.dateLteqDateInTimestamp(x.getAdditionalAttrValueStartDate(), edm))
                        && (x.getAdditionalAttrValueEndDate() == null
                        || DateUtility.dateGteqDateInTimestamp(x.getAdditionalAttrValueEndDate(), edm))))
                .collect(Collectors.toList());

        refTableFiltered = new ReferenceTable(referenceTable.getRefernceTablename(), refTableRows);

        return refTableFiltered;
    }

}
