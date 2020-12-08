package edu.nf.ch15.test;

import edu.nf.ch15.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/8
 */
public class AopTest {

    @Test
    public void testAio(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("userService",UserService.class);
        service.add();
        service.update();
    }
}