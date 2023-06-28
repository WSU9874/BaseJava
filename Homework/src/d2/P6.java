package d2;
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What operation do you want?");
		System.out.println("1. +\n\n2. -\n\n3. *\n\n4. /");
		System.out.println("\n--->");
		
		int want;
		int first;
		int second;
		
		want = scanner.nextInt();
		first = scanner.nextInt();
		second = scanner.nextInt();
		
		if (want == 1) {
			want = first + second;
		} else if (want == 2) {
			want = first - second;
		} else if (want == 3) {
			want = first * second;
		}else if (want == 4)
			want = first / second;
			
		
		
		System.out.println(want);

	}

}
