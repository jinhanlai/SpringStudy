package com.ljh.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author laijinhan
 * @date 2020/9/26 4:04 下午
 */

/**
 * 在每个方法前面加上日志功能
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     *
     * @param method 要执行的目标对象的方法
     * @param objects 参数
     * @param o 目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "执行了" + method.getName() + "方法");
    }
}
