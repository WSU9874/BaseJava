package d4;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n1 = scanner.nextLine();
		String n2 = scanner.next();
		int cnt = 0;
		

		for (int i = 0; i < n1.length(); i++) {
			if (n1.charAt(i) == n2.charAt(0)) {
				cnt++;
				i++;
				int j = 1;
				while (j < n2.length()) {
					if (n1.charAt(i) == n2.charAt(j)) {
						cnt++;
						j++;
					}					
					if (cnt == n2.length()) {
						break;
					}
					i++;
				}
				

			}
		}
		System.out.println(cnt/4);

	}

}
