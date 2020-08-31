package com.wl.mapper;

import com.wl.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Author: wl
 * @Date: 2020/6/21 22:49
 */
public class UserMapperImpl implements UserMapper {

    //我们的所有操作，在原来都使用SqlSession来执行，现在都使用SqlSessionTemplate;
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
