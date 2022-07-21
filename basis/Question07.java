package basis;


import java.util.Scanner;

public class Question07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力してください");
		String input_text1 = scan.nextLine();

		try {
			//キーボードから入力された整数
			int n1 = Integer.parseInt(input_text1);
			if (n1 <= 0) {
				//整数の数が0以下の場合
				System.out.println("整数の数は0より大きい値を入力してください");
				return;
			}
		} catch (NumberFormatException e) {
			//整数以外の場合
			System.out.println("整数以外の値が入力されました");
			return;
		}

		int n1 = Integer.parseInt(input_text1);
		int[] array = new int[n1];
		System.out.println("整数の各値をを入力してください");

		for (int i = 0; i < array.length; i++) {
			//整数の各値（配列）
			System.out.print((i + 1) + "個目:");

			String input_text2 = scan.nextLine();
			try {
				Integer.parseInt(input_text2);
			} catch (NumberFormatException e) {
				//整数以外の場合
				System.out.println("整数以外の値が入力されました");
				return;
			}
			int n2 = Integer.parseInt(input_text2);

			array[i] = n2;
		}

		int sum = 0;
		System.out.print("入力された値は ");
		for (int j = 0; j < array.length; j++) {
			//入力された値の表示
			sum += array[j];
			System.out.print(array[j]);
			System.out.print(" ");
		}
		System.out.println("です。");
		int avg = sum / array.length;
		//平均
		System.out.println("入力された整数の平均は " + avg + "です");

	}

}