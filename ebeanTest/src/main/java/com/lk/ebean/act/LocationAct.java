package com.lk.ebean.act;

import com.lk.ebean.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/*
 * Created by LK on 9/14/2018.
 */
@Controller
@RequestMapping("/location")
public class LocationAct {
    @Resource
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public Object list() {
        return userService.findAll();
    }
}
