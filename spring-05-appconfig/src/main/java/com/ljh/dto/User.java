package com.ljh.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author laijinhan
 * @date 2020/9/24 10:42 下午
 */
@Component //表明这个类被spring管理类，注册到类容器里面
@Data
public class User {
    @Value("赖金寒") //属性注入
    public   String name;
}
