package com.wl.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: wl
 * @Date: 2020/6/19 11:11
 */

// 等价于<bean id="user" class="com.wl.pojo.User"/>
//  @Component 组件

@Component
@Scope("prototype")
public class User {

    // 相当于<property name="name" value="龍"/>
    @Value("龍")
    public String name;
}
