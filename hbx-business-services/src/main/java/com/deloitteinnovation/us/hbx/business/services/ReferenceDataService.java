package com.deloitteinnovation.us.hbx.business.services;

import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTable;

public interface ReferenceDataService {
    ReferenceTable getReferenceDataInCacheByType(String refType);
}
