package basis;


import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください");
		String val = scanner.nextLine();

		try {
			int num = Integer.parseInt(val);
			for (int i = 0; i <= num; i++) {
				for (int j = 0; j <= num; j++) {
					if (j == i) {
						System.out.print('*');
					} else {
						System.out.print('.');
					}
				}
				System.out.println("\n");
			}
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
		scanner.close();
	}
}
