package edu.nf.ch18.test;

import edu.nf.ch18.config.SpringConfig;
import edu.nf.ch18.service.StuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/9
 */
public class SpringTest {

    @Test
    public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean("stuService", StuService.class).save("ads");
    }
}