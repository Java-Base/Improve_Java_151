package com.momai.chapter02.section26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 	Lian
 * @date	2015年6月19日 上午11:47:03
 * @desc	提防包装类型的null值
 */
public class Client {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(null);
		System.out.println(f(list));
	}
	
	// 计算list中所有元素之和
	public static int f(List<Integer> list) {
		int count = 0;
//		for(int i : list) {
//			count += i;
//		}
		for(Integer i : list) {
			count += (i==null) ? 0 : i;
		}
		return count;
	}
}
