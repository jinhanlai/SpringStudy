package test;

import com.ljh.config.MyConfig;
import com.ljh.dto.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author laijinhan
 * @date 2020/9/24 11:00 下午
 */


public class myTest {
    @Test
    public void  test(){
        // 完全使用配置的方式去做，只能通过AnnotationConfig上下文来获取bean容器，通过配置的class对象加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("getName", User.class);
        System.out.println(user.getName());

    }
}
