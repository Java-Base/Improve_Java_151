package com.momai.chapter02.section29;

/**
 * @author 	Lian
 * @date	2015年6月19日 下午3:15:16
 * @desc	优先选择基本类型
 */
public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		int i= 140;
		// 分别传递int类型和Integer类型
		client.f(i);
		client.f(Integer.valueOf(i));
	}
	
	public void f(long a) {
		System.out.println("基本类型的方法被调用");
	}
	
	public void f(Long a) {
		System.out.println("包装类型的方法被调用");
	}
}
