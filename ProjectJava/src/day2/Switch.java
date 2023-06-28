package day2;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		switch (input) {
			case 1:
				System.out.println("correct");
				//break;
			case 2:
				System.out.println("incorrect");
				//break;
			default:
				System.out.println("error");
				break;
		}

	}

}
