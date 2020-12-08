package edu.nf.ch14.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author 0.0
 * @date 2020/12/7
 * 定义一个切面
 * 在这个类中声明需增强的业务逻辑
 * 在运行时将切面里面的增强逻辑运用到具体的目标对象上
 * （类似于回调处理器InvocationHandler）
 * 这个切面可以实现更多的接口来完不同的增强
 *
 * Advice（通知 / 增强）
 * MethodBeforeAdvice接口用于实现前置（通知/增强），在调用目标方法前执行的逻辑
 *
 * AfterReturningAdvice接口实现后置通知，在目标方法返回后执行的逻辑
 *
 * MethodInterceptor接口实现环绕通知，就是前面调用后面也调用，前后都要做那就直接环绕
 * 前后都调用，在目标前后都执行逻辑
 *
 * 环绕通知和前后通知的前后是没有顺序的，是反射来决定，但是肯定先执行这通知,
 * 如果方法中间有错误就不会执行后置通知和后面的环绕通知。
 *
 * ThrowsAdvice用于实现异常通知，在目标方法抛出异常后执行的逻辑
 */
public class UserServiceAspect implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {

    /**
     * 前置通知
     * @param method 当前目标对象正在调用的方法
     * @param args 目标方法所需的参数
     * @param target 目标对象（被代理的对象）
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     * （注意：如果产生了异常，则不会执行后置通知，因为没有正常返回是不会执行的）
     * @param returnValue 目标方法的返回值
     * @param method 目标对象正在调用的方法
     * @param args 目标方法的所需的参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置通知");
    }

    /**
     * 环绕通知，前后都调用，在目标前后都执行逻辑
     * @param methodInvocation 方法回调处理器，用于调用目标对象的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知前");
        //调用目标对象方法
        Object returnVal = methodInvocation.proceed();
        System.out.println("环绕通知后");
        return returnVal;
    }

    /**
     *异常通知，参照官服文档ThrowsAdvice
     * 该方法的名称必须叫做afterThrowing
     * 该方法还有三个可选参数（method,args,target）
     * 这三个参数要么全部声明要么全部省略
     * 但Exception e对象必须保留
     *
     * @param e 异常对象
     */
    public void afterThrowing(Exception e){
        System.out.println("异常通知："+ e);
    }
}