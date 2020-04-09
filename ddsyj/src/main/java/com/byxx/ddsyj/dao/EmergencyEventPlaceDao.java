package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.EmergencyEventPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmergencyEventPlaceDao extends JpaRepository<EmergencyEventPlace,String>, JpaSpecificationExecutor<EmergencyEventPlace> {
}
