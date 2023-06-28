package d3;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n1;

		for (n1 = a; n1 > 0; n1--) {
			if (a % n1 == 0 && b % n1 == 0) {
				break;
			}
		}
		int c = a / n1;
		int d = b / n1;
		System.out.println(c * d * n1);
	}
}
