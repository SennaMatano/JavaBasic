/*
 * PTra13_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_01 extends practice13.common.Animal{

	/*
	 * ★ PTra13_01クラスはcommon.Animalクラスを継承してください
	 */

	public static void main(String[] args) {

		// ★ PTra13_01をインスタンス化をしてください
		PTra13_01 ptra13 = new PTra13_01();

		// ★ PTra13_01の持つsetterを実行してください（引数："人"）
		ptra13.setName("人");

		// ★ PTra13_01の持つインスタンスメソッドrunとbreathを実行してしてください
		
		String name = ptra13.getName();
		
		ptra13.run();
		ptra13.breath();
		
	}
}
