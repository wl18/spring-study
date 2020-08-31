package com.wl.demo04;

import com.wl.demo02.UserService;
import com.wl.demo02.UserServiceImpl;

/**
 * @Author: wl
 * @Date: 2020/6/20 10:38
 */
public class client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandle pih = new ProxyInvocationHandle();

        pih.setTarget(userService); //设置要代理的对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
