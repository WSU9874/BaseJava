package day5;

import java.util.Scanner;

public class Method11 {

	public static void main(String[] args) {
		int n1 = inputNumbers();
		int n2 = inputNumbers();
		int n3 = inputNumbers();

	}
	
	
	public static int inputNumbers() {
		
		int num1;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			num1 = scanner.nextInt();
			
			if (num1 % 2 == 1) {
				if (num1 > 0 && num1 < 1000) {
					System.out.println("OK");
					break;
				}
				
			}
			System.out.println("N");
		}
		return num1;
		
	}

}
