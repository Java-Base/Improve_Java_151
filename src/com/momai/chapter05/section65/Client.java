package com.momai.chapter05.section65;

import java.util.Arrays;
import java.util.List;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午4:11:47
 * @desc	避开基本类型数组转换列表陷阱
 */
public class Client {
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		List list = Arrays.asList(data);
		System.out.println("列表中的元素数量是: " + list.size());
		System.out.println("元素类型: " + list.get(0).getClass());
		System.out.println("前后是否相等: " + data.equals(list.get(0)));
	}
}
