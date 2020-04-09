package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.EmergencyNotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmergencyNoticeDao extends JpaRepository<EmergencyNotice,String>, JpaSpecificationExecutor<EmergencyNotice> {
}
