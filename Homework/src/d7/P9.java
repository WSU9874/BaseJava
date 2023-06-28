package d7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		ArrayList<String> name = new ArrayList<String>();

		while (i < 5) {
			String n = scanner.next();
			name.add(n);
			i++;
		}
		Collections.sort(name);
		System.out.println(name);
		Collections.sort(name, Collections.reverseOrder());
		System.out.println(name);

		int j = 0;
		ArrayList<Integer> score = new ArrayList<Integer>();

		while (j < 5) {
			int n = scanner.nextInt();
			score.add(n);
			j++;
		}
		Collections.sort(score);
		System.out.println(score);
		Collections.sort(score, Collections.reverseOrder());
		System.out.println(score);
	}
}
