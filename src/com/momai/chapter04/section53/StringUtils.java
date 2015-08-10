package com.momai.chapter04.section53;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午10:18:01
 * @desc	注意方法中传递的参数要求
 */
public class StringUtils {
	// 删除字符串
	public static String remove(String source, String sub) {
		return source.replaceAll(sub, "");
	}
}
