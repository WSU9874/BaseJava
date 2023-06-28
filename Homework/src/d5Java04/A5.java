package d5Java04;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		confirmD();
		confirmD();
	}

	public static void confirmD() {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();

		for (int i = 0; i < n.length(); i++) {
			if (n.length() > 10 && n.contains("k")) {
				System.out.println("pass");
				break;
			} else {
				System.out.println("fail");
				break;
			}
		}
	}
}