package com.momai.chapter01.section08;

/**
 * @author 	Administrator
 * @date	2015年6月10日 下午8:44:49
 * @desc	不要用旧语法困扰你
 */
public class Client {
	public static void main(String[] args) {
		// 数据定义及初始化
		int fee = 200;
		// 其他业务处理
		saveDefault:save(fee);
		// 其他业务处理
	}
	
	static void saveDefault() {
		System.out.println("saveDefault...");
	}
	
	static void save(int fee) {
		System.out.println("save");
	}
}
