/**
 * @(#)UtilTest.java  
 *       
 * 系统名称：eworks_bk
 * 版本号：1.0
 *  
 * Copyright (c)  CQRDTRAVELSKY.COM
 * All rights reserved.
 * 
 * 作者：zhoulong
 * 创建日期：2014-3-19
 * 功能描述：TODO
 * 
 * 修改人：
 * 修改日期：
 * 修改原因：
 *
 */

package com.tenman.eworks.admin;

/**
 * @ClassName: UtilTest
 * @author zhoulong
 * @date 2014-3-19 下午2:34:56
 */
public class UtilTest {

	public static void main(String[] args) {
		new UtilTest().stringTest();
	}

	public void stringTest() {
		String str = "12345678";
		System.out.println(str.substring(2, str.length()));

		String ss = "0.0045457478";
		System.out.println(String.format("%10.4f", Double.valueOf(ss) * 100));
	}
}
