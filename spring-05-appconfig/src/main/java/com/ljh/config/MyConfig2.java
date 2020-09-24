package com.ljh.config;

import com.ljh.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author laijinhan
 * @date 2020/9/24 11:07 下午
 */


public class MyConfig2 {
    @Bean
    public User getUser(){
        return new User();
    }
}
