package com.momai.chapter05.section64;

import java.util.Arrays;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午4:02:35
 * @desc	 多种最值算法, 适时选择
 */
public class Client {
	public static void main(String[] args) {
		int[] arr1 = {2, 34, 22, 535, 323, 22};
		System.out.println(max(arr1));
		System.out.println(max2(arr1));
	}
	
	// 自行实现, 快速查找最大值
	public static int max(int[] data) {
		int max = data[0];
		for(int i : data) {
			max = max>i ? max : i;
		}
		return max;
	}
	
	// 先排序, 后求值
	public static int max2(int[] data) {
		Arrays.sort(data.clone());
		return data[data.length - 1];
	}
}
