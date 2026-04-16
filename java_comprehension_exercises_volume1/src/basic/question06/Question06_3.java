package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装

		BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

		// ① 初期化
		int amount = 0;
		int price = 100;

		// ③ 初回表示
		System.out.print("鉛筆を購入しますか? はい：0、いいえ：1 > ");
		int buyFlag = Integer.parseInt(reader.readLine());

		// ⑤ while文
		while (buyFlag == 0) {

			// ① 本数を増やす
			amount++;

			// ② 再確認
			System.out.print("購入する鉛筆の本数を 1 つ増やしますか？ はい：0、いいえ：1 > ");
			buyFlag = Integer.parseInt(reader.readLine());
		}

		// ⑥ 本数表示
		System.out.println("購入した鉛筆の本数は" + amount + "本です。");

		// ⑦ 合計金額（println内で計算）
		System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");
	}
}
