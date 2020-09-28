package com.ljh.mapper;

import com.ljh.dto.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author laijinhan
 * @date 2020/9/28 10:57 下午
 */


public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> select() {
        User user = new User(12, "王十二", "989898", true);
        insert(user);
        delete(12);
        return getSqlSession().getMapper(UserMapper.class).select();
    }

    public int insert(User user) {

        return getSqlSession().getMapper(UserMapper.class).insert(user);
    }

    public int delete(int id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
