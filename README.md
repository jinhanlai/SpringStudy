# Spring全家桶的学习笔记
01-loc 讲的是ioc的使用
02-di 是几种依赖注入的实现方式
03-autowired讲的是自动注入
04-annotation讲的是使用注解开发


## 1. 注解说明
@Autowired： 自动装配类型，名字；如果Autowired不能自动装配上属性，需要配合@Qualifier(value="..")
@Resource：通过name，type 自动装配，通过java来实现的
@Nullable：表示这个字段可以为null

@Componet: 组件，放在类上面，表明这个类被spring管理类，就是Bean
@Repository： 跟Componet一样，只是用于`dto层`
@Service: 跟Componet一样，只是用于`service层`
@Controller: 跟Componet一样，只是用于`controller层`
> Spring MVC 模式；这四个注解都是一样的，都是把某一个类注册到spring容器中，装配Bean
> 使用xml配置更加万能，适用于任何场所；使用注解配置相对简单，但是不是自己类使用不了，维护相对复杂
> 最佳配合：xml用来配置bean，注解用来配置属性。

@Configuration：纯java的方式实现bean，类似于之前的beans.xml
@Import：表示导入另外一个配置类
@Bean: 相当于之前的xml配置文件里面bean标签

## 2. 博客参考地址
[SpringIoC博客地址](http://ljh.gold/spring-ioc/)
## 参考文献
[spring的技术文档](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html)



