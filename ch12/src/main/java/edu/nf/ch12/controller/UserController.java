package edu.nf.ch12.controller;

import edu.nf.ch12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 0.0
 * @date 2020/12/4
 */

public class UserController {


    private UserService service;

    public void setService(UserService service) {
        this.service = service;
    }

    public void add(){
        service.save();;
    }
}