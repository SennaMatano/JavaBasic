/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] list = line.split(",", 0);
				Player player = new Player();

				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);

				array.add(player);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(array);
		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i).getPosition().equals("GK")) {
				System.out.println(array.get(i));
				break;
			}else {
				continue;
			}
		}

			int count = 0;
			for (int t = array.size() - 1; t >= 0; t--) {
				if (array.get(t).getPosition().equals("DF")) {
					System.out.println(array.get(t));
					count++;
					if (count > 3){
						break;
					}else {
						continue;
					}
				}
				
			}
			int number = 0;
			for (int s = array.size() - 1; s >= 0; s--) {
				if (array.get(s).getPosition().equals("MF")) {
					System.out.println(array.get(s));
					number++;
					if (number > 3) {
						break;
					}else {
						continue;
					}
				}
			}
				int sum = 0;
				for (int a = array.size() - 1; a >= 0; a--) {
					if (array.get(a).getPosition().equals("FW")) {
						System.out.println(array.get(a));
						sum++;
						if (sum > 1) {
							break;
						}else {
							continue;
						}
					}
					
				}
			}
		}
