package com.momai.chapter01.section11;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午1:13:10
 * @desc	反序列化, 生成实例对象
 */
public class Consumer {
	// 反序列化
	public static void main(String[] args) {
		Person p = (Person) SerializableUtils.readObject();
		System.out.println("name = " + p.getName() + ", age = " + p.getAge());
	}
}
