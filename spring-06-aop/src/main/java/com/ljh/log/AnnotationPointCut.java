package com.ljh.log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author laijinhan
 * @date 2020/9/26 4:49 下午
 */


@Aspect // 标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.ljh.service.UserServiceImple.*(..))")
    public void before(){
        System.out.println("执行方法之前");
    }
    @After("execution(* com.ljh.service.UserServiceImple.*(..))")
    public void after(){
        System.out.println("执行方法之后");
    }

    // 在环绕方法中，我们可以定义一个参数，代表我们要获取处理的切入点
    @Around("execution(* com.ljh.service.UserServiceImple.*(..))")
    public void arround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕之前");

        Signature signature = jp.getSignature(); //获得签名
        System.out.println("签名为：" + signature);

        Object proceed = jp.proceed();

        System.out.println("环绕之后");


    }

}
