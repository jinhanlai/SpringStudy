# Spring全家桶的学习笔记
01-loc 讲的是ioc的使用
02-di 是几种依赖注入的实现方式
03-autowired讲的是自动注入
> 自动注入可以避免繁琐的xml配置，需要在xml文件中注册bean和开启注解的支持

04-annotation讲的是使用注解开发
> @Componet 相当于在xml容器中注册bean对象 ，但是要在xml文件中添加注解的支持，和扫描注解所在的包

05-appconfig 讲的是基于java的配置类实现spring的应用上下文
> 纯java代码的方式实现注入；@Configuration相当于bean.xml文件；@Bean就相当于bean标签

06-aop aop实现动态代理的三种方式：spring原生接口，自定义切面，使用注解
> 三种方式实现面向切面编程

07-springmybatis 整合springmybatis的两种方式；一种是bean实现sqlsessionfactory；一种是继承SqlSessionDaoSupport类


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
[spring-mybatis](http://mybatis.org/spring/zh/index.html)


