package com.momai.chapter03.section46;

import java.util.ArrayList;
import java.util.List;


/**
 * @author 	Lian
 * @date	2015年7月3日 下午8:12:12
 * @desc	equals应该考虑null值情景
 */
public class Client {
	public static void main(String[] args) {
		Person p1 = new Person("张三");
		Person p2 = new Person(null);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		System.out.println("列表中是否包含p1张三: " + list.contains(p1));
		System.out.println("列表中是否包含p2张三: " + list.contains(p2));
	}
}
