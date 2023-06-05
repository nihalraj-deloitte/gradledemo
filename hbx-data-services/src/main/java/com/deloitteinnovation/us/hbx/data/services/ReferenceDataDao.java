package com.deloitteinnovation.us.hbx.data.services;

import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTable;

public interface ReferenceDataDao {
    ReferenceTable getReferenceDataInCacheByType(String refType);
}
