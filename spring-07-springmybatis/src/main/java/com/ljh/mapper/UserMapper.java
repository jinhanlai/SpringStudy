package com.ljh.mapper;

import com.ljh.dto.User;
import lombok.Data;

import java.util.List;

/**
 * @Author laijinhan
 * @date 2020/9/27 11:09 下午
 */


public interface UserMapper {
    public List<User> selectAll();
}
