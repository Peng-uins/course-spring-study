package edu.nf.ch16.test;

import edu.nf.ch16.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/8
 */
public class SpringTest {

    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("userService", UserService.class);
        //这个拿到的是一个数组，在前置通知或者其他调用通知的方法上循环获取或者指定
        service.add("user1");
    }
}