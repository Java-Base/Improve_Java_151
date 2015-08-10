package com.momai.chapter05.section66;

import java.util.Arrays;
import java.util.List;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午4:37:33
 * @desc	asList方法产生的List对象不可更改
 */
public class Client {
	enum Week {
		Sun, Mon, Tue, Wed, Thu, Fri, Sat
	}
	
	public static void main(String[] args) {
		// 五天工作制
		Week[] workDyas = {Week.Mon, Week.Tue, Week.Wed, Week.Thu, Week.Fri};
		// 转换为列表
		List<Week> list = Arrays.asList(workDyas);
		// 增加周六为工作日
		list.add(Week.Sat);
	}
}
