package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.DicEmergencyDp;
import com.byxx.ddsyj.entity.DicEmergencyProcess;
import com.byxx.ddsyj.entity.EmergencyProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DicEmergencyProcessDao extends JpaRepository<DicEmergencyProcess,String>, JpaSpecificationExecutor<EmergencyProcess> {
}
