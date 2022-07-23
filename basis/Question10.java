package basis;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください");
		String input = scanner.nextLine();

		try {
			int num = Integer.parseInt(input);
			//入力された値が整数
			printCalculateDouble(num);
			printCalculateSquare(num);

		} catch (NumberFormatException e) {
			//入力された値が整数以外
			System.out.println("整数以外の値が入力されました");
			return;
		}

	}

	public static void printCalculateDouble(int num) {
		int ansDouble = num * 2;
		//引数を2倍した結果を出力する
		System.out.println("入力された" + num + "を2倍した値は" + ansDouble + "です");
	}

	public static void printCalculateSquare(int num) {
		int ansSquare = num * num;
		//引数を2乗した結果を出力する
		System.out.println("入力された" + num + "を2乗した値は" + ansSquare + "です");
	}

}
