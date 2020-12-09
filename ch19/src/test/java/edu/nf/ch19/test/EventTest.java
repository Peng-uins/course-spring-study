package edu.nf.ch19.test;

import edu.nf.ch19.demo1.MyEvent;
import edu.nf.ch19.demo1.MySource;
import edu.nf.ch19.demo2.DemoEvent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/9
 */
public class EventTest {

    @Test
    public void testEvent(){
        ApplicationContext context = new AnnotationConfigApplicationContext("edu.nf.ch19.demo1");
        //创建事件源
        MySource source = new MySource("Hello spring");
        //创建事件对象
        MyEvent myEvent = new MyEvent(source);
        //向容器发布事件
        context.publishEvent(myEvent);
    }

    @Test
    public void testEvent2(){
        ApplicationContext context = new AnnotationConfigApplicationContext("edu.nf.ch19.demo2");
        context.publishEvent(new DemoEvent("dsa"));
    }
}