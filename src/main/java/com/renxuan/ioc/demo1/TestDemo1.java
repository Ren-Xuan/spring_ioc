package com.renxuan.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestDemo1 {
	@Test
	public void demo1() {
		UserService userService=new UserServiceImp();
		userService.say();
	}
	@ Test
	public void demo2() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)applicationContext.getBean("UserService");
		userService.say();
	}
	@Test
	public void demo3() {
		ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\workspace\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
		UserService userService=(UserService)applicationContext.getBean("UserService");
		userService.say();
	}
	@Test
	//传统方式beanFactory
	public void demo4() {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		UserService userService=(UserService)beanFactory.getBean("UserService");
		userService.say();
	}
}
