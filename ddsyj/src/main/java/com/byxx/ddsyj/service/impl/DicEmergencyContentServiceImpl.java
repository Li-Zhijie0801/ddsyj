package com.byxx.ddsyj.service.impl;

import com.byxx.ddsyj.dao.DicEmergencyContentDao;
import com.byxx.ddsyj.entity.DicEmergencyContent;
import com.byxx.ddsyj.service.DicEmergencyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DicEmergencyContentServiceImpl implements DicEmergencyContentService {

    @Autowired
    private DicEmergencyContentDao emergencyContentDao;


    @Override
    public DicEmergencyContent findById(String id) {
        return emergencyContentDao.findById(id).get();
    }

    @Override
    public void save(DicEmergencyContent dicEmergencyContent) {
        emergencyContentDao.save(dicEmergencyContent);

    }

    @Override
    public void update(DicEmergencyContent dicEmergencyContent) {
        emergencyContentDao.save(dicEmergencyContent);
    }

    @Override
    public void delete(String id) {
        emergencyContentDao.deleteById(id);
    }
}
