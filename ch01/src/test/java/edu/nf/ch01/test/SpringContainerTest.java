package edu.nf.ch01.test;

import edu.nf.ch01.People;
import edu.nf.ch01.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/11/30
 *
 * 在Spring框架中工厂分为两种：
 * 一种是BeanFactory,另一种是ApplicationContext
 * 简单点说，BeanFactory是Spring最基础的bean工厂
 * 而ApplicationContext针对BeanFactory做了很多的功能扩展何增强
 * 官方也推荐我们使用ApplicationContext这个接口来操作Spring容器
 */
public class SpringContainerTest {

    @Test
    public void testGetBean(){
        //初始化spring容器(也就是一个容器工厂)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取bean对象
        //Users users = (Users)context.getBean("user");
        //使用泛型来获取
        Users users = context.getBean("user",Users.class);
        People people = context.getBean("people",People.class);
        users.say();
        people.run();
    }


    /**
     * 自定义工厂，用的少
     */
    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Users user = context.getBean("user1",Users.class);
        user.say();
    }
}