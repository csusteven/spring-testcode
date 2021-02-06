package cn.huarui.domain.test;

import cn.huarui.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("application.xml");
        User user = (User)applicationContext.getBean(User.class);
        user.say();
    }
}
