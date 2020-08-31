package com.wl.pojo;

/**
 * @Author: wl
 * @Date: 2020/6/18 11:18
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void show() {
        System.out.println("Hello" + str);
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
