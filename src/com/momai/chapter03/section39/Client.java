package com.momai.chapter03.section39;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午8:46:32
 * @desc	使用匿名类的构造函数
 */
public class Client {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		List l2 = new ArrayList() {};
		List l3 = new ArrayList() {{}};
		
		System.out.println(l1.getClass() == l2.getClass());
		System.out.println(l2.getClass() == l3.getClass());
		System.out.println(l1.getClass() == l3.getClass());
	}
}
