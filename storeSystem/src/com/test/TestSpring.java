package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.User;


public class TestSpring {
	public static void main(String[] args) {
		// 加载spring配置文件，初始化IoC容器
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器 接管Bean
		User User = (User) ac.getBean("User");
		// 输出欢迎信息
		System.out.println("Hello:" + User.getUsername());

	}
}
