package day4;
import java.util.Scanner;
public class Day4p4 {

	public static void main(String[] args) {
		multiplicationTable(3, 9);
		operationAdd(5, 9);
		operationSub(2, 5);
		
		while (true) {
			int num = showMenu();
			if (num == 1) {
				
			} else if (num ==3) {
				break;
			}
		}
		
		
	}

	public static void multiplicationTable(int n, int m) {
		for (int i = 2; i < 10; i++) {
			System.out.println("n" + "x" + i + " = " + (n * i));
		}
	}
	
	public static void operationAdd(int n, int m) {
		int result = n + m;
		System.out.println(result);
	}
	public static void operationSub(int n, int m) {
		int result = n - m;
		
	
	System.out.println(result);
	}	
		
		
		public static int showMenu() {
			System.out.println("menu");
			System.out.println("1. Coke");
			System.out.println("2. Juice");
			System.out.println("3. Exit");
			
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			return 0;
			
			
			
		
}	

}