package com.momai.chapter01.section18;

import java.util.Date;

/**
 * @author 	Lian
 * @date	2015年6月13日 下午4:41:53
 * @desc	避免instanceof非预期结果
 */
public class Client {
	public static void main(String[] args) {
		// String对象是否是Object的实例
		boolean b1 = "String" instanceof Object;
		// String对象是否是String的实例
		boolean b2 = "String" instanceof String;
		// Object对象是否是String的实例
		boolean b3 = new Object() instanceof String;
		// 拆箱类型是否是装箱类型的实例
//		boolean b4 = 'A' instanceof Character;
		// 空对象是否是String的实例
		boolean b5 = null instanceof String;
		// 类型转换后的空对象是否是String的实例
		boolean b6 = (String)null instanceof String;
		// Date对象是否是String的实例
//		boolean b7 = new Date() instanceof String;
		// 在泛型类中判断String对象是否是Date的实例
		boolean b8 = new GenericClass<String>().isDateInstance("");
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b5 = " + b5);
		System.out.println("b6 = " + b6);
		System.out.println("b8 = " + b8);
	}
}

class GenericClass<T> {
	// 判断是否是Date类型
	public boolean isDateInstance(T t) {
		return t instanceof Date;
	}
}
