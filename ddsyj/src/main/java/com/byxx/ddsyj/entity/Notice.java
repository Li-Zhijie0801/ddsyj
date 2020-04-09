package com.byxx.ddsyj.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * 通知表
 */
@Data
@Entity
@Table(name = "notice")
public class Notice {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(nullable = false,unique = true,length = 36)
    private String id;

    @Column(length = 36)
    private String groupId;//群组id

    @Column(length = 500)
    private String content;//内容

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;//创建时间
}
