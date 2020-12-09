package edu.nd.ch20;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/9
 */
public class test {

    @Test
    public void testTask(){
        //容器创建后就会立即执行定时任务
        ApplicationContext context = new ClassPathXmlApplicationContext("a.xml");
        while (true);
    }
}