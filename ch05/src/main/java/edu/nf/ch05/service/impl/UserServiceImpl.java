package edu.nf.ch05.service.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.dao.impl.UserDaoImpl;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 0.0
 * @date 2020/12/1
 */
public class UserServiceImpl implements UserService {

    /**
     * 所有的实现类都是容器注入，完全的解耦，控制反转你不要来找我，我会把你要的一切都给你
     */
    private UserDao userdao;

    public UserServiceImpl() {
    }

    /**
     * 带参数的构造方法注入
     * @param userDao
     */
    public UserServiceImpl(UserDao userDao) {
        this.userdao = userDao;
    }


    /**
     * 提供一个set方法给Spring容器，这个方法就是注入的入口方法
     * 那么这个Spring就会调用这个方法，从容器中将一个UserDao实现类
     * 给注入进来，赋值给上面的接口
     *
     * @param dao
     */
    public void setDao(UserDao dao) {
        this.userdao = dao;
    }

    @Override
    public void add(Users users) {
        //调用接口的方法
        userdao.save(users);

    /*    //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中找到对应的UserDao的实现类
        UserDao dao = context.getBean("userDao",UserDao.class);
        dao.save(users);*/

        /*
        //丢到容器否则这样会高层依赖底层了
        UserDao dao = new UserDaoImpl();
        dao.save(users);*/
    }
}