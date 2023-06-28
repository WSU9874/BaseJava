package JavaP1;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();

		double doubleA = Double.parseDouble(a);
		double doubleB = Double.parseDouble(b);

		if (doubleA > doubleB) {
			if (doubleA >= 10) {
				System.out.println(doubleA);
			}
		} else if (doubleA < doubleB) {
			if (doubleA >= 10) {
			}
			System.out.println(doubleB);
		} else {
			System.out.println("Same");
		}

	}

}
