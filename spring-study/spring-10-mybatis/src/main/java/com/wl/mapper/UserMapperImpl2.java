package com.wl.mapper;

import com.wl.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author: wl
 * @Date: 2020/6/21 23:15
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
