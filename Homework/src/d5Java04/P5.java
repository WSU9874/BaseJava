package d5Java04;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		timeTable(n);

	}

	public static void timeTable(int n) {
		for (int j = 1; j < 10; j++) {
			System.out.println(n + " X " + j + " = " + (n * j));
		}
	}

}
