package com.momai.chapter01.section03;

/**
 * @author 	Administrator
 * @date	2015年2月28日 下午12:12:00
 * @desc	三元操作符的类型务必一致
 */
public class Client {

	public static void main(String[] args) {
		int i = 80;
		String s = String.valueOf(i<100?90:100);
		String s1 = String.valueOf(i<100?90:100.0);
		System.out.println("s: " + s + ", s1: " + s1);
		System.out.println("两者是否相等: " + s.equals(s1));
	}

}
