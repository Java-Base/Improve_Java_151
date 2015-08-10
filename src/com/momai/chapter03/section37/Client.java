package com.momai.chapter03.section37;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午3:42:57
 * @desc	构造代码块会想你所想
 */
public class Client {
	public static void main(String[] args) {
		Base base1 = new Base();
		Base base2 = new Base("");
		Base base3 = new Base(1);
		System.out.println("实例数量: " + Base.getNumberOfObjects());
	}
}

class Base {
	// 对象计数器
	private static int numberOfObjects = 0;
	
	{
		// 构造代码块, 计算产生对象数量
		numberOfObjects++;
	}
	
	public Base() {
		
	}
	
	// 有参构造调用无参构造
	public Base(String _str) {
		this();
	}
	
	// 有参构造不调用其他构造
	public Base(int _int) {
		
	}
	
	// 返回在一个JVM中, 创建了多少个实例对象
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
}
