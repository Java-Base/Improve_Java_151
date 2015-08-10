package com.momai.chapter03.section32;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午2:42:00
 * @desc	静态变量一定要先声明后赋值
 */
public class Client {
	static {
		i = 100;
	}
	public static int i = 1;
	
	public static void main(String[] args) {
		System.out.println(i);
	}
}
