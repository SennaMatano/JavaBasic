/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		practice13.common.Hero hero = new practice13.common.Hero();
		Smile smile = new Smile();
		
		hero.setName("勇者");
		smile.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		while(true) {
			int Hattack = hero.attack();
			
			boolean A = smile.damage(Hattack);
			if(A==true) {
				System.out.println(hero.getName()+"は"+smile.getName()+"との戦闘に勝利した");
				break;
			}
			
			int Sattack = smile.attack();
			boolean B = hero.damage(Sattack);
			if(B==true) {
				System.out.println(smile.getName()+"は"+hero.getName()+"との戦闘に勝利した");
				break;
			}
		}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
