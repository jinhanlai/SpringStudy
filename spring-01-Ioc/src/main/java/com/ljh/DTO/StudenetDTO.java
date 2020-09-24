package com.ljh.DTO;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * @Author laijinhan
 * @date 2020/9/23 11:23 下午
 */


public class StudenetDTO {
    private int id;
    private String name;
    StudenetDTO(){
        System.out.println("无参构造器创建对象成功");
    }
    StudenetDTO(String name){
        System.out.println("有参构造器创建对象成功");
    }

    public void  print(){
        System.out.println("name:张三");

    }
    public String getName(){
        return this.name;
    }
}
