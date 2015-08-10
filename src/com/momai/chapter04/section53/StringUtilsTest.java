package com.momai.chapter04.section53;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 	Lian
 * @date	2015年7月3日 下午10:19:32
 * @desc	
 */
public class StringUtilsTest {

	@Test
	public void testRemove() {
//		assertTrue(StringUtils.remove("好是好", "好").equals("是"));
		assertTrue(StringUtils.remove("$是$", "$").equals("是"));
	}

}
