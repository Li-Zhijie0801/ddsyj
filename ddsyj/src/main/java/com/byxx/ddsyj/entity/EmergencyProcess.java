package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 应急处置过程表
 */

@Data
@Entity
@Table(name="emergency_process")
public class EmergencyProcess {

    @Id
    private String id;
    private String eventId;//应急事件id
    private String companyName;//岗位名称
    private Integer sort;//排序(按岗位排序)
    private String desc;//过程描述(字典)
    private Date createTime;//生成时间
    private String rep;//过程补充
    private Date executionTime;//执行时间
    private String executor;//执行人
    private String ip;//IP地址
}
