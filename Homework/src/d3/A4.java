package d3;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i < n+1; i++) {
			for (int k = n-i; k > 0;k--) {
				System.out.print(" ");
			}
			for (int j = 1; j < (2 * i); j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

