package com.momai.chapter01.section13;

import java.io.Serializable;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午2:56:39
 * @desc	避免为final变量复杂赋值
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -749290062478584205L;
	// 通过方法返回值为final变量赋值
	public final String name = initName();
	
	// 初始化方法名
	public String initName(){
		return "德天使";
	}
}
