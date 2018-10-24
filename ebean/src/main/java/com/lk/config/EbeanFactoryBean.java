package com.lk.config;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by LK on 2018/5/14.
 */
/*
@Service用于标注业务层组件
@Controller用于标注控制层组件（如struts中的action）
@Repository用于标注数据访问组件，即DAO组件
@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
*/

//@Component //泛指组件，当组件不好归类的时候，使用这个注解进行标注。
//public class EbeanFactoryBean implements FactoryBean<EbeanServer> {
//
//    public EbeanServer getObject() throws Exception {
//        return createEbeanServer();
//    }
//
//    public Class<?> getObjectType() {
//        return EbeanServer.class;
//    }
//
//    public boolean isSingleton() {
//        return true;
//    }
//
//    /**
//     * Create a EbeanServer instance.
//     */
//    private EbeanServer createEbeanServer() {
//        ServerConfig config = new ServerConfig();
//        config.setName("db");
//        config.setDefaultServer(true);
//
//        config.loadFromProperties();
//
//        return EbeanServerFactory.create(config);
//    }
//
//}
