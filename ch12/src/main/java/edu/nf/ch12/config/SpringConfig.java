package edu.nf.ch12.config;

import edu.nf.ch12.controller.UserController;
import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.dao.impl.UserDaoImpl;
import edu.nf.ch12.service.UserService;
import edu.nf.ch12.service.impl.StuServiceImpl;
import edu.nf.ch12.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

/**
 * @author 0.0
 * @date 2020/12/4
 * @ComponentScan有注解才扫描
 */
@Configurable
public class SpringConfig {
    /**
     * 使用@Bean注解来装配
     * 方法名默认为bean的id，也可以通过name属性重新自定义
     * 这里报错是正确的，看dao接口有没有，运行时候才会有，方法写实现类就不会爆红但是不推荐
     */
    @Bean(name = "dao",initMethod = "init",destroyMethod = "destroy")
    //同@Scope注解来设置作用域
    //@Scope("singleton")
    //@Primary也可以标注在方法上，表示优先注入这个bean
    //@Primary
    public UserDao userDao(){
        return new UserDaoImpl();
    }

    /**
     * 传进来的参数是容器调用的，全部都上传到容器在容器调用方法的时候，会根据名字找到对应Bean传入的方法
     * 添加到调用的方法
     * @param userDao
     * @return
     */
    @Bean
    public UserService userService(UserDao userDao){
        UserServiceImpl service = new UserServiceImpl();
        //手动调用set方法注入
        //方式一：调用userDao方法获取dao的bean进行注入
        //service.setDao(userDao());
        //方式二：通过传进来的参数来注入
        service.setDao(userDao);
        return service;
    }

    /**
     * 装配StuService
     * @return
     */
    @Bean
    public UserService stuService(){
        StuServiceImpl stuService = new StuServiceImpl();
        //注入userDao()
        stuService.setDao(userDao());
        return stuService;
    }

    /**
     * 装配Controller
     * 当有多个实现类时会先根据参数的变量名称作为id到容器中查找
     * 如果找到则直接掺入经来注入，找不到则引发异常，
     * 因此可以结合@Qualifier
     * @Qualifier注解，标识在参数上
     * @return
     */
    @Bean
    public UserController userController(@Qualifier("stuService") UserService service){
        UserController controller = new UserController();
        //注入UserController,这里报错是因为userDao在运行才有的
        //controller.setService(userService(userDao()));
        controller.setService(service);
        return controller;
    }

}