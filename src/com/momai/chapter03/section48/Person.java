package com.momai.chapter03.section48;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午8:21:25
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
		if(obj!=null && obj.getClass()==this.getClass()) {
			Person p = (Person) obj;
			if(p.getName()==null || name==null) {
				return false;
			} else {
				return name.equalsIgnoreCase(p.getName());
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
//		return new HashCodeBuilder().append(name).toHashCode();
		return 0;
	}
	
}
