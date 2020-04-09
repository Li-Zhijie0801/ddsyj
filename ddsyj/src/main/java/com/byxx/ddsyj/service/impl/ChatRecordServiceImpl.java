package com.byxx.ddsyj.service.impl;

import com.byxx.ddsyj.dao.ChatRecordDao;
import com.byxx.ddsyj.entity.ChatRecord;
import com.byxx.ddsyj.service.ChatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRecordServiceImpl implements ChatRecordService {

    @Autowired
    private ChatRecordDao chatRecordDao;

    @Override
    public List<ChatRecord> findAll() {
        return chatRecordDao.findAll();
    }
}
