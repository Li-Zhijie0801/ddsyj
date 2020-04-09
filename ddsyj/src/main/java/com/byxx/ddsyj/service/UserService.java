package com.byxx.ddsyj.service;

import com.byxx.ddsyj.entity.User;

import java.util.List;

public interface UserService {

    /***
     * 根据用户名查询用户
     * @return
     */
    User findUserById(String id);

    List<User> findUserListByName(String name);

    User findByUserName(String name);

    User login(String username);

    /**
     * 保存用户
     * @param user
     */
    void save(User user);

    /**
     * 修改用户
     * @param user
     */
    void update(User user);

    /**
     * 删除用户
     * @param id
     */
    void delete(String id);
}
