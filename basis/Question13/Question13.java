package basis.Question13;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {

		// メッセージ出力
		System.out.println("1：足し算結果⇒引き算結果の順で出力する");
		System.out.println("2：引き算結果⇒足し算結果の順で出力する");
		System.out.print("番号を選択してください（1,2）：");

		//try -with-resources文(Scanner定義)
		try (Scanner scanner = new Scanner(System.in)) {
			// キーボードから文字列読込(選択）
			String inputText = scanner.nextLine();
			// 入力文字列をint型へ変換
			int number = Integer.parseInt(inputText);

			// メッセージ出力
			System.out.println("整数を入力してください");
			System.out.print("1個目：");
			// キーボードから文字列読込(数字１個目）
			String inputName1 = scanner.nextLine();
			// 入力文字列をint型へ変換
			int num1 = Integer.parseInt(inputName1);
			// メッセージ出力
			System.out.print("2個目：");
			// キーボードから文字列読込(数字２個目）
			String inputName2 = scanner.nextLine();
			// 入力文字列をint型へ変換
			int num2 = Integer.parseInt(inputName2);

			//1の場合（足し算結果⇒引き算結果）
			if (number == 1) {
				CalculateSuper CalculateSuper = new CalculateSuper(num1, num2);
				CalculateSuper.flow();
				//2の場合（引き算結果⇒足し算結果）
			} else if (number == 2) {
				CalculateChild CalculateChild = new CalculateChild(num1, num2);
				CalculateChild.flow();
				//1、2の以外の場合
			} else if (number < 1 || 2 < number) {
				// メッセージ出力
				System.out.println("1～2の範囲で入力してください");
				return;
			}
		} catch (NumberFormatException e) {//整数以外の値が入力された場合
			// メッセージ出力
			System.out.println("整数以外の値が入力されました");

		}
	}
}
