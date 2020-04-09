package com.byxx.ddsyj.service;

import com.byxx.ddsyj.entity.DicEmergencyContent;

public interface DicEmergencyContentService {

    /**
     * 根据id查询
     */
    DicEmergencyContent findById(String id);

    /**
     * 保存
     */
    void save(DicEmergencyContent dicEmergencyContent);
    /**
     * 更新
     */
    void update(DicEmergencyContent dicEmergencyContent);
    /**
     * 删除
     */
    void delete(String id);
}
