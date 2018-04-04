package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		int whole=0;
		double count = 0;
		
		for(int[] a : array) {
			int sum = 0;
			for(int b : a ) {
				sum+= b;
				count++;
			}
			whole+=sum;
		}
		
		System.out.println(whole/count);
	
	}
}
