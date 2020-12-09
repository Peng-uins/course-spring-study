package edu.nf.ch21.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * @author 0.0
 * @date 2020/12/9
 * 配置类
 * @EnableScheduling 启用定时任务的注解处理器
 *
 * 可以通过实现 SchedulingConfigurer 接口来配欸子线程池
 */
@Configuration
@ComponentScan(basePackages = "edu.nf.ch21")
@EnableScheduling
public class AppConfig implements SchedulingConfigurer {

    /**
     * 装配一个定时任务线程池
     *
     * shutdown 释放线程池
     * @return
     */
    @Bean(destroyMethod = "shutdown")
    public ThreadPoolTaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler poolTaskScheduler = new ThreadPoolTaskScheduler();
        //设置线程池大小
        poolTaskScheduler.setPoolSize(2);
        //设置线程名称前缀，可以写中文
        poolTaskScheduler.setThreadNamePrefix("任务线程-");
        return poolTaskScheduler;
    }


    /**
     *配置定时任务，设置线程池
     *
     * @param scheduledTaskRegistrar
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
       //注册定时线程池
       scheduledTaskRegistrar.setScheduler(taskScheduler());
    }
}