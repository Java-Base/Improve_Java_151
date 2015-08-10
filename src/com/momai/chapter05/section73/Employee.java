package com.momai.chapter05.section73;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Lian
 * @date 2015年7月10日 下午4:13:51
 * @desc 公司职员类
 */
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private Position position;

	public Employee(int id, String name, Position position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	// 按照id号排序, 也就是资历的深浅排序
	@Override
	public int compareTo(Employee o) {
		return new CompareToBuilder().append(id, o.id).toComparison();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}

enum Position {
	Boss, Manager, Staff
}
