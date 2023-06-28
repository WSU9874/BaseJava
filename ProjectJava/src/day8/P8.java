package day8;

import java.util.Scanner;
import java.util.Arrays;

public class P8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		try {
			n = Integer.parseInt(scanner.next());
			System.out.println(n);
			scanner.nextLine(); // temporary

			String[] numbers = new String[n];
			String text = scanner.nextLine();
			numbers = text.split(" ");
			System.out.println(text.toCharArray());

			if (n < numbers.length) {
				System.out.println("error");
			} else {
				for (int i = 0; i < numbers.length; i++) {
					System.out.print(numbers[i] + " ");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error22");
		}
	}




}
