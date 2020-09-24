package com.ljh.config;

import com.ljh.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author laijinhan
 * @date 2020/9/24 10:58 下午
 */

// 这个会被spring容器管理，因为本身就是一个@Component
@Configuration //表示这是一个配置类，类似于之前的beans.xml
@ComponentScan("com.ljh.dto")
@Import(MyConfig2.class) //表示导入另外一个配置类
public class MyConfig {

    // 注册一个Bean，相当于之前的xml配置文件里面bean标签
    // 方法名就是 bean标签中的id
    // 返回值就是 bean标签中的class属性
    @Bean
    public User getName(){
        return new User(); //返回要注入到bean的对象
    }
}
