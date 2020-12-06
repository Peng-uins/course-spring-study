package edu.nf.ch11.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 0.0
 * @date 2020/12/4
 * 自定义配置类，用于取代xml配置文件
 * 配置类必须使用@Configurable注解来标注
 * @Configurable把类设置成配置类
 * @ComponentScan(basePackages = "edu.nf.ch11")这个是指定扫描的的包，可以指定多个
 * @ComponentScan(basePackages = "{edu.nf.ch11，edu.nf.ch10}")不常用
 */
@Configurable
/**
 * @ComponentScan注解用于扫描指定的包
 * basePackages属性可以指定多个包的路径
 */
@ComponentScan(basePackages = "edu.nf.ch11")
public class SpringConfig {


}