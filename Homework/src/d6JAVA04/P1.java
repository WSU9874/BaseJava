package d6JAVA04;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

	}

	public int showMenu() {
		System.out.println("Price\n1. Apple\n22. Strawberry\n3. Grape\n4. Watermelon");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
		
	}
	
	
}
