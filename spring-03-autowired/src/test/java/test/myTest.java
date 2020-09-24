package test;

import com.ljh.dto.People;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author laijinhan
 * @date 2020/9/24 4:58 下午
 */


public class myTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().show();
        people.getDog().show();
        System.out.println(people.getName());

    }

}
