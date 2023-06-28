package d3;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out
				.println("#Menu\n1. Coke - 340\n2. Orange Juice - 500\n3. Milk - 650\n4. water - 290\n5. Coffe - 170");

		int price = 1000;
		int c = 0;

		switch (n) {
		case (1):
			c = 340;
			break;
		case (2):
			c = 500;
			break;
		case (3):
			c = 650;
			break;
		case (4):
			c = 290;
			break;
		case (5):
			c = 170;
			break;

		}
		System.out.println("-> " + n);

		int change = price - c;

		int money100 = change / 100;
		int money50 = (change % 100) / 50;
		int money10 = (change - 100 * money100 - 50 * money50) / 10;

		if (n == 1) {
			change = 1000 - 340;
			System.out.println("\"The change is " + change + "(100 X " + money100 + ", 50 X " + money50 + ", 10 X 1"
					+ money10 + ")\"");
		} else if (n == 2) {
			change = 1000 - 500;
			System.out.println("\"The change is " + change + "(100 X " + money100 + ", 50 X " + money50 + ", 10 X "
					+ money10 + ")\"");
		} else if (n == 3) {
			change = 1000 - 650;
			System.out.println("\"The change is " + change + "(100 X " + money100 + ", 50 X " + money50 + ", 10 X "
					+ money10 + ")\"");
		} else if (n == 4) {
			change = 1000 - 290;
			System.out.println("\"The change is " + change + "(100 X " + money100 + ", 50 X " + money50 + ", 10 X "
					+ money10 + ")\"");
		} else if (n == 5) {
			change = 1000 - 170;
			System.out.println("\"The change is " + change + "(100 X " + money100 + ", 50 X " + money50 + ", 10 X "
					+ money10 + ")\"");
		}

	}

}
