package day2;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		
		if (input == 1) {
			System.out.println("One!");
		}else if (input == -1) {
			System.out.println("minus one!");
		} else {
			System.out.println("Not one!");
		}

	}

}
