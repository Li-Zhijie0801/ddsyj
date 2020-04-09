package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 应急处置事件
 */
@Data
@Entity
@Table(name="emergency_event")
public class EmergencyEvent {

    @Id
    private String id;
    private String emergencyType;//应急类型
    private String trainStage;//列调台
    private Date emergencyTime;//应急发生时间
    private String faultStatus;//故障状态
    private Date createTime;//创建时间
    private String founder;//创建人
    private Integer status;//状态
}
