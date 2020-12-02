package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Users;

import java.util.List;

public interface UserDao {

    /**
     * 查询用户
     * @return
     */
    List<Users> listUser();
}
