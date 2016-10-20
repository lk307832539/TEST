package com.service;

import java.util.List;

import com.entity.User;

public abstract interface UserMng {

    public boolean addUser(String userName, String password, int role);

    public boolean login(String userName, String password, int role);

    public String updateUser(int id, String userName, String password);

    public List<User> getAllUser();

    public boolean delUser(int id);
}
