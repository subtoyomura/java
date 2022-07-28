package basis;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		// Scanner定義
		Scanner scanner = new Scanner(System.in);
		// メッセージ出力
		System.out.println("1：氏名を入力する");
		System.out.println("2：氏名を入力しない");
		System.out.print("番号を選択してください（1,2）：");
		// キーボードから文字列読込(選択）
		String inputNumber = scanner.nextLine();

		try {
			// 入力文字列をint型へ変換
			int num = Integer.parseInt(inputNumber);
			switch (num) {
			//1の場合（名前出力）
			case 1:
				// メッセージ出力
				System.out.println("氏名を入力してください");
				System.out.print("氏名：");
				// キーボードから文字列読込(名前）
				String inputName = scanner.nextLine();
				// インスタンスの生成
				Person myName = new Person(inputName);
				// メッセージ出力
				System.out.println("私の名前は" + myName.getName() + "です");
				break;
			//2の場合（ダミー出力）
			case 2:
				// インスタンスの生成
				Person dummyName = new Person();
				// メッセージ出力
				System.out.println("私の名前は" + dummyName.getName() + "です");
				break;
			//その他の数字の場合
			default:
				// メッセージ出力
				System.out.println("1～2の範囲で入力してください");
			}
		} catch (NumberFormatException e) {// 整数以外の値が入力された場合
			// メッセージ出力
			System.out.println("整数以外の値が入力されました");
		}

	}
}
