package edu.nf.ch19.demo1;

import org.springframework.context.ApplicationEvent;

/**
 * @author 0.0
 * @date 2020/12/9
 * 自定义事件对象,继承ApplicationEvent
 */
public class MyEvent extends ApplicationEvent {

    /**
     *
     * @param source 事件源(谁触发的)
     */
    public MyEvent(Object source) {

        super(source);

    }
}