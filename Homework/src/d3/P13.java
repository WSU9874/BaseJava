package d3;
import java.util.Scanner;
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n, m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		int i;
		int sum = 0;
		
		for (i = 1; i < n + 1; i += m) {
			sum = sum + i;
		}
		System.out.println(sum);
		

	}

}
