package edu.nf.ch06;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 0.0
 * @date 2020/12/2
 */
public class Users {

    private String userName;
    private Integer age;
    private List<String> address;
    private Map<String,String> cord;
    private Properties prop;

    public Users() {
    }

    public Users(String userName, Integer age, List<String> address, Map<String, String> cord, Properties prop) {
        this.userName = userName;
        this.age = age;
        this.address = address;
        this.cord = cord;
        this.prop = prop;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setCord(Map<String, String> cord) {
        this.cord = cord;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getAddress() {
        return address;
    }

    public Map<String, String> getCord() {
        return cord;
    }

    public Properties getProp() {
        return prop;
    }
}