package com.ljh.DTO;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author laijinhan
 * @date 2020/9/23 11:36 下午
 */


public class StudentTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("配置文件中加载的时候，容器内(Bean)管理的对象就已经初始化了，而且只会存在一个副本");
        StudenetDTO student = (StudenetDTO)context.getBean("student");
        student.print();
        System.out.println(student.getName());

        StudenetDTO student1 = (StudenetDTO)context.getBean("student");
        System.out.println("两个对象是否相等");
        System.out.println(student==student1);


    }
}
