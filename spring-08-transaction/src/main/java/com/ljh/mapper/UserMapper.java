package com.ljh.mapper;

import com.ljh.dto.User;

import java.util.List;

/**
 * @Author laijinhan
 * @date 2020/9/27 11:09 下午
 */


public interface UserMapper {
    public List<User> select();
    public int insert(User user);
    public int delete(int id);
}
