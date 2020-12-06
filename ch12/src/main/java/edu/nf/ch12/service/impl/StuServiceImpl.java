package edu.nf.ch12.service.impl;

import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.service.UserService;

/**
 * @author 0.0
 * @date 2020/12/4
 */
public class StuServiceImpl implements UserService {

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void save() {
        System.out.println("执行stu的impl");
        dao.add();
    }
}