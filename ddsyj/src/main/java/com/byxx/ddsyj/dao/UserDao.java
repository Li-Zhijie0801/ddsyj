package com.byxx.ddsyj.dao;

import com.byxx.ddsyj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {

    List<User> findUsersByUsername(String username);

    User findUserByUsername(String name);
}
