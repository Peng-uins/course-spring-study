package edu.nf.ch03.test;

import edu.nf.ch03.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/11/30
 */
public class SpringTest {

    @Test
    public void testIdAndName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //根据id获取bean实例
        People people = context.getBean("people", People.class);
        People people1 = context.getBean("p1",People.class);
        People people2 = context.getBean("p2",People.class);
        System.out.println(people);
        System.out.println(people1);
        System.out.println(people2);

    }
}