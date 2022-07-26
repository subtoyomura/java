package basis;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		// Scanner定義
		Scanner scanner = new Scanner(System.in);
		// メッセージ出力
		System.out.println("整数を入力してください");
		// キーボードから文字列読込
		String input = scanner.nextLine();

		try {
			// 入力文字列をint型へ変換
			int num = Integer.parseInt(input);
			// 入力値を2倍
			printCalculateDouble(num);
			// 入力値を2乗
			printCalculateSquare(num);
		} catch (NumberFormatException e) {// 整数以外の値が入力された場合
			// メッセージ出力
			System.out.println("整数以外の値が入力されました");

		}

	}

	public static void printCalculateDouble(int num) {
		// 引数を2倍
		int ansDouble = num * 2;
		// 引数を2倍した結果を出力
		System.out.println("入力された" + num + "を2倍した値は" + ansDouble + "です");
	}

	public static void printCalculateSquare(int num) {
		// 引数を2乗
		int ansSquare = num * num;
		// 引数を2乗した結果を出力する
		System.out.println("入力された" + num + "を2乗した値は" + ansSquare + "です");
	}

}
