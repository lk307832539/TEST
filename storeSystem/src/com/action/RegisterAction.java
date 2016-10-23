package com.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserMng;

@Controller("registerAction")
@Scope("prototype")
public class RegisterAction extends ActionSupport {

    @Resource
    private UserMng userMng;
    private int id;
    private int role;
    private String userName;
    private String password;
    private String repeatpassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getRepeatpassword() {
        return repeatpassword;
    }


    public void setRepeatpassword(String repeatpassword) {
        this.repeatpassword = repeatpassword;
    }


    public String execute() {
        System.out.println(userName + "," + password);
        if (userName.equals("")) {
            this.addFieldError("userName", "请输入用户名!");
            return "fail";
        } else if (password.equals("")) {
            this.addFieldError("password", "请输入密码!");
            return "fail";
        } else if (userMng.getUserByUserName(userName) != null) {
            this.addFieldError("userName", "用户名已存在!");
            return "fail";
        } else if (password.length() < 6 || password.length() > 12) {
            this.addFieldError("password", password);
            return "fail";
        } else if (!password.equals(repeatpassword)) {
            this.addFieldError("repeatpassword", "密码不一致!");
            return "fail";
        } else {
            System.out.println("add");
            userMng.addUser(userName, password, 0);
            return "success";
        }
    }
}


  