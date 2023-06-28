package d8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		ArrayList<String> name = new ArrayList<String>();

		while (i < 5) {
			String n;
			try {
				n = scanner.next();
				name.add(n);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("숫자만");
			}
			
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
