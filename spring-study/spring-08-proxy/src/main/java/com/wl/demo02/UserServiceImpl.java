package com.wl.demo02;

/**
 * @Author: wl
 * @Date: 2020/6/20 09:34
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }


}
