package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("hello world");
    }
}
