package com.momai.chapter05.section67;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午5:37:44
 * @desc	不同的列表选择不同的变量方法
 */
public class Client {
	public static void main(String[] args) {
		// 学生数量, 80万
		int stuNum = 80*10000;
		// List集合, 记录所有学生的分数
//		List<Integer> scores = new ArrayList<Integer>(stuNum);
		List<Integer> scores = new LinkedList<Integer>();
		// 写入分数
		for(int i=0; i<stuNum; i++) {
			scores.add(new Random().nextInt(150));
		}
		
		// 记录开始计算时间
		long start = System.currentTimeMillis();
		
		System.out.println("平均分是: " + average(scores));
		System.out.println("执行时间是: " + (System.currentTimeMillis()-start) + "ms");
	}
	
	public static int average(List<Integer> list) {
		int sum = 0;
		// 遍历求和
		if(list instanceof RandomAccess) {
			for(int i=0; i<list.size(); i++) {
				sum += list.get(i);
			}
		} else {
			for(int i : list) {
				sum += i;
				
			}
		}

		// 除以人数, 计算平均值
		return sum/list.size();
	}
}
