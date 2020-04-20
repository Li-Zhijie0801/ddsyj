package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.DicEmergencyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface DicEmergencyTypeDao extends JpaRepository<DicEmergencyType,String>, JpaSpecificationExecutor<DicEmergencyType> {

    /**
     * 根据上级id查询
     * @param parentId
     * @return
     */
    List<DicEmergencyType> findByParentId(String parentId);




}
