package d6JAVA04;

import java.util.Scanner;

public class A11 {

	public static void main(String[] args) { // 1m/s = 3.6km/h
		Scanner scanner = new Scanner(System.in);
		double v1 = scanner.nextDouble();
		double v2 = scanner.nextDouble();
		double v3 = scanner.nextDouble();

		double km1 = v1 * 3.6;
		double km2 = v2;
		double km3 = v3 * 3.6 * 1000;

		if (km1 > km2) {
			if (km2 >= (km3)) {
				System.out.println(v1 + "m/s");
			} else if (km2 < km3) {
				if (km1 > km3) {
					System.out.println(v1 + "m/s");
				}
			}
		} else if (km2 > km1) {
			if (km1 >= km3) {
				System.out.println(v2 + "km/h");
			} else if (km1 < km3) {
				if (km2 > km3) {
					System.out.println(v2 + "km/h");
				}
			}
		} else if (km3 > km2) {
			if (km2 >= km1) {
				System.out.println(v3 + "m/ms");
			} else if (km2 < km1) {
				if (km3 > km1) {
					System.out.println(v3 + "m/ms");
				}
			}
		}
	}
}
