package com.renxuan.ioc.demo2;
/*
 * beanʵ�������ַ�ʽ
 * */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo2 {
	//getBeanÿ�ε��ö��᷵��һ���µ�ʵ��
	//request
	//session
	@Test
	public void demo1() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean1=(Bean1)applicationContext.getBean("bean1");
	}
	
	
	@Test
	public void demo2() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 bean2=(Bean2)applicationContext.getBean("bean2");
	}
	
	@Test
	public void demo3() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean3 bean3=(Bean3)applicationContext.getBean("bean3");
	}
	
}
