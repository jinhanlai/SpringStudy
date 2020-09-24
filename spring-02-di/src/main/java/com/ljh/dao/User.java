package com.ljh.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author laijinhan
 * @date 2020/9/24 3:46 下午
 */


@Data
public class User {
    private String name;
    private int age;

    User(int age){
        this.age=age;
    }

    public User() {

    }
}
