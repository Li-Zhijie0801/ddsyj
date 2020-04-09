package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 应急通知部门字典表
 */
@Data
@Entity
@Table(name="dic_emergency_dp")
public class DicEmergencyDp {
    @Id
    private String id;
    private String emergencyId;//应急id
    private String company;//单位或者岗位名称
    private String remark;//备注
    private Integer sort;//排序
}
