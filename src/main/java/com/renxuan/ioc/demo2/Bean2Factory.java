package com.renxuan.ioc.demo2;
/*
 * 
 * 
 * 
 * Bean2�ľ�̬����
 * */
public class Bean2Factory {
	public static Bean2 createBean2() {
		System.out.println("Bean2factory");
		return new Bean2();
	}
}
