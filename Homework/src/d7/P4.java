package d7;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		// String words = "kim,lee,park";
		// String[] names = words.split(",");
		String[] names = words.split(" ");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
