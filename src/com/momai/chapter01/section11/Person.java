package com.momai.chapter01.section11;

import java.io.Serializable;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午12:50:25
 * @desc	简单的JavaBean, 实现了Serializable接口, 可以在网络上传输, 也可以在本地存储后读取
 */
public class Person implements Serializable{
	private static final long serialVersionUID = 5038885006652493908L;
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
