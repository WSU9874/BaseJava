package JavaP1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();

		int i;
		double d;
		
		if (n.contains(".")) {
			d = Double.valueOf(n);
			System.out.println(d);
			
		} else {
			i = Integer.valueOf(n);
			System.out.println(i);
			double k = (double)i;
			
		}
		
			if (k == 0) {
				System.out.println("zero");
			}else if (i > 3.14) {
				System.out.println();
			}
		
		

	}

}
