package com.wl.demo02;

/**
 * @Author: wl
 * @Date: 2020/6/20 09:36
 */
public class client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.query();
    }
}
