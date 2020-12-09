package edu.nf.ch18.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author 0.0
 * @date 2020/12/9
 * @EnableAspectJAutoProxy 启用注解处理器，同于xml中的<aop:aspectj-autoproxy/>
 * @EnableAspectJAutoProxy(proxyTargetClass = true) 是否强制使用cglib动态代理
 *
 * java配置取代xml核心
 */
@Configurable
@ComponentScan(basePackages = "edu.nf.ch18")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}