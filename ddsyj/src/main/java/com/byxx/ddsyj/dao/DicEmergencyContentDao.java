package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.DicEmergencyContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DicEmergencyContentDao extends JpaRepository<DicEmergencyContent,String>, JpaSpecificationExecutor<DicEmergencyContent> {
}
