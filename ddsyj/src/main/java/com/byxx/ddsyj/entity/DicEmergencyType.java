package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * 应急类型字典表
 */
@Data
@Entity
@Table(name="dic_emergency_type")
public class DicEmergencyType {

    @Id
    private String id;
    private String name;//应急分类
    private String remark;//备注
    private Integer sort;//排序
    private String parentId;//上级分类
    private String founder;//创建人
    private Date createTime;//创建时间
    private Integer status;//是否有效
    private String imgUrl;

    @Transient
    private List<DicSonType> sonTypeList = new ArrayList<>();

}
