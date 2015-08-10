package com.momai.chapter01.section05;


/**
 * @author 	Administrator
 * @date	2015年6月9日 下午9:01:03
 * @desc	别让null值和空值威胁到变长方法
 */
public class Client {
	public void methodA(String str, Integer... is) {
		System.out.println("String--Integer");
	}
	
	public void methodA(String str, String... strs) {
		System.out.println("String--String");
	}
	
	public static void main(String[] args) {
//		Client client = new Client();
//		client.methodA("China", 0);
//		client.methodA("China", "People");
//		client.methodA("China");
//		client.methodA("String", null);
		Client client = new Client();
		String[] strs = null;
		client.methodA("China", strs);
	}
}
