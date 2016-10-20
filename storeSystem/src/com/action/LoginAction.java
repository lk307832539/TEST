package com.action;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.UserMng;
import com.service.impl.UserMngImpl;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.opensymphony.xwork2.ActionSupport;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {
    @Resource
    private UserMng userMng;

    private String userName;
    private String password;
    private int role;


    public LoginAction(String userName, String password, int role) {
        super();
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public LoginAction() {
        super();
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String execute() {
        System.out.println(userName + "," + password + "," + role);
        if (userName.equals("")) {
            this.addFieldError("userName", "请输入用户名!");
            return "fail";
        } else if (password.equals("")) {
            this.addFieldError("password", "请输入密码!");
            return "fail";
        }

        boolean login = userMng.login(userName, password, role);
        if (login) {
            ServletActionContext.getRequest().getSession()
                    .setAttribute("userName", userName);
            ServletActionContext.getRequest().getSession()
                    .setAttribute("password", password);// 将值存放到session中
            if (role == 0) {
                return "success";
            } else {
                return "success";
            }
        } else {
            this.addFieldError("userName", "用户名或者密码不正确!");
            return "fail";
        }
    }

}
