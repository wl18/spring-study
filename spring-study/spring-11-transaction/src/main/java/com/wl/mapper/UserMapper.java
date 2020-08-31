package com.wl.mapper;

import com.wl.pojo.User;

import java.util.List;

/**
 * @Author: wl
 * @Date: 2020/6/21 22:00
 */
public interface UserMapper {
    public List<User> selectUser();

    //添加一个用户
    public int addUser(User user);

    //通过id删除一个用户
    public int deleteUser(int id);
}
