package d4;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("#Current Converter");
		System.out.println("1. South Korean won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korean won");
		System.out.println("3. Japan Yen -> South Korean won");

		float n = scanner.nextInt();
		float d;
		float y;

		if (n == 1) {
			int w = scanner.nextInt();
			System.out.println((float) w / 1321.86 + " dollar");

		} else if (n == 2) {
			d = scanner.nextInt();
			System.out.println((float) 1321.86 * d + " won");
		} else if (n == 3) {
			y = scanner.nextInt();
			System.out.println((float) 9.56 * y + " won");
		}

	}

}
