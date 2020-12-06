package edu.nf.ch11.service.impl;

import edu.nf.ch11.dao.UserDao;
import edu.nf.ch11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 0.0
 * @date 2020/12/4
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     *  required必须，true必须注入，false可以不注入
     *  @Autowired的required属性是否必须注入，默认值为true表示必须注入
     *  如果没有注入则引发异常，false表示允许为null
     */
    //@Autowired(required = false)
    @Autowired
    private UserDao dao;

    @Override
    public void save() {
        dao.add();
    }
}