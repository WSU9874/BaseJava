package JavaP1;

import java.util.Scanner;

public class P11113333333 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t1 = scanner.nextLine();
		String t2 = scanner.next();
		int result = 0;
		int cntC = 0;
		// char [] c = t1.toCharArray();
		// c[0] ~ c[length -1]
		for (int i = 0; i < t1.length(); i++) {
			// i t1 index
			if (t1.charAt(i) == t2.charAt(0)) {
				cntC++;
				// j t2 index
				i++;
				int j = 1;

				while (j < t2.length()) {
					if (t1.charAt(i) == t2.charAt(j)) {
						cntC++;
						j++;

					}
					if (cntC == t2.length()) {
						break;

					}
					i++;
				}		
			}

		} 
		result = cntC / t2.length();
		System.out.println(result);
	}
}

/*
char a = t2.charAt(0); // g
char b = t2.charAt(1); // o
int cntA = 0;
int cntB = 0;

for (int i = 0; i < t1.length(); i++) {
	if (t1.charAt(1) == a) {
		cntA++;
	}
}
for (int i = 0; i < t1.length(); i++) {
	if (t1.charAt(1) == b) {
		cntB++;

	}
	System.out.println(cntA);
	System.out.println(cntB);
*/