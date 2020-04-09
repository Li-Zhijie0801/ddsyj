package com.byxx.ddsyj.controller;


import com.byxx.ddsyj.dao.UserDao;
import com.byxx.ddsyj.entity.User;
import com.byxx.ddsyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Resource
    private UserDao userDao;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String,Object> login(User user, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        User userPro = userService.login(user.getUsername());
        if (userPro != null) {
            System.out.println(StringUtils.isEmpty(user.getPassword()));
            if (!StringUtils.isEmpty(user.getPassword())&&
                    userPro.getPassword().equals(user.getPassword())) {
                session.setAttribute("user",userPro);
                map.put("code","200");
                map.put("msg","登陆成功");
            }else{
                map.put("msg","密码不正确");
            }
        }else{
            map.put("msg","账号不存在");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/findUser/{id}",method = RequestMethod.GET)
    public Map<String,Object> findUserById(@PathVariable String id){
        Map<String,Object> map = new HashMap<>();
        User user = userService.findUserById(id);
        map.put("user",user);
        map.put("code","200");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/findUserByName/{username}",method = RequestMethod.GET)
    public Map<String,Object> findUserByName(@PathVariable String username){
        Map<String,Object> map = new HashMap<>();
        User user = userDao.findUserByUsername(username);
        map.put("user",user);
        map.put("code","200");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public Map<String,Object> saveUser(User user){
        Map<String,Object> map = new HashMap<>();
        userService.save(user);
        map.put("code","200");
        map.put("msg","保存成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public Map<String,Object> updateUser(User user){
        Map<String,Object> map = new HashMap<>();
        userService.save(user);
        map.put("code","200");
        map.put("msg","修改成功");
        return map;
    }
}
