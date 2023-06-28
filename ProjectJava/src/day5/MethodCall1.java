package day5;

import java.util.Scanner;

public class MethodCall1 {

	public static void main(String[] args) {
		inputNumbers1();
		
		MethodCall1 nm = new MethodCall1();
		nm.inputNumbers2();
		nm.inputNumbers3();
		nm.inputNumbers4();
		nm.inputNumbers5();
	}
	
	
	public static int inputNumbers1() {
		
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

		public int inputNumbers2() {
			
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
			private static int inputNumbers3() {
				
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
				protected static int inputNumbers4() {
					
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
				int inputNumbers5() {
					
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
