package d4;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		counting();	
		counting();
		counting();
	}

	public static void counting() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int pp;
		int nn;
		int odd;
		int evn;
		if (Math.abs(n) > 0) {
			pp = 0;
			pp++;
			System.out.print("P - " + pp);
		} else {
			System.out.print("p - " + "0");

		}

		if (Math.abs(n) < 0) {
			nn = 0;
			nn++;
			System.out.print(",N - " + nn);
		} else {
			System.out.print(",N - " + "0");

		}
		if (Math.abs(n) % 2 == 1) {
			odd = 0;
			odd++;
			System.out.print(",O - " + odd);
		} else {
			System.out.print(",O - " + "0");
		}
		if (Math.abs(n) % 2 == 0) {
			evn = 0;
			evn++;
			System.out.println(",E - " + evn);
		} else {
			System.out.println(",E - " + "0");
		}
	}
}
