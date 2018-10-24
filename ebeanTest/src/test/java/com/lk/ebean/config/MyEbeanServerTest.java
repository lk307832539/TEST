package com.lk.ebean.config;

import com.lk.ebean.eneity.Location;
import com.lk.ebean.eneity.User;
import com.lk.ebean.service.LocationService;
import com.lk.ebean.service.UserService;
import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by LK on 9/14/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyEbeanServerTest {
    @Resource
    private UserService userService;
    @Resource
    private LocationService locationService;


    @Test
    public void testEbean1() {
//        ServerConfig config = new ServerConfig();
//        config.setName("db1");
//        config.loadFromProperties();
//
//        EbeanServer server = EbeanServerFactory.create(config);
//
//        EbeanServer db1 = Ebean.getServer("db1");
//        System.out.println(db1.getName());

    }

    @Test
    public void testEbean2() {
//        List<User> users = userService.findAll();
//        List<Location> locations = locationService.findAll();
//        System.out.println(users.size());
//        System.out.println(locations.size());

    }
}