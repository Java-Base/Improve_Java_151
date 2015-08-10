package com.momai.chapter01.section01;

/**
 * @author 	Administrator
 * @date	2015年2月28日 上午11:47:18
 * @desc	字母'l'作为长整型标识时务必大写.
 */
public class Client {
	
	public static void main(String[] args) {
//		long i = 1l;
		long i = 1L;
		System.out.println("i的两倍是: " + (i+i));
	}
}
