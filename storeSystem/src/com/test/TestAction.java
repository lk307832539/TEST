package com.test;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserMng;

import java.util.List;

@Controller("testAction")
@Scope("prototype")
public class TestAction extends ActionSupport {
    @Resource
    private UserMng userMng;
    @Override
    public String execute() throws Exception {
        List<User> list = userMng.getAllUser();
        return this.SUCCESS;
    }
}
