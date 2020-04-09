package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.EmergencyCompleted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmergencyCompletedDao extends JpaRepository<EmergencyCompleted,String>, JpaSpecificationExecutor<EmergencyCompleted> {
}
