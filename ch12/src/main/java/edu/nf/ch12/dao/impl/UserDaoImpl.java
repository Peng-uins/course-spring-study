package edu.nf.ch12.dao.impl;

import edu.nf.ch12.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 0.0
 * @date 2020/12/4
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("add添加");
    }
    public void init(){
        System.out.println("执行dao的init方法");
    }

    public void destroy(){
        System.out.println("执行dao的destroy方法");
    }
}