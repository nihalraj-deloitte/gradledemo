package com.deloitteinnovation.us.hbx.business.services.impl;

import com.deloitteinnovation.us.hbx.business.services.ReferenceDataService;
import com.deloitteinnovation.us.hbx.data.services.ReferenceDataDao;
import com.deloitteinnovation.us.hbx.entity.referencedata.ReferenceTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReferenceDataServiceImpl implements ReferenceDataService {

    @Autowired
    private ReferenceDataDao referenceDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public ReferenceTable getReferenceDataInCacheByType(String refType) {
        return referenceDao.getReferenceDataInCacheByType(refType);
    }

}
