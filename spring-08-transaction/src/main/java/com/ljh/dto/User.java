package com.ljh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author laijinhan
 * @date 2020/9/27 11:07 下午
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private boolean enabled;
}
