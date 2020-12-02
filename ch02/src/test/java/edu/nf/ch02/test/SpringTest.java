package edu.nf.ch02.test;

import edu.nf.ch02.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/11/30
 */
public class SpringTest {

    @Test
    public void testGetBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people =  context.getBean("people", People.class);
        People people1 = context.getBean("people", People.class);
        System.out.println(people);
        System.out.println(people1);
    }
}