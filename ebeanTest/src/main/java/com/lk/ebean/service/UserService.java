package com.lk.ebean.service;

import com.lk.ebean.config.EbeanFactoryBean;
import com.lk.ebean.eneity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 9/14/2018.
 */
@Service
public class UserService {
    @Resource
    private EbeanFactoryBean ebeanServer;

    public List<User> findAll() {
        return ebeanServer.testEbean1().find(User.class).findList();
    }
}
