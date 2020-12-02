package edu.nf.ch08.entity;

/**
 * @author 0.0
 * @date 2020/12/2
 */
public class Users {

    private Integer uid;
    private String userName;

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }
}