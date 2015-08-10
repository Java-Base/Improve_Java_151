package com.momai.chapter02.section21;

import java.util.Scanner;

/**
 * @author 	Lian
 * @date	2015年6月19日 上午10:59:24
 * @desc	用偶判断, 不用奇判断
 */
public class Client {
	public static void main(String[] args) {
		// 接收键盘输入参数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入多个数字判断奇偶: ");
		while(input.hasNextInt()) {
			int i = input.nextInt();
//			String str = i + "->" + (i%2==1 ? "奇数" : "偶数");
			String str = i + "->" + (i%2==0 ? "偶数" : "奇数");
			System.out.println(str);
		}
	}
}
