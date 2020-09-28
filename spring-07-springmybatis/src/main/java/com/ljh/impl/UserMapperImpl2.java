package com.ljh.impl;

import com.ljh.dto.User;
import com.ljh.mapper.UserMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author laijinhan
 * @date 2020/9/28 1:42 下午
 */


public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper  {

    public List<User> selectAll() {
        return getSqlSession().getMapper(UserMapper.class).selectAll();
    }
}
