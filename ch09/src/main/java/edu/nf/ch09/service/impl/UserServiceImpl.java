package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 0.0
 * @date 2020/12/3
 */
//@Component("userService")
//可以使用service注解来标识业务层
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao Dao;

    /**
     * 注入dao
     */
    @Autowired
    public void setDao(UserDao userDao) {
        this.Dao = userDao;
    }

    @Override
    public void add() {
        System.out.println("执行users");
        Dao.save();
    }
}