package com.momai.chapter03.section48;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午9:39:47
 * @desc	写equals方法必须覆写hashCode方法
 */
public class Client {
	public static void main(String[] args) {
		// Person类的实例作为Map的key
		Map<Person, Object> map = new HashMap<Person, Object>() {
			{
				put(new Person("张三"), new Object());
			}
		};
		
		// Person类的实例作为List的元素
		List<Person> list = new ArrayList<Person>() {
			{
				add(new Person("张三"));
			}
		};
		
		// 列表中是否包含
		boolean b1 = list.contains(new Person("张三"));
		// Map中是否包含
		boolean b2 = map.containsKey(new Person("张三"));
		
		System.out.println("b1--" + b1 + ", b2--" + b2);
	}
}
