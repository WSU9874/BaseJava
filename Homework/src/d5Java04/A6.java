package d5Java04;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		confirmD();
		confirmD();
	}
	public static void confirmD() {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		char[] k = n.toCharArray();
		int cnt = 0;
		int cnt2 = 0;
		int p = 0;
		for (int i = 0; i < n.length(); i++) {
			if (k[i] == (char) 61 || k[i] == (char) 65 || k[i] == (char) 69 || k[i] == (char) 6F || k[i] == (char) 73
					|| k[i] == (char) 97 || k[i] == (char) 101 || k[i] == (char) 105 || k[i] == (char) 111
					|| k[i] == (char) 117) {
				cnt++;

			} else if (k[i] == (char) 32) {

			} else {
				cnt2++;
			}
		}
		System.out.println("Num. of Consonant : " + cnt2);
		System.out.println("Num. of Vowels : " + cnt);
	}
}
