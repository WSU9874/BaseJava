package d8;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.println(i + "," + j);
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
