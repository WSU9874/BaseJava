package d3;
import java.util.Scanner;
public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n;
		n = scanner.nextInt();
		
		int sum = 0;
		int i;
		
		for (i = 1; i < 1 + n ; i++) {
			sum = i + sum;
		}
		System.out.println(sum);

	}

}
