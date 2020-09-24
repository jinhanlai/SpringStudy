package com.ljh.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author laijinhan
 * @date 2020/9/24 10:16 下午
 */

// Component 等价于 <bean id="user" class="com.ljh.dto.User"/>
@Component
public class User {
    // 相当于在bean里面 注入属性值。
    @Value("赖金寒")
    public String name;
}
