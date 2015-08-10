package com.momai.chapter04.section56;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午10:29:59
 * @desc	自由选择字符串拼接方法
 */
public class Client {
	public static void main(String[] args) {
		String str = "";
		StringBuilder str2 = new StringBuilder();
		long beforeTime = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			// 加号拼接
//			str += "c";
			// concat方法连接
//			str = str.concat("c");
			// StringBuilder方法
			str2.append("c");
		}
		long afterTime = System.currentTimeMillis();
		System.out.println(afterTime - beforeTime);
	}
}
