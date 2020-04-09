package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 应急处置过程字典表
 */
@Data
@Entity
@Table(name="dic_emergency_process")
public class DicEmergencyProcess {

    @Id
    private String id;
    private String companyName;//岗位名字
    private String desc;//过程描述
    private String remark;//备注
    private Integer sort;//排序
    private String parentPass;//上级过程
    private Date createTime;//创建时间
    private String founder;//创建人
    private Integer status;//是否有效
}
