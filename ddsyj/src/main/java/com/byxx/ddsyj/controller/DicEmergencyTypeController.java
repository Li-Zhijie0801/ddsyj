package com.byxx.ddsyj.controller;

import com.alibaba.fastjson.JSONObject;
import com.byxx.ddsyj.dao.DicEmergencyTypeDao;
import com.byxx.ddsyj.entity.DicEmergencyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 应急类型
 */

@RestController
@RequestMapping("/dicemergencytype")
public class DicEmergencyTypeController {

    @Autowired
    private DicEmergencyTypeDao dicEmergencyTypeDao;

    /**
     * 查询所有一级二级应急类型
     * @return
     */
    @GetMapping(value = "selectEmergencyTypeOneTow")
    public JSONObject selectEmergencyTypeOneTow(){
        JSONObject jsonObject = new JSONObject();
        List<DicEmergencyType> dicEmergencyTypeList = dicEmergencyTypeDao.findAll();
        List<DicEmergencyType> oneTowType = new ArrayList<>();//一级、二级类型
        for (DicEmergencyType dicEmergencyType : dicEmergencyTypeList) {
            //根据父类id查询应急类型集合
            List<DicEmergencyType> towEmergencyType = dicEmergencyTypeDao.findByParentId(dicEmergencyType.getId());
            dicEmergencyType.setSonTypeList(towEmergencyType);
            if (dicEmergencyType.getParentId().equals("0")) {
                oneTowType.add(dicEmergencyType);
            }
        }
        jsonObject.put("success",true);
        jsonObject.put("msg","查询成功");
        jsonObject.put("data",oneTowType);
        return jsonObject;
    }

    /**
     * 保存、修改应急类型
     * @param dicEmergencyType
     * @return
     */
    @PostMapping(value = "saveEmergencyType")
    public JSONObject saveEmergencyType(DicEmergencyType dicEmergencyType){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("msg","操作成功");
        //如果等于空
        if (StringUtils.isEmpty(dicEmergencyType.getId())) {
            dicEmergencyType.setCreateTime(new Date());
        }
        //如果没有父类默认父类id为0
        if (StringUtils.isEmpty(dicEmergencyType.getParentId())) {
            dicEmergencyType.setParentId("0");
        }
        //如果名称为空操作失败
        if (StringUtils.isEmpty(dicEmergencyType.getName())) {
            jsonObject.put("msg","操作失败1");
        }else{
            DicEmergencyType t = dicEmergencyTypeDao.save(dicEmergencyType);
            if (t == null) {
                jsonObject.put("msg","操作失败2");
            }
        }
        return jsonObject;
    }
}
