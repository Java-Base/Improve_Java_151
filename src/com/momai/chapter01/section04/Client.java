package com.momai.chapter01.section04;

import java.text.NumberFormat;

/**
 * @author 	Administrator
 * @date	2015年2月28日 下午9:36:09
 * @desc	避免带有变长参数的方法重载
 */
public class Client {
	// 简单的折扣运算
	public void calPrice(int price, int discount) {
		float knockdownPrice = price * discount / 100.0F;
		System.out.println("简单折扣后的价格是: " + formateCurrency(knockdownPrice));
	}
	
	// 复杂多折扣运算
	public void calPrice(int price, int... discounts) {
		float knockdownPrice = price;
		for(int discount : discounts) {
			knockdownPrice = knockdownPrice * discount / 100;
		}
		System.out.println("简单折扣后的价格是: " + formateCurrency(knockdownPrice));
	}
	
	// 格式化成本的货币形式
	private String formateCurrency(float price) {
		return NumberFormat.getCurrencyInstance().format(price/100);
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		// 499元的货物, 打75折
		client.calPrice(49900, 75);
	}
}
