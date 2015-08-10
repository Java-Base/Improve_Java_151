package com.momai.chapter05.section62;

import java.util.Arrays;

/**
 * @author 	Lian
 * @date	2015年7月4日 下午3:29:31
 * @desc	警惕数组的浅拷贝
 */
public class Client {
	public static void main(String[] args) {
		// 气球数量
		int ballonNum = 7;
		// 第一个箱子
		Ballon[] box1 = new Ballon[ballonNum];
		// 初始化第一个箱子中的气球
		for(int i=0; i<ballonNum; i++) {
			box1[i] = new Ballon(Color.values()[i], i);
		}
		
		// 第二个箱子的气球是拷贝第一个箱子里的
		Ballon[] box2 = Arrays.copyOf(box1, box1.length);
		// 修改最后一个气球的颜色
		box2[6].setColor(Color.Blue);
		
		// 打印出第一个箱子中气球的颜色
		for(Ballon b : box1) {
			System.out.println(b);
		}
	}
}

// 气球颜色
enum Color {
	Red, Orange, Yellow, Green, Indigo, Blue, Violet;
}

// 气球
class Ballon {
	// 编号
	private int id;
	// 颜色
	private Color color;
	
	public Ballon(Color color, int id) {
		this.color = color;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("编号: " + id).append(", 颜色 :" + color).toString();
	}
	
}