package com.wl.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: wl
 * @Date: 2020/6/19 20:39
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("小熊啊")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
