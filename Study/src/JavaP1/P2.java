package JavaP1;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		try {
			double doubleA = Double.parseDouble(a);
			System.out.println(doubleA);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	
}
