package com.momai.chapter01.section07;

/**
 * @author 	Administrator
 * @date	2015年6月10日 下午8:39:50
 * @desc	警惕自增的陷阱
 */
public class Client {
	public static void main(String[] args) {
		int count = 0;
		for(int i=0; i<10; i++) {
			count = count++;
		}
		System.out.println(count);
	}
}
