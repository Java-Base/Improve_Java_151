package com.momai.chapter05.section61;

import java.util.Arrays;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午1:44:15
 * @desc	若有必要, 使用变成数组
 */
public class Client {
	public static void main(String[] args) {
		// 一个班级最多容量10个学生
		Stu[] classes = new Stu[60];
		// classes 初始化
		for(int i=0; i<10; i++) {
			classes[i] = new Stu("学生" + i);
		}
		
		// 偶尔一个班级可以容纳15人, 数组加长
		classes = expandCapacity(classes, 5);
		// 重新初始化超出限额的20人
		for(int i=10; i<15; i++) {
			classes[i] = new Stu("学生" + i); 
		}
		
		// 输出所有学生
		for(Stu stu : classes) {
			System.out.println(stu.getName());
		}
		
	}
	
	public static <T> T[] expandCapacity(T[] datas, int newLen) {
		// 不能是负值
		newLen = newLen<0 ? 0 : newLen;
		// 生成一个新数组, 并拷贝原值
		return Arrays.copyOf(datas, newLen);
	}
}
