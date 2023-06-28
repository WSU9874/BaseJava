package d4;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String eq = scanner.next();
		
		String a = eq.substring(0,1);
		String b = eq.substring(2,5);
		int n = Integer.valueOf(a);
		float nn = Integer.valueOf(b);
		
		System.out.println(eq.contains("*"));
		System.out.println(eq.substring(0,1));
		System.out.println(eq.substring(2,5));
		
		//System.out.println(a+b);


	}

}
