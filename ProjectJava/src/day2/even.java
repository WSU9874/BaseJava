package day2;
import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("even!");
		} else {
			System.out.println("Not even!");
		}
	}
}
