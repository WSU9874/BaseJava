package d3;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n1;

		for (n1 = a; n1 > 0; n1--) {
			if (a % n1 == 0 && b % n1 == 0) {
				System.out.println(n1);
				break;				
			}
		}
	}
}
