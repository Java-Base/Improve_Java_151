package com.momai.chapter01.section14;

import java.io.Serializable;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午3:03:35
 * @desc	使用序列化类的私有方法巧妙解决部分属性持久化问题
 */
public class Salary implements Serializable {
	private static final long serialVersionUID = 3515032284261249433L;
	// 基本工资
	private int basePay;
	// 绩效工资
	private int bonus;
	
	public Salary(int _basePay, int _bonus) {
		basePay = _basePay;
		bonus = _bonus;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	
}
