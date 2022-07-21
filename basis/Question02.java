package basis;


import java.util.Scanner;

public class Question02 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください");
		String val= scanner.nextLine();

		try {
			int num = Integer.parseInt(val);
			if(num % 2 == 0) {
				System.out.println("入力された" + num + "は偶数です");
			}else{
				System.out.println("入力された" + num + "は奇数です");
			}
		} catch (NumberFormatException e) {
			System.out.println("整数以外の値が入力されました");
		}
		scanner.close();
	}
}

