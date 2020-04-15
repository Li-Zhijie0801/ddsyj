package com.byxx.ddsyj.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "user_be_group")
public class UserBeGroup {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(nullable = false,unique = true,length = 36)
    private String id;

    @Column(name = "group_id",length = 36)
    private String groupId;//群组id

    @Column(name = "user_id",length = 36)
    private String userId;//用户id

    @Column(length = 200)
    private String remark;//备注


    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;//创建时间

}
