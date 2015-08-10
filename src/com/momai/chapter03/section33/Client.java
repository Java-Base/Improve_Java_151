package com.momai.chapter03.section33;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午2:48:48
 * @desc	不要覆写静态方法
 */
public class Client {
	public static void main(String[] args) {
		Base base = new Sub();
		base.doAnything();
		base.doSomething();
	}
}

class Base {
	// 父类静态方法
	public static void doSomething() {
		System.out.println("我是父类静态方法");
	}
	// 父类非静态方法
	public void doAnything() {
		System.out.println("我是父类非静态方法");
	}
}

class Sub extends Base {
	// 子类同名, 同参数的静态方法
	public static void doSomething() {
		System.out.println("我是子类静态方法");
	}
	
	// 覆写父类的非静态方法
	@Override
	public void doAnything() {
		System.out.println("我是子类非静态方法");
	}
}
