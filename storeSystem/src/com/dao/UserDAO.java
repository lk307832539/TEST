package com.dao;

import java.util.List;

import com.entity.User;

public interface UserDAO {
	// 增加用户
	public void addUser(User user);

	public List<User> getAllUser();

	public boolean delUser(Integer id);

	public User getUser(Integer id);

	public User getUserByUserName(String userName);

	public void updateUser(User user);

	public List<User> findByNamePwd(String userName, String password, int role);

}
