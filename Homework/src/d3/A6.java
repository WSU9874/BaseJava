package d3;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for (int n = 1; n < a; n++) {
			if (a % n == 0) {
				System.out.println(n);
			}
		}
	}
}
