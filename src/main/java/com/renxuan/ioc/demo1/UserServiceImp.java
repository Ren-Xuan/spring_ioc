package com.renxuan.ioc.demo1;

public class UserServiceImp implements UserService {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void say() {
		System.out.println("hello:"+getName());
	}

}
