package test;

import com.ljh.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author laijinhan
 * @date 2020/9/26 4:17 下午
 */


public class MyTest {
    @Test
    public  void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        // 动态代理接口
        UserService usersvice = context.getBean("usersvice", UserService.class);
        usersvice.delete();
    }
}
