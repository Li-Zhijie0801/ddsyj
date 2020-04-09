package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.EmergencyProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmergencyProcessDao extends JpaRepository<EmergencyProcess,String>, JpaSpecificationExecutor<EmergencyProcess> {
}
