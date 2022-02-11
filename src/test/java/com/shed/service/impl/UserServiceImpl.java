package com.shed.service.impl;

import com.shed.dao.UserDao;
import com.shed.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao ;

    public UserServiceImpl(UserDao userDao) {
        System.out.println("[UserServiceImpl]构造方法被调用...");
        this.userDao = userDao;
    }

    @Override
    public void print() {
        System.out.println("[UserService]调用print方法...");
        userDao.print();
    }
}
