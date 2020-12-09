package edu.nf.ch19.demo2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author 0.0
 * @date 2020/12/9
 * 自定义一个监听器
 */
@Component
public class DemoEventListener {

    /**
     * 监听处理方法
     * @param event
     *@EventListener 标注当前方法为一个事件监听器处理方法
     */
    @EventListener
    public void handleEvent(DemoEvent event){
        System.out.println("处理消息:" + event.getMessage());
    }

}