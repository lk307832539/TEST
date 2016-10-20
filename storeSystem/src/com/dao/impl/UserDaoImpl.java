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
public class UserDaoImpl implements UserDAO {
    @Resource
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        sessionFactory.getCurrentSession().flush();

    }

    @Override
    public List<User> getAllUser() {
        String hql = "from User";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public boolean delUser(Integer id) {
        String hql = "delete User u where u.id=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger(0, id);
        return (query.executeUpdate() > 0);

    }

    @Override
    public User getUser(Integer id) {
        String hql = "from User u where u.id=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger(0, id);
        return (User) query.uniqueResult();
    }

    @Override
    public User getUserByUserName(String userName) {
        String hql = "from User u where u.username=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, userName);
        return (User) query.uniqueResult();
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        sessionFactory.getCurrentSession().flush();

    }

    @Override
    public List<User> findByNamePwd(String userName, String password, int role) {
        String hql = "from User u where u.username=? and u.password=? and u.role=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, userName);
        query.setString(1, password);
        query.setInteger(2, role);
        List<User> list = query.list();
        return list;
    }

}
