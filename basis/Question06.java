package basis;


	import java.util.Scanner;

	public class Question06 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("本日の曜日番号を入力してください");
			String val = scanner.next();

			try {
				int num = Integer.parseInt(val);
				switch (num) {
				//0～6を入力した場合、曜日が出力
				case 0:
					System.out.println("本日は 日曜日 です");
					break;
				case 1:
					System.out.println("本日は 月曜日 です");
					break;
				case 2:
					System.out.println("本日は 火曜日 です");
					break;
				case 3:
					System.out.println("本日は 水曜日 です");
					break;
				case 4:
					System.out.println("本日は 木曜日 です");
					break;
				case 5:
					System.out.println("本日は 金曜日 です");
					break;
				case 6:
					System.out.println("本日は 土曜日 です");
					break;
				default:
					//0～6以外を入力した場合
					System.out.println("0～6の範囲で入力してください");
				}
			} catch (NumberFormatException e) {
				//整数以外の値が入力された場合

				System.out.println("整数以外の値が入力されました");

			} finally {
				scanner.close();
			}
		}
	}