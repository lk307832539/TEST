package com.lk.ebean.service;

import com.lk.ebean.config.EbeanFactoryBean;
import com.lk.ebean.eneity.Location;
import com.lk.ebean.eneity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 9/14/2018.
 */
@Service
public class LocationService {
    @Resource
    private EbeanFactoryBean ebeanServer;

    public List<Location> findAll() {
        return ebeanServer.testEbean2().find(Location.class).findList();
    }
}
