package edu.nf.ch17.test;

import edu.nf.ch17.service.StuService;
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
        StuService stuService = context.getBean("stuService", StuService.class);
        stuService.save("ddd");
    }
}