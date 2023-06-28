package d5Java04;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int m;
		int c = 0;
		n = scanner.nextInt();
		m = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % m == 0) {
				c = i + c;
			}
		}
		System.out.print("SUM : " + c);
		System.out.print("(");
		for (int i = 1; i <= n; i++) {
			if (i % m == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.print(")");
	}
}
