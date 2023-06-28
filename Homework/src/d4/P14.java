package d4;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String st = scanner.nextLine();
		String res = "";

		String[] words = st.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.equals("a")) {
				if (i == 0 || "AEIOUaeiou".indexOf(words[i + 1].charAt(0)) != -1) {
					word = "an";
				}

			}
			res += word + " ";
		}
		System.out.println(res.trim());
	}

}
