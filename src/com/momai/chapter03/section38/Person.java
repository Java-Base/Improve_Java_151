package com.momai.chapter03.section38;

/**
 * @author 	Lian
 * @date	2015年6月30日 下午4:07:50
 * @desc	使用静态内部类提高封装性
 */
public class Person {
	private String name;
	private Home home;
	
	// 构造函数设置属性值
	public Person(String _name) {
		name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}
	
	public static class Home {
		private String address;
		private String tel;
		
		public Home(String _address, String _tel) {
			address = _address;
			tel = _tel;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}
		
	}
	
}
