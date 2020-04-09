package com.byxx.ddsyj.controller;

import com.byxx.ddsyj.dao.ChatRecordDao;
import com.byxx.ddsyj.entity.ChatRecord;
import com.byxx.ddsyj.service.ChatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/chatRecord")
public class ChatRecordController {

    @Autowired
    private ChatRecordService chatRecordService;

    @Resource
    private ChatRecordDao chatRecordDao;

    @ResponseBody
    @GetMapping("/findChatRecordAll")
    public Map<String,Object> findChatRecordAll(){
        Map<String,Object> map = new HashMap<>();
        List<ChatRecord> chatRecordList = chatRecordService.findAll();
        map.put("chatRecordList",chatRecordList);
        return map;
    }

    /**
     * 保存聊天记录
     */
    @ResponseBody
    @PostMapping("/saveChatRecord")
    public Map<String,Object> saveChatRecord(ChatRecord chatRecord){
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        if (chatRecord.getContent()==null) {
            map.put("msg","消息不能为空！");
            return map;
        }
        chatRecord.setSendTime(new Date());
        ChatRecord res = chatRecordDao.save(chatRecord);
        if (res != null) {
            map.put("msg","保存聊天记录成功");
        }
        return map;
    }
}
