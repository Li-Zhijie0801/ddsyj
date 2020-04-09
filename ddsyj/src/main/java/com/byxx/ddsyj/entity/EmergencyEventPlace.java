package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 应急事件发生地点
 */

@Data
@Entity
@Table(name="emergency_event_place")
public class EmergencyEventPlace {

    @Id
    private String id;
    private String eventId;//对应应急处置事件
    private Integer ifDriving;//是否能正常行车
    private String lineName;//线名
    private String startStation;//开始站
    private String endStatation;//结束站
    private String row;//行别
    private Integer startMileage;//开始里程
    private Integer startRice;//开始米
    private Integer endMileage;//结束里程
    private Integer endRice;//结束米
    private Integer sort;//排序
    private String remark;//备注
}
