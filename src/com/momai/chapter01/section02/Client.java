package com.momai.chapter01.section02;

import java.util.Random;

/**
 * @author 	Administrator
 * @date	2015年2月28日 下午12:06:04
 * @desc	务必让常量的值在运行期保持不变
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("常量会变哦: " + Const.RAND_CONST);
	}
}

/**
 * @author 	Administrator
 * @date	2015年2月28日 下午12:08:59
 * @desc	接口常量
 */
interface Const {
	// 这还算常量吗?
	public static final int RAND_CONST = new Random().nextInt();
}

