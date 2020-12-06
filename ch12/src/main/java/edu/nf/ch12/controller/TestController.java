package edu.nf.ch12.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * @author 0.0
 * @date 2020/12/4
 */
@Controller
//使用配置类同样可以进行扫描,这时就是扫描的Bean
//和配置类使用的@bean注解配置的bean一同纳入IOC容器中
//就是可以和自定义的配置文件一起使用不冲突
@ComponentScan(basePackages = "edu.nf.ch12")
public class TestController {
    public void test(){
        System.out.println("Hello world");
    }
}