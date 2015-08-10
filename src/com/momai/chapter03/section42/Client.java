package com.momai.chapter03.section42;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午3:58:11
 * @desc	让工具类不可实例化
 */
public class Client {
	private Client() {
		// 限制工具类实例化的方法. 不仅仅设置成private权限, 还抛异常
		throw new Error("不要实例化我!");
	}
	
	public static void main(String[] args) {
		Client client = new Client();
	}
}
