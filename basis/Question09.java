package basis;

import java.util.Scanner;

public class Question09 {
	public static final int ARRAY_COUNT = 5;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("5つの整数を入力してください");
		int[] array = new int[ARRAY_COUNT]; //整数の各値（配列）
		String input;

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "個目:");
			input = scan.nextLine();
			try {
				int num1 = Integer.parseInt(input);

			} catch (NumberFormatException e) {
				//整数以外の場合
				System.out.println("整数以外の値が入力されました");
				return;
			}
			int num1 = Integer.parseInt(input);
			array[i] = num1;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] >= array[j + 1]) {

					int num2 = array[j];
					array[j] = array[j + 1];
					array[j + 1] = num2;
					//昇順ソート
				}
			}
		}
		System.out.print("昇順ソート結果は");
		for (int ord : array) {
			System.out.print(ord + " ");
		}
		System.out.println("です");

		int maxMax = array[ARRAY_COUNT - 1];
		//最大値
		System.out.println("最大値は " + maxMax + " です");

		int minMin = array[0];
		//最小値
		System.out.print("最小値は " + minMin + " です");
	}
}
