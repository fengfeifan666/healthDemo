package com.itheima.demo;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
