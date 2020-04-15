package com.byxx.ddsyj.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * 聊天记录表
 */
@Data
@Entity
@Table(name = "chat_record")
public class ChatRecord {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(nullable = false,unique = true,length = 36)
    private String id;

    @Column(length = 36)
    private String sender;//发送人

    @Column(length = 36)
    private String recipient;//接收人

    @Column(name = "send_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendTime;//发送时间

    @Column(length = 300)
    private String content;//内容

    @Column(length = 300)
    private String files;//文件

}
