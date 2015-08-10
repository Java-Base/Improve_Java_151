package com.momai.chapter02.section24;

import java.util.Scanner;

/**
 * @author 	Lian
 * @date	2015年6月19日 上午11:24:32
 * @desc	边界, 边界, 还是边界
 */
public class Client {
	// 一个会员拥有产品的最多数量
	public final static int LIMIT = 2000;
	
	public static void main(String[] args) {
		// 会员当前拥有的产品数量
		int cur = 1000;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入需要预定的数量: ");
		while(input.hasNextInt()) {
			int order = input.nextInt();
			// 当前拥有的与准备订购的产品数量之和
			if(order>0 && order+cur<=LIMIT) {
				System.out.println("你已成功预定了" + order + "个商品! ");
			} else {
				System.out.println("超过限额, 预定失败!");
			}
		}
	}
}
