package edu.nf.ch09.controller;

import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author 0.0
 * @date 2020/12/3
 *使用@Component注解标识类，表示为容器受管的Bean
 * value属性用于指定Bean的id，如果不指定，默认就是类名
 * 将首字母变为小写后作为id
 */
//@Component("controller")
//从3.0后开始，每个层都有对应的注解来标识，作用和@Component注解时一样的，这样标识起来更加明确
@Controller("controller")
//@Scope注解用于指定Bean的作用域，作用域和xml中的一致
@Scope("prototype")
public class UserController {

    /**
     * 字段注入
     */
    @Autowired
    //通过@Qualifier强制指定Bean的id
    //@Qualifier("stuService")
    private UserService Service;


    /**
     * 构造方法注入
     * @param service
     */
    /*@Autowired
    public UserController(UserService service) {
        Service = service;
    }*/

    /**
     * 注入Service对象
     * @param userService
     * @Autowired注解用于完成注入配置，可以标识在set方法上，构造方法上，字段上。
     * 注意：当实现类只要一个的时候，Spring会自动找到它并直接注入进来
     * 如果有多个实现类的时候就必须结合@Qualifier注解一起使用，
     * 这个注解的作用是指定要注入哪一个实现类
     */
   /* @Autowired
    public void setService(UserService userService) {
        this.Service = userService;
    }*/

    public void add(){
        Service.add();
    }
}