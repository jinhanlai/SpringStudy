package com.ljh.log;

/**
 * @Author laijinhan
 * @date 2020/9/26 4:33 下午
 */


public class DivPointCut {
    public void before(){
        System.out.println("执行方法之前");
    }
    public void after(){
        System.out.println("执行方法之后");
    }
}
