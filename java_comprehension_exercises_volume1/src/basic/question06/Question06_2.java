package basic.question06;

import java.io.IOException;

public class Question06_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装

		// ① 配列の初期化
		String[] studentName = { "かなこ", "ゆうた", "あい", "はるひ", "かずき" };

		// ② 拡張for文で出力
		for (String name : studentName) {
			System.out.println(name);
		}
	}

}
