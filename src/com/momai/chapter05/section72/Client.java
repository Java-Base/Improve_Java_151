package com.momai.chapter05.section72;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午8:44:27
 * @desc	生产子列表后不要再操作原列表
 */
public class Client {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		List<String> subList = list.subList(0, 2);
		// 源字符串增加一个元素
		list.add("D");
		
		System.out.println("原列表长度: " + list.size());
		System.out.println("子列表原列表长度: " + subList.size());
	}
}
