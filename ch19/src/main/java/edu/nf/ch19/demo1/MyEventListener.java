package edu.nf.ch19.demo1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author 0.0
 * @date 2020/12/9
 * 自定义事件监听器，实现ApplicationListener
 * 监听自定义事件对象
 *  ApplicationListener<MyEvent>
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

    /**
     * 当向容器发布一个事件的时候，会被此监听器监听到
     * 容器就会调用onApplicationEvent方法并传入事件对象
     * @param myEvent
     */
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        //可以从事件对象中获取事件源
        Object source = myEvent.getSource();
        MySource mySource = (MySource) source;
        System.out.println("处理消息：" + mySource.getMessage());
    }
}