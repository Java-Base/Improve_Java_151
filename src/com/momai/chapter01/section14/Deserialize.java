package com.momai.chapter01.section14;

import com.momai.chapter01.section11.SerializableUtils;

/**
 * @author 	Lian
 * @date	2015年6月13日 下午3:12:13
 * @desc	计税系统反序列化, 并打印信息
 */
public class Deserialize {
	public static void main(String[] args) {
		Person p = (Person) SerializableUtils.readObject();
		StringBuffer sb = new StringBuffer();
		sb.append("姓名: " + p.getName());
		sb.append("\t基本工资: " + p.getSalary().getBasePay());
		sb.append("\t绩效工资: " + p.getSalary().getBonus());
		System.out.println(sb);
	}
}
