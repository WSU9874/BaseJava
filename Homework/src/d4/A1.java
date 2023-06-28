package d4;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		calculate();
		calculate();
		calculate();
	}

	public static void calculate() {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int max = Math.max(5, n);
		int min = Math.min(5, n);
		int mean = (max + min) / 2;

		System.out.print("Result : 1 - Mean " + mean);
		System.out.print(", Max " + max);
		System.out.println(", Min " + min);

		n = scanner.nextInt();
		max = Math.max(5, n);
		min = Math.min(5, n);
		mean = (max + min) / 2;

		System.out.print("Result : 1 - Mean " + mean);
		System.out.print(", Max " + max);
		System.out.println(", Min " + min);

		n = scanner.nextInt();
		max = Math.max(5, n);
		min = Math.min(5, n);
		mean = (max + min) / 2;

		System.out.print("Result : 1 - Mean " + mean);
		System.out.print(", Max " + max);
		System.out.println(", Min " + min);
	}
}
