package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 应急已填写内容
 */
@Data
@Entity
@Table(name="emergency_completed")
public class EmergencyCompleted {

    @Id
    private String id;
    private String eventId;//应急处置id
    private String title;//标题
    private String content;//内容
    private Integer sort;//排序
    private Date completedTime;//填写时间
    private String completedBy;//填写人
}
