package com.momai.chapter04.section52;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午10:11:25
 * @desc	推荐使用String直接量赋值
 */
public class Client {
	public static void main(String[] args) {
		String str1 = "中国";
		String str2 = "中国";
		String str3 = new String("中国");
		String str4 = new String("中国");
		String str5 = str3.intern();
		
		// 两个直接变量是否相等
		System.out.println(str1==str2);
		// 直接量和对象是否相等
		System.out.println(str1==str3);
		// 两个对象是否相等
		System.out.println(str3==str4);
		// 经过intern处理后的对象与直接量是否相等
		System.out.println(str1==str5);
	}
}
