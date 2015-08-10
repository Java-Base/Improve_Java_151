package com.momai.chapter02.section28;

import java.util.Scanner;

/**
 * @author 	Lian
 * @date	2015年6月19日 下午2:16:11
 * @desc	优先使用整型池
 */
public class Client {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()) {
			int ii = input.nextInt();
			System.out.println("\n====" + ii + " 的相等判断");
			// 两个通过new产生的Integer对象
			Integer i = new Integer(ii);
			Integer j = new Integer(ii);
			System.out.println("new产生的对象: " + (i==j));
			
			// 基本类型转为包装类型后比较
			i = ii;
			j = ii;
			System.out.println("基本类型转换的对象: " + (i==j));
			
			// 通过静态方法生成一个实例
			i = Integer.valueOf(ii);
			j = Integer.valueOf(ii);
			System.out.println("基本类型转换的对象: " + (i==j));
		}
	}
}
