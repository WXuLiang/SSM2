package com.controller;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Created  by wxl on 2018/1/25 0025.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUserBeans")
    public String findUserBeans(){
        userService.findUserBeans();
        return "success";
    }
}
