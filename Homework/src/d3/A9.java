package d3;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		for (int i = 2; i <= a; i++) {
			boolean A = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					A = false;
					break;
				}
			}
			if (A) {
				System.out.println(i);
			}
		}
	}
}