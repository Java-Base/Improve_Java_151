package com.momai.chapter03.section44;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午5:23:02
 * @desc	荐使用序列化实现对象的拷贝, 暂时没调
 */
public class CloneUtils {
	// 拷贝一个对象
	@SuppressWarnings("unchecked")
	public static <T extends Serializable> T clone(T obj) {
		// 拷贝产生的对象
		T clonedObj = null;
		try {
			// 读取对象字节数据
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			oos.close();
			// 分配内存空间, 写入原始对象, 生成新对象
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			// 返回新对象, 并做类型转换
			clonedObj = (T)ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clonedObj;
	}
}
