package basis.Question14;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		// メッセージ出力
		System.out.println("整数を入力してください：");
		System.out.print("1個目：");

		//try -with-resources文(Scanner定義)
		try (Scanner scanner = new Scanner(System.in)) {
			// キーボードから文字列読込(数字１個目）
			String inputNumber1 = scanner.nextLine();
			// 入力文字列をint型へ変換
			int num1 = Integer.parseInt(inputNumber1);
			// メッセージ出力
			System.out.print("2個目：");
			// キーボードから文字列読込(数字２個目）
			String inputNumber2 = scanner.nextLine();
			// 入力文字列をint型へ変換
			int num2 = Integer.parseInt(inputNumber2);

			// CalculateImpl定義
			CalculateImpl calculateImpl = new CalculateImpl();
			// メッセージ出力(引数num1と引数num2を掛けた結果を出力）
			System.out.println(num1 + "と" + num2 + "の掛け算結果の値は" + calculateImpl.multiplication(num1, num2) + "です");
			// メッセージ出力(引数num1と引数num2を割った結果を出力）
			System.out.println(num1 + "と" + num2 + "の掛け算結果を2で割った値は" + calculateImpl.division(num1, num2) + "です");
		} catch (NumberFormatException e) {//整数以外の値が入力された場合
			// メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}
	}
}
