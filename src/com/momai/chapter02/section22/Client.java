package com.momai.chapter02.section22;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author 	Lian
 * @date	2015年6月19日 上午11:11:28
 * @desc	用整数类型处理货币
 */
public class Client {
	public static void main(String[] args) {
		System.out.println(10.00 - 9.60);
		
		NumberFormat nf = new DecimalFormat("#.##");
		System.out.println(nf.format(10.00 - 9.60));
	}
}
