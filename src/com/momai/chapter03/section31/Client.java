package com.momai.chapter03.section31;

/**
 * @author 	Lian
 * @date	2015年6月30日 上午11:29:43
 * @desc	在接口中不要存在实现代码
 */
public class Client {
	public static void main(String[] args) {
		B.s.doSomething();
	}
}

// 在接口中存在实现代码
interface B {
	public static final S s = new S() {
		public void doSomething() {
			System.out.println("我在接口中实现了.");
		}
	};
}

// 被实现的接口
interface S {
	public void doSomething ();
}
