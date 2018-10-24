package com.lk.ebean.config;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.stereotype.Component;

/**
 * Created by LK on 9/14/2018.
 */
@Component
public class EbeanFactoryBean {
    public EbeanServer testEbean1() {
        ServerConfig config = new ServerConfig();
        config.setName("db1");
        config.loadFromProperties();
        EbeanServerFactory.create(config);

        return Ebean.getServer("db1");
    }

    public EbeanServer testEbean2() {
        ServerConfig config = new ServerConfig();
        config.setName("db2");
        config.loadFromProperties();
        EbeanServerFactory.create(config);
        return Ebean.getServer("db2");
    }
}
