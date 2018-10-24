package com.lk.service;

import com.lk.config.MyEbeanFactory;
import com.lk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 9/14/2018.
 */
@Service
public class UserService {
    @Resource
    private MyEbeanFactory ebeanServer;

    public List<User> findAll() {
        return ebeanServer.testEbean1().find(User.class).findList();
    }
}
