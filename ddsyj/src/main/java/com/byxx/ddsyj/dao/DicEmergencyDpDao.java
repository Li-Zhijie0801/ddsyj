package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.DicEmergencyDp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DicEmergencyDpDao extends JpaRepository<DicEmergencyDp,String>, JpaSpecificationExecutor<DicEmergencyDp> {
}
