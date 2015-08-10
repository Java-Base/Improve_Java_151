package com.momai.chapter04.section59;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午12:04:05
 * @desc	对字符串排序持一种宽容的心态
 */
public class Client {
	public static void main(String[] args) {
		String[] strs = {"张三(Z)", "李四(L)", "王五(W)"};
		// 定义一个中文排序器
		Comparator c = Collator.getInstance(Locale.CHINA);
		// 排序, 默认是升序
		Arrays.sort(strs, c);
		int i=0;
		for(String str : strs) {
			System.out.println((++i) + ".." + str);
		}
	}
}
