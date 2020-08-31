package com.wl.service;

import com.wl.dao.UserDao;
import com.wl.dao.UserDaoImpl;

/**
 * @Author: weilong
 * @Date: 2020/6/16 22:09
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
