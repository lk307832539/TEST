package com.service;

import java.util.List;

import com.entity.User;

public abstract interface UserMng {
	public abstract User addUser(User user);

	public abstract List<User> getAllUser();

	public abstract User delUser(Integer id);

	public abstract User getUser(Integer id);

	public abstract User getUserByUserName(String userName);

	public abstract User updateUser(User user);

	public abstract User getUser(String userName, String password, int role);

}
