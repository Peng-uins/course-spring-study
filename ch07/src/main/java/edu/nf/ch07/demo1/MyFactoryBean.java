package edu.nf.ch07.demo1;

import edu.nf.ch07.demo1.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 0.0
 * @date 2020/12/2
 * 自定义FactoryBean，用于创建自定义对象
 * 需要指定泛型,本身就是一个工厂，这个提供了一个标准
 */
public class MyFactoryBean implements FactoryBean<UserService> {


    /**
     * @return
     * @throws Exception
     * 返回的是具体的某个实现类的bean
     * Spring容器回调用FactoryBean的getObject方法，将返回的对象自动纳入IOC容器中
     */
    @Override
    public UserService getObject() throws Exception {
        return new UserServiceImpl();
    }


    /**
     * 返回的是Bean的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return UserServiceImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}