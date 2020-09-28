package com.ljh.dto;

import lombok.Data;

/**
 * @Author laijinhan
 * @date 2020/9/27 11:07 下午
 */

@Data
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private boolean enabled;
}
