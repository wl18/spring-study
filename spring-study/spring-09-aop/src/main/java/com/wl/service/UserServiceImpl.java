package com.wl.service;

/**
 * @Author: wl
 * @Date: 2020/6/20 20:30
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");

    }

    @Override
    public void update() {
        System.out.println("修改一个用户");

    }

    @Override
    public void select() {
        System.out.println("查询一个用户");

    }
}
