package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class    UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

//    @Autowired//按照数据类型从Spring容器中进行匹配
//    @Qualifier("userDao")//按照名称从容器中进行匹配的，但是此处要结合@Autowired一起使用
    @Resource(name ="userDao")
    private UserDao userDao;

    public void setHello(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println(driver);
        userDao.save();
    }
}
