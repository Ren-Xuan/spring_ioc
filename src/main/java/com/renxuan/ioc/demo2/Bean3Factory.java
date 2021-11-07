package com.renxuan.ioc.demo2;

public class Bean3Factory {
	public Bean3 createBean3() {
		System.out.println("bean3Factory");
		return new Bean3();
	}
}
