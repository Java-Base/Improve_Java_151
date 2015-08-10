package com.momai.chapter01.section10;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午12:40:13
 * @desc	不要在本类中覆盖静态导入的变量和方法
 */
public class Client {
	// 长两名与静态导入的PI相同
	public final static String PI = "祖冲之";
	// 方法名与静态导入的相同
	public static int abs(int abs) {
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("PI=" + PI);
		System.out.println("abs(-100)=" + abs(-100));
	}
}
