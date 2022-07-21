package basis;


import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2つの同じ文字列を入力してください");

		while (true) {
			System.out.print("1週目：");
			String n1 = scanner.nextLine();
			System.out.print("2週目：");
			String n2 = scanner.nextLine();

			if (n1.isEmpty() || n2.isEmpty()) {
				System.out.println("空白が入力されています");

			} else if (!(n1.equals(n2))) {
				System.out.println("違う文字列です");

			} else {
				System.out.println("同じ文字列です");
				break;
			}
		}scanner.close();
	}
}