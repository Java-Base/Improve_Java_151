package com.momai.chapter05.section71;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午8:41:16
 * @desc	推荐使用subList处理局部列表
 */
public class Client {
	public static void main(String[] args) {
		// 初始化一个固定长度, 不可变列表
		List<Integer> initData = Collections.nCopies(100, 0);
		// 转变为可变列表
		ArrayList<Integer> list = new ArrayList<Integer>(initData);
		// 删除指定范围的元素
		list.subList(20, 30).clear();
		
		int i=0;
		for(Integer record : list) {
			System.out.println(i);
			i++;
		}
	}
}
