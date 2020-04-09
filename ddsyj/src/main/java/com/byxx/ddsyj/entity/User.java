package com.byxx.ddsyj.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(nullable = false,unique = true,length = 36)
    private String id;

    @Column(length = 36)
    private String username;//发送人

    @Column(length = 36)
    private String password;

    @Column(length = 36)
    private String sendMsg;//发送消息

    @Column(length = 36)
    private String receiver;//接收人

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;//创建时间

    @Column(length = 36)
    private String groupId;

}
