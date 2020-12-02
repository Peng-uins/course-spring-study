package edu.nf.ch05.dao;

import edu.nf.ch05.entity.Users;

public interface UserDao {
    /**
     * 添加用户
     * @param users
     */
     void save(Users users);
}
