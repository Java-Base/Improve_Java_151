package com.momai.chapter01.section11;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午12:54:04
 * @desc	消息的生产者
 */
public class Producer {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("混世魔王");
		person.setAge(24);
		// 序列化, 保存到磁盘上
		SerializableUtils.writeObject(person);
	}
}
