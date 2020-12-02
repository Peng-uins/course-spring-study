package edu.nf.ch08.service.impl;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import edu.nf.ch08.service.UserService;

import java.util.List;

/**
 * @author 0.0
 * @date 2020/12/2
 */
public class UserServiceImpl implements UserService {

    /**
     * 注入Dao
     * @return
     */
    private UserDao userDao;

    /**
     * set的方法注入一个Dao的实现类
     * 注意：此时出入的就是mapperProxy代理对象
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Users> listUser() {
        return userDao.listUser();
    }
}