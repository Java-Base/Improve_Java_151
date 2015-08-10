package com.momai.chapter05.section69;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午8:07:11
 * @desc	列表相等只需关系元素数据
 */
public class Client {
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<String>();
		strs.add("A");
		
		Vector<String> strs2 = new Vector<String>();
		strs2.add("A");
		
		System.out.println(strs.equals(strs2));
	}
}
