package edu.nfch05.test;

import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/1
 */
public class IocTest {

    @Test
    public void testContainer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.add(new Users(1,"user1"));

        //IOC是处理Bean和Bean的关系完成依赖注入，IOC本身就是一个工厂，有这两点才能是IOC容器
    }
}