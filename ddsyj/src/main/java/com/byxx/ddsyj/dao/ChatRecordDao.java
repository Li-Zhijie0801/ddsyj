package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.ChatRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ChatRecordDao extends JpaRepository<ChatRecord,String>, JpaSpecificationExecutor<ChatRecord> {
}
