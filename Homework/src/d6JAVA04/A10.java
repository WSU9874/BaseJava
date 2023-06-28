package d6JAVA04;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		compare();
		compare();
		compare();
	}
	public static void compare() {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		String n2 = scanner.next();
		int cnt = 0;
		for (int i = 0; i < n.length(); i++) {
			for (int j = 0; j < n2.length(); j++) {
				if (n.charAt(i) == n2.charAt(j)) {
					cnt++;
				}
			}
		}
		if (cnt == n.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
