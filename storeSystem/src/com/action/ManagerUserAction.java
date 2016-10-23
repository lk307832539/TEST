package com.action;

import com.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserMng;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller("managerUserAction")
@Scope("prototype")
public class ManagerUserAction extends ActionSupport {
    @Resource
    private UserMng userMng;

    private String userName;
    private String password;
    private int role;
    private int userId;


    public ManagerUserAction(String userName, String password, int role, int id) {
        super();
        this.userName = userName;
        this.password = password;
    }

    public ManagerUserAction() {
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String addUser() {
        boolean adduser = userMng.addUser(userName, password, role);
        if (adduser == true) {
            return "success";
        } else {
            return "fail";
        }
    }

    public String getAllUser() {
        List<User> userList = userMng.getAllUser();
        ActionContext actionContext = ActionContext.getContext();
        //Map<String, Object> request = (Map) actionContext.get("request");
        actionContext.put("userList", userList);
        return "success";
    }

    public String updateUser() {
        String message = userMng.updateUser(userId, userName, password);

        HttpServletRequest request = ServletActionContext.getRequest();
        return "success";
    }

    public String delUser() {
        boolean deluser = userMng.delUser(userId);
        if (deluser == true) {
            return "success";
        } else {
            return "fail";
        }
    }

    public String updateUserInfo(){
        User user = this.userMng.getUser(userId);
        ActionContext actionContext = ActionContext.getContext();
        actionContext.put("user", user);
        return "success";
    }


}
