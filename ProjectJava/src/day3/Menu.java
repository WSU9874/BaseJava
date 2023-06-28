package day3;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Menu");
			System.out.println("1. Coke");
			System.out.println("2. exit");
			int n = scanner.nextInt();
			if (n == 2) {
				System.out.println("Bye bye");
				break;
			}
		}

	}

}
