package edu.nf.ch16.service.impl;

import edu.nf.ch16.service.UserService;

/**
 * @author 0.0
 * @date 2020/12/8
 */
public class UserServiceImpl implements UserService {

    @Override
    public String add(String name) {
        System.out.println("添加用户:" + name);
        return "success";
    }
}