package com.momai.chapter03.section38;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午4:18:11
 * @desc	使用静态内部类提高封装性
 */
public class Client {
	public static void main(String[] args) {
		// 定义张三这个人
		Person p = new Person("张三");
		p.setHome(new Person.Home("上海", "201"));
	}
}
