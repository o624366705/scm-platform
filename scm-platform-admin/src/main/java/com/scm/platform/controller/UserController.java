package com.scm.platform.controller;

import com.scm.platform.entity.User;
import com.scm.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dingc
 * @date 2017/9/11.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public List<User> get(@PathVariable("id") Integer id) {
        List<User> users = this.userService.selectAll();
        return users;
    }


}
