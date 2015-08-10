package com.momai.chapter01.section12;

import com.momai.chapter01.section11.SerializableUtils;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午2:14:21
 * @desc	生产者, 序列化对象
 */
public class Producer {
	public static void main(String[] args) {
		Person p = new Person();
		SerializableUtils.writeObject(p);
		System.out.println("序列化到本地完毕!");
	}
}
