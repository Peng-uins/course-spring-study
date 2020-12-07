package edu.nf.ch13.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;

/**
 * @author 0.0
 * @date 2020/12/7
 */
public class LogInterceptor implements MethodInterceptor {

    /**
     *
     * @param proxy 运行时创建的代理对象
     * @param method 当前目标对象正在调用的方法
     * @param args 目标对象方法所需要的参数
     * @param methodProxy 代理方法，目标方法的代理对象（也就是生成子类中的方法）
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //调用目标对象的方法（也就是父类的方法）
        Object returnVal = methodProxy.invokeSuper(proxy,args);
        //执行日志记录操作
        log();
        return returnVal;
    }

    private void log(){
        System.out.println("记录日志的操作。。。。");
    }
}