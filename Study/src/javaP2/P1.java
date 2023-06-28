package javaP2;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String text = scanner.nextLine();
		int cnt = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				cnt++;
			}
		}System.out.println(cnt);
		
		for (int i = (int)'a'; i < (int)'z' + 1; i++) {
			cnt = 0;
			for (int j = 1; j < text.length(); j++) {
				if (text.charAt(j) == (char)i) {
					cnt++;
					
				}
			}System.out.print((char)i + "-" + cnt);
			
		}
	}

}
