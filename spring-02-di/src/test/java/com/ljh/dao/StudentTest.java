package com.ljh.dao;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author laijinhan
 * @date 2020/9/24 3:25 下午
 */


public class StudentTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("获取name属性的依赖注入："+student.getName());
        System.out.println("获取bean | ref | idref | list | set | map | props | value | null 的注入方法");
        System.out.println(student.toString());
    }

    @Test
    public  void testP_namespace(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println("测试p-注入");
        System.out.println(user.toString());
    }

    @Test
    public  void testC_namespace(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user1", User.class);
        System.out.println("测试c-注入");
        System.out.println(user.toString());
    }


}
