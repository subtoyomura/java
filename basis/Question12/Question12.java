package basis.Question12;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {

		//Person型の変数personをnullで初期化
		Person person = new Person();

		// メッセージ出力
		System.out.println("1：氏名を入力する");
		System.out.println("2：氏名を入力しない");
		System.out.print("番号を選択してください（1,2）：");

		//try -with-resources文(Scanner定義)
		try (Scanner scanner = new Scanner(System.in)) {
			//String型の変数inputNumberを""で初期化
			String inputNumber = "";
			// キーボードから文字列読込(選択）
			inputNumber = scanner.nextLine();
			// 入力文字列をint型へ変換
			int num = Integer.parseInt(inputNumber);
			//1の場合（名前出力）
			if (num == 1) {
				// メッセージ出力
				System.out.println("氏名を入力してください");
				System.out.print("氏名：");
				//String型の変数inputNameを""で初期化
				String inputName = "";
				// キーボードから文字列読込(名前）
				inputName = scanner.nextLine();
				// 変数personにセッターでinputNameを渡す
				person.setName(inputName);
				//2の場合（何もしない）
			} else if (num == 2) {
				;
				//1か2以外を選択した場合
			} else if (num < 1 || 2 < num) {
				// メッセージ出力
				System.out.println("1～2の範囲で入力してください");
				return;
			}
			// メッセージ出力（1の場合（名前）、2の場合（ダミー））
			System.out.println("私の名前は" + person.getName() + "です");
		} catch (NumberFormatException e) {// 整数以外の値が入力された場合
			// メッセージ出力
			System.out.println("整数以外の値が入力されました");

		}
	}
}