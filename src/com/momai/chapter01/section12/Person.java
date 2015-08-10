package com.momai.chapter01.section12;

import java.io.Serializable;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午1:23:48
 * @desc	序列化类中的不变量
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -420289623685229346L;
	// 不变量
//	public final String name = "混世魔王";
//	public final String name = "德天使";
	
	// 不变量初始不赋值
	public final String name;
	// 构造函数为不变量赋值
	public Person() {
		name = "德天使";
	}
}
