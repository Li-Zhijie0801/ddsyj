package com.byxx.ddsyj.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * 消息表
 */
@Data
@Entity
@Table(name = "info")
public class Info {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(nullable = false,unique = true,length = 36)
    private String id;

    @Column(length = 36)
    private String username;

    @Column(length = 200)
    private String avatar;//头像图片路径

    @Column(length = 36)
    private String type;//类型

    @Column(length = 500)
    private String content;//内容

    @Column(length = 36)
    private String mid;//发送人id

    @Column(length = 36)
    private String toId;//接收人id

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;//创建时间

    private String remark;//备注
}
