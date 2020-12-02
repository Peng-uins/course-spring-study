package edu.nf.ch04.test;

import edu.nf.ch04.People;
import edu.nf.ch04.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/1
 */
public class SpringTest {


    @Test
    public void testLife(){
        //接口没有定义释放接口的行为
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //context.getBean("user", Users.class).say();
        //在实现类值会提供一个close方法用于关闭容器，因此关闭容器前
        //都会执行所有的Bean的destroy方法
        //子类转父类调用close方法关闭
        ((ClassPathXmlApplicationContext)context).close();

    }
}