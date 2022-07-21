package basis;


import java.util.Scanner;

public class Question05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数100を入力された値で割り算します");
		System.out.println("割り算する整数を入力してください");
		String val = scanner.nextLine();

		try {
			int n1 = Integer.parseInt(val);
			int n2 = 100 / n1;
			System.out.println("割り算結果は " + n2 + " です");
		} catch (ArithmeticException e) {
			System.out.println("0では割り算できません");
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		} finally {
			System.out.println("終了");
			scanner.close();
		}
	}
}
