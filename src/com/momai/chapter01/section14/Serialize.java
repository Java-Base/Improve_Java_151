package com.momai.chapter01.section14;

import com.momai.chapter01.section11.SerializableUtils;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午3:09:20
 * @desc	HR系统对Person对象序列化, 并传到计税系统
 */
public class Serialize {
	public static void main(String[] args) {
		// 基本工资1000, 绩效工资2500
		Salary salary = new Salary(1000, 2500);
		// 记录人员信息
		Person person = new Person("张三", salary);
		// HR系统持久化, 并传递到计税系统
		SerializableUtils.writeObject(person);
		System.out.println("序列化完毕!");
	}
}
