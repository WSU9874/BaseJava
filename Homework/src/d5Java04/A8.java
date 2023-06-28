package d5Java04;

import java.util.Scanner;

public class A8 {

	
	public static void main(String[] args) {
		System.out.println("#Menu\n1. Encoder\n2. Decoder\n3. Exit");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n == 1) {
			int En = scanner.nextInt();
			for (int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					if (j == (char)i) {
					
					
					}n = (char)i;
				}
			}System.out.print(n);
		}

	}

}
