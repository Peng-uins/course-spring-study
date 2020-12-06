package edu.nf.ch11.dao.impl;

import edu.nf.ch11.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 0.0
 * @date 2020/12/4
 * 持久层@Repository
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("add添加");
    }
}