package com.momai.chapter04.section58;

import java.io.UnsupportedEncodingException;

/**
 * @author 	Lian
 * @date	2015年7月4日 上午11:47:49
 * @desc	 强烈建议使用UTF编码
 */
public class Client {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "汉字";
		// 读取字节
//		byte[] b = str.getBytes("UTF-8");
		byte[] b = str.getBytes("GB2312");
		// 重新生成一个新的字符串
		System.out.println(new String(b));
	}
}
