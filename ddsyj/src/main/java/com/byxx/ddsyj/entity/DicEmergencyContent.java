package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 应急填写内容字典表
 */

@Data
@Entity
@Table(name="dic_emergency_content")
public class DicEmergencyContent {

    @Id
    private String id;
    private String emergencyId;//对应应急类型
    private String title;//标题
    private String type;//控件类型
    private String check;//单选多选选项
    private Integer sort;//排序
    private String remark;//备注
}
