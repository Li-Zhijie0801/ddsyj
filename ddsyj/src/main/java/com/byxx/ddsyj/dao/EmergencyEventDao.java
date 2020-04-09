package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.EmergencyEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmergencyEventDao extends JpaRepository<EmergencyEvent,String>, JpaSpecificationExecutor<EmergencyEvent> {
}
