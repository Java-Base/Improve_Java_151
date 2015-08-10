package com.momai.chapter03.section49;

/**
 * @author Lian
 * @date 2015年7月3日 下午9:51:29
 * @desc
 */
public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s.name=%s", this.getClass(), name);
	}

}
