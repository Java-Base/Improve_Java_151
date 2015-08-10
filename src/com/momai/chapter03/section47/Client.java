package com.momai.chapter03.section47;


/**
 * @author 	Lian
 * @date	2015年7月3日 下午8:20:28
 * @desc	在equals中使用getClass进行类型判断
 */
public class Client {
	public static void main(String[] args) {
		Employee e1 = new Employee("张三", 100);
		Employee e2 = new Employee("张三", 1001);
		Person p1 = new Person("张三");
		
		System.out.println(p1.equals(e1));
		System.out.println(p1.equals(e2));
		System.out.println(e1.equals(e2));
	}
}


