package com.lk.controller;

import com.lk.entity.User;
import com.lk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 9/14/2018.
 */
@Controller
public class UserAct {
    @Resource
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public Object list() {
        return userService.findAll();
    }
}
