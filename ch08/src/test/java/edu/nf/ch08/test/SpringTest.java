package edu.nf.ch08.test;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import edu.nf.ch08.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 0.0
 * @date 2020/12/2
 */
public class SpringTest {

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao dao = context.getBean("userDao",UserDao.class);
        List<Users> list =  dao.listUser();
        list.forEach(u-> System.out.println(u.getUserName()));
    }
}