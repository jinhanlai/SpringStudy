package com.ljh.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author laijinhan
 * @date 2020/9/24 4:52 下午
 */

@Data
public class People {
    @Autowired
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog11")
    private Dog dog;
    private String name;
}
