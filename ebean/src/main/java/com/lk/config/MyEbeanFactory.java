package com.lk.config;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.stereotype.Component;

/**
 * Created by LK on 9/14/2018.
 */
@Component
public class MyEbeanFactory {

    private void createEbeanServer(String name) {
        ServerConfig config = new ServerConfig();
        config.setName(name);
        config.loadFromProperties();
        EbeanServerFactory.create(config);
    }

    public EbeanServer testEbean1() {
        createEbeanServer("db1");
        return Ebean.getServer("db1");
    }

    public EbeanServer testEbean2() {
        createEbeanServer("db2");
        return Ebean.getServer("db2");
    }
}
