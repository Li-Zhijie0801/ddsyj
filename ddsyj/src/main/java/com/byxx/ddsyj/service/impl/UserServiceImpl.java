package com.byxx.ddsyj.service.impl;

import com.byxx.ddsyj.dao.UserDao;
import com.byxx.ddsyj.entity.User;
import com.byxx.ddsyj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUserById(String id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> findUserListByName(String name) {
        return userDao.findUsersByUsername(name);
    }

    @Override
    public User findByUserName(String name) {
        return userDao.findUserByUsername(name);
    }

    @Override
    public User login(String username) {
        return userDao.findUserByUsername(username);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(String id) {
        userDao.deleteById(id);
    }
}
