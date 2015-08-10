package com.momai.chapter01.section11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 	Administrator
 * @date	2015年6月13日 下午12:55:30
 * @desc	工具类, 对一个类进行序列化和反序列化, 并存储到硬盘上(模拟网络传输)
 */
public class SerializableUtils {
	private static String FILE_NAME = "d:/obj.bin";
	
	// 序列化
	public static void writeObject(Serializable s) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			oos.writeObject(s);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 反序列化
	public static Object readObject() {
		Object obj = null;
		try {
			ObjectInput input = new ObjectInputStream(new FileInputStream(FILE_NAME));
			obj = input.readObject();
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}
