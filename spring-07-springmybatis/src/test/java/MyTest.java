import com.ljh.dto.User;
import com.ljh.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * @Author laijinhan
 * @date 2020/9/27 11:17 下午
 */


public class MyTest {
    @Test
    public void test() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = factory.openSession(true);
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        for (User user : mapper.selectAll()) {
//            System.out.println(user);
//        }
    }

    @Test
    public void testSpringMybatis() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mapper.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        for (User user : userMapper.selectAll()) {
            System.out.println(user);
        }
    }

    @Test
    public void testSpringMybatis2() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mapper.xml");
        UserMapper userMapper = context.getBean("userMapperImpl2", UserMapper.class);

        for (User user : userMapper.selectAll()) {
            System.out.println(user);
        }
    }
}
