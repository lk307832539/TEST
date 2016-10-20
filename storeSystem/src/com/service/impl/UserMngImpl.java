package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.entity.User;
import com.service.UserMng;


@Service
public class UserMngImpl implements UserMng {

    @Resource
    private UserDAO userDao;

    @Override
    public boolean addUser(String userName, String password, int role) {
        User user = userDao.getUserByUserName(userName);
        if (user == null) {
            user.setUsername(userName);
            user.setPassword(password);
            user.setRole(role);
            userDao.addUser(user);
            return true;
        }
        return false;
    }

    @Override
    public String updateUser(int id, String userName, String password) {

        String message = "";
        if (userName == null || userName == "") {
            message = "用户名不能为空";
        } else if (password == null || password == "") {
            message = "密码不能为空";
        } else {
            User user = userDao.getUser(id);
            user.setUsername(userName);
            user.setPassword(password);
            this.userDao.updateUser(user);
            message = "修改成功";
        }
        return message;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = userDao.getAllUser();
        return userList;
    }

    @Override
    public boolean login(String userName, String password, int role) {
        List<User> list = userDao.findByNamePwd(userName, password, role);
        if (list.size() != 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean delUser(int id) {
        User user = userDao.getUser(id);
        if (user != null) {
            this.userDao.delUser(id);
            return true;
        }
        return false;
    }

}
