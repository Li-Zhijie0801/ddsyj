package com.byxx.ddsyj.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(nullable = false,unique = true,length = 36)
    private String id;
    private String name;//应急分类名
    private String remark;//备注
    private Integer sort;//排序
    private String parentId;//上级分类
    private String founder;//创建人
    private Date createTime;//创建时间
    private Integer status;//是否有效  0有效  1无效
    private String imgUrl;

    @Transient
    private List<DicEmergencyType> sonTypeList = new ArrayList<>();//二级应急类型

}
