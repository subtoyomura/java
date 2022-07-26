package basis;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		// Scanner定義
		Scanner scanner = new Scanner(System.in);
		// メッセージ出力
		System.out.println("整数を入力してください");
		System.out.print("1回目:");
		// キーボードから文字列読込(1回目）
		String input1 = scanner.nextLine();

		try {
			// 入力文字列をint型へ変換（1回目）
			int num1 = Integer.parseInt(input1);
			// メッセージ出力
			System.out.print("2回目:");
			// キーボードから文字列読込（2回目）
			String input2 = scanner.nextLine();
			// 入力文字列をint型へ変換（2回目）
			int num2 = Integer.parseInt(input2);
			// メッセージ出力（引数num1と引数num2を掛けた結果を出力）
			System.out.println(num1 + "と" + num2 + "の掛け算結果の値は" + multiplication(num1, num2) + "です");
			// メッセージ出力（引数num1と引数num2を割った結果を出力）
			System.out.println(num1 + "と" + num2 + "の掛け算結果を2で割った値は" + division(num1, num2) + "です");
		} catch (NumberFormatException e) {// 整数以外の値が入力された場合
			// メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
	}

	public static int multiplication(int num1, int num2) {
		// 引数num1と引数num2を掛けた結果を戻す
		return num1 * num2;
	}

	public static int division(int num1, int num2) {
		// 引数num1と引数num2を割った結果を戻す
		return num1 * num2 / 2;
	}
}
