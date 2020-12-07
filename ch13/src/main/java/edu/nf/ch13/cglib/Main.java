package edu.nf.ch13.cglib;

import net.sf.cglib.proxy.Enhancer;


/**
 * @author 0.0
 * @date 2020/12/7
 */
public class Main {

    public static void main(String[] args) {
        //创建一个增强器，用于创建代理实例
        Enhancer eh = new Enhancer();
        //设置父类，在运行动态创建子类的代理对象
        eh.setSuperclass(StuService.class);
        //设置方法拦截器
        eh.setCallback(new LogInterceptor());
        //创建代理
        StuService stuService = (StuService)eh.create();
        //调用子类代理对象
        stuService.add();
        stuService.update();
        stuService.delete();

    }
}