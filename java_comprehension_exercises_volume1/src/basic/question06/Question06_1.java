package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装

		// ① 配列の初期化
		String[] messages = { "こんにちは", "Java 学習中", "繰り返しの演習", "頑張ります" };

		// ② for文で繰り返し出力
		for (int i = 0; i < 4; i++) {
			System.out.println(messages[i]);
		}

		// ③ 繰り返し終了後
		System.out.println("繰り返し処理が終了しました。");
	}

}