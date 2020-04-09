package com.byxx.ddsyj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 通知及签收情况
 */

@Data
@Entity
@Table(name="emergency_notice")
public class EmergencyNotice {
    @Id
    private String id;
    private String eventId;//应急处置id
    private String companyName;//岗位名称
    private Date noticeTime;//通知时间
    private String notifier;//通知者
    private String notifierIp;//通知者ip
    private Date signTime;//签收确认时间
    private String signer;//签收者
    private String signerIp;//签收者ip
    private Integer sort;//排序
    private String remark;//备注
}
