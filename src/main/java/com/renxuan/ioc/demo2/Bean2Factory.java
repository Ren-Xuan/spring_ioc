package com.renxuan.ioc.demo2;
/*
 * 
 * 
 * 
 * Bean2µÄ¾²Ì¬¹¤³§
 * */
public class Bean2Factory {
	public static Bean2 createBean2() {
		System.out.println("Bean2factory");
		return new Bean2();
	}
}
