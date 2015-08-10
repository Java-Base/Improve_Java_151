package com.momai.chapter03.section40;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午8:51:13
 * @desc	匿名类的构造函数很特殊
 */
public class Client {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(1, 2) {
			{
				setOperator(Ops.ADD);
			}
		};
		
		System.out.println(c1.getResult());
	}
}

enum Ops {ADD, SUB}
class Calculator {
	private int i, j, result;
	
	// 无参构造
	public Calculator() {}
	
	// 有参构造
	public Calculator(int _i, int _j) {
		i = _i;
		j = _j;
	}
	
	// 设置符号, 是加法运算还是减法运算
	protected void setOperator(Ops _op) {
		result = _op.equals(Ops.ADD) ? i+j : i-j;
	}
	
	// 取得运算结果
	public int getResult() {
		return result;
	}
}
