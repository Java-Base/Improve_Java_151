package com.momai.chapter02.section25;

/**
 * @author 	Lian
 * @date	2015年6月19日 上午11:40:42
 * @desc	不要让四舍五入亏了一方
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("10.5的近似值: " + Math.round(10.5));
		System.out.println("-10.5的近似值: " + Math.round(-10.5));
	}
}
