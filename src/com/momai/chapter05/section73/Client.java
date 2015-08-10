package com.momai.chapter05.section73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 	Lian
 * @date	2015年7月10日 下午4:11:47
 * @desc	使用Comparator进行排序
 */
public class Client {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>(5);
		// 一个老板
		list.add(new Employee(1001, "张三", Position.Boss));
		// 两个经理
		list.add(new Employee(1006, "赵七", Position.Manager));
		list.add(new Employee(1003, "王五", Position.Manager));
		// 两个员工
		list.add(new Employee(1002, "李四", Position.Staff));
		list.add(new Employee(1005, "马六", Position.Staff));
		
		// 按照id排序, 也就是按照资历深浅排序
		Collections.sort(list);
		for(Employee e : list) {
			System.out.println(e);
		}
		
	}
}
