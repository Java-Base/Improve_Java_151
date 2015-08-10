package com.momai.chapter01.section14;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午3:06:49
 * @desc	人员基本资料
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -1649391252754768771L;
	// 姓名
	private String name;
	// 薪水
	private transient Salary salary;
	
	public Person(String _name, Salary _salary) {
		name = _name;
		salary = _salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	// 序列化委托方法
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeInt(salary.getBasePay());
	}
	
	// 反序列化委托方法
	private void readObject(ObjectInputStream in) throws Exception {
		in.defaultReadObject();
		salary = new Salary(in.readInt(), 0);
	}
	
	
}
