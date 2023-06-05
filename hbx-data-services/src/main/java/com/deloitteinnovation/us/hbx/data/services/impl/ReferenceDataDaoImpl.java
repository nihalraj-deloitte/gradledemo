package com.deloitteinnovation.us.hbx.data.services.impl;

import com.deloitteinnovation.us.hbx.data.services.BaseDao;
import com.deloitteinnovation.us.hbx.data.services.ReferenceDataDao;
import com.deloitteinnovation.us.hbx.edbc.eligibility.driver.common.GenericUtils;
import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTable;
import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTableRow;
import com.deloitteinnovation.us.hbx.framework.logging.HBELogger;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReferenceDataDaoImpl extends BaseDao implements ReferenceDataDao {

    private static final HBELogger LOGGER = new HBELogger(ReferenceDataDaoImpl.class);

    private ReferenceTable referenceTable;

    public ReferenceTable getReferenceTable() {
        return referenceTable;
    }

    public void setReferenceTable(ReferenceTable referenceTable) {
        this.referenceTable = referenceTable;
    }

    public ReferenceTable createTempReferenceTable(String tablename, ResultSet rs) throws SQLException {
        List<ReferenceTableRow> rows = new ArrayList<>();
        if (rs != null) {
            while (rs.next()) {
                ReferenceTableRow row = new ReferenceTableRow(rs);
                rows.add(row);
            }
        }
        if (!rows.isEmpty()) {
            return new ReferenceTable(tablename, rows);
        }
        return null;
    }

    @Override
    public ReferenceTable getReferenceDataInCacheByType(String refType) {
        referenceTable = null;
        try {
            getCurrentSession().doWork(new Work() {
                @Override
                public void execute(Connection connection) throws SQLException {
                    try (CallableStatement callableStatement = connection
                            .prepareCall("{? = CALL hc_eligibility.sp_get_reference_data(?)}")) {
                        // Register Input Parameters
                        callableStatement.registerOutParameter(1, Types.OTHER);
                        if (null != refType) {
                            callableStatement.setString(2, refType);
                        } else {
                            callableStatement.setNull(2, Types.VARCHAR);
                        }
                        callableStatement.execute();
                        try {
                            ResultSet rs = (ResultSet) callableStatement.getObject(1);
                            referenceTable = createTempReferenceTable(refType, rs);
                        } catch (Exception e) {
                            LOGGER.error(GenericUtils.getFormattedMessage(e.getMessage(), e));
                        }
                    }
                }
            });

        } catch (Exception e) {
            LOGGER.error(GenericUtils.getFormattedMessage(e.getMessage(), e));
        }
        return referenceTable;

    }

}
