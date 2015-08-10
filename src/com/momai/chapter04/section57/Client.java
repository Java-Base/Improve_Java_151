package com.momai.chapter04.section57;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 	Lian
 * @date	2015年7月4日 上午11:28:02
 * @desc	推荐在复杂字符串操作中使用正则表达式
 */
public class Client {
	public static void main(String[] args) {
//		// 接收键盘输入
//		Scanner input = new Scanner(System.in);
//		while(input.hasNext()) {
//			String str = input.nextLine();
//			// 使用split分割后统计
//			int wordsCount = str.split(" ").length;
//			System.out.println(str + " 单词数: " + wordsCount);
//		}
		
		// 接收键盘输入
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String str = input.nextLine();
			// 正则表达式对象
			Pattern pattern = Pattern.compile("\\b\\w+\\b");
			// 生成匹配器
			Matcher matcher = pattern.matcher(str);
			// 记录单词数量
			int wordsCount = 0;
			// 遍历查找匹配, 统计单词数量
			while(matcher.find()) {
				wordsCount++;
			}
			System.out.println(str + " 单词数: " + wordsCount);
		}
	}
}
