# Spring全家桶的学习笔记
01-loc 讲的是ioc的使用
02-di 是几种依赖注入的实现方式
03-autowired讲的是自动注入

## 1. 注解说明
@Autowired： 自动装配类型，名字；如果Autowired不能自动装配上属性，需要配合@Qualifier(value="..")
@Resource：通过name，type 自动装配，通过java来实现的
@Nullable：表示这个字段可以为null

## 2. 博客参考地址
[SpringIoC博客地址](http://ljh.gold/spring-ioc/)
## 参考文献
[spring的技术文档](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html)



