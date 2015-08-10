package com.momai.chapter03.section43;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午4:09:43
 * @desc	避免对象的浅拷贝
 */
public class Client {
	public static void main(String[] args) {
		// 定义父亲
		Person f = new Person("父亲");
		// 定义大儿子
		Person s1 = new Person("大儿子", f);
		// 小儿子的信息是通过大儿子拷贝过来的
		Person s2 = s1.clone();
		s2.setName("小儿子");
		// 认干爹
		s1.getFather().setName("干爹");
		System.out.println(s1.getName() + " 的父亲是 " + s1.getFather().getName());
		System.out.println(s2.getName() + " 的父亲是 " + s2.getFather().getName());
	}
}


class Person implements Cloneable {
	/** 姓名 */
	private String name;
	/** 父亲 */
	private Person father;
	
	public Person(String _name) {
		name = _name;
	}
	
	public Person(String _name, Person _parent) {
		name = _name;
		father = _parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	// 拷贝的实现
	@Override
	protected Person clone() {
		Person p = null;
		try {
			p = (Person) super.clone();
			p.setFather(new Person(p.getFather().getName()));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
}