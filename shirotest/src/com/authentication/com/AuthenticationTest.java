package com.authentication.com;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * Created by LK on 2016/9/29.
 */
public class AuthenticationTest {
    @Test
    public void testLoginAndLogout() {

        //创建SecurityManager工厂，过ini配置文件创建securityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiroFir.ini");

        // 创建SecurityManager
        SecurityManager securityManager = factory.getInstance();

        // 将securityManager设置当前的运行环境中
        SecurityUtils.setSecurityManager(securityManager);

        // 从SecurityUtils里边创建一个subject
        Subject subject = SecurityUtils.getSubject();

        // 在认证提交前准备token（令牌）
        // 这里的账号和密码 将来是由用户输入进去
        UsernamePasswordToken token = new UsernamePasswordToken("zhangsan", "111111");

        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

        //判断是否通过验证
        boolean isAuthenticated = subject.isAuthenticated();

        System.out.println("是否验证通过" + isAuthenticated);

        //退出操作
        subject.logout();

        isAuthenticated = subject.isAuthenticated();

        System.out.println("是否验证通过" + isAuthenticated);
    }
}
