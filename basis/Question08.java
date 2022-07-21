package basis;


import java.util.ArrayList;
import java.util.Scanner;

public class Question08 {
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
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("整数の各値をを入力してください");

		for (int i = 0; i < n1; i++) {
			//整数の各値（ArrayList）
			System.out.print((i + 1) + "個目:");

			String input_text2 = scan.nextLine();

			try {
				int n2 = Integer.parseInt(input_text2);
			} catch (NumberFormatException e) {
				//整数以外の場合
				System.out.println("整数以外の値が入力されました");
				return;
			}

			int n2 = Integer.parseInt(input_text2);

			list.add(n2);
		}
		int sum = 0;
		System.out.print("入力された値は ");
		for (int i = 0; i < list.size(); i++) {
			//入力された値の表示
			sum += list.get(i);
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		System.out.println("です。");
		int avg = sum / n1;
		//平均
		System.out.println("入力された整数の平均は " + avg + "です");

	}
}