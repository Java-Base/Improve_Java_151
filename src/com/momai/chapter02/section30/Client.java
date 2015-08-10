package com.momai.chapter02.section30;

import java.util.Random;

/**
 * @author 	Lian
 * @date	2015年6月19日 下午3:25:42
 * @desc	不要随便设置随机种子
 */
public class Client {
	public static void main(String[] args) {
//		Random r = new Random();
		Random r = new Random(1000);
		for(int i=1; i<4; i++) {
			System.out.println("第 " + i + " 次 " + r.nextInt());
		}
	}
}
