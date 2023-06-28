package d8;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		findChar();
		findChar();

	}

	public static void findChar() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String c = scanner.next();

		System.out.println(s.indexOf(c) + 1);
	}
}
