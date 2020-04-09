package com.byxx.ddsyj.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * 群组表
 */
@Data
@Entity
@Table(name = "group")
public class Group {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(nullable = false,unique = true,length = 36)
    private String id;

    @Column(name = "group_name",length = 36)
    private String groupName;//群组名

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;//创建时间
}
