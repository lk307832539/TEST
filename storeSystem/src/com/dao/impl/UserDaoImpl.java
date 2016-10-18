package com.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dao.UserDAO;
import com.entity.User;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class UserDaoImpl implements UserDAO{
	@Resource
	private SessionFactory sessionFactory; 
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		sessionFactory.getCurrentSession().flush();
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		String hql = "from User";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

	@Override
	public boolean delUser(Integer id) {
		// TODO Auto-generated method stub
		String hql = "delete User u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0,id);
		return (query.executeUpdate() > 0);
		
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		String hql = "from User u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);
		return (User) query.uniqueResult();
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		String hql = "from User u where u.username=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, userName);
		return (User) query.uniqueResult();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		sessionFactory.getCurrentSession().flush();
		
	}

	@Override
	public User getUser(String userName, String password,int role) {
		// TODO Auto-generated method stub
		String hql = "from User u where u.username=? and u.password=? and u.role=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, userName);
		query.setString(1,password);
		query.setInteger(2,role);
		return (User) query.uniqueResult();
	}
	public User findByNamePwd(String userName, String password,int role) {
		// TODO Auto-generated method stub
		String hql = "from User u where u.username=? and u.password=? and u.role=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, userName);
		query.setString(1,password);
		query.setInteger(2,role);
		return (User) query.uniqueResult();
	}

	@Override
	public User getUser(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
