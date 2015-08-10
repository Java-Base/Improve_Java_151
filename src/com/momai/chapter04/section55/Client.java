package com.momai.chapter04.section55;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午10:27:44
 * @desc	注意字符串的位置
 */
public class Client {
	public static void main(String[] args) {
		String str1 = 1 + 2 + "apples";
		String str2 = "apples" + 1 + 2;
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
