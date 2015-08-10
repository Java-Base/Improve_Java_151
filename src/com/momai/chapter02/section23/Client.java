package com.momai.chapter02.section23;

/**
 * @author 	Lian
 * @date	2015年6月19日 上午11:15:45
 * @desc	不要让类型默默转换
 */
public class Client {
	// 光速是30万公里/秒, 常量
	public static final int LIGHT_SPEED = 30 * 10000 * 1000;
	
	public static void main(String[] args) {
		System.out.println("题目1: 月亮光照射到地球上需要1秒, 计算月亮和地球的距离.");
		long dis1 = LIGHT_SPEED * 1;
		System.out.println("月亮与地球的距离是: " + dis1 + "米");
		System.out.println("**************************************");
		System.out.println("题目2: 太阳光照射到地球上需要8分钟, 计算太阳和地球的距离.");
		long dis2 = LIGHT_SPEED * 60L * 8;
		System.out.println("太阳与地球的距离是: " + dis2 + "米");
	}
}
