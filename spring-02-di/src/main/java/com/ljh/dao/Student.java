package com.ljh.dao;

import lombok.Data;

import java.security.Principal;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author laijinhan
 * @date 2020/9/24 3:20 下午
 */

@Data
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String> games;
    private  String wife;
    private Properties info;

}
