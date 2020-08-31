package com.wl.mapper;

import com.wl.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author: wl
 * @Date: 2020/6/21 22:49
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectUser() {

        User user = new User(7, "小美", "666667");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(7);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
