package com.momai.chapter01.section13;

import com.momai.chapter01.section11.SerializableUtils;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午2:15:19
 * @desc	消费者, 反序列化对象
 */
public class Consumer {
	public static void main(String[] args) {
		Person p = (Person) SerializableUtils.readObject();
		System.out.println("name = " + p.name);
	}
}
