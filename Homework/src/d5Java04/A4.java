package d5Java04;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		array();
		decry();
	}
	public static void array() {
		System.out.println("#Menu\n1. Encryption\n2. Decryption");
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();

		char[] c = n.toCharArray();

		for (int i = 0; i < n.length(); i++) {
			int cc = c[i] + 1;
			System.out.print((char) cc);
		}
		System.out.println();
	}
	public static void decry() {
		System.out.println("#Menu\n2. Encryption\n3. Decryption");
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();

		char[] c = n.toCharArray();

		for (int i = 0; i < n.length(); i++) {
			int cc = c[i] - 1;
			System.out.print((char) cc);
		}
		System.out.println();
	}
}
