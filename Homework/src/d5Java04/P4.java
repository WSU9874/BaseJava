package d5Java04;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		division(a, b);

	}

	public static void addition(double num1, double num2) {
		double add = num1 + num2;
		System.out.println(add);

	}

	public static void subtraction(double num1, double num2) {
		double sub = num1 - num2;

	}

	public static void multiplication(double num1, double num2) {
		double mul = num1 * num2;

	}

	public static void division(double num1, double num2) {
		double div = num1 / num2;

	}

}
