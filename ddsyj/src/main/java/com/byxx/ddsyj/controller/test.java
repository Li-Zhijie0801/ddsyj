package com.byxx.ddsyj.controller;

import com.alibaba.fastjson.JSONObject;
import com.byxx.ddsyj.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class test {

    @GetMapping("/test1")
    public String  test1(){
        User user = new User();
        return "test1";
    }

    @GetMapping("/send")
    public String send(){
        JSONObject json = new JSONObject();
        return "/send";
    }

    @GetMapping("/login")
    public String login(){
       return "/login";
    }
   /* @GetMapping("/sss")
    public String sss(){
        JSONObject json = new JSONObject();
        return "/test2";
    }*/

}
