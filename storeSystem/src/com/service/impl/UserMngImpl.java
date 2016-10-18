package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.entity.User;
import com.service.UserMng;


@Service
public class UserMngImpl implements UserMng {
	
	@Resource
	private UserDAO userDao;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> list = this.userDao.getAllUser();
		return list;
	}

	@Override
	public User delUser(Integer id) {
		// TODO Auto-generated method stub
		this.delUser(id);
		return null;
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		User user = this.userDao.getUser(id);
		return user;
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		User user = this.userDao.getUserByUserName(userName);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateUser(user);
		return null;
	}

	@Override
	public User getUser(String userName, String password, int role) {
		// TODO Auto-generated method stub
		User user = this.userDao.getUser(userName, password, role);
		return null;
	}

	public boolean login(String userName, String password, int role) {
		List<User> list = (List<User>) userDao.findByNamePwd(userName,
				password, role);
		if (list.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

}
