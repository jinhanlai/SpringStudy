package test;

import com.ljh.dto.User;
import com.ljh.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author laijinhan
 * @date 2020/9/28 11:04 下午
 */


public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean(UserMapper.class);

        /**
         * 声明了事务，select里面的步骤要么都做要么都不做；用声明式事务，使用配置来完成，不用修改代码
         */
        for (User user : mapper.select()) {
            System.out.println(user);
        }

    }
}
