package com.ljh.impl;

import com.ljh.dto.User;
import com.ljh.mapper.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Author laijinhan
 * @date 2020/9/27 11:47 下午
 */


public class UserMapperImpl implements UserMapper {
    // 原来在，mybatis 里面所有操作都是使用sqlsession来操作，但是现在要使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
//    public SqlSessionTemplate getSqlSession(){
//        return this.sqlSession;
//    }

    public List<User> selectAll() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        return users;
    }
}
