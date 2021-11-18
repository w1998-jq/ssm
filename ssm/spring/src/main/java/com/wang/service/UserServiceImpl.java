package com.wang.service;

import com.wang.dao.UserDao;
import com.wang.dao.UserDaoImpl;

/**
 * @ClassName UserServiceImpl
 * Description
 * @Author jqWang
 * Date 2021/11/18 21:59
 **/
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
