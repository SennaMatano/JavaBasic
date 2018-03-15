package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car1 = new Car();
		car1.color = "Rouge";
		car1.gasoline = 10000;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline = 50000;

		Car car3 = new Car();
		car3.color = "Jeune";
		car3.gasoline = 3500;
		
		final int distance = 300;

		

		Car[] cars = new Car[3];

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		for (int i = 0; i < 3; i++) {
			
			int count = 0;
			int sum = 0;

			while (true) {
				cars[i].run();
				int run = cars[i].run();
				if (run==-1) {
					System.out.println("ガソリンが切れました。目的地までたどり着けません。");
					break;
				}
				sum+=run;
				count+=1;
				if(sum>300) {
					System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
					break;
				}
			}
			
		}
	}
}