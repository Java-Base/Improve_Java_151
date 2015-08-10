package com.momai.chapter03.section36;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午3:32:35
 * @desc	使用构造代码块精炼程序
 */
public class Client {
	{
		// 构造代码块
		System.out.println("执行构造代码块");
	}
	
	public Client() {
		System.out.println("执行无参构造");
	}
	
	public Client(String _str) {
		System.out.println("执行有参构造");
	}
}
