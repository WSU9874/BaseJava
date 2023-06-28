package d3;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i < n+1; i++) {
			for (int k = 0; k < i-1 ;k++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j < (n*2) -(2 * i-2); j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
