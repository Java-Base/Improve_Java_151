package com.momai.chapter01.section06;

/**
 * @author 	Administrator
 * @date	2015年6月9日 下午9:13:20
 * @desc	覆写变长方法也循规蹈矩
 */
public class Client {
	public static void main(String[] args) {
		// 向上转型
		Base base = new Sub();
		base.fun(100, 50);
		
		// 不转型
		Sub sub = new Sub();
		int[] array = {50};
		sub.fun(100, array);
	}
}

// 基类
class Base {
	void fun(int price, int... discounts) {
		System.out.println("Base....fun");
	}
}

// 子类, 覆写父类方法
class Sub extends Base {
	@Override
	void fun(int price, int[] discounts) {
		System.out.println("Sub...fun");
	}
	
}