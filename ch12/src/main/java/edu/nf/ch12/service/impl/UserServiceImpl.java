package edu.nf.ch12.service.impl;

import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 0.0
 * @date 2020/12/4
 */

public class UserServiceImpl implements UserService {

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void save() {
        System.out.println("执行user的impl");
        dao.add();
    }

    public void init(){
        System.out.println("执行service的init方法");
    }

    public void destroy(){
        System.out.println("执行service的destroy方法");
    }
}