package basis;


import java.util.Scanner;

public class Question09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("5つの整数を入力してください");
		int[] array = new int[5]; //整数の各値（配列）
		String input_text;

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "個目:");
			input_text = scan.nextLine();
			try {
				int n1 = Integer.parseInt(input_text);

			} catch (NumberFormatException e) {
				//整数以外の場合
				System.out.println("整数以外の値が入力されました");
				return;
			}
			int n1 = Integer.parseInt(input_text);
			array[i] = n1;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] >= array[j + 1]) {

					int n2 = array[j];
					array[j] = array[j + 1];
					array[j + 1] = n2;
					//昇順ソート
				}
			}
		}
		System.out.print("昇順ソート結果は");
		for (int ord : array) {
			System.out.print(ord + " ");
		}
		System.out.println("です");

		int maxMax = array[4];
		//最大値
		System.out.println("最大値は " + maxMax + " です");

		int minMin = array[0];
		//最小値
		System.out.print("最小値は " + minMin + " です");
	}
}
