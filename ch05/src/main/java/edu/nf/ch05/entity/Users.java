package edu.nf.ch05.entity;

/**
 * @author 0.0
 * @date 2020/12/1
 */
public class Users {
    private Integer id;
    private String name;

    public Users() {
    }

    public Users(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}