package com.wang.sprintMbtaits;

import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName UserMapperImpl
 * Description
 * @Author jqWang
 * Date 2021/11/22 13:37
 **/
public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }
    @Override
    public List<User> selectUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectUser();
    }
}
