package com.wl.pojo;

/**
 * @Author: weilong
 * @Date: 2020/6/18 17:44
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建了！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
