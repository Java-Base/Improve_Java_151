package com.momai.chapter02.section27;

/**
 * @author 	Lian
 * @date	2015年6月19日 下午2:05:18
 * @desc	谨慎包装类型的大小比较
 */
public class Client {
	
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer j = new Integer(100);
		compare(i, j);
	}
	
	// 比较两个包装对象大小
	public static void compare(Integer i, Integer j) {
		System.out.println(i == j);
		System.out.println(i < j);
		System.out.println(i > j);
		System.out.println(i.intValue() == j.intValue());
	}
}
