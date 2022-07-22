package basis;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください");
		String input = scanner.nextLine();

		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
			return;
		}
		int num = Integer.parseInt(input);
		printCalculateDouble(num);
		printCalculateSquare(num);
	}

	public static void printCalculateDouble(int num) {
		int ansDou = num * 2;
		System.out.println("入力された" + num + "を2倍した値は" + ansDou + "です");
	}

	public static void printCalculateSquare(int num) {
		int ansSqu = num * num;
		System.out.println("入力された" + num + "を2乗した値は" + ansSqu + "です");
	}

}
