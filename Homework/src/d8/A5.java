package d8;

import java.util.Arrays;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		match();
		match();
	}

	public static void match() {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		String nn = scanner.next();
		String m = Arrays.toString(numbers);
		String[] n = m.split(", ");

		for (int i = 0; i < n.length; i++) {
			if (n[i].contains(nn)) {
				System.out.print(n[i] + " ");
				
			}
		}System.out.println();
	}

}
