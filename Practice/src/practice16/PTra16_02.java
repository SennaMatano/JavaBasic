/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		
		java.lang.Boolean Boolean = new java.lang.Boolean(b);
		java.lang.Byte Byte = new java.lang.Byte(by);
		java.lang.Short Short = new java.lang.Short(s);
		java.lang.Character Character = new java.lang.Character(c);
		java.lang.Integer Integer = new java.lang.Integer(i);
		java.lang.Long Long = new java.lang.Long(l);
		java.lang.Float Float = new java.lang.Float(f);
		java.lang.Double Double = new java.lang.Double(d);




	}
}
