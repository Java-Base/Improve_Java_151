package com.momai.chapter01.section15;

/**
 * @author 	Lian
 * @date	2015年6月13日 下午3:58:18
 * @desc	break万万不可忘
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("2 = " + toChineseNumberCase(2));
	}
	
	// 把阿拉伯数字翻译成中文大写数字
	public static String toChineseNumberCase(int n) {
		String chineseNumber = "";
		switch(n) {
			case 0: chineseNumber = "零";
			case 1: chineseNumber = "壹";
			case 2: chineseNumber = "贰";
			case 3: chineseNumber = "叁";
			case 4: chineseNumber = "肆";
			case 5: chineseNumber = "伍";
			case 6: chineseNumber = "陆";
			case 7: chineseNumber = "柒";
			case 8: chineseNumber = "捌";
			case 9: chineseNumber = "玖";
		}
		
		return chineseNumber;
	}
}
