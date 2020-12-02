package edu.nf.ch08.factorybean;

import edu.nf.ch08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 0.0
 * @date 2020/12/2
 * 通过自定义FactoryBean来创建mybatis的mapper接口代理对象
 * 这里的T标识任意Dao接口的类型
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    /**
     * 由于JDK动态的代理创建代理对象时需要传入一个接口
     * 而这个接口可以通过set的接口注入进来
     */
    private Class<T> daoInterface;

    /**
     * 提供一个set方法注入一个Dao的接口Class对象
     * @param daoInterface
     */
    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    /**
     * 当IOC容器调用getObject方法时，返回的是sqlSession的getMapper
     * 的代理对象，这个代理对象就可以纳入容器中管理
     * @return
     * @throws Exception
     */
    @Override
    public T getObject() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //这里的T类似于obj但是这里是接口不是数据类型所以写T
        //daoInterface就是某个Dao接口的Class对象，使用的人传入进来的
        T mapperProxy = sqlSession.getMapper(daoInterface);
        return mapperProxy;
    }

    @Override
    public Class<?> getObjectType() {
        return daoInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}