package edu.nf.ch21.test;

import edu.nf.ch21.config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/9
 */
public class SpringTest {

    @Test
    public void a(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        while (true);
    }
}