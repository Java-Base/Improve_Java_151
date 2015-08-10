package com.momai.chapter03.section46;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午8:22:10
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
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.getName()==null || name==null) {
				return false;
			} else {
				return name.equalsIgnoreCase(p.getName());
			}
		}
		return false;
	}

}
