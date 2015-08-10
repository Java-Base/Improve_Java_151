package com.momai.chapter01.section09;

import static java.lang.Math.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.text.NumberFormat.*;

import java.text.NumberFormat;

/**
 * @author 	Administrator
 * @date	2015年6月10日 下午8:49:10
 * @desc	少用静态导入
 */
public class Client {
	// 输入半径和精度要求, 计算面积
	public static void main(String[] args) {
		double s = PI * parseDouble(args[0]);
		NumberFormat nf = getInstance();
		nf.setMaximumFractionDigits(parseInt(args[1]));
		formatMessage(nf.format(s));
	}
	
	// 格式化消息输出
	public static void formatMessage(String s) {
		System.out.println("圆的面积是: " + s);
	}
}
