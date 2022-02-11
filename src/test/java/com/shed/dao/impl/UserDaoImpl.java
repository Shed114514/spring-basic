package com.shed.dao.impl;

import com.shed.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void print() {
        System.out.println("[UserDao]调用print方法...");
    }
}
