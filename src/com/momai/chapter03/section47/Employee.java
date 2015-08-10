package com.momai.chapter03.section47;

/**
 * @author Lian
 * @date 2015年7月3日 下午8:23:30
 * @desc
 */
public class Employee extends Person {
	private int id;

	public Employee(String name, int id) {
		super(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			return super.equals(obj) && e.getId()==id;
		}
		return false;
	}

}
