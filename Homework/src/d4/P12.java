package d4;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("#Current Converter");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");

		float n = scanner.nextInt();
		float f;

		if (n == 1) {
			int c = scanner.nextInt();
			System.out.println((float) (1.8 * c) + 32 + " 'F");

		} else if (n == 2) {
			f = scanner.nextInt();
			System.out.println((float) (f - 32) * 5 / 9 + " 'C");

		}

	}
	
}