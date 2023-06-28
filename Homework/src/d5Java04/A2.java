package d5Java04;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		int m;
		int c = 0;
		System.out.println("#Menu\n1. Deposit\n2. Withdrawal\nBalance : " + c);
		while (true) {
			n = scanner.nextInt();
			m = scanner.nextInt();

			if (n == 1) {
				c = c + m;
				System.out.println("#Menu\n1. Deposit\n2. Withdrawal\nBalance : " + c);

			} else if (n == 2) {
				c = c - m;
				System.out.println("#Menu\n1. Deposit\n2. Withdrawal\nBalance : " + c);

			} else {
				System.out.println("종료");
				break;
			}
		}
	}
}